package com.inmobi.media;

/* loaded from: classes5.dex */
public final class I5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4757a;
    public final long[] b;
    public boolean c;
    public com.inmobi.media.H5 d;
    public final /* synthetic */ com.inmobi.media.L5 e;

    public I5(com.inmobi.media.L5 l5, java.lang.String str) {
        this.e = l5;
        this.f4757a = str;
        this.b = new long[l5.h];
    }

    public final java.io.File a(int i) {
        return new java.io.File(this.e.b, this.f4757a + "." + i);
    }

    public final java.io.File b(int i) {
        return new java.io.File(this.e.b, this.f4757a + "." + i + ".tmp");
    }
}
