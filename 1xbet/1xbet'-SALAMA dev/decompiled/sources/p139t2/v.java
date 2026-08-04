package p139t2;

import A1.InterfaceC0027k;
import E3.AbstractC0158p;
import E3.B;
import E3.L;
import E3.Q;

/* JADX INFO: loaded from: classes.dex */
public class v implements InterfaceC0027k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f16423A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f16424B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final L f16425C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f16426D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final L f16427E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f16428F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f16429G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f16430H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final L f16431I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final L f16432J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int f16433K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f16434L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final boolean f16435M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final boolean f16436N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final boolean f16437O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final Q f16438P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final B f16439Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16444e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16445f = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f16446x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f16447y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f16448z;

    static {
        new v(new u());
    }

    public v(u uVar) {
        this.f16440a = uVar.f16402a;
        this.f16441b = uVar.f16403b;
        this.f16442c = uVar.f16404c;
        this.f16443d = uVar.f16405d;
        this.f16448z = uVar.f16406e;
        this.f16423A = uVar.f16407f;
        this.f16424B = uVar.f16408g;
        this.f16425C = uVar.f16409h;
        this.f16426D = uVar.f16410i;
        this.f16427E = uVar.j;
        this.f16428F = uVar.f16411k;
        this.f16429G = uVar.f16412l;
        this.f16430H = uVar.f16413m;
        this.f16431I = uVar.f16414n;
        this.f16432J = uVar.f16415o;
        this.f16433K = uVar.f16416p;
        this.f16434L = uVar.f16417q;
        this.f16435M = uVar.f16418r;
        this.f16436N = uVar.f16419s;
        this.f16437O = uVar.f16420t;
        this.f16438P = Q.a(uVar.f16421u);
        this.f16439Q = B.D(uVar.f16422v);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f16440a == vVar.f16440a && this.f16441b == vVar.f16441b && this.f16442c == vVar.f16442c && this.f16443d == vVar.f16443d && this.f16444e == vVar.f16444e && this.f16445f == vVar.f16445f && this.f16446x == vVar.f16446x && this.f16447y == vVar.f16447y && this.f16424B == vVar.f16424B && this.f16448z == vVar.f16448z && this.f16423A == vVar.f16423A && this.f16425C.equals(vVar.f16425C) && this.f16426D == vVar.f16426D && this.f16427E.equals(vVar.f16427E) && this.f16428F == vVar.f16428F && this.f16429G == vVar.f16429G && this.f16430H == vVar.f16430H && this.f16431I.equals(vVar.f16431I) && this.f16432J.equals(vVar.f16432J) && this.f16433K == vVar.f16433K && this.f16434L == vVar.f16434L && this.f16435M == vVar.f16435M && this.f16436N == vVar.f16436N && this.f16437O == vVar.f16437O) {
            Q q7 = this.f16438P;
            q7.getClass();
            if (AbstractC0158p.b(q7, vVar.f16438P) && this.f16439Q.equals(vVar.f16439Q)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f16439Q.hashCode() + ((this.f16438P.hashCode() + ((((((((((((this.f16432J.hashCode() + ((this.f16431I.hashCode() + ((((((((this.f16427E.hashCode() + ((((this.f16425C.hashCode() + ((((((((((((((((((((((this.f16440a + 31) * 31) + this.f16441b) * 31) + this.f16442c) * 31) + this.f16443d) * 31) + this.f16444e) * 31) + this.f16445f) * 31) + this.f16446x) * 31) + this.f16447y) * 31) + (this.f16424B ? 1 : 0)) * 31) + this.f16448z) * 31) + this.f16423A) * 31)) * 31) + this.f16426D) * 31)) * 31) + this.f16428F) * 31) + this.f16429G) * 31) + this.f16430H) * 31)) * 31)) * 31) + this.f16433K) * 31) + this.f16434L) * 31) + (this.f16435M ? 1 : 0)) * 31) + (this.f16436N ? 1 : 0)) * 31) + (this.f16437O ? 1 : 0)) * 31)) * 31);
    }
}
