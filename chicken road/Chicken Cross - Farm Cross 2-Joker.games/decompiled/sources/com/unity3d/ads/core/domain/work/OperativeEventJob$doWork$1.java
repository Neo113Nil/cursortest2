package com.unity3d.ads.core.domain.work;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OperativeEventJob.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.work.OperativeEventJob", f = "OperativeEventJob.kt", i = {0}, l = {33}, m = "doWork", n = {"startTime"}, s = {"J$0"})
/* loaded from: classes7.dex */
final class OperativeEventJob$doWork$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OperativeEventJob this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OperativeEventJob$doWork$1(OperativeEventJob operativeEventJob, Continuation<? super OperativeEventJob$doWork$1> continuation) {
        super(continuation);
        this.this$0 = operativeEventJob;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doWork(this);
    }
}
