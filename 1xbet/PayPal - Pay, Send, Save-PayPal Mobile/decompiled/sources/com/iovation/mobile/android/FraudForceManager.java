package com.iovation.mobile.android;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\tJ\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/iovation/mobile/android/FraudForceManager;", "", "Landroid/content/Context;", "context", "", "initialize", "(Landroid/content/Context;)V", "Lcom/iovation/mobile/android/FraudForceConfiguration;", "config", "(Lcom/iovation/mobile/android/FraudForceConfiguration;Landroid/content/Context;)V", com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH, "", "getBlackbox", "(Landroid/content/Context;)Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FraudForceManager {
    private static com.iovation.mobile.android.FraudForceConfiguration Camera2StreamConfigurationMap;
    public static final com.iovation.mobile.android.FraudForceManager INSTANCE = new com.iovation.mobile.android.FraudForceManager();
    private static final com.iovation.mobile.android.b.k getHighResolutionOutputSizeshNQ4ISI;
    private static /* synthetic */ com.iovation.mobile.android.a.f getHighSpeedVideoFpsRanges;

    static {
        java.util.concurrent.ExecutorService newFixedThreadPool = java.util.concurrent.Executors.newFixedThreadPool(3);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newFixedThreadPool, "");
        getHighResolutionOutputSizeshNQ4ISI = new com.iovation.mobile.android.b.k(newFixedThreadPool);
    }

    private FraudForceManager() {
    }

    public static /* synthetic */ com.iovation.mobile.android.FraudForceConfiguration a() {
        com.iovation.mobile.android.FraudForceConfiguration fraudForceConfiguration = Camera2StreamConfigurationMap;
        if (fraudForceConfiguration != null) {
            return fraudForceConfiguration;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final java.lang.String getBlackbox(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.iovation.mobile.android.a.f fVar = getHighSpeedVideoFpsRanges;
        if (fVar == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            fVar = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String a2 = fVar.a(context, fVar.b);
        java.lang.String a3 = fVar.a(context, fVar.c);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(a3);
        sb.append(a2);
        java.lang.String obj = sb.toString();
        if (!kotlin.text.StringsKt.isBlank(obj)) {
            com.iovation.mobile.android.a.j jVar = fVar.f3923a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("EXCPT", "");
            if (obj != null && !kotlin.text.StringsKt.isBlank(obj)) {
                jVar.f3924a.put("EXCPT", obj);
            }
        }
        com.iovation.mobile.android.a.j jVar2 = fVar.f3923a;
        java.lang.String valueOf = java.lang.String.valueOf((java.lang.System.currentTimeMillis() - currentTimeMillis) / 1000.0d);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("BBRT", "");
        if (valueOf != null && !kotlin.text.StringsKt.isBlank(valueOf)) {
            jVar2.f3924a.put("BBRT", valueOf);
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = fVar.f3923a.f3924a;
        byte[] bArr = com.iovation.mobile.android.d.b.f3941a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(concurrentHashMap, "");
        if (concurrentHashMap.isEmpty()) {
            return "";
        }
        try {
            return com.iovation.mobile.android.d.b.a(com.iovation.mobile.android.d.b.a(concurrentHashMap));
        } catch (java.io.IOException unused) {
            return "";
        }
    }

    @kotlin.Deprecated(message = "A FraudForceConfiguration is required to initialize FraudForceManager", replaceWith = @kotlin.ReplaceWith(expression = "initialize(configuration, context)", imports = {}))
    public final void initialize(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        initialize(new com.iovation.mobile.android.FraudForceConfiguration.Builder().build(), context);
    }

    public final void refresh(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.iovation.mobile.android.a.f fVar = getHighSpeedVideoFpsRanges;
        if (fVar == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            fVar = null;
        }
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "");
        java.util.Iterator it = fVar.c.iterator();
        while (it.hasNext()) {
            ((com.iovation.mobile.android.a.g) it.next()).c(applicationContext);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "");
        fVar.f3923a.f3924a.clear();
        java.util.Iterator it2 = fVar.c.iterator();
        while (it2.hasNext()) {
            ((com.iovation.mobile.android.a.g) it2.next()).b(applicationContext);
        }
    }

    public final void initialize(com.iovation.mobile.android.FraudForceConfiguration config, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        Camera2StreamConfigurationMap = config;
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        com.iovation.mobile.android.a.f fVar = new com.iovation.mobile.android.a.f(applicationContext, new android.os.Handler(android.os.Looper.getMainLooper()), getHighResolutionOutputSizeshNQ4ISI);
        getHighSpeedVideoFpsRanges = fVar;
        android.content.Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext2, "");
        fVar.f3923a.f3924a.clear();
        java.util.Iterator it = fVar.c.iterator();
        while (it.hasNext()) {
            ((com.iovation.mobile.android.a.g) it.next()).b(applicationContext2);
        }
    }
}
