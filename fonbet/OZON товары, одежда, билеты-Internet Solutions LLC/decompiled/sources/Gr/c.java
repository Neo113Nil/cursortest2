package Gr;

import android.content.Context;
import hi.InterfaceC6958a;
import k20.InterfaceC7469a;
import ru.ozon.app.android.composer.di.page.RetainComposerViewModel;
import ru.ozon.app.android.returns.creation.widgets.total.di.ReturnCreationTotalComponent;

/* loaded from: classes6.dex */
public final /* synthetic */ class c implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10304a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10305b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f10304a = i11;
        this.f10305b = obj;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        InterfaceC6958a interfaceC6958a;
        ReturnCreationTotalComponent create$lambda$0;
        switch (this.f10304a) {
            case 0:
                interfaceC6958a = ((RetainComposerViewModel) this.f10305b).retainComponent;
                return interfaceC6958a;
            default:
                create$lambda$0 = ReturnCreationTotalComponent.Companion.create$lambda$0((Context) this.f10305b);
                return create$lambda$0;
        }
    }
}
