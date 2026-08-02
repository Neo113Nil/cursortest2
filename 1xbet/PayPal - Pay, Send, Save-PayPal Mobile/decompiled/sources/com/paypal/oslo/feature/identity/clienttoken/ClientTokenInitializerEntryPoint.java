package com.paypal.oslo.feature.identity.clienttoken;

@dagger.hilt.android.EarlyEntryPoint
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u0006\u0010\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/clienttoken/ClientTokenInitializerEntryPoint;", "", "Lcom/paypal/oslo/core/identity/domain/TokenProvider;", "getTokenProvider", "()Lcom/paypal/oslo/core/identity/domain/TokenProvider;", "Lkotlinx/coroutines/CoroutineScope;", "getIoApplicationScope", "()Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ClientTokenInitializerEntryPoint {
    @com.paypal.oslo.core.di.annotations.IoApplicationScope
    kotlinx.coroutines.CoroutineScope getIoApplicationScope();

    com.paypal.oslo.core.identity.domain.TokenProvider getTokenProvider();
}
