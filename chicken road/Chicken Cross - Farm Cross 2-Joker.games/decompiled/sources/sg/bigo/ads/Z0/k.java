package sg.bigo.ads.Z0;

import android.os.SystemClock;
import android.text.TextUtils;
import sg.bigo.ads.X0.o;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public abstract class k implements sg.bigo.ads.P0.c {
    public sg.bigo.ads.P.c[] c;
    public sg.bigo.ads.P.c[] d;
    public final String g;
    public o i;
    public final sg.bigo.ads.N.d j;
    public final l k;
    public final /* synthetic */ l m;

    /* renamed from: a, reason: collision with root package name */
    public boolean f12662a = false;
    public boolean b = false;
    public boolean e = false;
    public boolean f = false;
    public final j l = new j(this);
    public final long h = SystemClock.elapsedRealtime();

    public k(l lVar, l lVar2, sg.bigo.ads.N.d dVar, String str) {
        this.m = lVar;
        this.g = str;
        this.k = lVar2;
        this.j = dVar;
    }

    public final void a() {
        AbstractC5446j.a(this.l);
        if (this.f) {
            return;
        }
        this.f = true;
        o oVar = this.i;
        if (oVar == null) {
            return;
        }
        String str = ((sg.bigo.ads.N.d) oVar.f12610a).h.b;
    }

    public final String b() {
        o oVar = this.i;
        String d = oVar == null ? null : ((sg.bigo.ads.N.d) oVar.f12610a).d();
        return TextUtils.isEmpty(d) ? this.g : d;
    }
}
