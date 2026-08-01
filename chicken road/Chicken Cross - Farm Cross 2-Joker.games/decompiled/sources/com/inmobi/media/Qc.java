package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes6.dex */
public final class Qc extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4213xc f6801a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qc(C4213xc c4213xc, long j, int i, Continuation continuation) {
        super(1, continuation);
        this.f6801a = c4213xc;
        this.b = j;
        this.c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Qc(this.f6801a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Qc) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.d, null, null, new Pc(this.f6801a, this.b, this.c, null), 3, null);
        return Unit.INSTANCE;
    }
}
