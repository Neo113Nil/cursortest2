package com.startapp.sdk.internal;

import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public final class a7 extends ByteArrayOutputStream {
    public a7(int i3) {
        super(i3);
    }

    public final byte[] a() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public final int b() {
        return ((ByteArrayOutputStream) this).count;
    }
}
