package sg.bigo.ads.y;

import android.view.View;
import android.webkit.ValueCallback;

/* renamed from: sg.bigo.ads.y.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5513e implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f13411a;

    public C5513e(View view) {
        this.f13411a = view;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        if (((Integer) obj) != null) {
            this.f13411a.setAlpha((r3.intValue() * 1.0f) / 255);
        }
    }
}
