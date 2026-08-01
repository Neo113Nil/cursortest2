package sg.bigo.ads.n;

import android.webkit.ValueCallback;
import java.util.Iterator;
import sg.bigo.ads.u.C5491l;

/* renamed from: sg.bigo.ads.n.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5382i0 implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U0 f13173a;

    public C5382i0(U0 u0) {
        this.f13173a = u0;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Iterator it = this.f13173a.O.iterator();
        while (it.hasNext()) {
            this.f13173a.C.post((Runnable) it.next());
        }
        this.f13173a.O.clear();
        C5491l.a(this.f13173a.C, (ValueCallback) null);
    }
}
