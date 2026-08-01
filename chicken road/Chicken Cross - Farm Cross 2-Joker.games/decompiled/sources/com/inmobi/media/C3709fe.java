package com.inmobi.media;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* renamed from: com.inmobi.media.fe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3709fe extends P2 {
    public final C3737ge h;
    public final Lazy i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3709fe(CoroutineScope coroutineScope, Ip viewabilityModel, Lp viewabilityCriteria, MutableStateFlow windowObserver) {
        super(coroutineScope, viewabilityModel, viewabilityCriteria, windowObserver);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(viewabilityModel, "viewabilityModel");
        Intrinsics.checkNotNullParameter(viewabilityCriteria, "viewabilityCriteria");
        Intrinsics.checkNotNullParameter(windowObserver, "windowObserver");
        this.h = new C3737ge(new Xp(viewabilityCriteria.b, viewabilityCriteria.c), this.g.c);
        this.i = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.fe$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3709fe.a(C3709fe.this);
            }
        });
    }

    public static final Pp a(C3709fe c3709fe) {
        C3737ge viewabilityTrackerView = c3709fe.h;
        Intrinsics.checkNotNullParameter(viewabilityTrackerView, "viewabilityTrackerView");
        return new Pp(new Oh(c3709fe.f6773a, new Qh(c3709fe.b.f6703a), viewabilityTrackerView), new Rp(c3709fe.f6773a, c3709fe.b.d));
    }

    @Override // com.inmobi.media.P2
    public final Pp c() {
        return (Pp) this.i.getValue();
    }
}
