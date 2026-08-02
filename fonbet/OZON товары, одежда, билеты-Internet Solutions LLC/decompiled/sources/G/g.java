package G;

import S0.B0;
import U7.y;
import android.content.Context;
import android.view.View;
import com.google.crypto.tink.internal.AbstractC5887f;
import com.google.crypto.tink.internal.F;
import gk0.InterfaceC6746B;
import java.util.List;
import m3.r;
import ru.ozon.app.android.initializers.atoms.AtomActionInitializer;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import u3.InterfaceC9928b;
import w3.j;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements InterfaceC6746B, AbstractC5887f.a, r.a, j.b {
    public static int a(int i11, int i12, String str) {
        return (str.hashCode() + i11) * i12;
    }

    public static int b(int i11, int i12, List list) {
        return (list.hashCode() + i11) * i12;
    }

    public static String c(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static void e(int i11, String str, String str2, String str3, StringBuilder sb2) {
        sb2.append(i11);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        B0.b(sb2.toString());
        throw null;
    }

    @Override // com.google.crypto.tink.internal.AbstractC5887f.a
    public He.g d(F f7, S7.r rVar) {
        return y.c(f7, rVar);
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }

    @Override // gk0.InterfaceC6746B
    public View provide(Context context) {
        PriceView init$lambda$14$lambda$2;
        init$lambda$14$lambda$2 = AtomActionInitializer.init$lambda$14$lambda$2(context);
        return init$lambda$14$lambda$2;
    }

    @Override // w3.j.b
    public void release() {
    }
}
