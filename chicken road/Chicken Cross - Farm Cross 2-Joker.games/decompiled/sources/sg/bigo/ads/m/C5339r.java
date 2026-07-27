package sg.bigo.ads.m;

import android.webkit.ValueCallback;
import sg.bigo.ads.h.AbstractC5144a1;
import sg.bigo.ads.h.O1;

/* renamed from: sg.bigo.ads.m.r, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5339r implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC5144a1 f13098a;
    public final /* synthetic */ e0 b;

    public C5339r(e0 e0Var, AbstractC5144a1 abstractC5144a1) {
        this.b = e0Var;
        this.f13098a = abstractC5144a1;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        e0 e0Var = this.b;
        AbstractC5144a1 abstractC5144a1 = this.f13098a;
        C5338q c5338q = new C5338q((sg.bigo.ads.v.d) obj);
        e0Var.getClass();
        O1.a(abstractC5144a1, c5338q);
    }
}
