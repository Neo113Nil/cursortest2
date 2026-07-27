package com.ironsource.mediationsdk;

import com.ironsource.C4293aa;
import com.ironsource.C4436h2;
import com.ironsource.Z1;
import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final IronSource.a f8410a;
    private final ArrayList<C4436h2> b;
    private boolean c;
    private String d;
    private boolean e;
    private Map<String, Object> f;
    private List<String> g;
    private int h;
    private Z1 i;
    private C4293aa j;
    private String k;
    private ISBannerSize l;
    private boolean m;
    private boolean n;
    private boolean o;
    private String p;
    private String q;
    private Boolean r;
    private Double s;
    private String t;

    public h(IronSource.a adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f8410a = adUnit;
        this.b = new ArrayList<>();
        this.d = "";
        this.f = new HashMap();
        this.g = new ArrayList();
        this.h = -1;
        this.k = "";
    }

    @Deprecated(message = "Use instancesInfo instead")
    public static /* synthetic */ void i() {
    }

    @Deprecated(message = "Use instancesInfo instead")
    public static /* synthetic */ void m() {
    }

    public final IronSource.a a() {
        return this.f8410a;
    }

    public final void b(boolean z) {
        this.e = z;
    }

    public final IronSource.a c() {
        return this.f8410a;
    }

    public final void d(boolean z) {
        this.n = z;
    }

    public final Z1 e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f8410a == ((h) obj).f8410a;
    }

    public final ISBannerSize f() {
        return this.l;
    }

    public final Double g() {
        return this.s;
    }

    public final Map<String, Object> h() {
        return this.f;
    }

    public int hashCode() {
        return this.f8410a.hashCode();
    }

    public final String j() {
        return this.d;
    }

    public final ArrayList<C4436h2> k() {
        return this.b;
    }

    public final List<String> l() {
        return this.g;
    }

    public final String n() {
        return this.t;
    }

    public final C4293aa o() {
        return this.j;
    }

    public final int p() {
        return this.h;
    }

    public final boolean q() {
        return this.n;
    }

    public final boolean r() {
        return this.o;
    }

    public final String s() {
        return this.k;
    }

    public final boolean t() {
        return this.m;
    }

    public String toString() {
        return "AuctionRequestParams(adUnit=" + this.f8410a + ")";
    }

    public final boolean u() {
        return this.e;
    }

    public final Boolean v() {
        return this.r;
    }

    public final boolean w() {
        return this.c;
    }

    public final h a(IronSource.a adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return new h(adUnit);
    }

    public final void b(String str) {
        this.p = str;
    }

    public final void c(boolean z) {
        this.c = z;
    }

    public final String d() {
        return this.p;
    }

    public final void e(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.k = str;
    }

    public static /* synthetic */ h a(h hVar, IronSource.a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = hVar.f8410a;
        }
        return hVar.a(aVar);
    }

    public final String b() {
        return this.q;
    }

    public final void c(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.d = str;
    }

    public final void d(String str) {
        this.t = str;
    }

    public final void e(boolean z) {
        this.o = z;
    }

    public final void a(C4436h2 instanceInfo) {
        Intrinsics.checkNotNullParameter(instanceInfo, "instanceInfo");
        this.b.add(instanceInfo);
    }

    public final void a(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f = map;
    }

    public final void a(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.g = list;
    }

    public final void a(int i) {
        this.h = i;
    }

    public final void a(Z1 z1) {
        this.i = z1;
    }

    public final void a(C4293aa c4293aa) {
        this.j = c4293aa;
    }

    public final void a(ISBannerSize iSBannerSize) {
        this.l = iSBannerSize;
    }

    public final void a(boolean z) {
        this.m = z;
    }

    public final void a(String str) {
        this.q = str;
    }

    public final void a(Boolean bool) {
        this.r = bool;
    }

    public final void a(Double d) {
        this.s = d;
    }
}
