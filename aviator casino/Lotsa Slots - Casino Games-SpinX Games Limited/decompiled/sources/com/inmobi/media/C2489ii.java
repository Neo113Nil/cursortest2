package com.inmobi.media;

/* renamed from: com.inmobi.media.ii, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2489ii implements com.inmobi.media.B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.GestureDetectorOnGestureListenerC2675pi f5262a;

    public C2489ii(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi) {
        this.f5262a = gestureDetectorOnGestureListenerC2675pi;
    }

    public final void a() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5262a.i;
        if (interfaceC2772t9 != null) {
            java.lang.String str = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str, "onAdScreenDisplayFailed");
        }
        this.f5262a.getListener().c();
    }

    public final void b() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5262a.i;
        if (interfaceC2772t9 != null) {
            java.lang.String str = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str, "onAdScreenDisplayed");
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f5262a;
        if (gestureDetectorOnGestureListenerC2675pi.b == 0) {
            gestureDetectorOnGestureListenerC2675pi.Q = false;
        }
        gestureDetectorOnGestureListenerC2675pi.getListener().f(this.f5262a);
    }
}
