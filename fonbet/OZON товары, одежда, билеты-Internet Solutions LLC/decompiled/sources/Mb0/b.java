package Mb0;

import De.C2862e;
import Ib0.h;
import Sc.InterfaceC4008j;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import dc0.C6154S;
import dc0.C6178x;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td0.f;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.I;
import xe.L0;
import xe.M;
import xe.N;
import xe.X0;
import ze.C11115c;
import ze.k;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<ru.ozon.id.logout.data.d> f17800a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Xb0.a> f17801b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final I f17802c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C6178x f17803d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2862e f17804e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C11115c f17805f;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f17806a;

        public a(boolean z11) {
            this.f17806a = z11;
        }

        public final boolean a() {
            return this.f17806a;
        }
    }

    @e(c = "ru.ozon.id.forceLogout.ForceLogoutUseCase$execute$1", f = "ForceLogoutUseCase.kt", l = {54}, m = "invokeSuspend")
    /* renamed from: Mb0.b$b, reason: collision with other inner class name */
    static final class C0342b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f17807d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f17808e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ b f17809f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0342b(boolean z11, b bVar, kotlin.coroutines.d<? super C0342b> dVar) {
            super(2, dVar);
            this.f17808e = z11;
            this.f17809f = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C0342b(this.f17808e, this.f17809f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0342b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f17807d;
            if (i11 == 0) {
                s.b(obj);
                a aVar2 = new a(this.f17808e);
                C11115c c11115c = this.f17809f.f17805f;
                this.f17807d = 1;
                if (c11115c.n(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    public b() {
        throw null;
    }

    public b(InterfaceC4008j repository, InterfaceC4008j logoutHandler, C6178x currentUserRepository) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        L0 mainDispatcher = De.s.f6650a;
        He.b ioDispatcher = He.b.f10879b;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(logoutHandler, "logoutHandler");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f17800a = repository;
        this.f17801b = logoutHandler;
        this.f17802c = mainDispatcher;
        this.f17803d = currentUserRepository;
        C2862e a11 = N.a(CoroutineContext.Element.a.d(ioDispatcher, (H0) X0.b()));
        this.f17804e = a11;
        this.f17805f = k.a(0, 7, null);
        f.b(a11, null, new Mb0.a(this, null));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(1:(1:(4:14|15|16|17)(2:19|20))(5:21|22|23|16|17))(7:25|26|27|(2:29|30)|23|16|17))(3:31|32|33))(1:34))(2:44|(1:46))|35|(4:37|(1:39)|32|33)(7:40|(2:42|43)|27|(0)|23|16|17)))|53|6|7|(0)(0)|35|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ff, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0100, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0047, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cf, code lost:
    
        r9.f17801b.getValue().b();
        Vb0.b.a.c(Vb0.b.f28514a, r10);
        r10 = new Ib0.h.b(Gb0.c.FORCE_LOGOUT);
        r0.f17810d = null;
        r0.f17811e = null;
        r0.f17814h = 5;
        r11 = xe.C10727i.f(r9.f17802c, new Mb0.d(r10, null), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f7, code lost:
    
        if (r11 == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098 A[Catch: all -> 0x0047, CancellationException -> 0x00ff, TRY_ENTER, TryCatch #2 {CancellationException -> 0x00ff, all -> 0x0047, blocks: (B:22:0x0042, B:23:0x00cc, B:26:0x004c, B:27:0x00b3, B:40:0x0098), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, a aVar, kotlin.coroutines.d dVar) {
        c cVar;
        Object obj;
        int i11;
        bVar.getClass();
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i12 = cVar.f17814h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar.f17814h = i12 - LinearLayoutManager.INVALID_OFFSET;
                obj = cVar.f17812f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = cVar.f17814h;
                if (i11 != 0) {
                    s.b(obj);
                    cVar.f17810d = bVar;
                    cVar.f17811e = aVar;
                    cVar.f17814h = 1;
                    obj = bVar.f17803d.a(cVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            s.b(obj);
                            return Unit.f71690a;
                        }
                        if (i11 != 3) {
                            if (i11 == 4) {
                                bVar = cVar.f17810d;
                                s.b(obj);
                                return Unit.f71690a;
                            }
                            if (i11 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            s.b(obj);
                            return Unit.f71690a;
                        }
                        bVar = cVar.f17810d;
                        s.b(obj);
                        cVar.f17810d = bVar;
                        cVar.f17814h = 4;
                        obj = C10727i.f(bVar.f17802c, new d(new h.c(Gb0.c.FORCE_LOGOUT), null), cVar);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        return Unit.f71690a;
                    }
                    aVar = (a) cVar.f17811e;
                    bVar = cVar.f17810d;
                    s.b(obj);
                }
                if (!((C6154S) obj).i()) {
                    h.a aVar3 = new h.a(Gb0.c.FORCE_LOGOUT);
                    cVar.f17810d = null;
                    cVar.f17811e = null;
                    cVar.f17814h = 2;
                    if (C10727i.f(bVar.f17802c, new d(aVar3, null), cVar) == aVar2) {
                        return aVar2;
                    }
                    return Unit.f71690a;
                }
                ru.ozon.id.logout.data.d value = bVar.f17800a.getValue();
                boolean a11 = aVar.a();
                cVar.f17810d = bVar;
                cVar.f17811e = null;
                cVar.f17814h = 3;
                if (ru.ozon.id.logout.data.d.f(value, a11, null, cVar, 12) == aVar2) {
                    return aVar2;
                }
                cVar.f17810d = bVar;
                cVar.f17814h = 4;
                obj = C10727i.f(bVar.f17802c, new d(new h.c(Gb0.c.FORCE_LOGOUT), null), cVar);
                if (obj == aVar2) {
                }
                return Unit.f71690a;
            }
        }
        cVar = new c(bVar, dVar);
        obj = cVar.f17812f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar.f17814h;
        if (i11 != 0) {
        }
        if (!((C6154S) obj).i()) {
        }
    }

    public final void c(boolean z11) {
        f.b(this.f17804e, null, new C0342b(z11, this, null));
    }
}
