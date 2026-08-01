package sg.bigo.ads.h;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class B1 implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F1 f12804a;

    public B1(F1 f1) {
        this.f12804a = f1;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        F1 f1 = this.f12804a;
        synchronized (f1) {
            f1.j = bitmap;
            Iterator it = f1.k.iterator();
            while (it.hasNext()) {
                ((P1) it.next()).a();
                it.remove();
            }
            f1.i = 2;
        }
    }
}
