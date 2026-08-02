package T2;

import R2.o0;
import Sc.C4001c;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.AbstractC9686l;
import sf.AbstractC9688n;
import sf.D;
import sf.F;
import sf.z;

/* loaded from: classes8.dex */
public final class l<T> extends c<T> implements o0<T> {
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:42|43))(6:44|45|46|47|48|(1:50)(1:51))|13|(2:29|30)|15|(3:17|(2:24|25)|(2:20|21)(1:23))(1:28)))|66|6|7|(0)(0)|13|(0)|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0092, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0093, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099 A[Catch: all -> 0x0092, TRY_LEAVE, TryCatch #0 {all -> 0x0092, blocks: (B:17:0x0099, B:28:0x00a6, B:41:0x008e, B:38:0x0089), top: B:7:0x0020, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6 A[Catch: all -> 0x0092, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0092, blocks: (B:17:0x0099, B:28:0x00a6, B:41:0x008e, B:38:0x0089), top: B:7:0x0020, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r0v10, types: [sf.l] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T2.k, kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r5v2, types: [Q2.f] */
    @Override // R2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        ?? r02;
        int i11;
        Unit unit;
        Throwable th2;
        F f7;
        AbstractC9686l abstractC9686l;
        Throwable th3;
        Unit unit2;
        if (cVar instanceof k) {
            k kVar = (k) cVar;
            int i12 = kVar.f26564i;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                kVar.f26564i = i12 - LinearLayoutManager.INVALID_OFFSET;
                r02 = kVar;
                Object obj2 = r02.f26562g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = r02.f26564i;
                Throwable th4 = null;
                if (i11 != 0) {
                    s.b(obj2);
                    f();
                    AbstractC9688n g10 = g();
                    D file = h();
                    g10.getClass();
                    Intrinsics.checkNotNullParameter(file, "file");
                    AbstractC9686l abstractC9686l2 = g10.i(file);
                    try {
                        F c11 = z.c(AbstractC9686l.s(abstractC9686l2));
                        try {
                            d<T> i13 = i();
                            r02.f26559d = abstractC9686l2;
                            r02.f26560e = abstractC9686l2;
                            r02.f26561f = c11;
                            r02.f26564i = 1;
                            if (((Q2.f) i13).b(obj, c11, r02) == aVar) {
                                return aVar;
                            }
                            AbstractC9686l abstractC9686l3 = abstractC9686l2;
                            abstractC9686l = abstractC9686l3;
                            f7 = c11;
                            r02 = abstractC9686l3;
                        } catch (Throwable th5) {
                            r02 = abstractC9686l2;
                            th2 = th5;
                            f7 = c11;
                            if (f7 != null) {
                                try {
                                    f7.close();
                                } catch (Throwable th6) {
                                    C4001c.a(th2, th6);
                                }
                            }
                            th3 = th2;
                            unit2 = null;
                            if (th3 == null) {
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        if (abstractC9686l2 != null) {
                            try {
                                abstractC9686l2.close();
                            } catch (Throwable th8) {
                                C4001c.a(th, th8);
                            }
                        }
                        th4 = th;
                        unit = null;
                        if (th4 == null) {
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f7 = r02.f26561f;
                    abstractC9686l = r02.f26560e;
                    r02 = r02.f26559d;
                    try {
                        s.b(obj2);
                        r02 = r02;
                    } catch (Throwable th9) {
                        th2 = th9;
                        if (f7 != null) {
                        }
                        th3 = th2;
                        unit2 = null;
                        if (th3 == null) {
                        }
                    }
                }
                abstractC9686l.flush();
                unit2 = Unit.f71690a;
                if (f7 != null) {
                    try {
                        f7.close();
                    } catch (Throwable th10) {
                        th3 = th10;
                    }
                }
                th3 = null;
                if (th3 == null) {
                    throw th3;
                }
                Intrinsics.f(unit2);
                unit = Unit.f71690a;
                if (r02 != 0) {
                    try {
                        r02.close();
                    } catch (Throwable th11) {
                        th4 = th11;
                    }
                }
                if (th4 == null) {
                    throw th4;
                }
                Intrinsics.f(unit);
                return Unit.f71690a;
            }
        }
        r02 = new k(this, cVar);
        Object obj22 = r02.f26562g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = r02.f26564i;
        Throwable th42 = null;
        if (i11 != 0) {
        }
        abstractC9686l.flush();
        unit2 = Unit.f71690a;
        if (f7 != null) {
        }
        th3 = null;
        if (th3 == null) {
        }
    }
}
