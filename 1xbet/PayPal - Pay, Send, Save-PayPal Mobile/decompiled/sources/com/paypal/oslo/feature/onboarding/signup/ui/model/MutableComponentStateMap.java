package com.paypal.oslo.feature.onboarding.signup.ui.model;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u000f\u001a\u00020\u00002*\u0010\u000e\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\r0\f\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u000f\u001a\u00020\u00002\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\r0\u0011¢\u0006\u0004\b\u000f\u0010\u0012J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R,\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00158\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/MutableComponentStateMap;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentStateMap;", "<init>", "()V", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState;", "T", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupComponentType;", "componentType", "state", "", "register", "(Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupComponentType;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState;)V", "", "Lkotlin/Pair;", "updates", "copy", "([Lkotlin/Pair;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/MutableComponentStateMap;", "", "(Ljava/util/List;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/MutableComponentStateMap;", "get", "(Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupComponentType;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentUiState;", "", "stateMap", "Ljava/util/Map;", "getStateMap", "()Ljava/util/Map;", "getStateMap$annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MutableComponentStateMap implements com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap {
    public static final int $stable = 8;
    private final java.util.Map<com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState> stateMap = new java.util.LinkedHashMap();

    public static /* synthetic */ void getStateMap$annotations() {
    }

    public final java.util.Map<com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState> getStateMap() {
        return this.stateMap;
    }

    public final <T extends com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState> void register(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType componentType, T state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        this.stateMap.put(componentType, state);
    }

    public final com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentStateMap copy(kotlin.Pair<? extends com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType, ? extends com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState>... updates) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updates, "");
        com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentStateMap mutableComponentStateMap = com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiStateKt.mutableComponentStateMap();
        mutableComponentStateMap.stateMap.putAll(this.stateMap);
        for (kotlin.Pair<? extends com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType, ? extends com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState> pair : updates) {
            mutableComponentStateMap.register(pair.component1(), pair.component2());
        }
        return mutableComponentStateMap;
    }

    public final com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentStateMap copy(java.util.List<? extends kotlin.Pair<? extends com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType, ? extends com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState>> updates) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updates, "");
        com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentStateMap mutableComponentStateMap = com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiStateKt.mutableComponentStateMap();
        mutableComponentStateMap.stateMap.putAll(this.stateMap);
        java.util.Iterator<T> it = updates.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            mutableComponentStateMap.register((com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType) pair.component1(), (com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState) pair.component2());
        }
        return mutableComponentStateMap;
    }

    @Override // com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap
    public final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState get(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType componentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentType, "");
        return this.stateMap.get(componentType);
    }
}
