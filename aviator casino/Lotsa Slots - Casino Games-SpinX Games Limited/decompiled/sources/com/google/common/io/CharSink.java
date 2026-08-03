package com.google.common.io;

@com.google.common.io.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
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
        try {
            java.io.Writer writer = (java.io.Writer) com.google.common.io.Closer.create().register(openStream());
            writer.append(charSequence);
            writer.flush();
        } finally {
        }
    }

    public void writeLines(java.lang.Iterable<? extends java.lang.CharSequence> lines) throws java.io.IOException {
        writeLines(lines, java.lang.System.getProperty("line.separator"));
    }

    public void writeLines(java.lang.Iterable<? extends java.lang.CharSequence> lines, java.lang.String lineSeparator) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(lines);
        com.google.common.base.Preconditions.checkNotNull(lineSeparator);
        try {
            java.io.Writer writer = (java.io.Writer) com.google.common.io.Closer.create().register(openBufferedStream());
            java.util.Iterator<? extends java.lang.CharSequence> it = lines.iterator();
            while (it.hasNext()) {
                writer.append(it.next()).append((java.lang.CharSequence) lineSeparator);
            }
            writer.flush();
        } finally {
        }
    }

    public long writeFrom(java.lang.Readable readable) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(readable);
        try {
            java.io.Writer writer = (java.io.Writer) com.google.common.io.Closer.create().register(openStream());
            long copy = com.google.common.io.CharStreams.copy(readable, writer);
            writer.flush();
            return copy;
        } finally {
        }
    }
}
