package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Zb {
    public static void a(kotlin.jvm.functions.Function1 runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.H9.c, null, null, new com.inmobi.media.Vb(runnable, null), 3, null);
    }

    public static java.lang.Object a(kotlin.jvm.functions.Function0 run) {
        java.util.concurrent.Semaphore semaphore;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(run, "run");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            try {
                try {
                    semaphore = com.inmobi.media.AbstractC2273ac.b;
                    semaphore.acquire();
                    run.invoke();
                } catch (java.lang.Exception e) {
                    kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
                    com.inmobi.media.W9.a(new com.inmobi.media.M2(e));
                    semaphore = com.inmobi.media.AbstractC2273ac.b;
                }
                semaphore.release();
                return kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                com.inmobi.media.AbstractC2273ac.b.release();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
    }

    public static java.lang.String a(android.content.Context context, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.io.File file = new java.io.File(context.getFilesDir() + "/logging");
        if (!file.exists()) {
            file.mkdirs();
        }
        return context.getFilesDir() + "/logging/" + j + ".txt";
    }

    public static java.lang.String a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return context.getFilesDir() + "/logging";
    }
}
