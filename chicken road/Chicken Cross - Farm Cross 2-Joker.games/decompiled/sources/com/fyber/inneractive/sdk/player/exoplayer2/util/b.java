package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class b extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final FileOutputStream f5756a;
    public boolean b = false;

    public b(File file) {
        this.f5756a = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.f5756a.flush();
        try {
            this.f5756a.getFD().sync();
        } catch (IOException e) {
            Log.w("AtomicFile", "Failed to sync file descriptor:", e);
        }
        this.f5756a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f5756a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f5756a.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f5756a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.f5756a.write(bArr, i, i2);
    }
}
