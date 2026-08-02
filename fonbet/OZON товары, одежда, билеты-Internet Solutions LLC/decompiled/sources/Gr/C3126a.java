package Gr;

import android.content.Context;
import hi.InterfaceC6958a;
import k20.InterfaceC7469a;
import ru.ozon.app.android.composer.di.page.RetainComposerViewModel;
import ru.ozon.app.android.returns.creation.widgets.modal.di.ReturnCreationModalComponent;

/* renamed from: Gr.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C3126a implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10301b;

    public /* synthetic */ C3126a(Object obj, int i11) {
        this.f10300a = i11;
        this.f10301b = obj;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        InterfaceC6958a interfaceC6958a;
        ReturnCreationModalComponent create$lambda$0;
        switch (this.f10300a) {
            case 0:
                interfaceC6958a = ((RetainComposerViewModel) this.f10301b).retainComponent;
                return interfaceC6958a;
            default:
                create$lambda$0 = ReturnCreationModalComponent.Companion.create$lambda$0((Context) this.f10301b);
                return create$lambda$0;
        }
    }
}
