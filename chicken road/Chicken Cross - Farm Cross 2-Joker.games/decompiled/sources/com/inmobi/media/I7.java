package com.inmobi.media;

import com.adjust.sdk.Constants;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class I7 extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f6620a;
    public final /* synthetic */ P7 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I7(P7 p7, int i, Continuation continuation) {
        super(1, continuation);
        this.b = p7;
        this.c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new I7(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new I7(this.b, this.c, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6620a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (Sf.a() != null) {
                return CollectionsKt.emptyList();
            }
            Gh gh = this.b.f7163a;
            Integer boxInt = Boxing.boxInt(this.c);
            this.f6620a = 1;
            obj = gh.b(Constants.HIGH, boxInt, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return (List) obj;
    }
}
