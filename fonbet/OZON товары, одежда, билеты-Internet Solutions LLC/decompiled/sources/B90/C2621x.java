package B90;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.C5353y0;
import androidx.preference.Preference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nl0.InterfaceC8605e;
import ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation.viewmodel.LargeOrdersLiftingV2ViewModel;
import ru.ozon.app.android.travel.feature.general.common.shared.filtersButton.TravelFiltersKeyboardInsetConfigurator;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerWidgetVH;
import ru.ozon.app.android.update.rustore.RuStoreInAppUpdateRepository;
import ru.ozon.fintech.preferences.presentation.develop.FintechPreferencesFragment;
import ru.rustore.sdk.activitylauncher.a;
import ru.rustore.sdk.review.errors.RuStoreReviewStartException;
import w.C10368u;
import yl0.InterfaceC10919d;
import z.InterfaceC10945c;

/* renamed from: B90.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2621x implements Preference.d, androidx.fragment.app.M, androidx.core.view.D, InterfaceC8605e, InterfaceC10919d, InterfaceC10945c, qc.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3234a;

    public /* synthetic */ C2621x(Object obj) {
        this.f3234a = obj;
    }

    @Override // qc.g
    public void accept(Object obj) {
        LargeOrdersLiftingV2ViewModel.onErrorConsumer$lambda$0((LargeOrdersLiftingV2ViewModel) this.f3234a, (Throwable) obj);
    }

    @Override // nl0.InterfaceC8605e
    public void c(ru.rustore.sdk.activitylauncher.a launcherResult) {
        lm0.e emitter = (lm0.e) this.f3234a;
        Intrinsics.checkNotNullParameter(emitter, "$emitter");
        Intrinsics.checkNotNullParameter(launcherResult, "launcherResult");
        if (launcherResult instanceof a.d ? true : launcherResult.equals(a.e.f97952b) ? true : launcherResult.equals(a.f.f97953b) ? true : launcherResult.equals(a.C2157a.f97948b)) {
            emitter.a(new RuStoreReviewStartException());
            return;
        }
        if (launcherResult.equals(a.b.f97949b) ? true : launcherResult.equals(a.c.f97950b)) {
            emitter.b(Unit.f71690a);
        }
    }

    @Override // androidx.preference.Preference.d
    public boolean d(Preference preference) {
        FintechPreferencesFragment.Y((FintechPreferencesFragment) this.f3234a);
        return true;
    }

    @Override // androidx.fragment.app.M
    public void f(Bundle bundle, String str) {
        MediaPickerWidgetVH.setupOpenGalleryListener$lambda$30((MediaPickerWidgetVH) this.f3234a, str, bundle);
    }

    @Override // z.InterfaceC10945c
    public Object get() {
        return ((C10368u) this.f3234a).a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
    }

    @Override // androidx.core.view.D
    public C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        C5353y0 insetsListener$lambda$3;
        insetsListener$lambda$3 = TravelFiltersKeyboardInsetConfigurator.insetsListener$lambda$3((TravelFiltersKeyboardInsetConfigurator) this.f3234a, view, c5353y0);
        return insetsListener$lambda$3;
    }

    @Override // yl0.InterfaceC10919d
    public void onFailure(Throwable th2) {
        RuStoreInAppUpdateRepository.startUpdate$lambda$1((RuStoreInAppUpdateRepository) this.f3234a, th2);
    }
}
