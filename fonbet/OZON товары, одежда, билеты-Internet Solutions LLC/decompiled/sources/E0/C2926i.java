package E0;

import Sc.C4005g;
import androidx.compose.ui.platform.InterfaceC5286t1;
import androidx.compose.ui.platform.c2;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p0.AbstractC8823a;

/* renamed from: E0.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2926i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String[] f7251a = {"*/*", "image/*", "video/*"};

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Wc.a b(@NotNull InterfaceC5286t1 interfaceC5286t1, @NotNull c1 c1Var, @NotNull Z0 z02, @NotNull Q1.r rVar, AbstractC8823a abstractC8823a, Function1 function1, Ae.w0 w0Var, c2 c2Var, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C2916d c2916d;
        int i11;
        if (cVar instanceof C2916d) {
            c2916d = (C2916d) cVar;
            int i12 = c2916d.f7179e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c2916d.f7179e = i12 - LinearLayoutManager.INVALID_OFFSET;
                C2916d c2916d2 = c2916d;
                Object obj = c2916d2.f7178d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c2916d2.f7179e;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    InterfaceC2945s a11 = C2951v.a(interfaceC5286t1.getView());
                    c2916d2.f7179e = 1;
                    if (c(interfaceC5286t1, c1Var, z02, rVar, abstractC8823a, function1, a11, w0Var, c2Var, c2916d2) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                throw new C4005g();
            }
        }
        c2916d = new C2916d(cVar);
        C2916d c2916d22 = c2916d;
        Object obj2 = c2916d22.f7178d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c2916d22.f7179e;
        if (i11 != 0) {
        }
        throw new C4005g();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Wc.a c(@NotNull InterfaceC5286t1 interfaceC5286t1, @NotNull c1 c1Var, @NotNull Z0 z02, @NotNull Q1.r rVar, AbstractC8823a abstractC8823a, Function1 function1, @NotNull InterfaceC2945s interfaceC2945s, Ae.w0 w0Var, c2 c2Var, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C2918e c2918e;
        int i11;
        if (cVar instanceof C2918e) {
            c2918e = (C2918e) cVar;
            int i12 = c2918e.f7187e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c2918e.f7187e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c2918e.f7186d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c2918e.f7187e;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    C2924h c2924h = new C2924h(w0Var, c1Var, z02, interfaceC2945s, interfaceC5286t1, rVar, abstractC8823a, function1, c2Var, null);
                    c2918e.f7187e = 1;
                    if (xe.N.d(c2924h, c2918e) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                throw new C4005g();
            }
        }
        c2918e = new C2918e(cVar);
        Object obj2 = c2918e.f7186d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c2918e.f7187e;
        if (i11 != 0) {
        }
        throw new C4005g();
    }
}
