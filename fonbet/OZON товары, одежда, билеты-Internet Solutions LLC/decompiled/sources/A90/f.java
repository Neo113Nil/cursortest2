package A90;

import kotlin.jvm.functions.Function1;
import ru.ozon.fintech.features.offline.presentation.select.OfflineSelectFragment;
import ru.ozon.fintech.ui.input.InfoAction;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f578a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f579b;

    public /* synthetic */ f(Object obj, int i11) {
        this.f578a = i11;
        this.f579b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f578a) {
            case 0:
                return ru.ozon.fintech.preferences.presentation.cbdc.a.g0((ru.ozon.fintech.preferences.presentation.cbdc.a) this.f579b);
            default:
                return OfflineSelectFragment.u((OfflineSelectFragment) this.f579b, (InfoAction) obj);
        }
    }
}
