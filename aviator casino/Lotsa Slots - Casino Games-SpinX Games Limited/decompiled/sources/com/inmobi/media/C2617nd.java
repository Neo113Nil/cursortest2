package com.inmobi.media;

/* renamed from: com.inmobi.media.nd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2617nd extends com.inmobi.media.AbstractC2765t2 {
    public final com.inmobi.media.C2643od h;
    public final kotlin.Lazy i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2617nd(kotlinx.coroutines.CoroutineScope coroutineScope, com.inmobi.media.Ln viewabilityModel, com.inmobi.media.On viewabilityCriteria, kotlinx.coroutines.flow.MutableStateFlow windowObserver) {
        super(coroutineScope, viewabilityModel, viewabilityCriteria, windowObserver);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewabilityModel, "viewabilityModel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewabilityCriteria, "viewabilityCriteria");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowObserver, "windowObserver");
        this.h = new com.inmobi.media.C2643od(new com.inmobi.media.C2285ao(viewabilityCriteria.b, viewabilityCriteria.c), this.g.c);
        this.i = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.nd$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.C2617nd.a(com.inmobi.media.C2617nd.this);
            }
        });
    }

    public static final com.inmobi.media.Sn a(com.inmobi.media.C2617nd c2617nd) {
        com.inmobi.media.C2643od viewabilityTrackerView = c2617nd.h;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewabilityTrackerView, "viewabilityTrackerView");
        return new com.inmobi.media.Sn(new com.inmobi.media.Fg(c2617nd.f5457a, new com.inmobi.media.Hg(c2617nd.b.f4883a), viewabilityTrackerView), new com.inmobi.media.Un(c2617nd.f5457a, c2617nd.b.d));
    }

    @Override // com.inmobi.media.AbstractC2765t2
    public final com.inmobi.media.Sn c() {
        return (com.inmobi.media.Sn) this.i.getValue();
    }
}
