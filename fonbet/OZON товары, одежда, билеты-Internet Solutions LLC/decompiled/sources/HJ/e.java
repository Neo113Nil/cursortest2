package HJ;

import hi.InterfaceC6958a;
import k20.InterfaceC7469a;
import ru.ozon.app.android.session.sessionList.di.DaggerSessionListTitleComponent;
import ru.ozon.app.android.session.sessionList.di.SessionListTitleComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class e implements InterfaceC7469a {
    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        SessionListTitleComponent create;
        create = DaggerSessionListTitleComponent.create();
        return create;
    }
}
