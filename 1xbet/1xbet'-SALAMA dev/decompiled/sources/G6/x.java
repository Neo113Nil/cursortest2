package G6;

import F2.W0;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W0 f3140a = new W0("NONE", 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final W0 f3141b = new W0("PENDING", 1);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(z zVar, p010b0.r rVar, Throwable th, p077k6.c cVar) throws IllegalAccessException, InvocationTargetException {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i7 = kVar.f3093c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                kVar.f3093c = i7 - Integer.MIN_VALUE;
            } else {
                kVar = new k(cVar);
            }
        } else {
            kVar = new k(cVar);
        }
        Object obj = kVar.f3092b;
        Object obj2 = j6.a.f14648a;
        int i8 = kVar.f3093c;
        try {
            if (i8 == 0) {
                p003a.a.p0(obj);
                kVar.f3091a = th;
                kVar.f3093c = 1;
                if (rVar.invoke(zVar, th, kVar) == obj2) {
                    return obj2;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = kVar.f3091a;
                p003a.a.p0(obj);
            }
            return p044f6.i.f13014a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                Q0.a.c(th2, th);
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0080 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0086 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0097 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0094 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(G6.h r8, F6.o r9, boolean r10, p077k6.c r11) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G6.x.b(G6.h, F6.o, boolean, k6.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(g gVar, p077k6.c cVar) {
        t tVar;
        t6.p pVar;
        H6.a e7;
        s sVar;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i7 = tVar.f3129d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                tVar.f3129d = i7 - Integer.MIN_VALUE;
            } else {
                tVar = new t(cVar);
            }
        } else {
            tVar = new t(cVar);
        }
        Object obj = tVar.f3128c;
        Object obj2 = j6.a.f14648a;
        int i8 = tVar.f3129d;
        if (i8 == 0) {
            p003a.a.p0(obj);
            t6.p pVar2 = new t6.p();
            s sVar2 = new s(pVar2, 0);
            try {
                tVar.f3126a = pVar2;
                tVar.f3127b = sVar2;
                tVar.f3129d = 1;
                if (gVar.r(sVar2, tVar) == obj2) {
                    return obj2;
                }
                pVar = pVar2;
            } catch (H6.a e8) {
                pVar = pVar2;
                e7 = e8;
                sVar = sVar2;
                if (e7.f3423a != sVar) {
                    throw e7;
                }
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar = tVar.f3127b;
            pVar = tVar.f3126a;
            try {
                p003a.a.p0(obj);
            } catch (H6.a e9) {
                e7 = e9;
                if (e7.f3423a != sVar) {
                    throw e7;
                }
            }
        }
        return pVar.f16478a;
    }
}
