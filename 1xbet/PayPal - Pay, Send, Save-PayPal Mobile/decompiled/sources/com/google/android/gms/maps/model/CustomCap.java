package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
public final class CustomCap extends com.google.android.gms.maps.model.Cap {
    public final com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor;
    public final float refWidth;

    public CustomCap(com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor) {
        this(bitmapDescriptor, 10.0f);
    }

    @Override // com.google.android.gms.maps.model.Cap
    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.bitmapDescriptor);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[CustomCap: bitmapDescriptor=");
        sb.append(valueOf);
        sb.append(" refWidth=");
        sb.append(this.refWidth);
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CustomCap(com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor, float f) {
        super(r0, f);
        com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor2 = (com.google.android.gms.maps.model.BitmapDescriptor) com.google.android.gms.common.internal.Preconditions.checkNotNull(bitmapDescriptor, "bitmapDescriptor must not be null");
        if (f <= 0.0f) {
            throw new java.lang.IllegalArgumentException("refWidth must be positive");
        }
        this.bitmapDescriptor = bitmapDescriptor;
        this.refWidth = f;
    }
}
