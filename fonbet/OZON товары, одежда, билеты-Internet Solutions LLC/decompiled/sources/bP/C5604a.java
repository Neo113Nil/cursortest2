package bP;

import hi.InterfaceC6958a;
import k20.InterfaceC7469a;
import ru.ozon.app.android.travel.feature.general.common.widgets.overlayButtons.v1.di.OverlayButtonsComponent;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelOrderListMobile.di.TravelOrderListTimerComponent;

/* renamed from: bP.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class C5604a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55765a;

    public /* synthetic */ C5604a(int i11) {
        this.f55765a = i11;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        OverlayButtonsComponent create$lambda$0;
        TravelOrderListTimerComponent create$lambda$02;
        switch (this.f55765a) {
            case 0:
                create$lambda$0 = OverlayButtonsComponent.Companion.create$lambda$0();
                return create$lambda$0;
            default:
                create$lambda$02 = TravelOrderListTimerComponent.Companion.create$lambda$0();
                return create$lambda$02;
        }
    }
}
