package com.google.android.gms.maps.model;

/* loaded from: classes.dex */
public final class PolygonOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.PolygonOptions> CREATOR = new com.google.android.gms.maps.model.zzt();
    private final java.util.List zza;
    private final java.util.List zzb;
    private float zzc;
    private int zzd;
    private int zze;
    private float zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzj;
    private java.util.List zzk;

    public PolygonOptions() {
        this.zzc = 10.0f;
        this.zzd = -16777216;
        this.zze = 0;
        this.zzf = 0.0f;
        this.zzg = true;
        this.zzh = false;
        this.zzi = false;
        this.zzj = 0;
        this.zzk = null;
        this.zza = new java.util.ArrayList();
        this.zzb = new java.util.ArrayList();
    }

    public final com.google.android.gms.maps.model.PolygonOptions add(com.google.android.gms.maps.model.LatLng latLng) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(latLng, "point must not be null.");
        this.zza.add(latLng);
        return this;
    }

    public final com.google.android.gms.maps.model.PolygonOptions addAll(java.lang.Iterable<com.google.android.gms.maps.model.LatLng> iterable) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(iterable, "points must not be null.");
        java.util.Iterator<com.google.android.gms.maps.model.LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.zza.add(it.next());
        }
        return this;
    }

    public final com.google.android.gms.maps.model.PolygonOptions addHole(java.lang.Iterable<com.google.android.gms.maps.model.LatLng> iterable) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(iterable, "points must not be null.");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.google.android.gms.maps.model.LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        this.zzb.add(arrayList);
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, getPoints(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeList(parcel, 3, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 4, getStrokeWidth());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, getStrokeColor());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, getFillColor());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 7, getZIndex());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, isVisible());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 9, isGeodesic());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 10, isClickable());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 11, getStrokeJointType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 12, getStrokePattern(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final com.google.android.gms.maps.model.PolygonOptions add(com.google.android.gms.maps.model.LatLng... latLngArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(latLngArr, "points must not be null.");
        this.zza.addAll(java.util.Arrays.asList(latLngArr));
        return this;
    }

    PolygonOptions(java.util.List list, java.util.List list2, float f, int i, int i2, float f2, boolean z, boolean z2, boolean z3, int i3, java.util.List list3) {
        this.zza = list;
        this.zzb = list2;
        this.zzc = f;
        this.zzd = i;
        this.zze = i2;
        this.zzf = f2;
        this.zzg = z;
        this.zzh = z2;
        this.zzi = z3;
        this.zzj = i3;
        this.zzk = list3;
    }

    public final com.google.android.gms.maps.model.PolygonOptions zIndex(float f) {
        this.zzf = f;
        return this;
    }

    public final com.google.android.gms.maps.model.PolygonOptions visible(boolean z) {
        this.zzg = z;
        return this;
    }

    public final com.google.android.gms.maps.model.PolygonOptions strokeWidth(float f) {
        this.zzc = f;
        return this;
    }

    public final com.google.android.gms.maps.model.PolygonOptions strokePattern(java.util.List<com.google.android.gms.maps.model.PatternItem> list) {
        this.zzk = list;
        return this;
    }

    public final com.google.android.gms.maps.model.PolygonOptions strokeJointType(int i) {
        this.zzj = i;
        return this;
    }

    public final com.google.android.gms.maps.model.PolygonOptions strokeColor(int i) {
        this.zzd = i;
        return this;
    }

    public final boolean isVisible() {
        return this.zzg;
    }

    public final boolean isGeodesic() {
        return this.zzh;
    }

    public final boolean isClickable() {
        return this.zzi;
    }

    public final float getZIndex() {
        return this.zzf;
    }

    public final float getStrokeWidth() {
        return this.zzc;
    }

    public final java.util.List<com.google.android.gms.maps.model.PatternItem> getStrokePattern() {
        return this.zzk;
    }

    public final int getStrokeJointType() {
        return this.zzj;
    }

    public final int getStrokeColor() {
        return this.zzd;
    }

    public final java.util.List<com.google.android.gms.maps.model.LatLng> getPoints() {
        return this.zza;
    }

    public final java.util.List<java.util.List<com.google.android.gms.maps.model.LatLng>> getHoles() {
        return this.zzb;
    }

    public final int getFillColor() {
        return this.zze;
    }

    public final com.google.android.gms.maps.model.PolygonOptions geodesic(boolean z) {
        this.zzh = z;
        return this;
    }

    public final com.google.android.gms.maps.model.PolygonOptions fillColor(int i) {
        this.zze = i;
        return this;
    }

    public final com.google.android.gms.maps.model.PolygonOptions clickable(boolean z) {
        this.zzi = z;
        return this;
    }
}
