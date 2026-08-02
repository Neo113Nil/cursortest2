package Br;

import hi.InterfaceC6958a;
import k20.C7475g;
import k20.InterfaceC7469a;
import ru.ozon.app.android.composer.ComposerDependenciesProvider;
import ru.ozon.app.android.universalwidgets.widgets.maxiTile.di.MaxiTileComponent;

/* loaded from: classes11.dex */
public final /* synthetic */ class d implements InterfaceC7469a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4035a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4036b;

    public /* synthetic */ d(Object obj, int i11) {
        this.f4035a = i11;
        this.f4036b = obj;
    }

    @Override // k20.InterfaceC7469a
    public final InterfaceC6958a component() {
        InterfaceC6958a interfaceC6958a;
        MaxiTileComponent create$lambda$0;
        switch (this.f4035a) {
            case 0:
                interfaceC6958a = ((ComposerDependenciesProvider) this.f4036b).retainComponent;
                return interfaceC6958a;
            default:
                create$lambda$0 = MaxiTileComponent.Companion.create$lambda$0((C7475g) this.f4036b);
                return create$lambda$0;
        }
    }
}
