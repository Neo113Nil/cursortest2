package com.inmobi.media;

import android.content.Context;
import android.os.Process;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ik extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6631a;

    public Ik(Continuation continuation) {
        super(1, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Ik(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Ik((Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6631a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Intrinsics.checkNotNullExpressionValue(Kk.b, "access$getTAG$p(...)");
            C4276zk c4276zk = C4276zk.f7528a;
            boolean sessionEnabled = Kk.a().getSessionEnabled();
            c4276zk.getClass();
            C4276zk.e = sessionEnabled;
            String str = null;
            if (!sessionEnabled) {
                C4276zk.d = null;
            }
            if (C4276zk.b().isForegroundBackgroundModelEnabled()) {
                C4276zk.f();
            } else if (!C4276zk.h.getAndSet(true)) {
                C4276zk.a(false);
                C4276zk.f = System.currentTimeMillis() - Process.getElapsedCpuTime();
                C4276zk.g();
            }
            Context context = AbstractC3914mk.f7252a;
            if (context != null) {
                Intrinsics.checkNotNullParameter(context, "context");
                ConcurrentHashMap concurrentHashMap = Db.b;
                Db a2 = Cb.a(context, "coppa_store");
                Intrinsics.checkNotNullParameter("im_accid", "key");
                str = a2.f6510a.getString("im_accid", null);
            }
            if (str == null || Kk.a().getLocationEnabled()) {
                C3906mc c3906mc = C3906mc.f7246a;
                this.f6631a = 1;
                if (c3906mc.a(this) == coroutine_suspended) {
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
