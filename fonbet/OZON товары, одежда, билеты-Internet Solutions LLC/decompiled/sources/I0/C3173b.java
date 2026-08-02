package I0;

import D1.InterfaceC2801g;
import S0.F1;
import S0.InterfaceC3967k;
import android.content.Context;
import android.view.View;
import b8.C5581a;
import c8.C5764c;
import com.google.crypto.tink.internal.B;
import com.google.crypto.tink.internal.x;
import gk0.InterfaceC6746B;
import java.security.GeneralSecurityException;
import kotlin.jvm.functions.Function2;
import m3.r;
import ru.ozon.app.android.initializers.atoms.AtomActionInitializer;
import ru.ozon.uni.android.uikit.view.atoms.rating.RatingView;
import u3.InterfaceC9928b;

/* renamed from: I0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3173b implements InterfaceC6746B, x.a, B.b, r.a {
    public static String a(char c11, String str, String str2) {
        return str + str2 + c11;
    }

    public static String b(long j11, String str) {
        return str + j11;
    }

    public static String c(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2.toString();
    }

    public static Function2 f(InterfaceC3967k interfaceC3967k, androidx.compose.foundation.layout.Y y11, InterfaceC3967k interfaceC3967k2, S0.A0 a02) {
        F1.b(interfaceC3967k, y11, InterfaceC2801g.a.e());
        F1.b(interfaceC3967k2, a02, InterfaceC2801g.a.g());
        return InterfaceC2801g.a.b();
    }

    @Override // com.google.crypto.tink.internal.x.a
    public S7.q d(com.google.crypto.tink.internal.G g10) {
        return U7.A.b(g10);
    }

    @Override // com.google.crypto.tink.internal.B.b
    public Object e(He.g gVar) {
        C5581a c5581a = (C5581a) gVar;
        if (c5581a.i().d() == 32) {
            return C5764c.a(c5581a);
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).getClass();
    }

    @Override // gk0.InterfaceC6746B
    public View provide(Context context) {
        RatingView init$lambda$14$lambda$4;
        init$lambda$14$lambda$4 = AtomActionInitializer.init$lambda$14$lambda$4(context);
        return init$lambda$14$lambda$4;
    }
}
