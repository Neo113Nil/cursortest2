package B4;

import android.os.Bundle;
import android.os.Parcelable;
import g.C6594f;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public abstract class W<T> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final i f2575b = new i(false);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final m f2576c = new m(false);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final g f2577d = new g(true);

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final h f2578e = new h(true);

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final l f2579f = new l(false);

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public static final j f2580g = new j(true);

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public static final k f2581h = new k(true);

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public static final f f2582i = new f(false);

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    public static final d f2583j = new d(true);

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    public static final e f2584k = new e(true);

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    public static final c f2585l = new c(false);

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f2586m = new a(true);

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    public static final b f2587n = new b(true);

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    public static final p f2588o = new p(true);

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    public static final n f2589p = new n(true);

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    public static final o f2590q = new o(true);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f2591a;

    public static final class a extends AbstractC2574c<boolean[]> {
        public static boolean[] h(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new boolean[]{((Boolean) W.f2585l.g(value)).booleanValue()};
        }

        @Override // B4.W
        public final Object a(Bundle bundle, String str) {
            return (boolean[]) V.a(bundle, "bundle", str, "key", str);
        }

        @Override // B4.W
        public final String b() {
            return "boolean[]";
        }

        @Override // B4.W
        public final Object d(Object obj, String value) {
            boolean[] zArr = (boolean[]) obj;
            Intrinsics.checkNotNullParameter(value, "value");
            if (zArr == null) {
                return h(value);
            }
            boolean[] elements = h(value);
            Intrinsics.checkNotNullParameter(zArr, "<this>");
            Intrinsics.checkNotNullParameter(elements, "elements");
            int length = zArr.length;
            boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
            System.arraycopy(elements, 0, copyOf, length, 1);
            Intrinsics.f(copyOf);
            return copyOf;
        }

        @Override // B4.W
        /* renamed from: e */
        public final /* bridge */ /* synthetic */ Object g(String str) {
            return h(str);
        }

        @Override // B4.W
        public final void f(Bundle bundle, String key, Object obj) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putBooleanArray(key, (boolean[]) obj);
        }

        @Override // B4.AbstractC2574c
        public final boolean[] g() {
            return new boolean[0];
        }
    }

    public static final class b extends AbstractC2574c<List<? extends Boolean>> {
        @Override // B4.W
        public final Object a(Bundle bundle, String str) {
            boolean[] zArr = (boolean[]) V.a(bundle, "bundle", str, "key", str);
            if (zArr != null) {
                return C7705l.g0(zArr);
            }
            return null;
        }

        @Override // B4.W
        public final String b() {
            return "List<Boolean>";
        }

        @Override // B4.W
        public final Object d(Object obj, String value) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(value, "value");
            c cVar = W.f2585l;
            if (list == null) {
                Intrinsics.checkNotNullParameter(value, "value");
                return C7714v.a0(cVar.g(value));
            }
            Intrinsics.checkNotNullParameter(value, "value");
            return C7714v.p0(C7714v.a0(cVar.g(value)), list);
        }

        @Override // B4.W
        /* renamed from: e */
        public final Object g(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return C7714v.a0(W.f2585l.g(value));
        }

        @Override // B4.W
        public final void f(Bundle bundle, String key, Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putBooleanArray(key, list != null ? C7714v.P0(list) : null);
        }

        @Override // B4.AbstractC2574c
        public final List<? extends Boolean> g() {
            return kotlin.collections.K.f71697a;
        }
    }

    public static final class c extends W<Boolean> {
        @Override // B4.W
        public final Boolean a(Bundle bundle, String str) {
            return (Boolean) V.a(bundle, "bundle", str, "key", str);
        }

        @Override // B4.W
        public final String b() {
            return "boolean";
        }

        @Override // B4.W
        /* renamed from: e */
        public final Boolean g(String value) {
            boolean z11;
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.d(value, "true")) {
                z11 = true;
            } else {
                if (!Intrinsics.d(value, "false")) {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }

        @Override // B4.W
        public final void f(Bundle bundle, String key, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putBoolean(key, booleanValue);
        }
    }

    public static final class d extends AbstractC2574c<float[]> {
        public static float[] h(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new float[]{((Number) W.f2582i.g(value)).floatValue()};
        }

        @Override // B4.W
        public final Object a(Bundle bundle, String str) {
            return (float[]) V.a(bundle, "bundle", str, "key", str);
        }

        @Override // B4.W
        public final String b() {
            return "float[]";
        }

        @Override // B4.W
        public final Object d(Object obj, String value) {
            float[] fArr = (float[]) obj;
            Intrinsics.checkNotNullParameter(value, "value");
            if (fArr == null) {
                return h(value);
            }
            float[] elements = h(value);
            Intrinsics.checkNotNullParameter(fArr, "<this>");
            Intrinsics.checkNotNullParameter(elements, "elements");
            int length = fArr.length;
            float[] copyOf = Arrays.copyOf(fArr, length + 1);
            System.arraycopy(elements, 0, copyOf, length, 1);
            Intrinsics.f(copyOf);
            return copyOf;
        }

        @Override // B4.W
        /* renamed from: e */
        public final /* bridge */ /* synthetic */ Object g(String str) {
            return h(str);
        }

        @Override // B4.W
        public final void f(Bundle bundle, String key, Object obj) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putFloatArray(key, (float[]) obj);
        }

        @Override // B4.AbstractC2574c
        public final float[] g() {
            return new float[0];
        }
    }

    public static final class e extends AbstractC2574c<List<? extends Float>> {
        @Override // B4.W
        public final Object a(Bundle bundle, String str) {
            float[] fArr = (float[]) V.a(bundle, "bundle", str, "key", str);
            if (fArr != null) {
                return C7705l.c0(fArr);
            }
            return null;
        }

        @Override // B4.W
        public final String b() {
            return "List<Float>";
        }

        @Override // B4.W
        public final Object d(Object obj, String value) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(value, "value");
            f fVar = W.f2582i;
            if (list == null) {
                Intrinsics.checkNotNullParameter(value, "value");
                return C7714v.a0(fVar.g(value));
            }
            Intrinsics.checkNotNullParameter(value, "value");
            return C7714v.p0(C7714v.a0(fVar.g(value)), list);
        }

        @Override // B4.W
        /* renamed from: e */
        public final Object g(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return C7714v.a0(W.f2582i.g(value));
        }

        @Override // B4.W
        public final void f(Bundle bundle, String key, Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putFloatArray(key, list != null ? C7714v.R0(list) : null);
        }

        @Override // B4.AbstractC2574c
        public final List<? extends Float> g() {
            return kotlin.collections.K.f71697a;
        }
    }

    public static final class f extends W<Float> {
        @Override // B4.W
        public final Float a(Bundle bundle, String str) {
            Object a11 = V.a(bundle, "bundle", str, "key", str);
            Intrinsics.g(a11, "null cannot be cast to non-null type kotlin.Float");
            return (Float) a11;
        }

        @Override // B4.W
        public final String b() {
            return "float";
        }

        @Override // B4.W
        /* renamed from: e */
        public final Float g(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return Float.valueOf(Float.parseFloat(value));
        }

        @Override // B4.W
        public final void f(Bundle bundle, String key, Float f7) {
            float floatValue = f7.floatValue();
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putFloat(key, floatValue);
        }
    }

    public static final class g extends AbstractC2574c<int[]> {
        public static int[] h(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new int[]{((Number) W.f2575b.g(value)).intValue()};
        }

        @Override // B4.W
        public final Object a(Bundle bundle, String str) {
            return (int[]) V.a(bundle, "bundle", str, "key", str);
        }

        @Override // B4.W
        public final String b() {
            return "integer[]";
        }

        @Override // B4.W
        public final Object d(Object obj, String value) {
            int[] iArr = (int[]) obj;
            Intrinsics.checkNotNullParameter(value, "value");
            if (iArr == null) {
                return h(value);
            }
            int[] elements = h(value);
            Intrinsics.checkNotNullParameter(iArr, "<this>");
            Intrinsics.checkNotNullParameter(elements, "elements");
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length + 1);
            System.arraycopy(elements, 0, copyOf, length, 1);
            Intrinsics.f(copyOf);
            return copyOf;
        }

        @Override // B4.W
        /* renamed from: e */
        public final /* bridge */ /* synthetic */ Object g(String str) {
            return h(str);
        }

        @Override // B4.W
        public final void f(Bundle bundle, String key, Object obj) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putIntArray(key, (int[]) obj);
        }

        @Override // B4.AbstractC2574c
        public final int[] g() {
            return new int[0];
        }
    }

    public static final class h extends AbstractC2574c<List<? extends Integer>> {
        @Override // B4.W
        public final Object a(Bundle bundle, String str) {
            int[] iArr = (int[]) V.a(bundle, "bundle", str, "key", str);
            if (iArr != null) {
                return C7705l.d0(iArr);
            }
            return null;
        }

        @Override // B4.W
        public final String b() {
            return "List<Int>";
        }

        @Override // B4.W
        public final Object d(Object obj, String value) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(value, "value");
            i iVar = W.f2575b;
            if (list == null) {
                Intrinsics.checkNotNullParameter(value, "value");
                return C7714v.a0(iVar.g(value));
            }
            Intrinsics.checkNotNullParameter(value, "value");
            return C7714v.p0(C7714v.a0(iVar.g(value)), list);
        }

        @Override // B4.W
        /* renamed from: e */
        public final Object g(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return C7714v.a0(W.f2575b.g(value));
        }

        @Override // B4.W
        public final void f(Bundle bundle, String key, Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putIntArray(key, list != null ? C7714v.T0(list) : null);
        }

        @Override // B4.AbstractC2574c
        public final List<? extends Integer> g() {
            return kotlin.collections.K.f71697a;
        }
    }

    public static final class i extends W<Integer> {
        @Override // B4.W
        public final Integer a(Bundle bundle, String str) {
            Object a11 = V.a(bundle, "bundle", str, "key", str);
            Intrinsics.g(a11, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) a11;
        }

        @Override // B4.W
        public final String b() {
            return "integer";
        }

        @Override // B4.W
        /* renamed from: e */
        public final Integer g(String value) {
            int parseInt;
            Intrinsics.checkNotNullParameter(value, "value");
            if (kotlin.text.h.e0(value, "0x", false)) {
                String substring = value.substring(2);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                parseInt = Integer.parseInt(substring, CharsKt.checkRadix(16));
            } else {
                parseInt = Integer.parseInt(value);
            }
            return Integer.valueOf(parseInt);
        }

        @Override // B4.W
        public final void f(Bundle bundle, String key, Integer num) {
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putInt(key, intValue);
        }
    }

    public static final class j extends AbstractC2574c<long[]> {
        public static long[] h(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new long[]{((Number) W.f2579f.g(value)).longValue()};
        }

        @Override // B4.W
        public final Object a(Bundle bundle, String str) {
            return (long[]) V.a(bundle, "bundle", str, "key", str);
        }

        @Override // B4.W
        public final String b() {
            return "long[]";
        }

        @Override // B4.W
        public final Object d(Object obj, String value) {
            long[] jArr = (long[]) obj;
            Intrinsics.checkNotNullParameter(value, "value");
            if (jArr == null) {
                return h(value);
            }
            long[] elements = h(value);
            Intrinsics.checkNotNullParameter(jArr, "<this>");
            Intrinsics.checkNotNullParameter(elements, "elements");
            int length = jArr.length;
            long[] copyOf = Arrays.copyOf(jArr, length + 1);
            System.arraycopy(elements, 0, copyOf, length, 1);
            Intrinsics.f(copyOf);
            return copyOf;
        }

        @Override // B4.W
        /* renamed from: e */
        public final /* bridge */ /* synthetic */ Object g(String str) {
            return h(str);
        }

        @Override // B4.W
        public final void f(Bundle bundle, String key, Object obj) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putLongArray(key, (long[]) obj);
        }

        @Override // B4.AbstractC2574c
        public final long[] g() {
            return new long[0];
        }
    }

    public static final class k extends AbstractC2574c<List<? extends Long>> {
        @Override // B4.W
        public final Object a(Bundle bundle, String str) {
            long[] jArr = (long[]) V.a(bundle, "bundle", str, "key", str);
            if (jArr != null) {
                return C7705l.e0(jArr);
            }
            return null;
        }

        @Override // B4.W
        public final String b() {
            return "List<Long>";
        }

        @Override // B4.W
        public final Object d(Object obj, String value) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(value, "value");
            l lVar = W.f2579f;
            if (list == null) {
                Intrinsics.checkNotNullParameter(value, "value");
                return C7714v.a0(lVar.g(value));
            }
            Intrinsics.checkNotNullParameter(value, "value");
            return C7714v.p0(C7714v.a0(lVar.g(value)), list);
        }

        @Override // B4.W
        /* renamed from: e */
        public final Object g(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return C7714v.a0(W.f2579f.g(value));
        }

        @Override // B4.W
        public final void f(Bundle bundle, String key, Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putLongArray(key, list != null ? C7714v.V0(list) : null);
        }

        @Override // B4.AbstractC2574c
        public final List<? extends Long> g() {
            return kotlin.collections.K.f71697a;
        }
    }

    public static final class l extends W<Long> {
        @Override // B4.W
        public final Long a(Bundle bundle, String str) {
            Object a11 = V.a(bundle, "bundle", str, "key", str);
            Intrinsics.g(a11, "null cannot be cast to non-null type kotlin.Long");
            return (Long) a11;
        }

        @Override // B4.W
        public final String b() {
            return "long";
        }

        @Override // B4.W
        /* renamed from: e */
        public final Long g(String value) {
            String str;
            long parseLong;
            Intrinsics.checkNotNullParameter(value, "value");
            if (kotlin.text.h.A(value, "L", false)) {
                str = value.substring(0, value.length() - 1);
                Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
            } else {
                str = value;
            }
            if (kotlin.text.h.e0(value, "0x", false)) {
                String substring = str.substring(2);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                parseLong = Long.parseLong(substring, CharsKt.checkRadix(16));
            } else {
                parseLong = Long.parseLong(str);
            }
            return Long.valueOf(parseLong);
        }

        @Override // B4.W
        public final void f(Bundle bundle, String key, Long l11) {
            long longValue = l11.longValue();
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putLong(key, longValue);
        }
    }

    public static final class m extends W<Integer> {
        @Override // B4.W
        public final Integer a(Bundle bundle, String str) {
            Object a11 = V.a(bundle, "bundle", str, "key", str);
            Intrinsics.g(a11, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) a11;
        }

        @Override // B4.W
        public final String b() {
            return "reference";
        }

        @Override // B4.W
        /* renamed from: e */
        public final Integer g(String value) {
            int parseInt;
            Intrinsics.checkNotNullParameter(value, "value");
            if (kotlin.text.h.e0(value, "0x", false)) {
                String substring = value.substring(2);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                parseInt = Integer.parseInt(substring, CharsKt.checkRadix(16));
            } else {
                parseInt = Integer.parseInt(value);
            }
            return Integer.valueOf(parseInt);
        }

        @Override // B4.W
        public final void f(Bundle bundle, String key, Integer num) {
            int intValue = num.intValue();
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putInt(key, intValue);
        }
    }

    public static final class n extends AbstractC2574c<String[]> {
        @Override // B4.W
        public final Object a(Bundle bundle, String str) {
            return (String[]) V.a(bundle, "bundle", str, "key", str);
        }

        @Override // B4.W
        public final String b() {
            return "string[]";
        }

        @Override // B4.W
        public final Object d(Object obj, String value) {
            String[] strArr = (String[]) obj;
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(value, "value");
            return strArr != null ? (String[]) C7705l.V(strArr, new String[]{value}) : new String[]{value};
        }

        @Override // B4.W
        /* renamed from: e */
        public final Object g(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new String[]{value};
        }

        @Override // B4.W
        public final void f(Bundle bundle, String key, Object obj) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putStringArray(key, (String[]) obj);
        }

        @Override // B4.AbstractC2574c
        public final String[] g() {
            return new String[0];
        }
    }

    public static final class o extends AbstractC2574c<List<? extends String>> {
        @Override // B4.W
        public final Object a(Bundle bundle, String str) {
            String[] strArr = (String[]) V.a(bundle, "bundle", str, "key", str);
            if (strArr != null) {
                return C7705l.f0(strArr);
            }
            return null;
        }

        @Override // B4.W
        public final String b() {
            return "List<String>";
        }

        @Override // B4.W
        public final Object d(Object obj, String value) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(value, "value");
            if (list == null) {
                Intrinsics.checkNotNullParameter(value, "value");
                return C7714v.a0(value);
            }
            Intrinsics.checkNotNullParameter(value, "value");
            return C7714v.p0(C7714v.a0(value), list);
        }

        @Override // B4.W
        /* renamed from: e */
        public final Object g(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return C7714v.a0(value);
        }

        @Override // B4.W
        public final void f(Bundle bundle, String key, Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putStringArray(key, list != null ? (String[]) list.toArray(new String[0]) : null);
        }

        @Override // B4.AbstractC2574c
        public final List<? extends String> g() {
            return kotlin.collections.K.f71697a;
        }
    }

    public static final class p extends W<String> {
        @Override // B4.W
        public final String a(Bundle bundle, String str) {
            return (String) V.a(bundle, "bundle", str, "key", str);
        }

        @Override // B4.W
        public final String b() {
            return "string";
        }

        @Override // B4.W
        /* renamed from: e */
        public final String g(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.d(value, "null")) {
                return null;
            }
            return value;
        }

        @Override // B4.W
        public final void f(Bundle bundle, String key, String str) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putString(key, str);
        }
    }

    public static final class q<D extends Enum<?>> extends u<D> {

        /* renamed from: s, reason: collision with root package name */
        @NotNull
        private final Class<D> f2592s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(@NotNull Class<D> type) {
            super(0, type);
            Intrinsics.checkNotNullParameter(type, "type");
            if (type.isEnum()) {
                this.f2592s = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // B4.W.u, B4.W
        @NotNull
        public final String b() {
            String name = this.f2592s.getName();
            Intrinsics.checkNotNullExpressionValue(name, "type.name");
            return name;
        }

        @Override // B4.W.u
        @NotNull
        /* renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final D g(@NotNull String value) {
            D d11;
            Intrinsics.checkNotNullParameter(value, "value");
            Class<D> cls = this.f2592s;
            D[] enumConstants = cls.getEnumConstants();
            Intrinsics.checkNotNullExpressionValue(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    d11 = null;
                    break;
                }
                d11 = enumConstants[i11];
                if (kotlin.text.h.D(d11.name(), value, true)) {
                    break;
                }
                i11++;
            }
            D d12 = d11;
            if (d12 != null) {
                return d12;
            }
            StringBuilder b11 = C6594f.b("Enum value ", value, " not found for type ");
            b11.append(cls.getName());
            b11.append('.');
            throw new IllegalArgumentException(b11.toString());
        }
    }

    public static final class r<D extends Parcelable> extends W<D[]> {

        /* renamed from: r, reason: collision with root package name */
        @NotNull
        private final Class<D[]> f2593r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(@NotNull Class<D> type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            if (!Parcelable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
            }
            try {
                this.f2593r = (Class<D[]>) Class.forName("[L" + type.getName() + ';');
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // B4.W
        public final Object a(Bundle bundle, String str) {
            return (Parcelable[]) V.a(bundle, "bundle", str, "key", str);
        }

        @Override // B4.W
        @NotNull
        public final String b() {
            String name = this.f2593r.getName();
            Intrinsics.checkNotNullExpressionValue(name, "arrayType.name");
            return name;
        }

        @Override // B4.W
        /* renamed from: e */
        public final Object g(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !r.class.equals(obj.getClass())) {
                return false;
            }
            return Intrinsics.d(this.f2593r, ((r) obj).f2593r);
        }

        @Override // B4.W
        public final void f(Bundle bundle, String key, Object obj) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            this.f2593r.cast(parcelableArr);
            bundle.putParcelableArray(key, parcelableArr);
        }

        public final int hashCode() {
            return this.f2593r.hashCode();
        }
    }

    public static final class s<D> extends W<D> {

        /* renamed from: r, reason: collision with root package name */
        @NotNull
        private final Class<D> f2594r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(@NotNull Class<D> type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            if (Parcelable.class.isAssignableFrom(type) || Serializable.class.isAssignableFrom(type)) {
                this.f2594r = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Parcelable or Serializable.").toString());
        }

        @Override // B4.W
        public final D a(@NotNull Bundle bundle, @NotNull String str) {
            return (D) V.a(bundle, "bundle", str, "key", str);
        }

        @Override // B4.W
        @NotNull
        public final String b() {
            String name = this.f2594r.getName();
            Intrinsics.checkNotNullExpressionValue(name, "type.name");
            return name;
        }

        @Override // B4.W
        /* renamed from: e */
        public final D g(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !s.class.equals(obj.getClass())) {
                return false;
            }
            return Intrinsics.d(this.f2594r, ((s) obj).f2594r);
        }

        @Override // B4.W
        public final void f(@NotNull Bundle bundle, @NotNull String key, D d11) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            this.f2594r.cast(d11);
            if (d11 == null || (d11 instanceof Parcelable)) {
                bundle.putParcelable(key, (Parcelable) d11);
            } else if (d11 instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) d11);
            }
        }

        public final int hashCode() {
            return this.f2594r.hashCode();
        }
    }

    public static final class t<D extends Serializable> extends W<D[]> {

        /* renamed from: r, reason: collision with root package name */
        @NotNull
        private final Class<D[]> f2595r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(@NotNull Class<D> type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            try {
                this.f2595r = (Class<D[]>) Class.forName("[L" + type.getName() + ';');
            } catch (ClassNotFoundException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // B4.W
        public final Object a(Bundle bundle, String str) {
            return (Serializable[]) V.a(bundle, "bundle", str, "key", str);
        }

        @Override // B4.W
        @NotNull
        public final String b() {
            String name = this.f2595r.getName();
            Intrinsics.checkNotNullExpressionValue(name, "arrayType.name");
            return name;
        }

        @Override // B4.W
        /* renamed from: e */
        public final Object g(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !t.class.equals(obj.getClass())) {
                return false;
            }
            return Intrinsics.d(this.f2595r, ((t) obj).f2595r);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
        @Override // B4.W
        public final void f(Bundle bundle, String key, Object obj) {
            ?? r42 = (Serializable[]) obj;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            this.f2595r.cast(r42);
            bundle.putSerializable(key, r42);
        }

        public final int hashCode() {
            return this.f2595r.hashCode();
        }
    }

    public W(boolean z11) {
        this.f2591a = z11;
    }

    public abstract T a(@NotNull Bundle bundle, @NotNull String str);

    @NotNull
    public String b() {
        return "nav_type";
    }

    public final boolean c() {
        return this.f2591a;
    }

    public Object d(Object obj, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return g(value);
    }

    /* renamed from: e */
    public abstract T g(@NotNull String str);

    public abstract void f(@NotNull Bundle bundle, @NotNull String str, T t2);

    @NotNull
    public final String toString() {
        return b();
    }

    public static class u<D extends Serializable> extends W<D> {

        /* renamed from: r, reason: collision with root package name */
        @NotNull
        private final Class<D> f2596r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(@NotNull Class<D> type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            if (!Serializable.class.isAssignableFrom(type)) {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
            if (!type.isEnum()) {
                this.f2596r = type;
                return;
            }
            throw new IllegalArgumentException((type + " is an Enum. You should use EnumType instead.").toString());
        }

        @Override // B4.W
        public final Object a(Bundle bundle, String str) {
            return (Serializable) V.a(bundle, "bundle", str, "key", str);
        }

        @Override // B4.W
        @NotNull
        public String b() {
            String name = this.f2596r.getName();
            Intrinsics.checkNotNullExpressionValue(name, "type.name");
            return name;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            return Intrinsics.d(this.f2596r, ((u) obj).f2596r);
        }

        @Override // B4.W
        public final void f(Bundle bundle, String key, Object obj) {
            Serializable value = (Serializable) obj;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f2596r.cast(value);
            bundle.putSerializable(key, value);
        }

        @Override // B4.W
        @NotNull
        public D g(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public final int hashCode() {
            return this.f2596r.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(int i11, @NotNull Class type) {
            super(false);
            Intrinsics.checkNotNullParameter(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                this.f2596r = type;
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
    }
}
