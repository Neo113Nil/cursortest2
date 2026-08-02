package com.discover.mpos.sdk.core.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0017\u0010\t\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\fH&¢\u0006\u0004\b\n\u0010\r"}, d2 = {"Lcom/discover/mpos/sdk/core/flow/ExecutionFlowBuilder;", "K", "", "Lcom/discover/mpos/sdk/core/flow/ExecutionFlow;", "build", "()Lcom/discover/mpos/sdk/core/flow/ExecutionFlow;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "", "step", "withStep", "(Lkotlin/jvm/functions/Function1;)Lcom/discover/mpos/sdk/core/flow/ExecutionFlowBuilder;", "Lcom/discover/mpos/sdk/core/flow/ExecutionStep;", "(Lcom/discover/mpos/sdk/core/flow/ExecutionStep;)Lcom/discover/mpos/sdk/core/flow/ExecutionFlowBuilder;"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public interface ExecutionFlowBuilder<K> {
    com.discover.mpos.sdk.core.flow.ExecutionFlow<K> build();

    com.discover.mpos.sdk.core.flow.ExecutionFlowBuilder<K> withStep(com.discover.mpos.sdk.core.flow.ExecutionStep<K> step);

    com.discover.mpos.sdk.core.flow.ExecutionFlowBuilder<K> withStep(kotlin.jvm.functions.Function1<? super K, kotlin.Unit> step);

    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    public static final class DefaultImpls {
        public static <K> com.discover.mpos.sdk.core.flow.ExecutionFlowBuilder<K> withStep(com.discover.mpos.sdk.core.flow.ExecutionFlowBuilder<K> executionFlowBuilder, final kotlin.jvm.functions.Function1<? super K, kotlin.Unit> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            return executionFlowBuilder.withStep(new com.discover.mpos.sdk.core.flow.ExecutionStep<K>() { // from class: com.discover.mpos.sdk.core.flow.ExecutionFlowBuilder$withStep$1
                @Override // com.discover.mpos.sdk.core.flow.ExecutionStep
                public final void execute(com.discover.mpos.sdk.core.flow.ExecutionFlow<? super K> flow, K input) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
                    kotlin.jvm.functions.Function1.this.invoke(input);
                }
            });
        }
    }
}
