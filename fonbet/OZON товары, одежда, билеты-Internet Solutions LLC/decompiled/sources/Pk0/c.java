package Pk0;

import android.content.Context;
import android.view.View;
import gk0.InterfaceC6746B;
import ru.ozon.app.android.initializers.atoms.AtomActionInitializer;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.atoms.AtomConfig;

/* loaded from: classes8.dex */
public final /* synthetic */ class c implements InterfaceC6746B {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22633a;

    public /* synthetic */ c(int i11) {
        this.f22633a = i11;
    }

    public static int a(int i11, int i12, long j11) {
        return (Long.hashCode(j11) + i11) * i12;
    }

    @Override // gk0.InterfaceC6746B
    public View provide(Context context) {
        PriceView initialize$lambda$2;
        SmallButtonView init$lambda$14$lambda$7;
        switch (this.f22633a) {
            case 0:
                initialize$lambda$2 = AtomConfig.initialize$lambda$2(context);
                return initialize$lambda$2;
            default:
                init$lambda$14$lambda$7 = AtomActionInitializer.init$lambda$14$lambda$7(context);
                return init$lambda$14$lambda$7;
        }
    }
}
