package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Z2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2613n9 f5077a;

    public Z2(com.inmobi.media.C2613n9 databaseHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.f5077a = databaseHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(int i, int i2, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.W2 w2;
        int i3;
        if (continuationImpl instanceof com.inmobi.media.W2) {
            w2 = (com.inmobi.media.W2) continuationImpl;
            int i4 = w2.c;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                w2.c = i4 - Integer.MIN_VALUE;
                java.lang.Object obj = w2.f5023a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = w2.c;
                if (i3 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String str = "SELECT * FROM click WHERE ts < " + (java.lang.System.currentTimeMillis() - i2) + " ORDER BY ts ASC LIMIT " + i;
                    com.inmobi.media.C2613n9 c2613n9 = this.f5077a;
                    w2.c = 1;
                    c2613n9.getClass();
                    obj = c2613n9.a(new com.inmobi.media.C2506j9(c2613n9, str, null), w2);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.Iterable<android.content.ContentValues> iterable = (java.lang.Iterable) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (android.content.ContentValues contentValues : iterable) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentValues, "<this>");
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    java.lang.String asString = contentValues.getAsString("track_extras");
                    if (asString != null) {
                        try {
                            org.json.JSONObject jSONObject = new org.json.JSONObject(asString);
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jSONObject, "<this>");
                            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                java.lang.String next = keys.next();
                                java.lang.Object obj2 = jSONObject.get(next);
                                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                                linkedHashMap2.put(next, (java.lang.String) obj2);
                            }
                            linkedHashMap.putAll(linkedHashMap2);
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    java.lang.Integer asInteger = contentValues.getAsInteger("id");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asInteger, "getAsInteger(...)");
                    int intValue = asInteger.intValue();
                    java.lang.String asString2 = contentValues.getAsString("url");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString2, "getAsString(...)");
                    java.lang.Boolean asBoolean = contentValues.getAsBoolean("follow_redirect");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asBoolean, "getAsBoolean(...)");
                    boolean booleanValue = asBoolean.booleanValue();
                    java.lang.Boolean asBoolean2 = contentValues.getAsBoolean("ping_in_webview");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asBoolean2, "getAsBoolean(...)");
                    boolean booleanValue2 = asBoolean2.booleanValue();
                    java.lang.Integer asInteger2 = contentValues.getAsInteger("pending_attempts");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asInteger2, "getAsInteger(...)");
                    int intValue2 = asInteger2.intValue();
                    java.lang.Long asLong = contentValues.getAsLong("ts");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asLong, "getAsLong(...)");
                    long longValue = asLong.longValue();
                    java.lang.Long asLong2 = contentValues.getAsLong("created_ts");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asLong2, "getAsLong(...)");
                    arrayList.add(new com.inmobi.media.V2(intValue, asString2, linkedHashMap, booleanValue, booleanValue2, intValue2, longValue, asLong2.longValue()));
                }
                return arrayList;
            }
        }
        w2 = new com.inmobi.media.W2(this, continuationImpl);
        java.lang.Object obj3 = w2.f5023a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = w2.c;
        if (i3 != 0) {
        }
        java.lang.Iterable<android.content.ContentValues> iterable2 = (java.lang.Iterable) obj3;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        while (r1.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.X2 x2;
        int i;
        if (continuationImpl instanceof com.inmobi.media.X2) {
            x2 = (com.inmobi.media.X2) continuationImpl;
            int i2 = x2.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x2.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = x2.f5044a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = x2.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2613n9 c2613n9 = this.f5077a;
                    x2.c = 1;
                    c2613n9.getClass();
                    obj = c2613n9.a(new com.inmobi.media.C2375e9(c2613n9, "SELECT COUNT(*) FROM click", null), x2);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((java.lang.Number) obj).intValue() != 0);
            }
        }
        x2 = new com.inmobi.media.X2(this, continuationImpl);
        java.lang.Object obj2 = x2.f5044a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = x2.c;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((java.lang.Number) obj2).intValue() != 0);
    }
}
