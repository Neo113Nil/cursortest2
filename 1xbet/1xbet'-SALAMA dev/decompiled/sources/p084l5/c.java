package p084l5;

import A5.f;
import A5.j;
import A5.s;
import android.content.Context;
import android.net.ConnectivityManager;
import p155w1.C1052y0;
import p159w5.b;

/* JADX INFO: loaded from: classes2.dex */
public class c implements p159w5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f15041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f15042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f15043c;

    @Override // p159w5.c
    public final void onAttachedToEngine(b bVar) {
        f fVar = bVar.f18083c;
        this.f15041a = new s(fVar, "dev.fluttercommunity.plus/connectivity");
        this.f15042b = new j(fVar, "dev.fluttercommunity.plus/connectivity_status");
        Context context = bVar.f18081a;
        p145u1.c cVar = new p145u1.c((ConnectivityManager) context.getSystemService("connectivity"), 21);
        C1052y0 c1052y0 = new C1052y0(cVar, 18);
        this.f15043c = new b(context, cVar);
        this.f15041a.b(c1052y0);
        this.f15042b.a(this.f15043c);
    }

    @Override // p159w5.c
    public final void onDetachedFromEngine(b bVar) {
        this.f15041a.b(null);
        this.f15042b.a(null);
        this.f15043c.b();
        this.f15041a = null;
        this.f15042b = null;
        this.f15043c = null;
    }
}
