package io.appmetrica.analytics.internal;

/* loaded from: classes.dex */
public class CounterConfiguration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<io.appmetrica.analytics.internal.CounterConfiguration> CREATOR = new io.appmetrica.analytics.internal.a();

    /* renamed from: a, reason: collision with root package name */
    private final android.content.ContentValues f7196a;

    public /* synthetic */ CounterConfiguration(android.content.ContentValues contentValues, int i2) {
        this(contentValues);
    }

    private void a(java.lang.String str) {
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(str)) {
            setApiKey(str);
        }
    }

    private void b(java.lang.String str) {
        if ("20799a27-fa80-4b36-b2db-0f8141f24180".equals(str)) {
            setReporterType(io.appmetrica.analytics.internal.CounterConfigurationReporterType.SELF_SDK);
        } else {
            setReporterType(io.appmetrica.analytics.internal.CounterConfigurationReporterType.MANUAL);
        }
    }

    private void c(java.lang.Integer num) {
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(num)) {
            this.f7196a.put("MAX_REPORTS_IN_DB_COUNT", num);
        }
    }

    private void d(java.lang.Integer num) {
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(num)) {
            setSessionTimeout(num.intValue());
        }
    }

    public static io.appmetrica.analytics.internal.CounterConfiguration fromBundle(android.os.Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        try {
            return (io.appmetrica.analytics.internal.CounterConfiguration) bundle.getParcelable("COUNTER_CFG_OBJ");
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public final synchronized void addAutoCollectedDataSubscriber(java.lang.String str) {
        addAutoCollectedDataSubscribers(java.util.Collections.singletonList(str));
    }

    public final synchronized void addAutoCollectedDataSubscribers(java.util.List<java.lang.String> list) {
        getAutoCollectedDataSubscribers().addAll(list);
        android.content.ContentValues contentValues = this.f7196a;
        if (list != null) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            try {
                obtain.writeStringList(list);
                contentValues.put("CFG_AUTO_COLLECTED_DATA_SUBSCRIBERS", obtain.marshall());
            } catch (java.lang.Throwable unused) {
            }
            obtain.recycle();
        }
    }

    public synchronized void applyFromAnonymousConfig(io.appmetrica.analytics.AppMetricaConfig appMetricaConfig) {
        try {
            a(appMetricaConfig.apiKey);
            d(appMetricaConfig.sessionTimeout);
            if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.location)) {
                setManualLocation(appMetricaConfig.location);
            }
            if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.locationTracking)) {
                setLocationTracking(appMetricaConfig.locationTracking.booleanValue());
            }
            if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.advIdentifiersTracking)) {
                setAdvIdentifiersTracking(appMetricaConfig.advIdentifiersTracking.booleanValue(), false);
            }
            if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.deviceType)) {
                setDeviceType(appMetricaConfig.deviceType);
            }
            a(appMetricaConfig.dispatchPeriodSeconds);
            b(appMetricaConfig.maxReportsCount);
            b(appMetricaConfig.logs);
            if (!android.text.TextUtils.isEmpty(appMetricaConfig.appVersion)) {
                setCustomAppVersion(appMetricaConfig.appVersion);
            }
            if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.appBuildNumber)) {
                setAppBuildNumber(appMetricaConfig.appBuildNumber.intValue());
            }
            if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.firstActivationAsUpdate)) {
                setFirstActivationAsUpdate(appMetricaConfig.firstActivationAsUpdate.booleanValue());
            }
            a(appMetricaConfig.dataSendingEnabled);
            c(appMetricaConfig.maxReportsInDatabaseCount);
            java.lang.Boolean bool = appMetricaConfig.nativeCrashReporting;
            if (io.appmetrica.analytics.impl.AbstractC0522lo.a(bool)) {
                this.f7196a.put("CFG_NATIVE_CRASHES_ENABLED", bool);
            }
            if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.revenueAutoTrackingEnabled)) {
                setRevenueAutoTrackingEnabled(appMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public synchronized void applyFromConfig(io.appmetrica.analytics.AppMetricaConfig appMetricaConfig) {
        try {
            a(appMetricaConfig.apiKey);
            d(appMetricaConfig.sessionTimeout);
            if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.location)) {
                setManualLocation(appMetricaConfig.location);
            }
            if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.locationTracking)) {
                setLocationTracking(appMetricaConfig.locationTracking.booleanValue());
            }
            if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.advIdentifiersTracking)) {
                setAdvIdentifiersTracking(appMetricaConfig.advIdentifiersTracking.booleanValue(), true);
            }
            if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.deviceType)) {
                setDeviceType(appMetricaConfig.deviceType);
            }
            a(appMetricaConfig.dispatchPeriodSeconds);
            b(appMetricaConfig.maxReportsCount);
            b(appMetricaConfig.logs);
            if (!android.text.TextUtils.isEmpty(appMetricaConfig.appVersion)) {
                setCustomAppVersion(appMetricaConfig.appVersion);
            }
            if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.appBuildNumber)) {
                setAppBuildNumber(appMetricaConfig.appBuildNumber.intValue());
            }
            if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.firstActivationAsUpdate)) {
                setFirstActivationAsUpdate(appMetricaConfig.firstActivationAsUpdate.booleanValue());
            }
            a(appMetricaConfig.dataSendingEnabled);
            c(appMetricaConfig.maxReportsInDatabaseCount);
            java.lang.Boolean bool = appMetricaConfig.nativeCrashReporting;
            if (io.appmetrica.analytics.impl.AbstractC0522lo.a(bool)) {
                this.f7196a.put("CFG_NATIVE_CRASHES_ENABLED", bool);
            }
            if (io.appmetrica.analytics.impl.AbstractC0522lo.a(appMetricaConfig.revenueAutoTrackingEnabled)) {
                setRevenueAutoTrackingEnabled(appMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String getApiKey() {
        return this.f7196a.getAsString("CFG_API_KEY");
    }

    public java.lang.String getAppBuildNumber() {
        return this.f7196a.getAsString("CFG_APP_VERSION_CODE");
    }

    public java.lang.String getAppVersion() {
        return this.f7196a.getAsString("CFG_APP_VERSION");
    }

    public java.util.List<java.lang.String> getAutoCollectedDataSubscribers() {
        android.content.ContentValues contentValues = this.f7196a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        byte[] asByteArray = contentValues.getAsByteArray("CFG_AUTO_COLLECTED_DATA_SUBSCRIBERS");
        if (asByteArray != null) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            try {
                obtain.unmarshall(asByteArray, 0, asByteArray.length);
                obtain.setDataPosition(0);
                obtain.readStringList(arrayList);
            } catch (java.lang.Throwable unused) {
            }
            obtain.recycle();
        }
        return arrayList;
    }

    public java.lang.Boolean getDataSendingEnabled() {
        return this.f7196a.getAsBoolean("CFG_DATA_SENDING_ENABLED");
    }

    public java.lang.String getDeviceType() {
        return this.f7196a.getAsString("CFG_DEVICE_SIZE_TYPE");
    }

    public java.lang.Integer getDispatchPeriod() {
        return this.f7196a.getAsInteger("CFG_DISPATCH_PERIOD");
    }

    public android.location.Location getManualLocation() {
        if (this.f7196a.containsKey("CFG_MANUAL_LOCATION")) {
            return io.appmetrica.analytics.coreutils.internal.LocationUtils.bytesToLocation(this.f7196a.getAsByteArray("CFG_MANUAL_LOCATION"));
        }
        return null;
    }

    public java.lang.Integer getMaxReportsCount() {
        return this.f7196a.getAsInteger("CFG_MAX_REPORTS_COUNT");
    }

    public java.lang.Integer getMaxReportsInDbCount() {
        return this.f7196a.getAsInteger("MAX_REPORTS_IN_DB_COUNT");
    }

    public java.lang.Boolean getReportNativeCrashesEnabled() {
        return this.f7196a.getAsBoolean("CFG_NATIVE_CRASHES_ENABLED");
    }

    public io.appmetrica.analytics.internal.CounterConfigurationReporterType getReporterType() {
        return io.appmetrica.analytics.internal.CounterConfigurationReporterType.fromStringValue(this.f7196a.getAsString("CFG_REPORTER_TYPE"));
    }

    public java.lang.Integer getSessionTimeout() {
        return this.f7196a.getAsInteger("CFG_SESSION_TIMEOUT");
    }

    public java.lang.String getUuid() {
        return this.f7196a.getAsString("CFG_UUID");
    }

    public java.lang.Boolean isAdvIdentifiersTrackingEnabled() {
        return this.f7196a.getAsBoolean("CFG_ADV_IDENTIFIERS_TRACKING_ENABLED");
    }

    public java.lang.Boolean isFirstActivationAsUpdate() {
        return this.f7196a.getAsBoolean("CFG_IS_FIRST_ACTIVATION_AS_UPDATE");
    }

    public java.lang.Boolean isLocationTrackingEnabled() {
        return this.f7196a.getAsBoolean("CFG_LOCATION_TRACKING");
    }

    public java.lang.Boolean isLogEnabled() {
        return this.f7196a.getAsBoolean("CFG_IS_LOG_ENABLED");
    }

    public synchronized java.lang.Boolean isRevenueAutoTrackingEnabled() {
        return this.f7196a.getAsBoolean("CFG_REVENUE_AUTO_TRACKING_ENABLED");
    }

    public synchronized void setAdvIdentifiersTracking(boolean z2, boolean z3) {
        boolean z4 = isAdvIdentifiersTrackingEnabled() == null;
        boolean equals = java.lang.Boolean.TRUE.equals(this.f7196a.getAsBoolean("CFG_ADV_IDENTIFIERS_TRACKING_ENABLED_FORCED"));
        if (z3 || z4 || !equals) {
            this.f7196a.put("CFG_ADV_IDENTIFIERS_TRACKING_ENABLED", java.lang.Boolean.valueOf(z2));
            this.f7196a.put("CFG_ADV_IDENTIFIERS_TRACKING_ENABLED_FORCED", java.lang.Boolean.valueOf(z3));
        }
    }

    public synchronized void setApiKey(java.lang.String str) {
        this.f7196a.put("CFG_API_KEY", str);
    }

    public synchronized void setAppBuildNumber(int i2) {
        this.f7196a.put("CFG_APP_VERSION_CODE", java.lang.String.valueOf(i2));
    }

    public final synchronized void setCustomAppVersion(java.lang.String str) {
        this.f7196a.put("CFG_APP_VERSION", str);
    }

    public final synchronized void setDataSendingEnabled(boolean z2) {
        this.f7196a.put("CFG_DATA_SENDING_ENABLED", java.lang.Boolean.valueOf(z2));
    }

    public final synchronized void setDeviceType(java.lang.String str) {
        android.content.ContentValues contentValues = this.f7196a;
        if (android.text.TextUtils.isEmpty(str)) {
            str = null;
        }
        contentValues.put("CFG_DEVICE_SIZE_TYPE", str);
    }

    public synchronized void setDispatchPeriod(int i2) {
        this.f7196a.put("CFG_DISPATCH_PERIOD", java.lang.Integer.valueOf(i2));
    }

    public final synchronized void setFirstActivationAsUpdate(boolean z2) {
        this.f7196a.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", java.lang.Boolean.valueOf(z2));
    }

    public synchronized void setLocationTracking(boolean z2) {
        this.f7196a.put("CFG_LOCATION_TRACKING", java.lang.Boolean.valueOf(z2));
    }

    public synchronized void setLogEnabled(boolean z2) {
        this.f7196a.put("CFG_IS_LOG_ENABLED", java.lang.Boolean.valueOf(z2));
    }

    public final synchronized void setManualLocation(android.location.Location location) {
        this.f7196a.put("CFG_MANUAL_LOCATION", io.appmetrica.analytics.coreutils.internal.LocationUtils.locationToBytes(location));
    }

    public synchronized void setMaxReportsCount(int i2) {
        android.content.ContentValues contentValues = this.f7196a;
        if (i2 <= 0) {
            i2 = Integer.MAX_VALUE;
        }
        contentValues.put("CFG_MAX_REPORTS_COUNT", java.lang.Integer.valueOf(i2));
    }

    public void setMaxReportsInDbCount(int i2) {
        this.f7196a.put("MAX_REPORTS_IN_DB_COUNT", java.lang.Integer.valueOf(i2));
    }

    public synchronized void setReporterType(io.appmetrica.analytics.internal.CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f7196a.put("CFG_REPORTER_TYPE", counterConfigurationReporterType.getStringValue());
    }

    public synchronized void setRevenueAutoTrackingEnabled(boolean z2) {
        this.f7196a.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", java.lang.Boolean.valueOf(z2));
    }

    public synchronized void setSessionTimeout(int i2) {
        this.f7196a.put("CFG_SESSION_TIMEOUT", java.lang.Integer.valueOf(i2));
    }

    public synchronized void setUuid(java.lang.String str) {
        this.f7196a.put("CFG_UUID", str);
    }

    public synchronized void toBundle(android.os.Bundle bundle) {
        bundle.putParcelable("COUNTER_CFG_OBJ", this);
    }

    public synchronized java.lang.String toString() {
        return "CounterConfiguration{mParamsMapping=" + this.f7196a + '}';
    }

    @Override // android.os.Parcelable
    public synchronized void writeToParcel(android.os.Parcel parcel, int i2) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.data", this.f7196a);
        parcel.writeBundle(bundle);
    }

    public CounterConfiguration(io.appmetrica.analytics.internal.CounterConfiguration counterConfiguration) {
        synchronized (counterConfiguration) {
            this.f7196a = new android.content.ContentValues(counterConfiguration.f7196a);
        }
    }

    private void a(java.lang.Integer num) {
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(num)) {
            setDispatchPeriod(num.intValue());
        }
    }

    private void b(java.lang.Integer num) {
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(num)) {
            setMaxReportsCount(num.intValue());
        }
    }

    private void a(java.lang.Boolean bool) {
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(bool)) {
            setDataSendingEnabled(bool.booleanValue());
        }
    }

    private void b(java.lang.Boolean bool) {
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(bool)) {
            setLogEnabled(bool.booleanValue());
        }
    }

    public CounterConfiguration() {
        this.f7196a = new android.content.ContentValues();
    }

    public CounterConfiguration(java.lang.String str) {
        this();
        synchronized (this) {
            setApiKey(str);
        }
    }

    public CounterConfiguration(io.appmetrica.analytics.internal.CounterConfigurationReporterType counterConfigurationReporterType) {
        this();
        synchronized (this) {
            setReporterType(counterConfigurationReporterType);
        }
    }

    public CounterConfiguration(io.appmetrica.analytics.AppMetricaConfig appMetricaConfig, io.appmetrica.analytics.internal.CounterConfigurationReporterType counterConfigurationReporterType) {
        this();
        synchronized (this) {
            applyFromConfig(appMetricaConfig);
            setReporterType(counterConfigurationReporterType);
        }
    }

    public CounterConfiguration(io.appmetrica.analytics.ReporterConfig reporterConfig) {
        this();
        synchronized (this) {
            a(reporterConfig.apiKey);
            d(reporterConfig.sessionTimeout);
            a(reporterConfig.dispatchPeriodSeconds);
            b(reporterConfig.maxReportsCount);
            b(reporterConfig.logs);
            a(reporterConfig.dataSendingEnabled);
            c(reporterConfig.maxReportsInDatabaseCount);
            b(reporterConfig.apiKey);
        }
    }

    private CounterConfiguration(android.content.ContentValues contentValues) {
        this.f7196a = contentValues;
    }
}
