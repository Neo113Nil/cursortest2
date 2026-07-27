package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.v4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0898v4 implements ArgumentsMerger {

    /* renamed from: a, reason: collision with root package name */
    public final String f8473a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f8474b;

    /* renamed from: c, reason: collision with root package name */
    public final Location f8475c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f8476d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f8477e;
    public final Integer f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f8478g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f8479h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f8480i;

    /* renamed from: j, reason: collision with root package name */
    public final Map<String, String> f8481j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f8482k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f8483l;

    /* renamed from: m, reason: collision with root package name */
    public final Boolean f8484m;

    /* renamed from: n, reason: collision with root package name */
    public final Boolean f8485n;

    /* renamed from: o, reason: collision with root package name */
    public final Set<String> f8486o;

    public C0898v4(String str, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4, Boolean bool5, Boolean bool6, Boolean bool7, Set set) {
        this.f8473a = str;
        this.f8474b = bool;
        this.f8475c = location;
        this.f8476d = bool2;
        this.f8477e = num;
        this.f = num2;
        this.f8478g = num3;
        this.f8479h = bool3;
        this.f8480i = bool4;
        this.f8481j = map;
        this.f8482k = num4;
        this.f8483l = bool5;
        this.f8484m = bool6;
        this.f8485n = bool7;
        this.f8486o = set;
    }

    public final boolean a(C0898v4 c0898v4) {
        return equals(c0898v4);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0898v4 mergeFrom(C0898v4 c0898v4) {
        return new C0898v4((String) WrapUtils.getOrDefaultNullable(this.f8473a, c0898v4.f8473a), (Boolean) WrapUtils.getOrDefaultNullable(this.f8474b, c0898v4.f8474b), (Location) WrapUtils.getOrDefaultNullable(this.f8475c, c0898v4.f8475c), (Boolean) WrapUtils.getOrDefaultNullable(this.f8476d, c0898v4.f8476d), (Integer) WrapUtils.getOrDefaultNullable(this.f8477e, c0898v4.f8477e), (Integer) WrapUtils.getOrDefaultNullable(this.f, c0898v4.f), (Integer) WrapUtils.getOrDefaultNullable(this.f8478g, c0898v4.f8478g), (Boolean) WrapUtils.getOrDefaultNullable(this.f8479h, c0898v4.f8479h), (Boolean) WrapUtils.getOrDefaultNullable(this.f8480i, c0898v4.f8480i), (Map) WrapUtils.getOrDefaultNullable(this.f8481j, c0898v4.f8481j), (Integer) WrapUtils.getOrDefaultNullable(this.f8482k, c0898v4.f8482k), (Boolean) WrapUtils.getOrDefaultNullable(this.f8483l, c0898v4.f8483l), (Boolean) WrapUtils.getOrDefaultNullable(this.f8484m, c0898v4.f8484m), (Boolean) WrapUtils.getOrDefaultNullable(this.f8485n, c0898v4.f8485n), CollectionUtils.merge(this.f8486o, c0898v4.f8486o));
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(Object obj) {
        return equals((C0898v4) obj);
    }

    public final boolean equals(Object obj) {
        if (obj != null && C0898v4.class == obj.getClass()) {
            C0898v4 c0898v4 = (C0898v4) obj;
            if (Objects.equals(this.f8473a, c0898v4.f8473a) && Objects.equals(this.f8474b, c0898v4.f8474b) && Objects.equals(this.f8475c, c0898v4.f8475c) && Objects.equals(this.f8476d, c0898v4.f8476d) && Objects.equals(this.f8477e, c0898v4.f8477e) && Objects.equals(this.f, c0898v4.f) && Objects.equals(this.f8478g, c0898v4.f8478g) && Objects.equals(this.f8479h, c0898v4.f8479h) && Objects.equals(this.f8480i, c0898v4.f8480i) && Objects.equals(this.f8481j, c0898v4.f8481j) && Objects.equals(this.f8482k, c0898v4.f8482k) && Objects.equals(this.f8483l, c0898v4.f8483l) && Objects.equals(this.f8484m, c0898v4.f8484m) && Objects.equals(this.f8485n, c0898v4.f8485n) && Objects.equals(this.f8486o, c0898v4.f8486o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f8473a, this.f8474b, this.f8475c, this.f8476d, this.f8477e, this.f, this.f8478g, this.f8479h, this.f8480i, this.f8481j, this.f8482k, this.f8483l, this.f8484m, this.f8485n, this.f8486o);
    }

    public final String toString() {
        return "ReporterArguments{apiKey='" + this.f8473a + "', locationTracking=" + this.f8474b + ", manualLocation=" + this.f8475c + ", firstActivationAsUpdate=" + this.f8476d + ", sessionTimeout=" + this.f8477e + ", maxReportsCount=" + this.f + ", dispatchPeriod=" + this.f8478g + ", logEnabled=" + this.f8479h + ", dataSendingEnabled=" + this.f8480i + ", clidsFromClient=" + this.f8481j + ", maxReportsInDbCount=" + this.f8482k + ", nativeCrashesEnabled=" + this.f8483l + ", revenueAutoTrackingEnabled=" + this.f8484m + ", advIdentifiersTrackingEnabled=" + this.f8485n + ", autoCollectedDataSubscribers=" + this.f8486o + '}';
    }

    public C0898v4(CounterConfiguration counterConfiguration, Map<String, String> map) {
        this(counterConfiguration.getApiKey(), counterConfiguration.isLocationTrackingEnabled(), counterConfiguration.getManualLocation(), counterConfiguration.isFirstActivationAsUpdate(), counterConfiguration.getSessionTimeout(), counterConfiguration.getMaxReportsCount(), counterConfiguration.getDispatchPeriod(), counterConfiguration.isLogEnabled(), counterConfiguration.getDataSendingEnabled(), map, counterConfiguration.getMaxReportsInDbCount(), counterConfiguration.getReportNativeCrashesEnabled(), counterConfiguration.isRevenueAutoTrackingEnabled(), counterConfiguration.isAdvIdentifiersTrackingEnabled(), new HashSet(counterConfiguration.getAutoCollectedDataSubscribers()));
    }

    public C0898v4() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, new HashSet());
    }
}
