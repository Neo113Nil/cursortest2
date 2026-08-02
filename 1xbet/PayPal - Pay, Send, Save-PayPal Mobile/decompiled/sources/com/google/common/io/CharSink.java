package com.google.common.io;

/* loaded from: classes9.dex */
public abstract class CharSink {
    public abstract java.io.Writer openStream() throws java.io.IOException;

    protected CharSink() {
    }

    public java.io.Writer openBufferedStream() throws java.io.IOException {
        java.io.Writer openStream = openStream();
        if (openStream instanceof java.io.BufferedWriter) {
            return (java.io.BufferedWriter) openStream;
        }
        return new java.io.BufferedWriter(openStream);
    }

    public void write(java.lang.CharSequence charSequence) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(charSequence);
        java.io.Writer openStream = openStream();
        try {
            openStream.append(charSequence);
            if (openStream != null) {
                openStream.close();
            }
        } catch (java.lang.Throwable th) {
            if (openStream != null) {
                try {
                    openStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void writeLines(java.lang.Iterable<? extends java.lang.CharSequence> iterable) throws java.io.IOException {
        writeLines(iterable, java.lang.System.getProperty("line.separator"));
    }

    public void writeLines(java.lang.Iterable<? extends java.lang.CharSequence> iterable, java.lang.String str) throws java.io.IOException {
        writeLines(iterable.iterator(), str);
    }

    public void writeLines(java.util.stream.Stream<? extends java.lang.CharSequence> stream) throws java.io.IOException {
        writeLines(stream, com.google.common.base.StandardSystemProperty.LINE_SEPARATOR.value());
    }

    public void writeLines(java.util.stream.Stream<? extends java.lang.CharSequence> stream, java.lang.String str) throws java.io.IOException {
        writeLines(stream.iterator(), str);
    }

    private void writeLines(java.util.Iterator<? extends java.lang.CharSequence> it, java.lang.String str) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(str);
        java.io.Writer openBufferedStream = openBufferedStream();
        while (it.hasNext()) {
            try {
                openBufferedStream.append(it.next()).append((java.lang.CharSequence) str);
            } catch (java.lang.Throwable th) {
                if (openBufferedStream != null) {
                    try {
                        openBufferedStream.close();
                    } catch (java.lang.Throwable th2) {
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

    public long writeFrom(java.lang.Readable readable) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(readable);
        java.io.Writer openStream = openStream();
        try {
            long copy = com.google.common.io.CharStreams.copy(readable, openStream);
            if (openStream != null) {
                openStream.close();
            }
            return copy;
        } catch (java.lang.Throwable th) {
            if (openStream != null) {
                try {
                    openStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
