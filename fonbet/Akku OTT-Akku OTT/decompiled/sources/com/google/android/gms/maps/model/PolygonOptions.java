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
public final class PolygonOptions extends a {

    @NonNull
    public static final Parcelable.Creator<PolygonOptions> CREATOR = new zzl();
    private final List<LatLng> zza;
    private final List<List<LatLng>> zzb;
    private float zzc;
    private int zzd;
    private int zze;
    private float zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzj;

    @Nullable
    private List<PatternItem> zzk;

    public PolygonOptions() {
        this.zzc = 10.0f;
        this.zzd = ViewCompat.MEASURED_STATE_MASK;
        this.zze = 0;
        this.zzf = 0.0f;
        this.zzg = true;
        this.zzh = false;
        this.zzi = false;
        this.zzj = 0;
        this.zzk = null;
        this.zza = new ArrayList();
        this.zzb = new ArrayList();
    }

    @NonNull
    public PolygonOptions add(@NonNull LatLng latLng) {
        C0875q.h(latLng, "point must not be null.");
        this.zza.add(latLng);
        return this;
    }

    @NonNull
    public PolygonOptions addAll(@NonNull Iterable<LatLng> iterable) {
        C0875q.h(iterable, "points must not be null.");
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.zza.add(it.next());
        }
        return this;
    }

    @NonNull
    public PolygonOptions addHole(@NonNull Iterable<LatLng> iterable) {
        C0875q.h(iterable, "points must not be null.");
        ArrayList arrayList = new ArrayList();
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        this.zzb.add(arrayList);
        return this;
    }

    @NonNull
    public PolygonOptions clickable(boolean z) {
        this.zzi = z;
        return this;
    }

    @NonNull
    public PolygonOptions fillColor(int i) {
        this.zze = i;
        return this;
    }

    @NonNull
    public PolygonOptions geodesic(boolean z) {
        this.zzh = z;
        return this;
    }

    public int getFillColor() {
        return this.zze;
    }

    @NonNull
    public List<List<LatLng>> getHoles() {
        return this.zzb;
    }

    @NonNull
    public List<LatLng> getPoints() {
        return this.zza;
    }

    public int getStrokeColor() {
        return this.zzd;
    }

    public int getStrokeJointType() {
        return this.zzj;
    }

    @Nullable
    public List<PatternItem> getStrokePattern() {
        return this.zzk;
    }

    public float getStrokeWidth() {
        return this.zzc;
    }

    public float getZIndex() {
        return this.zzf;
    }

    public boolean isClickable() {
        return this.zzi;
    }

    public boolean isGeodesic() {
        return this.zzh;
    }

    public boolean isVisible() {
        return this.zzg;
    }

    @NonNull
    public PolygonOptions strokeColor(int i) {
        this.zzd = i;
        return this;
    }

    @NonNull
    public PolygonOptions strokeJointType(int i) {
        this.zzj = i;
        return this;
    }

    @NonNull
    public PolygonOptions strokePattern(@Nullable List<PatternItem> list) {
        this.zzk = list;
        return this;
    }

    @NonNull
    public PolygonOptions strokeWidth(float f) {
        this.zzc = f;
        return this;
    }

    @NonNull
    public PolygonOptions visible(boolean z) {
        this.zzg = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.p(parcel, 2, getPoints(), false);
        List<List<LatLng>> list = this.zzb;
        if (list != null) {
            int q2 = c.q(parcel, 3);
            parcel.writeList(list);
            c.r(parcel, q2);
        }
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
        boolean isGeodesic = isGeodesic();
        c.s(parcel, 9, 4);
        parcel.writeInt(isGeodesic ? 1 : 0);
        boolean isClickable = isClickable();
        c.s(parcel, 10, 4);
        parcel.writeInt(isClickable ? 1 : 0);
        int strokeJointType = getStrokeJointType();
        c.s(parcel, 11, 4);
        parcel.writeInt(strokeJointType);
        c.p(parcel, 12, getStrokePattern(), false);
        c.r(parcel, q);
    }

    @NonNull
    public PolygonOptions zIndex(float f) {
        this.zzf = f;
        return this;
    }

    @NonNull
    public PolygonOptions add(@NonNull LatLng... latLngArr) {
        C0875q.h(latLngArr, "points must not be null.");
        this.zza.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public PolygonOptions(List<LatLng> list, List list2, float f, int i, int i2, float f2, boolean z, boolean z2, boolean z3, int i3, @Nullable List<PatternItem> list3) {
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
}
