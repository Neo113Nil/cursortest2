package com.inmobi.media;

import android.os.Message;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class G3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6572a;
    public final /* synthetic */ H3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G3(H3 h3, Continuation continuation) {
        super(2, continuation);
        this.b = h3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new G3(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new G3(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6572a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C4177w3 c4177w3 = (C4177w3) X3.b.getValue();
            this.f6572a = 1;
            obj = c4177w3.a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            return Boxing.boxBoolean(this.b.sendMessage(obtain));
        }
        X3 x3 = X3.f6941a;
        Intrinsics.checkNotNullExpressionValue("X3", "access$getTAG$p(...)");
        X3.g.set(false);
        return Unit.INSTANCE;
    }
}
