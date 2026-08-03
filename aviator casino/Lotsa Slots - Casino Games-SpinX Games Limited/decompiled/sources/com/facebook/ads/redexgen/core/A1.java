package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class A1 {
    public final int A00;
    public final com.facebook.ads.redexgen.core.C2044no A01;
    public final java.util.concurrent.CopyOnWriteArrayList<com.facebook.ads.androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler> A02;

    public A1() {
        this(new java.util.concurrent.CopyOnWriteArrayList(), 0, null);
    }

    public A1(java.util.concurrent.CopyOnWriteArrayList<com.facebook.ads.androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher.ListenerAndHandler> listenerAndHandlers, int i, com.facebook.ads.redexgen.core.C2044no c2044no) {
        this.A02 = listenerAndHandlers;
        this.A00 = i;
        this.A01 = c2044no;
    }

    public final com.facebook.ads.redexgen.core.A1 A00(int i, com.facebook.ads.redexgen.core.C2044no c2044no) {
        return new com.facebook.ads.redexgen.core.A1(this.A02, i, c2044no);
    }
}
