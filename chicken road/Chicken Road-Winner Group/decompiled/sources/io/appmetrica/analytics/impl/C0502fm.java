package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.fm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0502fm extends U5 {

    /* renamed from: d, reason: collision with root package name */
    public List f7300d;

    /* renamed from: e, reason: collision with root package name */
    public List f7301e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public String f7302g;

    /* renamed from: h, reason: collision with root package name */
    public Map f7303h;

    /* renamed from: i, reason: collision with root package name */
    public C0999z3 f7304i;

    /* renamed from: j, reason: collision with root package name */
    public List f7305j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7306k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7307l;

    /* renamed from: m, reason: collision with root package name */
    public String f7308m;

    /* renamed from: n, reason: collision with root package name */
    public long f7309n;

    /* renamed from: o, reason: collision with root package name */
    public final C0781qg f7310o;

    /* renamed from: p, reason: collision with root package name */
    public final N7 f7311p;

    public C0502fm() {
        this(C0878ua.k().u(), new N7());
    }

    public final long a(long j3) {
        if (this.f7309n == 0) {
            this.f7309n = j3;
        }
        return this.f7309n;
    }

    public final C0999z3 c() {
        return this.f7304i;
    }

    public final Map<String, String> d() {
        return this.f7303h;
    }

    public final String e() {
        return this.f7308m;
    }

    public final String f() {
        return this.f;
    }

    public final long g() {
        return this.f7309n;
    }

    public final String h() {
        return this.f7302g;
    }

    public final List<String> i() {
        return this.f7305j;
    }

    public final C0781qg j() {
        return this.f7310o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r4 != null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<String> k() {
        ArrayList arrayList;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!AbstractC0711no.a((Collection) this.f7300d)) {
            linkedHashSet.addAll(this.f7300d);
        }
        if (!AbstractC0711no.a((Collection) this.f7301e)) {
            linkedHashSet.addAll(this.f7301e);
        }
        String[] strArr = (String[]) this.f7311p.f6314a.a();
        if (strArr != null) {
            arrayList = new ArrayList();
            for (String str : strArr) {
                if (str == null || v2.m.n0(str)) {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
        }
        String[] strArr2 = BuildConfig.DEFAULT_HOSTS;
        arrayList = new ArrayList();
        for (String str2 : strArr2) {
            if (str2 == null || v2.m.n0(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        linkedHashSet.addAll(arrayList);
        return new ArrayList(linkedHashSet);
    }

    public final List<String> l() {
        return this.f7301e;
    }

    public final List<String> m() {
        return this.f7300d;
    }

    public final boolean n() {
        return this.f7306k;
    }

    public final boolean o() {
        return this.f7307l;
    }

    @Override // io.appmetrica.analytics.impl.U5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "StartupRequestConfig{mStartupHostsFromStartup=" + this.f7300d + ", mStartupHostsFromClient=" + this.f7301e + ", mDistributionReferrer='" + this.f + "', mInstallReferrerSource='" + this.f7302g + "', mClidsFromClient=" + this.f7303h + ", mNewCustomHosts=" + this.f7305j + ", mHasNewCustomHosts=" + this.f7306k + ", mSuccessfulStartup=" + this.f7307l + ", mCountryInit='" + this.f7308m + "', mFirstStartupTime=" + this.f7309n + "} " + super.toString();
    }

    public C0502fm(C0781qg c0781qg, N7 n7) {
        this.f7304i = new C0999z3(null, Y7.f6854c);
        this.f7309n = 0L;
        this.f7310o = c0781qg;
        this.f7311p = n7;
    }

    public final void a(List<String> list) {
        this.f7305j = list;
    }

    public final void a(boolean z3) {
        this.f7306k = z3;
    }

    public final void a(String str) {
        this.f7308m = str;
    }
}
