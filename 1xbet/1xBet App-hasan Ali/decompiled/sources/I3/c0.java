package I3;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: A, reason: collision with root package name */
    public static final S f2618A;

    /* renamed from: B, reason: collision with root package name */
    public static final P f2619B;

    /* renamed from: a, reason: collision with root package name */
    public static final S f2620a = new S(Class.class, new F3.k(new F(), 2), 0);

    /* renamed from: b, reason: collision with root package name */
    public static final S f2621b = new S(BitSet.class, new F3.k(new Q(), 2), 0);

    /* renamed from: c, reason: collision with root package name */
    public static final V f2622c;

    /* renamed from: d, reason: collision with root package name */
    public static final T f2623d;

    /* renamed from: e, reason: collision with root package name */
    public static final T f2624e;
    public static final T f;

    /* renamed from: g, reason: collision with root package name */
    public static final T f2625g;

    /* renamed from: h, reason: collision with root package name */
    public static final S f2626h;
    public static final S i;

    /* renamed from: j, reason: collision with root package name */
    public static final S f2627j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0192w f2628k;

    /* renamed from: l, reason: collision with root package name */
    public static final T f2629l;

    /* renamed from: m, reason: collision with root package name */
    public static final B f2630m;

    /* renamed from: n, reason: collision with root package name */
    public static final C f2631n;

    /* renamed from: o, reason: collision with root package name */
    public static final D f2632o;

    /* renamed from: p, reason: collision with root package name */
    public static final S f2633p;

    /* renamed from: q, reason: collision with root package name */
    public static final S f2634q;

    /* renamed from: r, reason: collision with root package name */
    public static final S f2635r;

    /* renamed from: s, reason: collision with root package name */
    public static final S f2636s;

    /* renamed from: t, reason: collision with root package name */
    public static final S f2637t;

    /* renamed from: u, reason: collision with root package name */
    public static final S f2638u;

    /* renamed from: v, reason: collision with root package name */
    public static final S f2639v;

    /* renamed from: w, reason: collision with root package name */
    public static final S f2640w;

    /* renamed from: x, reason: collision with root package name */
    public static final C0181k f2641x;

    /* renamed from: y, reason: collision with root package name */
    public static final S f2642y;

    /* renamed from: z, reason: collision with root package name */
    public static final O f2643z;

    static {
        U u5 = new U();
        f2622c = new V();
        f2623d = new T(Boolean.TYPE, Boolean.class, u5);
        f2624e = new T(Byte.TYPE, Byte.class, new W());
        f = new T(Short.TYPE, Short.class, new X());
        f2625g = new T(Integer.TYPE, Integer.class, new Y());
        f2626h = new S(AtomicInteger.class, new F3.k(new Z(), 2), 0);
        i = new S(AtomicBoolean.class, new F3.k(new a0(), 2), 0);
        f2627j = new S(AtomicIntegerArray.class, new F3.k(new C0191v(), 2), 0);
        f2628k = new C0192w();
        new C0193x();
        new C0194y();
        f2629l = new T(Character.TYPE, Character.class, new C0195z());
        A a5 = new A();
        f2630m = new B();
        f2631n = new C();
        f2632o = new D();
        f2633p = new S(String.class, a5, 0);
        f2634q = new S(StringBuilder.class, new E(), 0);
        f2635r = new S(StringBuffer.class, new G(), 0);
        f2636s = new S(URL.class, new H(), 0);
        f2637t = new S(URI.class, new I(), 0);
        f2638u = new S(InetAddress.class, new J(), 1);
        f2639v = new S(UUID.class, new K(), 0);
        f2640w = new S(Currency.class, new F3.k(new L(), 2), 0);
        f2641x = new C0181k(2, new M());
        f2642y = new S(Locale.class, new N(), 0);
        O o5 = new O();
        f2643z = o5;
        f2618A = new S(F3.o.class, o5, 1);
        f2619B = new P();
    }
}
