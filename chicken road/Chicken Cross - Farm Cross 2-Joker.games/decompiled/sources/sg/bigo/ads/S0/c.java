package sg.bigo.ads.S0;

import android.util.Pair;

/* loaded from: classes3.dex */
public final class c extends sg.bigo.ads.P0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Pair f12536a;
    public final /* synthetic */ d b;

    public c(d dVar, Pair pair) {
        this.b = dVar;
        this.f12536a = pair;
    }

    @Override // sg.bigo.ads.P0.d
    public final void a(int i, int i2, int i3, String str, Object obj) {
        this.b.g.set(false);
        d dVar = this.b;
        Pair pair = this.f12536a;
        dVar.getClass();
        dVar.a(pair, i3 == 702 || i3 == 701 || i3 == 700);
    }

    @Override // sg.bigo.ads.P0.b
    public final void a(int i, String str) {
        this.b.g.set(false);
        this.b.a(this.f12536a, false);
    }
}
