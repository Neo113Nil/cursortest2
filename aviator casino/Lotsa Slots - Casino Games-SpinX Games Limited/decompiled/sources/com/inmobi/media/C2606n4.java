package com.inmobi.media;

/* renamed from: com.inmobi.media.n4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2606n4 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.CoroutineScope f5349a;
    public final kotlin.Lazy b;

    public C2606n4(kotlinx.coroutines.CoroutineScope configScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configScope, "configScope");
        this.f5349a = configScope;
        this.b = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.n4$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.C2606n4.a();
            }
        });
    }

    public static final com.inmobi.media.C2370e4 a() {
        return new com.inmobi.media.C2370e4(com.inmobi.media.AbstractC2639o9.b());
    }
}
