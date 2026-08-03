package com.inmobi.media;

/* renamed from: com.inmobi.media.fk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2413fk {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.Lazy f5205a = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.fk$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.inmobi.media.AbstractC2413fk.a();
        }
    });

    public static final void a(java.lang.Runnable runnable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        ((android.os.Handler) f5205a.getValue()).post(runnable);
    }

    public static final android.os.Handler a() {
        return new android.os.Handler(android.os.Looper.getMainLooper());
    }
}
