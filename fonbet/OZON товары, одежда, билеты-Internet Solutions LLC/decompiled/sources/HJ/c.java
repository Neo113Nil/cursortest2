package HJ;

import hi.InterfaceC6958a;
import k20.InterfaceC7469a;
import ru.ozon.app.android.fresh.checkout.widgets.stickyOzonBankPromo.di.StickyOzonBankPromoComponent;
import ru.ozon.app.android.session.sessionList.di.DaggerSessionListAnnotationComponent;
import ru.ozon.app.android.session.sessionList.di.SessionListAnnotationComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class c implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10735a;

    public /* synthetic */ c(int i11) {
        this.f10735a = i11;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        SessionListAnnotationComponent create;
        StickyOzonBankPromoComponent create$lambda$0;
        switch (this.f10735a) {
            case 0:
                create = DaggerSessionListAnnotationComponent.create();
                return create;
            default:
                create$lambda$0 = StickyOzonBankPromoComponent.Companion.create$lambda$0();
                return create$lambda$0;
        }
    }
}
