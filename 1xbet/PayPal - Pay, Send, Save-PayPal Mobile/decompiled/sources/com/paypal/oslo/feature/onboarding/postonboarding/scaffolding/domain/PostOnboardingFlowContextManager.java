package com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/domain/PostOnboardingFlowContextManager;", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/domain/FlowContextManager;", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/domain/FlowContextManager$ContextKey;", "key", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "set", "(Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/domain/FlowContextManager$ContextKey;Ljava/lang/String;)V", "get", "(Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/domain/FlowContextManager$ContextKey;)Ljava/lang/String;", "Camera2StreamConfigurationMap", "Landroidx/lifecycle/SavedStateHandle;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PostOnboardingFlowContextManager implements com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.FlowContextManager {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.view.SavedStateHandle getHighSpeedVideoSizes;

    @javax.inject.Inject
    public PostOnboardingFlowContextManager(androidx.view.SavedStateHandle savedStateHandle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.getHighSpeedVideoSizes = savedStateHandle;
    }

    @Override // com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.FlowContextManager
    public final void set(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.FlowContextManager.ContextKey key, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.getHighSpeedVideoSizes.set(key.getKey(), value);
    }

    @Override // com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.FlowContextManager
    public final java.lang.String get(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.domain.FlowContextManager.ContextKey key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return (java.lang.String) this.getHighSpeedVideoSizes.get(key.getKey());
    }
}
