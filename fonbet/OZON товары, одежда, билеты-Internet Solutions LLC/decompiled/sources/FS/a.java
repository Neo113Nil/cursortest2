package FS;

import hi.InterfaceC6958a;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.di.ReturnCreationPhotoPickerComponent$Companion$create$1$1;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.viewModel.PhotosViewModel;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.di.HotelsScrollPriceCalendarV2Component;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsScrollPriceCalendar.v2.presentation.HotelsScrollPriceCalendarV2WidgetAsyncViewModel;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Pc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9200a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC6958a f9201b;

    public /* synthetic */ a(InterfaceC6958a interfaceC6958a, int i11) {
        this.f9200a = i11;
        this.f9201b = interfaceC6958a;
    }

    @Override // Pc.a
    public final Object get() {
        HotelsScrollPriceCalendarV2WidgetAsyncViewModel _get_widgetViewModelProvider_$lambda$0;
        PhotosViewModel photoViewModel$lambda$0;
        switch (this.f9200a) {
            case 0:
                _get_widgetViewModelProvider_$lambda$0 = HotelsScrollPriceCalendarV2Component._get_widgetViewModelProvider_$lambda$0((HotelsScrollPriceCalendarV2Component) this.f9201b);
                return _get_widgetViewModelProvider_$lambda$0;
            default:
                photoViewModel$lambda$0 = ReturnCreationPhotoPickerComponent$Companion$create$1$1.photoViewModel$lambda$0((ReturnCreationPhotoPickerComponent$Companion$create$1$1) this.f9201b);
                return photoViewModel$lambda$0;
        }
    }
}
