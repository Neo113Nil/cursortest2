package com.paypal.oslo.feature.onboarding.signup.ui.model;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\t\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks;", "T", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbackMap;", "", "componentId", "getTyped", "(Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbackMap;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks;", "Ljava/lang/Class;", "type", "getTypedInternal", "(Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbackMap;Ljava/lang/String;Ljava/lang/Class;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbacks;", "emptyComponentCallbackMap", "()Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentCallbackMap;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/MutableComponentCallbackMap;", "mutableComponentCallbackMap", "()Lcom/paypal/oslo/feature/onboarding/signup/ui/model/MutableComponentCallbackMap;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComponentCallbackMapKt {
    public static final /* synthetic */ <T extends com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks> T getTyped(com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbackMap componentCallbackMap, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentCallbackMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) getTypedInternal(componentCallbackMap, str, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks.class);
    }

    public static final <T extends com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks> T getTypedInternal(com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbackMap componentCallbackMap, java.lang.String str, java.lang.Class<T> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentCallbackMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbacks componentCallbacks = componentCallbackMap.get(str);
        if (cls.isInstance(componentCallbacks)) {
            return cls.cast(componentCallbacks);
        }
        return null;
    }

    public static final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentCallbackMap emptyComponentCallbackMap() {
        return com.paypal.oslo.feature.onboarding.signup.ui.model.EmptyComponentCallbackMap.INSTANCE;
    }

    public static final com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentCallbackMap mutableComponentCallbackMap() {
        return new com.paypal.oslo.feature.onboarding.signup.ui.model.MutableComponentCallbackMap();
    }
}
