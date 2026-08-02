package Ae;

import com.google.android.gms.wallet.WalletConstants;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.d1;
import ze.l;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", l = {WalletConstants.ERROR_CODE_UNKNOWN}, m = "invokeSuspend")
/* renamed from: Ae.t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C2418t extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<xe.M, InterfaceC2397i<Object>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    long f1140d;

    /* renamed from: e, reason: collision with root package name */
    int f1141e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f1142f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f1143g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ long f1144h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h<Object> f1145i;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", l = {395}, m = "invokeSuspend")
    /* renamed from: Ae.t$a */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<ze.l<Object>, kotlin.coroutines.d<? super Boolean>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f1146d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f1147e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i<Object> f1148f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC2397i<Object> interfaceC2397i, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f1148f = interfaceC2397i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f1148f, dVar);
            aVar.f1147e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ze.l<Object> lVar, kotlin.coroutines.d<? super Boolean> dVar) {
            return ((a) create(ze.l.b(lVar.e()), dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object e11;
            Object obj2;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f1146d;
            if (i11 == 0) {
                Sc.s.b(obj);
                e11 = ((ze.l) this.f1147e).e();
                if (!(e11 instanceof l.b)) {
                    this.f1147e = e11;
                    this.f1146d = 1;
                    if (this.f1148f.emit(e11, this) == aVar) {
                        return aVar;
                    }
                    obj2 = e11;
                }
                if (e11 instanceof l.a) {
                    return Boolean.TRUE;
                }
                Throwable c11 = ze.l.c(e11);
                if (c11 == null) {
                    return Boolean.FALSE;
                }
                throw c11;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.f1147e;
            Sc.s.b(obj);
            e11 = obj2;
            if (e11 instanceof l.a) {
            }
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Ae.t$b */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<?>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f1149d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j11, kotlin.coroutines.d<? super b> dVar) {
            super(1, dVar);
            this.f1149d = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new b(this.f1149d, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<?> dVar) {
            ((b) create(dVar)).invokeSuspend(Unit.f71690a);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            throw new d1("Timed out waiting for " + ((Object) kotlin.time.b.p(this.f1149d)), null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2418t(long j11, InterfaceC2395h<Object> interfaceC2395h, kotlin.coroutines.d<? super C2418t> dVar) {
        super(3, dVar);
        this.f1144h = j11;
        this.f1145i = interfaceC2395h;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(xe.M m11, InterfaceC2397i<Object> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        C2418t c2418t = new C2418t(this.f1144h, this.f1145i, dVar);
        c2418t.f1142f = m11;
        c2418t.f1143g = interfaceC2397i;
        return c2418t.invokeSuspend(Unit.f71690a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0095 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0093 -> B:5:0x0096). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            Wc.a r1 = Wc.a.COROUTINE_SUSPENDED
            int r2 = r0.f1141e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L25
            if (r2 != r4) goto L1d
            long r5 = r0.f1140d
            java.lang.Object r2 = r0.f1143g
            ze.w r2 = (ze.w) r2
            java.lang.Object r7 = r0.f1142f
            Ae.i r7 = (Ae.InterfaceC2397i) r7
            Sc.s.b(r20)
            r8 = r20
            goto L96
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L25:
            Sc.s.b(r20)
            java.lang.Object r2 = r0.f1142f
            xe.M r2 = (xe.M) r2
            java.lang.Object r5 = r0.f1143g
            Ae.i r5 = (Ae.InterfaceC2397i) r5
            kotlin.time.b$a r6 = kotlin.time.b.INSTANCE
            r6.getClass()
            long r6 = r0.f1144h
            r8 = 0
            int r8 = kotlin.time.b.f(r6, r8)
            if (r8 <= 0) goto La1
            Ae.h<java.lang.Object> r8 = r0.f1145i
            r9 = 0
            r10 = 2
            Ae.h r12 = Ae.C2399j.d(r8, r9, r10)
            boolean r8 = r12 instanceof Be.AbstractC2635g
            if (r8 == 0) goto L4f
            r8 = r12
            Be.g r8 = (Be.AbstractC2635g) r8
            goto L50
        L4f:
            r8 = r3
        L50:
            if (r8 != 0) goto L5d
            Be.l r11 = new Be.l
            r13 = 0
            r16 = 14
            r14 = 0
            r15 = 0
            r11.<init>(r12, r13, r14, r15, r16)
            r8 = r11
        L5d:
            ze.w r2 = r8.g(r2)
            r17 = r6
            r7 = r5
            r5 = r17
        L66:
            Ie.h r8 = new Ie.h
            kotlin.coroutines.CoroutineContext r9 = r0.getContext()
            r8.<init>(r9)
            Ie.f r9 = r2.c()
            Ae.t$a r10 = new Ae.t$a
            r10.<init>(r7, r3)
            r8.m(r9, r10)
            Ae.t$b r9 = new Ae.t$b
            r9.<init>(r5, r3)
            long r10 = xe.Y.e(r5)
            Ie.d.a(r8, r10, r9)
            r0.f1142f = r7
            r0.f1143g = r2
            r0.f1140d = r5
            r0.f1141e = r4
            java.lang.Object r8 = r8.i(r0)
            if (r8 != r1) goto L96
            return r1
        L96:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L66
            kotlin.Unit r1 = kotlin.Unit.f71690a
            return r1
        La1:
            xe.d1 r1 = new xe.d1
            java.lang.String r2 = "Timed out immediately"
            r1.<init>(r2, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ae.C2418t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
