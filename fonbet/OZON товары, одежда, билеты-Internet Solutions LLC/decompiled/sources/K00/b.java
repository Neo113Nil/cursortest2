package K00;

import D1.InterfaceC2801g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S7.q;
import T7.C4039v;
import android.content.Context;
import androidx.compose.foundation.layout.C5194q;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.crypto.tink.internal.G;
import com.google.crypto.tink.internal.z;
import com.google.gson.internal.o;
import io.sentry.android.core.util.a;
import j3.C7271m;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m1.InterfaceC8038i;
import m3.r;

/* loaded from: classes7.dex */
public final /* synthetic */ class b implements N00.b, z.a, o, a.InterfaceC1104a, InterfaceC8038i, r.b {
    public static String e(int i11, String str, StringBuilder sb2) {
        sb2.append(i11);
        sb2.append(str);
        return sb2.toString();
    }

    public static Function2 g(C3969l c3969l, C5194q c5194q, C3969l c3969l2, A0 a02) {
        F1.b(c3969l, c5194q, InterfaceC2801g.a.e());
        F1.b(c3969l2, a02, InterfaceC2801g.a.g());
        return InterfaceC2801g.a.b();
    }

    @Override // io.sentry.android.core.util.a.InterfaceC1104a
    public Object a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.google.crypto.tink.internal.z.a
    public G b(q qVar) {
        return U7.j.d((C4039v) qVar);
    }

    @Override // m1.InterfaceC8038i
    public double c(double d11) {
        double d12;
        double d13 = d11 < 0.0d ? -d11 : d11;
        if (d13 >= 0.0031308049535603718d) {
            d13 = Math.pow(d13, 0.4166666666666667d) - 0.05213270142180095d;
            d12 = 0.9478672985781991d;
        } else {
            d12 = 0.07739938080495357d;
        }
        return Math.copySign(d13 / d12, d11);
    }

    @Override // m3.r.b
    public void d(Object obj, C7271m c7271m) {
    }

    @Override // com.google.gson.internal.o
    public Object f() {
        return new LinkedHashMap();
    }

    @Override // N00.b
    public N00.a provide(String str, L00.j jVar) {
        N00.a aVar;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        aVar = N00.a.f18344z;
        return aVar;
    }
}
