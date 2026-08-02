package com.google.android.gms.maps.model;

/* loaded from: classes.dex */
public final class TileOverlayOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.TileOverlayOptions> CREATOR = new com.google.android.gms.maps.model.zzaj();
    private com.google.android.gms.internal.maps.zzaz zza;
    private com.google.android.gms.maps.model.TileProvider zzb;
    private boolean zzc;
    private float zzd;
    private boolean zze;
    private float zzf;

    public TileOverlayOptions() {
        this.zzc = true;
        this.zze = true;
        this.zzf = 0.0f;
    }

    public final com.google.android.gms.maps.model.TileOverlayOptions tileProvider(com.google.android.gms.maps.model.TileProvider tileProvider) {
        this.zzb = (com.google.android.gms.maps.model.TileProvider) com.google.android.gms.common.internal.Preconditions.checkNotNull(tileProvider, "tileProvider must not be null.");
        this.zza = new com.google.android.gms.maps.model.zzai(this, tileProvider);
        return this;
    }

    public final com.google.android.gms.maps.model.TileOverlayOptions transparency(float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(z, "Transparency must be in the range [0..1]");
        this.zzf = f;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.internal.maps.zzaz zzazVar = this.zza;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, zzazVar == null ? null : zzazVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, isVisible());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 4, getZIndex());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, getFadeIn());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 6, getTransparency());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    TileOverlayOptions(android.os.IBinder iBinder, boolean z, float f, boolean z2, float f2) {
        this.zzc = true;
        this.zze = true;
        this.zzf = 0.0f;
        com.google.android.gms.internal.maps.zzaz zzc = com.google.android.gms.internal.maps.zzay.zzc(iBinder);
        this.zza = zzc;
        this.zzb = zzc == null ? null : new com.google.android.gms.maps.model.zzah(this);
        this.zzc = z;
        this.zzd = f;
        this.zze = z2;
        this.zzf = f2;
    }

    public final com.google.android.gms.maps.model.TileOverlayOptions zIndex(float f) {
        this.zzd = f;
        return this;
    }

    public final com.google.android.gms.maps.model.TileOverlayOptions visible(boolean z) {
        this.zzc = z;
        return this;
    }

    public final boolean isVisible() {
        return this.zzc;
    }

    public final float getZIndex() {
        return this.zzd;
    }

    public final float getTransparency() {
        return this.zzf;
    }

    public final com.google.android.gms.maps.model.TileProvider getTileProvider() {
        return this.zzb;
    }

    public final boolean getFadeIn() {
        return this.zze;
    }

    public final com.google.android.gms.maps.model.TileOverlayOptions fadeIn(boolean z) {
        this.zze = z;
        return this;
    }
}
