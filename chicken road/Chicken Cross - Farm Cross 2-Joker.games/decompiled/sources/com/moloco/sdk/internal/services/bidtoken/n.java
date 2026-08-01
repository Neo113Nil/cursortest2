package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.internal.MolocoLogger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final Lazy f10751a = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.internal.services.bidtoken.n$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return n.b();
        }
    });

    public static final l a() {
        return c();
    }

    public static final m b() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "BidTokenService", "Creating BidTokenService instance", null, false, 12, null);
        return new m(y.f10776a.a(), q.f10767a.a());
    }

    public static final m c() {
        return (m) f10751a.getValue();
    }
}
