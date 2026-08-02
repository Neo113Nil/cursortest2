package n1;

import W5.A1;
import android.content.Context;
import androidx.work.ListenableWorker;
import d1.C0955h;
import java.util.UUID;
import o1.C1501k;

/* renamed from: n1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1456k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15321a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1501k f15322b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RunnableC1457l f15323c;

    public /* synthetic */ RunnableC1456k(RunnableC1457l runnableC1457l, C1501k c1501k, int i7) {
        this.f15321a = i7;
        this.f15323c = runnableC1457l;
        this.f15322b = c1501k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15321a) {
            case 0:
                this.f15322b.k(this.f15323c.f15328d.getForegroundInfoAsync());
                return;
            default:
                RunnableC1457l runnableC1457l = this.f15323c;
                try {
                    C0955h c0955h = (C0955h) this.f15322b.get();
                    if (c0955h == null) {
                        throw new IllegalStateException("Worker was marked important (" + runnableC1457l.f15327c.f15218c + ") but did not provide ForegroundInfo");
                    }
                    d1.n d7 = d1.n.d();
                    String str = RunnableC1457l.f15324x;
                    m1.i iVar = runnableC1457l.f15327c;
                    ListenableWorker listenableWorker = runnableC1457l.f15328d;
                    d7.b(str, "Updating notification for " + iVar.f15218c, new Throwable[0]);
                    listenableWorker.setRunInForeground(true);
                    C1501k c1501k = runnableC1457l.f15325a;
                    C1458m c1458m = runnableC1457l.f15329e;
                    Context context = runnableC1457l.f15326b;
                    UUID id = listenableWorker.getId();
                    c1458m.getClass();
                    C1501k c1501k2 = new C1501k();
                    c1458m.f15331a.G(new A1(c1458m, c1501k2, id, c0955h, context, 3));
                    c1501k.k(c1501k2);
                    return;
                } catch (Throwable th) {
                    runnableC1457l.f15325a.j(th);
                    return;
                }
        }
    }
}
