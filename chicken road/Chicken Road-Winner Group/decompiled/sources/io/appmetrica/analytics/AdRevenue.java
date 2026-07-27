package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.AbstractC0711no;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;

/* loaded from: classes.dex */
public class AdRevenue {
    public final String adNetwork;
    public final String adPlacementId;
    public final String adPlacementName;
    public final BigDecimal adRevenue;
    public final AdType adType;
    public final String adUnitId;
    public final String adUnitName;
    public final Currency currency;
    public final Map<String, String> payload;
    public final String precision;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final BigDecimal f5037a;

        /* renamed from: b, reason: collision with root package name */
        private final Currency f5038b;

        /* renamed from: c, reason: collision with root package name */
        private AdType f5039c;

        /* renamed from: d, reason: collision with root package name */
        private String f5040d;

        /* renamed from: e, reason: collision with root package name */
        private String f5041e;
        private String f;

        /* renamed from: g, reason: collision with root package name */
        private String f5042g;

        /* renamed from: h, reason: collision with root package name */
        private String f5043h;

        /* renamed from: i, reason: collision with root package name */
        private String f5044i;

        /* renamed from: j, reason: collision with root package name */
        private Map f5045j;

        public /* synthetic */ Builder(BigDecimal bigDecimal, Currency currency, int i3) {
            this(bigDecimal, currency);
        }

        public AdRevenue build() {
            return new AdRevenue(this.f5037a, this.f5038b, this.f5039c, this.f5040d, this.f5041e, this.f, this.f5042g, this.f5043h, this.f5044i, this.f5045j, 0);
        }

        public Builder withAdNetwork(String str) {
            this.f5040d = str;
            return this;
        }

        public Builder withAdPlacementId(String str) {
            this.f5042g = str;
            return this;
        }

        public Builder withAdPlacementName(String str) {
            this.f5043h = str;
            return this;
        }

        public Builder withAdType(AdType adType) {
            this.f5039c = adType;
            return this;
        }

        public Builder withAdUnitId(String str) {
            this.f5041e = str;
            return this;
        }

        public Builder withAdUnitName(String str) {
            this.f = str;
            return this;
        }

        public Builder withPayload(Map<String, String> map) {
            this.f5045j = map == null ? null : CollectionUtils.copyOf(map);
            return this;
        }

        public Builder withPrecision(String str) {
            this.f5044i = str;
            return this;
        }

        private Builder(BigDecimal bigDecimal, Currency currency) {
            this.f5037a = bigDecimal;
            this.f5038b = currency;
        }
    }

    public /* synthetic */ AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i3) {
        this(bigDecimal, currency, adType, str, str2, str3, str4, str5, str6, map);
    }

    public static Builder newBuilder(BigDecimal bigDecimal, Currency currency) {
        return new Builder(bigDecimal, currency, 0);
    }

    private AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        this.adRevenue = bigDecimal;
        this.currency = currency;
        this.adType = adType;
        this.adNetwork = str;
        this.adUnitId = str2;
        this.adUnitName = str3;
        this.adPlacementId = str4;
        this.adPlacementName = str5;
        this.precision = str6;
        this.payload = map == null ? null : CollectionUtils.unmodifiableMapCopy(map);
    }

    public static Builder newBuilder(long j3, Currency currency) {
        return new Builder(AbstractC0711no.a(j3), currency, 0);
    }

    public static Builder newBuilder(double d3, Currency currency) {
        return new Builder(new BigDecimal(AbstractC0711no.a(d3)), currency, 0);
    }
}
