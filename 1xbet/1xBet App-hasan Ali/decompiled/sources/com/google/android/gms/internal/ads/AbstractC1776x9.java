package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.x9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1776x9 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1551s9 f16242a = new C1551s9(1);

    /* renamed from: b, reason: collision with root package name */
    public static final C1551s9 f16243b = new C1551s9(2);

    /* renamed from: c, reason: collision with root package name */
    public static final C1551s9 f16244c = new C1551s9(4);

    /* renamed from: d, reason: collision with root package name */
    public static final C1551s9 f16245d = new C1551s9(18);

    /* renamed from: e, reason: collision with root package name */
    public static final C1551s9 f16246e = new C1551s9(19);
    public static final C1551s9 f = new C1551s9(5);

    /* renamed from: g, reason: collision with root package name */
    public static final C1551s9 f16247g = new C1551s9(20);

    /* renamed from: h, reason: collision with root package name */
    public static final C1551s9 f16248h = new C1551s9(21);
    public static final C1551s9 i = new C1551s9(3);

    /* renamed from: j, reason: collision with root package name */
    public static final C1551s9 f16249j = new C1551s9(22);

    /* renamed from: k, reason: collision with root package name */
    public static final C1551s9 f16250k = new C1551s9(23);

    /* renamed from: l, reason: collision with root package name */
    public static final C1295me f16251l = new C1295me();

    /* renamed from: m, reason: collision with root package name */
    public static final C1551s9 f16252m = new C1551s9(26);

    /* renamed from: n, reason: collision with root package name */
    public static final C1551s9 f16253n = new C1551s9(0);

    /* renamed from: o, reason: collision with root package name */
    public static final C1641u9 f16254o = new C1641u9();

    /* renamed from: p, reason: collision with root package name */
    public static final C1551s9 f16255p = new C1551s9(24);

    /* renamed from: q, reason: collision with root package name */
    public static final C1551s9 f16256q = new C1551s9(25);

    /* renamed from: r, reason: collision with root package name */
    public static final C1551s9 f16257r = new C1551s9(6);

    /* renamed from: s, reason: collision with root package name */
    public static final C1551s9 f16258s = new C1551s9(7);

    /* renamed from: t, reason: collision with root package name */
    public static final C1551s9 f16259t = new C1551s9(8);

    /* renamed from: u, reason: collision with root package name */
    public static final C1551s9 f16260u = new C1551s9(9);

    /* renamed from: v, reason: collision with root package name */
    public static final C1551s9 f16261v = new C1551s9(10);

    /* renamed from: w, reason: collision with root package name */
    public static final C1551s9 f16262w = new C1551s9(11);

    /* renamed from: x, reason: collision with root package name */
    public static final C1551s9 f16263x = new C1551s9(12);

    /* renamed from: y, reason: collision with root package name */
    public static final C1551s9 f16264y = new C1551s9(13);

    /* renamed from: z, reason: collision with root package name */
    public static final C1551s9 f16265z = new C1551s9(14);

    /* renamed from: A, reason: collision with root package name */
    public static final C1551s9 f16239A = new C1551s9(15);

    /* renamed from: B, reason: collision with root package name */
    public static final C1551s9 f16240B = new C1551s9(16);

    /* renamed from: C, reason: collision with root package name */
    public static final C1551s9 f16241C = new C1551s9(17);

    public static E3.a a(InterfaceC0677Re interfaceC0677Re, String str) {
        String str2;
        Uri parse = Uri.parse(str);
        try {
            Q4 b02 = interfaceC0677Re.b0();
            Xq Y4 = interfaceC0677Re.Y();
            if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.Cb)).booleanValue() || Y4 == null) {
                if (b02 != null && b02.c(parse)) {
                    parse = b02.a(parse, interfaceC0677Re.getContext(), interfaceC0677Re.K(), interfaceC0677Re.e());
                }
            } else if (b02 != null && b02.c(parse)) {
                parse = Y4.a(parse, interfaceC0677Re.getContext(), interfaceC0677Re.K(), interfaceC0677Re.e());
            }
        } catch (R4 unused) {
            U2.j.i("Unable to append parameter to URL: ".concat(str));
        }
        HashMap hashMap = new HashMap();
        if (interfaceC0677Re.v() != null) {
            hashMap = interfaceC0677Re.v().f10532w0;
        }
        Context context = interfaceC0677Re.getContext();
        P2.o oVar = P2.o.f4767B;
        if (oVar.f4790x.e(context)) {
            C1204kd c1204kd = oVar.f4790x;
            String a5 = c1204kd.a(context);
            if (a5 == null) {
                str2 = parse.toString();
            } else {
                A7 a7 = F7.f8842j0;
                Q2.r rVar = Q2.r.f5053d;
                String str3 = (String) rVar.f5056c.a(a7);
                String uri = parse.toString();
                A7 a72 = F7.f8837i0;
                D7 d7 = rVar.f5056c;
                if (((Boolean) d7.a(a72)).booleanValue() && uri.contains(str3)) {
                    c1204kd.k(context, "_ac", a5, C1204kd.f((Map) hashMap.get("_ac")));
                    str2 = AbstractC1668us.R(context, uri).replace(str3, a5);
                } else if (!TextUtils.isEmpty(parse.getQueryParameter("fbs_aeid")) || ((Boolean) d7.a(F7.f8835h0)).booleanValue()) {
                    str2 = uri;
                } else {
                    String uri2 = AbstractC1668us.h(AbstractC1668us.R(context, uri), "fbs_aeid", a5).toString();
                    c1204kd.k(context, "_ac", a5, C1204kd.f((Map) hashMap.get("_ac")));
                    str2 = uri2;
                }
            }
        } else {
            str2 = parse.toString();
        }
        long longValue = ((Long) AbstractC1013g8.f13567e.s()).longValue();
        if (longValue <= 0 || longValue > 244410203) {
            return AbstractC1400ot.c0(str2);
        }
        Hw r5 = Hw.r(interfaceC0677Re.R());
        C1364o1 c1364o1 = new C1364o1(2);
        C0606Hd c0606Hd = AbstractC0613Id.f9544g;
        return AbstractC1400ot.U(AbstractC1400ot.h0(AbstractC1400ot.U(r5, Throwable.class, c1364o1, c0606Hd), new C1596t9(str2, 0), c0606Hd), Throwable.class, new C1596t9(str2, 1), c0606Hd);
    }

    public static void b(Map map, Vi vi) {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.oa)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && vi != null) {
            vi.E();
        }
    }
}
