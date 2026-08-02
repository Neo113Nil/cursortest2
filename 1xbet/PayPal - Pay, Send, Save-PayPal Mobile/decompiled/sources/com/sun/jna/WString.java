package com.sun.jna;

/* loaded from: classes5.dex */
public final class WString implements java.lang.CharSequence, java.lang.Comparable {
    private java.lang.String Camera2StreamConfigurationMap;

    public WString(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("String initializer must be non-null");
        }
        this.Camera2StreamConfigurationMap = str;
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
        return this.Camera2StreamConfigurationMap;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.sun.jna.WString) && toString().equals(obj.toString());
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return toString().compareTo(obj.toString());
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return toString().length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return toString().charAt(i);
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }
}
