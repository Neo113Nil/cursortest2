package Ic0;

import Ae.C0;
import Ae.E0;
import De.C2862e;
import De.s;
import Sc.InterfaceC4008j;
import Vb0.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.AuthTokenDTO;
import xe.C10720e0;
import xe.C10727i;
import xe.H0;
import xe.I;
import xe.L0;
import xe.N;
import xe.X0;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Ic0.a> f12188a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Xb0.a> f12189b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Ib0.e> f12190c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final I f12191d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2862e f12192e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C0 f12193f;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f12194a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC7737t f12195b;

        /* renamed from: c, reason: collision with root package name */
        private final String f12196c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f12197d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, Function1 function1, boolean z11, boolean z12) {
            this.f12194a = z11;
            this.f12195b = (AbstractC7737t) function1;
            this.f12196c = str;
            this.f12197d = z12;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1<Ic0.b, kotlin.Unit>, kotlin.jvm.internal.t] */
        public final Function1<Ic0.b, Unit> a() {
            return this.f12195b;
        }

        public final boolean b() {
            return this.f12194a;
        }

        public final String c() {
            return this.f12196c;
        }

        public final boolean d() {
            return this.f12197d;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.initAuth.InitAuthUseCase", f = "InitAuthUseCase.kt", l = {78, 79, 87}, m = "onExecute")
    static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        d f12198d;

        /* renamed from: e, reason: collision with root package name */
        Object f12199e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f12200f;

        /* renamed from: h, reason: collision with root package name */
        int f12202h;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12200f = obj;
            this.f12202h |= LinearLayoutManager.INVALID_OFFSET;
            return d.this.f(null, this);
        }
    }

    public d() {
        throw null;
    }

    public d(InterfaceC4008j repository, InterfaceC4008j logoutHandler, InterfaceC4008j authEvents) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        L0 mainDispatcher = s.f6650a;
        He.b ioDispatcher = He.b.f10879b;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(logoutHandler, "logoutHandler");
        Intrinsics.checkNotNullParameter(authEvents, "authEvents");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f12188a = repository;
        this.f12189b = logoutHandler;
        this.f12190c = authEvents;
        this.f12191d = mainDispatcher;
        C2862e a11 = N.a(CoroutineContext.Element.a.d(ioDispatcher, (H0) X0.b()));
        this.f12192e = a11;
        this.f12193f = E0.b(0, 0, null, 7);
        td0.f.b(a11, null, new c(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(5:(2:3|(6:5|6|7|(1:(3:(1:(1:12)(2:16|17))(2:18|19)|13|14)(2:20|21))(5:28|29|30|(1:32)|26)|22|(1:24)(1:27)))|7|(0)(0)|22|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        if (r11 != r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        if (r10 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0042, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c A[Catch: all -> 0x0042, CancellationException -> 0x0044, TRY_LEAVE, TryCatch #1 {all -> 0x0042, blocks: (B:19:0x003d, B:21:0x004d, B:22:0x0076, B:27:0x008c), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(a aVar, kotlin.coroutines.d<? super Unit> dVar) {
        b bVar;
        Wc.a aVar2;
        d dVar2;
        d dVar3;
        Object f7;
        try {
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i11 = bVar.f12202h;
                if ((i11 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    bVar.f12202h = i11 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = bVar.f12200f;
                    aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    dVar2 = bVar.f12202h;
                    if (dVar2 != 0) {
                        Sc.s.b(obj);
                        try {
                            Ic0.a value = this.f12188a.getValue();
                            boolean b11 = aVar.b();
                            String c11 = aVar.c();
                            boolean d11 = aVar.d();
                            bVar.f12198d = this;
                            bVar.f12199e = aVar;
                            bVar.f12202h = 1;
                            obj = value.f(b11, c11, d11, bVar);
                            if (obj != aVar2) {
                                dVar3 = this;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            dVar2 = this;
                            if (aVar.d()) {
                                dVar2.f12189b.getValue().b();
                            }
                            b.a.c(Vb0.b.f28514a, th);
                            bVar.f12198d = null;
                            bVar.f12199e = null;
                            bVar.f12202h = 3;
                            Object f11 = C10727i.f(dVar2.f12191d, new f(aVar, null, dVar2, null), bVar);
                            if (f11 != Wc.a.COROUTINE_SUSPENDED) {
                                f11 = Unit.f71690a;
                            }
                        }
                        return aVar2;
                    }
                    if (dVar2 != 1) {
                        if (dVar2 == 2) {
                            d dVar4 = bVar.f12198d;
                            Sc.s.b(obj);
                        } else {
                            if (dVar2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Sc.s.b(obj);
                        }
                        return Unit.f71690a;
                    }
                    aVar = (a) bVar.f12199e;
                    dVar3 = bVar.f12198d;
                    Sc.s.b(obj);
                    bVar.f12198d = dVar3;
                    bVar.f12199e = aVar;
                    bVar.f12202h = 2;
                    f7 = C10727i.f(dVar3.f12191d, new f(aVar, (AuthTokenDTO) obj, dVar3, null), bVar);
                    if (f7 == aVar2) {
                        f7 = Unit.f71690a;
                    }
                }
            }
            if (dVar2 != 0) {
            }
            bVar.f12198d = dVar3;
            bVar.f12199e = aVar;
            bVar.f12202h = 2;
            f7 = C10727i.f(dVar3.f12191d, new f(aVar, (AuthTokenDTO) obj, dVar3, null), bVar);
            if (f7 == aVar2) {
            }
        } catch (CancellationException e11) {
            throw e11;
        }
        bVar = new b(dVar);
        Object obj2 = bVar.f12200f;
        aVar2 = Wc.a.COROUTINE_SUSPENDED;
        dVar2 = bVar.f12202h;
    }

    public final void d(String str, Function1 function1, boolean z11, boolean z12) {
        td0.f.b(this.f12192e, null, new e(z11, function1, str, z12, this, null));
    }

    public final Object e(String str, boolean z11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object f7 = f(new a(str, null, false, z11), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }
}
