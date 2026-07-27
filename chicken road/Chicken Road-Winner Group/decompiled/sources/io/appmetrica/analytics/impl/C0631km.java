package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.km, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0631km implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Ee f7718a = new Ee();

    /* renamed from: b, reason: collision with root package name */
    public final C0671ma f7719b = new C0671ma();

    /* renamed from: c, reason: collision with root package name */
    public final Lm f7720c = new Lm();

    /* renamed from: d, reason: collision with root package name */
    public final C0690n3 f7721d = new C0690n3();

    /* renamed from: e, reason: collision with root package name */
    public final C0896v2 f7722e = new C0896v2();
    public final D6 f = new D6();

    /* renamed from: g, reason: collision with root package name */
    public final Hm f7723g = new Hm();

    /* renamed from: h, reason: collision with root package name */
    public final C0933wd f7724h = new C0933wd();

    /* renamed from: i, reason: collision with root package name */
    public final J9 f7725i = new J9();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Am fromModel(C0709nm c0709nm) {
        Am am = new Am();
        am.f5733s = c0709nm.f7963u;
        am.f5734t = c0709nm.f7964v;
        String str = c0709nm.f7944a;
        if (str != null) {
            am.f5716a = str;
        }
        List list = c0709nm.f;
        if (list != null) {
            am.f = (String[]) list.toArray(new String[list.size()]);
        }
        List list2 = c0709nm.f7949g;
        if (list2 != null) {
            am.f5721g = (String[]) list2.toArray(new String[list2.size()]);
        }
        List list3 = c0709nm.f7945b;
        if (list3 != null) {
            am.f5718c = (String[]) list3.toArray(new String[list3.size()]);
        }
        List list4 = c0709nm.f7950h;
        if (list4 != null) {
            am.f5729o = (String[]) list4.toArray(new String[list4.size()]);
        }
        Map<String, ? extends List<String>> map = c0709nm.f7951i;
        if (map != null) {
            am.f5722h = this.f.fromModel(map);
        }
        De de = c0709nm.f7961s;
        if (de != null) {
            am.f5736v = this.f7718a.fromModel(de);
        }
        String str2 = c0709nm.f7952j;
        if (str2 != null) {
            am.f5724j = str2;
        }
        String str3 = c0709nm.f7946c;
        if (str3 != null) {
            am.f5719d = str3;
        }
        String str4 = c0709nm.f7947d;
        if (str4 != null) {
            am.f5720e = str4;
        }
        String str5 = c0709nm.f7948e;
        if (str5 != null) {
            am.f5732r = str5;
        }
        am.f5723i = this.f7719b.fromModel(c0709nm.f7955m);
        String str6 = c0709nm.f7953k;
        if (str6 != null) {
            am.f5725k = str6;
        }
        String str7 = c0709nm.f7954l;
        if (str7 != null) {
            am.f5726l = str7;
        }
        am.f5727m = c0709nm.f7958p;
        am.f5717b = c0709nm.f7956n;
        am.f5731q = c0709nm.f7957o;
        RetryPolicyConfig retryPolicyConfig = c0709nm.f7962t;
        am.f5737w = retryPolicyConfig.maxIntervalSeconds;
        am.f5738x = retryPolicyConfig.exponentialMultiplier;
        String str8 = c0709nm.f7959q;
        if (str8 != null) {
            am.f5728n = str8;
        }
        Km km = c0709nm.f7960r;
        if (km != null) {
            this.f7720c.getClass();
            C1018zm c1018zm = new C1018zm();
            c1018zm.f8713a = km.f6196a;
            am.f5730p = c1018zm;
        }
        am.f5735u = c0709nm.f7965w;
        C0638l3 c0638l3 = c0709nm.f7966x;
        if (c0638l3 != null) {
            this.f7721d.getClass();
            C0838sm c0838sm = new C0838sm();
            c0838sm.f8319a = c0638l3.f7732a;
            am.y = c0838sm;
        }
        C0870u2 c0870u2 = c0709nm.y;
        if (c0870u2 != null) {
            am.f5739z = this.f7722e.fromModel(c0870u2);
        }
        am.f5713A = this.f7723g.fromModel(c0709nm.f7967z);
        am.f5714B = this.f7724h.fromModel(c0709nm.f7942A);
        am.f5715C = this.f7725i.fromModel(c0709nm.f7943B);
        return am;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0709nm toModel(Am am) {
        C0683mm c0683mm = new C0683mm(this.f7719b.toModel(am.f5723i));
        c0683mm.f7874a = am.f5716a;
        c0683mm.f7882j = am.f5724j;
        c0683mm.f7876c = am.f5719d;
        c0683mm.f7875b = Arrays.asList(am.f5718c);
        c0683mm.f7879g = Arrays.asList(am.f5721g);
        c0683mm.f = Arrays.asList(am.f);
        c0683mm.f7877d = am.f5720e;
        c0683mm.f7878e = am.f5732r;
        c0683mm.f7880h = Arrays.asList(am.f5729o);
        c0683mm.f7883k = am.f5725k;
        c0683mm.f7884l = am.f5726l;
        c0683mm.f7889q = am.f5727m;
        c0683mm.f7887o = am.f5717b;
        c0683mm.f7888p = am.f5731q;
        c0683mm.f7892t = am.f5733s;
        c0683mm.f7893u = am.f5734t;
        c0683mm.f7890r = am.f5728n;
        c0683mm.f7894v = am.f5735u;
        c0683mm.f7895w = new RetryPolicyConfig(am.f5737w, am.f5738x);
        c0683mm.f7881i = this.f.toModel(am.f5722h);
        C0968xm c0968xm = am.f5736v;
        if (c0968xm != null) {
            this.f7718a.getClass();
            c0683mm.f7886n = new De(c0968xm.f8622a, c0968xm.f8623b);
        }
        C1018zm c1018zm = am.f5730p;
        if (c1018zm != null) {
            this.f7720c.getClass();
            c0683mm.f7891s = new Km(c1018zm.f8713a);
        }
        C0838sm c0838sm = am.y;
        if (c0838sm != null) {
            this.f7721d.getClass();
            c0683mm.f7896x = new C0638l3(c0838sm.f8319a);
        }
        C0812rm c0812rm = am.f5739z;
        if (c0812rm != null) {
            c0683mm.y = this.f7722e.toModel(c0812rm);
        }
        C0993ym c0993ym = am.f5713A;
        if (c0993ym != null) {
            this.f7723g.getClass();
            c0683mm.f7897z = new Gm(c0993ym.f8645a);
        }
        c0683mm.f7872A = this.f7724h.toModel(am.f5714B);
        C0890um c0890um = am.f5715C;
        if (c0890um != null) {
            this.f7725i.getClass();
            c0683mm.f7873B = new I9(c0890um.f8466a);
        }
        return new C0709nm(c0683mm);
    }
}
