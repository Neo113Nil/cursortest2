package t2;

import A1.InterfaceC0027k;
import E3.AbstractC0158p;
import E3.B;
import E3.L;
import E3.Q;

/* loaded from: classes.dex */
public class v implements InterfaceC0027k {

    /* renamed from: A, reason: collision with root package name */
    public final int f16417A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f16418B;

    /* renamed from: C, reason: collision with root package name */
    public final L f16419C;

    /* renamed from: D, reason: collision with root package name */
    public final int f16420D;

    /* renamed from: E, reason: collision with root package name */
    public final L f16421E;

    /* renamed from: F, reason: collision with root package name */
    public final int f16422F;

    /* renamed from: G, reason: collision with root package name */
    public final int f16423G;

    /* renamed from: H, reason: collision with root package name */
    public final int f16424H;

    /* renamed from: I, reason: collision with root package name */
    public final L f16425I;

    /* renamed from: J, reason: collision with root package name */
    public final L f16426J;

    /* renamed from: K, reason: collision with root package name */
    public final int f16427K;

    /* renamed from: L, reason: collision with root package name */
    public final int f16428L;

    /* renamed from: M, reason: collision with root package name */
    public final boolean f16429M;

    /* renamed from: N, reason: collision with root package name */
    public final boolean f16430N;

    /* renamed from: O, reason: collision with root package name */
    public final boolean f16431O;

    /* renamed from: P, reason: collision with root package name */
    public final Q f16432P;

    /* renamed from: Q, reason: collision with root package name */
    public final B f16433Q;

    /* renamed from: a, reason: collision with root package name */
    public final int f16434a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16435b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16436c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16437d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16438e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final int f16439f = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int f16440x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final int f16441y = 0;

    /* renamed from: z, reason: collision with root package name */
    public final int f16442z;

    static {
        new v(new u());
    }

    public v(u uVar) {
        this.f16434a = uVar.f16396a;
        this.f16435b = uVar.f16397b;
        this.f16436c = uVar.f16398c;
        this.f16437d = uVar.f16399d;
        this.f16442z = uVar.f16400e;
        this.f16417A = uVar.f16401f;
        this.f16418B = uVar.f16402g;
        this.f16419C = uVar.f16403h;
        this.f16420D = uVar.f16404i;
        this.f16421E = uVar.j;
        this.f16422F = uVar.f16405k;
        this.f16423G = uVar.f16406l;
        this.f16424H = uVar.f16407m;
        this.f16425I = uVar.f16408n;
        this.f16426J = uVar.f16409o;
        this.f16427K = uVar.f16410p;
        this.f16428L = uVar.f16411q;
        this.f16429M = uVar.f16412r;
        this.f16430N = uVar.f16413s;
        this.f16431O = uVar.f16414t;
        this.f16432P = Q.a(uVar.f16415u);
        this.f16433Q = B.D(uVar.f16416v);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f16434a == vVar.f16434a && this.f16435b == vVar.f16435b && this.f16436c == vVar.f16436c && this.f16437d == vVar.f16437d && this.f16438e == vVar.f16438e && this.f16439f == vVar.f16439f && this.f16440x == vVar.f16440x && this.f16441y == vVar.f16441y && this.f16418B == vVar.f16418B && this.f16442z == vVar.f16442z && this.f16417A == vVar.f16417A && this.f16419C.equals(vVar.f16419C) && this.f16420D == vVar.f16420D && this.f16421E.equals(vVar.f16421E) && this.f16422F == vVar.f16422F && this.f16423G == vVar.f16423G && this.f16424H == vVar.f16424H && this.f16425I.equals(vVar.f16425I) && this.f16426J.equals(vVar.f16426J) && this.f16427K == vVar.f16427K && this.f16428L == vVar.f16428L && this.f16429M == vVar.f16429M && this.f16430N == vVar.f16430N && this.f16431O == vVar.f16431O) {
            Q q7 = this.f16432P;
            q7.getClass();
            if (AbstractC0158p.b(q7, vVar.f16432P) && this.f16433Q.equals(vVar.f16433Q)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f16433Q.hashCode() + ((this.f16432P.hashCode() + ((((((((((((this.f16426J.hashCode() + ((this.f16425I.hashCode() + ((((((((this.f16421E.hashCode() + ((((this.f16419C.hashCode() + ((((((((((((((((((((((this.f16434a + 31) * 31) + this.f16435b) * 31) + this.f16436c) * 31) + this.f16437d) * 31) + this.f16438e) * 31) + this.f16439f) * 31) + this.f16440x) * 31) + this.f16441y) * 31) + (this.f16418B ? 1 : 0)) * 31) + this.f16442z) * 31) + this.f16417A) * 31)) * 31) + this.f16420D) * 31)) * 31) + this.f16422F) * 31) + this.f16423G) * 31) + this.f16424H) * 31)) * 31)) * 31) + this.f16427K) * 31) + this.f16428L) * 31) + (this.f16429M ? 1 : 0)) * 31) + (this.f16430N ? 1 : 0)) * 31) + (this.f16431O ? 1 : 0)) * 31)) * 31);
    }
}
