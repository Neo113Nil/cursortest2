package Gr;

import android.content.Context;
import hi.InterfaceC6958a;
import k20.InterfaceC7469a;
import ru.ozon.app.android.composer.di.page.RetainComposerViewModel;
import ru.ozon.app.android.returns.creation.widgets.reasons.di.ReturnCreationReasonsComponent;

/* renamed from: Gr.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C3127b implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10303b;

    public /* synthetic */ C3127b(Object obj, int i11) {
        this.f10302a = i11;
        this.f10303b = obj;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        InterfaceC6958a lambda$6$lambda$1;
        ReturnCreationReasonsComponent create$lambda$0;
        switch (this.f10302a) {
            case 0:
                lambda$6$lambda$1 = RetainComposerViewModel.lambda$6$lambda$1((RetainComposerViewModel) this.f10303b);
                return lambda$6$lambda$1;
            default:
                create$lambda$0 = ReturnCreationReasonsComponent.Companion.create$lambda$0((Context) this.f10303b);
                return create$lambda$0;
        }
    }
}
