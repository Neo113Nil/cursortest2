package sg.bigo.ads.y;

import android.view.View;
import android.webkit.ValueCallback;
import sg.bigo.ads.h.AbstractC5140Q;

/* renamed from: sg.bigo.ads.y.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5514f implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f13412a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;

    public C5514f(View view, View view2, View view3) {
        this.f13412a = view;
        this.b = view2;
        this.c = view3;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        this.f13412a.setAlpha(1.0f);
        AbstractC5140Q.b(this.b, this.c);
    }
}
