package com.inmobi.media;

/* renamed from: com.inmobi.media.s9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2743s9 implements com.inmobi.media.Pg {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5444a;
    public com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse b;

    public C2743s9(java.lang.String content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        this.f5444a = content;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // com.inmobi.media.Pg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2717r9 c2717r9;
        int i;
        com.inmobi.media.C2743s9 c2743s9;
        try {
            if (continuation instanceof com.inmobi.media.C2717r9) {
                c2717r9 = (com.inmobi.media.C2717r9) continuation;
                int i2 = c2717r9.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c2717r9.d = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = c2717r9.b;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c2717r9.d;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse.class, "clazz");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse.class, "type");
                        java.lang.String str = this.f5444a;
                        c2717r9.f5423a = this;
                        c2717r9.d = 1;
                        org.json.JSONObject jsonObject = new org.json.JSONObject(str);
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse.class, "type");
                        obj = com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse.class.cast(com.inmobi.media.AbstractC2773ta.a(jsonObject, com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse.class, null, null));
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c2743s9 = this;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c2743s9 = c2717r9.f5423a;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    c2743s9.b = (com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse) obj;
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            c2743s9.b = (com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse) obj;
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            kotlin.ExceptionsKt.stackTraceToString(th);
            throw new com.inmobi.media.Y(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new com.inmobi.media.C2306bj(kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("errorCode", kotlin.coroutines.jvm.internal.Boxing.boxShort((short) (!(th instanceof org.json.JSONException) ? th instanceof java.lang.ClassCastException ? 2310 : 2311 : 2309))))));
        }
        c2717r9 = new com.inmobi.media.C2717r9(this, (kotlin.coroutines.jvm.internal.ContinuationImpl) continuation);
        java.lang.Object obj2 = c2717r9.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2717r9.d;
    }

    @Override // com.inmobi.media.Pg
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse b() {
        java.util.Objects.toString(this.b);
        return this.b;
    }

    @Override // com.inmobi.media.Pg
    public final void a() {
        java.lang.String str = this.f5444a;
        if (this.b == null || str.length() == 0) {
            throw new com.inmobi.media.Rg(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new com.inmobi.media.C2306bj(kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("errorCode", (short) 3))));
        }
    }
}
