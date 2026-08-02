package QU;

import hi.InterfaceC6958a;
import k20.InterfaceC7469a;
import ru.ozon.app.android.checkoutcomposer.stickyBadgeInfoV2.di.StickyBadgeInfoV2Component;
import ru.ozon.app.android.ugc.core.widgets.listreviews.di.ListReviewsComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23130a;

    public /* synthetic */ a(int i11) {
        this.f23130a = i11;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        ListReviewsComponent instance$lambda$0;
        StickyBadgeInfoV2Component create$lambda$0;
        switch (this.f23130a) {
            case 0:
                instance$lambda$0 = ListReviewsComponent.Companion.getInstance$lambda$0();
                return instance$lambda$0;
            default:
                create$lambda$0 = StickyBadgeInfoV2Component.Companion.create$lambda$0();
                return create$lambda$0;
        }
    }
}
