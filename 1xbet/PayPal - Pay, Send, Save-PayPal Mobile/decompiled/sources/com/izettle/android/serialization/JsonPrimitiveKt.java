package com.izettle.android.serialization;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"", "Ljava/math/BigDecimal;", "asBigDecimal", "(Ljava/lang/Object;)Ljava/math/BigDecimal;", "", "asDouble", "(Ljava/lang/Object;)D", "", "asFloat", "(Ljava/lang/Object;)F", "", "asInt", "(Ljava/lang/Object;)I", "", "asLong", "(Ljava/lang/Object;)J", "", "asShort", "(Ljava/lang/Object;)S"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class JsonPrimitiveKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int asInt(java.lang.Object obj) {
        return obj instanceof java.lang.Integer ? ((java.lang.Number) obj).intValue() : obj instanceof java.lang.Long ? (int) ((java.lang.Number) obj).longValue() : obj instanceof java.lang.Float ? (int) ((java.lang.Number) obj).floatValue() : obj instanceof java.lang.Double ? (int) ((java.lang.Number) obj).doubleValue() : obj instanceof java.lang.Short ? ((java.lang.Number) obj).shortValue() : obj instanceof java.math.BigDecimal ? ((java.math.BigDecimal) obj).intValue() : java.lang.Integer.parseInt(obj.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long asLong(java.lang.Object obj) {
        return obj instanceof java.lang.Long ? ((java.lang.Number) obj).longValue() : obj instanceof java.lang.Integer ? ((java.lang.Number) obj).intValue() : obj instanceof java.lang.Float ? (long) ((java.lang.Number) obj).floatValue() : obj instanceof java.lang.Double ? (long) ((java.lang.Number) obj).doubleValue() : obj instanceof java.lang.Short ? ((java.lang.Number) obj).shortValue() : obj instanceof java.math.BigDecimal ? ((java.math.BigDecimal) obj).longValue() : java.lang.Long.parseLong(obj.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float asFloat(java.lang.Object obj) {
        return obj instanceof java.lang.Float ? ((java.lang.Number) obj).floatValue() : obj instanceof java.lang.Long ? ((java.lang.Number) obj).longValue() : obj instanceof java.lang.Integer ? ((java.lang.Number) obj).intValue() : obj instanceof java.lang.Double ? (float) ((java.lang.Number) obj).doubleValue() : obj instanceof java.lang.Short ? ((java.lang.Number) obj).shortValue() : obj instanceof java.math.BigDecimal ? ((java.math.BigDecimal) obj).floatValue() : java.lang.Float.parseFloat(obj.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double asDouble(java.lang.Object obj) {
        return obj instanceof java.lang.Double ? ((java.lang.Number) obj).doubleValue() : obj instanceof java.lang.Float ? ((java.lang.Number) obj).floatValue() : obj instanceof java.lang.Long ? ((java.lang.Number) obj).longValue() : obj instanceof java.lang.Integer ? ((java.lang.Number) obj).intValue() : obj instanceof java.lang.Short ? ((java.lang.Number) obj).shortValue() : obj instanceof java.math.BigDecimal ? ((java.math.BigDecimal) obj).doubleValue() : java.lang.Double.parseDouble(obj.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.math.BigDecimal asBigDecimal(java.lang.Object obj) {
        if (obj instanceof java.math.BigDecimal) {
            return (java.math.BigDecimal) obj;
        }
        if (obj instanceof java.lang.Double) {
            return new java.math.BigDecimal(java.lang.String.valueOf(((java.lang.Number) obj).doubleValue()));
        }
        if (obj instanceof java.lang.Float) {
            return new java.math.BigDecimal(java.lang.String.valueOf(((java.lang.Number) obj).floatValue()));
        }
        if (obj instanceof java.lang.Long) {
            java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(((java.lang.Number) obj).longValue());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "");
            return valueOf;
        }
        if (!(obj instanceof java.lang.Integer)) {
            return new java.math.BigDecimal(obj.toString());
        }
        java.math.BigDecimal valueOf2 = java.math.BigDecimal.valueOf(((java.lang.Number) obj).intValue());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf2, "");
        return valueOf2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final short asShort(java.lang.Object obj) {
        return obj instanceof java.lang.Short ? ((java.lang.Number) obj).shortValue() : obj instanceof java.lang.Double ? (short) ((java.lang.Number) obj).doubleValue() : obj instanceof java.lang.Float ? (short) ((java.lang.Number) obj).floatValue() : obj instanceof java.lang.Long ? (short) ((java.lang.Number) obj).longValue() : obj instanceof java.lang.Integer ? (short) ((java.lang.Number) obj).intValue() : obj instanceof java.math.BigDecimal ? ((java.math.BigDecimal) obj).shortValue() : java.lang.Short.parseShort(obj.toString());
    }
}
