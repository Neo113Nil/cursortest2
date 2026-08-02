package F90;

import android.widget.CompoundButton;
import androidx.fragment.app.ComponentCallbacksC5392m;
import ru.ozon.app.android.abtool.presentation.features.FeaturesFragment;
import ru.ozon.fintech.preferences.presentation.scanner.FintechScannerSettingsFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9154a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentCallbacksC5392m f9155b;

    public /* synthetic */ a(ComponentCallbacksC5392m componentCallbacksC5392m, int i11) {
        this.f9154a = i11;
        this.f9155b = componentCallbacksC5392m;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
        switch (this.f9154a) {
            case 0:
                FintechScannerSettingsFragment.t((FintechScannerSettingsFragment) this.f9155b, z11);
                break;
            default:
                FeaturesFragment.onViewCreated$lambda$1((FeaturesFragment) this.f9155b, compoundButton, z11);
                break;
        }
    }
}
