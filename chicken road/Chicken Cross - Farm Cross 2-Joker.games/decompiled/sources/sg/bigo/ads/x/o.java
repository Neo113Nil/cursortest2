package sg.bigo.ads.x;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import sg.bigo.ads.K0.AbstractC4962t;

/* loaded from: classes3.dex */
public final class o implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f13378a;

    public o(q qVar) {
        this.f13378a = qVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ViewGroup.LayoutParams layoutParams = this.f13378a.q.getLayoutParams();
        if (bitmap == null || bitmap.isRecycled() || layoutParams == null) {
            return;
        }
        AbstractC4962t.a(this.f13378a.q.getContext(), bitmap, new n(this));
    }
}
