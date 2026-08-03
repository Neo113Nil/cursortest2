package com.inmobi.media;

/* loaded from: classes5.dex */
public final class U0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.U0 f4986a = new com.inmobi.media.U0();

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.T0 t0;
        int i;
        com.inmobi.media.ads.network.common.model.AdResponse adResponse;
        try {
            if (continuationImpl instanceof com.inmobi.media.T0) {
                t0 = (com.inmobi.media.T0) continuationImpl;
                int i2 = t0.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    t0.c = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = t0.f4966a;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = t0.c;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.ads.network.common.model.AdResponse.class, "clazz");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.ads.network.common.model.AdResponse.class, "type");
                        t0.c = 1;
                        org.json.JSONObject jsonObject = new org.json.JSONObject(str);
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.ads.network.common.model.AdResponse.class, "type");
                        obj = com.inmobi.media.ads.network.common.model.AdResponse.class.cast(com.inmobi.media.AbstractC2773ta.a(jsonObject, com.inmobi.media.ads.network.common.model.AdResponse.class, null, null));
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    adResponse = (com.inmobi.media.ads.network.common.model.AdResponse) obj;
                    if (adResponse == null) {
                        return adResponse;
                    }
                    throw new com.inmobi.media.Y(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new com.inmobi.media.C2306bj(kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("errorCode", kotlin.coroutines.jvm.internal.Boxing.boxShort((short) 2232)))));
                }
            }
            if (i != 0) {
            }
            adResponse = (com.inmobi.media.ads.network.common.model.AdResponse) obj;
            if (adResponse == null) {
            }
        } catch (java.lang.Exception e) {
            int i3 = !(e instanceof org.json.JSONException) ? e instanceof java.lang.ClassCastException ? 2207 : com.ironsource.E9.a.g : 2113;
            e.toString();
            throw new com.inmobi.media.Y(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new com.inmobi.media.C2306bj(kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("errorCode", kotlin.coroutines.jvm.internal.Boxing.boxShort((short) i3)))));
        }
        t0 = new com.inmobi.media.T0(this, continuationImpl);
        java.lang.Object obj2 = t0.f4966a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = t0.c;
    }
}
