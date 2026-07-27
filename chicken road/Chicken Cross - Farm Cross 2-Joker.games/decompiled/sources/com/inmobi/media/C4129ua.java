package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.inmobi.unifiedId.InMobiUserDataModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.ua, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4129ua extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7411a;
    public final /* synthetic */ InMobiUserDataModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4129ua(InMobiUserDataModel inMobiUserDataModel, Continuation continuation) {
        super(2, continuation);
        this.b = inMobiUserDataModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4129ua(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4129ua(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7411a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            InMobiUserDataModel inMobiUserDataModel = this.b;
            this.f7411a = 1;
            a2 = InMobiUnifiedIdService.a(inMobiUserDataModel, this);
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
