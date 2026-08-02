package H0;

import c0.C0534c;
import i0.J;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2143l;

    /* renamed from: m, reason: collision with root package name */
    public static final r f2129m = new r(2, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final r f2130n = new r(2, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final r f2131o = new r(2, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final r f2132p = new r(2, 3);

    /* renamed from: q, reason: collision with root package name */
    public static final r f2133q = new r(2, 4);

    /* renamed from: r, reason: collision with root package name */
    public static final r f2134r = new r(2, 5);

    /* renamed from: s, reason: collision with root package name */
    public static final r f2135s = new r(2, 6);

    /* renamed from: t, reason: collision with root package name */
    public static final r f2136t = new r(2, 7);

    /* renamed from: u, reason: collision with root package name */
    public static final r f2137u = new r(2, 8);

    /* renamed from: v, reason: collision with root package name */
    public static final r f2138v = new r(2, 9);

    /* renamed from: w, reason: collision with root package name */
    public static final r f2139w = new r(2, 10);

    /* renamed from: x, reason: collision with root package name */
    public static final r f2140x = new r(2, 11);

    /* renamed from: y, reason: collision with root package name */
    public static final r f2141y = new r(2, 12);

    /* renamed from: z, reason: collision with root package name */
    public static final r f2142z = new r(2, 13);

    /* renamed from: A, reason: collision with root package name */
    public static final r f2124A = new r(2, 14);

    /* renamed from: B, reason: collision with root package name */
    public static final r f2125B = new r(2, 15);

    /* renamed from: C, reason: collision with root package name */
    public static final r f2126C = new r(2, 16);

    /* renamed from: D, reason: collision with root package name */
    public static final r f2127D = new r(2, 17);

    /* renamed from: E, reason: collision with root package name */
    public static final r f2128E = new r(2, 18);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i, int i5) {
        super(i);
        this.f2143l = i5;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        String str;
        W3.c cVar;
        switch (this.f2143l) {
            case 0:
                return (C0534c) obj;
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList n02 = X3.m.n0(list);
                n02.addAll(list2);
                return n02;
            case 2:
                return (c0.k) obj;
            case 3:
                return (W3.o) obj;
            case 4:
                return (W3.o) obj;
            case 5:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 6:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 7:
                return (W3.o) obj;
            case 8:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 9:
                g gVar = (g) obj;
                int i = ((g) obj2).f2074a;
                return gVar;
            case 10:
                return (J) obj;
            case 11:
                return (String) obj;
            case 12:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList n03 = X3.m.n0(list3);
                n03.addAll(list4);
                return n03;
            case 13:
                Float f = (Float) obj;
                ((Number) obj2).floatValue();
                return f;
            case 14:
                return (String) obj;
            case 15:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 16:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.f2062a) == null) {
                    str = aVar2.f2062a;
                }
                if (aVar == null || (cVar = aVar.f2063b) == null) {
                    cVar = aVar2.f2063b;
                }
                return new a(str, cVar);
            case 17:
                return obj == null ? obj2 : obj;
            default:
                n nVar = (n) obj2;
                j jVar = ((n) obj).f2114d;
                v vVar = s.f2173s;
                Object g5 = jVar.f2103k.g(vVar);
                if (g5 == null) {
                    g5 = Float.valueOf(0.0f);
                }
                float floatValue = ((Number) g5).floatValue();
                Object g6 = nVar.f2114d.f2103k.g(vVar);
                if (g6 == null) {
                    g6 = Float.valueOf(0.0f);
                }
                return Integer.valueOf(Float.compare(floatValue, ((Number) g6).floatValue()));
        }
    }
}
