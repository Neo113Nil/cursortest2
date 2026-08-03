package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class S3 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.internal.IdentifiersResult f4934a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.internal.IdentifiersResult f4935b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.internal.IdentifiersResult f4936c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.internal.IdentifiersResult f4937d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.internal.IdentifiersResult f4938e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.internal.IdentifiersResult f4939f;

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.internal.IdentifiersResult f4940g;

    /* renamed from: h, reason: collision with root package name */
    public final io.appmetrica.analytics.internal.IdentifiersResult f4941h;

    /* renamed from: i, reason: collision with root package name */
    public final io.appmetrica.analytics.internal.IdentifiersResult f4942i;

    /* renamed from: j, reason: collision with root package name */
    public final io.appmetrica.analytics.internal.IdentifiersResult f4943j;

    /* renamed from: k, reason: collision with root package name */
    public final io.appmetrica.analytics.internal.IdentifiersResult f4944k;

    /* renamed from: l, reason: collision with root package name */
    public final long f4945l;

    /* renamed from: m, reason: collision with root package name */
    public final long f4946m;

    /* renamed from: n, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.V9 f4947n;

    /* renamed from: o, reason: collision with root package name */
    public final android.os.Bundle f4948o;

    public S3(io.appmetrica.analytics.internal.IdentifiersResult identifiersResult, io.appmetrica.analytics.internal.IdentifiersResult identifiersResult2, io.appmetrica.analytics.internal.IdentifiersResult identifiersResult3, io.appmetrica.analytics.internal.IdentifiersResult identifiersResult4, io.appmetrica.analytics.internal.IdentifiersResult identifiersResult5, io.appmetrica.analytics.internal.IdentifiersResult identifiersResult6, io.appmetrica.analytics.internal.IdentifiersResult identifiersResult7, io.appmetrica.analytics.internal.IdentifiersResult identifiersResult8, io.appmetrica.analytics.internal.IdentifiersResult identifiersResult9, io.appmetrica.analytics.internal.IdentifiersResult identifiersResult10, io.appmetrica.analytics.internal.IdentifiersResult identifiersResult11, long j2, long j3, io.appmetrica.analytics.impl.V9 v9, android.os.Bundle bundle) {
        this.f4934a = identifiersResult;
        this.f4935b = identifiersResult2;
        this.f4936c = identifiersResult3;
        this.f4937d = identifiersResult4;
        this.f4938e = identifiersResult5;
        this.f4939f = identifiersResult6;
        this.f4940g = identifiersResult7;
        this.f4941h = identifiersResult8;
        this.f4942i = identifiersResult9;
        this.f4943j = identifiersResult10;
        this.f4944k = identifiersResult11;
        this.f4945l = j2;
        this.f4946m = j3;
        this.f4947n = v9;
        this.f4948o = bundle;
    }

    public static io.appmetrica.analytics.internal.IdentifiersResult a(android.os.Bundle bundle, java.lang.String str) {
        android.os.Parcelable parcelable;
        android.os.Bundle bundle2 = bundle.getBundle(str);
        java.lang.ClassLoader classLoader = io.appmetrica.analytics.internal.IdentifiersResult.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        io.appmetrica.analytics.internal.IdentifiersResult identifiersResult = (io.appmetrica.analytics.internal.IdentifiersResult) parcelable;
        return identifiersResult == null ? new io.appmetrica.analytics.internal.IdentifiersResult(null, io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.UNKNOWN, "bundle serialization error") : identifiersResult;
    }

    public final void b(android.os.Bundle bundle) {
        io.appmetrica.analytics.internal.IdentifiersResult identifiersResult = this.f4934a;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putParcelable("value", identifiersResult);
        bundle.putBundle("Uuid", bundle2);
        io.appmetrica.analytics.internal.IdentifiersResult identifiersResult2 = this.f4935b;
        android.os.Bundle bundle3 = new android.os.Bundle();
        bundle3.putParcelable("value", identifiersResult2);
        bundle.putBundle("DeviceId", bundle3);
        io.appmetrica.analytics.internal.IdentifiersResult identifiersResult3 = this.f4936c;
        android.os.Bundle bundle4 = new android.os.Bundle();
        bundle4.putParcelable("value", identifiersResult3);
        bundle.putBundle("DeviceIdHash", bundle4);
        io.appmetrica.analytics.internal.IdentifiersResult identifiersResult4 = this.f4937d;
        android.os.Bundle bundle5 = new android.os.Bundle();
        bundle5.putParcelable("value", identifiersResult4);
        bundle.putBundle("AdUrlReport", bundle5);
        io.appmetrica.analytics.internal.IdentifiersResult identifiersResult5 = this.f4938e;
        android.os.Bundle bundle6 = new android.os.Bundle();
        bundle6.putParcelable("value", identifiersResult5);
        bundle.putBundle("AdUrlGet", bundle6);
        io.appmetrica.analytics.internal.IdentifiersResult identifiersResult6 = this.f4939f;
        android.os.Bundle bundle7 = new android.os.Bundle();
        bundle7.putParcelable("value", identifiersResult6);
        bundle.putBundle("Clids", bundle7);
        io.appmetrica.analytics.internal.IdentifiersResult identifiersResult7 = this.f4940g;
        android.os.Bundle bundle8 = new android.os.Bundle();
        bundle8.putParcelable("value", identifiersResult7);
        bundle.putBundle("RequestClids", bundle8);
        io.appmetrica.analytics.internal.IdentifiersResult identifiersResult8 = this.f4941h;
        android.os.Bundle bundle9 = new android.os.Bundle();
        bundle9.putParcelable("value", identifiersResult8);
        bundle.putBundle("GAID", bundle9);
        io.appmetrica.analytics.internal.IdentifiersResult identifiersResult9 = this.f4942i;
        android.os.Bundle bundle10 = new android.os.Bundle();
        bundle10.putParcelable("value", identifiersResult9);
        bundle.putBundle("HOAID", bundle10);
        io.appmetrica.analytics.internal.IdentifiersResult identifiersResult10 = this.f4943j;
        android.os.Bundle bundle11 = new android.os.Bundle();
        bundle11.putParcelable("value", identifiersResult10);
        bundle.putBundle("YANDEX_ADV_ID", bundle11);
        io.appmetrica.analytics.internal.IdentifiersResult identifiersResult11 = this.f4944k;
        android.os.Bundle bundle12 = new android.os.Bundle();
        bundle12.putParcelable("value", identifiersResult11);
        bundle.putBundle("CUSTOM_SDK_HOSTS", bundle12);
        bundle.putLong("ServerTimeOffset", this.f4945l);
        bundle.putLong("NextStartupTime", this.f4946m);
        io.appmetrica.analytics.impl.V9 v9 = this.f4947n;
        android.os.Bundle bundle13 = new android.os.Bundle();
        bundle13.putParcelable("value", v9);
        bundle.putBundle("features", bundle13);
        bundle.putBundle("module_configs", io.appmetrica.analytics.impl.C0560na.f6484I.p().i());
    }

    public final java.lang.String toString() {
        return "ClientIdentifiersHolder{mUuidData=" + this.f4934a + ", mDeviceIdData=" + this.f4935b + ", mDeviceIdHashData=" + this.f4936c + ", mReportAdUrlData=" + this.f4937d + ", mGetAdUrlData=" + this.f4938e + ", mResponseClidsData=" + this.f4939f + ", mClientClidsForRequestData=" + this.f4940g + ", mGaidData=" + this.f4941h + ", mHoaidData=" + this.f4942i + ", yandexAdvIdData=" + this.f4943j + ", customSdkHostsData=" + this.f4944k + ", mServerTimeOffset=" + this.f4945l + ", nextStartupTime=" + this.f4946m + ", features=" + this.f4947n + ", modulesConfig=" + this.f4948o + '}';
    }

    public static io.appmetrica.analytics.impl.V9 a(android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        android.os.Bundle bundle2 = bundle.getBundle("features");
        java.lang.ClassLoader classLoader = io.appmetrica.analytics.impl.V9.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        io.appmetrica.analytics.impl.V9 v9 = (io.appmetrica.analytics.impl.V9) parcelable;
        return v9 == null ? new io.appmetrica.analytics.impl.V9(null, io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.UNKNOWN, "bundle serialization error") : v9;
    }

    public static io.appmetrica.analytics.internal.IdentifiersResult a(java.lang.String str) {
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        return new io.appmetrica.analytics.internal.IdentifiersResult(str, isEmpty ? io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.UNKNOWN : io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK, isEmpty ? "no identifier in startup state" : null);
    }

    public static io.appmetrica.analytics.impl.V9 a(java.lang.Boolean bool) {
        boolean z2 = bool != null;
        return new io.appmetrica.analytics.impl.V9(bool, z2 ? io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.OK : io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.UNKNOWN, z2 ? null : "no identifier in startup state");
    }
}
