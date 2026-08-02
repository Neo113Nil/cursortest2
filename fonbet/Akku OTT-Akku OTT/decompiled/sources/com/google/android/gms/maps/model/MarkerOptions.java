package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.dynamic.a;

/* loaded from: classes4.dex */
public final class MarkerOptions extends a {

    @NonNull
    public static final Parcelable.Creator<MarkerOptions> CREATOR = new zzi();
    private LatLng zza;

    @Nullable
    private String zzb;

    @Nullable
    private String zzc;

    @Nullable
    private BitmapDescriptor zzd;
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

    public MarkerOptions() {
        this.zze = 0.5f;
        this.zzf = 1.0f;
        this.zzh = true;
        this.zzi = false;
        this.zzj = 0.0f;
        this.zzk = 0.5f;
        this.zzl = 0.0f;
        this.zzm = 1.0f;
    }

    @NonNull
    public MarkerOptions alpha(float f) {
        this.zzm = f;
        return this;
    }

    @NonNull
    public MarkerOptions anchor(float f, float f2) {
        this.zze = f;
        this.zzf = f2;
        return this;
    }

    @NonNull
    public MarkerOptions draggable(boolean z) {
        this.zzg = z;
        return this;
    }

    @NonNull
    public MarkerOptions flat(boolean z) {
        this.zzi = z;
        return this;
    }

    public float getAlpha() {
        return this.zzm;
    }

    public float getAnchorU() {
        return this.zze;
    }

    public float getAnchorV() {
        return this.zzf;
    }

    @Nullable
    public BitmapDescriptor getIcon() {
        return this.zzd;
    }

    public float getInfoWindowAnchorU() {
        return this.zzk;
    }

    public float getInfoWindowAnchorV() {
        return this.zzl;
    }

    @NonNull
    public LatLng getPosition() {
        return this.zza;
    }

    public float getRotation() {
        return this.zzj;
    }

    @Nullable
    public String getSnippet() {
        return this.zzc;
    }

    @Nullable
    public String getTitle() {
        return this.zzb;
    }

    public float getZIndex() {
        return this.zzn;
    }

    @NonNull
    public MarkerOptions icon(@Nullable BitmapDescriptor bitmapDescriptor) {
        this.zzd = bitmapDescriptor;
        return this;
    }

    @NonNull
    public MarkerOptions infoWindowAnchor(float f, float f2) {
        this.zzk = f;
        this.zzl = f2;
        return this;
    }

    public boolean isDraggable() {
        return this.zzg;
    }

    public boolean isFlat() {
        return this.zzi;
    }

    public boolean isVisible() {
        return this.zzh;
    }

    @NonNull
    public MarkerOptions position(@NonNull LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        this.zza = latLng;
        return this;
    }

    @NonNull
    public MarkerOptions rotation(float f) {
        this.zzj = f;
        return this;
    }

    @NonNull
    public MarkerOptions snippet(@Nullable String str) {
        this.zzc = str;
        return this;
    }

    @NonNull
    public MarkerOptions title(@Nullable String str) {
        this.zzb = str;
        return this;
    }

    @NonNull
    public MarkerOptions visible(boolean z) {
        this.zzh = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.k(parcel, 2, getPosition(), i, false);
        c.l(parcel, 3, getTitle(), false);
        c.l(parcel, 4, getSnippet(), false);
        BitmapDescriptor bitmapDescriptor = this.zzd;
        c.f(parcel, 5, bitmapDescriptor == null ? null : bitmapDescriptor.zza().asBinder());
        float anchorU = getAnchorU();
        c.s(parcel, 6, 4);
        parcel.writeFloat(anchorU);
        float anchorV = getAnchorV();
        c.s(parcel, 7, 4);
        parcel.writeFloat(anchorV);
        boolean isDraggable = isDraggable();
        c.s(parcel, 8, 4);
        parcel.writeInt(isDraggable ? 1 : 0);
        boolean isVisible = isVisible();
        c.s(parcel, 9, 4);
        parcel.writeInt(isVisible ? 1 : 0);
        boolean isFlat = isFlat();
        c.s(parcel, 10, 4);
        parcel.writeInt(isFlat ? 1 : 0);
        float rotation = getRotation();
        c.s(parcel, 11, 4);
        parcel.writeFloat(rotation);
        float infoWindowAnchorU = getInfoWindowAnchorU();
        c.s(parcel, 12, 4);
        parcel.writeFloat(infoWindowAnchorU);
        float infoWindowAnchorV = getInfoWindowAnchorV();
        c.s(parcel, 13, 4);
        parcel.writeFloat(infoWindowAnchorV);
        float alpha = getAlpha();
        c.s(parcel, 14, 4);
        parcel.writeFloat(alpha);
        float zIndex = getZIndex();
        c.s(parcel, 15, 4);
        parcel.writeFloat(zIndex);
        c.r(parcel, q);
    }

    @NonNull
    public MarkerOptions zIndex(float f) {
        this.zzn = f;
        return this;
    }

    public MarkerOptions(LatLng latLng, String str, String str2, @Nullable IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7) {
        this.zze = 0.5f;
        this.zzf = 1.0f;
        this.zzh = true;
        this.zzi = false;
        this.zzj = 0.0f;
        this.zzk = 0.5f;
        this.zzl = 0.0f;
        this.zzm = 1.0f;
        this.zza = latLng;
        this.zzb = str;
        this.zzc = str2;
        if (iBinder == null) {
            this.zzd = null;
        } else {
            this.zzd = new BitmapDescriptor(a.AbstractBinderC0114a.C(iBinder));
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
    }
}
