package XG;

import hi.InterfaceC6958a;
import ru.ozon.app.android.bank.widgets.adBanner.di.AdBannerComponent$Companion$create$1$1;
import ru.ozon.app.android.bank.widgets.adBanner.presentation.AdBannerViewModel;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.di.ReturnCreationPhotoPickerComponent$Companion$create$1$1;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.buttons.viewModel.ButtonsViewModel;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements Pc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC6958a f34192b;

    public /* synthetic */ a(InterfaceC6958a interfaceC6958a, int i11) {
        this.f34191a = i11;
        this.f34192b = interfaceC6958a;
    }

    @Override // Pc.a
    public final Object get() {
        ButtonsViewModel buttonsViewModel$lambda$1;
        AdBannerViewModel viewModelProvider$lambda$0;
        switch (this.f34191a) {
            case 0:
                buttonsViewModel$lambda$1 = ReturnCreationPhotoPickerComponent$Companion$create$1$1.buttonsViewModel$lambda$1((ReturnCreationPhotoPickerComponent$Companion$create$1$1) this.f34192b);
                return buttonsViewModel$lambda$1;
            default:
                viewModelProvider$lambda$0 = AdBannerComponent$Companion$create$1$1.viewModelProvider$lambda$0((AdBannerComponent$Companion$create$1$1) this.f34192b);
                return viewModelProvider$lambda$0;
        }
    }
}
