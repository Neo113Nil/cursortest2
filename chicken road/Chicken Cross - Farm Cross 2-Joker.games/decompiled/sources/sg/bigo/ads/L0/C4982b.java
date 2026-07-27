package sg.bigo.ads.L0;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import sg.bigo.ads.common.view.AdImageView;

/* renamed from: sg.bigo.ads.L0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4982b implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdImageView f12405a;

    public C4982b(AdImageView adImageView) {
        this.f12405a = adImageView;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        this.f12405a.post(new RunnableC4981a((Bitmap) obj, this));
    }
}
