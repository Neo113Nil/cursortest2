package Tb0;

import Fb0.b;
import ru.ozon.app.android.session.accountRecoveryStart.AccountRecoveryStartDeeplinkHandler$startFlowForSignInUser$1;

/* loaded from: classes3.dex */
public final class b implements b.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f26982a;

    b(AccountRecoveryStartDeeplinkHandler$startFlowForSignInUser$1 accountRecoveryStartDeeplinkHandler$startFlowForSignInUser$1) {
        this.f26982a = accountRecoveryStartDeeplinkHandler$startFlowForSignInUser$1.getUri();
    }

    @Override // Fb0.b.a
    public final String getUrl() {
        return this.f26982a;
    }
}
