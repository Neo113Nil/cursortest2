package Pk0;

import android.content.Context;
import android.view.View;
import com.google.gson.internal.o;
import gk0.InterfaceC6746B;
import java.util.ArrayList;
import m3.r;
import ru.ozon.app.android.initializers.atoms.AtomActionInitializer;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceWithDiscountView;
import ru.ozon.uni.android.uikit.view.atoms.rating.RatingView;
import ru.ozon.uni.atoms.AtomConfig;
import u3.InterfaceC9928b;

/* loaded from: classes8.dex */
public final /* synthetic */ class e implements InterfaceC6746B, o, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22635a;

    public /* synthetic */ e(int i11) {
        this.f22635a = i11;
    }

    @Override // com.google.gson.internal.o
    public Object f() {
        return new ArrayList();
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }

    @Override // gk0.InterfaceC6746B
    public View provide(Context context) {
        RatingView initialize$lambda$4;
        PriceWithDiscountView init$lambda$14$lambda$9;
        switch (this.f22635a) {
            case 0:
                initialize$lambda$4 = AtomConfig.initialize$lambda$4(context);
                return initialize$lambda$4;
            default:
                init$lambda$14$lambda$9 = AtomActionInitializer.init$lambda$14$lambda$9(context);
                return init$lambda$14$lambda$9;
        }
    }

    public /* synthetic */ e(InterfaceC9928b.a aVar, int i11, int i12) {
        this.f22635a = 3;
    }
}
