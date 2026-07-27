package sg.bigo.ads.m;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;

/* renamed from: sg.bigo.ads.m.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5330i implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.v.d f13084a;

    public C5330i(sg.bigo.ads.v.d dVar) {
        this.f13084a = dVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        this.f13084a.b((Bitmap) obj);
    }
}
