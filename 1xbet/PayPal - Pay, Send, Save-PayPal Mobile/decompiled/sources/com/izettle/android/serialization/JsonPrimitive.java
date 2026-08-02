package com.izettle.android.serialization;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\u0004\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u000e¢\u0006\u0004\b\u0004\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0010¢\u0006\u0004\b\u0004\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0012¢\u0006\u0004\b\u0004\u0010\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0014¢\u0006\u0004\b\u0004\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0010¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010%R\u0014\u0010\u0003\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'"}, d2 = {"Lcom/izettle/android/serialization/JsonPrimitive;", "Lcom/izettle/android/serialization/JsonElement;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Z)V", "", "(I)V", "", "(J)V", "", "(D)V", "", "(F)V", "", "(S)V", "", "(Ljava/lang/String;)V", "Ljava/math/BigDecimal;", "(Ljava/math/BigDecimal;)V", "", "(Ljava/lang/Object;)V", "getAsBigDecimal", "()Ljava/math/BigDecimal;", "getAsBoolean", "()Z", "getAsDouble", "()D", "getAsFloat", "()F", "getAsInt", "()I", "getAsLong", "()J", "getAsShort", "()S", "getAsString", "()Ljava/lang/String;", "toString", "Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class JsonPrimitive extends com.izettle.android.serialization.JsonElement {
    private final java.lang.Object value;

    private JsonPrimitive(java.lang.Object obj) {
        this.value = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JsonPrimitive(boolean z) {
        this(java.lang.Boolean.valueOf(z));
        kotlin.jvm.internal.Intrinsics.checkNotNull(java.lang.Boolean.valueOf(z), "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JsonPrimitive(int i) {
        this(java.lang.Integer.valueOf(i));
        kotlin.jvm.internal.Intrinsics.checkNotNull(java.lang.Integer.valueOf(i), "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JsonPrimitive(long j) {
        this(java.lang.Long.valueOf(j));
        kotlin.jvm.internal.Intrinsics.checkNotNull(java.lang.Long.valueOf(j), "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JsonPrimitive(double d) {
        this(java.lang.Double.valueOf(d));
        kotlin.jvm.internal.Intrinsics.checkNotNull(java.lang.Double.valueOf(d), "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JsonPrimitive(float f) {
        this(java.lang.Float.valueOf(f));
        kotlin.jvm.internal.Intrinsics.checkNotNull(java.lang.Float.valueOf(f), "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JsonPrimitive(short s) {
        this(java.lang.Short.valueOf(s));
        kotlin.jvm.internal.Intrinsics.checkNotNull(java.lang.Short.valueOf(s), "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JsonPrimitive(java.lang.String str) {
        this((java.lang.Object) str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JsonPrimitive(java.math.BigDecimal bigDecimal) {
        this((java.lang.Object) bigDecimal);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "");
    }

    public final boolean getAsBoolean() {
        return java.lang.Boolean.parseBoolean(this.value.toString());
    }

    public final java.lang.String getAsString() {
        return this.value.toString();
    }

    public final java.math.BigDecimal getAsBigDecimal() {
        java.math.BigDecimal asBigDecimal;
        asBigDecimal = com.izettle.android.serialization.JsonPrimitiveKt.asBigDecimal(this.value);
        return asBigDecimal;
    }

    public final int getAsInt() {
        int asInt;
        asInt = com.izettle.android.serialization.JsonPrimitiveKt.asInt(this.value);
        return asInt;
    }

    public final long getAsLong() {
        long asLong;
        asLong = com.izettle.android.serialization.JsonPrimitiveKt.asLong(this.value);
        return asLong;
    }

    public final float getAsFloat() {
        float asFloat;
        asFloat = com.izettle.android.serialization.JsonPrimitiveKt.asFloat(this.value);
        return asFloat;
    }

    public final double getAsDouble() {
        double asDouble;
        asDouble = com.izettle.android.serialization.JsonPrimitiveKt.asDouble(this.value);
        return asDouble;
    }

    public final short getAsShort() {
        short asShort;
        asShort = com.izettle.android.serialization.JsonPrimitiveKt.asShort(this.value);
        return asShort;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.value;
        if (!(obj instanceof java.lang.String)) {
            return java.lang.String.valueOf(obj);
        }
        java.lang.String replace$default = kotlin.text.StringsKt.replace$default((java.lang.String) obj, "\"", "\\\"", false, 4, (java.lang.Object) null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\"");
        sb.append(replace$default);
        sb.append("\"");
        return sb.toString();
    }
}
