package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class L6 {
    public static final boolean a(java.lang.String str) {
        return str == null || kotlin.text.StringsKt.trim((java.lang.CharSequence) str).toString().length() == 0 || !(kotlin.text.StringsKt.startsWith$default(str, "http://", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(str, "https://", false, 2, (java.lang.Object) null));
    }

    public static final void a(android.os.HandlerThread handlerThread, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handlerThread, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        try {
            handlerThread.start();
        } catch (java.lang.InternalError e) {
            e.toString();
        }
    }

    public static final void a(kotlinx.coroutines.Job job) {
        if (job == null || !job.isActive()) {
            return;
        }
        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
    }
}
