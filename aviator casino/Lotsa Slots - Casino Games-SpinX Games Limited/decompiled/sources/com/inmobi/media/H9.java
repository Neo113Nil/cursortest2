package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class H9 {

    /* renamed from: a, reason: collision with root package name */
    public static final okhttp3.Dispatcher f4742a;
    public static final okhttp3.Dispatcher b;
    public static final kotlinx.coroutines.CoroutineScope c;
    public static final kotlinx.coroutines.CoroutineScope d;
    public static final kotlinx.coroutines.CoroutineScope e;
    public static final kotlinx.coroutines.CoroutineScope f;

    static {
        java.lang.Object value = com.inmobi.media.AbstractC2740s6.b.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        f4742a = new okhttp3.Dispatcher((java.util.concurrent.ExecutorService) value);
        java.lang.Object value2 = com.inmobi.media.AbstractC2740s6.f5441a.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        b = new okhttp3.Dispatcher((java.util.concurrent.ExecutorService) value2);
        java.lang.Object value3 = com.inmobi.media.AbstractC2740s6.c.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        c = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.ExecutorsKt.from((java.util.concurrent.ExecutorService) value3).plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
        java.lang.Object value4 = com.inmobi.media.AbstractC2740s6.d.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        d = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.ExecutorsKt.from((java.util.concurrent.ExecutorService) value4).plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
        java.lang.Object value5 = com.inmobi.media.AbstractC2740s6.f.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        e = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.ExecutorsKt.from((java.util.concurrent.ExecutorService) value5).plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
        f = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.ExecutorsKt.from((com.inmobi.media.ExecutorC2378ec) com.inmobi.media.AbstractC2740s6.e.getValue()).plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
    }
}
