package bF;

import hi.InterfaceC6958a;
import k20.InterfaceC7469a;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.di.WholeSaleModalComponent;
import ru.ozon.app.android.travel.feature.railway.widgets.travelNavTrain.di.TravelNavTrainComponent;

/* renamed from: bF.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class C5600a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55759a;

    public /* synthetic */ C5600a(int i11) {
        this.f55759a = i11;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        WholeSaleModalComponent instance$lambda$0;
        TravelNavTrainComponent create$lambda$0;
        switch (this.f55759a) {
            case 0:
                instance$lambda$0 = WholeSaleModalComponent.Companion.getInstance$lambda$0();
                return instance$lambda$0;
            default:
                create$lambda$0 = TravelNavTrainComponent.Companion.create$lambda$0();
                return create$lambda$0;
        }
    }
}
