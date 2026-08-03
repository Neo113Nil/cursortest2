package com.ironsource;

/* renamed from: com.ironsource.l0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3140l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.C3140l0 f6352a = new com.ironsource.C3140l0();

    private C3140l0() {
    }

    public static final int a() {
        if (android.os.Build.VERSION.SDK_INT < 30) {
            return 0;
        }
        try {
            return android.os.ext.SdkExtensions.getExtensionVersion(1000000);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            return 0;
        }
    }

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void b() {
    }

    @kotlin.jvm.JvmStatic
    public static final android.adservices.measurement.MeasurementManager a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (android.os.Build.VERSION.SDK_INT < 30 || a() < 4) {
            return null;
        }
        try {
            return (android.adservices.measurement.MeasurementManager) context.getSystemService(android.adservices.measurement.MeasurementManager.class);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
