package p2;

import androidx.work.impl.WorkDatabase;
import com.google.android.gms.internal.ads.G7;
import g2.C1978b;

/* renamed from: p2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2252j implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public static final String f18708n = f2.m.f("StopWorkRunnable");

    /* renamed from: k, reason: collision with root package name */
    public final g2.l f18709k;

    /* renamed from: l, reason: collision with root package name */
    public final String f18710l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f18711m;

    public RunnableC2252j(g2.l lVar, String str, boolean z3) {
        this.f18709k = lVar;
        this.f18710l = str;
        this.f18711m = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean containsKey;
        boolean k5;
        g2.l lVar = this.f18709k;
        WorkDatabase workDatabase = lVar.f17130m;
        C1978b c1978b = lVar.f17133p;
        G7 n5 = workDatabase.n();
        workDatabase.c();
        try {
            String str = this.f18710l;
            synchronized (c1978b.f17105u) {
                containsKey = c1978b.f17100p.containsKey(str);
            }
            if (this.f18711m) {
                k5 = this.f18709k.f17133p.j(this.f18710l);
            } else {
                if (!containsKey && n5.e(this.f18710l) == 2) {
                    n5.n(1, this.f18710l);
                }
                k5 = this.f18709k.f17133p.k(this.f18710l);
            }
            f2.m.d().a(f18708n, "StopWorkRunnable for " + this.f18710l + "; Processor.stopWork = " + k5, new Throwable[0]);
            workDatabase.h();
            workDatabase.f();
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
