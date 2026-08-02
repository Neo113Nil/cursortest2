package Cd;

import Kd.C3515l;
import Kd.EnumC3514k;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final List<EnumC2741b> f4777a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final List<EnumC2741b> f4778b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Object f4779c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Object f4780d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final LinkedHashMap f4781e;

    static {
        EnumC2741b enumC2741b = EnumC2741b.FIELD;
        EnumC2741b enumC2741b2 = EnumC2741b.METHOD_RETURN_TYPE;
        EnumC2741b enumC2741b3 = EnumC2741b.VALUE_PARAMETER;
        List<EnumC2741b> b02 = C7714v.b0(enumC2741b, enumC2741b2, enumC2741b3, EnumC2741b.TYPE_PARAMETER_BOUNDS, EnumC2741b.TYPE_USE);
        f4777a = b02;
        List<EnumC2741b> a02 = C7714v.a0(enumC2741b3);
        f4778b = a02;
        Sd.c k11 = G.k();
        EnumC3514k enumC3514k = EnumC3514k.NOT_NULL;
        List<EnumC2741b> list = b02;
        Map j11 = U.j(new Pair(k11, new u(new C3515l(enumC3514k, false), list, false)), new Pair(G.i(), new u(new C3515l(enumC3514k, false), list, false)), new Pair(G.j(), new u(new C3515l(EnumC3514k.FORCE_FLEXIBILITY, false), list)));
        f4779c = j11;
        List<EnumC2741b> list2 = a02;
        Map j12 = U.j(new Pair(G.d(), new u(new C3515l(enumC3514k, false), list2)), new Pair(G.e(), new u(new C3515l(EnumC3514k.NULLABLE, false), list2)));
        f4780d = j12;
        f4781e = U.m(j11, j12);
    }

    @NotNull
    public static final LinkedHashMap a() {
        return f4781e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<Sd.c, Cd.u>] */
    @NotNull
    public static final Map<Sd.c, u> b() {
        return f4779c;
    }
}
