package com.chartboost.sdk.impl;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.chartboost.sdk.impl.x2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class d0 {
    public final String A;
    public final boolean B;

    /* renamed from: a, reason: collision with root package name */
    public String f4721a;
    public String b;
    public final String c;
    public String d;
    public final na e;
    public String f;
    public String g;
    public String h;
    public final Map i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public int o;
    public String p;
    public String q;
    public t1 r;
    public final Map s;
    public final yf t;
    public final List u;
    public final Map v;
    public final String w;
    public final String x;
    public final bc y;
    public final i4 z;

    public d0(String name, String adId, String baseUrl, String impressionId, na infoIcon, String cgn, String creative, String mediaType, Map assets, String videoUrl, String videoFilename, String link, String deepLink, String to, int i, String rewardCurrency, String template, t1 body, Map parameters, yf renderingEngine, List scripts, Map events, String adm, String templateParams, bc mtype, i4 clkp, String decodedAdm) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
        Intrinsics.checkNotNullParameter(cgn, "cgn");
        Intrinsics.checkNotNullParameter(creative, "creative");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        Intrinsics.checkNotNullParameter(videoFilename, "videoFilename");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        Intrinsics.checkNotNullParameter(to, "to");
        Intrinsics.checkNotNullParameter(rewardCurrency, "rewardCurrency");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(renderingEngine, "renderingEngine");
        Intrinsics.checkNotNullParameter(scripts, "scripts");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(templateParams, "templateParams");
        Intrinsics.checkNotNullParameter(mtype, "mtype");
        Intrinsics.checkNotNullParameter(clkp, "clkp");
        Intrinsics.checkNotNullParameter(decodedAdm, "decodedAdm");
        this.f4721a = name;
        this.b = adId;
        this.c = baseUrl;
        this.d = impressionId;
        this.e = infoIcon;
        this.f = cgn;
        this.g = creative;
        this.h = mediaType;
        this.i = assets;
        this.j = videoUrl;
        this.k = videoFilename;
        this.l = link;
        this.m = deepLink;
        this.n = to;
        this.o = i;
        this.p = rewardCurrency;
        this.q = template;
        this.r = body;
        this.s = parameters;
        this.t = renderingEngine;
        this.u = scripts;
        this.v = events;
        this.w = adm;
        this.x = templateParams;
        this.y = mtype;
        this.z = clkp;
        this.A = decodedAdm;
        this.B = videoUrl.length() > 0 && this.k.length() > 0;
    }

    public final String A() {
        return this.n;
    }

    public final String B() {
        return this.k;
    }

    public final String C() {
        return this.j;
    }

    public final boolean D() {
        return this.B;
    }

    public final Map E() {
        Map map = this.s;
        Map map2 = this.i;
        ArrayList arrayList = new ArrayList(map2.size());
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            t1 t1Var = (t1) entry.getValue();
            arrayList.add(TuplesKt.to(str, t1Var.f5012a + "/" + t1Var.b));
        }
        return MapsKt.plus(map, arrayList);
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.A.length() == 0 ? "" : StringsKt.contains((CharSequence) this.A, (CharSequence) "<VAST ", true) ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.f : "Inline";
    }

    public final String c() {
        return this.w;
    }

    public final Map d() {
        return this.i;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.areEqual(this.f4721a, d0Var.f4721a) && Intrinsics.areEqual(this.b, d0Var.b) && Intrinsics.areEqual(this.c, d0Var.c) && Intrinsics.areEqual(this.d, d0Var.d) && Intrinsics.areEqual(this.e, d0Var.e) && Intrinsics.areEqual(this.f, d0Var.f) && Intrinsics.areEqual(this.g, d0Var.g) && Intrinsics.areEqual(this.h, d0Var.h) && Intrinsics.areEqual(this.i, d0Var.i) && Intrinsics.areEqual(this.j, d0Var.j) && Intrinsics.areEqual(this.k, d0Var.k) && Intrinsics.areEqual(this.l, d0Var.l) && Intrinsics.areEqual(this.m, d0Var.m) && Intrinsics.areEqual(this.n, d0Var.n) && this.o == d0Var.o && Intrinsics.areEqual(this.p, d0Var.p) && Intrinsics.areEqual(this.q, d0Var.q) && Intrinsics.areEqual(this.r, d0Var.r) && Intrinsics.areEqual(this.s, d0Var.s) && this.t == d0Var.t && Intrinsics.areEqual(this.u, d0Var.u) && Intrinsics.areEqual(this.v, d0Var.v) && Intrinsics.areEqual(this.w, d0Var.w) && Intrinsics.areEqual(this.x, d0Var.x) && this.y == d0Var.y && this.z == d0Var.z && Intrinsics.areEqual(this.A, d0Var.A);
    }

    public final t1 f() {
        return this.r;
    }

    public final String g() {
        return this.f;
    }

    public final i4 h() {
        return this.z;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((this.f4721a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + Integer.hashCode(this.o)) * 31) + this.p.hashCode()) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31) + this.s.hashCode()) * 31) + this.t.hashCode()) * 31) + this.u.hashCode()) * 31) + this.v.hashCode()) * 31) + this.w.hashCode()) * 31) + this.x.hashCode()) * 31) + this.y.hashCode()) * 31) + this.z.hashCode()) * 31) + this.A.hashCode();
    }

    public final String i() {
        return this.g;
    }

    public final String j() {
        return this.A;
    }

    public final String k() {
        return this.m;
    }

    public final Map l() {
        return this.v;
    }

    public final String m() {
        return this.d;
    }

    public final na n() {
        return this.e;
    }

    public final String o() {
        return this.l;
    }

    public final String p() {
        return this.h;
    }

    public final bc q() {
        return this.y;
    }

    public final String r() {
        return this.f4721a;
    }

    public final Map s() {
        return this.s;
    }

    public final String t() {
        JSONObject a2 = x2.a(new x2.a[0]);
        for (Map.Entry entry : E().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Intrinsics.checkNotNull(a2);
            y2.a(a2, str, str2);
        }
        String jSONObject = a2.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return jSONObject;
    }

    public String toString() {
        return "AdUnit(name=" + this.f4721a + ", adId=" + this.b + ", baseUrl=" + this.c + ", impressionId=" + this.d + ", infoIcon=" + this.e + ", cgn=" + this.f + ", creative=" + this.g + ", mediaType=" + this.h + ", assets=" + this.i + ", videoUrl=" + this.j + ", videoFilename=" + this.k + ", link=" + this.l + ", deepLink=" + this.m + ", to=" + this.n + ", rewardAmount=" + this.o + ", rewardCurrency=" + this.p + ", template=" + this.q + ", body=" + this.r + ", parameters=" + this.s + ", renderingEngine=" + this.t + ", scripts=" + this.u + ", events=" + this.v + ", adm=" + this.w + ", templateParams=" + this.x + ", mtype=" + this.y + ", clkp=" + this.z + ", decodedAdm=" + this.A + ")";
    }

    public final yf u() {
        return this.t;
    }

    public final int v() {
        return this.o;
    }

    public final String w() {
        return this.p;
    }

    public final List x() {
        return this.u;
    }

    public final String y() {
        return this.q;
    }

    public final String z() {
        return this.x;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ d0(String str, String str2, String str3, String str4, na naVar, String str5, String str6, String str7, Map map, String str8, String str9, String str10, String str11, String str12, int i, String str13, String str14, t1 t1Var, Map map2, yf yfVar, List list, Map map3, String str15, String str16, bc bcVar, i4 i4Var, String str17, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r57, r18, r16, r17, r15, (i2 & 262144) != 0 ? new HashMap() : map2, (i2 & 524288) != 0 ? yf.g : yfVar, (i2 & 1048576) != 0 ? CollectionsKt.emptyList() : list, (i2 & 2097152) != 0 ? new HashMap() : map3, (i2 & 4194304) != 0 ? "" : str15, (i2 & 8388608) != 0 ? "" : str16, (i2 & 16777216) != 0 ? bc.c : bcVar, (i2 & 33554432) != 0 ? i4.d : i4Var, (i2 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 0 ? str17 : "");
        int i3;
        t1 t1Var2;
        String str18 = (i2 & 1) != 0 ? "" : str;
        String str19 = (i2 & 2) != 0 ? "" : str2;
        String str20 = (i2 & 4) != 0 ? "https://live.chartboost.com" : str3;
        String str21 = (i2 & 8) != 0 ? "" : str4;
        na naVar2 = (i2 & 16) != 0 ? new na(null, null, null, null, null, null, 63, null) : naVar;
        String str22 = (i2 & 32) != 0 ? "" : str5;
        String str23 = (i2 & 64) != 0 ? "" : str6;
        String str24 = (i2 & 128) != 0 ? "" : str7;
        Map hashMap = (i2 & 256) != 0 ? new HashMap() : map;
        String str25 = (i2 & 512) != 0 ? "" : str8;
        String str26 = (i2 & 1024) != 0 ? "" : str9;
        String str27 = (i2 & 2048) != 0 ? "" : str10;
        String str28 = (i2 & 4096) != 0 ? "" : str11;
        String str29 = (i2 & 8192) != 0 ? "" : str12;
        int i4 = (i2 & 16384) != 0 ? 0 : i;
        String str30 = (i2 & 32768) != 0 ? "" : str13;
        String str31 = (i2 & 65536) != 0 ? "" : str14;
        if ((i2 & 131072) != 0) {
            i3 = i4;
            t1Var2 = new t1("", "", "");
        } else {
            i3 = i4;
            t1Var2 = t1Var;
        }
    }
}
