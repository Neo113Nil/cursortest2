package com.inmobi.media;

/* loaded from: classes5.dex */
public final class G4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2613n9 f4718a;

    public G4(com.inmobi.media.C2613n9 databaseHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.f4718a = databaseHelper;
    }

    public final java.lang.Object a(int i, long j, com.inmobi.media.N4 n4) {
        java.lang.Object a2 = this.f4718a.a("DELETE FROM c_data WHERE id NOT IN (SELECT id FROM (SELECT id FROM c_data WHERE timestamp > " + j + " ORDER BY timestamp DESC LIMIT " + i + ") foo);", n4);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061 A[LOOP:0: B:11:0x005b->B:13:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.E4 e4;
        int i;
        if (continuationImpl instanceof com.inmobi.media.E4) {
            e4 = (com.inmobi.media.E4) continuationImpl;
            int i2 = e4.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e4.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = e4.f4676a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = e4.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2613n9 c2613n9 = this.f4718a;
                    e4.c = 1;
                    c2613n9.getClass();
                    obj = c2613n9.a(new com.inmobi.media.C2506j9(c2613n9, "SELECT * FROM c_data", null), e4);
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
                    java.lang.String asString = contentValues.getAsString("e_data");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
                    java.lang.Long asLong = contentValues.getAsLong(com.ironsource.C4.a.d);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asLong, "getAsLong(...)");
                    arrayList.add(new com.inmobi.media.C2267a6(asString, asLong.longValue()));
                }
                return arrayList;
            }
        }
        e4 = new com.inmobi.media.E4(this, continuationImpl);
        java.lang.Object obj2 = e4.f4676a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = e4.c;
        if (i != 0) {
        }
        java.lang.Iterable<android.content.ContentValues> iterable2 = (java.lang.Iterable) obj2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        while (r7.hasNext()) {
        }
        return arrayList2;
    }
}
