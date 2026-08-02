package B90;

import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import ru.ozon.app.android.fresh.unsorted.widgets.installmentPaymentSchedule.presentation.FreshPaymentsAnimator;
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.view.DirectFlightsDropdownItemView;
import ru.ozon.app.android.videomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegate;
import v.E1;

/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3166b;

    public /* synthetic */ k0(Object obj, int i11) {
        this.f3165a = i11;
        this.f3166b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3165a) {
            case 0:
                v0.s0((v0) this.f3166b);
                break;
            case 1:
                ((Function0) this.f3166b).invoke();
                break;
            case 2:
                VideoMoleculeVisibilityDelegate.showCallback$lambda$1((VideoMoleculeVisibilityDelegate) this.f3166b);
                break;
            case 3:
                DirectFlightsDropdownItemView.bind$lambda$15((DirectFlightsDropdownItemView) this.f3166b);
                break;
            case 4:
                O.k.e((O.k) this.f3166b);
                break;
            case 5:
                ((Y80.b) this.f3166b).run();
                break;
            case 6:
                for (E1 e12 : (LinkedHashSet) this.f3166b) {
                    e12.b().j(e12);
                }
                break;
            default:
                FreshPaymentsAnimator.moveList$lambda$1((FreshPaymentsAnimator) this.f3166b);
                break;
        }
    }
}
