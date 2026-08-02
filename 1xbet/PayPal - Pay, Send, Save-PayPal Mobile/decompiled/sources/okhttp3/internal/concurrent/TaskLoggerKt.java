package okhttp3.internal.concurrent;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Ljava/util/logging/Logger;", "Lokhttp3/internal/concurrent/Task;", "task", "Lokhttp3/internal/concurrent/TaskQueue;", "queue", "Lkotlin/Function0;", "", "messageBlock", "", "taskLog", "(Ljava/util/logging/Logger;Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Lkotlin/jvm/functions/Function0;)V", "T", "block", "logElapsed", "(Ljava/util/logging/Logger;Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "ns", "formatDuration", "(J)Ljava/lang/String;"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TaskLoggerKt {
    public static final void taskLog(java.util.logging.Logger logger, okhttp3.internal.concurrent.Task task, okhttp3.internal.concurrent.TaskQueue taskQueue, kotlin.jvm.functions.Function0<java.lang.String> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskQueue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        if (logger.isLoggable(java.util.logging.Level.FINE)) {
            access$log(logger, task, taskQueue, function0.invoke());
        }
    }

    public static final <T> T logElapsed(java.util.logging.Logger logger, okhttp3.internal.concurrent.Task task, okhttp3.internal.concurrent.TaskQueue taskQueue, kotlin.jvm.functions.Function0<? extends T> function0) {
        long j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskQueue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        boolean isLoggable = logger.isLoggable(java.util.logging.Level.FINE);
        if (isLoggable) {
            j = taskQueue.getTaskRunner().getBackend().nanoTime();
            access$log(logger, task, taskQueue, "starting");
        } else {
            j = -1;
        }
        try {
            T invoke = function0.invoke();
            if (isLoggable) {
                long nanoTime = taskQueue.getTaskRunner().getBackend().nanoTime();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("finished run in ");
                sb.append(formatDuration(nanoTime - j));
                access$log(logger, task, taskQueue, sb.toString());
            }
            return invoke;
        } catch (java.lang.Throwable th) {
            if (isLoggable) {
                long nanoTime2 = taskQueue.getTaskRunner().getBackend().nanoTime();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("failed a run in ");
                sb2.append(formatDuration(nanoTime2 - j));
                access$log(logger, task, taskQueue, sb2.toString());
            }
            throw th;
        }
    }

    public static final java.lang.String formatDuration(long j) {
        java.lang.String obj;
        if (j <= -999500000) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append((j - 500000000) / 1000000000);
            sb.append(" s ");
            obj = sb.toString();
        } else if (j <= -999500) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append((j - 500000) / 1000000);
            sb2.append(" ms");
            obj = sb2.toString();
        } else if (j <= 0) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append((j - 500) / 1000);
            sb3.append(" µs");
            obj = sb3.toString();
        } else if (j < 999500) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append((j + 500) / 1000);
            sb4.append(" µs");
            obj = sb4.toString();
        } else if (j < 999500000) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append((j + 500000) / 1000000);
            sb5.append(" ms");
            obj = sb5.toString();
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append((j + 500000000) / 1000000000);
            sb6.append(" s ");
            obj = sb6.toString();
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format("%6s", java.util.Arrays.copyOf(new java.lang.Object[]{obj}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    public static final /* synthetic */ void access$log(java.util.logging.Logger logger, okhttp3.internal.concurrent.Task task, okhttp3.internal.concurrent.TaskQueue taskQueue, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(taskQueue.getName());
        sb.append(' ');
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format("%-22s", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        sb.append(format);
        sb.append(": ");
        sb.append(task.getName());
        logger.fine(sb.toString());
    }
}
