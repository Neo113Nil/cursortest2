package com.discover.mpos.sdk.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/discover/mpos/sdk/flow/LinearExecutionFlow;", "K", "Lcom/discover/mpos/sdk/flow/ExecutionFlow;", "Lcom/discover/mpos/sdk/flow/ExecutionFlowBuilder;", "()V", "currentStep", "Lcom/discover/mpos/sdk/flow/ExecutionStep;", "hasNextStep", "", "getHasNextStep", "()Z", "isTerminated", "stepIterator", "", "steps", "Ljava/util/LinkedList;", "build", "executeNextStep", "", "input", "(Ljava/lang/Object;)V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "terminate", "withStep", "step", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.c.d, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public class LinearExecutionFlow<K> implements com.discover.mpos.sdk.flow.ExecutionFlow<K>, com.discover.mpos.sdk.flow.ExecutionFlowBuilder<K> {

    /* renamed from: a, reason: collision with root package name */
    private java.util.LinkedList<com.discover.mpos.sdk.flow.ExecutionStep<K>> f2930a = new java.util.LinkedList<>();
    private java.util.Iterator<? extends com.discover.mpos.sdk.flow.ExecutionStep<K>> b;
    private com.discover.mpos.sdk.flow.ExecutionStep<K> c;

    @Override // com.discover.mpos.sdk.flow.ExecutionFlowBuilder
    public final com.discover.mpos.sdk.flow.ExecutionFlowBuilder<K> a(kotlin.jvm.functions.Function1<? super K, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return com.discover.mpos.sdk.flow.ExecutionFlowBuilder.a.a(this, function1);
    }

    @Override // com.discover.mpos.sdk.flow.ExecutionFlow
    public final void a(K k) {
        this.b = this.f2930a.iterator();
        b(k);
    }

    @Override // com.discover.mpos.sdk.flow.ExecutionFlowBuilder
    public com.discover.mpos.sdk.flow.ExecutionFlowBuilder<K> a(com.discover.mpos.sdk.flow.ExecutionStep<K> executionStep) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionStep, "");
        this.f2930a.add(executionStep);
        return this;
    }

    @Override // com.discover.mpos.sdk.flow.ExecutionFlowBuilder
    public com.discover.mpos.sdk.flow.ExecutionFlow<K> c() {
        return this;
    }

    @Override // com.discover.mpos.sdk.flow.ExecutionFlow
    public final void b(K k) {
        if (d()) {
            java.util.Iterator<? extends com.discover.mpos.sdk.flow.ExecutionStep<K>> it = this.b;
            com.discover.mpos.sdk.flow.ExecutionStep<K> next = it != null ? it.next() : null;
            this.c = next;
            if (next != null) {
                next.a(this, k);
                return;
            }
            return;
        }
        a();
    }

    @Override // com.discover.mpos.sdk.flow.ExecutionFlow
    public final void a() {
        if (this.b != null) {
            this.b = null;
            this.f2930a.clear();
        }
    }

    @Override // com.discover.mpos.sdk.flow.ExecutionFlow
    public final boolean b() {
        return !d();
    }

    private final boolean d() {
        java.util.Iterator<? extends com.discover.mpos.sdk.flow.ExecutionStep<K>> it = this.b;
        if (it != null) {
            return it.hasNext();
        }
        return false;
    }
}
