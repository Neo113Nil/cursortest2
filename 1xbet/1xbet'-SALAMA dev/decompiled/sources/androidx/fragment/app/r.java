package androidx.fragment.app;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0701v f9491a;

    public r(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v) {
        this.f9491a = abstractComponentCallbacksC0701v;
    }

    public final void a() {
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = this.f9491a;
        abstractComponentCallbacksC0701v.f9540f0.a();
        androidx.lifecycle.M.d(abstractComponentCallbacksC0701v);
        Bundle bundle = abstractComponentCallbacksC0701v.f9532b;
        abstractComponentCallbacksC0701v.f9540f0.b(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
