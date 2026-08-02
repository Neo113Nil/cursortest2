package Pk0;

import android.content.Context;
import android.view.View;
import gk0.InterfaceC6746B;
import m3.r;
import ru.ozon.app.android.initializers.atoms.AtomActionInitializer;
import ru.ozon.uni.android.uikit.view.atoms.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.atoms.AtomConfig;
import u3.InterfaceC9928b;

/* loaded from: classes8.dex */
public final /* synthetic */ class b implements InterfaceC6746B, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22632a;

    public /* synthetic */ b(int i11) {
        this.f22632a = i11;
    }

    public static int a(float f7, int i11, int i12) {
        return (Float.hashCode(f7) + i11) * i12;
    }

    public static Object b(int i11, U0.b bVar) {
        return bVar.u(bVar.m() - i11);
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }

    @Override // gk0.InterfaceC6746B
    public View provide(Context context) {
        BadgeView initialize$lambda$1;
        SmallBorderlessButtonView init$lambda$14$lambda$6;
        switch (this.f22632a) {
            case 0:
                initialize$lambda$1 = AtomConfig.initialize$lambda$1(context);
                return initialize$lambda$1;
            default:
                init$lambda$14$lambda$6 = AtomActionInitializer.init$lambda$14$lambda$6(context);
                return init$lambda$14$lambda$6;
        }
    }
}
