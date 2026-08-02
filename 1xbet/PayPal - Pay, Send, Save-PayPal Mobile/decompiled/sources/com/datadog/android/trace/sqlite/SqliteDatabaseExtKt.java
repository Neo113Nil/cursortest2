package com.datadog.android.trace.sqlite;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aN\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001d\u0010\t\u001a\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"T", "Landroid/database/sqlite/SQLiteDatabase;", "", "operationName", "", "exclusive", "Lkotlin/Function2;", "Lcom/datadog/android/trace/api/span/DatadogSpan;", "Lkotlin/ExtensionFunctionType;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "transactionTraced", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;)Ljava/lang/Object;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SqliteDatabaseExtKt {
    public static /* synthetic */ java.lang.Object transactionTraced$default(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str, boolean z, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteDatabase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        com.datadog.android.trace.api.span.DatadogSpan activeSpan = com.datadog.android.trace.GlobalDatadogTracer.get().activeSpan();
        com.datadog.android.trace.api.tracer.DatadogTracer datadogTracer = com.datadog.android.trace.GlobalDatadogTracer.get();
        com.datadog.android.trace.api.span.DatadogSpan start = datadogTracer.buildSpan(str).withParentSpan(activeSpan).start();
        com.datadog.android.trace.api.scope.DatadogScope activateSpan = datadogTracer.activateSpan(start);
        try {
            if (z) {
                sQLiteDatabase.beginTransaction();
            } else {
                sQLiteDatabase.beginTransactionNonExclusive();
            }
            try {
                java.lang.Object invoke = function2.invoke(start, sQLiteDatabase);
                sQLiteDatabase.setTransactionSuccessful();
                return invoke;
            } finally {
                sQLiteDatabase.endTransaction();
            }
        } finally {
        }
    }

    public static final <T> T transactionTraced(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str, boolean z, kotlin.jvm.functions.Function2<? super com.datadog.android.trace.api.span.DatadogSpan, ? super android.database.sqlite.SQLiteDatabase, ? extends T> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteDatabase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        com.datadog.android.trace.api.span.DatadogSpan activeSpan = com.datadog.android.trace.GlobalDatadogTracer.get().activeSpan();
        com.datadog.android.trace.api.tracer.DatadogTracer datadogTracer = com.datadog.android.trace.GlobalDatadogTracer.get();
        com.datadog.android.trace.api.span.DatadogSpan start = datadogTracer.buildSpan(str).withParentSpan(activeSpan).start();
        com.datadog.android.trace.api.scope.DatadogScope activateSpan = datadogTracer.activateSpan(start);
        try {
            if (z) {
                sQLiteDatabase.beginTransaction();
            } else {
                sQLiteDatabase.beginTransactionNonExclusive();
            }
            try {
                T invoke = function2.invoke(start, sQLiteDatabase);
                sQLiteDatabase.setTransactionSuccessful();
                return invoke;
            } finally {
                sQLiteDatabase.endTransaction();
            }
        } catch (java.lang.Throwable th) {
            try {
                start.logThrowable(th);
                throw th;
            } finally {
                start.finish();
                if (activateSpan != null) {
                    activateSpan.close();
                }
            }
        }
    }
}
