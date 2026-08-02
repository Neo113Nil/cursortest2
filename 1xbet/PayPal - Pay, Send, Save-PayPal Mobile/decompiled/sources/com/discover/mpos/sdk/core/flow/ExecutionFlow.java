package com.discover.mpos.sdk.core.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/discover/mpos/sdk/core/flow/ExecutionFlow;", "K", "", "input", "", "executeNextStep", "(Ljava/lang/Object;)V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "terminate", "()V", "", "isTerminated", "()Z"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public interface ExecutionFlow<K> {
    void executeNextStep(K input);

    boolean isTerminated();

    void start(K input);

    void terminate();
}
