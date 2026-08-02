package J4;

import Ae.C2399j;
import Ae.InterfaceC2397i;
import J4.p;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;
import xe.M;
import xe.N;
import ze.C11115c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", f = "CoroutinesRoom.kt", l = {111}, m = "invokeSuspend")
/* renamed from: J4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3380b extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC2397i<Object>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f13852d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f13853e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ s f13854f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String[] f13855g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Callable<Object> f13856h;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", f = "CoroutinesRoom.kt", l = {137}, m = "invokeSuspend")
    /* renamed from: J4.b$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f13857d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f13858e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ s f13859f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i<Object> f13860g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String[] f13861h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Callable<Object> f13862i;

        @kotlin.coroutines.jvm.internal.e(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", f = "CoroutinesRoom.kt", l = {UserVerificationMethods.USER_VERIFY_PATTERN, 130}, m = "invokeSuspend")
        /* renamed from: J4.b$a$a, reason: collision with other inner class name */
        static final class C0263a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            ze.j f13863d;

            /* renamed from: e, reason: collision with root package name */
            int f13864e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ s f13865f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C0264b f13866g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ C11115c f13867h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Callable<Object> f13868i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ C11115c f13869j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0263a(s sVar, C0264b c0264b, C11115c c11115c, Callable callable, C11115c c11115c2, kotlin.coroutines.d dVar) {
                super(2, dVar);
                this.f13865f = sVar;
                this.f13866g = c0264b;
                this.f13867h = c11115c;
                this.f13868i = callable;
                this.f13869j = c11115c2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                Callable<Object> callable = this.f13868i;
                C11115c c11115c = this.f13869j;
                return new C0263a(this.f13865f, this.f13866g, this.f13867h, callable, c11115c, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0263a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
            
                if (r6.n(r9, r8) == r0) goto L26;
             */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:9:0x0037, B:15:0x0045, B:17:0x004d, B:25:0x0023, B:27:0x0031), top: B:2:0x000a }] */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0060 -> B:8:0x0015). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(@NotNull Object obj) {
                ze.j it;
                ze.j jVar;
                Object b11;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f13864e;
                C0264b c0264b = this.f13866g;
                s sVar = this.f13865f;
                try {
                    if (i11 == 0) {
                        Sc.s.b(obj);
                        sVar.getInvalidationTracker().a(c0264b);
                        it = this.f13867h.iterator();
                        this.f13863d = it;
                        this.f13864e = 1;
                        b11 = it.b(this);
                        if (b11 != aVar) {
                        }
                    } else if (i11 == 1) {
                        jVar = this.f13863d;
                        Sc.s.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jVar = this.f13863d;
                        Sc.s.b(obj);
                        it = jVar;
                        this.f13863d = it;
                        this.f13864e = 1;
                        b11 = it.b(this);
                        if (b11 != aVar) {
                            return aVar;
                        }
                        jVar = it;
                        obj = b11;
                        if (((Boolean) obj).booleanValue()) {
                            sVar.getInvalidationTracker().i(c0264b);
                            return Unit.f71690a;
                        }
                        jVar.next();
                        Object call = this.f13868i.call();
                        C11115c c11115c = this.f13869j;
                        this.f13863d = jVar;
                        this.f13864e = 2;
                    }
                } catch (Throwable th2) {
                    sVar.getInvalidationTracker().i(c0264b);
                    throw th2;
                }
            }
        }

        /* renamed from: J4.b$a$b, reason: collision with other inner class name */
        public static final class C0264b extends p.c {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C11115c f13870b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0264b(String[] strArr, C11115c c11115c) {
                super(strArr);
                this.f13870b = c11115c;
            }

            @Override // J4.p.c
            public final void b(@NotNull Set<String> set) {
                this.f13870b.b(Unit.f71690a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s sVar, InterfaceC2397i interfaceC2397i, String[] strArr, Callable callable, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f13859f = sVar;
            this.f13860g = interfaceC2397i;
            this.f13861h = strArr;
            this.f13862i = callable;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f13859f, this.f13860g, this.f13861h, this.f13862i, dVar);
            aVar.f13858e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.e a11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f13857d;
            if (i11 == 0) {
                Sc.s.b(obj);
                M m11 = (M) this.f13858e;
                C11115c a12 = ze.k.a(-1, 6, null);
                C0264b c0264b = new C0264b(this.f13861h, a12);
                a12.b(Unit.f71690a);
                B b11 = (B) m11.getCoroutineContext().get(B.f13842c);
                if (b11 == null || (a11 = b11.b()) == null) {
                    a11 = g.a(this.f13859f);
                }
                C11115c a13 = ze.k.a(0, 7, null);
                C10727i.c(m11, a11, null, new C0263a(this.f13859f, c0264b, a12, this.f13862i, a13, null), 2);
                this.f13857d = 1;
                if (C2399j.s(this.f13860g, a13, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3380b(s sVar, String[] strArr, Callable callable, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f13854f = sVar;
        this.f13855g = strArr;
        this.f13856h = callable;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        C3380b c3380b = new C3380b(this.f13854f, this.f13855g, this.f13856h, dVar);
        c3380b.f13853e = obj;
        return c3380b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2397i<Object> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C3380b) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f13852d;
        if (i11 == 0) {
            Sc.s.b(obj);
            InterfaceC2397i interfaceC2397i = (InterfaceC2397i) this.f13853e;
            Callable<Object> callable = this.f13856h;
            a aVar2 = new a(this.f13854f, interfaceC2397i, this.f13855g, callable, null);
            this.f13852d = 1;
            if (N.d(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
