package com.discover.mpos.sdk.cardreader.kernel.flow.oda.execution;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002Br\u0012!\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004\u0012#\b\u0002\u0010\t\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\n0\u0004\u0012#\b\u0002\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011R)\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\t\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/oda/execution/ValidationExecutionStep;", "K", "Lcom/discover/mpos/sdk/flow/ExecutionStep;", "check", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "k", "", "onSuccess", "", "onFailure", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "execute", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/discover/mpos/sdk/flow/ExecutionFlow;", "input", "(Lcom/discover/mpos/sdk/flow/ExecutionFlow;Ljava/lang/Object;)V", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.d.a.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class ValidationExecutionStep<K> implements com.discover.mpos.sdk.flow.ExecutionStep<K> {

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.jvm.functions.Function1<K, java.lang.Boolean> f3047a;
    private final kotlin.jvm.functions.Function1<K, kotlin.Unit> b;
    private final kotlin.jvm.functions.Function1<K, kotlin.Unit> c;

    /* JADX WARN: Multi-variable type inference failed */
    public ValidationExecutionStep(kotlin.jvm.functions.Function1<? super K, java.lang.Boolean> function1, kotlin.jvm.functions.Function1<? super K, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super K, kotlin.Unit> function13) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
        this.f3047a = function1;
        this.b = function12;
        this.c = function13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final void a(com.discover.mpos.sdk.flow.ExecutionFlow<? super K> executionFlow, K k) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        if (this.f3047a.invoke(k).booleanValue()) {
            this.b.invoke(k);
            executionFlow.b(k);
        } else {
            this.c.invoke(k);
            executionFlow.a();
        }
    }
}
