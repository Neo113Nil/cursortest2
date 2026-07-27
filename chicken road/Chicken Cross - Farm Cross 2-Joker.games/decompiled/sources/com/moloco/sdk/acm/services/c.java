package com.moloco.sdk.acm.services;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* loaded from: classes8.dex */
public final class c implements com.moloco.sdk.acm.services.b {

    /* renamed from: a, reason: collision with root package name */
    public final Lifecycle f10419a;
    public final ApplicationLifecycleObserver b;
    public AtomicBoolean c;

    @DebugMetadata(c = "com.moloco.sdk.acm.services.ApplicationLifecycleTrackerImpl", f = "ApplicationLifecycleTracker.kt", i = {}, l = {40}, m = "startObserving", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f10420a;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10420a = obj;
            this.c |= Integer.MIN_VALUE;
            return c.this.a(this);
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.acm.services.ApplicationLifecycleTrackerImpl$startObserving$2", f = "ApplicationLifecycleTracker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10421a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10421a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (c.this.c.compareAndSet(false, true)) {
                e.a(e.f10423a, d.f10422a, "Start observing application lifecycle events", false, 4, null);
                c.this.f10419a.addObserver(c.this.b);
            }
            return Unit.INSTANCE;
        }
    }

    public c(Lifecycle lifecycle, ApplicationLifecycleObserver bgListener) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(bgListener, "bgListener");
        this.f10419a = lifecycle;
        this.b = bgListener;
        this.c = new AtomicBoolean(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|26|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        kotlinx.coroutines.JobKt.ensureActive(r0.getContext());
        r5 = com.moloco.sdk.acm.services.e.f10423a;
        com.moloco.sdk.acm.services.e.b(r5, com.moloco.sdk.acm.services.d.f10422a, "Unable to register lifecycle observer [process=" + r5.c() + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST, r13, false, 8, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        kotlinx.coroutines.JobKt.ensureActive(r0.getContext());
        r5 = com.moloco.sdk.acm.services.e.f10423a;
        com.moloco.sdk.acm.services.e.b(r5, com.moloco.sdk.acm.services.d.f10422a, "Unable to register lifecycle observer [process=" + r5.c() + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST, r13, false, 8, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // com.moloco.sdk.acm.services.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(Continuation<? super Unit> continuation) {
        a aVar;
        int i;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.c = i2 - Integer.MIN_VALUE;
                Object obj = aVar.f10420a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
                    b bVar = new b(null);
                    aVar.c = 1;
                    if (BuildersKt.withContext(immediate, bVar, aVar) == coroutine_suspended) {
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
        aVar = new a(continuation);
        Object obj2 = aVar.f10420a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.c;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    public final void a() {
        this.b.onStop(ProcessLifecycleOwner.INSTANCE.get());
    }
}
