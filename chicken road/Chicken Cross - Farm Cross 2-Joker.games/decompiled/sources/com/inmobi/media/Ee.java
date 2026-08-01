package com.inmobi.media;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes6.dex */
public final class Ee extends P2 {
    public final Ge h;
    public final Lazy i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Ee(CoroutineScope coroutineScope, C3870l6 displayMRC50Model, MutableStateFlow windowObserver) {
        super(coroutineScope, r0, r3, windowObserver);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(displayMRC50Model, "displayMRC50Model");
        Intrinsics.checkNotNullParameter(windowObserver, "windowObserver");
        Ip ip = displayMRC50Model.f7217a;
        Lp lp = displayMRC50Model.b;
        this.h = new Ge(new Xp(lp.b, lp.c), this.g.c);
        this.i = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.Ee$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Ee.a(Ee.this);
            }
        });
    }

    public static final Pp a(Ee ee) {
        Ge viewabilityTrackerView = ee.h;
        Intrinsics.checkNotNullParameter(viewabilityTrackerView, "viewabilityTrackerView");
        return new Pp(new Oh(ee.f6773a, new Qh(ee.b.f6703a), viewabilityTrackerView), new Rp(ee.f6773a, ee.b.d));
    }

    @Override // com.inmobi.media.P2
    public final Pp c() {
        return (Pp) this.i.getValue();
    }
}
