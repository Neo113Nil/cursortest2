package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f3354a;
    public final float b;
    public final float c;

    public y1(float f, float f2, float f3) {
        this.f3354a = f;
        this.b = f2;
        this.c = f3;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OrientationResult(horizontalProbability=");
        sb.append(this.f3354a);
        sb.append(", rotatedLeftProbability=");
        sb.append(this.b);
        sb.append(", rotatedRightProbability=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Float.hashCode(this.f3354a);
        return java.lang.Float.hashCode(this.c) + ((java.lang.Float.hashCode(this.b) + (hashCode * 31)) * 31);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.dyneti.android.dyscan.y1)) {
            return false;
        }
        com.dyneti.android.dyscan.y1 y1Var = (com.dyneti.android.dyscan.y1) obj;
        return java.lang.Float.compare(this.f3354a, y1Var.f3354a) == 0 && java.lang.Float.compare(this.b, y1Var.b) == 0 && java.lang.Float.compare(this.c, y1Var.c) == 0;
    }
}
