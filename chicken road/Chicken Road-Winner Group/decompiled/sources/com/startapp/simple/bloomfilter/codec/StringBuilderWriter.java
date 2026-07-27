package com.startapp.simple.bloomfilter.codec;

import java.io.Serializable;
import java.io.Writer;

/* loaded from: classes.dex */
public class StringBuilderWriter extends Writer implements Serializable {
    private static final long serialVersionUID = -8956169446715407818L;
    private final StringBuilder builder;

    public StringBuilderWriter() {
        this.builder = new StringBuilder();
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public StringBuilder getBuilder() {
        return this.builder;
    }

    public String toString() {
        return this.builder.toString();
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str != null) {
            this.builder.append(str);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i3, int i4) {
        if (cArr != null) {
            this.builder.append(cArr, i3, i4);
        }
    }

    public StringBuilderWriter(int i3) {
        this.builder = new StringBuilder(i3);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c3) {
        this.builder.append(c3);
        return this;
    }

    public StringBuilderWriter(StringBuilder sb) {
        this.builder = sb == null ? new StringBuilder() : sb;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        this.builder.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i3, int i4) {
        this.builder.append(charSequence, i3, i4);
        return this;
    }
}
