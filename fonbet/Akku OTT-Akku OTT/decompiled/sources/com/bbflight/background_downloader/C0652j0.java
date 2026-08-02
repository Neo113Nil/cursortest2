package com.bbflight.background_downloader;

import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.bbflight.background_downloader.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0652j0 extends InputStream {
    public final InputStream a;
    public final long b;
    public long c;

    public C0652j0(InputStream inputStream, long j) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        this.a = inputStream;
        this.b = j;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.c >= this.b) {
            return -1;
        }
        int read = this.a.read();
        if (read != -1) {
            this.c++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] b, int i, int i2) {
        Intrinsics.checkNotNullParameter(b, "b");
        long j = this.c;
        long j2 = this.b;
        if (j >= j2) {
            return -1;
        }
        int read = this.a.read(b, i, (int) Math.min(i2, j2 - j));
        if (read != -1) {
            this.c += read;
        }
        return read;
    }
}
