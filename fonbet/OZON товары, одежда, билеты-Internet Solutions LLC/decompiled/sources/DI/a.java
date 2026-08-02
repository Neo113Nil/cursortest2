package DI;

import hi.InterfaceC6958a;
import k20.InterfaceC7469a;
import ru.ozon.app.android.search.widgets.insight.di.InsightWidgetComponent;
import ru.ozon.app.android.travel.feature.railway.widgets.travelCarriageDetails.di.TravelCarriageDetailsComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6230a;

    public /* synthetic */ a(int i11) {
        this.f6230a = i11;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        InsightWidgetComponent create$lambda$0;
        TravelCarriageDetailsComponent create$lambda$02;
        switch (this.f6230a) {
            case 0:
                create$lambda$0 = InsightWidgetComponent.Companion.create$lambda$0();
                return create$lambda$0;
            default:
                create$lambda$02 = TravelCarriageDetailsComponent.Companion.create$lambda$0();
                return create$lambda$02;
        }
    }
}
