package sg.bigo.ads.s0;

import android.graphics.Bitmap;

/* renamed from: sg.bigo.ads.s0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5462b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.U.c f13285a;
    public final /* synthetic */ long b;
    public final /* synthetic */ RunnableC5463c c;

    public RunnableC5462b(RunnableC5463c runnableC5463c, sg.bigo.ads.U.c cVar, long j) {
        this.c = runnableC5463c;
        this.f13285a = cVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RunnableC5463c runnableC5463c = this.c;
        z zVar = runnableC5463c.d;
        sg.bigo.ads.U.c cVar = this.f13285a;
        Bitmap bitmap = cVar.f12561a;
        String str = cVar.b;
        zVar.a(bitmap, new y(0, str, this.b, cVar.c, runnableC5463c.e, null, null, str));
    }
}
