package Fr;

import D1.InterfaceC2801g;
import Ih.b;
import S0.C3969l;
import kotlin.jvm.functions.Function0;
import m3.r;
import ru.ozon.app.android.composer.di.modules.RetainComposerPerformanceAnalyticsModule;
import u3.InterfaceC9928b;

/* loaded from: classes6.dex */
public final /* synthetic */ class g implements b.a.InterfaceC0251b, r.a {
    public static Function0 a(InterfaceC2801g.a aVar, C3969l c3969l) {
        aVar.getClass();
        Function0 a11 = InterfaceC2801g.a.a();
        c3969l.i();
        return a11;
    }

    @Override // Ih.b.a.InterfaceC0251b
    public Boolean getValue() {
        boolean providePagePerformanceTracker$lambda$3;
        providePagePerformanceTracker$lambda$3 = RetainComposerPerformanceAnalyticsModule.Companion.providePagePerformanceTracker$lambda$3();
        return Boolean.valueOf(providePagePerformanceTracker$lambda$3);
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }
}
