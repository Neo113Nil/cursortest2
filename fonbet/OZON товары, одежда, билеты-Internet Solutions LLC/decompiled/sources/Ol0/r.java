package Ol0;

import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.C10727i;
import xe.M;
import xe.U;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.data.source.IPCClientsDataSource$getOrUpdate$2", f = "IPCClientsDataSource.kt", l = {72, 41}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class r extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Rl0.a>, Object> {

    /* renamed from: d, reason: collision with root package name */
    public Je.d f20513d;

    /* renamed from: e, reason: collision with root package name */
    public o f20514e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f20515f;

    /* renamed from: g, reason: collision with root package name */
    public int f20516g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f20517h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f20518i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f20519j;

    @kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.data.source.IPCClientsDataSource$getOrUpdate$2$2$ipcClientsNotNull$1", f = "IPCClientsDataSource.kt", l = {DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
    public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Rl0.a>, Object> {

        /* renamed from: d, reason: collision with root package name */
        public int f20520d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ o f20521e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f20521e = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f20521e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Rl0.a> dVar) {
            return new a(this.f20521e, dVar).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f20520d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            this.f20520d = 1;
            Object a11 = o.a(this.f20521e, this);
            return a11 == aVar ? aVar : a11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(o oVar, boolean z11, kotlin.coroutines.d<? super r> dVar) {
        super(2, dVar);
        this.f20518i = oVar;
        this.f20519j = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        r rVar = new r(this.f20518i, this.f20519j, dVar);
        rVar.f20517h = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Rl0.a> dVar) {
        return ((r) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        Je.d dVar;
        boolean z11;
        o oVar;
        U<Rl0.a> u11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f20516g;
        try {
            if (i11 == 0) {
                Sc.s.b(obj);
                m11 = (M) this.f20517h;
                if (this.f20518i.f20505e != null && !this.f20519j) {
                    u11 = this.f20518i.f20505e;
                    if (u11 == null) {
                        throw new IllegalStateException("Something went wrong, deferred is null");
                    }
                    this.f20517h = null;
                    this.f20513d = null;
                    this.f20514e = null;
                    this.f20516g = 2;
                    Object s11 = u11.s(this);
                    return s11 != aVar ? aVar : s11;
                }
                o oVar2 = this.f20518i;
                dVar = oVar2.f20506f;
                z11 = this.f20519j;
                this.f20517h = m11;
                this.f20513d = dVar;
                this.f20514e = oVar2;
                this.f20515f = z11;
                this.f20516g = 1;
                if (dVar.a(this) != aVar) {
                    oVar = oVar2;
                }
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            z11 = this.f20515f;
            oVar = this.f20514e;
            dVar = this.f20513d;
            m11 = (M) this.f20517h;
            Sc.s.b(obj);
            if (oVar.f20505e == null || z11) {
                u11 = C10727i.a(m11, null, null, new a(oVar, null), 3);
                oVar.f20505e = u11;
            } else {
                u11 = oVar.f20505e;
                if (u11 == null) {
                    throw new IllegalStateException("Something went wrong, deferred is null");
                }
            }
            this.f20517h = null;
            this.f20513d = null;
            this.f20514e = null;
            this.f20516g = 2;
            Object s112 = u11.s(this);
            if (s112 != aVar) {
            }
        } finally {
            dVar.c(null);
        }
    }
}
