package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.k5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3840k5 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7195a;
    public final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3840k5(long j, Continuation continuation) {
        super(2, continuation);
        this.b = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3840k5(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3840k5(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7195a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C3869l5 c3869l5 = C3869l5.f7216a;
            C3644d5 c3644d5 = (C3644d5) C3869l5.b.getValue();
            int maxAdRecords = C3869l5.c().getContextualData().getMaxAdRecords();
            long j = this.b;
            this.f7195a = 1;
            if (c3644d5.a(maxAdRecords, j, this) == coroutine_suspended) {
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
