package com.google.gson.internal;

/* loaded from: classes4.dex */
public final class LazilyParsedNumber extends java.lang.Number {
    private final java.lang.String value;

    public LazilyParsedNumber(java.lang.String str) {
        this.value = str;
    }

    private java.math.BigDecimal asBigDecimal() {
        return com.google.gson.internal.NumberLimits.parseBigDecimal(this.value);
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return java.lang.Integer.parseInt(this.value);
            } catch (java.lang.NumberFormatException unused) {
                return (int) java.lang.Long.parseLong(this.value);
            }
        } catch (java.lang.NumberFormatException unused2) {
            return asBigDecimal().intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return java.lang.Long.parseLong(this.value);
        } catch (java.lang.NumberFormatException unused) {
            return asBigDecimal().longValue();
        }
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return java.lang.Float.parseFloat(this.value);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return java.lang.Double.parseDouble(this.value);
    }

    public final java.lang.String toString() {
        return this.value;
    }

    private java.lang.Object writeReplace() throws java.io.ObjectStreamException {
        return asBigDecimal();
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException {
        throw new java.io.InvalidObjectException("Deserialization is unsupported");
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.gson.internal.LazilyParsedNumber) {
            return this.value.equals(((com.google.gson.internal.LazilyParsedNumber) obj).value);
        }
        return false;
    }
}
