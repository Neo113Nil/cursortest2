package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.df;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes4.dex */
public final class cf {

    /* renamed from: a, reason: collision with root package name */
    public final pe f4713a;
    public final List b;
    public final long c;
    public final CoroutineScope d;
    public Job e;
    public final Set f;

    public static final class a extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = cf.this.new a(continuation);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.c;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.c;
                ResultKt.throwOnFailure(obj);
            }
            while (CoroutineScopeKt.isActive(coroutineScope)) {
                cf.this.a();
                long j = cf.this.c;
                this.c = coroutineScope;
                this.b = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public cf(pe provider, List events, long j, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(events, "events");
        this.f4713a = provider;
        this.b = events;
        this.c = j;
        this.d = coroutineScope == null ? CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain())) : coroutineScope;
        this.f = new LinkedHashSet();
    }

    public final void c() {
        Job launch$default;
        Job job = this.e;
        if (job == null || !job.isActive()) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.d, null, null, new a(null), 3, null);
            this.e = launch$default;
        }
    }

    public final void d() {
        Job job = this.e;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.e = null;
        this.f.clear();
    }

    public final void a() {
        if (this.f.size() == this.b.size()) {
            return;
        }
        a(this.f4713a.b(), RangesKt.coerceAtLeast(this.f4713a.a(), 1L));
    }

    public final void b() {
        if (this.f.size() == this.b.size()) {
            return;
        }
        long coerceAtLeast = RangesKt.coerceAtLeast(this.f4713a.a(), 1L);
        a(Math.max(this.f4713a.b(), coerceAtLeast), coerceAtLeast);
    }

    public final void a(long j, long j2) {
        double d = j / j2;
        for (bf bfVar : this.b) {
            if (!this.f.contains(bfVar)) {
                df b = bfVar.b();
                if (!(b instanceof df.a)) {
                    if (!(b instanceof df.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (j >= ((df.b) b).a()) {
                        this.f.add(bfVar);
                        bfVar.a().invoke();
                    }
                } else if (d >= ((df.a) b).a()) {
                    this.f.add(bfVar);
                    bfVar.a().invoke();
                }
            }
        }
    }
}
