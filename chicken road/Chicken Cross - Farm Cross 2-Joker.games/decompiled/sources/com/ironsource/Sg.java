package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class Sg {
    public static final a c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final C4577p0 f7899a;
    private final Uc b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Sg a(T0 adTools, AbstractC4720x0 adUnitData, Uc outcomeReporter, Mg waterfallInstances, H adInstanceLoadStrategy) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
            Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
            Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            Intrinsics.checkNotNullParameter(adInstanceLoadStrategy, "adInstanceLoadStrategy");
            return adUnitData.q() ? new C4717wf(adTools, outcomeReporter, waterfallInstances, adInstanceLoadStrategy) : new G4(adTools, outcomeReporter, waterfallInstances);
        }

        private a() {
        }
    }

    public Sg(C4577p0 adTools, Uc outcomeReporter) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(outcomeReporter, "outcomeReporter");
        this.f7899a = adTools;
        this.b = outcomeReporter;
    }

    private final void b(B b, List<? extends B> list) {
        for (B b2 : list) {
            if (b2 == b) {
                b.a(true);
                return;
            }
            b2.a(false);
            IronLog.INTERNAL.verbose(C4577p0.a(this.f7899a, b2.q() + " - not ready to show", (String) null, 2, (Object) null));
        }
    }

    public abstract void a();

    public abstract void a(B b);

    public final void a(B instanceToShow, List<? extends B> orderedInstances) {
        Intrinsics.checkNotNullParameter(instanceToShow, "instanceToShow");
        Intrinsics.checkNotNullParameter(orderedInstances, "orderedInstances");
        b(instanceToShow, orderedInstances);
        c(instanceToShow);
    }

    public abstract void b(B b);

    public abstract void c(B b);

    public final void a(B instance, String str, C4515la publisherDataHolder) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.b.a(instance, str, publisherDataHolder);
    }
}
