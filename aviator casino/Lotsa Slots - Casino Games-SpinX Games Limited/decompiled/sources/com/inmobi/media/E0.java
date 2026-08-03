package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class E0 {
    public static com.inmobi.media.A0 b;
    public static kotlinx.coroutines.CoroutineScope e;
    public static kotlinx.coroutines.CoroutineScope f;

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.Lazy f4672a = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.E0$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.inmobi.media.E0.a();
        }
    });
    public static final kotlin.Lazy c = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.E0$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.inmobi.media.E0.b();
        }
    });
    public static final com.inmobi.media.B0 d = new com.inmobi.media.B0();

    public static final com.inmobi.media.H0 a() {
        return new com.inmobi.media.H0(com.inmobi.media.AbstractC2639o9.b());
    }

    public static final java.util.concurrent.CopyOnWriteArrayList b() {
        return new java.util.concurrent.CopyOnWriteArrayList();
    }

    public static void a(android.app.Activity activity, com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView, java.lang.String beaconUrl, boolean z, org.json.JSONObject extras, com.inmobi.media.Zh listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(beaconUrl, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        renderView.getAdQualityManager().a(activity, beaconUrl, z, extras, listener);
        com.inmobi.media.A0 a0 = b;
        if (a0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("executor");
            a0 = null;
        }
        a0.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(beaconUrl, "beaconUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        a0.c.put(beaconUrl, new java.lang.ref.WeakReference(listener));
        java.lang.String creativeID = renderView.getCreativeID();
        if (creativeID.length() > 0) {
            com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
            com.inmobi.media.core.config.models.AdConfig adConfig = (com.inmobi.media.core.config.models.AdConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.AdConfig.class);
            kotlin.Lazy lazy = c;
            if (((java.util.concurrent.CopyOnWriteArrayList) lazy.getValue()).size() < adConfig.getAdReport().getCridls()) {
                ((java.util.concurrent.CopyOnWriteArrayList) lazy.getValue()).add(creativeID);
            }
        }
    }

    public static void a(com.inmobi.media.GestureDetectorOnGestureListenerC2675pi adView, com.inmobi.media.GestureDetectorOnGestureListenerC2675pi renderView, java.lang.String beaconUrl, boolean z, org.json.JSONObject extras, com.inmobi.media.Zh listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adView, "adView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderView, "renderView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(beaconUrl, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        renderView.getAdQualityManager().a(adView, beaconUrl, z, extras, listener);
        com.inmobi.media.A0 a0 = b;
        if (a0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("executor");
            a0 = null;
        }
        a0.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(beaconUrl, "beaconUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        a0.c.put(beaconUrl, new java.lang.ref.WeakReference(listener));
        java.lang.String creativeID = renderView.getCreativeID();
        if (creativeID.length() > 0) {
            com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
            com.inmobi.media.core.config.models.AdConfig adConfig = (com.inmobi.media.core.config.models.AdConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.AdConfig.class);
            kotlin.Lazy lazy = c;
            if (((java.util.concurrent.CopyOnWriteArrayList) lazy.getValue()).size() < adConfig.getAdReport().getCridls()) {
                ((java.util.concurrent.CopyOnWriteArrayList) lazy.getValue()).add(creativeID);
            }
        }
    }
}
