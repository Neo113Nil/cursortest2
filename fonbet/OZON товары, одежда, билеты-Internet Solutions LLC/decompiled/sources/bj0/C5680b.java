package bj0;

import I1.o;
import S0.InterfaceC3967k;
import android.content.Context;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: bj0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5680b {
    @NotNull
    public static final e a(int i11, InterfaceC3967k interfaceC3967k, @NotNull e.a aVar, @NotNull String testTag) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        String str = ((Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d())).getPackageName() + ":id/";
        interfaceC3967k.o(1176827362);
        boolean n11 = ((((i11 & 112) ^ 48) > 32 && interfaceC3967k.n(testTag)) || (i11 & 48) == 32) | interfaceC3967k.n(str);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new C5679a(str, testTag);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        return o.c(aVar, false, (Function1) C11);
    }
}
