package com.inmobi.media;

/* renamed from: com.inmobi.media.ym, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2915ym implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f5576a;

    public C2915ym(kotlinx.coroutines.flow.FlowCollector flowCollector) {
        this.f5576a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2890xm c2890xm;
        int i;
        if (continuation instanceof com.inmobi.media.C2890xm) {
            c2890xm = (com.inmobi.media.C2890xm) continuation;
            int i2 = c2890xm.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2890xm.b = i2 - Integer.MIN_VALUE;
                java.lang.Object obj2 = c2890xm.f5556a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2890xm.b;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    kotlinx.coroutines.flow.FlowCollector flowCollector = this.f5576a;
                    com.inmobi.media.AbstractC2493im abstractC2493im = (com.inmobi.media.AbstractC2493im) obj;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(abstractC2493im, com.inmobi.media.C2941zn.f5598a) || (abstractC2493im instanceof com.inmobi.media.C2442gm)) {
                        c2890xm.b = 1;
                        if (flowCollector.emit(obj, c2890xm) == coroutine_suspended) {
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
        c2890xm = new com.inmobi.media.C2890xm(this, continuation);
        java.lang.Object obj22 = c2890xm.f5556a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2890xm.b;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
