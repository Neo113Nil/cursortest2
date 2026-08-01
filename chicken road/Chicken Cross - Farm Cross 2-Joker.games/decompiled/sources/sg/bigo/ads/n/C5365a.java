package sg.bigo.ads.n;

import android.webkit.ValueCallback;
import sg.bigo.ads.h.AbstractC5144a1;

/* renamed from: sg.bigo.ads.n.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5365a implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC5391n f13157a;

    public C5365a(AbstractC5391n abstractC5391n) {
        this.f13157a = abstractC5391n;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Double d = (Double) obj;
        if (d == null) {
            return;
        }
        AbstractC5144a1 abstractC5144a1 = this.f13157a.t;
        if (abstractC5144a1 != null && abstractC5144a1.U() != null) {
            this.f13157a.t.U().onReceiveValue(d);
        }
        this.f13157a.a(d.doubleValue());
    }
}
