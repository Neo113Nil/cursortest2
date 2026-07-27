package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.nm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0858nm {

    /* renamed from: A, reason: collision with root package name */
    public final Map f8872A;

    /* renamed from: B, reason: collision with root package name */
    public final I9 f8873B;

    /* renamed from: a, reason: collision with root package name */
    public final String f8874a;

    /* renamed from: b, reason: collision with root package name */
    public final List f8875b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8876c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8877d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8878e;

    /* renamed from: f, reason: collision with root package name */
    public final List f8879f;

    /* renamed from: g, reason: collision with root package name */
    public final List f8880g;

    /* renamed from: h, reason: collision with root package name */
    public final List f8881h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f8882i;

    /* renamed from: j, reason: collision with root package name */
    public final String f8883j;

    /* renamed from: k, reason: collision with root package name */
    public final String f8884k;

    /* renamed from: l, reason: collision with root package name */
    public final String f8885l;

    /* renamed from: m, reason: collision with root package name */
    public final C0969s4 f8886m;

    /* renamed from: n, reason: collision with root package name */
    public final long f8887n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f8888o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f8889p;

    /* renamed from: q, reason: collision with root package name */
    public final String f8890q;

    /* renamed from: r, reason: collision with root package name */
    public final Km f8891r;

    /* renamed from: s, reason: collision with root package name */
    public final De f8892s;

    /* renamed from: t, reason: collision with root package name */
    public final RetryPolicyConfig f8893t;

    /* renamed from: u, reason: collision with root package name */
    public final long f8894u;

    /* renamed from: v, reason: collision with root package name */
    public final long f8895v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f8896w;

    /* renamed from: x, reason: collision with root package name */
    public final C0787l3 f8897x;

    /* renamed from: y, reason: collision with root package name */
    public final C1019u2 f8898y;
    public final Gm z;

    public C0858nm(C0832mm c0832mm) {
        String str;
        long j2;
        long j6;
        Gm gm;
        Map map;
        I9 i9;
        this.f8874a = c0832mm.f8801a;
        List list = c0832mm.f8802b;
        this.f8875b = list == null ? null : CollectionUtils.unmodifiableListCopy(list);
        this.f8876c = c0832mm.f8803c;
        this.f8877d = c0832mm.f8804d;
        this.f8878e = c0832mm.f8805e;
        List list2 = c0832mm.f8806f;
        this.f8879f = list2 == null ? null : CollectionUtils.unmodifiableListCopy(list2);
        List list3 = c0832mm.f8807g;
        this.f8880g = list3 == null ? null : CollectionUtils.unmodifiableListCopy(list3);
        List list4 = c0832mm.f8808h;
        this.f8881h = list4 == null ? null : CollectionUtils.unmodifiableListCopy(list4);
        Map map2 = c0832mm.f8809i;
        this.f8882i = map2 != null ? CollectionUtils.unmodifiableMapCopy(map2) : null;
        this.f8883j = c0832mm.f8810j;
        this.f8884k = c0832mm.f8811k;
        this.f8886m = c0832mm.f8813m;
        this.f8892s = c0832mm.f8814n;
        this.f8887n = c0832mm.f8815o;
        this.f8888o = c0832mm.f8816p;
        this.f8885l = c0832mm.f8812l;
        this.f8889p = c0832mm.f8817q;
        str = c0832mm.f8818r;
        this.f8890q = str;
        this.f8891r = c0832mm.f8819s;
        j2 = c0832mm.f8820t;
        this.f8894u = j2;
        j6 = c0832mm.f8821u;
        this.f8895v = j6;
        this.f8896w = c0832mm.f8822v;
        RetryPolicyConfig retryPolicyConfig = c0832mm.f8823w;
        if (retryPolicyConfig == null) {
            Am am = new Am();
            this.f8893t = new RetryPolicyConfig(am.f6569w, am.f6570x);
        } else {
            this.f8893t = retryPolicyConfig;
        }
        this.f8897x = c0832mm.f8824x;
        this.f8898y = c0832mm.f8825y;
        gm = c0832mm.z;
        this.z = gm == null ? new Gm(O7.f7212b.f9604a) : c0832mm.z;
        map = c0832mm.f8799A;
        this.f8872A = map == null ? Collections.emptyMap() : c0832mm.f8799A;
        i9 = c0832mm.f8800B;
        this.f8873B = i9;
    }

    public final C0832mm a(C0969s4 c0969s4) {
        C0832mm c0832mm = new C0832mm(c0969s4);
        c0832mm.f8801a = this.f8874a;
        c0832mm.f8806f = this.f8879f;
        c0832mm.f8807g = this.f8880g;
        c0832mm.f8810j = this.f8883j;
        c0832mm.f8802b = this.f8875b;
        c0832mm.f8803c = this.f8876c;
        c0832mm.f8804d = this.f8877d;
        c0832mm.f8805e = this.f8878e;
        c0832mm.f8808h = this.f8881h;
        c0832mm.f8809i = this.f8882i;
        c0832mm.f8811k = this.f8884k;
        c0832mm.f8812l = this.f8885l;
        c0832mm.f8817q = this.f8889p;
        c0832mm.f8815o = this.f8887n;
        c0832mm.f8816p = this.f8888o;
        c0832mm.f8818r = this.f8890q;
        c0832mm.f8814n = this.f8892s;
        c0832mm.f8820t = this.f8894u;
        c0832mm.f8821u = this.f8895v;
        c0832mm.f8819s = this.f8891r;
        c0832mm.f8822v = this.f8896w;
        c0832mm.f8823w = this.f8893t;
        c0832mm.f8824x = this.f8897x;
        c0832mm.f8825y = this.f8898y;
        c0832mm.z = this.z;
        c0832mm.f8799A = this.f8872A;
        c0832mm.f8800B = this.f8873B;
        return c0832mm;
    }

    public final String toString() {
        return "StartupStateModel{uuid='" + this.f8874a + "', reportUrls=" + this.f8875b + ", getAdUrl='" + this.f8876c + "', reportAdUrl='" + this.f8877d + "', certificateUrl='" + this.f8878e + "', hostUrlsFromStartup=" + this.f8879f + ", hostUrlsFromClient=" + this.f8880g + ", diagnosticUrls=" + this.f8881h + ", customSdkHosts=" + this.f8882i + ", encodedClidsFromResponse='" + this.f8883j + "', lastClientClidsForStartupRequest='" + this.f8884k + "', lastChosenForRequestClids='" + this.f8885l + "', collectingFlags=" + this.f8886m + ", obtainTime=" + this.f8887n + ", hadFirstStartup=" + this.f8888o + ", startupDidNotOverrideClids=" + this.f8889p + ", countryInit='" + this.f8890q + "', statSending=" + this.f8891r + ", permissionsCollectingConfig=" + this.f8892s + ", retryPolicyConfig=" + this.f8893t + ", obtainServerTime=" + this.f8894u + ", firstStartupServerTime=" + this.f8895v + ", outdated=" + this.f8896w + ", cacheControl=" + this.f8897x + ", attributionConfig=" + this.f8898y + ", startupUpdateConfig=" + this.z + ", modulesRemoteConfigs=" + this.f8872A + ", externalAttributionConfig=" + this.f8873B + '}';
    }
}
