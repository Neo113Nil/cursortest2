package Cs;

import hi.InterfaceC6958a;
import k20.InterfaceC7469a;
import ru.ozon.app.android.di.IslandSeparatorWidgetComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.shortcutsController.di.ShortcutsControllerComponent;
import ru.ozon.app.android.ugc.core.widgets.singlereview.userLikes.UserLikesComponent;

/* loaded from: classes6.dex */
public final /* synthetic */ class d implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5163a;

    public /* synthetic */ d(int i11) {
        this.f5163a = i11;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        IslandSeparatorWidgetComponent create$lambda$0;
        UserLikesComponent create$lambda$02;
        ShortcutsControllerComponent create$lambda$03;
        switch (this.f5163a) {
            case 0:
                create$lambda$0 = IslandSeparatorWidgetComponent.Companion.create$lambda$0();
                return create$lambda$0;
            case 1:
                create$lambda$02 = UserLikesComponent.Companion.create$lambda$0();
                return create$lambda$02;
            default:
                create$lambda$03 = ShortcutsControllerComponent.Companion.create$lambda$0();
                return create$lambda$03;
        }
    }
}
