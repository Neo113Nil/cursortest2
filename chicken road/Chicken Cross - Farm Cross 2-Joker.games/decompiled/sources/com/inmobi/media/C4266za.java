package com.inmobi.media;

import android.content.ContentValues;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.za, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4266za extends E6 {
    public final S9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4266za(S9 databaseHelper) {
        super(AppMeasurement.CRASH_ORIGIN, databaseHelper);
        Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
        this.c = databaseHelper;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e A[LOOP:0: B:11:0x0068->B:13:0x006e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.inmobi.media.E6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, ContinuationImpl continuationImpl) {
        C4238ya c4238ya;
        int i2;
        if (continuationImpl instanceof C4238ya) {
            c4238ya = (C4238ya) continuationImpl;
            int i3 = c4238ya.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c4238ya.c = i3 - Integer.MIN_VALUE;
                Object obj = c4238ya.f7498a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c4238ya.c;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    S9 s9 = this.c;
                    c4238ya.c = 1;
                    s9.getClass();
                    obj = s9.a(new O9(s9, "SELECT * FROM crash ORDER BY ts ASC LIMIT " + i, null), c4238ya);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                List<ContentValues> list = (List) obj;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (ContentValues contentValues : list) {
                    Intrinsics.checkNotNullParameter(contentValues, "contentValues");
                    String asString = contentValues.getAsString("eventId");
                    String asString2 = contentValues.getAsString("eventType");
                    String asString3 = contentValues.getAsString("componentType");
                    String asString4 = contentValues.getAsString("payload");
                    String asString5 = contentValues.getAsString("ts");
                    Intrinsics.checkNotNullExpressionValue(asString5, "getAsString(...)");
                    long parseLong = Long.parseLong(asString5);
                    Intrinsics.checkNotNull(asString);
                    Intrinsics.checkNotNull(asString3);
                    Intrinsics.checkNotNull(asString2);
                    Ca ca = new Ca(asString, asString3, asString2, asString4);
                    ca.c = parseLong;
                    Integer asInteger = contentValues.getAsInteger("id");
                    Intrinsics.checkNotNullExpressionValue(asInteger, "getAsInteger(...)");
                    ca.d = asInteger.intValue();
                    arrayList.add(ca);
                }
                return arrayList;
            }
        }
        c4238ya = new C4238ya(this, continuationImpl);
        Object obj2 = c4238ya.f7498a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c4238ya.c;
        if (i2 != 0) {
        }
        List<ContentValues> list2 = (List) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        while (r10.hasNext()) {
        }
        return arrayList2;
    }
}
