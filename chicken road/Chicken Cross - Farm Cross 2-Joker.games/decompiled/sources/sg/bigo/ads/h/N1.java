package sg.bigo.ads.h;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class N1 implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O1 f12843a;

    public N1(O1 o1) {
        this.f12843a = o1;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            return;
        }
        synchronized (this.f12843a.h) {
            Iterator it = this.f12843a.h.values().iterator();
            while (it.hasNext()) {
                ((ValueCallback) it.next()).onReceiveValue(bitmap);
            }
            this.f12843a.h.clear();
        }
    }
}
