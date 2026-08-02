package Pk0;

import android.content.Context;
import android.view.View;
import gk0.InterfaceC6746B;
import ru.ozon.app.android.initializers.atoms.AtomActionInitializer;
import ru.ozon.uni.android.uikit.view.atoms.buttons.addtocart.AddToCartButtonView;
import ru.ozon.uni.android.uikit.view.atoms.tags.TagAtomView;
import ru.ozon.uni.atoms.AtomConfig;

/* loaded from: classes8.dex */
public final /* synthetic */ class d implements InterfaceC6746B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22634a;

    public /* synthetic */ d(int i11) {
        this.f22634a = i11;
    }

    @Override // gk0.InterfaceC6746B
    public final View provide(Context context) {
        AddToCartButtonView initialize$lambda$3;
        TagAtomView init$lambda$14$lambda$8;
        switch (this.f22634a) {
            case 0:
                initialize$lambda$3 = AtomConfig.initialize$lambda$3(context);
                return initialize$lambda$3;
            default:
                init$lambda$14$lambda$8 = AtomActionInitializer.init$lambda$14$lambda$8(context);
                return init$lambda$14$lambda$8;
        }
    }
}
