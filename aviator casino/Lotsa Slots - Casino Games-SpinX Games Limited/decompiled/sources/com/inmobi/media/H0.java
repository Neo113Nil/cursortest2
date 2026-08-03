package com.inmobi.media;

/* loaded from: classes5.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2613n9 f4734a;
    public java.lang.ref.WeakReference b;

    public H0(com.inmobi.media.C2613n9 databaseHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.f4734a = databaseHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.inmobi.adquality.models.AdQualityResult adQualityResult, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.G0 g0;
        int i;
        java.lang.ref.WeakReference weakReference;
        com.inmobi.media.C2918z0 c2918z0;
        if (continuationImpl instanceof com.inmobi.media.G0) {
            g0 = (com.inmobi.media.G0) continuationImpl;
            int i2 = g0.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g0.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = g0.f4715a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = g0.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2613n9 c2613n9 = this.f4734a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adQualityResult, "<this>");
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("image_location", adQualityResult.getImageLocation());
                    java.lang.String sdkModelResult = adQualityResult.getSdkModelResult();
                    if (sdkModelResult == null) {
                        sdkModelResult = "";
                    }
                    contentValues.put("sdk_model_result", sdkModelResult);
                    contentValues.put("beacon_url", adQualityResult.getBeaconUrl());
                    contentValues.put("extras", adQualityResult.getExtras());
                    g0.c = 1;
                    if (c2613n9.a("ad_quality_db", contentValues, 4, g0) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                weakReference = this.b;
                if (weakReference != null && (c2918z0 = (com.inmobi.media.C2918z0) weakReference.get()) != null && c2918z0.f5579a.b.get()) {
                    c2918z0.f5579a.b.set(false);
                    c2918z0.f5579a.a();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        g0 = new com.inmobi.media.G0(this, continuationImpl);
        java.lang.Object obj2 = g0.f4715a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = g0.c;
        if (i != 0) {
        }
        weakReference = this.b;
        if (weakReference != null) {
            c2918z0.f5579a.b.set(false);
            c2918z0.f5579a.a();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061 A[LOOP:0: B:11:0x005b->B:13:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.F0 f0;
        int i;
        if (continuationImpl instanceof com.inmobi.media.F0) {
            f0 = (com.inmobi.media.F0) continuationImpl;
            int i2 = f0.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f0.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = f0.f4694a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = f0.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2613n9 c2613n9 = this.f4734a;
                    f0.c = 1;
                    c2613n9.getClass();
                    obj = c2613n9.a(new com.inmobi.media.C2506j9(c2613n9, "SELECT * FROM ad_quality_db", null), f0);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.Iterable<android.content.ContentValues> iterable = (java.lang.Iterable) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (android.content.ContentValues contentValues : iterable) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentValues, "<this>");
                    java.lang.String asString = contentValues.getAsString("image_location");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
                    java.lang.String asString2 = contentValues.getAsString("sdk_model_result");
                    java.lang.String asString3 = contentValues.getAsString("beacon_url");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString3, "getAsString(...)");
                    arrayList.add(new com.inmobi.adquality.models.AdQualityResult(asString, asString2, asString3, contentValues.getAsString("extras")));
                }
                return arrayList;
            }
        }
        f0 = new com.inmobi.media.F0(this, continuationImpl);
        java.lang.Object obj2 = f0.f4694a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = f0.c;
        if (i != 0) {
        }
        java.lang.Iterable<android.content.ContentValues> iterable2 = (java.lang.Iterable) obj2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        while (r8.hasNext()) {
        }
        return arrayList2;
    }
}
