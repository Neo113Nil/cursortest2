package com.paypal.oslo.feature.xoom.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/usecase/CreateActivityDetailsInitialUrlUseCase;", "", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)V", "", "invoiceId", "invoke", "(Ljava/lang/String;)Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CreateActivityDetailsInitialUrlUseCase {
    private final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration getHighSpeedVideoFpsRanges;
    private static final com.paypal.oslo.feature.xoom.domain.usecase.CreateActivityDetailsInitialUrlUseCase.Companion Companion = new com.paypal.oslo.feature.xoom.domain.usecase.CreateActivityDetailsInitialUrlUseCase.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public CreateActivityDetailsInitialUrlUseCase(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        this.getHighSpeedVideoFpsRanges = dynamicConfiguration;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/usecase/CreateActivityDetailsInitialUrlUseCase$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String invoke(java.lang.String invoiceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invoiceId, "");
        java.lang.String str = (java.lang.String) this.getHighSpeedVideoFpsRanges.getValue(com.paypal.oslo.feature.xoom.domain.config.XoomConfigs.INSTANCE.getBaseWebsiteUrl());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("activity-details/");
        sb.append(invoiceId);
        return sb.toString();
    }
}
