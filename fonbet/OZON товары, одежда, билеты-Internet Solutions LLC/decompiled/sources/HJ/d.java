package HJ;

import hi.InterfaceC6958a;
import k20.InterfaceC7469a;
import ru.ozon.app.android.session.sessionList.di.DaggerSessionListHeaderComponent;
import ru.ozon.app.android.session.sessionList.di.SessionListHeaderComponent;

/* loaded from: classes7.dex */
public final /* synthetic */ class d implements InterfaceC7469a {
    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        SessionListHeaderComponent create;
        create = DaggerSessionListHeaderComponent.create();
        return create;
    }
}
