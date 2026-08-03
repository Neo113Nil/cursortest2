package com.inmobi.media;

/* loaded from: classes5.dex */
public final class U9 extends com.inmobi.media.AbstractC2452h6 {
    public final com.inmobi.media.C2613n9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U9(com.inmobi.media.C2613n9 databaseHelper) {
        super(com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN, databaseHelper);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.c = databaseHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d A[LOOP:0: B:11:0x0067->B:13:0x006d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.inmobi.media.AbstractC2452h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(int i, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.T9 t9;
        int i2;
        if (continuationImpl instanceof com.inmobi.media.T9) {
            t9 = (com.inmobi.media.T9) continuationImpl;
            int i3 = t9.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                t9.c = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = t9.f4973a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = t9.c;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2613n9 c2613n9 = this.c;
                    t9.c = 1;
                    c2613n9.getClass();
                    obj = c2613n9.a(new com.inmobi.media.C2506j9(c2613n9, "SELECT * FROM crash ORDER BY ts ASC LIMIT " + i, null), t9);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.util.List<android.content.ContentValues> list = (java.util.List) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                for (android.content.ContentValues contentValues : list) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentValues, "contentValues");
                    java.lang.String asString = contentValues.getAsString("eventId");
                    java.lang.String asString2 = contentValues.getAsString("eventType");
                    java.lang.String asString3 = contentValues.getAsString("componentType");
                    java.lang.String asString4 = contentValues.getAsString("payload");
                    java.lang.String asString5 = contentValues.getAsString("ts");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString5, "getAsString(...)");
                    long parseLong = java.lang.Long.parseLong(asString5);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(asString);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(asString3);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(asString2);
                    com.inmobi.media.X9 x9 = new com.inmobi.media.X9(asString, asString3, asString2, asString4);
                    x9.c = parseLong;
                    java.lang.Integer asInteger = contentValues.getAsInteger("id");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asInteger, "getAsInteger(...)");
                    x9.d = asInteger.intValue();
                    arrayList.add(x9);
                }
                return arrayList;
            }
        }
        t9 = new com.inmobi.media.T9(this, continuationImpl);
        java.lang.Object obj2 = t9.f4973a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = t9.c;
        if (i2 != 0) {
        }
        java.util.List<android.content.ContentValues> list2 = (java.util.List) obj2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        while (r10.hasNext()) {
        }
        return arrayList2;
    }
}
