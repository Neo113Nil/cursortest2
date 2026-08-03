package com.moloco.sdk.internal.services;

/* loaded from: classes5.dex */
public final class C implements com.moloco.sdk.internal.services.B {
    public static final int c = 8;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7193a;
    public final com.moloco.sdk.internal.services.y b;

    public C(android.content.Context context, com.moloco.sdk.internal.services.y deviceInfoService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoService, "deviceInfoService");
        this.f7193a = context;
        this.b = deviceInfoService;
    }

    @Override // com.moloco.sdk.internal.services.B
    public boolean a() {
        java.lang.Object systemService = this.f7193a.getSystemService("connectivity");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) systemService;
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            return a(connectivityManager);
        }
        return false;
    }

    @Override // com.moloco.sdk.internal.services.B
    public java.lang.Integer b() {
        java.lang.Object systemService = this.f7193a.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        java.lang.String networkOperator = ((android.telephony.TelephonyManager) systemService).getNetworkOperator();
        if (networkOperator == null || networkOperator.length() == 0) {
            return null;
        }
        java.lang.String substring = networkOperator.substring(3);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return java.lang.Integer.valueOf(java.lang.Integer.parseInt(substring));
    }

    @Override // com.moloco.sdk.internal.services.B
    public com.moloco.sdk.internal.services.A c() {
        android.net.NetworkCapabilities networkCapabilities;
        java.lang.Object systemService = this.f7193a.getSystemService("connectivity");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) systemService;
        if (connectivityManager.getActiveNetwork() != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null) {
            return networkCapabilities.hasTransport(1) ? com.moloco.sdk.internal.services.A.c.b : networkCapabilities.hasTransport(0) ? new com.moloco.sdk.internal.services.A.a(this.b.invoke().u()) : com.moloco.sdk.internal.services.A.b.b;
        }
        return com.moloco.sdk.internal.services.A.b.b;
    }

    @Override // com.moloco.sdk.internal.services.B
    public java.lang.Integer d() {
        java.lang.Object systemService = this.f7193a.getSystemService(androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE);
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        java.lang.String networkOperator = ((android.telephony.TelephonyManager) systemService).getNetworkOperator();
        if (networkOperator == null || networkOperator.length() == 0) {
            return null;
        }
        java.lang.String substring = networkOperator.substring(0, 3);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return java.lang.Integer.valueOf(java.lang.Integer.parseInt(substring));
    }

    @Override // com.moloco.sdk.internal.services.B
    @kotlin.Deprecated(message = "Use networkInfo()", replaceWith = @kotlin.ReplaceWith(expression = "networkInfo()", imports = {}))
    public com.moloco.sdk.internal.services.A invoke() {
        return c();
    }

    public final boolean a(android.net.ConnectivityManager connectivityManager) {
        return connectivityManager.getRestrictBackgroundStatus() == 3;
    }
}
