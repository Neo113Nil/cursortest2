package Be;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import fd.InterfaceC6511n;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import xe.B0;
import xe.C10727i;
import xe.M;
import xe.N;
import xe.O;
import ze.EnumC11113a;

/* loaded from: classes.dex */
public final class m<T, R> extends k<T, R> {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlin.coroutines.jvm.internal.j f3601e;

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {23}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f3602d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f3603e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ m<T, R> f3604f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i<R> f3605g;

        /* renamed from: Be.m$a$a, reason: collision with other inner class name */
        static final class C0089a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.M<B0> f3606a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ M f3607b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ m<T, R> f3608c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC2397i<R> f3609d;

            @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {AppUpdateInfo.Factory.DAYS_BETWEEN_30}, m = "invokeSuspend")
            /* renamed from: Be.m$a$a$a, reason: collision with other inner class name */
            static final class C0090a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

                /* renamed from: d, reason: collision with root package name */
                int f3610d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ m<T, R> f3611e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ InterfaceC2397i<R> f3612f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ T f3613g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0090a(m<T, R> mVar, InterfaceC2397i<? super R> interfaceC2397i, T t2, kotlin.coroutines.d<? super C0090a> dVar) {
                    super(2, dVar);
                    this.f3611e = mVar;
                    this.f3612f = interfaceC2397i;
                    this.f3613g = t2;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C0090a(this.f3611e, this.f3612f, this.f3613g, dVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0090a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    int i11 = this.f3610d;
                    if (i11 == 0) {
                        Sc.s.b(obj);
                        InterfaceC6511n interfaceC6511n = ((m) this.f3611e).f3601e;
                        this.f3610d = 1;
                        if (interfaceC6511n.invoke(this.f3612f, this.f3613g, this) == aVar) {
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

            @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER}, m = "emit")
            /* renamed from: Be.m$a$a$b */
            static final class b extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: d, reason: collision with root package name */
                Object f3614d;

                /* renamed from: e, reason: collision with root package name */
                Object f3615e;

                /* renamed from: f, reason: collision with root package name */
                B0 f3616f;

                /* renamed from: g, reason: collision with root package name */
                /* synthetic */ Object f3617g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ C0089a<T> f3618h;

                /* renamed from: i, reason: collision with root package name */
                int f3619i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(C0089a<? super T> c0089a, kotlin.coroutines.d<? super b> dVar) {
                    super(dVar);
                    this.f3618h = c0089a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f3617g = obj;
                    this.f3619i |= LinearLayoutManager.INVALID_OFFSET;
                    return this.f3618h.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0089a(kotlin.jvm.internal.M<B0> m11, M m12, m<T, R> mVar, InterfaceC2397i<? super R> interfaceC2397i) {
                this.f3606a = m11;
                this.f3607b = m12;
                this.f3608c = mVar;
                this.f3609d = interfaceC2397i;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // Ae.InterfaceC2397i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                b bVar;
                int i11;
                C0089a<T> c0089a;
                if (dVar instanceof b) {
                    bVar = (b) dVar;
                    int i12 = bVar.f3619i;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        bVar.f3619i = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj = bVar.f3617g;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = bVar.f3619i;
                        if (i11 != 0) {
                            Sc.s.b(obj);
                            B0 b02 = this.f3606a.f71787a;
                            if (b02 != null) {
                                b02.j(new o());
                                bVar.f3614d = this;
                                bVar.f3615e = t2;
                                bVar.f3616f = b02;
                                bVar.f3619i = 1;
                                if (b02.r0(bVar) == aVar) {
                                    return aVar;
                                }
                            }
                            c0089a = this;
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t2 = (T) bVar.f3615e;
                            c0089a = (C0089a) bVar.f3614d;
                            Sc.s.b(obj);
                        }
                        c0089a.f3606a.f71787a = (T) C10727i.c(c0089a.f3607b, null, O.UNDISPATCHED, new C0090a(c0089a.f3608c, c0089a.f3609d, t2, null), 1);
                        return Unit.f71690a;
                    }
                }
                bVar = new b(this, dVar);
                Object obj2 = bVar.f3617g;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f3619i;
                if (i11 != 0) {
                }
                c0089a.f3606a.f71787a = (T) C10727i.c(c0089a.f3607b, null, O.UNDISPATCHED, new C0090a(c0089a.f3608c, c0089a.f3609d, t2, null), 1);
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(m<T, R> mVar, InterfaceC2397i<? super R> interfaceC2397i, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f3604f = mVar;
            this.f3605g = interfaceC2397i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f3604f, this.f3605g, dVar);
            aVar.f3603e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f3602d;
            if (i11 == 0) {
                Sc.s.b(obj);
                M m11 = (M) this.f3603e;
                kotlin.jvm.internal.M m12 = new kotlin.jvm.internal.M();
                m<T, R> mVar = this.f3604f;
                InterfaceC2395h<S> interfaceC2395h = mVar.f3600d;
                C0089a c0089a = new C0089a(m12, m11, mVar, this.f3605g);
                this.f3602d = 1;
                if (interfaceC2395h.collect(c0089a, this) == aVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public m(@NotNull InterfaceC6511n<? super InterfaceC2397i<? super R>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6511n, @NotNull InterfaceC2395h<? extends T> interfaceC2395h, @NotNull CoroutineContext coroutineContext, int i11, @NotNull EnumC11113a enumC11113a) {
        super(i11, interfaceC2395h, coroutineContext, enumC11113a);
        this.f3601e = (kotlin.coroutines.jvm.internal.j) interfaceC6511n;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [fd.n, kotlin.coroutines.jvm.internal.j] */
    @Override // Be.AbstractC2635g
    @NotNull
    protected final AbstractC2635g<R> e(@NotNull CoroutineContext coroutineContext, int i11, @NotNull EnumC11113a enumC11113a) {
        return new m(this.f3601e, this.f3600d, coroutineContext, i11, enumC11113a);
    }

    @Override // Be.k
    protected final Object h(@NotNull InterfaceC2397i<? super R> interfaceC2397i, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object d11 = N.d(new a(this, interfaceC2397i, null), dVar);
        return d11 == Wc.a.COROUTINE_SUSPENDED ? d11 : Unit.f71690a;
    }
}
