package H6;

import D6.t0;
import F2.W0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W0 f3444a = new W0("NULL", 1);

    public static /* synthetic */ G6.g a(j jVar, t0 t0Var, int i7, int i8, int i9) {
        p065i6.i iVar = t0Var;
        if ((i9 & 1) != 0) {
            iVar = p065i6.j.f14074a;
        }
        if ((i9 & 2) != 0) {
            i7 = -3;
        }
        if ((i9 & 4) != 0) {
            i8 = 1;
        }
        return jVar.t(iVar, i7, i8);
    }

    public static final Object b(p065i6.i iVar, Object obj, Object obj2, Function2 function2, p065i6.d dVar) {
        Object objM = I6.a.m(iVar, obj2);
        try {
            s sVar = new s(dVar, iVar);
            t6.s.a(2, function2);
            Object objInvoke = function2.invoke(obj, sVar);
            I6.a.g(iVar, objM);
            if (objInvoke == j6.a.f14648a) {
                t6.h.e(dVar, "frame");
            }
            return objInvoke;
        } catch (Throwable th) {
            I6.a.g(iVar, objM);
            throw th;
        }
    }
}
