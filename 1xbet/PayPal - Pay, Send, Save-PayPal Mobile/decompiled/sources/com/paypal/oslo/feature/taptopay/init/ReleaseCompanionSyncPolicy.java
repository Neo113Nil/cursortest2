package com.paypal.oslo.feature.taptopay.init;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/init/ReleaseCompanionSyncPolicy;", "Lcom/paypal/oslo/feature/taptopay/init/CompanionSyncPolicy;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/config/RemoteConfigConfig;", "remoteConfigConfig", "", "awaitSync", "(Lcom/paypal/oslo/core/remoteconfig/config/RemoteConfigConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ReleaseCompanionSyncPolicy implements com.paypal.oslo.feature.taptopay.init.CompanionSyncPolicy {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ReleaseCompanionSyncPolicy() {
    }

    @Override // com.paypal.oslo.feature.taptopay.init.CompanionSyncPolicy
    public final java.lang.Object awaitSync(com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig remoteConfigConfig, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlin.Unit.INSTANCE;
    }
}
