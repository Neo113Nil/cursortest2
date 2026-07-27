package com.inmobi.media;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class P6 {

    /* renamed from: a, reason: collision with root package name */
    public static final Lazy f6777a = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.P6$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return P6.a();
        }
    });
    public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.P6$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return P6.c();
        }
    });
    public static final Lazy c = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.P6$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return P6.e();
        }
    });
    public static final Lazy d = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.P6$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return P6.b();
        }
    });
    public static final Lazy e = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.P6$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return P6.d();
        }
    });
    public static final Lazy f = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.P6$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return P6.f();
        }
    });

    public static final ExecutorService a() {
        Intrinsics.checkNotNullParameter("ExecutorProvider.IO", "name");
        return Executors.newCachedThreadPool(new ThreadFactoryC3932na("ExecutorProvider.IO", false));
    }

    public static final ExecutorService b() {
        Intrinsics.checkNotNullParameter("ExecutorProvider.high", "name");
        return Executors.newCachedThreadPool(new ThreadFactoryC3932na("ExecutorProvider.high", false));
    }

    public static final ExecutorService c() {
        Intrinsics.checkNotNullParameter("ExecutorProvider.highIO", "name");
        return Executors.newCachedThreadPool(new ThreadFactoryC3932na("ExecutorProvider.highIO", false));
    }

    public static final Wc d() {
        return new Wc();
    }

    public static final ExecutorService e() {
        Intrinsics.checkNotNullParameter("ExecutorProvider.normal", "name");
        return Executors.newCachedThreadPool(new ThreadFactoryC3932na("ExecutorProvider.normal", false));
    }

    public static final ExecutorService f() {
        Intrinsics.checkNotNullParameter("ExecutorProvider.single", "name");
        return Executors.newSingleThreadExecutor(new ThreadFactoryC3932na("ExecutorProvider.single", false));
    }
}
