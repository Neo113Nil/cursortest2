package Ae;

import Sc.C4001c;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final /* synthetic */ class H {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(@NotNull InterfaceC2395h interfaceC2395h, @NotNull InterfaceC2397i interfaceC2397i, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        D d11;
        int i11;
        kotlin.jvm.internal.M m11;
        Throwable th2;
        xe.B0 b02;
        CancellationException Z11;
        if (cVar instanceof D) {
            d11 = (D) cVar;
            int i12 = d11.f783f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                d11.f783f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = d11.f782e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = d11.f783f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    kotlin.jvm.internal.M m12 = new kotlin.jvm.internal.M();
                    try {
                        E e11 = new E(interfaceC2397i, m12);
                        d11.f781d = m12;
                        d11.f783f = 1;
                        if (interfaceC2395h.collect(e11, d11) == aVar) {
                            return aVar;
                        }
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        m11 = m12;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m11 = d11.f781d;
                    try {
                        Sc.s.b(obj);
                        return null;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                th2 = (Throwable) m11.f71787a;
                if ((th2 == null && th2.equals(th)) || ((b02 = (xe.B0) d11.getContext().get(xe.B0.f105374o0)) != null && b02.isCancelled() && (Z11 = b02.Z()) != null && Z11.equals(th))) {
                    throw th;
                }
                if (th2 != null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    C4001c.a(th2, th);
                    throw th2;
                }
                C4001c.a(th, th2);
                throw th;
            }
        }
        d11 = new D(cVar);
        Object obj2 = d11.f782e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = d11.f783f;
        if (i11 != 0) {
        }
        th2 = (Throwable) m11.f71787a;
        if (th2 == null) {
        }
        if (th2 != null) {
        }
    }
}
