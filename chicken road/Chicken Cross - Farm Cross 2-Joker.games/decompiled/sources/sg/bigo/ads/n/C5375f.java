package sg.bigo.ads.n;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.webkit.ValueCallback;

/* renamed from: sg.bigo.ads.n.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5375f implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC5391n f13167a;

    public C5375f(AbstractC5391n abstractC5391n) {
        this.f13167a = abstractC5391n;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            synchronized (this.f13167a.q) {
                AbstractC5391n abstractC5391n = this.f13167a;
                abstractC5391n.q.put(abstractC5391n.u, this);
            }
        } else {
            AbstractC5391n abstractC5391n2 = this.f13167a;
            long j = ((abstractC5391n2.A > 0L ? 1 : (abstractC5391n2.A == 0L ? 0 : -1)) != 0 ? SystemClock.elapsedRealtime() - abstractC5391n2.A : 0L) > 15 ? 300L : 0L;
            Integer a2 = sg.bigo.ads.E0.p.a(bitmap);
            if (a2 == null) {
                return;
            }
            this.f13167a.u.post(new RunnableC5373e(this, a2, j));
        }
    }
}
