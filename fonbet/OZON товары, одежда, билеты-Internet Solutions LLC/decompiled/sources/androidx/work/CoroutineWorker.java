package androidx.work;

import B90.g0;
import De.C2862e;
import android.content.Context;
import androidx.work.n;
import i5.C7009b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;
import xe.D0;
import xe.E0;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/n;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final D0 f45232a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.work.impl.utils.futures.c<n.a> f45233b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final He.c f45234c;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
    /* loaded from: classes8.dex */
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        m f45235d;

        /* renamed from: e, reason: collision with root package name */
        int f45236e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ m<h> f45237f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ CoroutineWorker f45238g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m<h> mVar, CoroutineWorker coroutineWorker, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f45237f = mVar;
            this.f45238g = coroutineWorker;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f45237f, this.f45238g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f45236e;
            if (i11 == 0) {
                Sc.s.b(obj);
                this.f45235d = this.f45237f;
                this.f45236e = 1;
                throw new IllegalStateException("Not implemented");
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m mVar = this.f45235d;
            Sc.s.b(obj);
            mVar.c(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {68}, m = "invokeSuspend")
    /* loaded from: classes8.dex */
    static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f45239d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return CoroutineWorker.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f45239d;
            CoroutineWorker coroutineWorker = CoroutineWorker.this;
            try {
                if (i11 == 0) {
                    Sc.s.b(obj);
                    this.f45239d = 1;
                    obj = coroutineWorker.b(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                coroutineWorker.c().j((n.a) obj);
            } catch (Throwable th2) {
                coroutineWorker.c().l(th2);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f45232a = E0.a();
        androidx.work.impl.utils.futures.c<n.a> k11 = androidx.work.impl.utils.futures.c.k();
        Intrinsics.checkNotNullExpressionValue(k11, "create()");
        this.f45233b = k11;
        k11.a(new g0(this, 2), ((C7009b) getTaskExecutor()).c());
        this.f45234c = C10720e0.a();
    }

    public static void a(CoroutineWorker this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f45233b.isCancelled()) {
            this$0.f45232a.j(null);
        }
    }

    public abstract Object b(@NotNull kotlin.coroutines.jvm.internal.c cVar);

    @NotNull
    public final androidx.work.impl.utils.futures.c<n.a> c() {
        return this.f45233b;
    }

    @Override // androidx.work.n
    @NotNull
    public final com.google.common.util.concurrent.m<h> getForegroundInfoAsync() {
        D0 a11 = E0.a();
        C2862e a12 = N.a(this.f45234c.plus(a11));
        m mVar = new m(a11);
        C10727i.c(a12, null, null, new a(mVar, this, null), 3);
        return mVar;
    }

    @Override // androidx.work.n
    public final void onStopped() {
        super.onStopped();
        this.f45233b.cancel(false);
    }

    @Override // androidx.work.n
    @NotNull
    public final com.google.common.util.concurrent.m<n.a> startWork() {
        C10727i.c(N.a(this.f45234c.plus(this.f45232a)), null, null, new b(null), 3);
        return this.f45233b;
    }
}
