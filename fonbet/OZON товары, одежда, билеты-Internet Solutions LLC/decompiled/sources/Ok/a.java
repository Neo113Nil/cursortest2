package Ok;

import hi.InterfaceC6958a;
import k20.InterfaceC7469a;
import ru.ozon.app.android.account.orders.emptyscreen.fintech.di.OfflineFintechBannerComponent;
import ru.ozon.app.android.fresh.unsorted.widgets.homeButton.di.HomeButtonComponent;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20456a;

    public /* synthetic */ a(int i11) {
        this.f20456a = i11;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        OfflineFintechBannerComponent create$lambda$0;
        HomeButtonComponent create$lambda$02;
        switch (this.f20456a) {
            case 0:
                create$lambda$0 = OfflineFintechBannerComponent.Companion.create$lambda$0();
                return create$lambda$0;
            default:
                create$lambda$02 = HomeButtonComponent.Companion.create$lambda$0();
                return create$lambda$02;
        }
    }
}
