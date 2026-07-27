package com.inmobi.media;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* renamed from: com.inmobi.media.q5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4012q5 {
    public static final CoroutineScope a(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        return CoroutineScopeKt.CoroutineScope(coroutineScope.getCoroutineContext().plus(JobKt.Job((Job) coroutineScope.getCoroutineContext().get(Job.INSTANCE))));
    }

    public static final CoroutineScope a(CoroutineScope coroutineScope, CoroutineExceptionHandler coroutineExceptionHandler) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Job job = (Job) coroutineScope.getCoroutineContext().get(Job.INSTANCE);
        CompletableJob SupervisorJob = job != null ? SupervisorKt.SupervisorJob(job) : SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorJob.plus(Dispatchers.getMain().getImmediate()).plus(coroutineExceptionHandler));
        return CoroutineScope == null ? CoroutineScopeKt.CoroutineScope(SupervisorJob.plus(Dispatchers.getMain().getImmediate())) : CoroutineScope;
    }

    public static final Job a(CoroutineScope coroutineScope, Function2 block) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, block, 2, null);
        return launch$default;
    }

    public static final void a(MutableSharedFlow mutableSharedFlow, CoroutineScope scope, AbstractC3595bd abstractC3595bd) {
        Intrinsics.checkNotNullParameter(mutableSharedFlow, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new C3984p5(mutableSharedFlow, abstractC3595bd, null), 3, null);
    }

    public static final void a(CancellableContinuationImpl cancellableContinuationImpl, Object obj) {
        Intrinsics.checkNotNullParameter(cancellableContinuationImpl, "<this>");
        if (cancellableContinuationImpl.isActive()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m8079constructorimpl(obj));
            } catch (Exception unused) {
            }
        }
    }

    public static final void a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Job.DefaultImpls.cancel$default((Job) it.next(), (CancellationException) null, 1, (Object) null);
        }
        list.clear();
    }
}
