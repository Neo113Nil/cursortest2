package com.paypal.oslo.feature.identity.challenges.shared.ui;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a>\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0080@¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "", "requestId", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeContext;", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.KEY_CHALLENGE_CONTEXT, "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;", "exhaustedChallengeType", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "availableChallenges", "", "navigateOnMaxAttemptsReached", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeContext;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MaxAttemptsNavigationKt {
    public static final java.lang.Object navigateOnMaxAttemptsReached(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType, final java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.util.List<? extends com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge> list2 = list;
        if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) it.next()).getType() != challengeType) {
                    appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.shared.ui.MaxAttemptsNavigationKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.identity.challenges.shared.ui.MaxAttemptsNavigationKt.m15043$r8$lambda$U3C01BZq0muvgFB9PAJh56ZYVw(str, list, challengeContext, challengeType, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                        }
                    });
                    break;
                }
            }
        }
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.shared.ui.MaxAttemptsNavigationKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.identity.challenges.shared.ui.MaxAttemptsNavigationKt.m15042$r8$lambda$u6oA5dsD5dwo3rUOPYdrjvbkc((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$-u6oA5dsD5dw-o3rUOPYdrjvbkc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15042$r8$lambda$u6oA5dsD5dwo3rUOPYdrjvbkc(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.identity.challenges.shared.navigation.ContactUsDestination(com.paypal.oslo.feature.identity.challenges.shared.ui.ContactUsErrorType.MaxFailuresRisk.INSTANCE));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$U3C01BZq0muvgFB9P-AJh56ZYVw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15043$r8$lambda$U3C01BZq0muvgFB9PAJh56ZYVw(java.lang.String str, java.util.List list, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeContext challengeContext, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.replaceTop(new com.paypal.oslo.feature.identity.stepup.navigation.StepupDestination(str, new com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult(list, challengeContext, null, null, 12, null), challengeType, com.paypal.oslo.feature.identity.stepup.navigation.StepupValidationError.MaxAttemptsReached.INSTANCE));
        return kotlin.Unit.INSTANCE;
    }
}
