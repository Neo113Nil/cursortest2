package com.inmobi.media;

/* loaded from: classes5.dex */
public final class A7 implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f4596a;

    public A7(kotlinx.coroutines.flow.FlowCollector flowCollector) {
        this.f4596a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2925z7 c2925z7;
        int i;
        if (continuation instanceof com.inmobi.media.C2925z7) {
            c2925z7 = (com.inmobi.media.C2925z7) continuation;
            int i2 = c2925z7.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2925z7.b = i2 - Integer.MIN_VALUE;
                java.lang.Object obj2 = c2925z7.f5585a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2925z7.b;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    kotlinx.coroutines.flow.FlowCollector flowCollector = this.f4596a;
                    if (((com.inmobi.media.AbstractC2493im) obj) instanceof com.inmobi.media.C2442gm) {
                        c2925z7.b = 1;
                        if (flowCollector.emit(obj, c2925z7) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj2);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        c2925z7 = new com.inmobi.media.C2925z7(this, continuation);
        java.lang.Object obj22 = c2925z7.f5585a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2925z7.b;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
