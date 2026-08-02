package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class Rv extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i5) {
        bArr.getClass();
        AbstractC1400ot.g0(i, i5 + i, bArr.length);
    }
}
