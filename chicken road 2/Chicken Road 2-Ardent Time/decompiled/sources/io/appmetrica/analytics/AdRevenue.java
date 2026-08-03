package io.appmetrica.analytics;

/* loaded from: classes.dex */
public class AdRevenue {
    public final java.lang.String adNetwork;
    public final java.lang.String adPlacementId;
    public final java.lang.String adPlacementName;
    public final java.math.BigDecimal adRevenue;
    public final io.appmetrica.analytics.AdType adType;
    public final java.lang.String adUnitId;
    public final java.lang.String adUnitName;
    public final java.util.Currency currency;
    public final java.util.Map<java.lang.String, java.lang.String> payload;
    public final java.lang.String precision;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final java.math.BigDecimal f3328a;

        /* renamed from: b, reason: collision with root package name */
        private final java.util.Currency f3329b;

        /* renamed from: c, reason: collision with root package name */
        private io.appmetrica.analytics.AdType f3330c;

        /* renamed from: d, reason: collision with root package name */
        private java.lang.String f3331d;

        /* renamed from: e, reason: collision with root package name */
        private java.lang.String f3332e;

        /* renamed from: f, reason: collision with root package name */
        private java.lang.String f3333f;

        /* renamed from: g, reason: collision with root package name */
        private java.lang.String f3334g;

        /* renamed from: h, reason: collision with root package name */
        private java.lang.String f3335h;

        /* renamed from: i, reason: collision with root package name */
        private java.lang.String f3336i;

        /* renamed from: j, reason: collision with root package name */
        private java.util.Map f3337j;

        public /* synthetic */ Builder(java.math.BigDecimal bigDecimal, java.util.Currency currency, int i2) {
            this(bigDecimal, currency);
        }

        public io.appmetrica.analytics.AdRevenue build() {
            return new io.appmetrica.analytics.AdRevenue(this.f3328a, this.f3329b, this.f3330c, this.f3331d, this.f3332e, this.f3333f, this.f3334g, this.f3335h, this.f3336i, this.f3337j, 0);
        }

        public io.appmetrica.analytics.AdRevenue.Builder withAdNetwork(java.lang.String str) {
            this.f3331d = str;
            return this;
        }

        public io.appmetrica.analytics.AdRevenue.Builder withAdPlacementId(java.lang.String str) {
            this.f3334g = str;
            return this;
        }

        public io.appmetrica.analytics.AdRevenue.Builder withAdPlacementName(java.lang.String str) {
            this.f3335h = str;
            return this;
        }

        public io.appmetrica.analytics.AdRevenue.Builder withAdType(io.appmetrica.analytics.AdType adType) {
            this.f3330c = adType;
            return this;
        }

        public io.appmetrica.analytics.AdRevenue.Builder withAdUnitId(java.lang.String str) {
            this.f3332e = str;
            return this;
        }

        public io.appmetrica.analytics.AdRevenue.Builder withAdUnitName(java.lang.String str) {
            this.f3333f = str;
            return this;
        }

        public io.appmetrica.analytics.AdRevenue.Builder withPayload(java.util.Map<java.lang.String, java.lang.String> map) {
            this.f3337j = map == null ? null : io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.copyOf(map);
            return this;
        }

        public io.appmetrica.analytics.AdRevenue.Builder withPrecision(java.lang.String str) {
            this.f3336i = str;
            return this;
        }

        private Builder(java.math.BigDecimal bigDecimal, java.util.Currency currency) {
            this.f3328a = bigDecimal;
            this.f3329b = currency;
        }
    }

    public /* synthetic */ AdRevenue(java.math.BigDecimal bigDecimal, java.util.Currency currency, io.appmetrica.analytics.AdType adType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.Map map, int i2) {
        this(bigDecimal, currency, adType, str, str2, str3, str4, str5, str6, map);
    }

    public static io.appmetrica.analytics.AdRevenue.Builder newBuilder(java.math.BigDecimal bigDecimal, java.util.Currency currency) {
        return new io.appmetrica.analytics.AdRevenue.Builder(bigDecimal, currency, 0);
    }

    private AdRevenue(java.math.BigDecimal bigDecimal, java.util.Currency currency, io.appmetrica.analytics.AdType adType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.Map map) {
        this.adRevenue = bigDecimal;
        this.currency = currency;
        this.adType = adType;
        this.adNetwork = str;
        this.adUnitId = str2;
        this.adUnitName = str3;
        this.adPlacementId = str4;
        this.adPlacementName = str5;
        this.precision = str6;
        this.payload = map == null ? null : io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.unmodifiableMapCopy(map);
    }

    public static io.appmetrica.analytics.AdRevenue.Builder newBuilder(long j2, java.util.Currency currency) {
        return new io.appmetrica.analytics.AdRevenue.Builder(io.appmetrica.analytics.impl.AbstractC0522lo.a(j2), currency, 0);
    }

    public static io.appmetrica.analytics.AdRevenue.Builder newBuilder(double d2, java.util.Currency currency) {
        return new io.appmetrica.analytics.AdRevenue.Builder(new java.math.BigDecimal(io.appmetrica.analytics.impl.AbstractC0522lo.a(d2)), currency, 0);
    }
}
