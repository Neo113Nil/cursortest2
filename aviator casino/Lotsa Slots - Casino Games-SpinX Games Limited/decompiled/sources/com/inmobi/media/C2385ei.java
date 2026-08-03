package com.inmobi.media;

/* renamed from: com.inmobi.media.ei, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2385ei implements com.inmobi.media.Ta {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.GestureDetectorOnGestureListenerC2675pi f5182a;
    public final /* synthetic */ android.content.Context b;

    public C2385ei(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi, android.content.Context context) {
        this.f5182a = gestureDetectorOnGestureListenerC2675pi;
        this.b = context;
    }

    @Override // com.inmobi.media.Ta
    public final void a() {
        this.f5182a.getListener().a();
    }

    @Override // com.inmobi.media.Ta
    public final void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f5182a.b(str, str2, str3);
    }

    @Override // com.inmobi.media.Ta
    public final void a(java.lang.String str, java.lang.String message, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        this.f5182a.a(str, message, str2);
    }

    @Override // com.inmobi.media.Ta
    public final void a(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        intent.putExtra("creativeId", this.f5182a.getCreativeId());
        intent.putExtra("impressionId", this.f5182a.getImpressionId());
        intent.putExtra("placementId", this.f5182a.getPlacementId());
        intent.putExtra("isImmersive", this.f5182a.X0);
        android.util.SparseArray sparseArray = com.inmobi.ads.rendering.InMobiAdActivity.t;
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f5182a;
        com.inmobi.ads.rendering.InMobiAdActivity.u = gestureDetectorOnGestureListenerC2675pi;
        if (gestureDetectorOnGestureListenerC2675pi.getPlacementType() == 0) {
            android.content.Context context = com.inmobi.media.Xi.f5051a;
            android.app.Activity context2 = this.f5182a.getBannerHolderActivity().get();
            if (context2 == null) {
                context2 = this.b;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context2, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
            if (!(context2 instanceof android.app.Activity)) {
                intent.setFlags(268435456);
            }
            context2.startActivity(intent);
            return;
        }
        intent.putExtra("supportBrowserLoader", true);
        android.content.Context context3 = com.inmobi.media.Xi.f5051a;
        android.content.Context context4 = this.f5182a.getContainerContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context4, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        if (!(context4 instanceof android.app.Activity)) {
            intent.setFlags(268435456);
        }
        context4.startActivity(intent);
    }

    @Override // com.inmobi.media.Ta
    public final void a(java.lang.String trackerName, java.util.Map macros) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(macros, "macros");
        com.inmobi.media.GestureDetectorOnGestureListenerC2675pi gestureDetectorOnGestureListenerC2675pi = this.f5182a;
        if (gestureDetectorOnGestureListenerC2675pi.e) {
            return;
        }
        gestureDetectorOnGestureListenerC2675pi.b(trackerName, macros);
    }
}
