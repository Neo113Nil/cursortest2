package com.inmobi.media;

/* renamed from: com.inmobi.media.qo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2707qo extends com.inmobi.media.R0 {
    public final com.inmobi.media.Te b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2707qo(com.inmobi.media.Te networkRequest, com.inmobi.media.C2799u9 c2799u9) {
        super(c2799u9);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkRequest, "networkRequest");
        this.b = networkRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.inmobi.media.R0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2681po c2681po;
        int i;
        if (continuation instanceof com.inmobi.media.C2681po) {
            c2681po = (com.inmobi.media.C2681po) continuation;
            int i2 = c2681po.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2681po.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = c2681po.f5399a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2681po.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2734s0 c2734s0 = com.inmobi.media.C2734s0.f5435a;
                    com.inmobi.media.Te te = this.b;
                    c2681po.c = 1;
                    obj = c2734s0.a(te, c2681po);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.inmobi.media.Ve ve = (com.inmobi.media.Ve) obj;
                kotlin.ranges.IntRange intRange = com.inmobi.media.AbstractC2276af.f5103a;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ve, "<this>");
                return ve.d().string(kotlin.text.Charsets.UTF_8);
            }
        }
        c2681po = new com.inmobi.media.C2681po(this, (kotlin.coroutines.jvm.internal.ContinuationImpl) continuation);
        java.lang.Object obj2 = c2681po.f5399a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2681po.c;
        if (i != 0) {
        }
        com.inmobi.media.Ve ve2 = (com.inmobi.media.Ve) obj2;
        kotlin.ranges.IntRange intRange2 = com.inmobi.media.AbstractC2276af.f5103a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ve2, "<this>");
        return ve2.d().string(kotlin.text.Charsets.UTF_8);
    }

    @Override // com.inmobi.media.R0
    public final kotlin.Unit a(com.inmobi.media.ads.network.common.model.AdResponse adResponse, kotlin.jvm.functions.Function1 function1) {
        java.util.Objects.toString(adResponse);
        com.inmobi.media.V0.a(adResponse, this.f4927a, function1);
        return kotlin.Unit.INSTANCE;
    }
}
