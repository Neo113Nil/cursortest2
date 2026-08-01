package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.j5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3812j5 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7173a;
    public final /* synthetic */ C4207x6 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3812j5(C4207x6 c4207x6, long j, Continuation continuation) {
        super(2, continuation);
        this.b = c4207x6;
        this.c = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3812j5(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3812j5(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7173a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C3869l5 c3869l5 = C3869l5.f7216a;
            C4207x6 c4207x6 = this.b;
            int maxAdRecords = C3869l5.c().getContextualData().getMaxAdRecords();
            long j = this.c;
            this.f7173a = 1;
            Intrinsics.checkNotNullExpressionValue("l5", "TAG");
            C3644d5 c3644d5 = (C3644d5) C3869l5.b.getValue();
            S9 s9 = c3644d5.f7063a;
            C3616c5 c3616c5 = new C3616c5(c3644d5, c4207x6, j, maxAdRecords, null);
            s9.getClass();
            Object a2 = s9.a(new R9(s9, c3616c5, null), this);
            if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                a2 = Unit.INSTANCE;
            }
            if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                a2 = Unit.INSTANCE;
            }
            if (a2 == coroutine_suspended) {
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
