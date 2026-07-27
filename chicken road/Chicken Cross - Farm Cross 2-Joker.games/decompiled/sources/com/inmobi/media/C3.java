package com.inmobi.media;

import android.os.Message;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class C3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6487a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C4066s3 c;
    public final /* synthetic */ H3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3(C4066s3 c4066s3, H3 h3, Continuation continuation) {
        super(2, continuation);
        this.c = c4066s3;
        this.d = h3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C3 c3 = new C3(this.c, this.d, continuation);
        c3.b = obj;
        return c3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6487a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            L3 l3 = new L3();
            C4066s3 c4066s3 = this.c;
            this.b = coroutineScope;
            this.f6487a = 1;
            obj = l3.a(c4066s3, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (((B6) obj) != null) {
            H3 h3 = this.d;
            C4066s3 c4066s32 = this.c;
            int i2 = H3.f6594a;
            Message obtain = Message.obtain();
            obtain.what = 4;
            obtain.obj = c4066s32;
            h3.sendMessage(obtain);
        } else {
            C4066s3 c4066s33 = this.c;
            H3 h32 = this.d;
            X3 x3 = X3.f6941a;
            Intrinsics.checkNotNullExpressionValue("X3", "access$getTAG$p(...)");
            String str = "Pinging click (" + c4066s33.b + ") via HTTP failed ...";
            X3.b(c4066s33);
            int i3 = H3.f6594a;
            h32.b(c4066s33);
        }
        return Unit.INSTANCE;
    }
}
