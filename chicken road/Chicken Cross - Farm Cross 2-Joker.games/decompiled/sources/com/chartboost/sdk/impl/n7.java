package com.chartboost.sdk.impl;

import io.ktor.sse.ServerSentEventKt;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class n7 {
    public static final String a(Exception exc) {
        String message;
        return (exc == null || (message = exc.getMessage()) == null) ? "Unknown error" : message;
    }

    public static final CharSequence b(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
        return StringsKt.substringAfterLast$default(className, '.', (String) null, 2, (Object) null) + "." + stackTraceElement.getMethodName() + ServerSentEventKt.COLON + stackTraceElement.getLineNumber();
    }

    public static final String a(Throwable th, int i) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            if (StringsKt.startsWith$default(className, "com.chartboost.sdk", false, 2, (Object) null)) {
                arrayList.add(stackTraceElement);
            }
        }
        String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.take(arrayList, i), " | ", null, null, 0, null, new Function1() { // from class: com.chartboost.sdk.impl.n7$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n7.b((StackTraceElement) obj);
            }
        }, 30, null);
        return joinToString$default.length() == 0 ? "<no_sdk_frames>" : joinToString$default;
    }

    public static final String a(int i) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            if (StringsKt.startsWith$default(className, "com.chartboost.sdk", false, 2, (Object) null)) {
                arrayList.add(stackTraceElement);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String className2 = ((StackTraceElement) obj).getClassName();
            Intrinsics.checkNotNullExpressionValue(className2, "getClassName(...)");
            if (!StringsKt.contains$default((CharSequence) className2, (CharSequence) "ExceptionUtils", false, 2, (Object) null)) {
                arrayList2.add(obj);
            }
        }
        String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.take(arrayList2, i), " | ", null, null, 0, null, new Function1() { // from class: com.chartboost.sdk.impl.n7$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return n7.a((StackTraceElement) obj2);
            }
        }, 30, null);
        return joinToString$default.length() == 0 ? "<no_sdk_frames>" : joinToString$default;
    }

    public static final CharSequence a(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
        return StringsKt.substringAfterLast$default(className, '.', (String) null, 2, (Object) null) + "." + stackTraceElement.getMethodName() + ServerSentEventKt.COLON + stackTraceElement.getLineNumber();
    }
}
