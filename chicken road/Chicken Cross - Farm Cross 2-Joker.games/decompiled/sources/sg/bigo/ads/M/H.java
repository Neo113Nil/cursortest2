package sg.bigo.ads.M;

import android.graphics.Bitmap;
import java.util.HashSet;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.P1;

/* loaded from: classes3.dex */
public final class H implements P1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q f12427a;

    public H(Q q) {
        this.f12427a = q;
    }

    @Override // sg.bigo.ads.h.P1
    public final void a() {
        Bitmap bitmap = C5002t.p;
        boolean p = ((sg.bigo.ads.U0.k) ((InterfaceC5087a) this.f12427a.l.e())).p();
        if (bitmap != null) {
            if (p) {
                HashSet hashSet = Q.r;
                synchronized (hashSet) {
                    hashSet.remove(this.f12427a.h);
                }
            }
            sg.bigo.ads.v.f fVar = this.f12427a.h;
            ((MediaView) fVar.g).post(new sg.bigo.ads.v.e(fVar, bitmap));
        }
    }
}
