package com.inmobi.media;

/* renamed from: com.inmobi.media.hi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2464hi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.GestureDetectorOnGestureListenerC2675pi f5244a;

    public C2464hi(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi) {
        this.f5244a = gestureDetectorOnGestureListenerC2675pi;
    }

    public final void a(com.inmobi.media.C2401f8 obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "error");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5244a.i;
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b("HtmlVideoPlayer", "onVideoLoadFailed " + ((int) obj.b));
        }
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f5244a;
        com.inmobi.media.EnumC2771t8 enumC2771t8 = com.inmobi.media.EnumC2771t8.d;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "obj");
        gestureDetectorOnGestureListenerC2675pi.a(enumC2771t8, com.inmobi.media.AbstractC2773ta.a(obj, obj.getClass()));
    }
}
