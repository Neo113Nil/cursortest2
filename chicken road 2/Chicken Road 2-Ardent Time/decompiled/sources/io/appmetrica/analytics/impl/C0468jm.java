package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.jm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0468jm {

    /* renamed from: A, reason: collision with root package name */
    public final java.util.Map f6213A;

    /* renamed from: B, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.B9 f6214B;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6215a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f6216b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f6217c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f6218d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f6219e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f6220f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f6221g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f6222h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f6223i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f6224j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f6225k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f6226l;

    /* renamed from: m, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0502l4 f6227m;

    /* renamed from: n, reason: collision with root package name */
    public final long f6228n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f6229o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f6230p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f6231q;

    /* renamed from: r, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Gm f6232r;

    /* renamed from: s, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0823xe f6233s;
    public final io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig t;

    /* renamed from: u, reason: collision with root package name */
    public final long f6234u;

    /* renamed from: v, reason: collision with root package name */
    public final long f6235v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f6236w;

    /* renamed from: x, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0295d3 f6237x;

    /* renamed from: y, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0526m2 f6238y;

    /* renamed from: z, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Cm f6239z;

    public C0468jm(io.appmetrica.analytics.impl.C0442im c0442im) {
        java.lang.String str;
        long j2;
        long j3;
        io.appmetrica.analytics.impl.Cm cm;
        java.util.Map map;
        io.appmetrica.analytics.impl.B9 b9;
        this.f6215a = c0442im.f6112a;
        java.util.List list = c0442im.f6113b;
        this.f6216b = list == null ? null : io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.unmodifiableListCopy(list);
        this.f6217c = c0442im.f6114c;
        this.f6218d = c0442im.f6115d;
        this.f6219e = c0442im.f6116e;
        java.util.List list2 = c0442im.f6117f;
        this.f6220f = list2 == null ? null : io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.unmodifiableListCopy(list2);
        java.util.List list3 = c0442im.f6118g;
        this.f6221g = list3 == null ? null : io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.unmodifiableListCopy(list3);
        java.util.List list4 = c0442im.f6119h;
        this.f6222h = list4 == null ? null : io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.unmodifiableListCopy(list4);
        java.util.Map map2 = c0442im.f6120i;
        this.f6223i = map2 != null ? io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.unmodifiableMapCopy(map2) : null;
        this.f6224j = c0442im.f6121j;
        this.f6225k = c0442im.f6122k;
        this.f6227m = c0442im.f6124m;
        this.f6233s = c0442im.f6125n;
        this.f6228n = c0442im.f6126o;
        this.f6229o = c0442im.f6127p;
        this.f6226l = c0442im.f6123l;
        this.f6230p = c0442im.f6128q;
        str = c0442im.f6129r;
        this.f6231q = str;
        this.f6232r = c0442im.f6130s;
        j2 = c0442im.t;
        this.f6234u = j2;
        j3 = c0442im.f6131u;
        this.f6235v = j3;
        this.f6236w = c0442im.f6132v;
        io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig retryPolicyConfig = c0442im.f6133w;
        if (retryPolicyConfig == null) {
            io.appmetrica.analytics.impl.C0805wm c0805wm = new io.appmetrica.analytics.impl.C0805wm();
            this.t = new io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig(c0805wm.f7060w, c0805wm.f7061x);
        } else {
            this.t = retryPolicyConfig;
        }
        this.f6237x = c0442im.f6134x;
        this.f6238y = c0442im.f6135y;
        cm = c0442im.f6136z;
        this.f6239z = cm == null ? new io.appmetrica.analytics.impl.Cm(io.appmetrica.analytics.impl.I7.f4443b.f6934a) : c0442im.f6136z;
        map = c0442im.f6110A;
        this.f6213A = map == null ? java.util.Collections.emptyMap() : c0442im.f6110A;
        b9 = c0442im.f6111B;
        this.f6214B = b9;
    }

    public final io.appmetrica.analytics.impl.C0442im a(io.appmetrica.analytics.impl.C0502l4 c0502l4) {
        io.appmetrica.analytics.impl.C0442im c0442im = new io.appmetrica.analytics.impl.C0442im(c0502l4);
        c0442im.f6112a = this.f6215a;
        c0442im.f6117f = this.f6220f;
        c0442im.f6118g = this.f6221g;
        c0442im.f6121j = this.f6224j;
        c0442im.f6113b = this.f6216b;
        c0442im.f6114c = this.f6217c;
        c0442im.f6115d = this.f6218d;
        c0442im.f6116e = this.f6219e;
        c0442im.f6119h = this.f6222h;
        c0442im.f6120i = this.f6223i;
        c0442im.f6122k = this.f6225k;
        c0442im.f6123l = this.f6226l;
        c0442im.f6128q = this.f6230p;
        c0442im.f6126o = this.f6228n;
        c0442im.f6127p = this.f6229o;
        c0442im.f6129r = this.f6231q;
        c0442im.f6125n = this.f6233s;
        c0442im.t = this.f6234u;
        c0442im.f6131u = this.f6235v;
        c0442im.f6130s = this.f6232r;
        c0442im.f6132v = this.f6236w;
        c0442im.f6133w = this.t;
        c0442im.f6134x = this.f6237x;
        c0442im.f6135y = this.f6238y;
        c0442im.f6136z = this.f6239z;
        c0442im.f6110A = this.f6213A;
        c0442im.f6111B = this.f6214B;
        return c0442im;
    }

    public final java.lang.String toString() {
        return "StartupStateModel{uuid='" + this.f6215a + "', reportUrls=" + this.f6216b + ", getAdUrl='" + this.f6217c + "', reportAdUrl='" + this.f6218d + "', certificateUrl='" + this.f6219e + "', hostUrlsFromStartup=" + this.f6220f + ", hostUrlsFromClient=" + this.f6221g + ", diagnosticUrls=" + this.f6222h + ", customSdkHosts=" + this.f6223i + ", encodedClidsFromResponse='" + this.f6224j + "', lastClientClidsForStartupRequest='" + this.f6225k + "', lastChosenForRequestClids='" + this.f6226l + "', collectingFlags=" + this.f6227m + ", obtainTime=" + this.f6228n + ", hadFirstStartup=" + this.f6229o + ", startupDidNotOverrideClids=" + this.f6230p + ", countryInit='" + this.f6231q + "', statSending=" + this.f6232r + ", permissionsCollectingConfig=" + this.f6233s + ", retryPolicyConfig=" + this.t + ", obtainServerTime=" + this.f6234u + ", firstStartupServerTime=" + this.f6235v + ", outdated=" + this.f6236w + ", cacheControl=" + this.f6237x + ", attributionConfig=" + this.f6238y + ", startupUpdateConfig=" + this.f6239z + ", modulesRemoteConfigs=" + this.f6213A + ", externalAttributionConfig=" + this.f6214B + '}';
    }
}
