package com.inmobi.media;

import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import okhttp3.Dispatcher;

/* renamed from: com.inmobi.media.ma, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3904ma {

    /* renamed from: a, reason: collision with root package name */
    public static final Dispatcher f7244a;
    public static final Dispatcher b;
    public static final ExecutorCoroutineDispatcher c;
    public static final CoroutineScope d;
    public static final CoroutineScope e;
    public static final CoroutineScope f;
    public static final CoroutineScope g;

    static {
        Object value = P6.b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        f7244a = new Dispatcher((ExecutorService) value);
        Object value2 = P6.f6777a.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        b = new Dispatcher((ExecutorService) value2);
        Lazy lazy = P6.f;
        Object value3 = lazy.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        c = ExecutorsKt.from((ExecutorService) value3);
        Object value4 = P6.c.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        d = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from((ExecutorService) value4).plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        Object value5 = P6.d.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        e = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from((ExecutorService) value5).plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        Object value6 = lazy.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        f = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from((ExecutorService) value6).plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        g = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from((Wc) P6.e.getValue()).plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
    }
}
