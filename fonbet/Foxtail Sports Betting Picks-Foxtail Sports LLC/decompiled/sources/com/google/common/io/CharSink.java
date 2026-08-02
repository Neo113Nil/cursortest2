package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.base.StandardSystemProperty;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.stream.Stream;

/* loaded from: classes2.dex */
public abstract class CharSink {
    public abstract Writer openStream() throws IOException;

    protected CharSink() {
    }

    public Writer openBufferedStream() throws IOException {
        Writer openStream = openStream();
        if (openStream instanceof BufferedWriter) {
            return (BufferedWriter) openStream;
        }
        return new BufferedWriter(openStream);
    }

    public void write(CharSequence charSequence) throws IOException {
        Preconditions.checkNotNull(charSequence);
        Writer openStream = openStream();
        try {
            openStream.append(charSequence);
            if (openStream != null) {
                openStream.close();
            }
        } catch (Throwable th) {
            if (openStream != null) {
                try {
                    openStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void writeLines(Iterable<? extends CharSequence> lines) throws IOException {
        writeLines(lines, System.getProperty("line.separator"));
    }

    public void writeLines(Iterable<? extends CharSequence> lines, String lineSeparator) throws IOException {
        writeLines(lines.iterator(), lineSeparator);
    }

    public void writeLines(Stream<? extends CharSequence> lines) throws IOException {
        writeLines(lines, StandardSystemProperty.LINE_SEPARATOR.value());
    }

    public void writeLines(Stream<? extends CharSequence> lines, String lineSeparator) throws IOException {
        writeLines(lines.iterator(), lineSeparator);
    }

    private void writeLines(Iterator<? extends CharSequence> lines, String lineSeparator) throws IOException {
        Preconditions.checkNotNull(lineSeparator);
        Writer openBufferedStream = openBufferedStream();
        while (lines.hasNext()) {
            try {
                openBufferedStream.append(lines.next()).append((CharSequence) lineSeparator);
            } catch (Throwable th) {
                if (openBufferedStream != null) {
                    try {
                        openBufferedStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (openBufferedStream != null) {
            openBufferedStream.close();
        }
    }

    public long writeFrom(Readable readable) throws IOException {
        Preconditions.checkNotNull(readable);
        Writer openStream = openStream();
        try {
            long copy = CharStreams.copy(readable, openStream);
            if (openStream != null) {
                openStream.close();
            }
            return copy;
        } catch (Throwable th) {
            if (openStream != null) {
                try {
                    openStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
