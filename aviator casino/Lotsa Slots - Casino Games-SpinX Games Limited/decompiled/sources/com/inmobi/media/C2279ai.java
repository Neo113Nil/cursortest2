package com.inmobi.media;

/* renamed from: com.inmobi.media.ai, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2279ai {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.GestureDetectorOnGestureListenerC2675pi f5106a;

    public C2279ai(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi) {
        this.f5106a = gestureDetectorOnGestureListenerC2675pi;
    }

    public final void a(org.json.JSONObject jsonObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.f5106a.i;
        if (interfaceC2772t9 != null) {
            java.lang.String str = com.inmobi.media.GestureDetectorOnGestureListenerC2675pi.i1;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(str, "onCCTLifeCycleEvent");
        }
        this.f5106a.c(jsonObject);
    }
}
