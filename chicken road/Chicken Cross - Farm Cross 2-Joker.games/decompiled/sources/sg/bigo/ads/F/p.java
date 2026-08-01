package sg.bigo.ads.F;

import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;

/* loaded from: classes3.dex */
public final class p implements sg.bigo.ads.Q.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.Q.c f12296a;
    public final /* synthetic */ q b;

    public p(q qVar, sg.bigo.ads.Q.c cVar) {
        this.b = qVar;
        this.f12296a = cVar;
    }

    @Override // sg.bigo.ads.Q.c
    public final void a(Ad ad, int i, int i2, String str) {
        NativeAd nativeAd = (NativeAd) ad;
        q qVar = this.b;
        qVar.c.g++;
        if (i2 == 1401 || i2 == 10074 || i2 == 10103 || i2 == 1300) {
            q.a(qVar, nativeAd, 1);
        } else {
            q.a(qVar, nativeAd, 4);
        }
        this.b.c.a(this.f12296a, 1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sg.bigo.ads.Q.c
    public final /* bridge */ /* synthetic */ void a(sg.bigo.ads.Q.b bVar, boolean z) {
    }

    @Override // sg.bigo.ads.Q.c
    public final void a(Ad ad) {
        NativeAd nativeAd = (NativeAd) ad;
        q qVar = this.b;
        r rVar = qVar.c;
        boolean z = false;
        if (rVar.e == null) {
            rVar.g++;
            rVar.a(this.f12296a, 1, false);
            return;
        }
        q.a(qVar, nativeAd, 3);
        this.b.c.e.a(nativeAd instanceof sg.bigo.ads.D.a);
        r rVar2 = this.b.c;
        sg.bigo.ads.G.h hVar = rVar2.e;
        sg.bigo.ads.C.l lVar = rVar2.f12298a;
        if (lVar != null && lVar.t()) {
            z = true;
        }
        MediaView mediaView = hVar.d;
        FrameLayout frameLayout = hVar.b;
        if (frameLayout != null && mediaView != null) {
            new Handler(Looper.getMainLooper()).post(new b(z, frameLayout, mediaView));
        }
        this.b.c.a(this.f12296a, 1, true);
    }
}
