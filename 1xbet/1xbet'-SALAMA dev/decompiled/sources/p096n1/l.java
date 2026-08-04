package p096n1;

import L.b;
import L.f;
import android.content.Context;
import androidx.work.ListenableWorker;
import p023d1.n;
import p088m1.i;
import p103o1.k;
import p155w1.C1050x1;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f15330x = n.g("WorkForegroundRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f15331a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f15332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f15333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ListenableWorker f15334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f15335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1050x1 f15336f;

    public l(Context context, i iVar, ListenableWorker listenableWorker, m mVar, C1050x1 c1050x1) {
        this.f15332b = context;
        this.f15333c = iVar;
        this.f15334d = listenableWorker;
        this.f15335e = mVar;
        this.f15336f = c1050x1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f15333c.f15237q || b.b()) {
            this.f15331a.i(null);
            return;
        }
        k kVar = new k();
        C1050x1 c1050x1 = this.f15336f;
        ((f) c1050x1.f17933d).execute(new k(this, kVar, 0));
        kVar.addListener(new k(this, kVar, 1), (f) c1050x1.f17933d);
    }
}
