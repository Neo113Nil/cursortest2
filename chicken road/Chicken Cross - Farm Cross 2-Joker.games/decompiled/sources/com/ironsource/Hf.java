package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes6.dex */
public final class Hf {

    /* renamed from: a, reason: collision with root package name */
    public static final Hf f7662a = new Hf();
    private static final Lazy b = LazyKt.lazy(c.f7665a);
    private static final Lazy c = LazyKt.lazy(a.f7663a);

    static final class a extends Lambda implements Function0<CoroutineScope> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7663a = new a();

        /* renamed from: com.ironsource.Hf$a$a, reason: collision with other inner class name */
        public static final class C0308a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
            public C0308a(CoroutineExceptionHandler.Companion companion) {
                super(companion);
            }

            @Override // kotlinx.coroutines.CoroutineExceptionHandler
            public void handleException(CoroutineContext coroutineContext, Throwable th) {
                IronLog.INTERNAL.error("CoroutineExceptionHandler caught: " + th.getMessage());
            }
        }

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CoroutineScope invoke() {
            return CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(new C0308a(CoroutineExceptionHandler.INSTANCE)));
        }
    }

    @DebugMetadata(c = "com.unity3d.mediation.internal.TempThreadManager$launchCoroutineTask$1", f = "TempThreadManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f7664a;
        final /* synthetic */ Runnable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = runnable;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7664a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                this.b.run();
            } catch (Throwable th) {
                C4491k4.d().a(th);
                IronLog.INTERNAL.error("Exception in TempThreadManager coroutine: " + th.getMessage());
            }
            return Unit.INSTANCE;
        }
    }

    static final class c extends Lambda implements Function0<C4483je> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f7665a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4483je invoke() {
            return new C4483je(16, null, 2, null);
        }
    }

    private Hf() {
    }

    private final CoroutineScope a() {
        return (CoroutineScope) c.getValue();
    }

    private final C4483je b() {
        return (C4483je) b.getValue();
    }

    private final boolean a(Runnable runnable) {
        try {
            BuildersKt__Builders_commonKt.launch$default(a(), null, null, new b(runnable, null), 3, null);
            return true;
        } catch (Throwable th) {
            try {
                Gf.a(th);
            } catch (Exception e) {
                C4491k4.d().a(e);
            }
            IronLog.INTERNAL.error("Failed to launch coroutine: " + th.getMessage());
            return false;
        }
    }

    public final void b(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (a(action)) {
            return;
        }
        b().execute(action);
    }
}
