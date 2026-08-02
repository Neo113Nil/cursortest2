package androidx.fragment.app;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0722v f9491a;

    public r(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v) {
        this.f9491a = abstractComponentCallbacksC0722v;
    }

    public final void a() {
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = this.f9491a;
        abstractComponentCallbacksC0722v.f9540f0.a();
        androidx.lifecycle.M.d(abstractComponentCallbacksC0722v);
        Bundle bundle = abstractComponentCallbacksC0722v.f9532b;
        abstractComponentCallbacksC0722v.f9540f0.b(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
