package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.SignalsConfig;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class Jl extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6655a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ InterfaceC4195wl c;
    public final /* synthetic */ SignalsConfig.SynapseCollectorConfig d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jl(Context context, InterfaceC4195wl interfaceC4195wl, SignalsConfig.SynapseCollectorConfig synapseCollectorConfig, Continuation continuation) {
        super(2, continuation);
        this.b = context;
        this.c = interfaceC4195wl;
        this.d = synapseCollectorConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Jl(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Jl) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6655a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Ml ml = Ml.f6723a;
        Context context = this.b;
        InterfaceC4195wl interfaceC4195wl = this.c;
        SignalsConfig.SynapseCollectorConfig synapseCollectorConfig = this.d;
        this.f6655a = 1;
        Object a2 = ml.a(context, interfaceC4195wl, synapseCollectorConfig, this);
        return a2 == coroutine_suspended ? coroutine_suspended : a2;
    }
}
