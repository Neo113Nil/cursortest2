package com.inmobi.media;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;

/* loaded from: classes6.dex */
public abstract class Sc {

    /* renamed from: a, reason: collision with root package name */
    public static final CoroutineScope f6848a;
    public static final Semaphore b;
    public static final AtomicBoolean c;

    static {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC3932na("LogSingle", true));
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        f6848a = CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(newSingleThreadExecutor));
        b = new Semaphore(1);
        c = new AtomicBoolean(false);
    }
}
