package B90;

import ru.ozon.app.android.fresh.unsorted.widgets.flexButtons.presentation.FlexButtonsView;
import ru.ozon.app.android.map.databinding.FragmentSearchSheetBinding;
import ru.ozon.app.android.pdpvideomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegate;
import ru.ozon.app.android.storefront.widgets.navbarv2.presentation.ShellNavBarOverlayViewHolder;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetView;
import ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3194a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3195b;

    public /* synthetic */ t0(Object obj, int i11) {
        this.f3194a = i11;
        this.f3195b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3194a) {
            case 0:
                v0.r0((v0) this.f3195b);
                break;
            case 1:
                YandexSearchSheetView.updateUi$lambda$7$lambda$6((FragmentSearchSheetBinding) this.f3195b);
                break;
            case 2:
                SharingPreviewFragment.onViewCreated$lambda$34((SharingPreviewFragment) this.f3195b);
                break;
            case 3:
                ShellNavBarOverlayViewHolder.observeSystemInsets$lambda$24$lambda$23((ShellNavBarOverlayViewHolder) this.f3195b);
                break;
            case 4:
                ((FlexButtonsView) this.f3195b).recalculateUnevenWeights();
                break;
            case 5:
                ((ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view.b) this.f3195b).h(ru.ozon.android.messenger.framework.presentation.common.view.flashbar.view.a.TIMEOUT);
                break;
            default:
                VideoMoleculeVisibilityDelegate.hideCallback$lambda$3((VideoMoleculeVisibilityDelegate) this.f3195b);
                break;
        }
    }
}
