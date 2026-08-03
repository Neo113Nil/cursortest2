package io.ktor.util;

/* compiled from: CoroutinesUtils.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/Job;", "", "offset", "", "printDebugTree", "(Lkotlinx/coroutines/Job;I)V", "parent", "Lkotlin/coroutines/CoroutineContext;", "SilentSupervisor", "(Lkotlinx/coroutines/Job;)Lkotlin/coroutines/CoroutineContext;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CoroutinesUtilsKt {
    public static /* synthetic */ void printDebugTree$default(kotlinx.coroutines.Job job, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        printDebugTree(job, i);
    }

    public static final void printDebugTree(kotlinx.coroutines.Job job, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(job, "<this>");
        java.lang.System.out.println((java.lang.Object) (kotlin.text.StringsKt.repeat(io.ktor.sse.ServerSentEventKt.SPACE, i) + job));
        java.util.Iterator<kotlinx.coroutines.Job> it = job.getChildren().iterator();
        while (it.hasNext()) {
            printDebugTree(it.next(), i + 2);
        }
        if (i == 0) {
            java.lang.System.out.println();
        }
    }

    public static /* synthetic */ kotlin.coroutines.CoroutineContext SilentSupervisor$default(kotlinx.coroutines.Job job, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return SilentSupervisor(job);
    }

    public static final kotlin.coroutines.CoroutineContext SilentSupervisor(kotlinx.coroutines.Job job) {
        return kotlinx.coroutines.SupervisorKt.SupervisorJob(job).plus(new io.ktor.util.CoroutinesUtilsKt$SilentSupervisor$$inlined$CoroutineExceptionHandler$1(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE));
    }
}
