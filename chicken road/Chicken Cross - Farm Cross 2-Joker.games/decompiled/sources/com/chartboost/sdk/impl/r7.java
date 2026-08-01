package com.chartboost.sdk.impl;

import androidx.media3.exoplayer.ExoPlayer;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.impl.oe;
import com.chartboost.sdk.impl.p3;
import com.chartboost.sdk.impl.qe;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes4.dex */
public final class r7 {

    /* renamed from: a, reason: collision with root package name */
    public final q7 f4992a;
    public final CoroutineScope b;
    public qe c;
    public Job d;

    public static final class a extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ w6 d;
        public final /* synthetic */ URL e;
        public final /* synthetic */ r7 f;
        public final /* synthetic */ ExoPlayer g;

        /* renamed from: com.chartboost.sdk.impl.r7$a$a, reason: collision with other inner class name */
        public static final class C0218a implements FlowCollector {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ URL f4993a;
            public final /* synthetic */ r7 b;

            public C0218a(URL url, r7 r7Var) {
                this.f4993a = url;
                this.b = r7Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(p3 p3Var, Continuation continuation) {
                if (p3Var instanceof p3.a) {
                    p3.a aVar = (p3.a) p3Var;
                    if (Intrinsics.areEqual(this.f4993a, aVar.b())) {
                        qe b = this.b.b();
                        ExoPlayer a2 = b.a();
                        long currentPosition = a2 != null ? a2.getCurrentPosition() : 0L;
                        ExoPlayer a3 = b.a();
                        long duration = a3 != null ? a3.getDuration() : 0L;
                        String simpleName = Reflection.getOrCreateKotlinClass(b.getClass()).getSimpleName();
                        if (b instanceof qe.e) {
                            mb.b("Video cache eviction during playback: url=" + this.f4993a + ", state=" + simpleName + ", positionMs=" + currentPosition + ", durationMs=" + duration + ", reason=" + aVar.a(), (Throwable) null, 2, (Object) null);
                        } else {
                            mb.e("Video cache eviction: url=" + this.f4993a + ", state=" + simpleName + ", positionMs=" + currentPosition + ", durationMs=" + duration + ", reason=" + aVar.a(), null, 2, null);
                        }
                        this.b.a(oe.c.f4933a);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w6 w6Var, URL url, r7 r7Var, ExoPlayer exoPlayer, Continuation continuation) {
            super(2, continuation);
            this.d = w6Var;
            this.e = url;
            this.f = r7Var;
            this.g = exoPlayer;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.d, this.e, this.f, this.g, continuation);
            aVar.c = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x00f9, code lost:
        
            if (r10.collect(r0, r9) == r1) goto L35;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object a2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            try {
            } catch (ChartboostError.Load e) {
                mb.b("Cache observer error for " + this.e + ": errorCode=" + e.getCode() + ", errorConstant=" + e.getConstant(), e);
                this.f.a(new oe.d(e));
            } catch (CancellationException unused) {
                mb.a("Cache observer for " + this.e + " cancelled.", (Throwable) null, 2, (Object) null);
            } catch (Exception e2) {
                mb.b("Error in cache observer for " + this.e, e2);
                this.f.a(new oe.d(new ChartboostError.Load.AssetUnavailable(this.e.toString(), "Error in cache observer for " + this.e, e2)));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.c;
                w6 w6Var = this.d;
                URL url = this.e;
                this.c = coroutineScope;
                this.b = 1;
                a2 = w6Var.a(url, this);
                if (a2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                coroutineScope = (CoroutineScope) this.c;
                ResultKt.throwOnFailure(obj);
                a2 = ((Result) obj).getValue();
            }
            if (CoroutineScopeKt.isActive(coroutineScope)) {
                if (Result.m8086isSuccessimpl(a2)) {
                    r7 r7Var = this.f;
                    ResultKt.throwOnFailure(a2);
                    r7Var.a(new oe.b((File) a2, this.g));
                } else {
                    Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(a2);
                    if (m8082exceptionOrNullimpl == null) {
                        m8082exceptionOrNullimpl = new IOException("Failed to get video from cache for " + this.e);
                    }
                    mb.b("Video cache retrieval failed: url=" + this.e + ", errorType=" + m8082exceptionOrNullimpl.getClass().getSimpleName() + ", errorMessage=" + m8082exceptionOrNullimpl.getMessage(), (Throwable) null, 2, (Object) null);
                    ChartboostError chartboostError = m8082exceptionOrNullimpl instanceof ChartboostError ? (ChartboostError) m8082exceptionOrNullimpl : null;
                    if (chartboostError == null) {
                        chartboostError = new ChartboostError.Load.AssetUnavailable(this.e.toString(), "Failed to get video from cache for " + this.e, m8082exceptionOrNullimpl);
                    }
                    this.f.a(new oe.d(chartboostError));
                }
            }
            Flow a3 = this.d.a(this.e);
            C0218a c0218a = new C0218a(this.e, this.f);
            this.c = null;
            this.b = 2;
        }
    }

    public r7(q7 actionConsumer, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(actionConsumer, "actionConsumer");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f4992a = actionConsumer;
        this.b = coroutineScope;
        this.c = qe.b.f4977a;
    }

    public final synchronized void a(oe event) {
        Intrinsics.checkNotNullParameter(event, "event");
        qe qeVar = this.c;
        qe a2 = a(qeVar, event);
        this.c = a2;
        mb.a("State Transition: " + Reflection.getOrCreateKotlinClass(qeVar.getClass()).getSimpleName() + " -> " + Reflection.getOrCreateKotlinClass(a2.getClass()).getSimpleName() + " on Event " + Reflection.getOrCreateKotlinClass(event.getClass()).getSimpleName(), (Throwable) null, 2, (Object) null);
    }

    public final synchronized qe b() {
        return this.c;
    }

    public final synchronized long c() {
        ExoPlayer a2 = this.c.a();
        if (a2 == null) {
            return 0L;
        }
        return RangesKt.coerceAtLeast(a2.getDuration(), 0L);
    }

    public final void d() {
        Job job = this.d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.d = null;
    }

    public final qe a(qe qeVar, oe oeVar) {
        if (qeVar instanceof qe.b) {
            if (!(oeVar instanceof oe.a)) {
                return oeVar instanceof oe.j ? qe.g.f4982a : qeVar;
            }
            if (this.f4992a.e()) {
                oe.a aVar = (oe.a) oeVar;
                ExoPlayer c = this.f4992a.c(aVar.b());
                this.f4992a.a(c, aVar.c());
                return new qe.c(aVar.c(), c);
            }
            oe.a aVar2 = (oe.a) oeVar;
            ExoPlayer b = this.f4992a.b(aVar2.b());
            a(aVar2.c(), aVar2.a(), b);
            return new qe.c(aVar2.c(), b);
        }
        if (qeVar instanceof qe.c) {
            if (oeVar instanceof oe.b) {
                oe.b bVar = (oe.b) oeVar;
                this.f4992a.a(bVar.b(), bVar.a());
                return qeVar;
            }
            if (oeVar instanceof oe.g) {
                this.f4992a.i();
                return new qe.f(((qe.c) qeVar).b(), ((oe.g) oeVar).a());
            }
            if (oeVar instanceof oe.f) {
                oe.f fVar = (oe.f) oeVar;
                this.f4992a.a(fVar.a());
                return new qe.a(fVar.a());
            }
            if (oeVar instanceof oe.d) {
                oe.d dVar = (oe.d) oeVar;
                this.f4992a.a(dVar.a());
                return new qe.a(dVar.a());
            }
            if (oeVar instanceof oe.c) {
                qe.c cVar = (qe.c) qeVar;
                ChartboostError.Load.AssetUnavailable assetUnavailable = new ChartboostError.Load.AssetUnavailable(cVar.b().toString(), "Video asset for " + cVar.b() + " was evicted during load.", null);
                this.f4992a.a(assetUnavailable);
                return new qe.a(assetUnavailable);
            }
            if (!(oeVar instanceof oe.j)) {
                return qeVar;
            }
            this.f4992a.j();
            d();
            return qe.g.f4982a;
        }
        if (qeVar instanceof qe.f) {
            if (oeVar instanceof oe.i) {
                qe.f fVar2 = (qe.f) qeVar;
                this.f4992a.b(fVar2.a());
                return new qe.e(fVar2.b(), fVar2.a());
            }
            if (oeVar instanceof oe.k) {
                this.f4992a.a(((qe.f) qeVar).a(), ((oe.k) oeVar).a());
                return qeVar;
            }
            if (oeVar instanceof oe.l) {
                qe.f fVar3 = (qe.f) qeVar;
                this.f4992a.d(fVar3.a());
                return new qe.h(fVar3.b(), fVar3.a());
            }
            if (oeVar instanceof oe.j) {
                this.f4992a.j();
                d();
                return qe.g.f4982a;
            }
            if (oeVar instanceof oe.f) {
                oe.f fVar4 = (oe.f) oeVar;
                this.f4992a.a(fVar4.a());
                return new qe.a(fVar4.a());
            }
            if (!(oeVar instanceof oe.c)) {
                return qeVar;
            }
            ChartboostError.Show.AdInvalidated adInvalidated = ChartboostError.Show.AdInvalidated.INSTANCE;
            this.f4992a.a(adInvalidated);
            return new qe.a(adInvalidated);
        }
        if (qeVar instanceof qe.e) {
            if (oeVar instanceof oe.h) {
                qe.e eVar = (qe.e) qeVar;
                this.f4992a.a(eVar.a());
                return new qe.d(eVar.b(), eVar.a());
            }
            if (oeVar instanceof oe.e) {
                this.f4992a.h();
                qe.e eVar2 = (qe.e) qeVar;
                return new qe.f(eVar2.b(), eVar2.a());
            }
            if (oeVar instanceof oe.l) {
                qe.e eVar3 = (qe.e) qeVar;
                this.f4992a.d(eVar3.a());
                return new qe.h(eVar3.b(), eVar3.a());
            }
            if (oeVar instanceof oe.k) {
                this.f4992a.a(((qe.e) qeVar).a(), ((oe.k) oeVar).a());
                return qeVar;
            }
            if (oeVar instanceof oe.j) {
                this.f4992a.j();
                d();
                return qe.g.f4982a;
            }
            if (oeVar instanceof oe.f) {
                oe.f fVar5 = (oe.f) oeVar;
                this.f4992a.a(fVar5.a());
                return new qe.a(fVar5.a());
            }
            if (!(oeVar instanceof oe.c)) {
                return qeVar;
            }
            ChartboostError.Show.AdInvalidated adInvalidated2 = ChartboostError.Show.AdInvalidated.INSTANCE;
            this.f4992a.a(adInvalidated2);
            return new qe.a(adInvalidated2);
        }
        if (qeVar instanceof qe.d) {
            if (oeVar instanceof oe.i) {
                qe.d dVar2 = (qe.d) qeVar;
                this.f4992a.b(dVar2.a());
                return new qe.e(dVar2.b(), dVar2.a());
            }
            if (oeVar instanceof oe.l) {
                qe.d dVar3 = (qe.d) qeVar;
                this.f4992a.d(dVar3.a());
                return new qe.h(dVar3.b(), dVar3.a());
            }
            if (oeVar instanceof oe.k) {
                this.f4992a.a(((qe.d) qeVar).a(), ((oe.k) oeVar).a());
                return qeVar;
            }
            if (oeVar instanceof oe.j) {
                this.f4992a.j();
                d();
                return qe.g.f4982a;
            }
            if (oeVar instanceof oe.f) {
                oe.f fVar6 = (oe.f) oeVar;
                this.f4992a.a(fVar6.a());
                return new qe.a(fVar6.a());
            }
            if (!(oeVar instanceof oe.c)) {
                return qeVar;
            }
            ChartboostError.Show.AdInvalidated adInvalidated3 = ChartboostError.Show.AdInvalidated.INSTANCE;
            this.f4992a.a(adInvalidated3);
            return new qe.a(adInvalidated3);
        }
        if (qeVar instanceof qe.h) {
            if (oeVar instanceof oe.i) {
                qe.h hVar = (qe.h) qeVar;
                this.f4992a.c(hVar.a());
                this.f4992a.b(hVar.a());
                return new qe.e(hVar.b(), hVar.a());
            }
            if (!(oeVar instanceof oe.j)) {
                return qeVar;
            }
            this.f4992a.j();
            d();
            return qe.g.f4982a;
        }
        if (!(qeVar instanceof qe.a) && !(qeVar instanceof qe.g)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!(oeVar instanceof oe.j)) {
            return qeVar;
        }
        this.f4992a.j();
        d();
        return qe.g.f4982a;
    }

    public final void a(URL url, w6 w6Var, ExoPlayer exoPlayer) {
        Job launch$default;
        d();
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.b, null, null, new a(w6Var, url, this, exoPlayer, null), 3, null);
        this.d = launch$default;
    }

    public final synchronized long a() {
        ExoPlayer a2 = this.c.a();
        if (a2 == null) {
            return 0L;
        }
        return RangesKt.coerceAtLeast(a2.getCurrentPosition(), 0L);
    }
}
