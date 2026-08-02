package B90;

import android.os.Bundle;
import androidx.preference.Preference;
import io.reactivex.InterfaceC7095c;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.ui.configurators.monetization.RefreshByFragmentResultPageConfigurator;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.bottomsheet.ComparisonBottomSheetViewModel;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnErrorPlayerControllerListener;
import ru.ozon.app.android.videomolecule.presentation.viewholder.VideoMoleculeViewHolder;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;

/* renamed from: B90.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2607i implements Preference.d, OnErrorPlayerControllerListener, androidx.fragment.app.M, io.reactivex.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3158b;

    public /* synthetic */ C2607i(Object obj, int i11) {
        this.f3157a = i11;
        this.f3158b = obj;
    }

    @Override // io.reactivex.e
    public void a(InterfaceC7095c interfaceC7095c) {
        ComparisonBottomSheetViewModel.submitSelectedCharacteristics$lambda$5((ComparisonBottomSheetViewModel) this.f3158b, interfaceC7095c);
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.R((FintechPreferencesFragment) this.f3158b);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.t] */
    @Override // androidx.fragment.app.M
    public void f(Bundle bundle, String str) {
        switch (this.f3157a) {
            case 2:
                ((AbstractC7737t) this.f3158b).invoke(str, bundle);
                break;
            default:
                RefreshByFragmentResultPageConfigurator.fragmentResultListener$lambda$0((RefreshByFragmentResultPageConfigurator) this.f3158b, str, bundle);
                break;
        }
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnErrorPlayerControllerListener
    public void onError(String str, Exception exc, Boolean bool) {
        VideoMoleculeViewHolder.playerListener$lambda$11$lambda$6((VideoMoleculeViewHolder) this.f3158b, str, exc, bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C2607i(Function2 function2) {
        this.f3157a = 2;
        this.f3158b = (AbstractC7737t) function2;
    }
}
