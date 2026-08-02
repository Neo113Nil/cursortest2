package Fr;

import Ih.b;
import io.sentry.C7175n1;
import io.sentry.C7209u1;
import io.sentry.U;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.composer.di.modules.RetainComposerPerformanceAnalyticsModule;
import ru.ozon.app.android.network.abtool.FeatureChecker;

/* loaded from: classes6.dex */
public final /* synthetic */ class f implements b.a.InterfaceC0251b, qc.g, C7209u1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f9554a;

    public /* synthetic */ f(Object obj) {
        this.f9554a = obj;
    }

    @Override // io.sentry.C7209u1.a
    public void a(C7175n1 c7175n1) {
        ((U) this.f9554a).C(new C7175n1());
    }

    @Override // qc.g
    public void accept(Object obj) {
        ((Function1) this.f9554a).invoke(obj);
    }

    @Override // Ih.b.a.InterfaceC0251b
    public Boolean getValue() {
        boolean providePagePerformanceTracker$lambda$2;
        providePagePerformanceTracker$lambda$2 = RetainComposerPerformanceAnalyticsModule.Companion.providePagePerformanceTracker$lambda$2((FeatureChecker) this.f9554a);
        return Boolean.valueOf(providePagePerformanceTracker$lambda$2);
    }
}
