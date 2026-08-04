package X0;

import D6.B;
import D6.M;
import D6.t0;
import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public final class b implements h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final b f7423A;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f7424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f7425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f7426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f7427f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f7428x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f7429y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final b f7430z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7432b;

    static {
        int i7 = 0;
        f7424c = new b("NONE", i7);
        f7425d = new b("FULL", i7);
        int i8 = 1;
        f7426e = new b("VERTICAL", i8);
        f7427f = new b("HORIZONTAL", i8);
        int i9 = 2;
        f7428x = new b("FLAT", i9);
        f7429y = new b("HALF_OPENED", i9);
        int i10 = 3;
        f7430z = new b("FOLD", i10);
        f7423A = new b("HINGE", i10);
    }

    public /* synthetic */ b(String str, int i7) {
        this.f7431a = i7;
        this.f7432b = str;
    }

    public G6.g a(Activity activity) {
        k kVar = new k(this, activity, null);
        p065i6.j jVar = p065i6.j.f14074a;
        G6.c cVar = new G6.c(kVar, jVar, -2, 1);
        K6.d dVar = M.f1796a;
        t0 t0Var = I6.o.f3752a;
        if (t0Var.get(B.f1775b) == null) {
            return t0Var.equals(jVar) ? cVar : H6.l.a(cVar, t0Var, 0, 0, 6);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + t0Var).toString());
    }

    public String toString() {
        switch (this.f7431a) {
            case 0:
                return (String) this.f7432b;
            case 1:
                return (String) this.f7432b;
            case 2:
                return (String) this.f7432b;
            case 3:
                return (String) this.f7432b;
            default:
                return super.toString();
        }
    }

    public b(Y0.a aVar) {
        this.f7431a = 4;
        int i7 = o.f7459b;
        this.f7432b = aVar;
    }
}
