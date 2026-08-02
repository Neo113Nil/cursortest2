package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.dynamic.a;

/* loaded from: classes4.dex */
public final class GroundOverlayOptions extends a {

    @NonNull
    public static final Parcelable.Creator<GroundOverlayOptions> CREATOR = new zzd();
    public static final float NO_DIMENSION = -1.0f;
    private BitmapDescriptor zza;

    @Nullable
    private LatLng zzb;
    private float zzc;
    private float zzd;

    @Nullable
    private LatLngBounds zze;
    private float zzf;
    private float zzg;
    private boolean zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;

    public GroundOverlayOptions() {
        this.zzh = true;
        this.zzi = 0.0f;
        this.zzj = 0.5f;
        this.zzk = 0.5f;
        this.zzl = false;
    }

    private final GroundOverlayOptions zza(LatLng latLng, float f, float f2) {
        this.zzb = latLng;
        this.zzc = f;
        this.zzd = f2;
        return this;
    }

    @NonNull
    public GroundOverlayOptions anchor(float f, float f2) {
        this.zzj = f;
        this.zzk = f2;
        return this;
    }

    @NonNull
    public GroundOverlayOptions bearing(float f) {
        this.zzf = ((f % 360.0f) + 360.0f) % 360.0f;
        return this;
    }

    @NonNull
    public GroundOverlayOptions clickable(boolean z) {
        this.zzl = z;
        return this;
    }

    public float getAnchorU() {
        return this.zzj;
    }

    public float getAnchorV() {
        return this.zzk;
    }

    public float getBearing() {
        return this.zzf;
    }

    @Nullable
    public LatLngBounds getBounds() {
        return this.zze;
    }

    public float getHeight() {
        return this.zzd;
    }

    @NonNull
    public BitmapDescriptor getImage() {
        return this.zza;
    }

    @Nullable
    public LatLng getLocation() {
        return this.zzb;
    }

    public float getTransparency() {
        return this.zzi;
    }

    public float getWidth() {
        return this.zzc;
    }

    public float getZIndex() {
        return this.zzg;
    }

    @NonNull
    public GroundOverlayOptions image(@NonNull BitmapDescriptor bitmapDescriptor) {
        C0875q.h(bitmapDescriptor, "imageDescriptor must not be null");
        this.zza = bitmapDescriptor;
        return this;
    }

    public boolean isClickable() {
        return this.zzl;
    }

    public boolean isVisible() {
        return this.zzh;
    }

    @NonNull
    public GroundOverlayOptions position(@NonNull LatLng latLng, float f) {
        C0875q.i(this.zze == null, "Position has already been set using positionFromBounds");
        C0875q.b(latLng != null, "Location must be specified");
        C0875q.b(f >= 0.0f, "Width must be non-negative");
        zza(latLng, f, -1.0f);
        return this;
    }

    @NonNull
    public GroundOverlayOptions positionFromBounds(@NonNull LatLngBounds latLngBounds) {
        LatLng latLng = this.zzb;
        C0875q.i(latLng == null, "Position has already been set using position: ".concat(String.valueOf(latLng)));
        this.zze = latLngBounds;
        return this;
    }

    @NonNull
    public GroundOverlayOptions transparency(float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        C0875q.b(z, "Transparency must be in the range [0..1]");
        this.zzi = f;
        return this;
    }

    @NonNull
    public GroundOverlayOptions visible(boolean z) {
        this.zzh = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.f(parcel, 2, this.zza.zza().asBinder());
        c.k(parcel, 3, getLocation(), i, false);
        float width = getWidth();
        c.s(parcel, 4, 4);
        parcel.writeFloat(width);
        float height = getHeight();
        c.s(parcel, 5, 4);
        parcel.writeFloat(height);
        c.k(parcel, 6, getBounds(), i, false);
        float bearing = getBearing();
        c.s(parcel, 7, 4);
        parcel.writeFloat(bearing);
        float zIndex = getZIndex();
        c.s(parcel, 8, 4);
        parcel.writeFloat(zIndex);
        boolean isVisible = isVisible();
        c.s(parcel, 9, 4);
        parcel.writeInt(isVisible ? 1 : 0);
        float transparency = getTransparency();
        c.s(parcel, 10, 4);
        parcel.writeFloat(transparency);
        float anchorU = getAnchorU();
        c.s(parcel, 11, 4);
        parcel.writeFloat(anchorU);
        float anchorV = getAnchorV();
        c.s(parcel, 12, 4);
        parcel.writeFloat(anchorV);
        boolean isClickable = isClickable();
        c.s(parcel, 13, 4);
        parcel.writeInt(isClickable ? 1 : 0);
        c.r(parcel, q);
    }

    @NonNull
    public GroundOverlayOptions zIndex(float f) {
        this.zzg = f;
        return this;
    }

    public GroundOverlayOptions(IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7, boolean z2) {
        this.zzh = true;
        this.zzi = 0.0f;
        this.zzj = 0.5f;
        this.zzk = 0.5f;
        this.zzl = false;
        this.zza = new BitmapDescriptor(a.AbstractBinderC0114a.C(iBinder));
        this.zzb = latLng;
        this.zzc = f;
        this.zzd = f2;
        this.zze = latLngBounds;
        this.zzf = f3;
        this.zzg = f4;
        this.zzh = z;
        this.zzi = f5;
        this.zzj = f6;
        this.zzk = f7;
        this.zzl = z2;
    }

    @NonNull
    public GroundOverlayOptions position(@NonNull LatLng latLng, float f, float f2) {
        C0875q.i(this.zze == null, "Position has already been set using positionFromBounds");
        C0875q.b(latLng != null, "Location must be specified");
        C0875q.b(f >= 0.0f, "Width must be non-negative");
        C0875q.b(f2 >= 0.0f, "Height must be non-negative");
        zza(latLng, f, f2);
        return this;
    }
}
