package com.moloco.sdk.internal.ortb;

import com.moloco.sdk.internal.q;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Lazy f10515a = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.ortb.d$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return d.b();
        }
    });

    public static final b a() {
        return c();
    }

    public static final c b() {
        return new c(q.b());
    }

    public static final b c() {
        return (b) f10515a.getValue();
    }
}
