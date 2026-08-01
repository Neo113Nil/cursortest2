package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.sa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4073sa extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7369a;
    public final /* synthetic */ InMobiUnifiedIdInterface b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4073sa(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, Continuation continuation) {
        super(2, continuation);
        this.b = inMobiUnifiedIdInterface;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4073sa(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4073sa(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7369a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            InMobiUnifiedIdInterface inMobiUnifiedIdInterface = this.b;
            this.f7369a = 1;
            if (InMobiUnifiedIdService.fetchUnifiedIdsInternal$media_release(inMobiUnifiedIdInterface, this) == coroutine_suspended) {
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
