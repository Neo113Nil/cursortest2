package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Bf implements android.os.Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.ContentValues f4123a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.ResultReceiver f4124b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f4122c = java.util.UUID.randomUUID().toString();
    public static final android.os.Parcelable.Creator<io.appmetrica.analytics.impl.Bf> CREATOR = new io.appmetrica.analytics.impl.Af();

    public Bf(android.content.Context context, android.os.ResultReceiver resultReceiver) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        this.f4123a = contentValues;
        contentValues.put("PROCESS_CFG_PROCESS_ID", java.lang.Integer.valueOf(android.os.Process.myPid()));
        contentValues.put("PROCESS_CFG_PROCESS_SESSION_ID", f4122c);
        contentValues.put("PROCESS_CFG_SDK_API_LEVEL", java.lang.Integer.valueOf(io.appmetrica.analytics.AppMetrica.getLibraryApiLevel()));
        contentValues.put("PROCESS_CFG_PACKAGE_NAME", context.getPackageName());
        this.f4124b = resultReceiver;
    }

    public final void a(io.appmetrica.analytics.AppMetricaConfig appMetricaConfig) {
        java.lang.Object obj = appMetricaConfig.additionalConfig.get("YMM_clids");
        java.util.Map map = obj instanceof java.util.Map ? (java.util.Map) obj : null;
        if (map != null) {
            java.util.HashMap b2 = io.appmetrica.analytics.impl.Fm.b(map);
            synchronized (this) {
                this.f4123a.put("PROCESS_CFG_CLIDS", io.appmetrica.analytics.impl.AbstractC0380gb.b(b2));
            }
        }
    }

    public final void b(io.appmetrica.analytics.AppMetricaConfig appMetricaConfig) {
        java.util.List<java.lang.String> list = appMetricaConfig.customHosts;
        if (list != null) {
            synchronized (this) {
                this.f4123a.put("PROCESS_CFG_CUSTOM_HOSTS", io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Collection) list) ? null : new org.json.JSONArray((java.util.Collection) list).toString());
            }
        }
    }

    public final void c(io.appmetrica.analytics.AppMetricaConfig appMetricaConfig) {
        java.lang.String str = (java.lang.String) appMetricaConfig.additionalConfig.get("YMM_distributionReferrer");
        if (str != null) {
            synchronized (this) {
                this.f4123a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
            }
            i();
        }
    }

    public final void d(io.appmetrica.analytics.AppMetricaConfig appMetricaConfig) {
        if (appMetricaConfig != null) {
            synchronized (this) {
                b(appMetricaConfig);
                a(appMetricaConfig);
                c(appMetricaConfig);
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String e() {
        return this.f4123a.getAsString("PROCESS_CFG_PACKAGE_NAME");
    }

    public final java.lang.Integer f() {
        return this.f4123a.getAsInteger("PROCESS_CFG_PROCESS_ID");
    }

    public final java.lang.String g() {
        return this.f4123a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID");
    }

    public final boolean h() {
        return this.f4123a.containsKey("PROCESS_CFG_CUSTOM_HOSTS");
    }

    public final synchronized void i() {
        this.f4123a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", "api");
    }

    public final java.lang.String toString() {
        return "ProcessConfiguration{mParamsMapping=" + this.f4123a + ", mDataResultReceiver=" + this.f4124b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT", this.f4123a);
        bundle.putParcelable("CFG_KEY_PROCESS_ENVIRONMENT_RECEIVER", this.f4124b);
        parcel.writeBundle(bundle);
    }

    public final java.util.HashMap a() {
        return io.appmetrica.analytics.impl.AbstractC0380gb.c(this.f4123a.getAsString("PROCESS_CFG_CLIDS"));
    }

    public final java.lang.String c() {
        return this.f4123a.getAsString("PROCESS_CFG_DISTRIBUTION_REFERRER");
    }

    public final java.lang.String d() {
        return this.f4123a.getAsString("PROCESS_CFG_INSTALL_REFERRER_SOURCE");
    }

    public Bf(io.appmetrica.analytics.impl.Bf bf) {
        synchronized (bf) {
            this.f4123a = new android.content.ContentValues(bf.f4123a);
            this.f4124b = bf.f4124b;
        }
    }

    public final java.util.ArrayList b() {
        java.lang.String asString = this.f4123a.getAsString("PROCESS_CFG_CUSTOM_HOSTS");
        if (android.text.TextUtils.isEmpty(asString)) {
            return null;
        }
        return io.appmetrica.analytics.impl.AbstractC0380gb.b(asString);
    }

    public Bf(android.content.ContentValues contentValues, android.os.ResultReceiver resultReceiver) {
        this.f4123a = contentValues == null ? new android.content.ContentValues() : contentValues;
        this.f4124b = resultReceiver;
    }
}
