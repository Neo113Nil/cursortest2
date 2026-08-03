package com.ironsource;

/* loaded from: classes5.dex */
public abstract class Pg {
    public static final com.ironsource.Pg.a c = new com.ironsource.Pg.a(null);

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3212p0 f5927a;
    private final com.ironsource.Uc b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.ironsource.Pg a(com.ironsource.V0 adTools, com.ironsource.AbstractC3355x0 adUnitData, com.ironsource.Uc outcomeReporter, com.ironsource.Jg waterfallInstances, com.ironsource.H adInstanceLoadStrategy) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstanceLoadStrategy, "adInstanceLoadStrategy");
            return adUnitData.q() ? new com.ironsource.C3388yf(adTools, outcomeReporter, waterfallInstances, adInstanceLoadStrategy) : new com.ironsource.J4(adTools, outcomeReporter, waterfallInstances);
        }

        private a() {
        }
    }

    public Pg(com.ironsource.C3212p0 adTools, com.ironsource.Uc outcomeReporter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        this.f5927a = adTools;
        this.b = outcomeReporter;
    }

    private final void b(com.ironsource.B b, java.util.List<? extends com.ironsource.B> list) {
        for (com.ironsource.B b2 : list) {
            if (b2 == b) {
                b.a(true);
                return;
            }
            b2.a(false);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(this.f5927a, b2.q() + " - not ready to show", (java.lang.String) null, 2, (java.lang.Object) null));
        }
    }

    public abstract void a();

    public abstract void a(com.ironsource.B b);

    public final void a(com.ironsource.B instanceToShow, java.util.List<? extends com.ironsource.B> orderedInstances) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceToShow, "instanceToShow");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orderedInstances, "orderedInstances");
        b(instanceToShow, orderedInstances);
        c(instanceToShow);
    }

    public abstract void b(com.ironsource.B b);

    public abstract void c(com.ironsource.B b);

    public final void a(com.ironsource.B instance, java.lang.String str, com.ironsource.C3150la publisherDataHolder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.b.a(instance, str, publisherDataHolder);
    }
}
