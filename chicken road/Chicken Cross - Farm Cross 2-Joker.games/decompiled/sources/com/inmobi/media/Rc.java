package com.inmobi.media;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Semaphore;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes6.dex */
public abstract class Rc {
    public static void a(Function1 runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new Nc(runnable, null), 3, null);
    }

    public static Object a(Function0 run) {
        Semaphore semaphore;
        Intrinsics.checkNotNullParameter(run, "run");
        try {
            Result.Companion companion = Result.INSTANCE;
            try {
                try {
                    semaphore = Sc.b;
                    semaphore.acquire();
                    run.invoke();
                } catch (Exception e) {
                    Lazy lazy = Ba.f6473a;
                    Ba.a(new C3810j3(e));
                    semaphore = Sc.b;
                }
                semaphore.release();
                return Result.m8079constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Sc.b.release();
                throw th;
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8079constructorimpl(ResultKt.createFailure(th2));
        }
    }

    public static String a(Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(context.getFilesDir() + "/logging");
        if (!file.exists()) {
            file.mkdirs();
        }
        return context.getFilesDir() + "/logging/" + j + ".txt";
    }

    public static String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getFilesDir() + "/logging";
    }
}
