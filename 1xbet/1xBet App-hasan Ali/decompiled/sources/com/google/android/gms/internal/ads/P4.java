package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class P4 {

    /* renamed from: z, reason: collision with root package name */
    public static final P4 f11040z = new P4(new C1412p4());

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f11041a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f11042b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f11043c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f11044d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f11045e;
    public final byte[] f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f11046g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f11047h;
    public final Integer i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f11048j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f11049k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f11050l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f11051m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f11052n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f11053o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f11054p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f11055q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f11056r;

    /* renamed from: s, reason: collision with root package name */
    public final CharSequence f11057s;

    /* renamed from: t, reason: collision with root package name */
    public final CharSequence f11058t;

    /* renamed from: u, reason: collision with root package name */
    public final CharSequence f11059u;

    /* renamed from: v, reason: collision with root package name */
    public final CharSequence f11060v;

    /* renamed from: w, reason: collision with root package name */
    public final CharSequence f11061w;

    /* renamed from: x, reason: collision with root package name */
    public final Integer f11062x;

    /* renamed from: y, reason: collision with root package name */
    public final C1761wv f11063y;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(1000, 36);
    }

    public P4(C1412p4 c1412p4) {
        Boolean bool = c1412p4.f14947k;
        Integer num = c1412p4.f14946j;
        Integer num2 = c1412p4.f14959w;
        int i = 1;
        int i5 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case C1639u7.zzm /* 21 */:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    num = Integer.valueOf(i);
                }
                i = 0;
                num = Integer.valueOf(i);
            }
        } else if (num != null) {
            boolean z3 = num.intValue() != -1;
            bool = Boolean.valueOf(z3);
            if (z3 && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i5 = 21;
                        break;
                    case 3:
                        i5 = 22;
                        break;
                    case 4:
                        i5 = 23;
                        break;
                    case 5:
                        i5 = 24;
                        break;
                    case 6:
                        i5 = 25;
                        break;
                    default:
                        i5 = 20;
                        break;
                }
                num2 = Integer.valueOf(i5);
            }
        } else {
            num = null;
        }
        this.f11041a = c1412p4.f14939a;
        this.f11042b = c1412p4.f14940b;
        this.f11043c = c1412p4.f14941c;
        this.f11044d = c1412p4.f14942d;
        this.f11045e = c1412p4.f14943e;
        this.f = c1412p4.f;
        this.f11046g = c1412p4.f14944g;
        this.f11047h = c1412p4.f14945h;
        this.i = c1412p4.i;
        this.f11048j = num;
        this.f11049k = bool;
        Integer num3 = c1412p4.f14948l;
        this.f11050l = num3;
        this.f11051m = num3;
        this.f11052n = c1412p4.f14949m;
        this.f11053o = c1412p4.f14950n;
        this.f11054p = c1412p4.f14951o;
        this.f11055q = c1412p4.f14952p;
        this.f11056r = c1412p4.f14953q;
        this.f11057s = c1412p4.f14954r;
        this.f11058t = c1412p4.f14955s;
        this.f11059u = c1412p4.f14956t;
        this.f11060v = c1412p4.f14957u;
        this.f11061w = c1412p4.f14958v;
        this.f11062x = num2;
        this.f11063y = c1412p4.f14960x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && P4.class == obj.getClass()) {
            P4 p42 = (P4) obj;
            if (Objects.equals(this.f11041a, p42.f11041a) && Objects.equals(this.f11042b, p42.f11042b) && Objects.equals(this.f11043c, p42.f11043c) && Objects.equals(this.f11044d, p42.f11044d) && Objects.equals(this.f11045e, p42.f11045e) && Arrays.equals(this.f, p42.f) && Objects.equals(this.f11046g, p42.f11046g) && Objects.equals(this.f11047h, p42.f11047h) && Objects.equals(this.i, p42.i) && Objects.equals(this.f11048j, p42.f11048j) && Objects.equals(this.f11049k, p42.f11049k) && Objects.equals(this.f11051m, p42.f11051m) && Objects.equals(this.f11052n, p42.f11052n) && Objects.equals(this.f11053o, p42.f11053o) && Objects.equals(this.f11054p, p42.f11054p) && Objects.equals(this.f11055q, p42.f11055q) && Objects.equals(this.f11056r, p42.f11056r) && Objects.equals(this.f11057s, p42.f11057s) && Objects.equals(this.f11058t, p42.f11058t) && Objects.equals(this.f11059u, p42.f11059u) && Objects.equals(this.f11060v, p42.f11060v) && Objects.equals(this.f11061w, p42.f11061w) && Objects.equals(this.f11062x, p42.f11062x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11041a, this.f11042b, this.f11043c, this.f11044d, null, null, this.f11045e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f)), this.f11046g, null, this.f11047h, this.i, this.f11048j, this.f11049k, null, this.f11051m, this.f11052n, this.f11053o, this.f11054p, this.f11055q, this.f11056r, this.f11057s, this.f11058t, this.f11059u, null, null, this.f11060v, null, this.f11061w, this.f11062x, Boolean.TRUE});
    }
}
