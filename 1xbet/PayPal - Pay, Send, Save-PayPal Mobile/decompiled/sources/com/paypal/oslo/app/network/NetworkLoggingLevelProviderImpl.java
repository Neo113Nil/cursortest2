package com.paypal.oslo.app.network;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/app/network/NetworkLoggingLevelProviderImpl;", "Lcom/paypal/oslo/app/network/NetworkLoggingLevelProvider;", "Lcom/paypal/oslo/app/network/NetworkLoggingLevelSetter;", "<init>", "()V", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "getCurrentLevel", "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "shouldRedactHeaders", "()Z", "Lcom/paypal/oslo/core/companion/domain/NetworkLoggingLevel;", "level", "", "setLevel", "(Lcom/paypal/oslo/core/companion/domain/NetworkLoggingLevel;)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NetworkLoggingLevelProviderImpl implements com.paypal.oslo.app.network.NetworkLoggingLevelProvider, com.paypal.oslo.app.network.NetworkLoggingLevelSetter {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.core.companion.domain.NetworkLoggingLevel> getHighSpeedVideoFpsRangesFor = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(com.paypal.oslo.core.companion.domain.NetworkLoggingLevel.INSTANCE.getDEFAULT());

    @javax.inject.Inject
    public NetworkLoggingLevelProviderImpl() {
    }

    @Override // com.paypal.oslo.app.network.NetworkLoggingLevelProvider
    public final okhttp3.logging.HttpLoggingInterceptor.Level getCurrentLevel() {
        return com.paypal.oslo.app.network.NetworkLoggingLevelProviderKt.access$toOkHttpLevel(this.getHighSpeedVideoFpsRangesFor.getValue());
    }

    @Override // com.paypal.oslo.app.network.NetworkLoggingLevelProvider
    public final boolean shouldRedactHeaders() {
        return this.getHighSpeedVideoFpsRangesFor.getValue().getShouldRedactSensitiveHeaders();
    }

    @Override // com.paypal.oslo.app.network.NetworkLoggingLevelSetter
    public final void setLevel(com.paypal.oslo.core.companion.domain.NetworkLoggingLevel level) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "");
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.core.companion.domain.NetworkLoggingLevel> mutableStateFlow = this.getHighSpeedVideoFpsRangesFor;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), level)) {
        }
    }
}
