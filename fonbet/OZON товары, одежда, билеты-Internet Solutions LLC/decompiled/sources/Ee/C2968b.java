package Ee;

import De.w;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.U;
import org.jetbrains.annotations.NotNull;
import xe.C10760z;
import xe.I0;

/* renamed from: Ee.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2968b {
    public static final Object a(@NotNull w wVar, w wVar2, @NotNull Function2 function2) {
        Object c10760z;
        Object f02;
        try {
            U.g(2, function2);
            c10760z = function2.invoke(wVar2, wVar);
        } catch (Throwable th2) {
            c10760z = new C10760z(false, th2);
        }
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (c10760z == aVar || (f02 = wVar.f0(c10760z)) == I0.f105399b) {
            return aVar;
        }
        if (f02 instanceof C10760z) {
            throw ((C10760z) f02).f105510a;
        }
        return I0.g(f02);
    }
}
