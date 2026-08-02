package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.List;

/* loaded from: classes4.dex */
public final class CircleOptions extends a {

    @NonNull
    public static final Parcelable.Creator<CircleOptions> CREATOR = new zzc();

    @Nullable
    private LatLng zza;
    private double zzb;
    private float zzc;
    private int zzd;
    private int zze;
    private float zzf;
    private boolean zzg;
    private boolean zzh;

    @Nullable
    private List<PatternItem> zzi;

    public CircleOptions() {
        this.zza = null;
        this.zzb = 0.0d;
        this.zzc = 10.0f;
        this.zzd = ViewCompat.MEASURED_STATE_MASK;
        this.zze = 0;
        this.zzf = 0.0f;
        this.zzg = true;
        this.zzh = false;
        this.zzi = null;
    }

    @NonNull
    public CircleOptions center(@NonNull LatLng latLng) {
        C0875q.h(latLng, "center must not be null.");
        this.zza = latLng;
        return this;
    }

    @NonNull
    public CircleOptions clickable(boolean z) {
        this.zzh = z;
        return this;
    }

    @NonNull
    public CircleOptions fillColor(int i) {
        this.zze = i;
        return this;
    }

    @Nullable
    public LatLng getCenter() {
        return this.zza;
    }

    public int getFillColor() {
        return this.zze;
    }

    public double getRadius() {
        return this.zzb;
    }

    public int getStrokeColor() {
        return this.zzd;
    }

    @Nullable
    public List<PatternItem> getStrokePattern() {
        return this.zzi;
    }

    public float getStrokeWidth() {
        return this.zzc;
    }

    public float getZIndex() {
        return this.zzf;
    }

    public boolean isClickable() {
        return this.zzh;
    }

    public boolean isVisible() {
        return this.zzg;
    }

    @NonNull
    public CircleOptions radius(double d) {
        this.zzb = d;
        return this;
    }

    @NonNull
    public CircleOptions strokeColor(int i) {
        this.zzd = i;
        return this;
    }

    @NonNull
    public CircleOptions strokePattern(@Nullable List<PatternItem> list) {
        this.zzi = list;
        return this;
    }

    @NonNull
    public CircleOptions strokeWidth(float f) {
        this.zzc = f;
        return this;
    }

    @NonNull
    public CircleOptions visible(boolean z) {
        this.zzg = z;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.k(parcel, 2, getCenter(), i, false);
        double radius = getRadius();
        c.s(parcel, 3, 8);
        parcel.writeDouble(radius);
        float strokeWidth = getStrokeWidth();
        c.s(parcel, 4, 4);
        parcel.writeFloat(strokeWidth);
        int strokeColor = getStrokeColor();
        c.s(parcel, 5, 4);
        parcel.writeInt(strokeColor);
        int fillColor = getFillColor();
        c.s(parcel, 6, 4);
        parcel.writeInt(fillColor);
        float zIndex = getZIndex();
        c.s(parcel, 7, 4);
        parcel.writeFloat(zIndex);
        boolean isVisible = isVisible();
        c.s(parcel, 8, 4);
        parcel.writeInt(isVisible ? 1 : 0);
        boolean isClickable = isClickable();
        c.s(parcel, 9, 4);
        parcel.writeInt(isClickable ? 1 : 0);
        c.p(parcel, 10, getStrokePattern(), false);
        c.r(parcel, q);
    }

    @NonNull
    public CircleOptions zIndex(float f) {
        this.zzf = f;
        return this;
    }

    public CircleOptions(LatLng latLng, double d, float f, int i, int i2, float f2, boolean z, boolean z2, @Nullable List<PatternItem> list) {
        this.zza = latLng;
        this.zzb = d;
        this.zzc = f;
        this.zzd = i;
        this.zze = i2;
        this.zzf = f2;
        this.zzg = z;
        this.zzh = z2;
        this.zzi = list;
    }
}
