package com.moloco.sdk.internal.ilrd;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.I;
import java.text.SimpleDateFormat;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;

/* loaded from: classes7.dex */
public final class d {
    public static final a f = new a(null);
    public static final int g = 8;
    public static final String h = "IlrdScheduler";

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f10494a;
    public final I b;
    public final String c;
    public Job d;
    public final SimpleDateFormat e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdScheduler$schedule$2", f = "IlrdScheduler.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10495a;
        public final /* synthetic */ long c;
        public final /* synthetic */ Function1<Continuation<? super Unit>, Object> d;

        @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdScheduler$schedule$2$1", f = "IlrdScheduler.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f10496a;
            public final /* synthetic */ d b;
            public final /* synthetic */ Function1<Continuation<? super Unit>, Object> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(d dVar, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = dVar;
                this.c = function1;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f10496a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, d.h, "Task " + this.b.c + " invoked", null, false, 12, null);
                    Function1<Continuation<? super Unit>, Object> function1 = this.c;
                    this.f10496a = 1;
                    if (function1.invoke(this) == coroutine_suspended) {
                        return coroutine_suspended;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(long j, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = j;
            this.d = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return d.this.new b(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f10495a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, d.h, "Task " + d.this.c + " scheduled at " + d.this.e.format(Boxing.boxLong(d.this.b.a() + Duration.m9437getInWholeMillisecondsimpl(this.c))), null, false, 12, null);
                long j = this.c;
                this.f10495a = 1;
                if (DelayKt.m9571delayVtjQ1oo(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BuildersKt__Builders_commonKt.launch$default(d.this.f10494a, null, null, new a(d.this, this.d, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public d(CoroutineScope scope, I timeProvider, String name) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f10494a = scope;
        this.b = timeProvider;
        this.c = name;
        this.e = new SimpleDateFormat("HH:mm:ss");
    }

    public final synchronized void a(long j, Function1<? super Continuation<? super Unit>, ? extends Object> task) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(task, "task");
        Job job = this.d;
        if (job != null) {
            a(job);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.f10494a, null, null, new b(j, task, null), 3, null);
        this.d = launch$default;
    }

    public final void a(Job job) {
        Intrinsics.checkNotNullParameter(job, "job");
        if (job.isActive()) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, h, "Task " + this.c + " cancelled", null, false, 12, null);
        }
    }
}
