package com.paypal.oslo.feature.onboarding.signup.ui.model;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0014\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0004\b\u0014\u0010\u0015R,\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00168\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/MutableComponentCallbackMap;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbackMap;", "<init>", "()V", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks;", "T", "", "componentId", "callbacks", "", "register", "(Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks;)V", "get", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks;", "", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/ComponentConfig;", "components", "", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupComponentType;", "map", "generateCallbacks", "(Ljava/util/List;Ljava/util/Map;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbackMap;", "", "pageMap", "Ljava/util/Map;", "getPageMap", "()Ljava/util/Map;", "getPageMap$annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MutableComponentCallbackMap implements com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbackMap {
    public static final int $stable = 8;
    private final java.util.Map<java.lang.String, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks> pageMap = new java.util.LinkedHashMap();

    public static /* synthetic */ void getPageMap$annotations() {
    }

    public final java.util.Map<java.lang.String, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks> getPageMap() {
        return this.pageMap;
    }

    public final <T extends com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks> void register(java.lang.String componentId, T callbacks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbacks, "");
        this.pageMap.put(componentId, callbacks);
    }

    @Override // com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbackMap
    public final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks get(java.lang.String componentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        return this.pageMap.get(componentId);
    }

    public final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbackMap generateCallbacks(java.util.List<? extends com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentConfig> components, java.util.Map<com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType, ? extends com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks> map) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(components, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        for (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentConfig componentConfig : components) {
            java.lang.String mo16534getComponentTypeNvngK3s = componentConfig.mo16534getComponentTypeNvngK3s();
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                java.lang.String upperCase = mo16534getComponentTypeNvngK3s.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType.valueOf(upperCase));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            if (kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl) != null) {
                m23436constructorimpl = null;
            }
            com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks componentCallbacks = map.get((com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType) ((java.lang.Enum) m23436constructorimpl));
            if (componentCallbacks != null) {
                register(componentConfig.getComponentId(), componentCallbacks);
            }
        }
        return this;
    }
}
