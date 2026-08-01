package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.callbacks.StartCallback;
import com.chartboost.sdk.events.ChartboostError;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class x3 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5067a;
    public final ScheduledExecutorService b;
    public final ng c;
    public final k2 d;
    public final u2 e;

    public static final class a extends SuspendLambda implements Function2 {
        public int b;

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
            return x3.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                u2 u2Var = x3.this.e;
                this.b = 1;
                if (u2.a(u2Var, 0L, this, 1, null) == coroutine_suspended) {
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

    public x3(Context context, ScheduledExecutorService backgroundExecutor, ng sdkInitializer, k2 tokenGenerator, u2 identity) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundExecutor, "backgroundExecutor");
        Intrinsics.checkNotNullParameter(sdkInitializer, "sdkInitializer");
        Intrinsics.checkNotNullParameter(tokenGenerator, "tokenGenerator");
        Intrinsics.checkNotNullParameter(identity, "identity");
        this.f5067a = context;
        this.b = backgroundExecutor;
        this.c = sdkInitializer;
        this.d = tokenGenerator;
        this.e = identity;
    }

    public final void b() {
        try {
            BuildersKt__BuildersKt.runBlocking$default(null, new a(null), 1, null);
            this.e.k();
        } catch (Exception e) {
            mb.a("prepareIdentityAndUserAgent identity error " + e, (Throwable) null, 2, (Object) null);
        }
        try {
            aj.b.a(this.f5067a);
        } catch (Exception e2) {
            mb.a("prepareIdentityAndUserAgent userAgent error " + e2, (Throwable) null, 2, (Object) null);
        }
    }

    public static /* synthetic */ void a(x3 x3Var, String str, String str2, StartCallback startCallback, ChartboostError chartboostError, int i, Object obj) {
        if ((i & 8) != 0) {
            chartboostError = null;
        }
        x3Var.a(str, str2, startCallback, chartboostError);
    }

    public final void a(final String appId, final String appSignature, final StartCallback onStarted, final ChartboostError chartboostError) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appSignature, "appSignature");
        Intrinsics.checkNotNullParameter(onStarted, "onStarted");
        this.b.execute(new Runnable() { // from class: com.chartboost.sdk.impl.x3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                x3.a(x3.this, appId, appSignature, onStarted, chartboostError);
            }
        });
    }

    public static final void a(x3 x3Var, String str, String str2, StartCallback startCallback, ChartboostError chartboostError) {
        x3Var.b();
        x3Var.c.a(str, str2, startCallback, chartboostError);
    }

    public final String a() {
        return this.d.a();
    }
}
