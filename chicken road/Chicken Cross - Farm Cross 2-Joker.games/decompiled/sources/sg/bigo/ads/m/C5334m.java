package sg.bigo.ads.m;

import android.webkit.ValueCallback;
import java.util.Iterator;
import sg.bigo.ads.u.C5491l;

/* renamed from: sg.bigo.ads.m.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5334m implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f13092a;

    public C5334m(e0 e0Var) {
        this.f13092a = e0Var;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        Iterator it = this.f13092a.y.iterator();
        while (it.hasNext()) {
            this.f13092a.q.post((Runnable) it.next());
        }
        this.f13092a.y.clear();
        C5491l.a(this.f13092a.q, (ValueCallback) null);
    }
}
