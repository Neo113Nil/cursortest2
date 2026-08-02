package D4;

import B4.b0;
import S0.InterfaceC3967k;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.C5503f;
import b1.C5516s;
import b1.C5517t;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: D4.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2848x {
    public static final B4.P a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        B4.P p11 = new B4.P(context);
        p11.D().b(new C2829d(p11.D()));
        p11.D().b(new C2830e());
        p11.D().b(new C2840o());
        return p11;
    }

    @NotNull
    public static final B4.P b(@NotNull b0[] b0VarArr, InterfaceC3967k interfaceC3967k) {
        Context context = (Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d());
        Object[] copyOf = Arrays.copyOf(b0VarArr, b0VarArr.length);
        C5517t a11 = C5516s.a(C2845u.f5931b, new C2846v(context));
        boolean F11 = interfaceC3967k.F(context);
        Object C11 = interfaceC3967k.C();
        if (F11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new C2847w(context);
            interfaceC3967k.x(C11);
        }
        B4.P p11 = (B4.P) C5503f.c(copyOf, a11, (Function0) C11, interfaceC3967k, 0, 4);
        for (b0 b0Var : b0VarArr) {
            p11.D().b(b0Var);
        }
        return p11;
    }
}
