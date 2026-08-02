package Ve;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;

/* loaded from: classes10.dex */
public final class Q1 implements R2.a0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v3, types: [sf.G] */
    /* JADX WARN: Type inference failed for: r5v6, types: [sf.G] */
    /* JADX WARN: Type inference failed for: r6v3, types: [W2.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(InputStream inputStream, kotlin.coroutines.jvm.internal.c cVar) {
        E0 e02;
        int i11;
        try {
            if (cVar instanceof E0) {
                e02 = (E0) cVar;
                int i12 = e02.f28894g;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    e02.f28894g = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = e02.f28892e;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = e02.f28894g;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        ?? d11 = sf.z.d(sf.z.k(inputStream));
                        ?? r62 = W2.k.f33215a;
                        e02.f28891d = d11;
                        e02.f28894g = 1;
                        obj = r62.a(d11, e02);
                        inputStream = d11;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r52 = e02.f28891d;
                        Sc.s.b(obj);
                        inputStream = r52;
                    }
                    Vd0.b.a(inputStream, null);
                    return obj;
                }
            }
            if (i11 != 0) {
            }
            Vd0.b.a(inputStream, null);
            return obj;
        } finally {
        }
        e02 = new E0(this, cVar);
        Object obj2 = e02.f28892e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = e02.f28894g;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, OutputStream outputStream, kotlin.coroutines.jvm.internal.c cVar) {
        C4343j1 c4343j1;
        int i11;
        Throwable th2;
        sf.F f7;
        if (cVar instanceof C4343j1) {
            c4343j1 = (C4343j1) cVar;
            int i12 = c4343j1.f31337g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c4343j1.f31337g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = c4343j1.f31335e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4343j1.f31337g;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    sf.F c11 = sf.z.c(sf.z.g(outputStream));
                    try {
                        W2.k kVar = W2.k.f33215a;
                        c4343j1.f31334d = c11;
                        c4343j1.f31337g = 1;
                        if (kVar.b(obj, c11, c4343j1) == aVar) {
                            return aVar;
                        }
                        f7 = c11;
                    } catch (Throwable th3) {
                        th2 = th3;
                        f7 = c11;
                        throw th2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f7 = c4343j1.f31334d;
                    try {
                        Sc.s.b(obj2);
                    } catch (Throwable th4) {
                        th2 = th4;
                        try {
                            throw th2;
                        } catch (Throwable th5) {
                            Vd0.b.a(f7, th2);
                            throw th5;
                        }
                    }
                }
                Unit unit = Unit.f71690a;
                Vd0.b.a(f7, null);
                return unit;
            }
        }
        c4343j1 = new C4343j1(this, cVar);
        Object obj22 = c4343j1.f31335e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c4343j1.f31337g;
        if (i11 != 0) {
        }
        Unit unit2 = Unit.f71690a;
        Vd0.b.a(f7, null);
        return unit2;
    }
}
