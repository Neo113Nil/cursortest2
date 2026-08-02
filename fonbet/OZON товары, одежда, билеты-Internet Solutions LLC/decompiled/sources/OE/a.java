package OE;

import hi.InterfaceC6958a;
import k20.InterfaceC7469a;
import ru.ozon.app.android.pdp.widgets.sellerSimple.di.SellerSimpleComponent;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.di.MorkovskTabbarComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20131a;

    public /* synthetic */ a(int i11) {
        this.f20131a = i11;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        SellerSimpleComponent createComponent$lambda$0;
        MorkovskTabbarComponent create$lambda$0;
        switch (this.f20131a) {
            case 0:
                createComponent$lambda$0 = SellerSimpleComponent.Companion.createComponent$lambda$0();
                return createComponent$lambda$0;
            default:
                create$lambda$0 = MorkovskTabbarComponent.Companion.create$lambda$0();
                return create$lambda$0;
        }
    }
}
