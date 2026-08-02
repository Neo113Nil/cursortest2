package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class fo extends java.lang.Number {
    private final java.lang.String c;

    public fo(java.lang.String str) {
        this.c = str;
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return java.lang.Integer.parseInt(this.c);
            } catch (java.lang.NumberFormatException unused) {
                return (int) java.lang.Long.parseLong(this.c);
            }
        } catch (java.lang.NumberFormatException unused2) {
            return new java.math.BigDecimal(this.c).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return java.lang.Long.parseLong(this.c);
        } catch (java.lang.NumberFormatException unused) {
            return new java.math.BigDecimal(this.c).longValue();
        }
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return java.lang.Float.parseFloat(this.c);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return java.lang.Double.parseDouble(this.c);
    }

    public final java.lang.String toString() {
        return this.c;
    }

    private java.lang.Object writeReplace() throws java.io.ObjectStreamException {
        return new java.math.BigDecimal(this.c);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException {
        throw new java.io.InvalidObjectException("Deserialization is unsupported");
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.facetec.sdk.fo)) {
            return false;
        }
        java.lang.String str = this.c;
        java.lang.String str2 = ((com.facetec.sdk.fo) obj).c;
        return str == str2 || str.equals(str2);
    }
}
