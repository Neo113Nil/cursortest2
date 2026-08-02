package Jo;

import hi.InterfaceC6958a;
import k20.InterfaceC7469a;
import ru.ozon.app.android.checkoutcomposer.shortcomment.di.ShortCommentWidgetComponent;
import ru.ozon.app.android.travel.feature.general.main.widgets.pointsInput.di.PointsInputComponent;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14835a;

    public /* synthetic */ a(int i11) {
        this.f14835a = i11;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        ShortCommentWidgetComponent create$lambda$0;
        PointsInputComponent create$lambda$02;
        switch (this.f14835a) {
            case 0:
                create$lambda$0 = ShortCommentWidgetComponent.Companion.create$lambda$0();
                return create$lambda$0;
            default:
                create$lambda$02 = PointsInputComponent.Companion.create$lambda$0();
                return create$lambda$02;
        }
    }
}
