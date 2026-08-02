package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class PolylineOptions extends a {

    @NonNull
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new zzm();
    private final List<LatLng> zza;
    private float zzb;
    private int zzc;
    private float zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private Cap zzh;
    private Cap zzi;
    private int zzj;

    @Nullable
    private List<PatternItem> zzk;

    public PolylineOptions() {
        this.zzb = 10.0f;
        this.zzc = ViewCompat.MEASURED_STATE_MASK;
        this.zzd = 0.0f;
        this.zze = true;
        this.zzf = false;
        this.zzg = false;
        this.zzh = new ButtCap();
        this.zzi = new ButtCap();
        this.zzj = 0;
        this.zzk = null;
        this.zza = new ArrayList();
    }

    @NonNull
    public PolylineOptions add(@NonNull LatLng latLng) {
        C0875q.h(this.zza, "point must not be null.");
        this.zza.add(latLng);
        return this;
    }

    @NonNull
    public PolylineOptions addAll(@NonNull Iterable<LatLng> iterable) {
        C0875q.h(iterable, "points must not be null.");
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.zza.add(it.next());
        }
        return this;
    }

    @NonNull
    public PolylineOptions clickable(boolean z) {
        this.zzg = z;
        return this;
    }

    @NonNull
    public PolylineOptions color(int i) {
        this.zzc = i;
        return this;
    }

    @NonNull
    public PolylineOptions endCap(@NonNull Cap cap) {
        C0875q.h(cap, "endCap must not be null");
        this.zzi = cap;
        return this;
    }

    @NonNull
    public PolylineOptions geodesic(boolean z) {
        this.zzf = z;
        return this;
    }

    public int getColor() {
        return this.zzc;
    }

    @NonNull
    public Cap getEndCap() {
        return this.zzi;
    }

    public int getJointType() {
        return this.zzj;
    }

    @Nullable
    public List<PatternItem> getPattern() {
        return this.zzk;
    }

    @NonNull
    public List<LatLng> getPoints() {
        return this.zza;
    }

    @NonNull
    public Cap getStartCap() {
        return this.zzh;
    }

    public float getWidth() {
        return this.zzb;
    }

    public float getZIndex() {
        return this.zzd;
    }

    public boolean isClickable() {
        return this.zzg;
    }

    public boolean isGeodesic() {
        return this.zzf;
    }

    public boolean isVisible() {
        return this.zze;
    }

    @NonNull
    public PolylineOptions jointType(int i) {
        this.zzj = i;
        return this;
    }

    @NonNull
    public PolylineOptions pattern(@Nullable List<PatternItem> list) {
        this.zzk = list;
        return this;
    }

    @NonNull
    public PolylineOptions startCap(@NonNull Cap cap) {
        C0875q.h(cap, "startCap must not be null");
        this.zzh = cap;
        return this;
    }

    @NonNull
    public PolylineOptions visible(boolean z) {
        this.zze = z;
        return this;
    }

    @NonNull
    public PolylineOptions width(float f) {
        this.zzb = f;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.p(parcel, 2, getPoints(), false);
        float width = getWidth();
        c.s(parcel, 3, 4);
        parcel.writeFloat(width);
        int color = getColor();
        c.s(parcel, 4, 4);
        parcel.writeInt(color);
        float zIndex = getZIndex();
        c.s(parcel, 5, 4);
        parcel.writeFloat(zIndex);
        boolean isVisible = isVisible();
        c.s(parcel, 6, 4);
        parcel.writeInt(isVisible ? 1 : 0);
        boolean isGeodesic = isGeodesic();
        c.s(parcel, 7, 4);
        parcel.writeInt(isGeodesic ? 1 : 0);
        boolean isClickable = isClickable();
        c.s(parcel, 8, 4);
        parcel.writeInt(isClickable ? 1 : 0);
        c.k(parcel, 9, getStartCap(), i, false);
        c.k(parcel, 10, getEndCap(), i, false);
        int jointType = getJointType();
        c.s(parcel, 11, 4);
        parcel.writeInt(jointType);
        c.p(parcel, 12, getPattern(), false);
        c.r(parcel, q);
    }

    @NonNull
    public PolylineOptions zIndex(float f) {
        this.zzd = f;
        return this;
    }

    @NonNull
    public PolylineOptions add(@NonNull LatLng... latLngArr) {
        C0875q.h(latLngArr, "points must not be null.");
        this.zza.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public PolylineOptions(List list, float f, int i, float f2, boolean z, boolean z2, boolean z3, @Nullable Cap cap, @Nullable Cap cap2, int i2, @Nullable List<PatternItem> list2) {
        this.zzb = 10.0f;
        this.zzc = ViewCompat.MEASURED_STATE_MASK;
        this.zzd = 0.0f;
        this.zze = true;
        this.zzf = false;
        this.zzg = false;
        this.zzh = new ButtCap();
        this.zzi = new ButtCap();
        this.zza = list;
        this.zzb = f;
        this.zzc = i;
        this.zzd = f2;
        this.zze = z;
        this.zzf = z2;
        this.zzg = z3;
        if (cap != null) {
            this.zzh = cap;
        }
        if (cap2 != null) {
            this.zzi = cap2;
        }
        this.zzj = i2;
        this.zzk = list2;
    }
}
