package com.paypal.oslo.app.environment;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00058\u0017@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00128\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/app/environment/EnvironmentManager;", "Lcom/paypal/oslo/app/environment/EnvironmentProvider;", "Lcom/paypal/oslo/app/environment/EnvironmentSetter;", "<init>", "()V", "Lcom/paypal/oslo/app/environment/Environment;", "environment", "", "setEnvironment", "(Lcom/paypal/oslo/app/environment/Environment;)V", "p0", "Lcom/paypal/oslo/app/environment/Environment;", "getEnvironment", "()Lcom/paypal/oslo/app/environment/Environment;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/Flow;", "environmentFlow", "Lkotlinx/coroutines/flow/Flow;", "getEnvironmentFlow", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EnvironmentManager implements com.paypal.oslo.app.environment.EnvironmentProvider, com.paypal.oslo.app.environment.EnvironmentSetter {
    public static final int $stable = 8;
    private com.paypal.oslo.app.environment.Environment environment = com.paypal.oslo.app.environment.Environment.Production.INSTANCE;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.app.environment.Environment> environmentFlow;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.app.environment.Environment> getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public EnvironmentManager() {
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.app.environment.Environment> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(getEnvironment());
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.environmentFlow = MutableStateFlow;
    }

    @Override // com.paypal.oslo.app.environment.EnvironmentProvider
    public final com.paypal.oslo.app.environment.Environment getEnvironment() {
        return this.environment;
    }

    @Override // com.paypal.oslo.app.environment.EnvironmentProvider
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.app.environment.Environment> getEnvironmentFlow() {
        return this.environmentFlow;
    }

    @Override // com.paypal.oslo.app.environment.EnvironmentSetter
    public final void setEnvironment(com.paypal.oslo.app.environment.Environment environment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.app.LoggerKt.log, "overriding environment", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("environmentType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(environment.getClass()).getSimpleName()), kotlin.TuplesKt.to("baseUrl", environment.getBaseUrl()), kotlin.TuplesKt.to("graphqlUrl", environment.getGraphQlConfig().getBaseUrl())), null, 4, null);
        this.environment = environment;
        this.getHighSpeedVideoFpsRangesFor.setValue(environment);
    }
}
