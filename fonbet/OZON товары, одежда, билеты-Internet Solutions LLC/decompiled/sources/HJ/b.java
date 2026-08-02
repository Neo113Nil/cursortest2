package HJ;

import hi.InterfaceC6958a;
import k20.InterfaceC7469a;
import ru.ozon.app.android.session.sessionList.di.CurrentSessionComponent;
import ru.ozon.app.android.session.sessionList.di.DaggerCurrentSessionComponent;
import ru.ozon.app.android.travel.feature.general.services.widgets.supportBenefitsBanner.di.SupportBenefitsBannerComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class b implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10734a;

    public /* synthetic */ b(int i11) {
        this.f10734a = i11;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        CurrentSessionComponent create;
        SupportBenefitsBannerComponent create$lambda$0;
        switch (this.f10734a) {
            case 0:
                create = DaggerCurrentSessionComponent.create();
                return create;
            default:
                create$lambda$0 = SupportBenefitsBannerComponent.Companion.create$lambda$0();
                return create$lambda$0;
        }
    }
}
