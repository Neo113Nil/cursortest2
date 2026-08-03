package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.o4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0580o4 implements io.appmetrica.analytics.networktasks.internal.ArgumentsMerger {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6553a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Boolean f6554b;

    /* renamed from: c, reason: collision with root package name */
    public final android.location.Location f6555c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Boolean f6556d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f6557e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f6558f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Integer f6559g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Boolean f6560h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Boolean f6561i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Map<java.lang.String, java.lang.String> f6562j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Integer f6563k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.Boolean f6564l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Boolean f6565m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Boolean f6566n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Set<java.lang.String> f6567o;

    public C0580o4(java.lang.String str, java.lang.Boolean bool, android.location.Location location, java.lang.Boolean bool2, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Boolean bool3, java.lang.Boolean bool4, java.util.Map map, java.lang.Integer num4, java.lang.Boolean bool5, java.lang.Boolean bool6, java.lang.Boolean bool7, java.util.Set set) {
        this.f6553a = str;
        this.f6554b = bool;
        this.f6555c = location;
        this.f6556d = bool2;
        this.f6557e = num;
        this.f6558f = num2;
        this.f6559g = num3;
        this.f6560h = bool3;
        this.f6561i = bool4;
        this.f6562j = map;
        this.f6563k = num4;
        this.f6564l = bool5;
        this.f6565m = bool6;
        this.f6566n = bool7;
        this.f6567o = set;
    }

    public final boolean a(io.appmetrica.analytics.impl.C0580o4 c0580o4) {
        return equals(c0580o4);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0580o4 mergeFrom(io.appmetrica.analytics.impl.C0580o4 c0580o4) {
        return new io.appmetrica.analytics.impl.C0580o4((java.lang.String) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultNullable(this.f6553a, c0580o4.f6553a), (java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultNullable(this.f6554b, c0580o4.f6554b), (android.location.Location) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultNullable(this.f6555c, c0580o4.f6555c), (java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultNullable(this.f6556d, c0580o4.f6556d), (java.lang.Integer) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultNullable(this.f6557e, c0580o4.f6557e), (java.lang.Integer) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultNullable(this.f6558f, c0580o4.f6558f), (java.lang.Integer) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultNullable(this.f6559g, c0580o4.f6559g), (java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultNullable(this.f6560h, c0580o4.f6560h), (java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultNullable(this.f6561i, c0580o4.f6561i), (java.util.Map) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultNullable(this.f6562j, c0580o4.f6562j), (java.lang.Integer) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultNullable(this.f6563k, c0580o4.f6563k), (java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultNullable(this.f6564l, c0580o4.f6564l), (java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultNullable(this.f6565m, c0580o4.f6565m), (java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultNullable(this.f6566n, c0580o4.f6566n), io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.merge(this.f6567o, c0580o4.f6567o));
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(java.lang.Object obj) {
        return equals((io.appmetrica.analytics.impl.C0580o4) obj);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || io.appmetrica.analytics.impl.C0580o4.class != obj.getClass()) {
            return false;
        }
        io.appmetrica.analytics.impl.C0580o4 c0580o4 = (io.appmetrica.analytics.impl.C0580o4) obj;
        return java.util.Objects.equals(this.f6553a, c0580o4.f6553a) && java.util.Objects.equals(this.f6554b, c0580o4.f6554b) && java.util.Objects.equals(this.f6555c, c0580o4.f6555c) && java.util.Objects.equals(this.f6556d, c0580o4.f6556d) && java.util.Objects.equals(this.f6557e, c0580o4.f6557e) && java.util.Objects.equals(this.f6558f, c0580o4.f6558f) && java.util.Objects.equals(this.f6559g, c0580o4.f6559g) && java.util.Objects.equals(this.f6560h, c0580o4.f6560h) && java.util.Objects.equals(this.f6561i, c0580o4.f6561i) && java.util.Objects.equals(this.f6562j, c0580o4.f6562j) && java.util.Objects.equals(this.f6563k, c0580o4.f6563k) && java.util.Objects.equals(this.f6564l, c0580o4.f6564l) && java.util.Objects.equals(this.f6565m, c0580o4.f6565m) && java.util.Objects.equals(this.f6566n, c0580o4.f6566n) && java.util.Objects.equals(this.f6567o, c0580o4.f6567o);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.f6553a, this.f6554b, this.f6555c, this.f6556d, this.f6557e, this.f6558f, this.f6559g, this.f6560h, this.f6561i, this.f6562j, this.f6563k, this.f6564l, this.f6565m, this.f6566n, this.f6567o);
    }

    public final java.lang.String toString() {
        return "ReporterArguments{apiKey='" + this.f6553a + "', locationTracking=" + this.f6554b + ", manualLocation=" + this.f6555c + ", firstActivationAsUpdate=" + this.f6556d + ", sessionTimeout=" + this.f6557e + ", maxReportsCount=" + this.f6558f + ", dispatchPeriod=" + this.f6559g + ", logEnabled=" + this.f6560h + ", dataSendingEnabled=" + this.f6561i + ", clidsFromClient=" + this.f6562j + ", maxReportsInDbCount=" + this.f6563k + ", nativeCrashesEnabled=" + this.f6564l + ", revenueAutoTrackingEnabled=" + this.f6565m + ", advIdentifiersTrackingEnabled=" + this.f6566n + ", autoCollectedDataSubscribers=" + this.f6567o + '}';
    }

    public C0580o4(io.appmetrica.analytics.internal.CounterConfiguration counterConfiguration, java.util.Map<java.lang.String, java.lang.String> map) {
        this(counterConfiguration.getApiKey(), counterConfiguration.isLocationTrackingEnabled(), counterConfiguration.getManualLocation(), counterConfiguration.isFirstActivationAsUpdate(), counterConfiguration.getSessionTimeout(), counterConfiguration.getMaxReportsCount(), counterConfiguration.getDispatchPeriod(), counterConfiguration.isLogEnabled(), counterConfiguration.getDataSendingEnabled(), map, counterConfiguration.getMaxReportsInDbCount(), counterConfiguration.getReportNativeCrashesEnabled(), counterConfiguration.isRevenueAutoTrackingEnabled(), counterConfiguration.isAdvIdentifiersTrackingEnabled(), new java.util.HashSet(counterConfiguration.getAutoCollectedDataSubscribers()));
    }

    public C0580o4() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, new java.util.HashSet());
    }
}
