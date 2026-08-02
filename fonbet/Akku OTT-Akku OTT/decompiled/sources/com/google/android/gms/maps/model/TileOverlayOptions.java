package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.maps.zzai;
import com.google.android.gms.internal.maps.zzaj;

/* loaded from: classes4.dex */
public final class TileOverlayOptions extends a {

    @NonNull
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new zzv();

    @Nullable
    private zzaj zza;

    @Nullable
    private TileProvider zzb;
    private boolean zzc;
    private float zzd;
    private boolean zze;
    private float zzf;

    public TileOverlayOptions() {
        this.zzc = true;
        this.zze = true;
        this.zzf = 0.0f;
    }

    @NonNull
    public TileOverlayOptions fadeIn(boolean z) {
        this.zze = z;
        return this;
    }

    public boolean getFadeIn() {
        return this.zze;
    }

    @Nullable
    public TileProvider getTileProvider() {
        return this.zzb;
    }

    public float getTransparency() {
        return this.zzf;
    }

    public float getZIndex() {
        return this.zzd;
    }

    public boolean isVisible() {
        return this.zzc;
    }

    @NonNull
    public TileOverlayOptions tileProvider(@NonNull TileProvider tileProvider) {
        C0875q.h(tileProvider, "tileProvider must not be null.");
        this.zzb = tileProvider;
        this.zza = new zzu(this, tileProvider);
        return this;
    }

    @NonNull
    public TileOverlayOptions transparency(float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        C0875q.b(z, "Transparency must be in the range [0..1]");
        this.zzf = f;
        return this;
    }

    @NonNull
    public TileOverlayOptions visible(boolean z) {
        this.zzc = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        zzaj zzajVar = this.zza;
        c.f(parcel, 2, zzajVar == null ? null : zzajVar.asBinder());
        boolean isVisible = isVisible();
        c.s(parcel, 3, 4);
        parcel.writeInt(isVisible ? 1 : 0);
        float zIndex = getZIndex();
        c.s(parcel, 4, 4);
        parcel.writeFloat(zIndex);
        boolean fadeIn = getFadeIn();
        c.s(parcel, 5, 4);
        parcel.writeInt(fadeIn ? 1 : 0);
        float transparency = getTransparency();
        c.s(parcel, 6, 4);
        parcel.writeFloat(transparency);
        c.r(parcel, q);
    }

    @NonNull
    public TileOverlayOptions zIndex(float f) {
        this.zzd = f;
        return this;
    }

    public TileOverlayOptions(IBinder iBinder, boolean z, float f, boolean z2, float f2) {
        this.zzc = true;
        this.zze = true;
        this.zzf = 0.0f;
        zzaj zzc = zzai.zzc(iBinder);
        this.zza = zzc;
        this.zzb = zzc == null ? null : new zzt(this);
        this.zzc = z;
        this.zzd = f;
        this.zze = z2;
        this.zzf = f2;
    }
}
