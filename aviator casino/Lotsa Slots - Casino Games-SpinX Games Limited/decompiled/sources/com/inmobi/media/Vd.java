package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Vd implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f5014a;

    public Vd(kotlinx.coroutines.flow.FlowCollector flowCollector) {
        this.f5014a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.Ud ud;
        int i;
        if (continuation instanceof com.inmobi.media.Ud) {
            ud = (com.inmobi.media.Ud) continuation;
            int i2 = ud.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ud.b = i2 - Integer.MIN_VALUE;
                java.lang.Object obj2 = ud.f4996a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ud.b;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    kotlinx.coroutines.flow.FlowCollector flowCollector = this.f5014a;
                    if (((com.inmobi.media.AbstractC2493im) obj) instanceof com.inmobi.media.C2442gm) {
                        ud.b = 1;
                        if (flowCollector.emit(obj, ud) == coroutine_suspended) {
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
        ud = new com.inmobi.media.Ud(this, continuation);
        java.lang.Object obj22 = ud.f4996a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ud.b;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
