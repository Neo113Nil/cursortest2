package sg.bigo.ads.D;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;

/* loaded from: classes3.dex */
public class i extends sg.bigo.ads.C.l {
    public final sg.bigo.ads.T0.l k0;

    public i(sg.bigo.ads.P.j jVar) {
        super(jVar);
        sg.bigo.ads.T0.l lVar = jVar.b.w;
        this.k0 = lVar;
        this.f0 = lVar.c;
    }

    @Override // sg.bigo.ads.C.l
    public final void a(ViewGroup viewGroup, MediaView mediaView, View view, AdOptionsView adOptionsView, List list, int i, View... viewArr) {
        super.a(viewGroup, mediaView, view, adOptionsView, list, i, viewArr);
        if (this.k0.b) {
            sg.bigo.ads.C.f.a(viewGroup, viewGroup, i, this, this.f0);
        }
    }

    @Override // sg.bigo.ads.C.l, sg.bigo.ads.e.h
    public final void destroyInMainThread() {
        super.destroyInMainThread();
        if (this.H) {
            return;
        }
        this.H = true;
        sg.bigo.ads.s1.b.a(this.k.f12482a, SystemClock.elapsedRealtime() - this.w);
    }
}
