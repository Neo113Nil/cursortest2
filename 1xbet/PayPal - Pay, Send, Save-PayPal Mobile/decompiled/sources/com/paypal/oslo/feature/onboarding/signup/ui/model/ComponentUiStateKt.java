package com.paypal.oslo.feature.onboarding.signup.ui.model;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a*\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\t\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a0\u0010\u0011\u001a\u00020\u000b*\u00020\u000b2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState;", "T", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentStateMap;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupComponentType;", "componentType", "getTyped", "(Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentStateMap;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupComponentType;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState;", "Ljava/lang/Class;", "type", "getTypedInternal", "(Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentStateMap;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupComponentType;Ljava/lang/Class;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/MutableComponentStateMap;", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/BatchUpdateScope;", "", "Lkotlin/ExtensionFunctionType;", "block", "updateStates", "(Lcom/paypal/oslo/feature/onboarding/signup/ui/model/MutableComponentStateMap;Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/MutableComponentStateMap;", "emptyComponentStateMap", "()Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentStateMap;", "mutableComponentStateMap", "()Lcom/paypal/oslo/feature/onboarding/signup/ui/model/MutableComponentStateMap;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComponentUiStateKt {
    public static final /* synthetic */ <T extends com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState> T getTyped(com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap, com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType signupComponentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentStateMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupComponentType, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) getTypedInternal(componentStateMap, signupComponentType, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.class);
    }

    public static final <T extends com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState> T getTypedInternal(com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap, com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType signupComponentType, java.lang.Class<T> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentStateMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupComponentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState componentUiState = componentStateMap.get(signupComponentType);
        if (cls.isInstance(componentUiState)) {
            return cls.cast(componentUiState);
        }
        return null;
    }

    public static final com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentStateMap updateStates(com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentStateMap mutableComponentStateMap, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.onboarding.signup.ui.model.BatchUpdateScope, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableComponentStateMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        com.paypal.oslo.feature.onboarding.signup.ui.model.BatchUpdateScope batchUpdateScope = new com.paypal.oslo.feature.onboarding.signup.ui.model.BatchUpdateScope(mutableComponentStateMap);
        function1.invoke(batchUpdateScope);
        return batchUpdateScope.apply();
    }

    public static final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap emptyComponentStateMap() {
        return com.paypal.oslo.feature.onboarding.signup.ui.model.EmptyComponentStateMap.INSTANCE;
    }

    public static final com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentStateMap mutableComponentStateMap() {
        return new com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentStateMap();
    }
}
