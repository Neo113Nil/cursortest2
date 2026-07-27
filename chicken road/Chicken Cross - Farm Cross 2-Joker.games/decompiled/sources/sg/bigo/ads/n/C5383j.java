package sg.bigo.ads.n;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.webkit.ValueCallback;
import sg.bigo.ads.K0.AbstractC4962t;

/* renamed from: sg.bigo.ads.n.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5383j implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC5391n f13174a;

    public C5383j(AbstractC5391n abstractC5391n) {
        this.f13174a = abstractC5391n;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            synchronized (this.f13174a.q) {
                AbstractC5391n abstractC5391n = this.f13174a;
                abstractC5391n.q.put(abstractC5391n.u, this);
            }
        } else {
            AbstractC5391n abstractC5391n2 = this.f13174a;
            if (abstractC5391n2.u == null) {
                return;
            }
            AbstractC4962t.a(this.f13174a.u.getContext(), bitmap, new C5381i(this, ((abstractC5391n2.A > 0L ? 1 : (abstractC5391n2.A == 0L ? 0 : -1)) != 0 ? SystemClock.elapsedRealtime() - abstractC5391n2.A : 0L) > 15 ? 300L : 0L));
        }
    }
}
