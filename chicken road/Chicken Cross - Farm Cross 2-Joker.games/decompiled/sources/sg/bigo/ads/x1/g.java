package sg.bigo.ads.x1;

import android.content.Context;

/* loaded from: classes3.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f13391a;
    public final /* synthetic */ q b;
    public final /* synthetic */ f c;

    public g(f fVar, Context context, q qVar) {
        this.c = fVar;
        this.f13391a = context;
        this.b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f.a(this.c, this.f13391a, "impl_track", this.b);
    }
}
