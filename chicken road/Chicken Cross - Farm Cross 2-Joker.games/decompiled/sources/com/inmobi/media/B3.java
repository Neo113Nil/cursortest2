package com.inmobi.media;

import android.os.Message;
import com.inmobi.media.core.config.models.AdConfig;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class B3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6467a;
    public final /* synthetic */ C4177w3 b;
    public final /* synthetic */ H3 c;
    public final /* synthetic */ AdConfig.ImaiConfig d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B3(C4177w3 c4177w3, H3 h3, AdConfig.ImaiConfig imaiConfig, Continuation continuation) {
        super(2, continuation);
        this.b = c4177w3;
        this.c = h3;
        this.d = imaiConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new B3(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((B3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6467a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C4177w3 c4177w3 = this.b;
            this.f6467a = 1;
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
        if (!((Boolean) obj).booleanValue()) {
            X3.g.set(false);
            return Unit.INSTANCE;
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        return Boxing.boxBoolean(this.c.sendMessageDelayed(obtain, this.d.getPingInterval() * 1000));
    }
}
