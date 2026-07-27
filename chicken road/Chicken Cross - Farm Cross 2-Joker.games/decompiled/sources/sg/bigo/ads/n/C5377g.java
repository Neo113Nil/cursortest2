package sg.bigo.ads.n;

import android.graphics.drawable.BitmapDrawable;
import android.webkit.ValueCallback;

/* renamed from: sg.bigo.ads.n.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5377g implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BitmapDrawable f13169a;

    public C5377g(BitmapDrawable bitmapDrawable) {
        this.f13169a = bitmapDrawable;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        this.f13169a.setAlpha(num.intValue());
    }
}
