package Ro;

import hi.InterfaceC6958a;
import k20.InterfaceC7469a;
import ru.ozon.app.android.checkoutcomposer.stickyBadgeInfo.di.StickyBadgeInfoComponent;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainSeatInfo.v2.di.TravelTrainSeatInfoV2Component;

/* renamed from: Ro.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C3938a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25174a;

    public /* synthetic */ C3938a(int i11) {
        this.f25174a = i11;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        StickyBadgeInfoComponent create$lambda$0;
        TravelTrainSeatInfoV2Component create$lambda$02;
        switch (this.f25174a) {
            case 0:
                create$lambda$0 = StickyBadgeInfoComponent.Companion.create$lambda$0();
                return create$lambda$0;
            default:
                create$lambda$02 = TravelTrainSeatInfoV2Component.Companion.create$lambda$0();
                return create$lambda$02;
        }
    }
}
