package p0;

import a.AbstractC0018a;
import java.util.concurrent.CancellationException;
import o0.l;
import o0.q;
import r0.w;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f1128a = new io.flutter.plugin.platform.i(2, "NONE");

    /* renamed from: b, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f1129b = new io.flutter.plugin.platform.i(2, "PENDING");

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        if (r1.a(r11, r0) == r5) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x005a, B:20:0x006e, B:22:0x0076, B:24:0x007c, B:26:0x0082, B:28:0x0093, B:30:0x009b, B:31:0x00a2, B:32:0x00a4, B:33:0x00a5, B:34:0x00ac, B:42:0x0049, B:44:0x0050), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r9v4, types: [o0.s] */
    /* JADX WARN: Type inference failed for: r9v6, types: [o0.s] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0090 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, q qVar, boolean z2, a0.b bVar) {
        e eVar;
        int i2;
        o0.a aVar;
        q qVar2;
        o0.a aVar2;
        d dVar2;
        q qVar3;
        try {
            if (bVar instanceof e) {
                eVar = (e) bVar;
                int i3 = eVar.f1117j;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    eVar.f1117j = i3 - Integer.MIN_VALUE;
                    Object obj = eVar.f1116i;
                    i2 = eVar.f1117j;
                    Z.a aVar3 = Z.a.f411b;
                    if (i2 != 0) {
                        AbstractC0018a.C(obj);
                        o0.c cVar = qVar.f1096e;
                        cVar.getClass();
                        aVar = new o0.a(cVar);
                        qVar3 = qVar;
                        eVar.f1112e = dVar;
                        eVar.f1113f = qVar3;
                        eVar.f1114g = aVar;
                        eVar.f1115h = z2;
                        eVar.f1117j = 1;
                        obj = aVar.b(eVar);
                        if (obj != aVar3) {
                        }
                    } else if (i2 == 1) {
                        z2 = eVar.f1115h;
                        aVar2 = eVar.f1114g;
                        ?? r9 = eVar.f1113f;
                        dVar2 = eVar.f1112e;
                        AbstractC0018a.C(obj);
                        qVar2 = r9;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z2 = eVar.f1115h;
                        aVar2 = eVar.f1114g;
                        ?? r92 = eVar.f1113f;
                        dVar2 = eVar.f1112e;
                        AbstractC0018a.C(obj);
                        q qVar4 = r92;
                        d dVar3 = dVar2;
                        aVar = aVar2;
                        dVar = dVar3;
                        qVar3 = qVar4;
                        eVar.f1112e = dVar;
                        eVar.f1113f = qVar3;
                        eVar.f1114g = aVar;
                        eVar.f1115h = z2;
                        eVar.f1117j = 1;
                        obj = aVar.b(eVar);
                        if (obj != aVar3) {
                            return aVar3;
                        }
                        o0.a aVar4 = aVar;
                        dVar2 = dVar;
                        aVar2 = aVar4;
                        qVar2 = qVar3;
                        if (!((Boolean) obj).booleanValue()) {
                            if (z2) {
                                qVar2.a(null);
                            }
                            return W.g.f394a;
                        }
                        Object obj2 = aVar2.f1051b;
                        io.flutter.plugin.platform.i iVar = o0.e.f1080p;
                        if (obj2 == iVar) {
                            throw new IllegalStateException("`hasNext()` has not been invoked");
                        }
                        aVar2.f1051b = iVar;
                        if (obj2 == o0.e.f1076l) {
                            Throwable k2 = aVar2.f1053d.k();
                            if (k2 == null) {
                                k2 = new l("Channel was closed");
                            }
                            int i4 = w.f1198a;
                            throw k2;
                        }
                        eVar.f1112e = dVar2;
                        eVar.f1113f = qVar2;
                        eVar.f1114g = aVar2;
                        eVar.f1115h = z2;
                        eVar.f1117j = 2;
                        qVar4 = qVar2;
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
        Object obj3 = eVar.f1116i;
        i2 = eVar.f1117j;
        Z.a aVar32 = Z.a.f411b;
    }
}
