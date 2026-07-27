package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class Go extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Bn f6588a;
    public int b;
    public final /* synthetic */ Bn c;
    public final /* synthetic */ double d;
    public final /* synthetic */ Qf e;
    public final /* synthetic */ int f;
    public final /* synthetic */ AdConfig.VastVideoConfig g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Go(Bn bn, double d, Qf qf, int i, AdConfig.VastVideoConfig vastVideoConfig, Continuation continuation) {
        super(2, continuation);
        this.c = bn;
        this.d = d;
        this.e = qf;
        this.f = i;
        this.g = vastVideoConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Go(this.c, this.d, this.e, this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Go) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Bn bn;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Bn bn2 = this.c;
            double d = this.d;
            Qf qf = this.e;
            int i2 = this.f;
            AdConfig.VastVideoConfig vastVideoConfig = this.g;
            this.f6588a = bn2;
            this.b = 1;
            Object a2 = Jo.a(bn2, d, qf, i2, vastVideoConfig, this);
            if (a2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            bn = bn2;
            obj = a2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bn = this.f6588a;
            ResultKt.throwOnFailure(obj);
        }
        return TuplesKt.to(bn, obj);
    }
}
