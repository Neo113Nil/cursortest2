package com.paypal.oslo.app.environment;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/app/environment/EnvironmentProvider;", "", "Lcom/paypal/oslo/app/environment/Environment;", "getEnvironment", "()Lcom/paypal/oslo/app/environment/Environment;", "environment", "Lkotlinx/coroutines/flow/Flow;", "getEnvironmentFlow", "()Lkotlinx/coroutines/flow/Flow;", "environmentFlow"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface EnvironmentProvider {
    com.paypal.oslo.app.environment.Environment getEnvironment();

    kotlinx.coroutines.flow.Flow<com.paypal.oslo.app.environment.Environment> getEnvironmentFlow();
}
