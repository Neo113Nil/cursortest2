package T2;

import Je.InterfaceC3394a;
import R2.InterfaceC3908b;
import R2.U;
import R2.i0;
import Sc.C4001c;
import Sc.s;
import T2.g;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.D;
import sf.x;

/* loaded from: classes8.dex */
public final class j<T> implements i0<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x f26552a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final D f26553b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Q2.f f26554c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final U f26555d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f26556e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final a f26557f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Je.d f26558g;

    public j(@NotNull x fileSystem, @NotNull D path, @NotNull Q2.f serializer, @NotNull U coordinator, @NotNull Function0 onClose) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinator, "coordinator");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.f26552a = fileSystem;
        this.f26553b = path;
        this.f26554c = serializer;
        this.f26555d = coordinator;
        this.f26556e = onClose;
        this.f26557f = new a();
        this.f26558g = Je.e.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(6:36|37|38|40|41|(1:43)(1:44))(2:53|54))|13|14|15|(2:(1:18)|19)(1:21)))|7|(0)(0)|13|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[Catch: all -> 0x007d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007d, blocks: (B:21:0x007c, B:28:0x008d, B:31:0x008a, B:27:0x0085), top: B:7:0x0020, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [T2.j] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T2.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T2.j] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [fd.n] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // R2.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull InterfaceC6511n interfaceC6511n, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        ?? r02;
        int i11;
        Throwable th2;
        c cVar2;
        boolean z11;
        j<T> jVar;
        try {
            if (cVar instanceof h) {
                h hVar = (h) cVar;
                int i12 = hVar.f26544i;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    hVar.f26544i = i12 - LinearLayoutManager.INVALID_OFFSET;
                    r02 = hVar;
                    Object obj = r02.f26542g;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = r02.f26544i;
                    if (i11 != 0) {
                        s.b(obj);
                        if (this.f26557f.a()) {
                            throw new IllegalStateException("StorageConnection has already been disposed.");
                        }
                        boolean tryLock = this.f26558g.tryLock();
                        try {
                            c cVar3 = new c(this.f26552a, this.f26553b, this.f26554c);
                            try {
                                Boolean valueOf = Boolean.valueOf(tryLock);
                                r02.f26539d = this;
                                r02.f26540e = cVar3;
                                r02.f26541f = tryLock;
                                r02.f26544i = 1;
                                Object invoke = interfaceC6511n.invoke(cVar3, valueOf, r02);
                                if (invoke == aVar) {
                                    return aVar;
                                }
                                obj = invoke;
                                z11 = tryLock;
                                jVar = this;
                                cVar2 = cVar3;
                            } catch (Throwable th3) {
                                th2 = th3;
                                interfaceC6511n = tryLock;
                                r02 = this;
                                cVar2 = cVar3;
                                cVar2.close();
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            interfaceC6511n = tryLock;
                            r02 = this;
                            if (interfaceC6511n != 0) {
                                r02.f26558g.c(null);
                            }
                            throw th;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC6511n = r02.f26541f;
                        cVar2 = r02.f26540e;
                        r02 = r02.f26539d;
                        try {
                            s.b(obj);
                            jVar = r02;
                            z11 = interfaceC6511n;
                        } catch (Throwable th5) {
                            th2 = th5;
                            try {
                                cVar2.close();
                            } catch (Throwable th6) {
                                C4001c.a(th2, th6);
                            }
                            throw th2;
                        }
                    }
                    cVar2.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z11) {
                        jVar.f26558g.c(null);
                    }
                    return obj;
                }
            }
            if (i11 != 0) {
            }
            cVar2.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th7) {
            th = th7;
            if (interfaceC6511n != 0) {
            }
            throw th;
        }
        r02 = new h(this, cVar);
        Object obj2 = r02.f26542g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = r02.f26544i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ca A[Catch: all -> 0x00da, IOException -> 0x00dd, TRY_ENTER, TryCatch #5 {all -> 0x00da, blocks: (B:19:0x00ca, B:21:0x00d2, B:22:0x00e1, B:26:0x00e9, B:33:0x00f7, B:36:0x00f4), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e9 A[Catch: all -> 0x00da, IOException -> 0x00dd, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x00da, blocks: (B:19:0x00ca, B:21:0x00d2, B:22:0x00e1, B:26:0x00e9, B:33:0x00f7, B:36:0x00f4), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, sf.D] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, sf.D] */
    /* JADX WARN: Type inference failed for: r13v13, types: [Je.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [Je.a] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [T2.i, java.lang.Object, kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r1v3, types: [sf.n, sf.x] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, sf.x] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, sf.x] */
    @Override // R2.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull Function2 function2, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        ?? r12;
        Wc.a aVar;
        int i11;
        j<T> jVar;
        ?? r13;
        D e11;
        l lVar;
        Throwable th2;
        InterfaceC3908b interfaceC3908b;
        InterfaceC3394a interfaceC3394a;
        j<T> jVar2;
        D d11;
        ?? path = ".tmp";
        try {
            try {
                try {
                    try {
                        try {
                            if (cVar instanceof i) {
                                i iVar = (i) cVar;
                                int i12 = iVar.f26551j;
                                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                    iVar.f26551j = i12 - LinearLayoutManager.INVALID_OFFSET;
                                    r12 = iVar;
                                    Object obj = r12.f26549h;
                                    aVar = Wc.a.COROUTINE_SUSPENDED;
                                    i11 = r12.f26551j;
                                    if (i11 != 0) {
                                        s.b(obj);
                                        if (this.f26557f.a()) {
                                            throw new IllegalStateException("StorageConnection has already been disposed.");
                                        }
                                        e11 = this.f26553b.e();
                                        if (e11 == null) {
                                            throw new IllegalStateException("must have a parent path");
                                        }
                                        this.f26552a.a(e11);
                                        r12.f26545d = this;
                                        r12.f26546e = function2;
                                        r12.f26547f = e11;
                                        ?? r132 = this.f26558g;
                                        r12.f26548g = r132;
                                        r12.f26551j = 1;
                                        if (r132.a(r12) != aVar) {
                                            jVar = this;
                                            r13 = r132;
                                        }
                                        return aVar;
                                    }
                                    if (i11 != 1) {
                                        if (i11 != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        interfaceC3908b = (InterfaceC3908b) r12.f26548g;
                                        D d12 = r12.f26547f;
                                        interfaceC3394a = (InterfaceC3394a) r12.f26546e;
                                        jVar2 = r12.f26545d;
                                        try {
                                            s.b(obj);
                                            d11 = d12;
                                            Unit unit = Unit.f71690a;
                                            try {
                                                interfaceC3908b.close();
                                                th = null;
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                            if (th == null) {
                                                throw th;
                                            }
                                            if (jVar2.f26552a.e(d11)) {
                                                jVar2.f26552a.l(d11, jVar2.f26553b);
                                            }
                                            Unit unit2 = Unit.f71690a;
                                            interfaceC3394a.c(null);
                                            return Unit.f71690a;
                                        } catch (Throwable th4) {
                                            th2 = th4;
                                            try {
                                                interfaceC3908b.close();
                                            } catch (Throwable th5) {
                                                C4001c.a(th2, th5);
                                            }
                                            throw th2;
                                        }
                                    }
                                    InterfaceC3394a interfaceC3394a2 = (InterfaceC3394a) r12.f26548g;
                                    e11 = r12.f26547f;
                                    Function2 function22 = (Function2) r12.f26546e;
                                    jVar = r12.f26545d;
                                    s.b(obj);
                                    r13 = interfaceC3394a2;
                                    function2 = function22;
                                    D d13 = jVar.f26553b;
                                    ?? fileSystem = jVar.f26552a;
                                    path = e11.g(d13.c().concat(".tmp"));
                                    fileSystem.c(path);
                                    Q2.f serializer = jVar.f26554c;
                                    Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
                                    Intrinsics.checkNotNullParameter(path, "path");
                                    Intrinsics.checkNotNullParameter(serializer, "serializer");
                                    lVar = new l(fileSystem, path, serializer);
                                    r12.f26545d = jVar;
                                    r12.f26546e = r13;
                                    r12.f26547f = path;
                                    r12.f26548g = lVar;
                                    r12.f26551j = 2;
                                    if (function2.invoke(lVar, r12) != aVar) {
                                        interfaceC3394a = r13;
                                        interfaceC3908b = lVar;
                                        jVar2 = jVar;
                                        d11 = path;
                                        Unit unit3 = Unit.f71690a;
                                        interfaceC3908b.close();
                                        th = null;
                                        if (th == null) {
                                        }
                                    }
                                    return aVar;
                                }
                            }
                            r12.f26545d = jVar;
                            r12.f26546e = r13;
                            r12.f26547f = path;
                            r12.f26548g = lVar;
                            r12.f26551j = 2;
                            if (function2.invoke(lVar, r12) != aVar) {
                            }
                            return aVar;
                        } catch (Throwable th6) {
                            th2 = th6;
                            interfaceC3908b = lVar;
                            interfaceC3908b.close();
                            throw th2;
                        }
                        fileSystem.c(path);
                        Q2.f serializer2 = jVar.f26554c;
                        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
                        Intrinsics.checkNotNullParameter(path, "path");
                        Intrinsics.checkNotNullParameter(serializer2, "serializer");
                        lVar = new l(fileSystem, path, serializer2);
                    } catch (IOException e12) {
                        e = e12;
                        if (jVar.f26552a.e(path)) {
                            try {
                                ?? r14 = jVar.f26552a;
                                r14.getClass();
                                Intrinsics.checkNotNullParameter(path, "path");
                                r14.c(path);
                            } catch (IOException unused) {
                            }
                        }
                        throw e;
                    }
                    D d132 = jVar.f26553b;
                    ?? fileSystem2 = jVar.f26552a;
                    path = e11.g(d132.c().concat(".tmp"));
                } catch (Throwable th7) {
                    th = th7;
                    r13.c(null);
                    throw th;
                }
                if (i11 != 0) {
                }
            } catch (Throwable th8) {
                th = th8;
                r13 = aVar;
                r13.c(null);
                throw th;
            }
        } catch (IOException e13) {
            e = e13;
            jVar = r12;
            r13 = aVar;
        }
        r12 = new i(this, cVar);
        Object obj2 = r12.f26549h;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = r12.f26551j;
    }

    @Override // R2.InterfaceC3908b
    public final void close() {
        this.f26557f.b();
        ((g.a) this.f26556e).invoke();
    }

    @Override // R2.i0
    @NotNull
    public final U d() {
        return this.f26555d;
    }
}
