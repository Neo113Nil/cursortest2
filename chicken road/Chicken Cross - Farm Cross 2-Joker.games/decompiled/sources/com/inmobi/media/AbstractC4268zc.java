package com.inmobi.media;

import android.content.ContentValues;
import io.ktor.http.ContentDisposition;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.zc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4268zc {
    public static final ContentValues a(C4019qc c4019qc) {
        Intrinsics.checkNotNullParameter(c4019qc, "<this>");
        ContentValues contentValues = new ContentValues();
        contentValues.put(ContentDisposition.Parameters.FileName, c4019qc.f7325a);
        contentValues.put("saveTimestamp", Long.valueOf(c4019qc.b));
        contentValues.put("retryCount", Integer.valueOf(c4019qc.c));
        contentValues.put("lastRetryTimestamp", Long.valueOf(c4019qc.d));
        contentValues.put("checkpoints", Integer.valueOf(c4019qc.f));
        contentValues.put("hasLoggerFinished", Integer.valueOf(c4019qc.e ? 1 : 0));
        return contentValues;
    }

    public static final C4019qc a(ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(contentValues, "<this>");
        String asString = contentValues.getAsString(ContentDisposition.Parameters.FileName);
        Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
        Long asLong = contentValues.getAsLong("saveTimestamp");
        Intrinsics.checkNotNullExpressionValue(asLong, "getAsLong(...)");
        long longValue = asLong.longValue();
        Integer asInteger = contentValues.getAsInteger("retryCount");
        Intrinsics.checkNotNullExpressionValue(asInteger, "getAsInteger(...)");
        int intValue = asInteger.intValue();
        Long asLong2 = contentValues.getAsLong("lastRetryTimestamp");
        Intrinsics.checkNotNullExpressionValue(asLong2, "getAsLong(...)");
        long longValue2 = asLong2.longValue();
        Integer asInteger2 = contentValues.getAsInteger("checkpoints");
        Intrinsics.checkNotNullExpressionValue(asInteger2, "getAsInteger(...)");
        int intValue2 = asInteger2.intValue();
        Integer asInteger3 = contentValues.getAsInteger("hasLoggerFinished");
        return new C4019qc(asString, longValue, intValue, longValue2, asInteger3 != null && asInteger3.intValue() == 1, intValue2);
    }
}
