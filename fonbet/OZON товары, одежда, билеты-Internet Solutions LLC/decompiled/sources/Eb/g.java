package Eb;

import Ae.C2399j;
import R2.InterfaceC3917k;
import Sc.s;
import W2.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g {
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(@NotNull InterfaceC3917k interfaceC3917k, @NotNull f.a aVar, Integer num, Integer num2, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        c cVar2;
        int i11;
        boolean d11;
        int i12;
        int i13;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f7783i;
            if ((i14 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar2.f7783i = i14 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cVar2.f7782h;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = cVar2.f7783i;
                if (i11 != 0) {
                    s.b(obj);
                    cVar2.f7778d = interfaceC3917k;
                    cVar2.f7779e = aVar;
                    cVar2.f7780f = num;
                    cVar2.f7783i = 1;
                    obj = b(interfaceC3917k, aVar, num2, cVar2);
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i13 = cVar2.f7781g;
                        s.b(obj);
                        i12 = i13;
                        return Boolean.valueOf(i12 != 0);
                    }
                    num = cVar2.f7780f;
                    aVar = cVar2.f7779e;
                    interfaceC3917k = cVar2.f7778d;
                    s.b(obj);
                }
                d11 = Intrinsics.d(obj, num);
                i12 = !d11 ? 1 : 0;
                if (!d11) {
                    cVar2.f7778d = null;
                    cVar2.f7779e = null;
                    cVar2.f7780f = null;
                    cVar2.f7781g = i12;
                    cVar2.f7783i = 2;
                    if (d(interfaceC3917k, aVar, num, cVar2) != aVar2) {
                        i13 = i12;
                        i12 = i13;
                    }
                    return aVar2;
                }
                return Boolean.valueOf(i12 != 0);
            }
        }
        cVar2 = new c(cVar);
        Object obj2 = cVar2.f7782h;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar2.f7783i;
        if (i11 != 0) {
        }
        d11 = Intrinsics.d(obj2, num);
        i12 = !d11 ? 1 : 0;
        if (!d11) {
        }
        return Boolean.valueOf(i12 != 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(@NotNull InterfaceC3917k interfaceC3917k, @NotNull f.a aVar, Integer num, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        e eVar;
        int i11;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i12 = eVar.f7793f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eVar.f7793f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eVar.f7792e;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = eVar.f7793f;
                if (i11 != 0) {
                    s.b(obj);
                    eVar.f7791d = num;
                    eVar.f7793f = 1;
                    obj = c(interfaceC3917k, aVar, eVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    num = eVar.f7791d;
                    s.b(obj);
                }
                return obj != null ? num : obj;
            }
        }
        eVar = new e(cVar);
        Object obj2 = eVar.f7792e;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eVar.f7793f;
        if (i11 != 0) {
        }
        if (obj2 != null) {
        }
    }

    public static final Object c(@NotNull InterfaceC3917k interfaceC3917k, @NotNull f.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        return C2399j.w(new d(interfaceC3917k.getData(), aVar), cVar);
    }

    public static final Object d(@NotNull InterfaceC3917k interfaceC3917k, @NotNull f.a aVar, Object obj, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        Object a11 = W2.j.a(interfaceC3917k, new f(obj, aVar, null), cVar);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }
}
