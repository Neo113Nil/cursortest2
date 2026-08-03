package com.facebook.ads.redexgen.core;

@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Exo does not declare this as public but we need to as Hero's CacheDataSink refers to this")
/* renamed from: com.facebook.ads.redexgen.X.Mo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0883Mo extends java.io.BufferedOutputStream {
    public boolean A00;

    public C0883Mo(java.io.OutputStream outputStream) {
        super(outputStream);
    }

    public C0883Mo(java.io.OutputStream outputStream, int i) {
        super(outputStream, i);
    }

    public final void A00(java.io.OutputStream outputStream) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(this.A00);
        this.out = outputStream;
        this.count = 0;
        this.A00 = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.A00 = true;
        java.lang.Throwable e = null;
        try {
            flush();
        } catch (java.lang.Throwable th) {
            e = th;
        }
        try {
            this.out.close();
        } catch (java.lang.Throwable thrown) {
            if (e == null) {
                e = thrown;
            }
        }
        if (e != null) {
            com.facebook.ads.redexgen.core.C5C.A11(e);
            throw null;
        }
    }
}
