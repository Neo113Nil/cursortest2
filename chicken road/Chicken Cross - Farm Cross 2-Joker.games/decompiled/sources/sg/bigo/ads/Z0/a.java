package sg.bigo.ads.Z0;

import android.util.Pair;

/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12653a;
    public final /* synthetic */ k b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Pair e;
    public final /* synthetic */ b f;

    public a(b bVar, int i, k kVar, int i2, String str, int i3, Pair pair) {
        this.f = bVar;
        this.f12653a = i;
        this.b = kVar;
        this.c = str;
        this.d = i3;
        this.e = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sg.bigo.ads.T0.g gVar;
        sg.bigo.ads.T0.g gVar2;
        int i = this.f12653a;
        b bVar = this.f;
        if (bVar.f12662a && (gVar2 = sg.bigo.ads.O.g.f12472a) != null) {
            boolean b = gVar2.L.b(bVar.n);
            sg.bigo.ads.T0.b a2 = gVar2.L.a(this.f.n);
            int i2 = a2 != null ? a2.f : 0;
            if (!b || i2 > 2) {
                if (i != 10207 && i != 10208) {
                    i = 10211;
                }
                int i3 = i;
                b bVar2 = this.f;
                bVar2.o.a(this.b, 1011, i3, this.c, bVar2.i == null ? null : new Pair((sg.bigo.ads.N.d) this.f.i.f12610a, null));
                return;
            }
        }
        b bVar3 = this.f;
        if (bVar3.b && (gVar = sg.bigo.ads.O.g.f12472a) != null) {
            boolean b2 = gVar.L.b(bVar3.n);
            sg.bigo.ads.T0.b a3 = gVar.L.a(this.f.n);
            int i4 = a3 != null ? a3.g : 0;
            if (!b2 || i4 > 2) {
                if (i != 10207 && i != 10208) {
                    i = 10212;
                }
                int i5 = i;
                b bVar4 = this.f;
                bVar4.o.a(this.b, 1011, i5, this.c, bVar4.i == null ? null : new Pair((sg.bigo.ads.N.d) this.f.i.f12610a, null));
                return;
            }
        }
        this.f.o.a(this.b, this.d, i, this.c, this.e);
    }
}
