package LP;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.di.SimpleInfoComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.simpleInfo.presentation.body.SimpleInfoBodyViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v3.di.TravelPaymentV3WidgetComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.travelPayment.v4.di.TravelPaymentV4Component;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.widgets.mediaList.SingleReviewMediaListComponent;
import ru.ozon.app.android.ugc.widgets.profileInputs.di.ProfileInputsComponent;
import ru.ozon.app.android.ugc.widgets.titleSubtitleV2.di.TitleSubtitleV2Component;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C7475g f16643b;

    public /* synthetic */ a(C7475g c7475g, int i11) {
        this.f16642a = i11;
        this.f16643b = c7475g;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        TravelPaymentV3WidgetComponent create$lambda$0;
        TravelPaymentV4Component create$lambda$02;
        TitleSubtitleV2Component instance$lambda$0;
        ProfileInputsComponent create$lambda$03;
        SimpleInfoComponent widgetComponent$lambda$0;
        SingleReviewMediaListComponent create$lambda$04;
        switch (this.f16642a) {
            case 0:
                create$lambda$0 = TravelPaymentV3WidgetComponent.Companion.create$lambda$0(this.f16643b);
                return create$lambda$0;
            case 1:
                create$lambda$02 = TravelPaymentV4Component.Companion.create$lambda$0(this.f16643b);
                return create$lambda$02;
            case 2:
                instance$lambda$0 = TitleSubtitleV2Component.Companion.getInstance$lambda$0(this.f16643b);
                return instance$lambda$0;
            case 3:
                create$lambda$03 = ProfileInputsComponent.Companion.create$lambda$0(this.f16643b);
                return create$lambda$03;
            case 4:
                widgetComponent$lambda$0 = SimpleInfoBodyViewMapper.widgetComponent$lambda$0(this.f16643b);
                return widgetComponent$lambda$0;
            default:
                create$lambda$04 = SingleReviewMediaListComponent.Companion.create$lambda$0(this.f16643b);
                return create$lambda$04;
        }
    }
}
