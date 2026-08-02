package com.paypal.oslo.core.remoteconfig.contract;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigEnvironment;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "tier", "Ljava/lang/String;", "getTier", "()Ljava/lang/String;", "Production", "Development", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigEnvironment$Development;", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigEnvironment$Production;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class RemoteConfigEnvironment {
    private final java.lang.String tier;

    private RemoteConfigEnvironment(java.lang.String str) {
        this.tier = str;
    }

    public final java.lang.String getTier() {
        return this.tier;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigEnvironment$Production;", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigEnvironment;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Production extends com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment {
        public static final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment.Production INSTANCE = new com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment.Production();

        private Production() {
            super(com.adjust.sdk.AdjustConfig.ENVIRONMENT_PRODUCTION, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigEnvironment$Development;", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigEnvironment;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Development extends com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment {
        public static final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment.Development INSTANCE = new com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment.Development();

        private Development() {
            super("development", null);
        }
    }

    public /* synthetic */ RemoteConfigEnvironment(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
