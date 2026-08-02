package b1;

import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: b1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5503f {
    @NotNull
    public static final String a(@NotNull Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    @NotNull
    public static final InterfaceC3978p0 b(@NotNull Object[] objArr, @NotNull C5517t c5517t, @NotNull Function0 function0, InterfaceC3967k interfaceC3967k) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.g(c5517t, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        C5500c c5500c = new C5500c(c5517t);
        C5501d c5501d = new C5501d(c5517t);
        int i11 = C5516s.f55469b;
        return (InterfaceC3978p0) c(copyOf, new C5517t(c5500c, c5501d), function0, interfaceC3967k, 384, 0);
    }

    @NotNull
    public static final Object c(@NotNull Object[] objArr, InterfaceC5515r interfaceC5515r, @NotNull Function0 function0, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Object[] objArr2;
        Object obj;
        Object f7;
        if ((i12 & 2) != 0) {
            interfaceC5515r = C5516s.b();
        }
        InterfaceC5515r interfaceC5515r2 = interfaceC5515r;
        Object obj2 = null;
        String str = (i12 & 4) != 0 ? null : "KEY_SEARCH_BAR_TEXT";
        int I11 = interfaceC3967k.I();
        if (str == null || str.length() == 0) {
            str = Integer.toString(I11, CharsKt.checkRadix(36));
            Intrinsics.checkNotNullExpressionValue(str, "toString(this, checkRadix(radix))");
        }
        String str2 = str;
        Intrinsics.g(interfaceC5515r2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        InterfaceC5512o interfaceC5512o = (InterfaceC5512o) interfaceC3967k.m(C5514q.b());
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            if (interfaceC5512o != null && (f7 = interfaceC5512o.f(str2)) != null) {
                obj2 = interfaceC5515r2.a(f7);
            }
            if (obj2 == null) {
                obj2 = function0.invoke();
            }
            objArr2 = objArr;
            Object c5504g = new C5504g(interfaceC5515r2, interfaceC5512o, str2, obj2, objArr2);
            interfaceC3967k.x(c5504g);
            C11 = c5504g;
        } else {
            objArr2 = objArr;
        }
        C5504g c5504g2 = (C5504g) C11;
        Object g10 = c5504g2.g(objArr2);
        if (g10 == null) {
            g10 = function0.invoke();
        }
        boolean F11 = interfaceC3967k.F(c5504g2) | interfaceC3967k.F(interfaceC5515r2) | interfaceC3967k.F(interfaceC5512o) | interfaceC3967k.n(str2) | interfaceC3967k.F(g10) | interfaceC3967k.F(objArr2);
        Object C12 = interfaceC3967k.C();
        if (F11 || C12 == InterfaceC3967k.a.a()) {
            Object[] objArr3 = objArr2;
            obj = g10;
            Object c5502e = new C5502e(c5504g2, interfaceC5515r2, interfaceC5512o, str2, obj, objArr3);
            interfaceC3967k.x(c5502e);
            C12 = c5502e;
        } else {
            obj = g10;
        }
        int i13 = Q.f25307b;
        interfaceC3967k.g((Function0) C12);
        return obj;
    }
}
