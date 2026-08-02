package com.paypal.oslo.feature.onboarding.signup.ui.model;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\r\u001a\u00020\f\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0011\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0012\u0010\u0010R2\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00160\u00158\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/BatchUpdateScope;", "", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/MutableComponentStateMap;", "currentMap", "<init>", "(Lcom/paypal/oslo/feature/onboarding/signup/ui/model/MutableComponentStateMap;)V", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState;", "T", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupComponentType;", "componentType", "Lkotlin/Function1;", "transform", "", "update", "(Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupComponentType;Lkotlin/jvm/functions/Function1;)V", com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConstants.APPLY_PROMO_CARD_STATUS, "()Lcom/paypal/oslo/feature/onboarding/signup/ui/model/MutableComponentStateMap;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/MutableComponentStateMap;", "getCurrentMap", "getCurrentMap$annotations", "()V", "", "Lkotlin/Pair;", "updates", "Ljava/util/List;", "getUpdates", "()Ljava/util/List;", "getUpdates$annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BatchUpdateScope {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentStateMap currentMap;
    private final java.util.List<kotlin.Pair<com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState>> updates;

    public static /* synthetic */ void getCurrentMap$annotations() {
    }

    public static /* synthetic */ void getUpdates$annotations() {
    }

    public BatchUpdateScope(com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentStateMap mutableComponentStateMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableComponentStateMap, "");
        this.currentMap = mutableComponentStateMap;
        this.updates = new java.util.ArrayList();
    }

    public final com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentStateMap getCurrentMap() {
        return this.currentMap;
    }

    public final java.util.List<kotlin.Pair<com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState>> getUpdates() {
        return this.updates;
    }

    public final /* synthetic */ <T extends com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState> void update(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType componentType, kotlin.jvm.functions.Function1<? super T, ? extends T> transform) {
        T invoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transform, "");
        com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentStateMap currentMap = getCurrentMap();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState typedInternal = com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiStateKt.getTypedInternal(currentMap, componentType, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.class);
        if (typedInternal == null || (invoke = transform.invoke(typedInternal)) == typedInternal) {
            return;
        }
        getUpdates().add(kotlin.TuplesKt.to(componentType, invoke));
    }

    public final com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentStateMap apply() {
        if (this.updates.isEmpty()) {
            return this.currentMap;
        }
        return this.currentMap.copy(this.updates);
    }
}
