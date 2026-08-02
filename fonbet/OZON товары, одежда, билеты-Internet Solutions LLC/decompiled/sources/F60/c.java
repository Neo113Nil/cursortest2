package F60;

import Sc.r;
import android.webkit.ValueCallback;
import xe.C10737n;

/* loaded from: classes3.dex */
final class c<T> implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10737n f9100a;

    c(C10737n c10737n) {
        this.f9100a = c10737n;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        r.Companion companion = r.INSTANCE;
        this.f9100a.resumeWith(Boolean.TRUE);
    }
}
