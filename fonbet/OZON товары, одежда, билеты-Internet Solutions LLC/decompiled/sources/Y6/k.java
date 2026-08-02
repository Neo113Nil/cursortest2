package Y6;

import a7.b;
import io.sentry.InterfaceC7142f0;
import io.sentry.InterfaceC7217w1;
import io.sentry.U;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.C7106g;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final /* synthetic */ class k implements b.a, InterfaceC7217w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f34673a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34674b;

    public /* synthetic */ k(Object obj, Object obj2) {
        this.f34673a = obj;
        this.f34674b = obj2;
    }

    @Override // io.sentry.InterfaceC7217w1
    public void e(U u11) {
        ((ActivityLifecycleIntegration) this.f34673a).getClass();
        u11.L(new C7106g((InterfaceC7142f0) this.f34674b, u11));
    }

    @Override // a7.b.a
    public Object execute() {
        m.h((m) this.f34673a, (HashMap) this.f34674b);
        return null;
    }
}
