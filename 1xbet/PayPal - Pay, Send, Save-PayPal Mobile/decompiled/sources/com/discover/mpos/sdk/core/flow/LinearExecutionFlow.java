package com.discover.mpos.sdk.core.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u0005J#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R$\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/discover/mpos/sdk/core/flow/LinearExecutionFlow;", "K", "Lcom/discover/mpos/sdk/core/flow/ExecutionFlow;", "Lcom/discover/mpos/sdk/core/flow/ExecutionFlowBuilder;", "<init>", "()V", "build", "()Lcom/discover/mpos/sdk/core/flow/ExecutionFlow;", "input", "", "executeNextStep", "(Ljava/lang/Object;)V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "terminate", "Lcom/discover/mpos/sdk/core/flow/ExecutionStep;", "step", "withStep", "(Lcom/discover/mpos/sdk/core/flow/ExecutionStep;)Lcom/discover/mpos/sdk/core/flow/ExecutionFlowBuilder;", "currentStep", "Lcom/discover/mpos/sdk/core/flow/ExecutionStep;", "", "getHasNextStep", "()Z", "hasNextStep", "isTerminated", "", "stepIterator", "Ljava/util/Iterator;", "Ljava/util/LinkedList;", "steps", "Ljava/util/LinkedList;"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public class LinearExecutionFlow<K> implements com.discover.mpos.sdk.core.flow.ExecutionFlow<K>, com.discover.mpos.sdk.core.flow.ExecutionFlowBuilder<K> {
    private com.discover.mpos.sdk.core.flow.ExecutionStep<K> currentStep;
    private java.util.Iterator<? extends com.discover.mpos.sdk.core.flow.ExecutionStep<K>> stepIterator;
    private java.util.LinkedList<com.discover.mpos.sdk.core.flow.ExecutionStep<K>> steps = new java.util.LinkedList<>();

    @Override // com.discover.mpos.sdk.core.flow.ExecutionFlowBuilder
    public com.discover.mpos.sdk.core.flow.ExecutionFlowBuilder<K> withStep(kotlin.jvm.functions.Function1<? super K, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return com.discover.mpos.sdk.core.flow.ExecutionFlowBuilder.DefaultImpls.withStep(this, function1);
    }

    @Override // com.discover.mpos.sdk.core.flow.ExecutionFlow
    public void start(K input) {
        this.stepIterator = this.steps.iterator();
        executeNextStep(input);
    }

    @Override // com.discover.mpos.sdk.core.flow.ExecutionFlowBuilder
    public com.discover.mpos.sdk.core.flow.ExecutionFlowBuilder<K> withStep(com.discover.mpos.sdk.core.flow.ExecutionStep<K> step) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
        this.steps.add(step);
        return this;
    }

    @Override // com.discover.mpos.sdk.core.flow.ExecutionFlowBuilder
    public com.discover.mpos.sdk.core.flow.ExecutionFlow<K> build() {
        return this;
    }

    @Override // com.discover.mpos.sdk.core.flow.ExecutionFlow
    public void executeNextStep(K input) {
        if (getHasNextStep()) {
            java.util.Iterator<? extends com.discover.mpos.sdk.core.flow.ExecutionStep<K>> it = this.stepIterator;
            com.discover.mpos.sdk.core.flow.ExecutionStep<K> next = it != null ? it.next() : null;
            this.currentStep = next;
            if (next != null) {
                next.execute(this, input);
                return;
            }
            return;
        }
        terminate();
    }

    @Override // com.discover.mpos.sdk.core.flow.ExecutionFlow
    public void terminate() {
        if (this.stepIterator != null) {
            this.stepIterator = null;
            this.steps.clear();
        }
    }

    @Override // com.discover.mpos.sdk.core.flow.ExecutionFlow
    public boolean isTerminated() {
        return !getHasNextStep();
    }

    private final boolean getHasNextStep() {
        java.util.Iterator<? extends com.discover.mpos.sdk.core.flow.ExecutionStep<K>> it = this.stepIterator;
        if (it != null) {
            return it.hasNext();
        }
        return false;
    }
}
