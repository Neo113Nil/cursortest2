package com.plaid.internal;

/* loaded from: classes16.dex */
public final class Z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.plaid.internal.Z0 f5984a = new com.plaid.internal.Z0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.plaid.internal.U2 u2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.plaid.internal.X0 x0;
        java.lang.Object coroutine_suspended;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.functions.Function1 function1;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        T t;
        kotlinx.coroutines.CoroutineDispatcher io2;
        com.plaid.internal.Y0 y0;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        if (continuationImpl instanceof com.plaid.internal.X0) {
            x0 = (com.plaid.internal.X0) continuationImpl;
            int i2 = x0.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x0.f = i2 - 2147483648;
                java.lang.Object obj = x0.d;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = x0.f;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                    x0.f5969a = u2;
                    x0.b = objectRef;
                    x0.c = objectRef;
                    x0.f = 1;
                    java.lang.Object invoke = u2.invoke(x0);
                    if (invoke != coroutine_suspended) {
                        function1 = u2;
                        objectRef2 = objectRef;
                        t = invoke;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) x0.f5969a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return objectRef3.element;
                }
                objectRef2 = x0.c;
                kotlin.jvm.internal.Ref.ObjectRef objectRef4 = x0.b;
                function1 = (kotlin.jvm.functions.Function1) x0.f5969a;
                kotlin.ResultKt.throwOnFailure(obj);
                t = obj;
                objectRef = objectRef4;
                objectRef2.element = t;
                kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
                io2 = kotlinx.coroutines.Dispatchers.getIO();
                y0 = new com.plaid.internal.Y0(intRef, objectRef, function1, null);
                x0.f5969a = objectRef;
                x0.b = null;
                x0.c = null;
                x0.f = 2;
                if (kotlinx.coroutines.BuildersKt.withContext(io2, y0, x0) != coroutine_suspended) {
                    objectRef3 = objectRef;
                    return objectRef3.element;
                }
                return coroutine_suspended;
            }
        }
        x0 = new com.plaid.internal.X0(this, continuationImpl);
        java.lang.Object obj2 = x0.d;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = x0.f;
        if (i != 0) {
        }
        objectRef2.element = t;
        kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
        io2 = kotlinx.coroutines.Dispatchers.getIO();
        y0 = new com.plaid.internal.Y0(intRef2, objectRef, function1, null);
        x0.f5969a = objectRef;
        x0.b = null;
        x0.c = null;
        x0.f = 2;
        if (kotlinx.coroutines.BuildersKt.withContext(io2, y0, x0) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
