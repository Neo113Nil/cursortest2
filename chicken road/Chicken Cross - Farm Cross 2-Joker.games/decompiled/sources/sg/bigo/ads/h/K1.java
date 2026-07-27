package sg.bigo.ads.h;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.ValueCallback;
import sg.bigo.ads.common.view.RoundedImageView;

/* loaded from: classes3.dex */
public final class K1 implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f12835a;
    public final /* synthetic */ O1 b;

    public K1(O1 o1, RoundedImageView roundedImageView) {
        this.b = o1;
        this.f12835a = roundedImageView;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            Integer a2 = sg.bigo.ads.E0.p.a(bitmap);
            if (a2 == null) {
                return;
            }
            this.f12835a.post(new J1(this, a2.intValue()));
            return;
        }
        O1 o1 = this.b;
        View view = this.f12835a;
        o1.getClass();
        if (view != null) {
            synchronized (o1.h) {
                o1.h.put(view, this);
            }
        }
    }
}
