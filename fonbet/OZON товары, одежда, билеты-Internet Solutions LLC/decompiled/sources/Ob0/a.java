package Ob0;

import Cb0.h;
import Ib0.d;
import Pb0.b;
import Pb0.e;
import Sc.InterfaceC3999a;
import android.app.Activity;
import android.content.Intent;
import android.view.ViewGroup;
import kotlin.coroutines.jvm.internal.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.core.navigation.interceptors.AuthDestinationInterceptorImpl$startOzonIdSdkAuth$1;
import ru.ozon.app.android.session.accountRecoveryStart.AccountRecoveryStartDeeplinkHandler$startFlowForSignInUser$1;
import ru.ozon.app.android.session.logout.customActions.LogoutActionHandlerImpl$processAction$1;
import ru.ozon.app.android.storefront.onboardingscreen.screen.OnboardingFlowFragmentViewModel$signIn$2;
import ru.ozon.app.android.switchUser.SwitchUserDestinationInterceptor$blockingSwitchUser$1$1$1;
import xb0.InterfaceC10696a;

/* loaded from: classes7.dex */
public interface a extends InterfaceC10696a {
    @NotNull
    Intent D(@NotNull AccountRecoveryStartDeeplinkHandler$startFlowForSignInUser$1 accountRecoveryStartDeeplinkHandler$startFlowForSignInUser$1);

    void F(@NotNull ViewGroup viewGroup);

    Object K(@NotNull b bVar, @NotNull c cVar);

    @NotNull
    h L();

    @NotNull
    Intent b(@NotNull Activity activity);

    @NotNull
    Intent g(@NotNull e eVar);

    @NotNull
    Fb0.a getBiometryAuth();

    @NotNull
    Jc0.b h();

    void l(@NotNull OnboardingFlowFragmentViewModel$signIn$2 onboardingFlowFragmentViewModel$signIn$2);

    @NotNull
    d n();

    boolean p(@NotNull Activity activity);

    void q(@NotNull SwitchUserDestinationInterceptor$blockingSwitchUser$1$1$1 switchUserDestinationInterceptor$blockingSwitchUser$1$1$1);

    void s(@NotNull LogoutActionHandlerImpl$processAction$1 logoutActionHandlerImpl$processAction$1);

    Intent t(@NotNull AuthDestinationInterceptorImpl$startOzonIdSdkAuth$1 authDestinationInterceptorImpl$startOzonIdSdkAuth$1);

    @InterfaceC3999a
    String w();

    void z();
}
