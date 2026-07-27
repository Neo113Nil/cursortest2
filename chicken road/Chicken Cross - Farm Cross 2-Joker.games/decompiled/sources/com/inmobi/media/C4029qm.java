package com.inmobi.media;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.qm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4029qm extends E6 {
    public final S9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4029qm(S9 databaseHelper) {
        super("telemetry", databaseHelper);
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
        C4001pm c4001pm;
        int i2;
        if (continuationImpl instanceof C4001pm) {
            c4001pm = (C4001pm) continuationImpl;
            int i3 = c4001pm.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c4001pm.c = i3 - Integer.MIN_VALUE;
                Object obj = c4001pm.f7311a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c4001pm.c;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    S9 s9 = this.c;
                    c4001pm.c = 1;
                    s9.getClass();
                    obj = s9.a(new O9(s9, "SELECT * FROM telemetry ORDER BY ts ASC LIMIT " + i, null), c4001pm);
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
                    String asString = contentValues.getAsString("eventType");
                    String asString2 = contentValues.getAsString("payload");
                    String asString3 = contentValues.getAsString("eventSource");
                    String asString4 = contentValues.getAsString("ts");
                    Intrinsics.checkNotNullExpressionValue(asString4, "getAsString(...)");
                    long parseLong = Long.parseLong(asString4);
                    Intrinsics.checkNotNull(asString);
                    Intrinsics.checkNotNull(asString3);
                    C4057rm c4057rm = new C4057rm(asString, asString2, asString3);
                    c4057rm.c = parseLong;
                    Integer asInteger = contentValues.getAsInteger("id");
                    Intrinsics.checkNotNullExpressionValue(asInteger, "getAsInteger(...)");
                    c4057rm.d = asInteger.intValue();
                    arrayList.add(c4057rm);
                }
                return arrayList;
            }
        }
        c4001pm = new C4001pm(this, continuationImpl);
        Object obj2 = c4001pm.f7311a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c4001pm.c;
        if (i2 != 0) {
        }
        List<ContentValues> list2 = (List) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        while (r9.hasNext()) {
        }
        return arrayList2;
    }
}
