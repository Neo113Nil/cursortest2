package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.om, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class SurfaceHolderCallbackC2103om implements com.facebook.ads.redexgen.core.GQ, com.facebook.ads.redexgen.core.InterfaceC05408p, com.facebook.ads.redexgen.core.ES, com.facebook.ads.redexgen.core.InterfaceC0593Bf, android.view.SurfaceHolder.Callback, android.view.TextureView.SurfaceTextureListener {
    public static java.lang.String[] A01 = {"mdkndyL3N", "34XFwDl9WvKoMHQUixXhMeiNQCyC6vNP", "5uafIaN5", "lxzaK8fg5Pf0nzPouXyzPKk1aT8cB3T1", "DTIJ", "0UAV", "B5vkeIjqEzHsmqRbylQSobdgrKqNmXUo", "pkzfV8UoB1KOSL3E8gfET47OMeTC19My"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.AA A00;

    @Override // com.facebook.ads.redexgen.core.InterfaceC05408p
    public final /* synthetic */ void AD4(com.facebook.ads.redexgen.core.C2196qI c2196qI, com.facebook.ads.redexgen.core.C6L c6l) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05408p
    public final /* synthetic */ void AD5(long j) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05408p
    public final /* synthetic */ void AD6(java.lang.Exception exc) {
    }

    @Override // com.facebook.ads.redexgen.core.GQ
    public final /* synthetic */ void ADU(int i, long j) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05408p
    public final /* synthetic */ void AFy(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.GQ
    public final /* synthetic */ void AGV(com.facebook.ads.redexgen.core.C2196qI c2196qI, com.facebook.ads.redexgen.core.C6L c6l) {
    }

    public SurfaceHolderCallbackC2103om(com.facebook.ads.redexgen.core.AA aa) {
        this.A00 = aa;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05408p
    public final void AD0(java.lang.String str, long j, long j2) {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0H;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A01[1].charAt(3) != 'F') {
                throw new java.lang.RuntimeException();
            }
            A01[3] = "1hpUDXdDopjYnxDN8fIPsNGSxN8OzRvU";
            if (hasNext) {
                ((com.facebook.ads.redexgen.core.InterfaceC05408p) it.next()).AD0(str, j, j2);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05408p
    public final void AD1(com.facebook.ads.redexgen.core.C6I c6i) {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0H;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((com.facebook.ads.redexgen.core.InterfaceC05408p) it.next()).AD1(c6i);
        }
        this.A00.A07 = null;
        this.A00.A09 = null;
        this.A00.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05408p
    public final void AD2(com.facebook.ads.redexgen.core.C6I c6i) {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet;
        this.A00.A09 = c6i;
        copyOnWriteArraySet = this.A00.A0H;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((com.facebook.ads.redexgen.core.InterfaceC05408p) it.next()).AD2(c6i);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05408p
    public final void AD3(com.facebook.ads.redexgen.core.C2196qI c2196qI) {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet;
        this.A00.A07 = c2196qI;
        copyOnWriteArraySet = this.A00.A0H;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((com.facebook.ads.redexgen.core.InterfaceC05408p) it.next()).AD3(c2196qI);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC05408p
    public final void AD9(int i, long j, long j2) {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0H;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((com.facebook.ads.redexgen.core.InterfaceC05408p) it.next()).AD9(i, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.ES
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Required until we deprecate and move ComponentListener to ExoPlayerImpl.")
    public final void ADZ(com.facebook.ads.redexgen.core.C2144pR c2144pR) {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0I;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((com.facebook.ads.redexgen.core.C3U) it.next()).ADZ(c2144pR);
        }
    }

    @Override // com.facebook.ads.redexgen.core.ES
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Required until we deprecate and move ComponentListener to ExoPlayerImpl.")
    public final void ADa(java.util.List<com.facebook.ads.redexgen.core.C2146pT> list) {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0I;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((com.facebook.ads.redexgen.core.C3U) it.next()).ADa(list);
        }
    }

    @Override // com.facebook.ads.redexgen.core.GQ
    public final void ADl(int i, long j) {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0K;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((com.facebook.ads.redexgen.core.GQ) it.next()).ADl(i, j);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0593Bf
    public final void AEt(com.facebook.ads.androidx.media3.common.Metadata metadata, long j) {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0J;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((com.facebook.ads.redexgen.core.InterfaceC0593Bf) it.next()).AEt(metadata, j);
        }
    }

    @Override // com.facebook.ads.redexgen.core.GQ
    public final void AFf(java.lang.Object obj, long j) {
        android.view.Surface surface;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet2;
        surface = this.A00.A03;
        if (surface == obj) {
            copyOnWriteArraySet2 = this.A00.A0L;
            java.util.Iterator it = copyOnWriteArraySet2.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        copyOnWriteArraySet = this.A00.A0K;
        java.util.Iterator it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            ((com.facebook.ads.redexgen.core.GQ) it2.next()).AFf(obj, j);
        }
    }

    @Override // com.facebook.ads.redexgen.core.GQ
    public final void AGN(java.lang.String str, long j, long j2) {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0K;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((com.facebook.ads.redexgen.core.GQ) it.next()).AGN(str, j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.GQ
    public final void AGO(com.facebook.ads.redexgen.core.C6I c6i) {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.A00.A0K;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((com.facebook.ads.redexgen.core.GQ) it.next()).AGO(c6i);
        }
        this.A00.A08 = null;
        this.A00.A0A = null;
    }

    @Override // com.facebook.ads.redexgen.core.GQ
    public final void AGP(com.facebook.ads.redexgen.core.C6I c6i) {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet;
        this.A00.A0A = c6i;
        copyOnWriteArraySet = this.A00.A0K;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A01[0].length() != 9) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A01;
            strArr[7] = "MKCckBbCZrSSu6G06Z7NkbaNocq2WvpN";
            strArr[6] = "V8qjKHPFdvtphjyj0wrcUTYdTARdRgua";
            if (hasNext) {
                ((com.facebook.ads.redexgen.core.GQ) it.next()).AGP(c6i);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.GQ
    public final void AGU(com.facebook.ads.redexgen.core.C2196qI c2196qI) {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet;
        this.A00.A08 = c2196qI;
        copyOnWriteArraySet = this.A00.A0K;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A01[1].charAt(3) != 'F') {
                throw new java.lang.RuntimeException();
            }
            A01[3] = "2z1T7IcDfmpzuxqypnwVKmOXmU8bKGPo";
            if (hasNext) {
                ((com.facebook.ads.redexgen.core.GQ) it.next()).AGU(c2196qI);
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.GQ
    public final void AGb(com.facebook.ads.redexgen.core.C2149pW c2149pW) {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet2;
        copyOnWriteArraySet = this.A00.A0L;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((com.facebook.ads.redexgen.core.C5L) it.next()).AGa(c2149pW.A03, c2149pW.A01, c2149pW.A02, c2149pW.A00);
        }
        copyOnWriteArraySet2 = this.A00.A0K;
        java.util.Iterator it2 = copyOnWriteArraySet2.iterator();
        while (it2.hasNext()) {
            com.facebook.ads.redexgen.core.GQ gq = (com.facebook.ads.redexgen.core.GQ) it2.next();
            java.lang.String[] strArr = A01;
            if (strArr[4].length() != strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            A01[1] = "q7eFcMKXm9CoB0iVpo1HKrbod3G9GfaY";
            gq.AGb(c2149pW);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        this.A00.A0F(new android.view.Surface(surfaceTexture), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        this.A00.A0F(null, true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        this.A00.A0F(surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        this.A00.A0F(null, false);
    }
}
