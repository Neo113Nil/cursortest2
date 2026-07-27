package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.nm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0709nm {

    /* renamed from: A, reason: collision with root package name */
    public final Map f7942A;

    /* renamed from: B, reason: collision with root package name */
    public final I9 f7943B;

    /* renamed from: a, reason: collision with root package name */
    public final String f7944a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7945b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7946c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7947d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7948e;
    public final List f;

    /* renamed from: g, reason: collision with root package name */
    public final List f7949g;

    /* renamed from: h, reason: collision with root package name */
    public final List f7950h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f7951i;

    /* renamed from: j, reason: collision with root package name */
    public final String f7952j;

    /* renamed from: k, reason: collision with root package name */
    public final String f7953k;

    /* renamed from: l, reason: collision with root package name */
    public final String f7954l;

    /* renamed from: m, reason: collision with root package name */
    public final C0820s4 f7955m;

    /* renamed from: n, reason: collision with root package name */
    public final long f7956n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f7957o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f7958p;

    /* renamed from: q, reason: collision with root package name */
    public final String f7959q;

    /* renamed from: r, reason: collision with root package name */
    public final Km f7960r;

    /* renamed from: s, reason: collision with root package name */
    public final De f7961s;

    /* renamed from: t, reason: collision with root package name */
    public final RetryPolicyConfig f7962t;

    /* renamed from: u, reason: collision with root package name */
    public final long f7963u;

    /* renamed from: v, reason: collision with root package name */
    public final long f7964v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f7965w;

    /* renamed from: x, reason: collision with root package name */
    public final C0638l3 f7966x;
    public final C0870u2 y;

    /* renamed from: z, reason: collision with root package name */
    public final Gm f7967z;

    public C0709nm(C0683mm c0683mm) {
        String str;
        long j3;
        long j4;
        Gm gm;
        Map map;
        I9 i9;
        this.f7944a = c0683mm.f7874a;
        List list = c0683mm.f7875b;
        this.f7945b = list == null ? null : CollectionUtils.unmodifiableListCopy(list);
        this.f7946c = c0683mm.f7876c;
        this.f7947d = c0683mm.f7877d;
        this.f7948e = c0683mm.f7878e;
        List list2 = c0683mm.f;
        this.f = list2 == null ? null : CollectionUtils.unmodifiableListCopy(list2);
        List list3 = c0683mm.f7879g;
        this.f7949g = list3 == null ? null : CollectionUtils.unmodifiableListCopy(list3);
        List list4 = c0683mm.f7880h;
        this.f7950h = list4 == null ? null : CollectionUtils.unmodifiableListCopy(list4);
        Map map2 = c0683mm.f7881i;
        this.f7951i = map2 != null ? CollectionUtils.unmodifiableMapCopy(map2) : null;
        this.f7952j = c0683mm.f7882j;
        this.f7953k = c0683mm.f7883k;
        this.f7955m = c0683mm.f7885m;
        this.f7961s = c0683mm.f7886n;
        this.f7956n = c0683mm.f7887o;
        this.f7957o = c0683mm.f7888p;
        this.f7954l = c0683mm.f7884l;
        this.f7958p = c0683mm.f7889q;
        str = c0683mm.f7890r;
        this.f7959q = str;
        this.f7960r = c0683mm.f7891s;
        j3 = c0683mm.f7892t;
        this.f7963u = j3;
        j4 = c0683mm.f7893u;
        this.f7964v = j4;
        this.f7965w = c0683mm.f7894v;
        RetryPolicyConfig retryPolicyConfig = c0683mm.f7895w;
        if (retryPolicyConfig == null) {
            Am am = new Am();
            this.f7962t = new RetryPolicyConfig(am.f5737w, am.f5738x);
        } else {
            this.f7962t = retryPolicyConfig;
        }
        this.f7966x = c0683mm.f7896x;
        this.y = c0683mm.y;
        gm = c0683mm.f7897z;
        this.f7967z = gm == null ? new Gm(O7.f6353b.f8645a) : c0683mm.f7897z;
        map = c0683mm.f7872A;
        this.f7942A = map == null ? Collections.EMPTY_MAP : c0683mm.f7872A;
        i9 = c0683mm.f7873B;
        this.f7943B = i9;
    }

    public final C0683mm a(C0820s4 c0820s4) {
        C0683mm c0683mm = new C0683mm(c0820s4);
        c0683mm.f7874a = this.f7944a;
        c0683mm.f = this.f;
        c0683mm.f7879g = this.f7949g;
        c0683mm.f7882j = this.f7952j;
        c0683mm.f7875b = this.f7945b;
        c0683mm.f7876c = this.f7946c;
        c0683mm.f7877d = this.f7947d;
        c0683mm.f7878e = this.f7948e;
        c0683mm.f7880h = this.f7950h;
        c0683mm.f7881i = this.f7951i;
        c0683mm.f7883k = this.f7953k;
        c0683mm.f7884l = this.f7954l;
        c0683mm.f7889q = this.f7958p;
        c0683mm.f7887o = this.f7956n;
        c0683mm.f7888p = this.f7957o;
        c0683mm.f7890r = this.f7959q;
        c0683mm.f7886n = this.f7961s;
        c0683mm.f7892t = this.f7963u;
        c0683mm.f7893u = this.f7964v;
        c0683mm.f7891s = this.f7960r;
        c0683mm.f7894v = this.f7965w;
        c0683mm.f7895w = this.f7962t;
        c0683mm.f7896x = this.f7966x;
        c0683mm.y = this.y;
        c0683mm.f7897z = this.f7967z;
        c0683mm.f7872A = this.f7942A;
        c0683mm.f7873B = this.f7943B;
        return c0683mm;
    }

    public final String toString() {
        return "StartupStateModel{uuid='" + this.f7944a + "', reportUrls=" + this.f7945b + ", getAdUrl='" + this.f7946c + "', reportAdUrl='" + this.f7947d + "', certificateUrl='" + this.f7948e + "', hostUrlsFromStartup=" + this.f + ", hostUrlsFromClient=" + this.f7949g + ", diagnosticUrls=" + this.f7950h + ", customSdkHosts=" + this.f7951i + ", encodedClidsFromResponse='" + this.f7952j + "', lastClientClidsForStartupRequest='" + this.f7953k + "', lastChosenForRequestClids='" + this.f7954l + "', collectingFlags=" + this.f7955m + ", obtainTime=" + this.f7956n + ", hadFirstStartup=" + this.f7957o + ", startupDidNotOverrideClids=" + this.f7958p + ", countryInit='" + this.f7959q + "', statSending=" + this.f7960r + ", permissionsCollectingConfig=" + this.f7961s + ", retryPolicyConfig=" + this.f7962t + ", obtainServerTime=" + this.f7963u + ", firstStartupServerTime=" + this.f7964v + ", outdated=" + this.f7965w + ", cacheControl=" + this.f7966x + ", attributionConfig=" + this.y + ", startupUpdateConfig=" + this.f7967z + ", modulesRemoteConfigs=" + this.f7942A + ", externalAttributionConfig=" + this.f7943B + '}';
    }
}
