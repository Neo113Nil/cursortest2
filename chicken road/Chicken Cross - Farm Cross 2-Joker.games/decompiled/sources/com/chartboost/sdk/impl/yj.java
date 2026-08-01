package com.chartboost.sdk.impl;

import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

/* loaded from: classes4.dex */
public final class yj {

    /* renamed from: a, reason: collision with root package name */
    public final b f5095a;
    public float b;
    public final CoroutineDispatcher c;
    public final Lazy d;
    public long e;
    public long f;
    public Job g;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function3 {
        public static final a b = new a();

        public a() {
            super(3, zj.class, "createRandomAccessFile", "createRandomAccessFile(Lcom/chartboost/sdk/internal/video/VideoAsset;Lcom/chartboost/sdk/internal/video/TempFileDownloadHelper;Lcom/chartboost/sdk/internal/Libraries/FileCache;)Lcom/chartboost/sdk/internal/utils/RandomAccessFileWrapper;", 1);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final jf invoke(wj p0, nh p1, k8 k8Var) {
            jf b2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            b2 = zj.b(p0, p1, k8Var);
            return b2;
        }
    }

    public interface b {
        void b();
    }

    public static final class c extends SuspendLambda implements Function2 {
        public int b;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return yj.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.b = 1;
                if (DelayKt.delay(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.m, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            yj.this.b();
            return Unit.INSTANCE;
        }
    }

    public yj(final wj videoAsset, b listener, float f, final nh tempHelper, final k8 k8Var, CoroutineDispatcher coroutineDispatcher, final Function3 randomAccessFileFactory) {
        Intrinsics.checkNotNullParameter(videoAsset, "videoAsset");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(tempHelper, "tempHelper");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        Intrinsics.checkNotNullParameter(randomAccessFileFactory, "randomAccessFileFactory");
        this.f5095a = listener;
        this.b = f;
        this.c = coroutineDispatcher;
        this.d = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.yj$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return yj.a(Function3.this, videoAsset, tempHelper, k8Var);
            }
        });
        this.e = videoAsset.c();
    }

    public final void b() {
        jf d = d();
        long c2 = d != null ? d.c() : 0L;
        long j = this.e;
        if (c2 == j) {
            f();
        } else if ((c2 - this.f) / j > this.b) {
            f();
        } else {
            c();
        }
    }

    public final void c() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.c), null, null, new c(null), 3, null);
        this.g = launch$default;
    }

    public final jf d() {
        return (jf) this.d.getValue();
    }

    public final void e() {
        Job job = this.g;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.g = null;
    }

    public final void f() {
        this.f = 0L;
        e();
        this.f5095a.b();
    }

    public static final jf a(Function3 function3, wj wjVar, nh nhVar, k8 k8Var) {
        return (jf) function3.invoke(wjVar, nhVar, k8Var);
    }

    public final void a() {
        if (this.f == 0) {
            jf d = d();
            this.f = d != null ? d.c() : 0L;
        }
    }

    public final void a(int i) {
        long j = this.e;
        if (j <= 0 || i <= 0) {
            return;
        }
        float f = j / 1000000.0f;
        this.b = ((f / 1000.0f) / ((i / 60000.0f) * 0.0075f)) / (f * 8);
    }

    public /* synthetic */ yj(wj wjVar, b bVar, float f, nh nhVar, k8 k8Var, CoroutineDispatcher coroutineDispatcher, Function3 function3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wjVar, bVar, (i & 4) != 0 ? 0.01f : f, (i & 8) != 0 ? new nh() : nhVar, k8Var, (i & 32) != 0 ? Dispatchers.getMain() : coroutineDispatcher, (i & 64) != 0 ? a.b : function3);
    }
}
