package Fb0;

import Kb0.K;
import id0.C7050a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import nd0.C8578a;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.core.OzonIdInitializerKt$checkSDKInitTime$1", f = "OzonIdInitializer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class j extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f9258d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f9259e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ K f9260f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f9261g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ long f9262h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ i f9263i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ g f9264j;

    static final class a extends AbstractC7737t implements Function0<String> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f9265b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f9266c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f9267d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ K f9268e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f9269f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ i f9270g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ g f9271h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j11, long j12, long j13, long j14, g gVar, i iVar, K k11) {
            super(0);
            this.f9265b = j11;
            this.f9266c = j12;
            this.f9267d = j13;
            this.f9268e = k11;
            this.f9269f = j14;
            this.f9270g = iVar;
            this.f9271h = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            long j11 = this.f9265b;
            long j12 = this.f9266c;
            long j13 = j11 - j12;
            long j14 = this.f9267d - j12;
            C8578a value = this.f9268e.Q().getValue();
            i iVar = this.f9270g;
            long d11 = iVar.d();
            long a11 = iVar.a();
            long c11 = iVar.c();
            long b11 = iVar.b();
            g gVar = this.f9271h;
            return value.f(j14, this.f9269f, j13, d11, a11, c11, b11, gVar.a(), gVar.b());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(long j11, long j12, K k11, long j13, long j14, i iVar, g gVar, kotlin.coroutines.d<? super j> dVar) {
        super(2, dVar);
        this.f9258d = j11;
        this.f9259e = j12;
        this.f9260f = k11;
        this.f9261g = j13;
        this.f9262h = j14;
        this.f9263i = iVar;
        this.f9264j = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new j(this.f9258d, this.f9259e, this.f9260f, this.f9261g, this.f9262h, this.f9263i, this.f9264j, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        long j11 = this.f9258d - this.f9259e;
        K k11 = this.f9260f;
        C7050a value = k11.a0().getValue();
        long j12 = this.f9262h;
        value.c(new a(this.f9261g, this.f9259e, j12, j11, this.f9264j, this.f9263i, k11));
        return Unit.f71690a;
    }
}
