package com.google.android.datatransport;

/* loaded from: classes3.dex */
public final class Encoding {

    /* renamed from: name, reason: collision with root package name */
    private final java.lang.String f3777name;

    public static com.google.android.datatransport.Encoding of(java.lang.String str) {
        return new com.google.android.datatransport.Encoding(str);
    }

    public final java.lang.String getName() {
        return this.f3777name;
    }

    private Encoding(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("name is null");
        }
        this.f3777name = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.datatransport.Encoding) {
            return this.f3777name.equals(((com.google.android.datatransport.Encoding) obj).f3777name);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3777name.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Encoding{name=\"");
        sb.append(this.f3777name);
        sb.append("\"}");
        return sb.toString();
    }
}
