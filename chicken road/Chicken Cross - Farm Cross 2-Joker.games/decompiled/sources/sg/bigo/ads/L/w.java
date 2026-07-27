package sg.bigo.ads.L;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import sg.bigo.ads.M.C5002t;
import sg.bigo.ads.h.P1;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class w implements P1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f12400a;
    public final /* synthetic */ N b;

    public w(N n, ViewGroup viewGroup) {
        this.b = n;
        this.f12400a = viewGroup;
    }

    @Override // sg.bigo.ads.h.P1
    public final void a() {
        Bitmap bitmap = C5002t.p;
        if (this.b.u || bitmap == null) {
            return;
        }
        AbstractC5446j.b(new v(this, bitmap));
    }
}
