package com.inmobi.media;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class K4 {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f6663a;
    public final Lazy b;

    public K4(CoroutineScope configScope) {
        Intrinsics.checkNotNullParameter(configScope, "configScope");
        this.f6663a = configScope;
        this.b = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.K4$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return K4.a();
            }
        });
    }

    public static final B4 a() {
        return new B4(T9.b());
    }
}
