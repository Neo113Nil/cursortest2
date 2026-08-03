package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Yh implements com.inmobi.media.InterfaceC2496j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.GestureDetectorOnGestureListenerC2675pi f5068a;

    public Yh(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi) {
        this.f5068a = gestureDetectorOnGestureListenerC2675pi;
    }

    public final void a(java.lang.Float f) {
        this.f5068a.h("window.mraidview.broadcastEvent('audioVolumeChange', " + f + ");");
    }
}
