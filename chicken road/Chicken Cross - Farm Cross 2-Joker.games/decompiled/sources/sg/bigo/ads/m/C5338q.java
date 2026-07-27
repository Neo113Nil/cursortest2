package sg.bigo.ads.m;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;

/* renamed from: sg.bigo.ads.m.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5338q implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.v.d f13096a;

    public C5338q(sg.bigo.ads.v.d dVar) {
        this.f13096a = dVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.f13096a.b(bitmap);
        }
    }
}
