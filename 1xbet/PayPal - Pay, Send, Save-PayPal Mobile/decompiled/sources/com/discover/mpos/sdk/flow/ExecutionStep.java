package com.discover.mpos.sdk.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J#\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/discover/mpos/sdk/flow/ExecutionStep;", "K", "", "execute", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/discover/mpos/sdk/flow/ExecutionFlow;", "input", "(Lcom/discover/mpos/sdk/flow/ExecutionFlow;Ljava/lang/Object;)V", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.c.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public interface ExecutionStep<K> {
    void a(com.discover.mpos.sdk.flow.ExecutionFlow<? super K> executionFlow, K k);
}
