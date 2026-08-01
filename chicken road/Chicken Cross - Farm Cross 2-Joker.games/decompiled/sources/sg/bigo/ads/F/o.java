package sg.bigo.ads.F;

import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import android.widget.ImageView;
import sg.bigo.ads.api.Ad;

/* loaded from: classes3.dex */
public final class o implements sg.bigo.ads.Q.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.Q.c f12295a;
    public final /* synthetic */ q b;

    public o(q qVar, sg.bigo.ads.Q.c cVar) {
        this.b = qVar;
        this.f12295a = cVar;
    }

    @Override // sg.bigo.ads.Q.c
    public final void a(Ad ad, int i, int i2, String str) {
        r rVar = this.b.c;
        rVar.g++;
        if (i2 == 10103) {
            rVar.a(1, 1);
        } else {
            rVar.a(1, 4);
        }
        this.b.c.a(this.f12295a, 1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sg.bigo.ads.Q.c
    public final /* bridge */ /* synthetic */ void a(sg.bigo.ads.Q.b bVar, boolean z) {
    }

    @Override // sg.bigo.ads.Q.c
    public final void a(Ad ad) {
        sg.bigo.ads.Q.c cVar;
        r rVar = this.b.c;
        sg.bigo.ads.G.h hVar = rVar.e;
        boolean z = false;
        if (hVar == null) {
            rVar.g++;
            cVar = this.f12295a;
        } else {
            j jVar = rVar.b;
            if (jVar != null) {
                ImageView imageView = jVar.f12290a;
                sg.bigo.ads.C.l lVar = rVar.f12298a;
                if (lVar != null && lVar.t()) {
                    z = true;
                }
                FrameLayout frameLayout = hVar.b;
                if (frameLayout != null && imageView != null) {
                    new Handler(Looper.getMainLooper()).post(new b(z, frameLayout, imageView));
                }
            }
            this.b.c.a(1, 3);
            rVar = this.b.c;
            cVar = this.f12295a;
            z = true;
        }
        rVar.a(cVar, 1, z);
    }
}
