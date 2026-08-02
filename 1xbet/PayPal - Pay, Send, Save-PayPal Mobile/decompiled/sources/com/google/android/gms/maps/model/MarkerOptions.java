package com.google.android.gms.maps.model;

/* loaded from: classes.dex */
public class MarkerOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.MarkerOptions> CREATOR = new com.google.android.gms.maps.model.zzp();
    private com.google.android.gms.maps.model.LatLng zza;
    private java.lang.String zzb;
    private java.lang.String zzc;
    private com.google.android.gms.maps.model.BitmapDescriptor zzd;
    private float zze;
    private float zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private float zzn;

    @com.google.android.gms.maps.model.AdvancedMarkerOptions.CollisionBehavior
    private int zzo;
    private android.view.View zzp;
    private int zzq;
    private java.lang.String zzr;

    public MarkerOptions() {
        this.zze = 0.5f;
        this.zzf = 1.0f;
        this.zzh = true;
        this.zzi = false;
        this.zzj = 0.0f;
        this.zzk = 0.5f;
        this.zzl = 0.0f;
        this.zzm = 1.0f;
        this.zzo = 0;
    }

    public com.google.android.gms.maps.model.MarkerOptions position(com.google.android.gms.maps.model.LatLng latLng) {
        if (latLng == null) {
            throw new java.lang.IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        this.zza = latLng;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getPosition(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getTitle(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, getSnippet(), false);
        com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor = this.zzd;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 5, bitmapDescriptor == null ? null : bitmapDescriptor.zza().asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 6, getAnchorU());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 7, getAnchorV());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, isDraggable());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 9, isVisible());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 10, isFlat());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 11, getRotation());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 12, getInfoWindowAnchorU());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 13, getInfoWindowAnchorV());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 14, getAlpha());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 15, getZIndex());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 17, this.zzo);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 18, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zzp).asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 19, this.zzq);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 20, this.zzr, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    MarkerOptions(com.google.android.gms.maps.model.LatLng latLng, java.lang.String str, java.lang.String str2, android.os.IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7, int i, android.os.IBinder iBinder2, int i2, java.lang.String str3) {
        this.zze = 0.5f;
        this.zzf = 1.0f;
        this.zzh = true;
        this.zzi = false;
        this.zzj = 0.0f;
        this.zzk = 0.5f;
        this.zzl = 0.0f;
        this.zzm = 1.0f;
        this.zzo = 0;
        this.zza = latLng;
        this.zzb = str;
        this.zzc = str2;
        if (iBinder == null) {
            this.zzd = null;
        } else {
            this.zzd = new com.google.android.gms.maps.model.BitmapDescriptor(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(iBinder));
        }
        this.zze = f;
        this.zzf = f2;
        this.zzg = z;
        this.zzh = z2;
        this.zzi = z3;
        this.zzj = f3;
        this.zzk = f4;
        this.zzl = f5;
        this.zzm = f6;
        this.zzn = f7;
        this.zzq = i2;
        this.zzo = i;
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(iBinder2);
        this.zzp = asInterface != null ? (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(asInterface) : null;
        this.zzr = str3;
    }

    public final com.google.android.gms.maps.model.MarkerOptions zzf(int i) {
        this.zzq = 1;
        return this;
    }

    public final com.google.android.gms.maps.model.MarkerOptions zze(android.view.View view) {
        this.zzp = view;
        return this;
    }

    public final com.google.android.gms.maps.model.MarkerOptions zzd(@com.google.android.gms.maps.model.AdvancedMarkerOptions.CollisionBehavior int i) {
        this.zzo = i;
        return this;
    }

    public final android.view.View zzc() {
        return this.zzp;
    }

    public final int zzb() {
        return this.zzq;
    }

    public final int zza() {
        return this.zzo;
    }

    public com.google.android.gms.maps.model.MarkerOptions zIndex(float f) {
        this.zzn = f;
        return this;
    }

    public com.google.android.gms.maps.model.MarkerOptions visible(boolean z) {
        this.zzh = z;
        return this;
    }

    public com.google.android.gms.maps.model.MarkerOptions title(java.lang.String str) {
        this.zzb = str;
        return this;
    }

    public com.google.android.gms.maps.model.MarkerOptions snippet(java.lang.String str) {
        this.zzc = str;
        return this;
    }

    public com.google.android.gms.maps.model.MarkerOptions rotation(float f) {
        this.zzj = f;
        return this;
    }

    public boolean isVisible() {
        return this.zzh;
    }

    public boolean isFlat() {
        return this.zzi;
    }

    public boolean isDraggable() {
        return this.zzg;
    }

    public com.google.android.gms.maps.model.MarkerOptions infoWindowAnchor(float f, float f2) {
        this.zzk = f;
        this.zzl = f2;
        return this;
    }

    public com.google.android.gms.maps.model.MarkerOptions icon(com.google.android.gms.maps.model.BitmapDescriptor bitmapDescriptor) {
        this.zzd = bitmapDescriptor;
        return this;
    }

    public float getZIndex() {
        return this.zzn;
    }

    public java.lang.String getTitle() {
        return this.zzb;
    }

    public java.lang.String getSnippet() {
        return this.zzc;
    }

    public float getRotation() {
        return this.zzj;
    }

    public com.google.android.gms.maps.model.LatLng getPosition() {
        return this.zza;
    }

    public float getInfoWindowAnchorV() {
        return this.zzl;
    }

    public float getInfoWindowAnchorU() {
        return this.zzk;
    }

    public com.google.android.gms.maps.model.BitmapDescriptor getIcon() {
        return this.zzd;
    }

    public float getAnchorV() {
        return this.zzf;
    }

    public float getAnchorU() {
        return this.zze;
    }

    public float getAlpha() {
        return this.zzm;
    }

    public com.google.android.gms.maps.model.MarkerOptions flat(boolean z) {
        this.zzi = z;
        return this;
    }

    public com.google.android.gms.maps.model.MarkerOptions draggable(boolean z) {
        this.zzg = z;
        return this;
    }

    public com.google.android.gms.maps.model.MarkerOptions contentDescription(java.lang.String str) {
        this.zzr = str;
        return this;
    }

    public com.google.android.gms.maps.model.MarkerOptions anchor(float f, float f2) {
        this.zze = f;
        this.zzf = f2;
        return this;
    }

    public com.google.android.gms.maps.model.MarkerOptions alpha(float f) {
        this.zzm = f;
        return this;
    }
}
