package Qj0;

import Je.InterfaceC3394a;
import ak0.InterfaceC5031a;
import android.annotation.SuppressLint;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.db.entities.UserData;
import xe.C10727i;

@SuppressLint({"CheckResult"})
/* loaded from: classes7.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC5031a f23710a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final xe.M f23711b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Je.d f23712c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private volatile UserData f23713d;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.UserDataController$1", f = "UserDataController.kt", l = {91, 29}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        InterfaceC3394a f23714d;

        /* renamed from: e, reason: collision with root package name */
        u0 f23715e;

        /* renamed from: f, reason: collision with root package name */
        int f23716f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return u0.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
        
            if (r3 == r0) goto L19;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0056 A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:7:0x0011, B:8:0x0052, B:10:0x0056, B:11:0x0059, B:19:0x003f), top: B:2:0x0007 }] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [Je.a] */
        /* JADX WARN: Type inference failed for: r1v4, types: [Je.a] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r3v3, types: [Je.a] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u0 u0Var;
            Je.d dVar;
            u0 u0Var2;
            UserData userData;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            ?? r12 = this.f23716f;
            try {
                if (r12 == 0) {
                    Sc.s.b(obj);
                    u0Var = u0.this;
                    Je.d dVar2 = u0Var.f23712c;
                    this.f23714d = dVar2;
                    this.f23715e = u0Var;
                    this.f23716f = 1;
                    Object a11 = dVar2.a(this);
                    dVar = dVar2;
                } else {
                    if (r12 != 1) {
                        if (r12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        u0Var2 = this.f23715e;
                        InterfaceC3394a interfaceC3394a = this.f23714d;
                        Sc.s.b(obj);
                        r12 = interfaceC3394a;
                        userData = (UserData) obj;
                        if (userData != null) {
                            u0Var2.f23713d = userData;
                        }
                        Unit unit = Unit.f71690a;
                        r12.c(null);
                        return Unit.f71690a;
                    }
                    u0 u0Var3 = this.f23715e;
                    ?? r32 = this.f23714d;
                    Sc.s.b(obj);
                    u0Var = u0Var3;
                    dVar = r32;
                }
                InterfaceC5031a interfaceC5031a = u0Var.f23710a;
                this.f23714d = dVar;
                this.f23715e = u0Var;
                this.f23716f = 2;
                Object b11 = interfaceC5031a.b(this);
                if (b11 != aVar) {
                    u0Var2 = u0Var;
                    obj = b11;
                    r12 = dVar;
                    userData = (UserData) obj;
                    if (userData != null) {
                    }
                    Unit unit2 = Unit.f71690a;
                    r12.c(null);
                    return Unit.f71690a;
                }
                return aVar;
            } catch (Throwable th2) {
                r12.c(null);
                throw th2;
            }
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.UserDataController$setRegionId$1", f = "UserDataController.kt", l = {91, 54}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        InterfaceC3394a f23718d;

        /* renamed from: e, reason: collision with root package name */
        u0 f23719e;

        /* renamed from: f, reason: collision with root package name */
        long f23720f;

        /* renamed from: g, reason: collision with root package name */
        int f23721g;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f23723i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j11, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f23723i = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return u0.this.new b(this.f23723i, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0041, code lost:
        
            if (r15.a(r14) == r0) goto L20;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v4, types: [Je.a] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u0 u0Var;
            Je.d dVar;
            long j11;
            InterfaceC3394a interfaceC3394a;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f23721g;
            try {
                if (i11 == 0) {
                    Sc.s.b(obj);
                    u0Var = u0.this;
                    dVar = u0Var.f23712c;
                    this.f23718d = dVar;
                    this.f23719e = u0Var;
                    j11 = this.f23723i;
                    this.f23720f = j11;
                    this.f23721g = 1;
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC3394a = this.f23718d;
                        try {
                            Sc.s.b(obj);
                            Unit unit = Unit.f71690a;
                            interfaceC3394a.c(null);
                            return Unit.f71690a;
                        } catch (Throwable th2) {
                            th = th2;
                            Throwable th3 = th;
                            interfaceC3394a.c(null);
                            throw th3;
                        }
                    }
                    j11 = this.f23720f;
                    u0Var = this.f23719e;
                    ?? r32 = this.f23718d;
                    Sc.s.b(obj);
                    dVar = r32;
                }
                u0Var.f23713d = UserData.copy$default(u0Var.f23713d, 0, j11, null, null, null, 29, null);
                InterfaceC5031a interfaceC5031a = u0Var.f23710a;
                UserData userData = u0Var.f23713d;
                this.f23718d = dVar;
                this.f23719e = null;
                this.f23721g = 2;
                if (interfaceC5031a.a(userData, this) != aVar) {
                    interfaceC3394a = dVar;
                    Unit unit2 = Unit.f71690a;
                    interfaceC3394a.c(null);
                    return Unit.f71690a;
                }
                return aVar;
            } catch (Throwable th4) {
                th = th4;
                interfaceC3394a = dVar;
                Throwable th32 = th;
                interfaceC3394a.c(null);
                throw th32;
            }
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.UserDataController$setUserId$1", f = "UserDataController.kt", l = {91, 63}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        InterfaceC3394a f23724d;

        /* renamed from: e, reason: collision with root package name */
        u0 f23725e;

        /* renamed from: f, reason: collision with root package name */
        String f23726f;

        /* renamed from: g, reason: collision with root package name */
        int f23727g;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f23729i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f23729i = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return u0.this.new c(this.f23729i, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
        
            if (r6.a(r4, r17) == r0) goto L21;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [Je.a] */
        /* JADX WARN: Type inference failed for: r2v4, types: [Je.a] */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC3394a interfaceC3394a;
            u0 u0Var;
            String str;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            ?? r22 = this.f23727g;
            try {
                if (r22 == 0) {
                    Sc.s.b(obj);
                    u0 u0Var2 = u0.this;
                    interfaceC3394a = u0Var2.f23712c;
                    this.f23724d = interfaceC3394a;
                    this.f23725e = u0Var2;
                    String str2 = this.f23729i;
                    this.f23726f = str2;
                    this.f23727g = 1;
                    if (interfaceC3394a.a(this) != aVar) {
                        u0Var = u0Var2;
                        str = str2;
                    }
                    return aVar;
                }
                if (r22 != 1) {
                    if (r22 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InterfaceC3394a interfaceC3394a2 = this.f23724d;
                    Sc.s.b(obj);
                    r22 = interfaceC3394a2;
                    Unit unit = Unit.f71690a;
                    r22.c(null);
                    return Unit.f71690a;
                }
                String str3 = this.f23726f;
                u0Var = this.f23725e;
                interfaceC3394a = this.f23724d;
                Sc.s.b(obj);
                str = str3;
                InterfaceC3394a interfaceC3394a3 = interfaceC3394a;
                u0Var.f23713d = UserData.copy$default(u0Var.f23713d, 0, 0L, str, null, null, 27, null);
                InterfaceC5031a interfaceC5031a = u0Var.f23710a;
                UserData userData = u0Var.f23713d;
                this.f23724d = interfaceC3394a3;
                this.f23725e = null;
                this.f23726f = null;
                this.f23727g = 2;
                r22 = interfaceC3394a3;
            } catch (Throwable th2) {
                r22.c(null);
                throw th2;
            }
        }
    }

    public u0(@NotNull InterfaceC5031a userRepository, @NotNull xe.M trackerScope) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(trackerScope, "trackerScope");
        this.f23710a = userRepository;
        this.f23711b = trackerScope;
        this.f23712c = new Je.d(false);
        this.f23713d = new UserData(0, 0L, "", 0, "");
        C10727i.c(trackerScope, null, null, new a(null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        v0 v0Var;
        int i11;
        u0 u0Var;
        Je.d dVar;
        try {
            if (cVar instanceof v0) {
                v0Var = (v0) cVar;
                int i12 = v0Var.f23735h;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    v0Var.f23735h = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = v0Var.f23733f;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = v0Var.f23735h;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        Je.d dVar2 = this.f23712c;
                        v0Var.f23731d = this;
                        v0Var.f23732e = dVar2;
                        v0Var.f23735h = 1;
                        if (dVar2.a(v0Var) == aVar) {
                            return aVar;
                        }
                        u0Var = this;
                        dVar = dVar2;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        dVar = v0Var.f23732e;
                        u0Var = v0Var.f23731d;
                        Sc.s.b(obj);
                    }
                    return u0Var.f23713d;
                }
            }
            return u0Var.f23713d;
        } finally {
            dVar.c(null);
        }
        v0Var = new v0(this, cVar);
        Object obj2 = v0Var.f23733f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = v0Var.f23735h;
        if (i11 != 0) {
        }
    }

    public final void f(long j11) {
        C10727i.c(this.f23711b, null, null, new b(j11, null), 3);
    }

    public final void g(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        C10727i.c(this.f23711b, null, null, new c(userId, null), 3);
    }
}
