package sg.bigo.ads.m;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class h0 implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaView f13083a;
    public final /* synthetic */ m0 b;

    public h0(m0 m0Var, MediaView mediaView) {
        this.b = m0Var;
        this.f13083a = mediaView;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return;
        }
        AbstractC5446j.b(new g0(this, bitmap));
    }
}
