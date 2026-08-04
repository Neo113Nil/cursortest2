package p010b0;

import M6.a;
import M6.d;
import M6.e;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p077k6.c;
import p155w1.C1010l1;
import p155w1.C1052y0;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f10050a = e.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1010l1 f10051b = new C1010l1(12);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1052y0 f10052c = new C1052y0(new g0(2, null));

    public h0(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f10051b.f17777a).get());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Function1 function1, c cVar) {
        e0 e0Var;
        d dVar;
        Throwable th;
        a aVar;
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i7 = e0Var.f10033e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                e0Var.f10033e = i7 - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(this, cVar);
            }
        } else {
            e0Var = new e0(this, cVar);
        }
        Object obj = e0Var.f10031c;
        j6.a aVar2 = j6.a.f14648a;
        int i8 = e0Var.f10033e;
        try {
            if (i8 == 0) {
                p003a.a.p0(obj);
                e0Var.f10029a = function1;
                dVar = this.f10050a;
                e0Var.f10030b = dVar;
                e0Var.f10033e = 1;
                if (dVar.a(e0Var) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i8 != 1) {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) e0Var.f10029a;
                    try {
                        p003a.a.p0(obj);
                        aVar.b(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar.b(null);
                        throw th;
                    }
                }
                d dVar2 = e0Var.f10030b;
                Function1 function2 = (Function1) e0Var.f10029a;
                p003a.a.p0(obj);
                dVar = dVar2;
                function1 = function2;
            }
            e0Var.f10029a = dVar;
            e0Var.f10030b = null;
            e0Var.f10033e = 2;
            Object objInvoke = function1.invoke(e0Var);
            if (objInvoke == aVar2) {
                return aVar2;
            }
            d dVar3 = dVar;
            obj = objInvoke;
            aVar = dVar3;
            aVar.b(null);
            return obj;
        } catch (Throwable th3) {
            d dVar4 = dVar;
            th = th3;
            aVar = dVar4;
            aVar.b(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Function2 function2, c cVar) throws Throwable {
        f0 f0Var;
        d dVar;
        Throwable th;
        boolean z4;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i7 = f0Var.f10042e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                f0Var.f10042e = i7 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(this, cVar);
            }
        } else {
            f0Var = new f0(this, cVar);
        }
        Object obj = f0Var.f10040c;
        Object obj2 = j6.a.f14648a;
        int i8 = f0Var.f10042e;
        if (i8 != 0) {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z4 = f0Var.f10039b;
            dVar = f0Var.f10038a;
            try {
                p003a.a.p0(obj);
                if (z4) {
                    dVar.b(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z4) {
                    dVar.b(null);
                }
                throw th;
            }
        }
        p003a.a.p0(obj);
        d dVar2 = this.f10050a;
        boolean zE = dVar2.e(null);
        try {
            Object objValueOf = Boolean.valueOf(zE);
            f0Var.f10038a = dVar2;
            f0Var.f10039b = zE;
            f0Var.f10042e = 1;
            Object objInvoke = function2.invoke(objValueOf, f0Var);
            if (objInvoke == obj2) {
                return obj2;
            }
            dVar = dVar2;
            obj = objInvoke;
            z4 = zE;
            if (z4) {
                dVar.b(null);
            }
            return obj;
        } catch (Throwable th3) {
            dVar = dVar2;
            th = th3;
            z4 = zE;
            if (z4) {
                dVar.b(null);
            }
            throw th;
        }
    }
}
