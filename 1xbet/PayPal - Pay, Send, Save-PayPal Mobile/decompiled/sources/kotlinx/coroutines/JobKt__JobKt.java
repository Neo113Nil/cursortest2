package kotlinx.coroutines;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0019\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\t\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0014\u0010\u000f\u001a\u00020\u000e*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0013\u001a\u00020\u000e*\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0013\u001a\u00020\u000e*\u00020\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0015\u001a\u001f\u0010\u0013\u001a\u00020\u000e*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0013\u0010\u0017\u001a#\u0010\u0019\u001a\u00020\u000e*\u00020\u00182\u0010\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u0019\u001a\u00020\u000e*\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001b\u001a\u0011\u0010\u001c\u001a\u00020\u000e*\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u0015\u001a\u0011\u0010\u001c\u001a\u00020\u000e*\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001b\u001a%\u0010\u0019\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u001d2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001e\u001a\u001f\u0010\u0019\u001a\u00020\u0001*\u00020\u00182\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001f\u001a#\u0010\u0013\u001a\u00020\u000e*\u00020\u00182\u0010\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012¢\u0006\u0004\b\u0013\u0010\u001a\u001a\u0013\u0010\u0013\u001a\u00020\u000e*\u00020\u0018H\u0007¢\u0006\u0004\b\u0013\u0010\u001b\u001a\u001f\u0010\u0013\u001a\u00020\u000e*\u00020\u00182\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0013\u0010 \"\u0015\u0010#\u001a\u00020\u0001*\u00020\u00188G¢\u0006\u0006\u001a\u0004\b!\u0010\"\"\u0015\u0010&\u001a\u00020\u0000*\u00020\u00188G¢\u0006\u0006\u001a\u0004\b$\u0010%"}, d2 = {"Lkotlinx/coroutines/Job;", "", "p0", "Lkotlinx/coroutines/JobNode;", "p1", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCompletion", "(Lkotlinx/coroutines/Job;ZLkotlinx/coroutines/JobNode;)Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/CompletableJob;", "Job", "(Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/CompletableJob;", "(Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/Job;", "disposeOnCompletion", "(Lkotlinx/coroutines/Job;Lkotlinx/coroutines/DisposableHandle;)Lkotlinx/coroutines/DisposableHandle;", "", "cancelAndJoin", "(Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/getHighSpeedVideoFpsRangesFor;", "cancelChildren", "(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;)V", "(Lkotlinx/coroutines/Job;)V", "", "(Lkotlinx/coroutines/Job;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/CoroutineContext;", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/CancellationException;)V", "(Lkotlin/coroutines/CoroutineContext;)V", "ensureActive", "", "(Lkotlinx/coroutines/Job;Ljava/lang/String;Ljava/lang/Throwable;)V", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)Z", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "isActive", "(Lkotlin/coroutines/CoroutineContext;)Z", "Camera2StreamConfigurationMap", "getJob", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/Job;", "getHighSpeedVideoFpsRanges"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/JobKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class JobKt__JobKt {
    public static /* synthetic */ kotlinx.coroutines.DisposableHandle invokeOnCompletion$default(kotlinx.coroutines.Job job, boolean z, kotlinx.coroutines.JobNode jobNode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return kotlinx.coroutines.JobKt.invokeOnCompletion(job, z, jobNode);
    }

    public static final kotlinx.coroutines.DisposableHandle invokeOnCompletion(kotlinx.coroutines.Job job, boolean z, kotlinx.coroutines.JobNode jobNode) {
        return job instanceof kotlinx.coroutines.JobSupport ? ((kotlinx.coroutines.JobSupport) job).invokeOnCompletionInternal$kotlinx_coroutines_core(z, jobNode) : job.invokeOnCompletion(jobNode.getOnCancelling(), z, new kotlinx.coroutines.JobKt__JobKt$invokeOnCompletion$1(jobNode));
    }

    public static /* synthetic */ kotlinx.coroutines.CompletableJob Job$default(kotlinx.coroutines.Job job, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return kotlinx.coroutines.JobKt.Job(job);
    }

    public static final kotlinx.coroutines.CompletableJob Job(kotlinx.coroutines.Job job) {
        return new kotlinx.coroutines.JobImpl(job);
    }

    /* renamed from: Job$default, reason: collision with other method in class */
    public static /* synthetic */ kotlinx.coroutines.Job m24063Job$default(kotlinx.coroutines.Job job, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return m24062Job(job);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* renamed from: Job, reason: collision with other method in class */
    public static final /* synthetic */ kotlinx.coroutines.Job m24062Job(kotlinx.coroutines.Job job) {
        return kotlinx.coroutines.JobKt.Job(job);
    }

    public static final kotlinx.coroutines.DisposableHandle disposeOnCompletion(kotlinx.coroutines.Job job, kotlinx.coroutines.DisposableHandle disposableHandle) {
        return invokeOnCompletion$default(job, false, new kotlinx.coroutines.DisposeOnCompletion(disposableHandle), 1, null);
    }

    public static final java.lang.Object cancelAndJoin(kotlinx.coroutines.Job job, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        java.lang.Object join = job.join(continuation);
        return join == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? join : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void cancelChildren$default(kotlinx.coroutines.Job job, java.util.concurrent.CancellationException cancellationException, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        kotlinx.coroutines.JobKt.cancelChildren(job, cancellationException);
    }

    public static final void cancelChildren(kotlinx.coroutines.Job job, java.util.concurrent.CancellationException cancellationException) {
        java.util.Iterator<kotlinx.coroutines.Job> it = job.getChildren().iterator();
        while (it.hasNext()) {
            it.next().cancel(cancellationException);
        }
    }

    public static /* synthetic */ void cancelChildren$default(kotlinx.coroutines.Job job, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        cancelChildren(job, th);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancelChildren(kotlinx.coroutines.Job job, java.lang.Throwable th) {
        for (kotlinx.coroutines.Job job2 : job.getChildren()) {
            kotlinx.coroutines.JobSupport jobSupport = job2 instanceof kotlinx.coroutines.JobSupport ? (kotlinx.coroutines.JobSupport) job2 : null;
            if (jobSupport != null) {
                jobSupport.cancelInternal(th == null ? new kotlinx.coroutines.JobCancellationException("Job was cancelled", null, job) : th);
            }
        }
    }

    public static final boolean isActive(kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) coroutineContext.get(kotlinx.coroutines.Job.INSTANCE);
        if (job != null) {
            return job.isActive();
        }
        return true;
    }

    public static /* synthetic */ void cancel$default(kotlin.coroutines.CoroutineContext coroutineContext, java.util.concurrent.CancellationException cancellationException, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        kotlinx.coroutines.JobKt.cancel(coroutineContext, cancellationException);
    }

    public static final void cancel(kotlin.coroutines.CoroutineContext coroutineContext, java.util.concurrent.CancellationException cancellationException) {
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) coroutineContext.get(kotlinx.coroutines.Job.INSTANCE);
        if (job != null) {
            job.cancel(cancellationException);
        }
    }

    public static final void ensureActive(kotlinx.coroutines.Job job) {
        if (!job.isActive()) {
            throw job.getCancellationException();
        }
    }

    public static final void ensureActive(kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) coroutineContext.get(kotlinx.coroutines.Job.INSTANCE);
        if (job != null) {
            kotlinx.coroutines.JobKt.ensureActive(job);
        }
    }

    public static final void cancel(kotlinx.coroutines.Job job, java.lang.String str, java.lang.Throwable th) {
        job.cancel(kotlinx.coroutines.ExceptionsKt.CancellationException(str, th));
    }

    public static /* synthetic */ void cancel$default(kotlinx.coroutines.Job job, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        kotlinx.coroutines.JobKt.cancel(job, str, th);
    }

    public static /* synthetic */ boolean cancel$default(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        return cancel(coroutineContext, th);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ boolean cancel(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Throwable th) {
        kotlin.coroutines.CoroutineContext.Element element = coroutineContext.get(kotlinx.coroutines.Job.INSTANCE);
        kotlinx.coroutines.JobSupport jobSupport = element instanceof kotlinx.coroutines.JobSupport ? (kotlinx.coroutines.JobSupport) element : null;
        if (jobSupport == null) {
            return false;
        }
        kotlinx.coroutines.JobSupport jobSupport2 = jobSupport;
        if (th == null) {
            th = new kotlinx.coroutines.JobCancellationException("Job was cancelled", null, jobSupport2);
        }
        jobSupport.cancelInternal(th);
        return true;
    }

    public static /* synthetic */ void cancelChildren$default(kotlin.coroutines.CoroutineContext coroutineContext, java.util.concurrent.CancellationException cancellationException, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        kotlinx.coroutines.JobKt.cancelChildren(coroutineContext, cancellationException);
    }

    public static final void cancelChildren(kotlin.coroutines.CoroutineContext coroutineContext, java.util.concurrent.CancellationException cancellationException) {
        kotlin.sequences.Sequence<kotlinx.coroutines.Job> children;
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) coroutineContext.get(kotlinx.coroutines.Job.INSTANCE);
        if (job == null || (children = job.getChildren()) == null) {
            return;
        }
        java.util.Iterator<kotlinx.coroutines.Job> it = children.iterator();
        while (it.hasNext()) {
            it.next().cancel(cancellationException);
        }
    }

    public static final kotlinx.coroutines.Job getJob(kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) coroutineContext.get(kotlinx.coroutines.Job.INSTANCE);
        if (job != null) {
            return job;
        }
        throw new java.lang.IllegalStateException("Current context doesn't contain Job in it: ".concat(java.lang.String.valueOf(coroutineContext)).toString());
    }

    public static /* synthetic */ void cancelChildren$default(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        cancelChildren(coroutineContext, th);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void cancelChildren(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Throwable th) {
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) coroutineContext.get(kotlinx.coroutines.Job.INSTANCE);
        if (job != null) {
            for (kotlinx.coroutines.Job job2 : job.getChildren()) {
                kotlinx.coroutines.JobSupport jobSupport = job2 instanceof kotlinx.coroutines.JobSupport ? (kotlinx.coroutines.JobSupport) job2 : null;
                if (jobSupport != null) {
                    jobSupport.cancelInternal(th == null ? new kotlinx.coroutines.JobCancellationException("Job was cancelled", null, job) : th);
                }
            }
        }
    }
}
