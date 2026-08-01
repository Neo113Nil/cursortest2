package sg.bigo.ads.S0;

import android.util.Pair;
import sg.bigo.ads.X0.v;
import sg.bigo.ads.X0.z;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class a extends sg.bigo.ads.P0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Pair f12535a;
    public final /* synthetic */ b b;

    public a(b bVar, Pair pair) {
        this.b = bVar;
        this.f12535a = pair;
    }

    @Override // sg.bigo.ads.P0.d
    public final void a(int i, int i2, int i3, String str, Object obj) {
        this.b.g.set(false);
        b bVar = this.b;
        Pair pair = this.f12535a;
        bVar.getClass();
        bVar.a(pair, i3 == 702 || i3 == 701 || i3 == 700);
    }

    @Override // sg.bigo.ads.P0.b
    public final void a(int i, String str) {
        this.b.g.set(false);
        z zVar = this.b.j;
        if (zVar != null) {
            AbstractC5446j.a(3, new v(zVar, i, str, true));
        }
        this.b.a(this.f12535a, false);
    }
}
