package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.D;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes7.dex */
public final class h implements g {
    public static final int h = 8;

    /* renamed from: a, reason: collision with root package name */
    public final r f11521a;
    public D d;
    public Job e;
    public int f;
    public final String b = "LinearGoNextActionImpl";
    public final CoroutineScope c = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
    public final MutableStateFlow<d.a> g = StateFlowKt.MutableStateFlow(d.a.c.b);

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.LinearGoNextActionImpl$startTimer$1", f = "LinearGoNextAction.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11522a;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.LinearGoNextActionImpl$startTimer$1$1", f = "LinearGoNextAction.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h$a$a, reason: collision with other inner class name */
        public static final class C1611a extends SuspendLambda implements Function2<UInt, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f11523a;
            public /* synthetic */ int b;
            public final /* synthetic */ h c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1611a(h hVar, Continuation<? super C1611a> continuation) {
                super(2, continuation);
                this.c = hVar;
            }

            public final Object a(int i, Continuation<? super Unit> continuation) {
                return ((C1611a) create(UInt.m8170boximpl(i), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C1611a c1611a = new C1611a(this.c, continuation);
                c1611a.b = ((UInt) obj).getData();
                return c1611a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(UInt uInt, Continuation<? super Unit> continuation) {
                return a(uInt.getData(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                d.a b;
                d.a b2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11523a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i = this.b;
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, this.c.b, "Updating countdown to " + ((Object) UInt.m8222toStringimpl(i)), null, false, 12, null);
                this.c.f = i;
                String str = this.c.b;
                StringBuilder sb = new StringBuilder("Propagating state: ");
                b = i.b(i);
                MolocoLogger.info$default(molocoLogger, str, sb.append(b).toString(), null, false, 12, null);
                MutableStateFlow<d.a> l = this.c.l();
                b2 = i.b(i);
                l.setValue(b2);
                return Unit.INSTANCE;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return h.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            StateFlow<UInt> a2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11522a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (h.this.d == null) {
                    h.this.d = new D(h.this.f, h.this.c, null);
                } else {
                    D d = h.this.d;
                    if (d != null) {
                        d.a(h.this.f);
                    }
                }
                D d2 = h.this.d;
                if (d2 != null && (a2 = d2.a()) != null) {
                    C1611a c1611a = new C1611a(h.this, null);
                    this.f11522a = 1;
                    if (FlowKt.collectLatest(a2, c1611a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public h(r rVar) {
        this.f11521a = rVar;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.g
    public void M() {
        l().setValue(d.a.c.b);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public MutableStateFlow<d.a> l() {
        return this.g;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.g
    public void pause() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, this.b, "Canceling timer", null, false, 12, null);
        Job job = this.e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.g
    public void v() {
        int compare;
        compare = Integer.compare(this.f ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE);
        if (compare > 0) {
            a(this.f & 4294967295L);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.g
    public void a(int i, int i2) {
        long b;
        int b2;
        double d = (i / i2) * 100;
        if (i >= i2) {
            l().setValue(d.a.C1608a.b);
            return;
        }
        if (this.f11521a == null) {
            l().setValue(d.a.c.b);
            return;
        }
        if (this.e == null) {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger, this.b, "Starting timer", null, false, 12, null);
            r rVar = this.f11521a;
            if (rVar instanceof r.a) {
                MolocoLogger.info$default(molocoLogger, this.b, "Offset Percents detected", null, false, 12, null);
                b2 = i.b(new IntRange((int) d, ((r.a) this.f11521a).b()), i2);
                a(b2 & 4294967295L);
            } else {
                if (rVar instanceof r.b) {
                    MolocoLogger.info$default(molocoLogger, this.b, "Offset Millis detected", null, false, 12, null);
                    b = i.b(((r.b) this.f11521a).b());
                    a(b);
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void a(long j) {
        boolean b;
        Job launch$default;
        b = i.b(this.e);
        if (b) {
            this.f = UInt.m8176constructorimpl((int) j);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, this.b, "Start timer for duration: " + j + " seconds", null, false, 12, null);
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new a(null), 3, null);
            this.e = launch$default;
        }
    }
}
