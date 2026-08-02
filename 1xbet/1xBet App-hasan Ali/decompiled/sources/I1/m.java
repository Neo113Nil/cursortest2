package I1;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import s4.M;
import t3.AbstractC2425d;

/* loaded from: classes.dex */
public final class m implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f2596a;

    public m(k kVar) {
        this.f2596a = kVar;
    }

    public final void onBackCancelled() {
        k kVar = this.f2596a;
        m2.g gVar = kVar.f2575a;
        if (gVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!kVar.f2576b) {
            gVar.h(kVar, null);
        }
        g gVar2 = (g) gVar.f17995m;
        gVar2.getClass();
        if (kVar.equals(gVar2.f2583h) && -1 == gVar2.f2582g) {
            d dVar = gVar2.f;
            if (dVar == null) {
                dVar = gVar2.c(-1);
            }
            gVar2.f = null;
            gVar2.f2582g = 0;
            gVar2.f2583h = null;
            if (dVar != null) {
                dVar.a();
            }
            h hVar = h.f2589n;
            M m5 = gVar2.f2577a;
            m5.getClass();
            m5.j(null, hVar);
        }
        kVar.f2576b = false;
    }

    public final void onBackInvoked() {
        this.f2596a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        kotlin.jvm.internal.l.f("backEvent", backEvent);
        k kVar = this.f2596a;
        b d5 = AbstractC2425d.d(backEvent);
        kVar.getClass();
        m2.g gVar = kVar.f2575a;
        if (gVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (kVar.f2576b) {
            g gVar2 = (g) gVar.f17995m;
            gVar2.getClass();
            if (kVar.equals(gVar2.f2583h) && -1 == gVar2.f2582g) {
                d dVar = gVar2.f;
                if (dVar == null) {
                    dVar = gVar2.c(-1);
                }
                if (dVar != null) {
                    dVar.c(d5);
                }
                i iVar = new i(d5);
                M m5 = gVar2.f2577a;
                m5.getClass();
                m5.j(null, iVar);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.l.f("backEvent", backEvent);
        k kVar = this.f2596a;
        b d5 = AbstractC2425d.d(backEvent);
        kVar.getClass();
        m2.g gVar = kVar.f2575a;
        if (gVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (kVar.f2576b) {
            return;
        }
        gVar.h(kVar, d5);
        kVar.f2576b = true;
    }
}
