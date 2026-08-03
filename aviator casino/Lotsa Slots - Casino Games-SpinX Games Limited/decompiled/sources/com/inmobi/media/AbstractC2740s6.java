package com.inmobi.media;

/* renamed from: com.inmobi.media.s6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2740s6 {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.Lazy f5441a = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.s6$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.inmobi.media.AbstractC2740s6.a();
        }
    });
    public static final kotlin.Lazy b = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.s6$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.inmobi.media.AbstractC2740s6.c();
        }
    });
    public static final kotlin.Lazy c = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.s6$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.inmobi.media.AbstractC2740s6.e();
        }
    });
    public static final kotlin.Lazy d = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.s6$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.inmobi.media.AbstractC2740s6.b();
        }
    });
    public static final kotlin.Lazy e = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.s6$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.inmobi.media.AbstractC2740s6.d();
        }
    });
    public static final kotlin.Lazy f = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.s6$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.inmobi.media.AbstractC2740s6.f();
        }
    });

    public static final java.util.concurrent.ExecutorService a() {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("ExecutorProvider.IO", "name");
        return java.util.concurrent.Executors.newCachedThreadPool(new com.inmobi.media.I9("ExecutorProvider.IO", false));
    }

    public static final java.util.concurrent.ExecutorService b() {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("ExecutorProvider.high", "name");
        return java.util.concurrent.Executors.newCachedThreadPool(new com.inmobi.media.I9("ExecutorProvider.high", false));
    }

    public static final java.util.concurrent.ExecutorService c() {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("ExecutorProvider.highIO", "name");
        return java.util.concurrent.Executors.newCachedThreadPool(new com.inmobi.media.I9("ExecutorProvider.highIO", false));
    }

    public static final com.inmobi.media.ExecutorC2378ec d() {
        return new com.inmobi.media.ExecutorC2378ec();
    }

    public static final java.util.concurrent.ExecutorService e() {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("ExecutorProvider.normal", "name");
        return java.util.concurrent.Executors.newCachedThreadPool(new com.inmobi.media.I9("ExecutorProvider.normal", false));
    }

    public static final java.util.concurrent.ExecutorService f() {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("ExecutorProvider.single", "name");
        return java.util.concurrent.Executors.newSingleThreadExecutor(new com.inmobi.media.I9("ExecutorProvider.single", false));
    }
}
