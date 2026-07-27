package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.b9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0386b9 {

    /* renamed from: h, reason: collision with root package name */
    public static final Map f7031h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0386b9 f7032i;

    /* renamed from: a, reason: collision with root package name */
    public final Ed f7033a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0918vo f7034b;

    /* renamed from: c, reason: collision with root package name */
    public final D8 f7035c;

    /* renamed from: d, reason: collision with root package name */
    public final A9 f7036d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0415cc f7037e;
    public final InterfaceC0391be f;

    /* renamed from: g, reason: collision with root package name */
    public final U9 f7038g;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(EnumC0619ka.FIRST_OCCURRENCE, 1);
        hashMap.put(EnumC0619ka.NON_FIRST_OCCURENCE, 0);
        hashMap.put(EnumC0619ka.UNKNOWN, -1);
        f7031h = Collections.unmodifiableMap(hashMap);
        f7032i = new C0386b9(new Wi(), new C0426cn(), new C0597je(), new Vi(), new C0775qa(), new C0800ra(), new C0749pa());
    }

    public C0386b9(C0360a9 c0360a9) {
        this(c0360a9.f6954a, c0360a9.f6955b, c0360a9.f6956c, c0360a9.f6957d, c0360a9.f6958e, c0360a9.f, c0360a9.f6959g);
    }

    public final C0644l9 a(S8 s8, C0756ph c0756ph) {
        C0644l9 c0644l9 = new C0644l9();
        C0618k9 a3 = this.f.a(s8.f6577l, s8.f6578m);
        C0515g9 a4 = this.f7037e.a(s8.f6572g);
        if (a3 != null) {
            c0644l9.f7787g = a3;
        }
        if (a4 != null) {
            c0644l9.f = a4;
        }
        String a5 = this.f7033a.a(s8.f6567a);
        if (a5 != null) {
            c0644l9.f7785d = a5;
        }
        c0644l9.f7786e = this.f7034b.a(s8, c0756ph);
        String str = s8.f6575j;
        if (str != null) {
            c0644l9.f7788h = str;
        }
        Integer a6 = this.f7036d.a(s8);
        if (a6 != null) {
            c0644l9.f7784c = a6.intValue();
        }
        Long l3 = s8.f6569c;
        if (l3 != null) {
            c0644l9.f7782a = l3.longValue();
        }
        Long l4 = s8.f6570d;
        if (l4 != null) {
            c0644l9.f7794n = l4.longValue();
        }
        Long l5 = s8.f6571e;
        if (l5 != null) {
            c0644l9.f7795o = l5.longValue();
        }
        Long l6 = s8.f;
        if (l6 != null) {
            c0644l9.f7783b = l6.longValue();
        }
        Integer num = s8.f6576k;
        if (num != null) {
            c0644l9.f7789i = num.intValue();
        }
        c0644l9.f7790j = this.f7035c.a(s8.f6580o);
        C0772q7 c0772q7 = s8.f6572g;
        c0644l9.f7791k = c0772q7 != null ? new C0719o6().a(c0772q7.f8120a) : -1;
        String str2 = s8.f6579n;
        if (str2 != null) {
            c0644l9.f7792l = str2.getBytes();
        }
        EnumC0619ka enumC0619ka = s8.f6581p;
        Integer num2 = enumC0619ka != null ? (Integer) f7031h.get(enumC0619ka) : null;
        if (num2 != null) {
            c0644l9.f7793m = num2.intValue();
        }
        EnumC0851t9 enumC0851t9 = s8.f6582q;
        if (enumC0851t9 != null) {
            int ordinal = enumC0851t9.ordinal();
            if (ordinal == 0) {
                c0644l9.f7796p = 0;
            } else if (ordinal == 1) {
                c0644l9.f7796p = 1;
            } else if (ordinal == 2) {
                c0644l9.f7796p = 2;
            }
        }
        Boolean bool = s8.f6583r;
        if (bool != null) {
            c0644l9.f7797q = bool.booleanValue();
        }
        if (s8.f6584s != null) {
            c0644l9.f7798r = r6.intValue();
        }
        c0644l9.f7799s = ((C0749pa) this.f7038g).a(s8.f6585t);
        return c0644l9;
    }

    public C0386b9(Ed ed, InterfaceC0918vo interfaceC0918vo, D8 d8, A9 a9, InterfaceC0415cc interfaceC0415cc, InterfaceC0391be interfaceC0391be, U9 u9) {
        this.f7033a = ed;
        this.f7034b = interfaceC0918vo;
        this.f7035c = d8;
        this.f7036d = a9;
        this.f7037e = interfaceC0415cc;
        this.f = interfaceC0391be;
        this.f7038g = u9;
    }

    public static C0360a9 a() {
        return new C0360a9(f7032i);
    }
}
