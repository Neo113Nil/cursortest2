package com.zettle.sdk.core;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/core/BaseModule;", "Lcom/zettle/sdk/core/Module;", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "moduleScope", "Lkotlinx/coroutines/CoroutineScope;", "getModuleScope", "()Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class BaseModule implements com.zettle.sdk.core.Module {
    private final kotlinx.coroutines.CoroutineScope moduleScope;

    public BaseModule(kotlinx.coroutines.CoroutineScope coroutineScope) {
        this.moduleScope = coroutineScope == null ? com.zettle.sdk.core.ZettleScope.INSTANCE.getSdk() : coroutineScope;
    }

    public /* synthetic */ BaseModule(kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : coroutineScope);
    }

    @Override // com.zettle.sdk.core.Module
    public void start() {
        com.zettle.sdk.core.Module.DefaultImpls.start(this);
    }

    @Override // com.zettle.sdk.core.Module
    public void stop() {
        com.zettle.sdk.core.Module.DefaultImpls.stop(this);
    }

    protected final kotlinx.coroutines.CoroutineScope getModuleScope() {
        return this.moduleScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseModule() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
