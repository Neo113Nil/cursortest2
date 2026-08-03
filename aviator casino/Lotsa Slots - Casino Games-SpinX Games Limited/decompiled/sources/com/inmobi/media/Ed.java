package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ed implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f4683a;

    public Ed(kotlinx.coroutines.flow.FlowCollector flowCollector) {
        this.f4683a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.Dd dd;
        int i;
        if (continuation instanceof com.inmobi.media.Dd) {
            dd = (com.inmobi.media.Dd) continuation;
            int i2 = dd.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dd.b = i2 - Integer.MIN_VALUE;
                java.lang.Object obj2 = dd.f4661a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dd.b;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    kotlinx.coroutines.flow.FlowCollector flowCollector = this.f4683a;
                    if (((com.inmobi.media.AbstractC2509jc) obj) instanceof com.inmobi.media.AbstractC2493im) {
                        dd.b = 1;
                        if (flowCollector.emit(obj, dd) == coroutine_suspended) {
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
        dd = new com.inmobi.media.Dd(this, continuation);
        java.lang.Object obj22 = dd.f4661a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dd.b;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
