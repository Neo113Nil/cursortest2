package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Md extends com.inmobi.media.AbstractC2765t2 {
    public final com.inmobi.media.Od h;
    public final kotlin.Lazy i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Md(kotlinx.coroutines.CoroutineScope coroutineScope, com.inmobi.media.O5 displayMRC50Model, kotlinx.coroutines.flow.MutableStateFlow windowObserver) {
        super(coroutineScope, r0, r3, windowObserver);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayMRC50Model, "displayMRC50Model");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowObserver, "windowObserver");
        com.inmobi.media.Ln ln = displayMRC50Model.f4869a;
        com.inmobi.media.On on = displayMRC50Model.b;
        this.h = new com.inmobi.media.Od(new com.inmobi.media.C2285ao(on.b, on.c), this.g.c);
        this.i = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Md$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Md.a(com.inmobi.media.Md.this);
            }
        });
    }

    public static final com.inmobi.media.Sn a(com.inmobi.media.Md md) {
        com.inmobi.media.Od viewabilityTrackerView = md.h;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewabilityTrackerView, "viewabilityTrackerView");
        return new com.inmobi.media.Sn(new com.inmobi.media.Fg(md.f5457a, new com.inmobi.media.Hg(md.b.f4883a), viewabilityTrackerView), new com.inmobi.media.Un(md.f5457a, md.b.d));
    }

    @Override // com.inmobi.media.AbstractC2765t2
    public final com.inmobi.media.Sn c() {
        return (com.inmobi.media.Sn) this.i.getValue();
    }
}
