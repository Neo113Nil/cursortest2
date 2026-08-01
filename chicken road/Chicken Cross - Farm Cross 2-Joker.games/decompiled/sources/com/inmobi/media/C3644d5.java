package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.d5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3644d5 {

    /* renamed from: a, reason: collision with root package name */
    public final S9 f7063a;

    public C3644d5(S9 databaseHelper) {
        Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.f7063a = databaseHelper;
    }

    public final Object a(int i, long j, C3840k5 c3840k5) {
        Object a2 = this.f7063a.a("DELETE FROM c_data WHERE id NOT IN (SELECT id FROM (SELECT id FROM c_data WHERE timestamp > " + j + " ORDER BY timestamp DESC LIMIT " + i + ") foo);", c3840k5);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061 A[LOOP:0: B:11:0x005b->B:13:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        C3587b5 c3587b5;
        int i;
        if (continuationImpl instanceof C3587b5) {
            c3587b5 = (C3587b5) continuationImpl;
            int i2 = c3587b5.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3587b5.c = i2 - Integer.MIN_VALUE;
                Object obj = c3587b5.f7024a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c3587b5.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    S9 s9 = this.f7063a;
                    c3587b5.c = 1;
                    s9.getClass();
                    obj = s9.a(new O9(s9, "SELECT * FROM c_data", null), c3587b5);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Iterable<ContentValues> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (ContentValues contentValues : iterable) {
                    Intrinsics.checkNotNullParameter(contentValues, "<this>");
                    String asString = contentValues.getAsString("e_data");
                    Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
                    Long asLong = contentValues.getAsLong("timestamp");
                    Intrinsics.checkNotNullExpressionValue(asLong, "getAsLong(...)");
                    arrayList.add(new C4207x6(asString, asLong.longValue()));
                }
                return arrayList;
            }
        }
        c3587b5 = new C3587b5(this, continuationImpl);
        Object obj2 = c3587b5.f7024a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3587b5.c;
        if (i != 0) {
        }
        Iterable<ContentValues> iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        while (r7.hasNext()) {
        }
        return arrayList2;
    }
}
