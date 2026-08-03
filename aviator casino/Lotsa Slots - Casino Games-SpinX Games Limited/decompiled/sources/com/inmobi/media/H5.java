package com.inmobi.media;

/* loaded from: classes5.dex */
public final class H5 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.I5 f4739a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ com.inmobi.media.L5 d;

    public H5(com.inmobi.media.L5 l5, com.inmobi.media.I5 i5) {
        this.d = l5;
        this.f4739a = i5;
        this.b = i5.c ? null : new boolean[l5.h];
    }

    public final java.io.OutputStream a(int i) {
        java.io.FileOutputStream fileOutputStream;
        com.inmobi.media.G5 g5;
        synchronized (this.d) {
            com.inmobi.media.I5 i5 = this.f4739a;
            if (i5.d != this) {
                throw new java.lang.IllegalStateException();
            }
            if (!i5.c) {
                this.b[i] = true;
            }
            java.io.File b = i5.b(i);
            try {
                fileOutputStream = new java.io.FileOutputStream(b);
            } catch (java.io.FileNotFoundException unused) {
                this.d.b.mkdirs();
                try {
                    fileOutputStream = new java.io.FileOutputStream(b);
                } catch (java.io.FileNotFoundException unused2) {
                    return com.inmobi.media.L5.q;
                }
            }
            g5 = new com.inmobi.media.G5(this, fileOutputStream);
        }
        return g5;
    }
}
