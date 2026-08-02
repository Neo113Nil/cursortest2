package b0;

import a.AbstractC0603a;
import java.util.concurrent.atomic.AtomicInteger;
import k6.AbstractC1356c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import w1.C1719l1;
import w1.C1761y0;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final M6.d f10050a = M6.e.a();

    /* renamed from: b, reason: collision with root package name */
    public final C1719l1 f10051b = new C1719l1(12);

    /* renamed from: c, reason: collision with root package name */
    public final C1761y0 f10052c = new C1761y0(new g0(2, null));

    public h0(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f10051b.f17771a).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Function1 function1, AbstractC1356c abstractC1356c) {
        e0 e0Var;
        j6.a aVar;
        int i7;
        M6.d dVar;
        Throwable th;
        M6.a aVar2;
        Object invoke;
        try {
            if (abstractC1356c instanceof e0) {
                e0Var = (e0) abstractC1356c;
                int i8 = e0Var.f10033e;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    e0Var.f10033e = i8 - Integer.MIN_VALUE;
                    Object obj = e0Var.f10031c;
                    aVar = j6.a.f14642a;
                    i7 = e0Var.f10033e;
                    if (i7 != 0) {
                        AbstractC0603a.p0(obj);
                        e0Var.f10029a = function1;
                        dVar = this.f10050a;
                        e0Var.f10030b = dVar;
                        e0Var.f10033e = 1;
                        if (dVar.a(e0Var) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = (M6.a) e0Var.f10029a;
                            try {
                                AbstractC0603a.p0(obj);
                                aVar2.b(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar2.b(null);
                                throw th;
                            }
                        }
                        M6.d dVar2 = e0Var.f10030b;
                        Function1 function12 = (Function1) e0Var.f10029a;
                        AbstractC0603a.p0(obj);
                        dVar = dVar2;
                        function1 = function12;
                    }
                    e0Var.f10029a = dVar;
                    e0Var.f10030b = null;
                    e0Var.f10033e = 2;
                    invoke = function1.invoke(e0Var);
                    if (invoke != aVar) {
                        return aVar;
                    }
                    M6.d dVar3 = dVar;
                    obj = invoke;
                    aVar2 = dVar3;
                    aVar2.b(null);
                    return obj;
                }
            }
            e0Var.f10029a = dVar;
            e0Var.f10030b = null;
            e0Var.f10033e = 2;
            invoke = function1.invoke(e0Var);
            if (invoke != aVar) {
            }
        } catch (Throwable th3) {
            M6.d dVar4 = dVar;
            th = th3;
            aVar2 = dVar4;
            aVar2.b(null);
            throw th;
        }
        e0Var = new e0(this, abstractC1356c);
        Object obj2 = e0Var.f10031c;
        aVar = j6.a.f14642a;
        i7 = e0Var.f10033e;
        if (i7 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Function2 function2, AbstractC1356c abstractC1356c) {
        f0 f0Var;
        int i7;
        M6.d dVar;
        Throwable th;
        boolean z4;
        if (abstractC1356c instanceof f0) {
            f0Var = (f0) abstractC1356c;
            int i8 = f0Var.f10042e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                f0Var.f10042e = i8 - Integer.MIN_VALUE;
                Object obj = f0Var.f10040c;
                Object obj2 = j6.a.f14642a;
                i7 = f0Var.f10042e;
                if (i7 != 0) {
                    AbstractC0603a.p0(obj);
                    M6.d dVar2 = this.f10050a;
                    boolean e7 = dVar2.e(null);
                    try {
                        Object valueOf = Boolean.valueOf(e7);
                        f0Var.f10038a = dVar2;
                        f0Var.f10039b = e7;
                        f0Var.f10042e = 1;
                        Object invoke = function2.invoke(valueOf, f0Var);
                        if (invoke == obj2) {
                            return obj2;
                        }
                        dVar = dVar2;
                        obj = invoke;
                        z4 = e7;
                    } catch (Throwable th2) {
                        dVar = dVar2;
                        th = th2;
                        z4 = e7;
                        if (z4) {
                            dVar.b(null);
                        }
                        throw th;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z4 = f0Var.f10039b;
                    dVar = f0Var.f10038a;
                    try {
                        AbstractC0603a.p0(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z4) {
                        }
                        throw th;
                    }
                }
                if (z4) {
                    dVar.b(null);
                }
                return obj;
            }
        }
        f0Var = new f0(this, abstractC1356c);
        Object obj3 = f0Var.f10040c;
        Object obj22 = j6.a.f14642a;
        i7 = f0Var.f10042e;
        if (i7 != 0) {
        }
        if (z4) {
        }
        return obj3;
    }
}
