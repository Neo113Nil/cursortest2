package com.bbflight.background_downloader;

import android.content.Context;
import com.bbflight.background_downloader.M;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@DebugMetadata(c = "com.bbflight.background_downloader.TaskWorkerKt$getModifiedTask$modifiedTask$1", f = "TaskWorker.kt", i = {}, l = {852}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes3.dex */
public final class p1 extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super M0>, Object> {
    public int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Ref.ObjectRef<M0> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(Context context, Ref.ObjectRef<M0> objectRef, Continuation<? super p1> continuation) {
        super(2, continuation);
        this.b = context;
        this.c = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new p1(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.K k, Continuation<? super M0> continuation) {
        return ((p1) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        M.a aVar = M.Companion;
        M0 m0 = this.c.element;
        this.a = 1;
        Object f = aVar.f(this.b, m0, this);
        return f == coroutine_suspended ? coroutine_suspended : f;
    }
}
