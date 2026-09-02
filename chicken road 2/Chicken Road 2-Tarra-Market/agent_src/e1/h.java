package e1;

import d1.l;
import d1.q;
import g1.v;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0.a f999a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0.a f1000b;

    static {
        int i2 = 28;
        f999a = new C0.a(i2, "NONE");
        f1000b = new C0.a(i2, "PENDING");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x005a, B:19:0x006e, B:21:0x0076, B:23:0x007c, B:25:0x0082, B:28:0x0093, B:30:0x009b, B:31:0x00a2, B:32:0x00a4, B:33:0x00a5, B:34:0x00ac, B:42:0x0049, B:44:0x0050), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r9v4, types: [d1.s] */
    /* JADX WARN: Type inference failed for: r9v6, types: [d1.s] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0090 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, q qVar, boolean z2, O0.b bVar) {
        e eVar;
        int i2;
        d1.a aVar;
        q qVar2;
        d1.a aVar2;
        d dVar2;
        q qVar3;
        try {
            if (bVar instanceof e) {
                eVar = (e) bVar;
                int i3 = eVar.f988i;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    eVar.f988i = i3 - Integer.MIN_VALUE;
                    Object obj = eVar.f987h;
                    N0.a aVar3 = N0.a.f260a;
                    i2 = eVar.f988i;
                    if (i2 != 0) {
                        V.a.C(obj);
                        d1.c cVar = qVar.f948d;
                        cVar.getClass();
                        aVar = new d1.a(cVar);
                        qVar3 = qVar;
                        eVar.f983d = dVar;
                        eVar.f984e = qVar3;
                        eVar.f985f = aVar;
                        eVar.f986g = z2;
                        eVar.f988i = 1;
                        obj = aVar.b(eVar);
                        if (obj == aVar3) {
                        }
                    } else if (i2 == 1) {
                        z2 = eVar.f986g;
                        aVar2 = eVar.f985f;
                        ?? r9 = eVar.f984e;
                        dVar2 = eVar.f983d;
                        V.a.C(obj);
                        qVar2 = r9;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z2 = eVar.f986g;
                        aVar2 = eVar.f985f;
                        ?? r92 = eVar.f984e;
                        dVar2 = eVar.f983d;
                        V.a.C(obj);
                        q qVar4 = r92;
                        d dVar3 = dVar2;
                        aVar = aVar2;
                        dVar = dVar3;
                        qVar3 = qVar4;
                        eVar.f983d = dVar;
                        eVar.f984e = qVar3;
                        eVar.f985f = aVar;
                        eVar.f986g = z2;
                        eVar.f988i = 1;
                        obj = aVar.b(eVar);
                        if (obj == aVar3) {
                            return aVar3;
                        }
                        d1.a aVar4 = aVar;
                        dVar2 = dVar;
                        aVar2 = aVar4;
                        qVar2 = qVar3;
                        if (!((Boolean) obj).booleanValue()) {
                            if (z2) {
                                qVar2.a(null);
                            }
                            return K0.i.f206a;
                        }
                        Object obj2 = aVar2.f901a;
                        C0.a aVar5 = d1.e.f931p;
                        if (obj2 == aVar5) {
                            throw new IllegalStateException("`hasNext()` has not been invoked");
                        }
                        aVar2.f901a = aVar5;
                        if (obj2 == d1.e.f927l) {
                            Throwable k2 = aVar2.f903c.k();
                            if (k2 == null) {
                                k2 = new l("Channel was closed");
                            }
                            int i4 = v.f1180a;
                            throw k2;
                        }
                        eVar.f983d = dVar2;
                        eVar.f984e = qVar2;
                        eVar.f985f = aVar2;
                        eVar.f986g = z2;
                        eVar.f988i = 2;
                        qVar4 = qVar2;
                        if (dVar2.a(obj2, eVar) == aVar3) {
                            return aVar3;
                        }
                        d dVar32 = dVar2;
                        aVar = aVar2;
                        dVar = dVar32;
                        qVar3 = qVar4;
                        eVar.f983d = dVar;
                        eVar.f984e = qVar3;
                        eVar.f985f = aVar;
                        eVar.f986g = z2;
                        eVar.f988i = 1;
                        obj = aVar.b(eVar);
                        if (obj == aVar3) {
                        }
                    }
                }
            }
            if (i2 != 0) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z2) {
                    CancellationException cancellationException = th instanceof CancellationException ? th : null;
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                        cancellationException.initCause(th);
                    }
                    qVar.a(cancellationException);
                }
                throw th2;
            }
        }
        eVar = new e(bVar);
        Object obj3 = eVar.f987h;
        N0.a aVar32 = N0.a.f260a;
        i2 = eVar.f988i;
    }
}
