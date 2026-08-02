package n1;

import androidx.work.impl.WorkDatabase;
import c5.C0820a;
import e1.C0995b;

/* renamed from: n1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1454i implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final String f15315d = d1.n.g("StopWorkRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final e1.l f15316a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15317b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15318c;

    public RunnableC1454i(e1.l lVar, String str, boolean z4) {
        this.f15316a = lVar;
        this.f15317b = str;
        this.f15318c = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean containsKey;
        boolean j;
        e1.l lVar = this.f15316a;
        WorkDatabase workDatabase = lVar.f12546f;
        C0995b c0995b = lVar.f12549z;
        C0820a n2 = workDatabase.n();
        workDatabase.c();
        try {
            String str = this.f15317b;
            synchronized (c0995b.f12510B) {
                containsKey = c0995b.f12516f.containsKey(str);
            }
            if (this.f15318c) {
                j = this.f15316a.f12549z.i(this.f15317b);
            } else {
                if (!containsKey && n2.h(this.f15317b) == 2) {
                    n2.u(1, this.f15317b);
                }
                j = this.f15316a.f12549z.j(this.f15317b);
            }
            d1.n.d().b(f15315d, "StopWorkRunnable for " + this.f15317b + "; Processor.stopWork = " + j, new Throwable[0]);
            workDatabase.h();
            workDatabase.f();
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
