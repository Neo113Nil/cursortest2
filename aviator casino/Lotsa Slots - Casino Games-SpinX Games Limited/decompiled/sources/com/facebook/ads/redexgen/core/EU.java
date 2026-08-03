package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class EU {
    public static java.lang.String[] A02 = {"lLT4WSGDXAAEttN4WZpjnZW3EREZ5IUn", "X1LJmLkuKByNLD5", "9E9AvNKTbt", "HDUBXdTF0", "Y2br1ow9JJdQjV7", "Cljbn90LR6", "vevW4XIw", "R43W1WP4nPn8Vokax5r9eZsQvu5hcN6d"};
    public final long A00;
    public final long A01;

    public EU(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        boolean z = obj instanceof com.facebook.ads.redexgen.core.EU;
        java.lang.String[] strArr = A02;
        if (strArr[0].charAt(21) != strArr[7].charAt(21)) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A02;
        strArr2[4] = "RWvSWN92NbOHtVZ";
        strArr2[1] = "5AykDqMn7i1NCR6";
        if (!z) {
            return false;
        }
        com.facebook.ads.redexgen.core.EU eu = (com.facebook.ads.redexgen.core.EU) obj;
        return this.A01 == eu.A01 && this.A00 == eu.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
