package Pk0;

import S7.r;
import T7.U;
import U7.y;
import android.content.Context;
import android.view.View;
import com.google.crypto.tink.internal.AbstractC5889h;
import com.google.crypto.tink.internal.F;
import gk0.InterfaceC6746B;
import ru.ozon.app.android.initializers.atoms.AtomActionInitializer;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceWithDiscountView;
import ru.ozon.uni.atoms.AtomConfig;

/* loaded from: classes8.dex */
public final /* synthetic */ class i implements InterfaceC6746B, AbstractC5889h.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22639a;

    public /* synthetic */ i(int i11) {
        this.f22639a = i11;
    }

    public static String a(String str, char c11) {
        return str + c11;
    }

    public static void c(int i11, String str, String str2, String str3, StringBuilder sb2) {
        sb2.append(i11);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
    }

    @Override // com.google.crypto.tink.internal.AbstractC5889h.a
    public F b(He.g gVar, r rVar) {
        return y.d((U) gVar, rVar);
    }

    @Override // gk0.InterfaceC6746B
    public View provide(Context context) {
        PriceWithDiscountView initialize$lambda$9;
        BadgeView init$lambda$14$lambda$1;
        switch (this.f22639a) {
            case 0:
                initialize$lambda$9 = AtomConfig.initialize$lambda$9(context);
                return initialize$lambda$9;
            default:
                init$lambda$14$lambda$1 = AtomActionInitializer.init$lambda$14$lambda$1(context);
                return init$lambda$14$lambda$1;
        }
    }
}
