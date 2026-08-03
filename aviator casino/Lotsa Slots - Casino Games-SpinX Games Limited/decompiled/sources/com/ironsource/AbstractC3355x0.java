package com.ironsource;

/* renamed from: com.ironsource.x0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3355x0 {
    public static final com.ironsource.AbstractC3355x0.a r = new com.ironsource.AbstractC3355x0.a(null);
    public static final int s = -1;

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3069h0 f6811a;
    private final boolean b;
    private final java.lang.String c;
    private final java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> d;
    private final com.ironsource.C3150la e;
    private final com.ironsource.C3267s2 f;
    private int g;
    private final int h;
    private boolean i;
    private final int j;
    private final int k;
    private final com.ironsource.O0 l;
    private final long m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private boolean q;

    /* renamed from: com.ironsource.x0$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <AdFormatConfig, AdUnitData> AdUnitData a(com.ironsource.C3069h0 adProperties, com.ironsource.Ua ua, kotlin.jvm.functions.Function1<? super com.ironsource.N3, ? extends AdFormatConfig> getAdFormatConfig, kotlin.jvm.functions.Function2<? super com.ironsource.C3337w0, ? super AdFormatConfig, ? extends AdUnitData> createAdUnitData) {
            java.util.List<com.ironsource.C3367xc> emptyList;
            com.ironsource.Ve d;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAdFormatConfig, "getAdFormatConfig");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createAdUnitData, "createAdUnitData");
            AdFormatConfig invoke = getAdFormatConfig.invoke((ua == null || (d = ua.d()) == null) ? null : d.c());
            if (invoke == null) {
                throw new java.lang.IllegalStateException("Error getting " + adProperties.a() + " configurations");
            }
            if (ua == null || (emptyList = ua.d(adProperties.e(), adProperties.c())) == null) {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            java.lang.String f = com.ironsource.mediationsdk.utils.IronSourceUtils.f();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(emptyList, 10));
            java.util.Iterator<T> it = emptyList.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.ironsource.C3367xc) it.next()).f());
            }
            com.ironsource.C3150la b = com.ironsource.C3150la.b();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "getInstance()");
            return createAdUnitData.invoke(new com.ironsource.C3337w0(f, arrayList, b), invoke);
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC3355x0(com.ironsource.C3069h0 adProperties, boolean z, java.lang.String str, java.util.List<? extends com.ironsource.mediationsdk.model.NetworkSettings> providerList, com.ironsource.C3150la publisherDataHolder, com.ironsource.C3267s2 auctionSettings, int i, int i2, boolean z2, int i3, int i4, com.ironsource.O0 loadingData, long j, boolean z3, boolean z4, boolean z5, boolean z6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerList, "providerList");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionSettings, "auctionSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadingData, "loadingData");
        this.f6811a = adProperties;
        this.b = z;
        this.c = str;
        this.d = providerList;
        this.e = publisherDataHolder;
        this.f = auctionSettings;
        this.g = i;
        this.h = i2;
        this.i = z2;
        this.j = i3;
        this.k = i4;
        this.l = loadingData;
        this.m = j;
        this.n = z3;
        this.o = z4;
        this.p = z5;
        this.q = z6;
    }

    public final void a(int i) {
        this.g = i;
    }

    public com.ironsource.C3069h0 b() {
        return this.f6811a;
    }

    public abstract org.json.JSONObject b(com.ironsource.mediationsdk.model.NetworkSettings networkSettings);

    public abstract java.lang.String c();

    public final boolean d() {
        return this.i;
    }

    public final com.ironsource.C3267s2 e() {
        return this.f;
    }

    public final long f() {
        return this.m;
    }

    public final int g() {
        return this.j;
    }

    public final int h() {
        return this.h;
    }

    public final com.ironsource.O0 i() {
        return this.l;
    }

    public abstract java.lang.String j();

    public final int k() {
        return this.g;
    }

    public final java.lang.String l() {
        java.lang.String c;
        com.ironsource.C3064gd f = b().f();
        return (f == null || (c = f.c()) == null) ? "" : c;
    }

    public final java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> m() {
        return this.d;
    }

    public final boolean n() {
        return this.n;
    }

    public final com.ironsource.C3150la o() {
        return this.e;
    }

    public final boolean p() {
        return this.p;
    }

    public final boolean q() {
        return this.q;
    }

    public final java.lang.String r() {
        return this.c;
    }

    public final boolean s() {
        return this.o;
    }

    public final boolean t() {
        return this.f.g() > 0;
    }

    public boolean u() {
        return this.b;
    }

    public final java.lang.String v() {
        java.lang.String format = java.lang.String.format(java.util.Locale.getDefault(), "%s: %d, %s: %b, %s: %b", com.ironsource.mediationsdk.d.x, java.lang.Integer.valueOf(this.g), com.ironsource.mediationsdk.d.y, java.lang.Boolean.valueOf(this.i), com.ironsource.mediationsdk.d.z, java.lang.Boolean.valueOf(this.q));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(\n          Locale…     showPriorityEnabled)");
        return format;
    }

    public final void a(boolean z) {
        this.i = z;
    }

    public final void b(boolean z) {
        this.q = z;
    }

    public final int a() {
        return this.k;
    }

    public final com.ironsource.mediationsdk.model.NetworkSettings a(java.lang.String instanceName) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        java.util.Iterator<T> it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.ironsource.mediationsdk.model.NetworkSettings) obj).getProviderInstanceName().equals(instanceName)) {
                break;
            }
        }
        return (com.ironsource.mediationsdk.model.NetworkSettings) obj;
    }

    public /* synthetic */ AbstractC3355x0(com.ironsource.C3069h0 c3069h0, boolean z, java.lang.String str, java.util.List list, com.ironsource.C3150la c3150la, com.ironsource.C3267s2 c3267s2, int i, int i2, boolean z2, int i3, int i4, com.ironsource.O0 o0, long j, boolean z3, boolean z4, boolean z5, boolean z6, int i5, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(c3069h0, z, str, list, c3150la, c3267s2, i, i2, z2, i3, i4, o0, j, z3, z4, z5, (i5 & 65536) != 0 ? false : z6);
    }

    public com.ironsource.mediationsdk.adunit.adapter.utility.AdData a(com.ironsource.mediationsdk.model.NetworkSettings providerSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        com.ironsource.mediationsdk.adunit.adapter.utility.AdData createAdDataForNetworkAdapter = com.ironsource.mediationsdk.adunit.adapter.utility.AdData.createAdDataForNetworkAdapter(b(providerSettings), b().a(), this.c);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createAdDataForNetworkAdapter, "createAdDataForNetworkAd…perties.adFormat, userId)");
        return createAdDataForNetworkAdapter;
    }
}
