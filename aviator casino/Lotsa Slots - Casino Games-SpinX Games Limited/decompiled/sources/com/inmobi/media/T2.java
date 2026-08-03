package com.inmobi.media;

/* loaded from: classes5.dex */
public final class T2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.U2 f4968a;

    public T2(com.inmobi.media.U2 u2) {
        this.f4968a = u2;
    }

    public final void a(boolean z) {
        com.inmobi.media.C2279ai c2279ai;
        if (z && (c2279ai = (com.inmobi.media.C2279ai) this.f4968a.i.get()) != null) {
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.g1.getClass();
            c2279ai.a(com.inmobi.media.Vh.a("IN_NATIVE_BROWSER", "onInteraction"));
        }
        com.inmobi.media.C2279ai c2279ai2 = (com.inmobi.media.C2279ai) this.f4968a.i.get();
        if (c2279ai2 != null) {
            com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.g1.getClass();
            c2279ai2.a(com.inmobi.media.Vh.a("IN_NATIVE_BROWSER", "onClose"));
        }
    }
}
