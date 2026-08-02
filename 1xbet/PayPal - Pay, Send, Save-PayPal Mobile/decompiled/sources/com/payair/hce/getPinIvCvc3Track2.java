package com.payair.hce;

/* loaded from: classes4.dex */
public final class getPinIvCvc3Track2 extends java.lang.Number {
    private final java.lang.String writeReplace;

    public getPinIvCvc3Track2(java.lang.String str) {
        this.writeReplace = str;
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return java.lang.Integer.parseInt(this.writeReplace);
            } catch (java.lang.NumberFormatException unused) {
                return (int) java.lang.Long.parseLong(this.writeReplace);
            }
        } catch (java.lang.NumberFormatException unused2) {
            return new java.math.BigDecimal(this.writeReplace).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return java.lang.Long.parseLong(this.writeReplace);
        } catch (java.lang.NumberFormatException unused) {
            return new java.math.BigDecimal(this.writeReplace).longValue();
        }
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return java.lang.Float.parseFloat(this.writeReplace);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return java.lang.Double.parseDouble(this.writeReplace);
    }

    public final java.lang.String toString() {
        return this.writeReplace;
    }

    private java.lang.Object writeReplace() throws java.io.ObjectStreamException {
        return new java.math.BigDecimal(this.writeReplace);
    }

    public final int hashCode() {
        return this.writeReplace.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.payair.hce.getPinIvCvc3Track2)) {
            return false;
        }
        java.lang.String str = this.writeReplace;
        java.lang.String str2 = ((com.payair.hce.getPinIvCvc3Track2) obj).writeReplace;
        return str == str2 || str.equals(str2);
    }
}
