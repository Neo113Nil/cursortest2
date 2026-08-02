package bc0;

import Ae.C0;
import Ae.C2399j;
import Ae.C2417s0;
import Ae.E0;
import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import Sc.InterfaceC4008j;
import Sc.o;
import Sc.s;
import Vb0.b;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import bc0.AbstractC5648g;
import bc0.AbstractC5649h;
import bc0.AbstractC5650i;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.logout.data.ConfirmTrustedDeviceDTO;
import ru.ozon.id.logout.data.api.LogoutResponse;
import ru.ozon.id.nativeauth.data.models.AuthTokenDTO;
import xc0.C10702a;
import xe.J;
import xe.M;

/* renamed from: bc0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5643b extends w0 implements M {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C10702a> f55889a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<ru.ozon.id.logout.data.d> f55890b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Xb0.a> f55891c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final x0<Boolean> f55892d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final x0<AbstractC5650i> f55893e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<AbstractC5650i> f55894f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C2417s0 f55895g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final C0 f55896h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<AbstractC5649h> f55897i;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f55898j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final d f55899k;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.logout.presentation.viewModel.LogoutViewModel$1", f = "LogoutViewModel.kt", l = {69, 70}, m = "invokeSuspend")
    /* renamed from: bc0.b$a */
    static final class a extends j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f55900d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return C5643b.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        
            if (bc0.C5643b.h0(r2, (ru.ozon.id.logout.data.api.LogoutResponse) r7, r6) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
        
            if (r7 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f55900d;
            C5643b c5643b = C5643b.this;
            if (i11 == 0) {
                s.b(obj);
                ru.ozon.id.logout.data.d dVar = (ru.ozon.id.logout.data.d) c5643b.f55890b.getValue();
                this.f55900d = 1;
                obj = ru.ozon.id.logout.data.d.f(dVar, false, null, this, 15);
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            this.f55900d = 2;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.logout.presentation.viewModel.LogoutViewModel$exceptionHandler$1$1", f = "LogoutViewModel.kt", l = {62, 63}, m = "invokeSuspend")
    /* renamed from: bc0.b$b, reason: collision with other inner class name */
    static final class C0834b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f55902d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC5649h.a f55904f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0834b(AbstractC5649h.a aVar, kotlin.coroutines.d<? super C0834b> dVar) {
            super(2, dVar);
            this.f55904f = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C5643b.this.new C0834b(this.f55904f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0834b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        
            if (r6.emit(r5.f55904f, r5) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        
            if (r6.emit(r1, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f55902d;
            C5643b c5643b = C5643b.this;
            if (i11 == 0) {
                s.b(obj);
                c5643b.f55898j = true;
                x0 x0Var = c5643b.f55892d;
                Boolean bool = Boolean.FALSE;
                this.f55902d = 1;
            } else {
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
            }
            C0 c02 = c5643b.f55896h;
            this.f55902d = 2;
        }
    }

    /* renamed from: bc0.b$c */
    /* synthetic */ class c extends C7719a implements InterfaceC6511n<AbstractC5650i, Boolean, kotlin.coroutines.d<? super EnumC5642a>, Object> {
        @Override // fd.InterfaceC6511n
        public final Object invoke(AbstractC5650i abstractC5650i, Boolean bool, kotlin.coroutines.d<? super EnumC5642a> dVar) {
            AbstractC5650i abstractC5650i2 = abstractC5650i;
            boolean booleanValue = bool.booleanValue();
            ((C5643b) this.receiver).getClass();
            if (!booleanValue) {
                return EnumC5642a.Hidden;
            }
            if (Intrinsics.d(abstractC5650i2, AbstractC5650i.a.f55926a)) {
                return EnumC5642a.FullScreen;
            }
            if (abstractC5650i2 instanceof AbstractC5650i.b) {
                return EnumC5642a.Dialog;
            }
            throw new o();
        }
    }

    /* renamed from: bc0.b$d */
    public static final class d extends kotlin.coroutines.a implements J {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5643b f55905a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(J.a aVar, C5643b c5643b) {
            super(aVar);
            this.f55905a = c5643b;
        }

        @Override // xe.J
        public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
            b.a.c(Vb0.b.f28514a, th2);
            AbstractC5649h.a aVar = new AbstractC5649h.a(AbstractC5649h.a.AbstractC0835a.C0836a.f55924a);
            C5643b c5643b = this.f55905a;
            td0.f.b(c5643b, null, c5643b.new C0834b(aVar, null));
        }
    }

    public C5643b(@NotNull InterfaceC4008j<C10702a> authRepository, @NotNull InterfaceC4008j<ru.ozon.id.logout.data.d> logoutRepository, @NotNull InterfaceC4008j<Xb0.a> logoutHandler) {
        Intrinsics.checkNotNullParameter(authRepository, "authRepository");
        Intrinsics.checkNotNullParameter(logoutRepository, "logoutRepository");
        Intrinsics.checkNotNullParameter(logoutHandler, "logoutHandler");
        this.f55889a = authRepository;
        this.f55890b = logoutRepository;
        this.f55891c = logoutHandler;
        x0<Boolean> a11 = O0.a(Boolean.FALSE);
        this.f55892d = a11;
        x0<AbstractC5650i> a12 = O0.a(AbstractC5650i.a.f55926a);
        this.f55893e = a12;
        this.f55894f = C2399j.b(a12);
        this.f55895g = new C2417s0(a12, a11, new c(3, this, C5643b.class, "getLoaderState", "getLoaderState(Lru/ozon/id/logout/presentation/viewModel/UiState;Z)Lru/ozon/id/logout/presentation/viewModel/LoaderState;", 4));
        C0 b11 = E0.b(0, 0, null, 7);
        this.f55896h = b11;
        this.f55897i = C2399j.a(b11);
        d dVar = new d(J.f105405n0, this);
        this.f55899k = dVar;
        td0.f.b(this, dVar, new C5644c(this, new a(null), null));
    }

    public static final Object g0(C5643b c5643b, AuthTokenDTO authTokenDTO, kotlin.coroutines.d dVar) {
        c5643b.getClass();
        Object emit = c5643b.f55896h.emit(new AbstractC5649h.a(new AbstractC5649h.a.AbstractC0835a.b(authTokenDTO)), (kotlin.coroutines.jvm.internal.c) dVar);
        return emit == Wc.a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
    
        if (r9.emit(r8, r0) != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        if (r10 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b5, code lost:
    
        if (r8 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h0(C5643b c5643b, LogoutResponse logoutResponse, kotlin.coroutines.jvm.internal.c cVar) {
        C5647f c5647f;
        int i11;
        C5643b c5643b2;
        AbstractC5650i.b bVar;
        c5643b.getClass();
        if (cVar instanceof C5647f) {
            c5647f = (C5647f) cVar;
            int i12 = c5647f.f55918h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c5647f.f55918h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c5647f.f55916f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c5647f.f55918h;
                if (i11 != 0) {
                    s.b(obj);
                    String deeplink = logoutResponse.getDeeplink();
                    AuthTokenDTO authToken = logoutResponse.getAuthToken();
                    if (deeplink != null) {
                        C10702a value = c5643b.f55889a.getValue();
                        c5647f.f55914d = c5643b;
                        c5647f.f55918h = 1;
                        obj = value.o(deeplink, c5647f);
                    } else {
                        if (authToken == null) {
                            throw new IllegalArgumentException("Invalid `logout` response");
                        }
                        c5647f.f55918h = 4;
                        Object emit = c5643b.f55896h.emit(new AbstractC5649h.a(new AbstractC5649h.a.AbstractC0835a.b(authToken)), c5647f);
                        if (emit != aVar) {
                            emit = Unit.f71690a;
                        }
                    }
                    return aVar;
                }
                if (i11 == 1) {
                    c5643b = c5647f.f55914d;
                    s.b(obj);
                    AbstractC5650i.b bVar2 = new AbstractC5650i.b((ConfirmTrustedDeviceDTO) obj);
                    x0<Boolean> x0Var = c5643b.f55892d;
                    Boolean bool = Boolean.FALSE;
                    c5647f.f55914d = c5643b;
                    c5647f.f55915e = bVar2;
                    c5647f.f55918h = 2;
                    if (x0Var.emit(bool, c5647f) != aVar) {
                        c5643b2 = c5643b;
                        bVar = bVar2;
                        x0<AbstractC5650i> x0Var2 = c5643b2.f55893e;
                        c5647f.f55914d = null;
                        c5647f.f55915e = null;
                        c5647f.f55918h = 3;
                    }
                    return aVar;
                }
                if (i11 == 2) {
                    bVar = c5647f.f55915e;
                    c5643b2 = c5647f.f55914d;
                    s.b(obj);
                    x0<AbstractC5650i> x0Var22 = c5643b2.f55893e;
                    c5647f.f55914d = null;
                    c5647f.f55915e = null;
                    c5647f.f55918h = 3;
                } else {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    s.b(obj);
                }
                return Unit.f71690a;
            }
        }
        c5647f = new C5647f(c5643b, cVar);
        Object obj2 = c5647f.f55916f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c5647f.f55918h;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }

    @Override // xe.M
    @NotNull
    public final CoroutineContext getCoroutineContext() {
        return androidx.lifecycle.x0.a(this).getCoroutineContext();
    }

    @NotNull
    public final InterfaceC2395h<AbstractC5649h> j0() {
        return this.f55897i;
    }

    @NotNull
    public final C2417s0 k0() {
        return this.f55895g;
    }

    @NotNull
    public final InterfaceC2395h<AbstractC5650i> l0() {
        return this.f55894f;
    }

    public final void m0(@NotNull AbstractC5648g action) {
        Intrinsics.checkNotNullParameter(action, "action");
        AbstractC5650i value = this.f55893e.getValue();
        boolean d11 = Intrinsics.d(action, AbstractC5648g.d.f55922a);
        d dVar = this.f55899k;
        if (d11) {
            if (value instanceof AbstractC5650i.b) {
                td0.f.b(this, dVar, new C5644c(this, new C5645d(this, ((AbstractC5650i.b) value).a().getSubmitButton(), null), null));
            }
        } else if (Intrinsics.d(action, AbstractC5648g.b.f55920a)) {
            if (value instanceof AbstractC5650i.b) {
                td0.f.b(this, dVar, new C5644c(this, new C5645d(this, ((AbstractC5650i.b) value).a().getCancelButton(), null), null));
            }
        } else {
            if (!Intrinsics.d(action, AbstractC5648g.c.f55921a) && !Intrinsics.d(action, AbstractC5648g.a.f55919a)) {
                throw new o();
            }
            td0.f.b(this, null, new C5646e(this, null));
        }
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        if (this.f55898j) {
            this.f55891c.getValue().b();
        }
    }
}
