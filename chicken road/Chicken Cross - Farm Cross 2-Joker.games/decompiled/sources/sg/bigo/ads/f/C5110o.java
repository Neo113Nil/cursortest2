package sg.bigo.ads.f;

import android.os.Handler;

/* renamed from: sg.bigo.ads.f.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5110o implements sg.bigo.ads.Q.a {
    public final sg.bigo.ads.Q.a b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f12772a = false;
    public final Handler c = new Handler();

    public C5110o(sg.bigo.ads.Q.a aVar) {
        this.b = aVar;
    }

    @Override // sg.bigo.ads.Q.a
    public final void a(sg.bigo.ads.P.d dVar) {
        if (this.f12772a) {
            return;
        }
        this.c.removeCallbacks(null);
        this.f12772a = true;
        sg.bigo.ads.Q.a aVar = this.b;
        if (aVar != null) {
            aVar.a(dVar);
        }
    }

    @Override // sg.bigo.ads.Q.a
    public final void a() {
        if (this.f12772a) {
            return;
        }
        this.c.removeCallbacks(null);
        this.f12772a = true;
        sg.bigo.ads.Q.a aVar = this.b;
        if (aVar != null) {
            aVar.a();
        }
    }
}
