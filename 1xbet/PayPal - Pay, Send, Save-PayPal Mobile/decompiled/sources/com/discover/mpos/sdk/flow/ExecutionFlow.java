package com.discover.mpos.sdk.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\tJ\b\u0010\u000b\u001a\u00020\u0007H&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/discover/mpos/sdk/flow/ExecutionFlow;", "K", "", "isTerminated", "", "()Z", "executeNextStep", "", "input", "(Ljava/lang/Object;)V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "terminate", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.c.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public interface ExecutionFlow<K> {
    void a();

    void a(K k);

    void b(K k);

    boolean b();
}
