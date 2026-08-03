package com.inmobi.media;

/* renamed from: com.inmobi.media.e4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2370e4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2613n9 f5169a;

    public C2370e4(com.inmobi.media.C2613n9 databaseHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.f5169a = databaseHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2345d4 c2345d4;
        int i;
        com.inmobi.media.core.config.models.Config config;
        long longValue;
        if (continuationImpl instanceof com.inmobi.media.C2345d4) {
            c2345d4 = (com.inmobi.media.C2345d4) continuationImpl;
            int i2 = c2345d4.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2345d4.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = c2345d4.f5152a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2345d4.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2613n9 c2613n9 = this.f5169a;
                    c2345d4.c = 1;
                    c2613n9.getClass();
                    obj = c2613n9.a(new com.inmobi.media.C2506j9(c2613n9, "SELECT * FROM config_db", null), c2345d4);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ((java.util.List) obj).toString();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (android.content.ContentValues contentValues : (java.lang.Iterable) obj) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentValues, "<this>");
                    java.lang.String asString = contentValues.getAsString("config_value");
                    java.lang.Long asLong = contentValues.getAsLong("update_ts");
                    try {
                        org.json.JSONObject jsonObject = new org.json.JSONObject(asString);
                        java.lang.String configType = contentValues.getAsString("config_type");
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(configType, "getAsString(...)");
                        kotlin.jvm.internal.Intrinsics.checkNotNull(asLong);
                        longValue = asLong.longValue();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configType, "configType");
                        java.lang.Class type = com.inmobi.media.AbstractC2872x4.a(configType);
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
                        config = (com.inmobi.media.core.config.models.Config) type.cast(com.inmobi.media.AbstractC2773ta.a(jsonObject, type, null, null));
                    } catch (java.lang.Exception unused) {
                    }
                    if (config != null) {
                        config.setLastUpdateTimeStamp(longValue);
                        java.lang.String.valueOf(config);
                        if (config == null) {
                            arrayList.add(config);
                        }
                    }
                    config = null;
                    java.lang.String.valueOf(config);
                    if (config == null) {
                    }
                }
                return arrayList;
            }
        }
        c2345d4 = new com.inmobi.media.C2345d4(this, continuationImpl);
        java.lang.Object obj2 = c2345d4.f5152a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2345d4.c;
        if (i != 0) {
        }
        ((java.util.List) obj2).toString();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (r8.hasNext()) {
        }
        return arrayList2;
    }
}
