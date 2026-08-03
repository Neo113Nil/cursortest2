package io.appmetrica.analytics.modulesapi.internal.client.adrevenue;

/* loaded from: classes.dex */
public final class ModuleAdRevenue {

    /* renamed from: a, reason: collision with root package name */
    private final java.math.BigDecimal f7279a;

    /* renamed from: b, reason: collision with root package name */
    private final java.util.Currency f7280b;

    /* renamed from: c, reason: collision with root package name */
    private final io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType f7281c;

    /* renamed from: d, reason: collision with root package name */
    private final java.lang.String f7282d;

    /* renamed from: e, reason: collision with root package name */
    private final java.lang.String f7283e;

    /* renamed from: f, reason: collision with root package name */
    private final java.lang.String f7284f;

    /* renamed from: g, reason: collision with root package name */
    private final java.lang.String f7285g;

    /* renamed from: h, reason: collision with root package name */
    private final java.lang.String f7286h;

    /* renamed from: i, reason: collision with root package name */
    private final java.lang.String f7287i;

    /* renamed from: j, reason: collision with root package name */
    private final java.util.Map f7288j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f7289k;

    public ModuleAdRevenue(java.math.BigDecimal bigDecimal, java.util.Currency currency, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType moduleAdType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.Map<java.lang.String, java.lang.String> map, boolean z2) {
        this.f7279a = bigDecimal;
        this.f7280b = currency;
        this.f7281c = moduleAdType;
        this.f7282d = str;
        this.f7283e = str2;
        this.f7284f = str3;
        this.f7285g = str4;
        this.f7286h = str5;
        this.f7287i = str6;
        this.f7288j = map;
        this.f7289k = z2;
    }

    public final java.lang.String getAdNetwork() {
        return this.f7282d;
    }

    public final java.lang.String getAdPlacementId() {
        return this.f7285g;
    }

    public final java.lang.String getAdPlacementName() {
        return this.f7286h;
    }

    public final java.math.BigDecimal getAdRevenue() {
        return this.f7279a;
    }

    public final io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType getAdType() {
        return this.f7281c;
    }

    public final java.lang.String getAdUnitId() {
        return this.f7283e;
    }

    public final java.lang.String getAdUnitName() {
        return this.f7284f;
    }

    public final boolean getAutoCollected() {
        return this.f7289k;
    }

    public final java.util.Currency getCurrency() {
        return this.f7280b;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getPayload() {
        return this.f7288j;
    }

    public final java.lang.String getPrecision() {
        return this.f7287i;
    }

    public /* synthetic */ ModuleAdRevenue(java.math.BigDecimal bigDecimal, java.util.Currency currency, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType moduleAdType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.Map map, boolean z2, int i2, kotlin.jvm.internal.e eVar) {
        this(bigDecimal, currency, (i2 & 4) != 0 ? null : moduleAdType, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : str5, (i2 & 256) != 0 ? null : str6, (i2 & 512) != 0 ? null : map, (i2 & 1024) != 0 ? true : z2);
    }
}
