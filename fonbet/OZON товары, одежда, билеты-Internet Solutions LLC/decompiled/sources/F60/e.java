package F60;

import Sc.r;
import android.webkit.ValueCallback;
import xe.C10737n;

/* loaded from: classes3.dex */
final class e<T> implements ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10737n f9105a;

    e(C10737n c10737n) {
        this.f9105a = c10737n;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        r.Companion companion = r.INSTANCE;
        this.f9105a.resumeWith(Boolean.TRUE);
    }
}
