package com.chartboost.sdk.impl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class p7 implements o7 {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f4956a = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.p7$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return p7.d();
        }
    });
    public final Lazy b = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.p7$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return p7.c();
        }
    });

    public static final ScheduledExecutorService c() {
        return n2.a(0, null, 3, null);
    }

    public static final ExecutorService d() {
        return n2.a(4, 0L, null, 6, null);
    }

    @Override // com.chartboost.sdk.impl.o7
    public ExecutorService a() {
        return (ExecutorService) this.f4956a.getValue();
    }

    @Override // com.chartboost.sdk.impl.o7
    public ScheduledExecutorService b() {
        return (ScheduledExecutorService) this.b.getValue();
    }
}
