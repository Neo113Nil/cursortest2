package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
public class Cap extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.Cap> CREATOR = new com.google.android.gms.maps.model.zzb();
    private static final java.lang.String zza = "Cap";
    private final int zzb;
    private final com.google.android.gms.maps.model.BitmapDescriptor zzc;
    private final java.lang.Float zzd;

    protected Cap(int i) {
        this(i, (com.google.android.gms.maps.model.BitmapDescriptor) null, (java.lang.Float) null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.maps.model.Cap)) {
            return false;
        }
        com.google.android.gms.maps.model.Cap cap = (com.google.android.gms.maps.model.Cap) obj;
        return this.zzb == cap.zzb && com.google.android.gms.common.internal.Objects.equal(this.zzc, cap.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, cap.zzd);
    }

    public int hashCode() {
        int i = this.zzb;
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(i), this.zzc, this.zzd);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[Cap: type=");
        sb.append(this.zzb);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zzb;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, i2);
        com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor = this.zzc;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, bitmapDescriptor == null ? null : bitmapDescriptor.zza().asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloatObject(parcel, 4, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    Cap(int i, android.os.IBinder iBinder, java.lang.Float f) {
        this(i, iBinder == null ? null : new com.google.android.gms.maps.model.BitmapDescriptor(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(iBinder)), f);
    }

    private Cap(int i, com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor, java.lang.Float f) {
        boolean z = false;
        boolean z2 = true;
        boolean z3 = f != null && f.floatValue() > 0.0f;
        if (i == 3) {
            if (bitmapDescriptor != null && z3) {
                z = true;
            }
            z2 = z;
            i = 3;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(z2, java.lang.String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", java.lang.Integer.valueOf(i), bitmapDescriptor, f));
        this.zzb = i;
        this.zzc = bitmapDescriptor;
        this.zzd = f;
    }

    final com.google.android.gms.maps.model.Cap zza() {
        int i = this.zzb;
        if (i == 0) {
            return new com.google.android.gms.maps.model.ButtCap();
        }
        if (i == 1) {
            return new com.google.android.gms.maps.model.SquareCap();
        }
        if (i == 2) {
            return new com.google.android.gms.maps.model.RoundCap();
        }
        if (i != 3) {
            return this;
        }
        com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor = this.zzc;
        com.google.android.gms.common.internal.Preconditions.checkState(bitmapDescriptor != null, "bitmapDescriptor must not be null");
        java.lang.Float f = this.zzd;
        com.google.android.gms.common.internal.Preconditions.checkState(f != null, "bitmapRefWidth must not be null");
        return new com.google.android.gms.maps.model.CustomCap(bitmapDescriptor, f.floatValue());
    }

    protected Cap(com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor, float f) {
        this(3, bitmapDescriptor, java.lang.Float.valueOf(f));
    }
}
