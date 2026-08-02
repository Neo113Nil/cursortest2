package n1;

import android.content.Context;
import androidx.work.ListenableWorker;
import o1.C1501k;
import w1.C1759x1;

/* renamed from: n1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1457l implements Runnable {

    /* renamed from: x, reason: collision with root package name */
    public static final String f15324x = d1.n.g("WorkForegroundRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final C1501k f15325a = new C1501k();

    /* renamed from: b, reason: collision with root package name */
    public final Context f15326b;

    /* renamed from: c, reason: collision with root package name */
    public final m1.i f15327c;

    /* renamed from: d, reason: collision with root package name */
    public final ListenableWorker f15328d;

    /* renamed from: e, reason: collision with root package name */
    public final C1458m f15329e;

    /* renamed from: f, reason: collision with root package name */
    public final C1759x1 f15330f;

    public RunnableC1457l(Context context, m1.i iVar, ListenableWorker listenableWorker, C1458m c1458m, C1759x1 c1759x1) {
        this.f15326b = context;
        this.f15327c = iVar;
        this.f15328d = listenableWorker;
        this.f15329e = c1458m;
        this.f15330f = c1759x1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f15327c.f15231q || L.b.b()) {
            this.f15325a.i(null);
            return;
        }
        C1501k c1501k = new C1501k();
        C1759x1 c1759x1 = this.f15330f;
        ((L.f) c1759x1.f17927d).execute(new RunnableC1456k(this, c1501k, 0));
        c1501k.addListener(new RunnableC1456k(this, c1501k, 1), (L.f) c1759x1.f17927d);
    }
}
