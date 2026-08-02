package B90;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.C5353y0;
import androidx.preference.Preference;
import ru.ozon.app.android.favorites.configurators.CreateShoppingListInputInsetsConfigurator;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.relatedProductsBottomSheet.RelatedProductsBottomSheetView;
import ru.ozon.app.android.pdpvideomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnVideoSizeChangedPlayerControllerListener;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class C implements Preference.d, androidx.core.view.D, OnVideoSizeChangedPlayerControllerListener, androidx.fragment.app.M {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3099a;

    public /* synthetic */ C(Object obj) {
        this.f3099a = obj;
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.O((FintechPreferencesFragment) this.f3099a);
        return true;
    }

    @Override // androidx.fragment.app.M
    public void f(Bundle bundle, String str) {
        RelatedProductsBottomSheetView.setupFragmentResultListener$lambda$22((RelatedProductsBottomSheetView) this.f3099a, str, bundle);
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 insetsListener$lambda$1;
        insetsListener$lambda$1 = CreateShoppingListInputInsetsConfigurator.insetsListener$lambda$1((CreateShoppingListInputInsetsConfigurator) this.f3099a, view, c5353y0);
        return insetsListener$lambda$1;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnVideoSizeChangedPlayerControllerListener
    public void onVideoSizeChanged(j3.Q q11) {
        VideoMoleculeViewHolder.playerListener$lambda$12$lambda$0((VideoMoleculeViewHolder) this.f3099a, q11);
    }
}
