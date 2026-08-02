package R2;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Je.InterfaceC3394a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f0 implements U {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Je.d f24359a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3907a f24360b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<Unit> f24361c;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", f = "SingleProcessCoordinator.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC2397i<? super Unit>, kotlin.coroutines.d<? super Unit>, Object> {
        a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(2, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC2397i<? super Unit> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            return Unit.f71690a;
        }
    }

    public f0(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.f24359a = Je.e.a();
        this.f24360b = new C3907a();
        this.f24361c = C2399j.A(new a(2, null));
    }

    @Override // R2.U
    @NotNull
    public final InterfaceC2395h<Unit> a() {
        return this.f24361c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r9.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // R2.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull Function1 function1, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        d0 d0Var;
        Wc.a aVar;
        int i11;
        Je.d dVar;
        Throwable th2;
        InterfaceC3394a interfaceC3394a;
        Object invoke;
        try {
            if (cVar instanceof d0) {
                d0Var = (d0) cVar;
                int i12 = d0Var.f24351h;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    d0Var.f24351h = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = d0Var.f24349f;
                    aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = d0Var.f24351h;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        d0Var.f24347d = function1;
                        dVar = this.f24359a;
                        d0Var.f24348e = dVar;
                        d0Var.f24351h = 1;
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC3394a = (InterfaceC3394a) d0Var.f24347d;
                            try {
                                Sc.s.b(obj);
                                interfaceC3394a.c(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                interfaceC3394a.c(null);
                                throw th2;
                            }
                        }
                        Je.d dVar2 = d0Var.f24348e;
                        Function1 function12 = (Function1) d0Var.f24347d;
                        Sc.s.b(obj);
                        dVar = dVar2;
                        function1 = function12;
                    }
                    d0Var.f24347d = dVar;
                    d0Var.f24348e = null;
                    d0Var.f24351h = 2;
                    invoke = function1.invoke(d0Var);
                    if (invoke != aVar) {
                        Je.d dVar3 = dVar;
                        obj = invoke;
                        interfaceC3394a = dVar3;
                        interfaceC3394a.c(null);
                        return obj;
                    }
                    return aVar;
                }
            }
            d0Var.f24347d = dVar;
            d0Var.f24348e = null;
            d0Var.f24351h = 2;
            invoke = function1.invoke(d0Var);
            if (invoke != aVar) {
            }
            return aVar;
        } catch (Throwable th4) {
            Je.d dVar4 = dVar;
            th2 = th4;
            interfaceC3394a = dVar4;
            interfaceC3394a.c(null);
            throw th2;
        }
        d0Var = new d0(this, cVar);
        Object obj2 = d0Var.f24349f;
        aVar = Wc.a.COROUTINE_SUSPENDED;
        i11 = d0Var.f24351h;
        if (i11 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // R2.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(@NotNull Function2 function2, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        e0 e0Var;
        int i11;
        Je.d dVar;
        Throwable th2;
        boolean z11;
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i12 = e0Var.f24358h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                e0Var.f24358h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = e0Var.f24356f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = e0Var.f24358h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    Je.d dVar2 = this.f24359a;
                    boolean tryLock = dVar2.tryLock();
                    try {
                        Boolean valueOf = Boolean.valueOf(tryLock);
                        e0Var.f24354d = dVar2;
                        e0Var.f24355e = tryLock;
                        e0Var.f24358h = 1;
                        Object invoke = function2.invoke(valueOf, e0Var);
                        if (invoke == aVar) {
                            return aVar;
                        }
                        dVar = dVar2;
                        obj = invoke;
                        z11 = tryLock;
                    } catch (Throwable th3) {
                        dVar = dVar2;
                        th2 = th3;
                        z11 = tryLock;
                        if (z11) {
                            dVar.c(null);
                        }
                        throw th2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z11 = e0Var.f24355e;
                    dVar = e0Var.f24354d;
                    try {
                        Sc.s.b(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        if (z11) {
                        }
                        throw th2;
                    }
                }
                if (z11) {
                    dVar.c(null);
                }
                return obj;
            }
        }
        e0Var = new e0(this, cVar);
        Object obj2 = e0Var.f24356f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = e0Var.f24358h;
        if (i11 != 0) {
        }
        if (z11) {
        }
        return obj2;
    }

    @Override // R2.U
    public final Integer d() {
        return new Integer(this.f24360b.d());
    }

    @Override // R2.U
    public final Integer getVersion() {
        return new Integer(this.f24360b.b());
    }
}
