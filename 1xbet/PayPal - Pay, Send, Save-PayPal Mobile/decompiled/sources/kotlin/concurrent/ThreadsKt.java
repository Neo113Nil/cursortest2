package kotlin.concurrent;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aQ\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "isDaemon", "Ljava/lang/ClassLoader;", "contextClassLoader", "", "name", "", "priority", "Lkotlin/Function0;", "", "block", "Ljava/lang/Thread;", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.THREAD_NAME, "(ZZLjava/lang/ClassLoader;Ljava/lang/String;ILkotlin/jvm/functions/Function0;)Ljava/lang/Thread;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ThreadsKt {
    public static /* synthetic */ java.lang.Thread thread$default(boolean z, boolean z2, java.lang.ClassLoader classLoader, java.lang.String str, int i, kotlin.jvm.functions.Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        java.lang.ClassLoader classLoader2 = (i2 & 4) != 0 ? null : classLoader;
        java.lang.String str2 = (i2 & 8) != 0 ? null : str;
        if ((i2 & 16) != 0) {
            i = -1;
        }
        return thread(z3, z4, classLoader2, str2, i, function0);
    }

    public static final java.lang.Thread thread(boolean z, boolean z2, java.lang.ClassLoader classLoader, java.lang.String str, int i, final kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        java.lang.Thread thread = new java.lang.Thread() { // from class: kotlin.concurrent.ThreadsKt$thread$thread$1
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                function0.invoke();
            }
        };
        if (z2) {
            thread.setDaemon(true);
        }
        if (i > 0) {
            thread.setPriority(i);
        }
        if (str != null) {
            thread.setName(str);
        }
        if (classLoader != null) {
            thread.setContextClassLoader(classLoader);
        }
        if (z) {
            thread.start();
        }
        return thread;
    }
}
