package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
public final class Dash extends com.google.android.gms.maps.model.PatternItem {
    public final float length;

    public Dash(float f) {
        super(0, java.lang.Float.valueOf(java.lang.Math.max(f, 0.0f)));
        this.length = java.lang.Math.max(f, 0.0f);
    }

    @Override // com.google.android.gms.maps.model.PatternItem
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[Dash: length=");
        sb.append(this.length);
        sb.append("]");
        return sb.toString();
    }
}
