package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Hb {
    public static final android.content.ContentValues a(com.inmobi.media.C2904yb c2904yb) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c2904yb, "<this>");
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(io.ktor.http.ContentDisposition.Parameters.FileName, c2904yb.f5568a);
        contentValues.put("saveTimestamp", java.lang.Long.valueOf(c2904yb.b));
        contentValues.put("retryCount", java.lang.Integer.valueOf(c2904yb.c));
        contentValues.put("lastRetryTimestamp", java.lang.Long.valueOf(c2904yb.d));
        contentValues.put("checkpoints", java.lang.Integer.valueOf(c2904yb.f));
        contentValues.put("hasLoggerFinished", java.lang.Integer.valueOf(c2904yb.e ? 1 : 0));
        return contentValues;
    }

    public static final com.inmobi.media.C2904yb a(android.content.ContentValues contentValues) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentValues, "<this>");
        java.lang.String asString = contentValues.getAsString(io.ktor.http.ContentDisposition.Parameters.FileName);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
        java.lang.Long asLong = contentValues.getAsLong("saveTimestamp");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asLong, "getAsLong(...)");
        long longValue = asLong.longValue();
        java.lang.Integer asInteger = contentValues.getAsInteger("retryCount");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asInteger, "getAsInteger(...)");
        int intValue = asInteger.intValue();
        java.lang.Long asLong2 = contentValues.getAsLong("lastRetryTimestamp");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asLong2, "getAsLong(...)");
        long longValue2 = asLong2.longValue();
        java.lang.Integer asInteger2 = contentValues.getAsInteger("checkpoints");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asInteger2, "getAsInteger(...)");
        int intValue2 = asInteger2.intValue();
        java.lang.Integer asInteger3 = contentValues.getAsInteger("hasLoggerFinished");
        return new com.inmobi.media.C2904yb(asString, longValue, intValue, longValue2, asInteger3 != null && asInteger3.intValue() == 1, intValue2);
    }
}
