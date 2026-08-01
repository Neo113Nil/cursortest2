package sg.bigo.ads.X0;

import android.util.Pair;

/* renamed from: sg.bigo.ads.X0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5008c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12602a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ sg.bigo.ads.T0.p e;
    public final /* synthetic */ r f;

    public RunnableC5008c(r rVar, int i, int i2, String str, int i3, sg.bigo.ads.T0.p pVar) {
        this.f = rVar;
        this.f12602a = i;
        this.b = i2;
        this.c = str;
        this.d = i3;
        this.e = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar = (o) this.f.i.get(this.f12602a);
        if (oVar != null) {
            sg.bigo.ads.N.d c = ((sg.bigo.ads.b1.m) oVar.f12610a).c();
            this.f.i.remove(this.f12602a);
            int i = this.b;
            String str = this.c;
            if (i == 1005) {
                if (this.d == -6) {
                    i = 1004;
                    str = "The sdk integration and ad request are successful, but no ad wins at this time.";
                } else {
                    str = "Error from server: " + this.c;
                }
            }
            oVar.b.a(this.f12602a, i, this.d, str, Pair.create(c, this.e));
        }
        this.f.c();
    }
}
