package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.8o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05398o {
    public final android.os.Handler A00;
    public final com.facebook.ads.redexgen.core.InterfaceC05408p A01;

    public C05398o(android.os.Handler handler, com.facebook.ads.redexgen.core.InterfaceC05408p interfaceC05408p) {
        this.A00 = interfaceC05408p != null ? (android.os.Handler) com.facebook.ads.redexgen.core.AbstractC04203y.A01(handler) : null;
        this.A01 = interfaceC05408p;
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "New API")
    public final void A00(final int i) {
        if (this.A00 != null) {
            this.A00.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.8a
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A01(final int i, final long j, final long j2) {
        if (this.A00 != null) {
            this.A00.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.8e
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.ads.redexgen.core.C05398o.this.A02(i, j, j2);
                }
            });
        }
    }

    public final /* synthetic */ void A02(int i, long j, long j2) {
        ((com.facebook.ads.redexgen.core.InterfaceC05408p) com.facebook.ads.redexgen.core.C5C.A0f(this.A01)).AD9(i, j, j2);
    }

    public final void A03(final long j) {
        if (this.A00 != null) {
            this.A00.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.8f
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.ads.redexgen.core.C05398o.this.A04(j);
                }
            });
        }
    }

    public final /* synthetic */ void A04(long j) {
        ((com.facebook.ads.redexgen.core.InterfaceC05408p) com.facebook.ads.redexgen.core.C5C.A0f(this.A01)).AD5(j);
    }

    public final void A05(final com.facebook.ads.redexgen.core.C2196qI c2196qI, final com.facebook.ads.redexgen.core.C6L c6l) {
        if (this.A00 != null) {
            this.A00.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.8j
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.ads.redexgen.core.C05398o.this.A06(c2196qI, c6l);
                }
            });
        }
    }

    public final /* synthetic */ void A06(com.facebook.ads.redexgen.core.C2196qI c2196qI, com.facebook.ads.redexgen.core.C6L c6l) {
        ((com.facebook.ads.redexgen.core.InterfaceC05408p) com.facebook.ads.redexgen.core.C5C.A0f(this.A01)).AD3(c2196qI);
        ((com.facebook.ads.redexgen.core.InterfaceC05408p) com.facebook.ads.redexgen.core.C5C.A0f(this.A01)).AD4(c2196qI, c6l);
    }

    public final void A07(final com.facebook.ads.redexgen.core.C6I c6i) {
        c6i.A02();
        if (this.A00 != null) {
            this.A00.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.8h
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.ads.redexgen.core.C05398o.this.A09(c6i);
                }
            });
        }
    }

    public final void A08(final com.facebook.ads.redexgen.core.C6I c6i) {
        if (this.A00 != null) {
            this.A00.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.8n
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.ads.redexgen.core.C05398o.this.A0A(c6i);
                }
            });
        }
    }

    public final /* synthetic */ void A09(com.facebook.ads.redexgen.core.C6I c6i) {
        c6i.A02();
        ((com.facebook.ads.redexgen.core.InterfaceC05408p) com.facebook.ads.redexgen.core.C5C.A0f(this.A01)).AD1(c6i);
    }

    public final /* synthetic */ void A0A(com.facebook.ads.redexgen.core.C6I c6i) {
        ((com.facebook.ads.redexgen.core.InterfaceC05408p) com.facebook.ads.redexgen.core.C5C.A0f(this.A01)).AD2(c6i);
    }

    public final void A0B(final com.facebook.ads.redexgen.core.C05418r c05418r) {
        if (this.A00 != null) {
            this.A00.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.8d
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0C(final com.facebook.ads.redexgen.core.C05418r c05418r) {
        if (this.A00 != null) {
            this.A00.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.8Z
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0D(final java.lang.Exception exc) {
        if (this.A00 != null) {
            this.A00.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.8g
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.ads.redexgen.core.C05398o.this.A0E(exc);
                }
            });
        }
    }

    public final /* synthetic */ void A0E(java.lang.Exception exc) {
        ((com.facebook.ads.redexgen.core.InterfaceC05408p) com.facebook.ads.redexgen.core.C5C.A0f(this.A01)).AD6(exc);
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "New API")
    public final void A0F(final java.lang.String str) {
        if (this.A00 != null) {
            this.A00.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.8k
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0G(final java.lang.String str, final long j, final long j2) {
        if (this.A00 != null) {
            this.A00.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.8Y
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.ads.redexgen.core.C05398o.this.A0H(str, j, j2);
                }
            });
        }
    }

    public final /* synthetic */ void A0H(java.lang.String str, long j, long j2) {
        ((com.facebook.ads.redexgen.core.InterfaceC05408p) com.facebook.ads.redexgen.core.C5C.A0f(this.A01)).AD0(str, j, j2);
    }

    public final void A0I(final boolean z) {
        if (this.A00 != null) {
            this.A00.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.8c
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.ads.redexgen.core.C05398o.this.A0J(z);
                }
            });
        }
    }

    public final /* synthetic */ void A0J(boolean z) {
        ((com.facebook.ads.redexgen.core.InterfaceC05408p) com.facebook.ads.redexgen.core.C5C.A0f(this.A01)).AFy(z);
    }

    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "New API")
    public final void A0K(final byte[] bArr, final long j) {
        if (this.A00 != null) {
            this.A00.post(new java.lang.Runnable() { // from class: com.facebook.ads.redexgen.X.8l
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }
}
