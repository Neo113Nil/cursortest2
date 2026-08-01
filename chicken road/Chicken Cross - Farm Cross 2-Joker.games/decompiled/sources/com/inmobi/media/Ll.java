package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.SignalsConfig;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class Ll extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6699a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ SignalsConfig c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ll(Context context, SignalsConfig signalsConfig, Continuation continuation) {
        super(2, continuation);
        this.b = context;
        this.c = signalsConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Ll(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Ll(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6699a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ml ml = Ml.f6723a;
                Context context = this.b;
                SignalsConfig signalsConfig = this.c;
                this.f6699a = 1;
                if (ml.a(context, signalsConfig, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Ml.f.set(false);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            Ml.f.set(false);
            throw th;
        }
    }
}
