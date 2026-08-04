package K4;

import F2.C0247p;
import U5.C0443j;
import U5.W;
import U5.Y;
import U5.b0;
import java.util.BitSet;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final W f4050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final W f4051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final W f4052i;
    public static volatile String j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L4.f f4053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4.d f4054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4.b f4055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0247p f4056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f4058f;

    static {
        C0443j c0443j = b0.f6457d;
        BitSet bitSet = Y.f6448d;
        f4050g = new W("x-goog-api-client", c0443j);
        f4051h = new W("google-cloud-resource-prefix", c0443j);
        f4052i = new W("x-goog-request-params", c0443j);
        j = "gl-java/";
    }

    public r(L4.f fVar, C4.d dVar, C4.b bVar, H4.f fVar2, k kVar, C0247p c0247p) {
        this.f4053a = fVar;
        this.f4058f = kVar;
        this.f4054b = dVar;
        this.f4055c = bVar;
        this.f4056d = c0247p;
        this.f4057e = "projects/" + fVar2.f3313a + "/databases/" + fVar2.f3314b;
    }

    public final b0 a() {
        boolean zG;
        int i7;
        b0 b0Var = new b0();
        b0Var.f(f4050g, j + " fire/25.1.1 grpc/");
        b0Var.f(f4051h, this.f4057e);
        b0Var.f(f4052i, this.f4057e);
        k kVar = this.f4058f;
        if (kVar != null && kVar.f4030a.get() != null && kVar.f4031b.get() != null) {
            M4.d dVar = (M4.d) ((M4.g) kVar.f4030a.get());
            synchronized (dVar) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                M4.h hVar = (M4.h) dVar.f4585a.get();
                synchronized (hVar) {
                    zG = hVar.g(jCurrentTimeMillis);
                }
                if (zG) {
                    synchronized (hVar) {
                        String strD = hVar.d(System.currentTimeMillis());
                        hVar.f4591a.edit().putString("last-used-date", strD).commit();
                        hVar.f(strD);
                    }
                    i7 = 3;
                } else {
                    i7 = 1;
                }
            }
            int iE = p136t.e.e(i7);
            if (iE != 0) {
                b0Var.f(k.f4027d, Integer.toString(iE));
            }
            b0Var.f(k.f4028e, ((R4.b) kVar.f4031b.get()).a());
            Y3.l lVar = kVar.f4032c;
            if (lVar != null) {
                String str = lVar.f7673b;
                if (str.length() != 0) {
                    b0Var.f(k.f4029f, str);
                }
            }
        }
        return b0Var;
    }
}
