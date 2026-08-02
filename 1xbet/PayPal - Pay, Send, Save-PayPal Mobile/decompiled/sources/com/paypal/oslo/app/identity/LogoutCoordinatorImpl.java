package com.paypal.oslo.app.identity;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/app/identity/LogoutCoordinatorImpl;", "Lcom/paypal/oslo/core/session/LogoutCoordinator;", "Lcom/paypal/oslo/feature/identity/api/IdentitySession;", "identitySession", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "appNavigator", "<init>", "(Lcom/paypal/oslo/feature/identity/api/IdentitySession;Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "", "logout", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/api/IdentitySession;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/navigation/AppNavigator;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LogoutCoordinatorImpl implements com.paypal.oslo.core.session.LogoutCoordinator {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.api.IdentitySession getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public LogoutCoordinatorImpl(com.paypal.oslo.feature.identity.api.IdentitySession identitySession, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identitySession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        this.getHighResolutionOutputSizeshNQ4ISI = identitySession;
        this.getHighSpeedVideoFpsRanges = appNavigator;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.core.session.LogoutCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object logout(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.app.identity.LogoutCoordinatorImpl$logout$1 logoutCoordinatorImpl$logout$1;
        int i;
        if (continuation instanceof com.paypal.oslo.app.identity.LogoutCoordinatorImpl$logout$1) {
            logoutCoordinatorImpl$logout$1 = (com.paypal.oslo.app.identity.LogoutCoordinatorImpl$logout$1) continuation;
            if ((logoutCoordinatorImpl$logout$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                logoutCoordinatorImpl$logout$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = logoutCoordinatorImpl$logout$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = logoutCoordinatorImpl$logout$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.app.LoggerKt.log, "Executing imperative logout flow", null, null, 6, null);
                    com.paypal.oslo.feature.identity.api.IdentitySession identitySession = this.getHighResolutionOutputSizeshNQ4ISI;
                    logoutCoordinatorImpl$logout$1.getHighSpeedVideoSizes = 1;
                    if (com.paypal.oslo.feature.identity.api.IdentitySession.logout$default(identitySession, false, logoutCoordinatorImpl$logout$1, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.identity.LogoutCoordinatorImpl$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.app.identity.LogoutCoordinatorImpl.m11074$r8$lambda$W25sx8mJC06PjFtAZYKDj2N02I((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
                return kotlin.Unit.INSTANCE;
            }
        }
        logoutCoordinatorImpl$logout$1 = new com.paypal.oslo.app.identity.LogoutCoordinatorImpl$logout$1(this, continuation);
        java.lang.Object obj2 = logoutCoordinatorImpl$logout$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = logoutCoordinatorImpl$logout$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.identity.LogoutCoordinatorImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.paypal.oslo.app.identity.LogoutCoordinatorImpl.m11074$r8$lambda$W25sx8mJC06PjFtAZYKDj2N02I((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj22);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$W25s-x8mJC06PjFtAZYKDj2N02I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11074$r8$lambda$W25sx8mJC06PjFtAZYKDj2N02I(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceStack(com.paypal.oslo.feature.home.api.navigation.HomeDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
