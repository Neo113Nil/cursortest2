package com.discover.mpos.sdk.core.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J%\u0010\u0007\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/discover/mpos/sdk/core/flow/ExecutionStep;", "K", "", "Lcom/discover/mpos/sdk/core/flow/ExecutionFlow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "input", "", "execute", "(Lcom/discover/mpos/sdk/core/flow/ExecutionFlow;Ljava/lang/Object;)V"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public interface ExecutionStep<K> {
    void execute(com.discover.mpos.sdk.core.flow.ExecutionFlow<? super K> flow, K input);
}
