package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Ze {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (r5 < (r9 != null ? r9.getRefreshDebounceTime() : 1000)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b8, code lost:
    
        if (r5 > r3) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.inmobi.media.EnumC2372e6 a(android.net.ConnectivityManager connectivityManager) {
        long nonValidatedExpiry;
        android.net.Network network = connectivityManager.getActiveNetwork();
        if (network == null) {
            return com.inmobi.media.EnumC2372e6.j;
        }
        android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
        if (networkCapabilities == null) {
            return com.inmobi.media.EnumC2372e6.j;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Ze", "TAG");
        java.util.Objects.toString(networkCapabilities);
        if (!networkCapabilities.hasCapability(12)) {
            return com.inmobi.media.EnumC2372e6.j;
        }
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
        if (((com.inmobi.media.core.config.models.AdConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.AdConfig.class)).getSkipNetworkValidationFeatureEnabled() || networkCapabilities.hasCapability(16)) {
            return null;
        }
        android.net.Network network2 = com.inmobi.media.C2371e5.f5170a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "network");
        com.inmobi.media.core.config.models.AdConfig.CustomNetworkValidation a2 = com.inmobi.media.C2371e5.a();
        if (a2 == null || !a2.getEnabled()) {
            return com.inmobi.media.EnumC2372e6.j;
        }
        long j = com.inmobi.media.C2371e5.d;
        if (j != 0) {
            kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2939zl.f5596a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j;
            com.inmobi.media.core.config.models.AdConfig.CustomNetworkValidation a3 = com.inmobi.media.C2371e5.a();
        }
        com.inmobi.media.C2371e5.d = android.os.SystemClock.elapsedRealtime();
        if (kotlin.jvm.internal.Intrinsics.areEqual(com.inmobi.media.C2371e5.f5170a, network)) {
            long j2 = com.inmobi.media.C2371e5.c;
            kotlinx.coroutines.CoroutineScope coroutineScope2 = com.inmobi.media.AbstractC2939zl.f5596a;
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - j2;
            if (com.inmobi.media.C2371e5.b) {
                com.inmobi.media.core.config.models.AdConfig.CustomNetworkValidation a4 = com.inmobi.media.C2371e5.a();
                nonValidatedExpiry = a4 != null ? a4.getValidatedExpiry() : com.unity3d.services.UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
            } else {
                com.inmobi.media.core.config.models.AdConfig.CustomNetworkValidation a5 = com.inmobi.media.C2371e5.a();
                nonValidatedExpiry = a5 != null ? a5.getNonValidatedExpiry() : 30000L;
            }
        }
        if (com.inmobi.media.C2371e5.e.compareAndSet(false, true)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.d, null, null, new com.inmobi.media.C2346d5(network, null), 3, null);
        }
        if (com.inmobi.media.C2371e5.b) {
            return null;
        }
        return com.inmobi.media.EnumC2372e6.o;
    }

    public static boolean b() {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context == null) {
            return false;
        }
        try {
            java.lang.Object systemService = context.getSystemService("power");
            android.os.PowerManager powerManager = systemService instanceof android.os.PowerManager ? (android.os.PowerManager) systemService : null;
            if (android.os.Build.VERSION.SDK_INT > 22 && powerManager != null) {
                return powerManager.isDeviceIdleMode();
            }
        } catch (java.lang.Exception e) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Ze", "TAG");
            e.getMessage();
        }
        return false;
    }

    public static com.inmobi.media.EnumC2372e6 a() {
        com.inmobi.media.EnumC2372e6 enumC2372e6;
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context != null) {
            try {
                java.lang.Object systemService = context.getSystemService("connectivity");
                kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) systemService;
                if (android.os.Build.VERSION.SDK_INT >= 23) {
                    enumC2372e6 = a(connectivityManager);
                } else {
                    android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null && !activeNetworkInfo.isConnected()) {
                        enumC2372e6 = com.inmobi.media.EnumC2372e6.k;
                    }
                    enumC2372e6 = null;
                }
            } catch (java.lang.Exception e) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Ze", "TAG");
                e.getMessage();
                enumC2372e6 = com.inmobi.media.EnumC2372e6.l;
            }
            if (enumC2372e6 != null) {
                return enumC2372e6;
            }
            if (b()) {
                return com.inmobi.media.EnumC2372e6.i;
            }
            return null;
        }
        return com.inmobi.media.EnumC2372e6.h;
    }
}
