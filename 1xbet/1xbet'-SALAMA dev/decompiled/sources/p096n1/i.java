package p096n1;

import androidx.work.impl.WorkDatabase;
import p019c5.a;
import p023d1.n;
import p031e1.b;
import p031e1.l;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f15321d = n.g("StopWorkRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f15322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15324c;

    public i(l lVar, String str, boolean z4) {
        this.f15322a = lVar;
        this.f15323b = str;
        this.f15324c = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zContainsKey;
        boolean zJ;
        l lVar = this.f15322a;
        WorkDatabase workDatabase = lVar.f12552f;
        b bVar = lVar.f12555z;
        a aVarN = workDatabase.n();
        workDatabase.c();
        try {
            String str = this.f15323b;
            synchronized (bVar.f12516B) {
                zContainsKey = bVar.f12522f.containsKey(str);
            }
            if (this.f15324c) {
                zJ = this.f15322a.f12555z.i(this.f15323b);
            } else {
                if (!zContainsKey && aVarN.h(this.f15323b) == 2) {
                    aVarN.u(1, this.f15323b);
                }
                zJ = this.f15322a.f12555z.j(this.f15323b);
            }
            n.d().b(f15321d, "StopWorkRunnable for " + this.f15323b + "; Processor.stopWork = " + zJ, new Throwable[0]);
            workDatabase.h();
            workDatabase.f();
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
