package F5;

import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.Q;
import S0.n1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;
import xe.C10737n;

/* loaded from: classes8.dex */
public final class F {
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Context context, v vVar, String str, String str2, String str3, String str4, kotlin.coroutines.jvm.internal.c cVar) {
        C frame;
        Wc.a aVar;
        int i11;
        String str5;
        String str6;
        Context context2;
        String str7;
        B5.g gVar;
        Object f7;
        Context context3;
        B5.g gVar2;
        String str8;
        Object f11;
        if (cVar instanceof C) {
            frame = (C) cVar;
            int i12 = frame.f8993i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                frame.f8993i = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = frame.f8992h;
                aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = frame.f8993i;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    com.airbnb.lottie.h b11 = b(context, vVar, str4, false);
                    if (b11 == null) {
                        throw new IllegalArgumentException(("Unable to create parsing task for " + vVar + ".").toString());
                    }
                    frame.f8988d = context;
                    frame.f8989e = str;
                    str5 = str2;
                    frame.f8990f = str5;
                    str6 = str3;
                    frame.f8991g = str6;
                    frame.f8993i = 1;
                    C10737n c10737n = new C10737n(1, Wc.b.b(frame));
                    c10737n.o();
                    b11.d(new y(c10737n));
                    b11.c(new z(c10737n));
                    obj = c10737n.n();
                    if (obj == aVar) {
                        Intrinsics.checkNotNullParameter(frame, "frame");
                    }
                    if (obj != aVar) {
                        context2 = context;
                        str7 = str;
                    }
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        B5.g gVar3 = (B5.g) frame.f8988d;
                        Sc.s.b(obj);
                        return gVar3;
                    }
                    gVar2 = (B5.g) frame.f8991g;
                    str8 = frame.f8990f;
                    str5 = frame.f8989e;
                    context3 = (Context) frame.f8988d;
                    Sc.s.b(obj);
                    frame.f8988d = gVar2;
                    frame.f8989e = null;
                    frame.f8990f = null;
                    frame.f8991g = null;
                    frame.f8993i = 3;
                    if (((HashMap) gVar2.g()).isEmpty()) {
                        C10720e0 c10720e0 = C10720e0.f105451a;
                        f11 = C10727i.f(He.b.f10879b, new A(gVar2, context3, str5, str8, null), frame);
                        if (f11 != aVar) {
                            f11 = Unit.f71690a;
                        }
                    } else {
                        f11 = Unit.f71690a;
                    }
                    return f11 != aVar ? aVar : gVar2;
                }
                String str9 = (String) frame.f8991g;
                String str10 = frame.f8990f;
                String str11 = frame.f8989e;
                Context context4 = (Context) frame.f8988d;
                Sc.s.b(obj);
                str5 = str10;
                str7 = str11;
                str6 = str9;
                context2 = context4;
                gVar = (B5.g) obj;
                frame.f8988d = context2;
                frame.f8989e = str5;
                frame.f8990f = str6;
                frame.f8991g = gVar;
                frame.f8993i = 2;
                if (gVar.q()) {
                    f7 = Unit.f71690a;
                } else {
                    C10720e0 c10720e02 = C10720e0.f105451a;
                    f7 = C10727i.f(He.b.f10879b, new B(gVar, context2, str7, null), frame);
                    if (f7 != aVar) {
                        f7 = Unit.f71690a;
                    }
                }
                if (f7 != aVar) {
                    context3 = context2;
                    gVar2 = gVar;
                    str8 = str6;
                    frame.f8988d = gVar2;
                    frame.f8989e = null;
                    frame.f8990f = null;
                    frame.f8991g = null;
                    frame.f8993i = 3;
                    if (((HashMap) gVar2.g()).isEmpty()) {
                    }
                    if (f11 != aVar) {
                    }
                }
            }
        }
        frame = new C(cVar);
        Object obj2 = frame.f8992h;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = frame.f8993i;
        if (i11 != 0) {
        }
        gVar = (B5.g) obj2;
        frame.f8988d = context2;
        frame.f8989e = str5;
        frame.f8990f = str6;
        frame.f8991g = gVar;
        frame.f8993i = 2;
        if (gVar.q()) {
        }
        if (f7 != aVar) {
        }
    }

    private static final com.airbnb.lottie.h b(Context context, v vVar, String str, boolean z11) {
        if (vVar != null) {
            return Intrinsics.d(str, "__LottieInternalDefaultCacheKey__") ? com.airbnb.lottie.a.j(vVar.b(), context) : com.airbnb.lottie.a.k(context, vVar.b(), str);
        }
        throw new Sc.o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final q c(@NotNull v spec, InterfaceC3967k interfaceC3967k) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        interfaceC3967k.B(-1248473602);
        D d11 = new D(3, null);
        Context context = (Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d());
        interfaceC3967k.B(1157296644);
        boolean n11 = interfaceC3967k.n(spec);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = n1.f(new q(), D1.f25195a);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.K();
        InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C11;
        interfaceC3967k.B(511388516);
        boolean n12 = interfaceC3967k.n(spec) | interfaceC3967k.n("__LottieInternalDefaultCacheKey__");
        Object C12 = interfaceC3967k.C();
        if (n12 || C12 == InterfaceC3967k.a.a()) {
            interfaceC3967k.x(b(context, spec, "__LottieInternalDefaultCacheKey__", true));
        }
        interfaceC3967k.K();
        Q.g(spec, "__LottieInternalDefaultCacheKey__", new E(d11, context, spec, interfaceC3978p0, null), interfaceC3967k);
        q qVar = (q) interfaceC3978p0.getValue();
        interfaceC3967k.K();
        return qVar;
    }
}
