package sg.bigo.ads.n;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import java.util.Iterator;

/* renamed from: sg.bigo.ads.n.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5369c implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC5391n f13161a;

    public C5369c(AbstractC5391n abstractC5391n) {
        this.f13161a = abstractC5391n;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            return;
        }
        synchronized (this.f13161a.q) {
            Iterator it = this.f13161a.q.values().iterator();
            while (it.hasNext()) {
                ((ValueCallback) it.next()).onReceiveValue(bitmap);
            }
            this.f13161a.q.clear();
        }
    }
}
