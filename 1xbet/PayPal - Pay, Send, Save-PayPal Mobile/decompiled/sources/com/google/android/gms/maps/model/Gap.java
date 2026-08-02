package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
public final class Gap extends com.google.android.gms.maps.model.PatternItem {
    public final float length;

    public Gap(float f) {
        super(2, java.lang.Float.valueOf(java.lang.Math.max(f, 0.0f)));
        this.length = java.lang.Math.max(f, 0.0f);
    }

    @Override // com.google.android.gms.maps.model.PatternItem
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[Gap: length=");
        sb.append(this.length);
        sb.append("]");
        return sb.toString();
    }
}
