package sg.bigo.ads.x1;

import android.content.Context;

/* loaded from: classes3.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f13394a;
    public final /* synthetic */ q b;
    public final /* synthetic */ f c;

    public j(f fVar, Context context, q qVar) {
        this.c = fVar;
        this.f13394a = context;
        this.b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f.a(this.c, this.f13394a, "lurl_track", this.b);
    }
}
