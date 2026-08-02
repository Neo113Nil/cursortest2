package Al0;

import Bl0.G;
import Bl0.I;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lm0.AbstractC7971a;
import lm0.i;
import lm0.t;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final I f1242a;

    public a(I metricsClientController) {
        Intrinsics.checkNotNullParameter(metricsClientController, "metricsClientController");
        this.f1242a = metricsClientController;
    }

    public final AbstractC7971a<Unit> a(b metricsEvent) {
        Intrinsics.checkNotNullParameter(metricsEvent, "metricsEvent");
        I i11 = this.f1242a;
        Intrinsics.checkNotNullParameter(metricsEvent, "metricsEvent");
        G source = new G(i11, metricsEvent);
        Intrinsics.checkNotNullParameter(source, "source");
        return t.a(new i(source), i11.f3924d);
    }
}
