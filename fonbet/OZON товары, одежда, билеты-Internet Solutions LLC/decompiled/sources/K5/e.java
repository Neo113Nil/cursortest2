package K5;

import I5.j;
import I5.k;
import I5.l;
import Ij.C3261b;
import M5.C3614j;
import java.util.List;
import java.util.Locale;
import spay.sdk.domain.model.FraudMonInfo;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final List<J5.c> f15227a;

    /* renamed from: b, reason: collision with root package name */
    private final B5.g f15228b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15229c;

    /* renamed from: d, reason: collision with root package name */
    private final long f15230d;

    /* renamed from: e, reason: collision with root package name */
    private final a f15231e;

    /* renamed from: f, reason: collision with root package name */
    private final long f15232f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15233g;

    /* renamed from: h, reason: collision with root package name */
    private final List<J5.i> f15234h;

    /* renamed from: i, reason: collision with root package name */
    private final l f15235i;

    /* renamed from: j, reason: collision with root package name */
    private final int f15236j;

    /* renamed from: k, reason: collision with root package name */
    private final int f15237k;

    /* renamed from: l, reason: collision with root package name */
    private final int f15238l;

    /* renamed from: m, reason: collision with root package name */
    private final float f15239m;

    /* renamed from: n, reason: collision with root package name */
    private final float f15240n;

    /* renamed from: o, reason: collision with root package name */
    private final float f15241o;

    /* renamed from: p, reason: collision with root package name */
    private final float f15242p;

    /* renamed from: q, reason: collision with root package name */
    private final j f15243q;

    /* renamed from: r, reason: collision with root package name */
    private final k f15244r;

    /* renamed from: s, reason: collision with root package name */
    private final I5.b f15245s;

    /* renamed from: t, reason: collision with root package name */
    private final List<P5.a<Float>> f15246t;

    /* renamed from: u, reason: collision with root package name */
    private final b f15247u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f15248v;

    /* renamed from: w, reason: collision with root package name */
    private final J5.a f15249w;

    /* renamed from: x, reason: collision with root package name */
    private final C3614j f15250x;

    /* renamed from: y, reason: collision with root package name */
    private final J5.h f15251y;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a IMAGE;
        public static final a NULL;
        public static final a PRE_COMP;
        public static final a SHAPE;
        public static final a SOLID;
        public static final a TEXT;
        public static final a UNKNOWN;

        static {
            a aVar = new a("PRE_COMP", 0);
            PRE_COMP = aVar;
            a aVar2 = new a("SOLID", 1);
            SOLID = aVar2;
            a aVar3 = new a("IMAGE", 2);
            IMAGE = aVar3;
            a aVar4 = new a("NULL", 3);
            NULL = aVar4;
            a aVar5 = new a("SHAPE", 4);
            SHAPE = aVar5;
            a aVar6 = new a("TEXT", 5);
            TEXT = aVar6;
            a aVar7 = new a(FraudMonInfo.UNKNOWN, 6);
            UNKNOWN = aVar7;
            $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b ADD;
        public static final b INVERT;
        public static final b LUMA;
        public static final b LUMA_INVERTED;
        public static final b NONE;
        public static final b UNKNOWN;

        static {
            b bVar = new b("NONE", 0);
            NONE = bVar;
            b bVar2 = new b("ADD", 1);
            ADD = bVar2;
            b bVar3 = new b("INVERT", 2);
            INVERT = bVar3;
            b bVar4 = new b("LUMA", 3);
            LUMA = bVar4;
            b bVar5 = new b("LUMA_INVERTED", 4);
            LUMA_INVERTED = bVar5;
            b bVar6 = new b(FraudMonInfo.UNKNOWN, 5);
            UNKNOWN = bVar6;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public e(List<J5.c> list, B5.g gVar, String str, long j11, a aVar, long j12, String str2, List<J5.i> list2, l lVar, int i11, int i12, int i13, float f7, float f11, float f12, float f13, j jVar, k kVar, List<P5.a<Float>> list3, b bVar, I5.b bVar2, boolean z11, J5.a aVar2, C3614j c3614j, J5.h hVar) {
        this.f15227a = list;
        this.f15228b = gVar;
        this.f15229c = str;
        this.f15230d = j11;
        this.f15231e = aVar;
        this.f15232f = j12;
        this.f15233g = str2;
        this.f15234h = list2;
        this.f15235i = lVar;
        this.f15236j = i11;
        this.f15237k = i12;
        this.f15238l = i13;
        this.f15239m = f7;
        this.f15240n = f11;
        this.f15241o = f12;
        this.f15242p = f13;
        this.f15243q = jVar;
        this.f15244r = kVar;
        this.f15246t = list3;
        this.f15247u = bVar;
        this.f15245s = bVar2;
        this.f15248v = z11;
        this.f15249w = aVar2;
        this.f15250x = c3614j;
        this.f15251y = hVar;
    }

    public final J5.h a() {
        return this.f15251y;
    }

    public final J5.a b() {
        return this.f15249w;
    }

    final B5.g c() {
        return this.f15228b;
    }

    public final C3614j d() {
        return this.f15250x;
    }

    public final long e() {
        return this.f15230d;
    }

    final List<P5.a<Float>> f() {
        return this.f15246t;
    }

    public final a g() {
        return this.f15231e;
    }

    final List<J5.i> h() {
        return this.f15234h;
    }

    final b i() {
        return this.f15247u;
    }

    public final String j() {
        return this.f15229c;
    }

    final long k() {
        return this.f15232f;
    }

    final float l() {
        return this.f15242p;
    }

    final float m() {
        return this.f15241o;
    }

    public final String n() {
        return this.f15233g;
    }

    final List<J5.c> o() {
        return this.f15227a;
    }

    final int p() {
        return this.f15238l;
    }

    final int q() {
        return this.f15237k;
    }

    final int r() {
        return this.f15236j;
    }

    final float s() {
        return this.f15240n / this.f15228b.e();
    }

    final j t() {
        return this.f15243q;
    }

    public final String toString() {
        return z("");
    }

    final k u() {
        return this.f15244r;
    }

    final I5.b v() {
        return this.f15245s;
    }

    final float w() {
        return this.f15239m;
    }

    final l x() {
        return this.f15235i;
    }

    public final boolean y() {
        return this.f15248v;
    }

    public final String z(String str) {
        int i11;
        StringBuilder e11 = C3261b.e(str);
        e11.append(this.f15229c);
        e11.append("\n");
        long j11 = this.f15232f;
        B5.g gVar = this.f15228b;
        e t2 = gVar.t(j11);
        if (t2 != null) {
            e11.append("\t\tParents: ");
            e11.append(t2.f15229c);
            for (e t11 = gVar.t(t2.f15232f); t11 != null; t11 = gVar.t(t11.f15232f)) {
                e11.append("->");
                e11.append(t11.f15229c);
            }
            e11.append(str);
            e11.append("\n");
        }
        List<J5.i> list = this.f15234h;
        if (!list.isEmpty()) {
            e11.append(str);
            e11.append("\tMasks: ");
            e11.append(list.size());
            e11.append("\n");
        }
        int i12 = this.f15236j;
        if (i12 != 0 && (i11 = this.f15237k) != 0) {
            e11.append(str);
            e11.append("\tBackground: ");
            e11.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i12), Integer.valueOf(i11), Integer.valueOf(this.f15238l)));
        }
        List<J5.c> list2 = this.f15227a;
        if (!list2.isEmpty()) {
            e11.append(str);
            e11.append("\tShapes:\n");
            for (J5.c cVar : list2) {
                e11.append(str);
                e11.append("\t\t");
                e11.append(cVar);
                e11.append("\n");
            }
        }
        return e11.toString();
    }
}
