package p2;

import android.content.Context;
import androidx.work.ListenableWorker;
import com.google.android.gms.internal.ads.RunnableC1699ve;
import f2.C1949g;
import java.util.UUID;
import q2.C2307j;

/* renamed from: p2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2254l implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f18714k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2307j f18715l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RunnableC2255m f18716m;

    public /* synthetic */ RunnableC2254l(RunnableC2255m runnableC2255m, C2307j c2307j, int i) {
        this.f18714k = i;
        this.f18716m = runnableC2255m;
        this.f18715l = c2307j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18714k) {
            case 0:
                this.f18715l.l(this.f18716m.f18721n.getForegroundInfoAsync());
                return;
            default:
                RunnableC2255m runnableC2255m = this.f18716m;
                C2307j c2307j = runnableC2255m.f18718k;
                ListenableWorker listenableWorker = runnableC2255m.f18721n;
                try {
                    C1949g c1949g = (C1949g) this.f18715l.get();
                    o2.i iVar = runnableC2255m.f18720m;
                    if (c1949g == null) {
                        throw new IllegalStateException("Worker was marked important (" + iVar.f18635c + ") but did not provide ForegroundInfo");
                    }
                    f2.m.d().a(RunnableC2255m.f18717q, "Updating notification for " + iVar.f18635c, new Throwable[0]);
                    listenableWorker.setRunInForeground(true);
                    C2256n c2256n = runnableC2255m.f18722o;
                    Context context = runnableC2255m.f18719l;
                    UUID id = listenableWorker.getId();
                    c2256n.getClass();
                    C2307j c2307j2 = new C2307j();
                    c2256n.f18724a.t(new RunnableC1699ve(c2256n, c2307j2, id, c1949g, context, 3));
                    c2307j.l(c2307j2);
                    return;
                } catch (Throwable th) {
                    c2307j.k(th);
                    return;
                }
        }
    }
}
