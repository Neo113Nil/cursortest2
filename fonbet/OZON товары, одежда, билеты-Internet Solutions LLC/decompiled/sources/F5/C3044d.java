package F5;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10727i;
import xe.E0;
import xe.M;
import xe.N0;

@kotlin.coroutines.jvm.internal.e(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2", f = "LottieAnimatable.kt", l = {269}, m = "invokeSuspend")
/* renamed from: F5.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3044d extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f9008d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ g f9009e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f9010f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ float f9011g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ B5.g f9012h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ float f9013i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ n f9014j;

    @kotlin.coroutines.jvm.internal.e(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1", f = "LottieAnimatable.kt", l = {277}, m = "invokeSuspend")
    /* renamed from: F5.d$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f9015d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ n f9016e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ B0 f9017f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f9018g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ g f9019h;

        /* renamed from: F5.d$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0190a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f9020a;

            static {
                int[] iArr = new int[n.values().length];
                try {
                    iArr[n.OnIterationFinish.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f9020a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n nVar, B0 b02, int i11, g gVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f9016e = nVar;
            this.f9017f = b02;
            this.f9018g = i11;
            this.f9019h = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f9016e, this.f9017f, this.f9018g, this.f9019h, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            /*
                r4 = this;
                Wc.a r0 = Wc.a.COROUTINE_SUSPENDED
                int r1 = r4.f9015d
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                Sc.s.b(r5)
                goto L5a
            Ld:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L15:
                Sc.s.b(r5)
            L18:
                int[] r5 = F5.C3044d.a.C0190a.f9020a
                F5.n r1 = r4.f9016e
                int r1 = r1.ordinal()
                r5 = r5[r1]
                if (r5 != r2) goto L2c
                xe.B0 r5 = r4.f9017f
                boolean r5 = r5.isActive()
                if (r5 == 0) goto L2e
            L2c:
                r5 = r2
                goto L30
            L2e:
                int r5 = r4.f9018g
            L30:
                r4.f9015d = r2
                F5.g r1 = r4.f9019h
                r1.getClass()
                r3 = 2147483647(0x7fffffff, float:NaN)
                if (r5 != r3) goto L46
                F5.e r3 = new F5.e
                r3.<init>(r1, r5)
                java.lang.Object r5 = m0.M.a(r3, r4)
                goto L57
            L46:
                F5.f r3 = new F5.f
                r3.<init>(r1, r5)
                kotlin.coroutines.CoroutineContext r5 = r4.getContext()
                S0.f0 r5 = S0.C3961h0.a(r5)
                java.lang.Object r5 = r5.v(r3, r4)
            L57:
                if (r5 != r0) goto L5a
                return r0
            L5a:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 != 0) goto L18
                kotlin.Unit r5 = kotlin.Unit.f71690a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: F5.C3044d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: F5.d$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9021a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.OnIterationFinish.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.Immediately.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9021a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3044d(g gVar, int i11, float f7, B5.g gVar2, float f11, n nVar, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.f9009e = gVar;
        this.f9010f = i11;
        this.f9011g = f7;
        this.f9012h = gVar2;
        this.f9013i = f11;
        this.f9014j = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
        return new C3044d(this.f9009e, this.f9010f, this.f9011g, this.f9012h, this.f9013i, this.f9014j, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((C3044d) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        CoroutineContext coroutineContext;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f9008d;
        g gVar = this.f9009e;
        try {
            if (i11 == 0) {
                Sc.s.b(obj);
                g.s(gVar, this.f9010f);
                g.v(gVar);
                g.y(gVar);
                float f7 = this.f9011g;
                g.z(gVar, f7);
                g.m(gVar);
                B5.g gVar2 = this.f9012h;
                g.o(gVar, gVar2);
                gVar.E(this.f9013i);
                g.A(gVar);
                g.w(gVar);
                if (gVar2 == null) {
                    g.x(gVar, false);
                    return Unit.f71690a;
                }
                if (Float.isInfinite(f7)) {
                    gVar.E(g.b(gVar));
                    g.x(gVar, false);
                    g.s(gVar, 1);
                    return Unit.f71690a;
                }
                g.x(gVar, true);
                int i12 = b.f9021a[this.f9014j.ordinal()];
                if (i12 == 1) {
                    coroutineContext = N0.f105411a;
                } else {
                    if (i12 != 2) {
                        throw new Sc.o();
                    }
                    coroutineContext = kotlin.coroutines.g.f71771a;
                }
                a aVar2 = new a(this.f9014j, E0.g(getContext()), this.f9010f, this.f9009e, null);
                this.f9008d = 1;
                if (C10727i.f(coroutineContext, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
            E0.f(getContext());
            g.x(gVar, false);
            return Unit.f71690a;
        } catch (Throwable th2) {
            g.x(gVar, false);
            throw th2;
        }
    }
}
