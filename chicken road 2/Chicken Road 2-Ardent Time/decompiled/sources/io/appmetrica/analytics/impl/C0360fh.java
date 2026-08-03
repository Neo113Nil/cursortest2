package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.fh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0360fh extends io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.BaseRequestArguments {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5892a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5893b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5894c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5895d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5896e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5897f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5898g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5899h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map<java.lang.String, java.lang.String> f5900i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5901j;

    public C0360fh(io.appmetrica.analytics.impl.C0580o4 c0580o4) {
        this(c0580o4.f6553a, c0580o4.f6554b, c0580o4.f6556d, c0580o4.f6557e, c0580o4.f6558f, c0580o4.f6559g, c0580o4.f6560h, c0580o4.f6561i, c0580o4.f6562j, c0580o4.f6563k);
    }

    public static io.appmetrica.analytics.impl.C0360fh a() {
        return new io.appmetrica.analytics.impl.C0360fh(null, null, null, null, null, null, null, null, null, null);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.C0360fh mergeFrom(io.appmetrica.analytics.impl.C0580o4 c0580o4) {
        return new io.appmetrica.analytics.impl.C0360fh((java.lang.String) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultNullable(c0580o4.f6553a, this.f5892a), (java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultNullable(c0580o4.f6554b, java.lang.Boolean.valueOf(this.f5893b)), (java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultNullable(c0580o4.f6556d, java.lang.Boolean.valueOf(this.f5894c)), (java.lang.Integer) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultNullable(c0580o4.f6557e, java.lang.Integer.valueOf(this.f5895d)), (java.lang.Integer) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultNullable(c0580o4.f6558f, java.lang.Integer.valueOf(this.f5896e)), (java.lang.Integer) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultNullable(c0580o4.f6559g, java.lang.Integer.valueOf(this.f5897f)), (java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultNullable(c0580o4.f6560h, java.lang.Boolean.valueOf(this.f5898g)), (java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultNullable(c0580o4.f6561i, java.lang.Boolean.valueOf(this.f5899h)), (java.util.Map) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultNullable(c0580o4.f6562j, this.f5900i), (java.lang.Integer) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefaultNullable(c0580o4.f6563k, java.lang.Integer.valueOf(this.f5901j)));
    }

    public C0360fh(java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Boolean bool3, java.lang.Boolean bool4, java.util.Map map, java.lang.Integer num4) {
        this.f5892a = str;
        java.lang.Boolean bool5 = java.lang.Boolean.FALSE;
        this.f5893b = ((java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(bool, bool5)).booleanValue();
        this.f5894c = ((java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(bool2, bool5)).booleanValue();
        this.f5895d = java.lang.Math.max(10, ((java.lang.Integer) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(num, 10)).intValue());
        this.f5896e = ((java.lang.Integer) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(num2, 7)).intValue();
        this.f5897f = ((java.lang.Integer) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(num3, 90)).intValue();
        this.f5898g = ((java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(bool3, bool5)).booleanValue();
        this.f5899h = ((java.lang.Boolean) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(bool4, java.lang.Boolean.TRUE)).booleanValue();
        this.f5900i = map;
        this.f5901j = ((java.lang.Integer) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(num4, java.lang.Integer.valueOf(io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT))).intValue();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean compareWithOtherArguments(io.appmetrica.analytics.impl.C0580o4 c0580o4) {
        java.util.Map<java.lang.String, java.lang.String> map;
        java.lang.String str;
        java.lang.Boolean bool = c0580o4.f6554b;
        if (bool != null && this.f5893b != bool.booleanValue()) {
            return false;
        }
        java.lang.Boolean bool2 = c0580o4.f6556d;
        if (bool2 != null && this.f5894c != bool2.booleanValue()) {
            return false;
        }
        java.lang.Integer num = c0580o4.f6557e;
        if (num != null && this.f5895d != num.intValue()) {
            return false;
        }
        java.lang.Integer num2 = c0580o4.f6558f;
        if (num2 != null && this.f5896e != num2.intValue()) {
            return false;
        }
        java.lang.Integer num3 = c0580o4.f6559g;
        if (num3 != null && this.f5897f != num3.intValue()) {
            return false;
        }
        java.lang.Boolean bool3 = c0580o4.f6560h;
        if (bool3 != null && this.f5898g != bool3.booleanValue()) {
            return false;
        }
        java.lang.Boolean bool4 = c0580o4.f6561i;
        if (bool4 != null && this.f5899h != bool4.booleanValue()) {
            return false;
        }
        java.lang.String str2 = c0580o4.f6553a;
        if (str2 != null && ((str = this.f5892a) == null || !str.equals(str2))) {
            return false;
        }
        java.util.Map<java.lang.String, java.lang.String> map2 = c0580o4.f6562j;
        if (map2 != null && ((map = this.f5900i) == null || !map.equals(map2))) {
            return false;
        }
        java.lang.Integer num4 = c0580o4.f6563k;
        return num4 == null || this.f5901j == num4.intValue();
    }
}
