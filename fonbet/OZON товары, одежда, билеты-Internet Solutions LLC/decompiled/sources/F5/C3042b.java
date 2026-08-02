package F5;

import E0.C2942q;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import S0.n1;
import android.content.Context;
import android.provider.Settings;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: F5.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3042b {
    @NotNull
    public static final InterfaceC3043c a(B5.g gVar, boolean z11, InterfaceC3967k interfaceC3967k) {
        interfaceC3967k.B(683659508);
        n nVar = n.Immediately;
        if (Float.isInfinite(1.0f) || Float.isNaN(1.0f)) {
            throw new IllegalArgumentException(C2942q.b(1.0f, "Speed must be a finite number. It is ", ".").toString());
        }
        interfaceC3967k.B(2024497114);
        interfaceC3967k.B(-492369756);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            C11 = new g();
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.K();
        InterfaceC3043c interfaceC3043c = (InterfaceC3043c) C11;
        interfaceC3967k.K();
        interfaceC3967k.B(-492369756);
        Object C12 = interfaceC3967k.C();
        if (C12 == InterfaceC3967k.a.a()) {
            C12 = n1.f(Boolean.valueOf(z11), D1.f25195a);
            interfaceC3967k.x(C12);
        }
        interfaceC3967k.K();
        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C12;
        interfaceC3967k.B(-180606834);
        Context context = (Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d());
        int i11 = O5.g.f19991f;
        float f7 = 1.0f / Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        interfaceC3967k.K();
        Q.h(new Object[]{gVar, Boolean.valueOf(z11), null, Float.valueOf(f7), 1}, new C3041a(z11, interfaceC3043c, gVar, f7, nVar, interfaceC3978p0, null), interfaceC3967k);
        interfaceC3967k.K();
        return interfaceC3043c;
    }
}
