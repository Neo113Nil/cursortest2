package sg.bigo.ads.X0;

import android.util.Pair;

/* renamed from: sg.bigo.ads.X0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5006a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f12600a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;

    public RunnableC5006a(o oVar, int i, int i2, String str) {
        this.f12600a = oVar;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12600a.b.a(0, this.b, this.c, this.d, new Pair((sg.bigo.ads.N.d) this.f12600a.f12610a, null));
    }
}
