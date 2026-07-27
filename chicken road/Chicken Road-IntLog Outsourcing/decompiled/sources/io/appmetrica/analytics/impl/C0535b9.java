package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.b9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0535b9 {

    /* renamed from: h, reason: collision with root package name */
    public static final Map f7915h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0535b9 f7916i;

    /* renamed from: a, reason: collision with root package name */
    public final Ed f7917a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1067vo f7918b;

    /* renamed from: c, reason: collision with root package name */
    public final D8 f7919c;

    /* renamed from: d, reason: collision with root package name */
    public final A9 f7920d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0564cc f7921e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0540be f7922f;

    /* renamed from: g, reason: collision with root package name */
    public final U9 f7923g;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC0768ka.FIRST_OCCURRENCE, 1);
        hashMap.put(EnumC0768ka.NON_FIRST_OCCURENCE, 0);
        hashMap.put(EnumC0768ka.UNKNOWN, -1);
        f7915h = Collections.unmodifiableMap(hashMap);
        f7916i = new C0535b9(new Wi(), new C0575cn(), new C0746je(), new Vi(), new C0924qa(), new C0949ra(), new C0898pa());
    }

    public C0535b9(C0509a9 c0509a9) {
        this(c0509a9.f7834a, c0509a9.f7835b, c0509a9.f7836c, c0509a9.f7837d, c0509a9.f7838e, c0509a9.f7839f, c0509a9.f7840g);
    }

    public final C0793l9 a(S8 s8, C0905ph c0905ph) {
        C0793l9 c0793l9 = new C0793l9();
        C0767k9 a6 = this.f7922f.a(s8.f7445l, s8.f7446m);
        C0664g9 a7 = this.f7921e.a(s8.f7440g);
        if (a6 != null) {
            c0793l9.f8710g = a6;
        }
        if (a7 != null) {
            c0793l9.f8709f = a7;
        }
        String a8 = this.f7917a.a(s8.f7434a);
        if (a8 != null) {
            c0793l9.f8707d = a8;
        }
        c0793l9.f8708e = this.f7918b.a(s8, c0905ph);
        String str = s8.f7443j;
        if (str != null) {
            c0793l9.f8711h = str;
        }
        Integer a9 = this.f7920d.a(s8);
        if (a9 != null) {
            c0793l9.f8706c = a9.intValue();
        }
        Long l2 = s8.f7436c;
        if (l2 != null) {
            c0793l9.f8704a = l2.longValue();
        }
        Long l6 = s8.f7437d;
        if (l6 != null) {
            c0793l9.f8717n = l6.longValue();
        }
        Long l7 = s8.f7438e;
        if (l7 != null) {
            c0793l9.f8718o = l7.longValue();
        }
        Long l8 = s8.f7439f;
        if (l8 != null) {
            c0793l9.f8705b = l8.longValue();
        }
        Integer num = s8.f7444k;
        if (num != null) {
            c0793l9.f8712i = num.intValue();
        }
        c0793l9.f8713j = this.f7919c.a(s8.f7448o);
        C0921q7 c0921q7 = s8.f7440g;
        c0793l9.f8714k = c0921q7 != null ? new C0868o6().a(c0921q7.f9059a) : -1;
        String str2 = s8.f7447n;
        if (str2 != null) {
            c0793l9.f8715l = str2.getBytes();
        }
        EnumC0768ka enumC0768ka = s8.f7449p;
        Integer num2 = enumC0768ka != null ? (Integer) f7915h.get(enumC0768ka) : null;
        if (num2 != null) {
            c0793l9.f8716m = num2.intValue();
        }
        EnumC1000t9 enumC1000t9 = s8.f7450q;
        if (enumC1000t9 != null) {
            int ordinal = enumC1000t9.ordinal();
            if (ordinal == 0) {
                c0793l9.f8719p = 0;
            } else if (ordinal == 1) {
                c0793l9.f8719p = 1;
            } else if (ordinal == 2) {
                c0793l9.f8719p = 2;
            }
        }
        Boolean bool = s8.f7451r;
        if (bool != null) {
            c0793l9.f8720q = bool.booleanValue();
        }
        if (s8.f7452s != null) {
            c0793l9.f8721r = r6.intValue();
        }
        c0793l9.f8722s = ((C0898pa) this.f7923g).a(s8.f7453t);
        return c0793l9;
    }

    public C0535b9(Ed ed, InterfaceC1067vo interfaceC1067vo, D8 d8, A9 a9, InterfaceC0564cc interfaceC0564cc, InterfaceC0540be interfaceC0540be, U9 u9) {
        this.f7917a = ed;
        this.f7918b = interfaceC1067vo;
        this.f7919c = d8;
        this.f7920d = a9;
        this.f7921e = interfaceC0564cc;
        this.f7922f = interfaceC0540be;
        this.f7923g = u9;
    }

    public static C0509a9 a() {
        return new C0509a9(f7916i);
    }
}
