package HJ;

import hi.InterfaceC6958a;
import k20.InterfaceC7469a;
import ru.ozon.app.android.messenger.widgets.chatListHeader.di.ChatListHeaderComponent;
import ru.ozon.app.android.session.sessionList.di.CurrentSessionTitleComponent;
import ru.ozon.app.android.session.sessionList.di.DaggerCurrentSessionTitleComponent;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusCellToggle.di.BonusCellToggleComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10733a;

    public /* synthetic */ a(int i11) {
        this.f10733a = i11;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        CurrentSessionTitleComponent create;
        BonusCellToggleComponent create$lambda$0;
        ChatListHeaderComponent createComponent$lambda$0;
        switch (this.f10733a) {
            case 0:
                create = DaggerCurrentSessionTitleComponent.create();
                return create;
            case 1:
                create$lambda$0 = BonusCellToggleComponent.Companion.create$lambda$0();
                return create$lambda$0;
            default:
                createComponent$lambda$0 = ChatListHeaderComponent.Companion.createComponent$lambda$0();
                return createComponent$lambda$0;
        }
    }
}
