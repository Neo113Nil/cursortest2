package p096n1;

import W5.A1;
import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.UUID;
import p023d1.h;
import p023d1.n;
import p088m1.i;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p103o1.k f15328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f15329c;

    public /* synthetic */ k(l lVar, p103o1.k kVar, int i7) {
        this.f15327a = i7;
        this.f15329c = lVar;
        this.f15328b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15327a) {
            case 0:
                this.f15328b.k(this.f15329c.f15334d.getForegroundInfoAsync());
                return;
            default:
                l lVar = this.f15329c;
                try {
                    h hVar = (h) this.f15328b.get();
                    if (hVar == null) {
                        throw new IllegalStateException("Worker was marked important (" + lVar.f15333c.f15224c + ") but did not provide ForegroundInfo");
                    }
                    n nVarD = n.d();
                    String str = l.f15330x;
                    i iVar = lVar.f15333c;
                    ListenableWorker listenableWorker = lVar.f15334d;
                    nVarD.b(str, "Updating notification for " + iVar.f15224c, new Throwable[0]);
                    listenableWorker.setRunInForeground(true);
                    p103o1.k kVar = lVar.f15331a;
                    m mVar = lVar.f15335e;
                    Context context = lVar.f15332b;
                    UUID id = listenableWorker.getId();
                    mVar.getClass();
                    p103o1.k kVar2 = new p103o1.k();
                    mVar.f15337a.G(new A1(mVar, kVar2, id, hVar, context, 3));
                    kVar.k(kVar2);
                    return;
                } catch (Throwable th) {
                    lVar.f15331a.j(th);
                    return;
                }
        }
    }
}
