package com.discover.mpos.sdk.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H&J1\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007H\u0016J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\fH&¨\u0006\r"}, d2 = {"Lcom/discover/mpos/sdk/flow/ExecutionFlowBuilder;", "K", "", "build", "Lcom/discover/mpos/sdk/flow/ExecutionFlow;", "withStep", "step", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "input", "", "Lcom/discover/mpos/sdk/flow/ExecutionStep;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.c.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public interface ExecutionFlowBuilder<K> {
    com.discover.mpos.sdk.flow.ExecutionFlowBuilder<K> a(com.discover.mpos.sdk.flow.ExecutionStep<K> executionStep);

    com.discover.mpos.sdk.flow.ExecutionFlowBuilder<K> a(kotlin.jvm.functions.Function1<? super K, kotlin.Unit> function1);

    com.discover.mpos.sdk.flow.ExecutionFlow<K> c();

    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.c.b$a */
    public static final class a {

        @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J#\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"com/discover/mpos/sdk/flow/ExecutionFlowBuilder$withStep$1", "Lcom/discover/mpos/sdk/flow/ExecutionStep;", "execute", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/discover/mpos/sdk/flow/ExecutionFlow;", "input", "(Lcom/discover/mpos/sdk/flow/ExecutionFlow;Ljava/lang/Object;)V", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
        /* renamed from: com.discover.mpos.sdk.c.b$a$a, reason: collision with other inner class name */
        public static final class C0059a implements com.discover.mpos.sdk.flow.ExecutionStep<K> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.functions.Function1 f2929a;

            C0059a(kotlin.jvm.functions.Function1 function1) {
                this.f2929a = function1;
            }

            @Override // com.discover.mpos.sdk.flow.ExecutionStep
            public final void a(com.discover.mpos.sdk.flow.ExecutionFlow<? super K> executionFlow, K k) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
                this.f2929a.invoke(k);
            }
        }

        public static <K> com.discover.mpos.sdk.flow.ExecutionFlowBuilder<K> a(com.discover.mpos.sdk.flow.ExecutionFlowBuilder<K> executionFlowBuilder, kotlin.jvm.functions.Function1<? super K, kotlin.Unit> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            return executionFlowBuilder.a(new com.discover.mpos.sdk.flow.ExecutionFlowBuilder.a.C0059a(function1));
        }
    }
}
