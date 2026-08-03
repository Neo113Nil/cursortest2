package com.inmobi.media;

/* renamed from: com.inmobi.media.uk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2810uk extends com.inmobi.media.AbstractC2452h6 {
    public final com.inmobi.media.C2613n9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2810uk(com.inmobi.media.C2613n9 databaseHelper) {
        super("telemetry", databaseHelper);
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
        com.inmobi.media.C2783tk c2783tk;
        int i2;
        if (continuationImpl instanceof com.inmobi.media.C2783tk) {
            c2783tk = (com.inmobi.media.C2783tk) continuationImpl;
            int i3 = c2783tk.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2783tk.c = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c2783tk.f5470a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c2783tk.c;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2613n9 c2613n9 = this.c;
                    c2783tk.c = 1;
                    c2613n9.getClass();
                    obj = c2613n9.a(new com.inmobi.media.C2506j9(c2613n9, "SELECT * FROM telemetry ORDER BY ts ASC LIMIT " + i, null), c2783tk);
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
                    java.lang.String asString = contentValues.getAsString("eventType");
                    java.lang.String asString2 = contentValues.getAsString("payload");
                    java.lang.String asString3 = contentValues.getAsString("eventSource");
                    java.lang.String asString4 = contentValues.getAsString("ts");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString4, "getAsString(...)");
                    long parseLong = java.lang.Long.parseLong(asString4);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(asString);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(asString3);
                    com.inmobi.media.C2836vk c2836vk = new com.inmobi.media.C2836vk(asString, asString2, asString3);
                    c2836vk.c = parseLong;
                    java.lang.Integer asInteger = contentValues.getAsInteger("id");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asInteger, "getAsInteger(...)");
                    c2836vk.d = asInteger.intValue();
                    arrayList.add(c2836vk);
                }
                return arrayList;
            }
        }
        c2783tk = new com.inmobi.media.C2783tk(this, continuationImpl);
        java.lang.Object obj2 = c2783tk.f5470a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c2783tk.c;
        if (i2 != 0) {
        }
        java.util.List<android.content.ContentValues> list2 = (java.util.List) obj2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        while (r9.hasNext()) {
        }
        return arrayList2;
    }
}
