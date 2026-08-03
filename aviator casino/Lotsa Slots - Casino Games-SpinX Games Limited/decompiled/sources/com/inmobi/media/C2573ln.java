package com.inmobi.media;

/* renamed from: com.inmobi.media.ln, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2573ln implements kotlinx.coroutines.flow.FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f5323a;

    public C2573ln(kotlinx.coroutines.flow.FlowCollector flowCollector) {
        this.f5323a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2546kn c2546kn;
        int i;
        if (continuation instanceof com.inmobi.media.C2546kn) {
            c2546kn = (com.inmobi.media.C2546kn) continuation;
            int i2 = c2546kn.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2546kn.b = i2 - Integer.MIN_VALUE;
                java.lang.Object obj2 = c2546kn.f5301a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2546kn.b;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    kotlinx.coroutines.flow.FlowCollector flowCollector = this.f5323a;
                    java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((com.inmobi.media.EnumC2391eo) obj) == com.inmobi.media.EnumC2391eo.b);
                    c2546kn.b = 1;
                    if (flowCollector.emit(boxBoolean, c2546kn) == coroutine_suspended) {
                        return coroutine_suspended;
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
        c2546kn = new com.inmobi.media.C2546kn(this, continuation);
        java.lang.Object obj22 = c2546kn.f5301a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2546kn.b;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
