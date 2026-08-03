package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class T4 {
    public static final kotlinx.coroutines.CoroutineScope a(kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        return kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(coroutineScope.getCoroutineContext().plus(kotlinx.coroutines.JobKt.Job((kotlinx.coroutines.Job) coroutineScope.getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE))));
    }

    public static final kotlinx.coroutines.CoroutineScope a(kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) coroutineScope.getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE);
        kotlinx.coroutines.CompletableJob SupervisorJob = job != null ? kotlinx.coroutines.SupervisorKt.SupervisorJob(job) : kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
        kotlinx.coroutines.CoroutineScope CoroutineScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(SupervisorJob.plus(kotlinx.coroutines.Dispatchers.getMain().getImmediate()).plus(coroutineExceptionHandler));
        return CoroutineScope == null ? kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(SupervisorJob.plus(kotlinx.coroutines.Dispatchers.getMain().getImmediate())) : CoroutineScope;
    }

    public static final kotlinx.coroutines.Job a(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function2 block) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, kotlinx.coroutines.Dispatchers.getMain(), null, block, 2, null);
        return launch$default;
    }

    public static final void a(kotlinx.coroutines.flow.MutableSharedFlow mutableSharedFlow, kotlinx.coroutines.CoroutineScope scope, com.inmobi.media.AbstractC2509jc abstractC2509jc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableSharedFlow, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(scope, null, null, new com.inmobi.media.S4(mutableSharedFlow, abstractC2509jc, null), 3, null);
    }

    public static final void a(kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancellableContinuationImpl, "<this>");
        if (cancellableContinuationImpl.isActive()) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(kotlin.Result.m10798constructorimpl(obj));
            } catch (java.lang.IllegalStateException unused) {
            }
        }
    }

    public static final void a(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<this>");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) it.next(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        list.clear();
    }
}
