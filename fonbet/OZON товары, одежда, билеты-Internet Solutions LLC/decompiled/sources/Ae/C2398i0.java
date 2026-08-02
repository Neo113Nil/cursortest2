package Ae;

import Ae.I0;
import Be.AbstractC2630b;
import De.C2857A;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {210, 214, ModuleDescriptor.MODULE_VERSION, 221}, m = "invokeSuspend")
/* renamed from: Ae.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2398i0 extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f999d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ I0 f1000e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h<Object> f1001f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC2630b f1002g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Object f1003h;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Ae.i0$a */
    /* loaded from: classes10.dex */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<Integer, kotlin.coroutines.d<? super Boolean>, Object> {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ int f1004d;

        a() {
            super(2, null);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(2, dVar);
            aVar.f1004d = ((Number) obj).intValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((a) create(Integer.valueOf(num.intValue()), dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            return Boolean.valueOf(this.f1004d > 0);
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {223}, m = "invokeSuspend")
    /* renamed from: Ae.i0$b */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<G0, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f1005d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f1006e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h<Object> f1007f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AbstractC2630b f1008g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Object f1009h;

        /* renamed from: Ae.i0$b$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f1010a;

            static {
                int[] iArr = new int[G0.values().length];
                try {
                    iArr[G0.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[G0.STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[G0.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f1010a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(InterfaceC2395h<Object> interfaceC2395h, w0<Object> w0Var, Object obj, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f1007f = interfaceC2395h;
            this.f1008g = (AbstractC2630b) w0Var;
            this.f1009h = obj;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Ae.w0, Be.b] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f1007f, this.f1008g, this.f1009h, dVar);
            bVar.f1006e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(G0 g02, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(g02, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [Ae.i, Ae.w0, Be.b] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f1005d;
            if (i11 == 0) {
                Sc.s.b(obj);
                int i12 = a.f1010a[((G0) this.f1006e).ordinal()];
                ?? r12 = this.f1008g;
                if (i12 == 1) {
                    this.f1005d = 1;
                    if (this.f1007f.collect(r12, this) == aVar) {
                        return aVar;
                    }
                } else if (i12 != 2) {
                    if (i12 != 3) {
                        throw new Sc.o();
                    }
                    C2857A c2857a = E0.f797a;
                    Object obj2 = this.f1009h;
                    if (obj2 == c2857a) {
                        r12.resetReplayCache();
                    } else {
                        r12.tryEmit(obj2);
                    }
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
    /* JADX WARN: Multi-variable type inference failed */
    C2398i0(I0 i02, InterfaceC2395h<Object> interfaceC2395h, w0<Object> w0Var, Object obj, kotlin.coroutines.d<? super C2398i0> dVar) {
        super(2, dVar);
        this.f1000e = i02;
        this.f1001f = interfaceC2395h;
        this.f1002g = (AbstractC2630b) w0Var;
        this.f1003h = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [Ae.w0, Be.b] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C2398i0(this.f1000e, this.f1001f, this.f1002g, this.f1003h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C2398i0) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        if (r7.collect(r2, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r7.collect(r2, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (Ae.C2399j.v(r9, r1, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (Ae.C2399j.h(r9, r1, r8) == r0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [Ae.i, Ae.w0, Be.b] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f999d;
        ?? r22 = this.f1002g;
        InterfaceC2395h<Object> interfaceC2395h = this.f1001f;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    Sc.s.b(obj);
                    this.f999d = 3;
                } else if (i11 != 3 && i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            Sc.s.b(obj);
            return Unit.f71690a;
        }
        Sc.s.b(obj);
        int i12 = I0.f818a;
        I0 c11 = I0.a.c();
        I0 i02 = this.f1000e;
        if (i02 == c11) {
            this.f999d = 1;
        } else if (i02 == I0.a.d()) {
            M0<Integer> subscriptionCount = r22.getSubscriptionCount();
            a aVar2 = new a();
            this.f999d = 2;
        } else {
            InterfaceC2395h a11 = C2423x.a(i02.a(r22.getSubscriptionCount()));
            b bVar = new b(interfaceC2395h, r22, this.f1003h, null);
            this.f999d = 4;
        }
        return aVar;
    }
}
