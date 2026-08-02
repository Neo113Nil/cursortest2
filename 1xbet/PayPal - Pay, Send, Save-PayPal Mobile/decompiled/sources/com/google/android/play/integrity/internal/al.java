package com.google.android.play.integrity.internal;

/* loaded from: classes9.dex */
public final class al {
    public static int a(int i, int i2, java.lang.String str) {
        java.lang.String a2;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            a2 = com.google.android.play.integrity.internal.am.a("%s (%s) must not be negative", "index", java.lang.Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("negative size: ");
                sb.append(i2);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            a2 = com.google.android.play.integrity.internal.am.a("%s (%s) must be less than size (%s)", "index", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
        throw new java.lang.IndexOutOfBoundsException(a2);
    }

    public static int b(int i, int i2, java.lang.String str) {
        if (i < 0 || i > i2) {
            throw new java.lang.IndexOutOfBoundsException(d(i, i2, "index"));
        }
        return i;
    }

    private static java.lang.String d(int i, int i2, java.lang.String str) {
        if (i < 0) {
            return com.google.android.play.integrity.internal.am.a("%s (%s) must not be negative", str, java.lang.Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return com.google.android.play.integrity.internal.am.a("%s (%s) must not be greater than size (%s)", str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("negative size: ");
        sb.append(i2);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static void c(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new java.lang.IndexOutOfBoundsException((i < 0 || i > i3) ? d(i, i3, "start index") : (i2 < 0 || i2 > i3) ? d(i2, i3, "end index") : com.google.android.play.integrity.internal.am.a("end index (%s) must not be less than start index (%s)", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i)));
        }
    }
}
