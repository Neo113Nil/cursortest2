package com.paypal.oslo.feature.onboarding.signup.ui.registry;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/registry/EmptyRootLevelComponentRegistry;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/registry/RootLevelComponentRegistry;", "<init>", "()V", "", "p0", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/RootLevelComponentState;", "p1", "", "register", "(Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/RootLevelComponentState;)V", "unregister", "(Ljava/lang/String;)V", "", "Lcom/paypal/pds/components/DropdownState;", "getDropdownStates", "()Ljava/util/Map;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final class EmptyRootLevelComponentRegistry extends com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry {
    public static final com.paypal.oslo.feature.onboarding.signup.ui.registry.EmptyRootLevelComponentRegistry INSTANCE = new com.paypal.oslo.feature.onboarding.signup.ui.registry.EmptyRootLevelComponentRegistry();

    private EmptyRootLevelComponentRegistry() {
    }

    @Override // com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry
    public final java.util.Map<java.lang.String, com.paypal.pds.components.DropdownState> getDropdownStates() {
        return kotlin.collections.MapsKt.emptyMap();
    }

    @Override // com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry
    public final void unregister(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
    }

    @Override // com.paypal.oslo.feature.onboarding.signup.ui.registry.RootLevelComponentRegistry
    public final void register(java.lang.String p0, com.paypal.oslo.feature.onboarding.signup.ui.model.RootLevelComponentState p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
    }
}
