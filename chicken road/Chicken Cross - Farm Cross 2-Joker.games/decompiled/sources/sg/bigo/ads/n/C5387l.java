package sg.bigo.ads.n;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.TextView;

/* renamed from: sg.bigo.ads.n.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5387l implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextView f13178a;
    public final /* synthetic */ sg.bigo.ads.E0.k b;
    public final /* synthetic */ AbstractC5391n c;

    public C5387l(AbstractC5391n abstractC5391n, Button button, sg.bigo.ads.E0.k kVar) {
        this.c = abstractC5391n;
        this.f13178a = button;
        this.b = kVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            synchronized (this.c.q) {
                this.c.q.put(this.f13178a, this);
            }
        } else {
            Integer a2 = sg.bigo.ads.E0.p.a(bitmap);
            this.f13178a.post(new RunnableC5385k(this, a2 != null ? a2.intValue() : -16736769));
        }
    }
}
