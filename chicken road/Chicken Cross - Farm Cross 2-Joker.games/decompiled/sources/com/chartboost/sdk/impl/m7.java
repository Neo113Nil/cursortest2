package com.chartboost.sdk.impl;

import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.tracking.g;
import java.lang.Thread;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class m7 {

    /* renamed from: a, reason: collision with root package name */
    public static final m7 f4873a = new m7();
    public static i7 b;

    public final void a() {
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        b = Chartboost.isSdkStarted() ? yh.a() : null;
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.chartboost.sdk.impl.m7$$ExternalSyntheticLambda0
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                m7.a(defaultUncaughtExceptionHandler, thread, th);
            }
        });
    }

    public final boolean b(Throwable th) {
        String className;
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        int length = stackTrace.length;
        for (int i = 0; i < length; i++) {
            StackTraceElement stackTraceElement = stackTrace[i];
            if ((stackTraceElement == null || (className = stackTraceElement.getClassName()) == null) ? false : StringsKt.startsWith$default(className, "com.chartboost.sdk", false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    public static final void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        m7 m7Var = f4873a;
        Intrinsics.checkNotNull(th);
        if (m7Var.b(th)) {
            try {
                i7 i7Var = b;
                if (i7Var != null) {
                    i7Var.track((com.chartboost.sdk.tracking.f) new com.chartboost.sdk.tracking.b(g.i.o, m7Var.a(th), null, null, null, 28, null));
                }
            } catch (Exception unused) {
            }
        }
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    public final String a(Throwable th) {
        String jSONObject = new JSONObject().put("reason", "dismiss_event due to the unhandled exceptions").put("error", String.valueOf(th)).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        return jSONObject;
    }
}
