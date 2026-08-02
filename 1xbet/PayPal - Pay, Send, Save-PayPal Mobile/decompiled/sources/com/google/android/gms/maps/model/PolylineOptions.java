package com.google.android.gms.maps.model;

/* loaded from: classes.dex */
public final class PolylineOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.maps.model.PolylineOptions> CREATOR = new com.google.android.gms.maps.model.zzu();
    private final java.util.List zza;
    private float zzb;
    private int zzc;
    private float zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private com.google.android.gms.maps.model.Cap zzh;
    private com.google.android.gms.maps.model.Cap zzi;
    private int zzj;
    private java.util.List zzk;
    private java.util.List zzl;

    public PolylineOptions() {
        this.zzb = 10.0f;
        this.zzc = -16777216;
        this.zzd = 0.0f;
        this.zze = true;
        this.zzf = false;
        this.zzg = false;
        this.zzh = new com.google.android.gms.maps.model.ButtCap();
        this.zzi = new com.google.android.gms.maps.model.ButtCap();
        this.zzj = 0;
        this.zzk = null;
        this.zzl = new java.util.ArrayList();
        this.zza = new java.util.ArrayList();
    }

    public final com.google.android.gms.maps.model.PolylineOptions add(com.google.android.gms.maps.model.LatLng latLng) {
        java.util.List list = this.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(list, "point must not be null.");
        list.add(latLng);
        return this;
    }

    public final com.google.android.gms.maps.model.PolylineOptions addAll(java.lang.Iterable<com.google.android.gms.maps.model.LatLng> iterable) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(iterable, "points must not be null.");
        java.util.Iterator<com.google.android.gms.maps.model.LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.zza.add(it.next());
        }
        return this;
    }

    public final com.google.android.gms.maps.model.PolylineOptions addAllSpans(java.lang.Iterable<com.google.android.gms.maps.model.StyleSpan> iterable) {
        java.util.Iterator<com.google.android.gms.maps.model.StyleSpan> it = iterable.iterator();
        while (it.hasNext()) {
            addSpan(it.next());
        }
        return this;
    }

    public final com.google.android.gms.maps.model.PolylineOptions addSpan(com.google.android.gms.maps.model.StyleSpan styleSpan) {
        this.zzl.add(styleSpan);
        return this;
    }

    public final com.google.android.gms.maps.model.PolylineOptions endCap(com.google.android.gms.maps.model.Cap cap) {
        this.zzi = (com.google.android.gms.maps.model.Cap) com.google.android.gms.common.internal.Preconditions.checkNotNull(cap, "endCap must not be null");
        return this;
    }

    public final com.google.android.gms.maps.model.Cap getEndCap() {
        return this.zzi.zza();
    }

    public final com.google.android.gms.maps.model.Cap getStartCap() {
        return this.zzh.zza();
    }

    public final com.google.android.gms.maps.model.PolylineOptions startCap(com.google.android.gms.maps.model.Cap cap) {
        this.zzh = (com.google.android.gms.maps.model.Cap) com.google.android.gms.common.internal.Preconditions.checkNotNull(cap, "startCap must not be null");
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, getPoints(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 3, getWidth());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, getColor());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 5, getZIndex());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 6, isVisible());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 7, isGeodesic());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, isClickable());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 9, getStartCap(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 10, getEndCap(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 11, getJointType());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 12, getPattern(), false);
        java.util.ArrayList arrayList = new java.util.ArrayList(this.zzl.size());
        for (com.google.android.gms.maps.model.StyleSpan styleSpan : this.zzl) {
            com.google.android.gms.maps.model.StrokeStyle.Builder builder = new com.google.android.gms.maps.model.StrokeStyle.Builder(styleSpan.getStyle());
            builder.zzd(this.zzb);
            builder.zzc(this.zze);
            arrayList.add(new com.google.android.gms.maps.model.StyleSpan(builder.build(), styleSpan.getSegments()));
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 13, arrayList, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final com.google.android.gms.maps.model.PolylineOptions addSpan(com.google.android.gms.maps.model.StyleSpan... styleSpanArr) {
        for (com.google.android.gms.maps.model.StyleSpan styleSpan : styleSpanArr) {
            addSpan(styleSpan);
        }
        return this;
    }

    public final com.google.android.gms.maps.model.PolylineOptions add(com.google.android.gms.maps.model.LatLng... latLngArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(latLngArr, "points must not be null.");
        java.util.Collections.addAll(this.zza, latLngArr);
        return this;
    }

    PolylineOptions(java.util.List list, float f, int i, float f2, boolean z, boolean z2, boolean z3, com.google.android.gms.maps.model.Cap cap, com.google.android.gms.maps.model.Cap cap2, int i2, java.util.List list2, java.util.List list3) {
        this.zzb = 10.0f;
        this.zzc = -16777216;
        this.zzd = 0.0f;
        this.zze = true;
        this.zzf = false;
        this.zzg = false;
        this.zzh = new com.google.android.gms.maps.model.ButtCap();
        this.zzi = new com.google.android.gms.maps.model.ButtCap();
        this.zzj = 0;
        this.zzk = null;
        this.zzl = new java.util.ArrayList();
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
        if (list3 != null) {
            this.zzl = list3;
        }
    }

    public final com.google.android.gms.maps.model.PolylineOptions zIndex(float f) {
        this.zzd = f;
        return this;
    }

    public final com.google.android.gms.maps.model.PolylineOptions width(float f) {
        this.zzb = f;
        return this;
    }

    public final com.google.android.gms.maps.model.PolylineOptions visible(boolean z) {
        this.zze = z;
        return this;
    }

    public final com.google.android.gms.maps.model.PolylineOptions pattern(java.util.List<com.google.android.gms.maps.model.PatternItem> list) {
        this.zzk = list;
        return this;
    }

    public final com.google.android.gms.maps.model.PolylineOptions jointType(int i) {
        this.zzj = i;
        return this;
    }

    public final boolean isVisible() {
        return this.zze;
    }

    public final boolean isGeodesic() {
        return this.zzf;
    }

    public final boolean isClickable() {
        return this.zzg;
    }

    public final float getZIndex() {
        return this.zzd;
    }

    public final float getWidth() {
        return this.zzb;
    }

    public final java.util.List<com.google.android.gms.maps.model.LatLng> getPoints() {
        return this.zza;
    }

    public final java.util.List<com.google.android.gms.maps.model.PatternItem> getPattern() {
        return this.zzk;
    }

    public final int getJointType() {
        return this.zzj;
    }

    public final int getColor() {
        return this.zzc;
    }

    public final com.google.android.gms.maps.model.PolylineOptions geodesic(boolean z) {
        this.zzf = z;
        return this;
    }

    public final com.google.android.gms.maps.model.PolylineOptions color(int i) {
        this.zzc = i;
        return this;
    }

    public final com.google.android.gms.maps.model.PolylineOptions clickable(boolean z) {
        this.zzg = z;
        return this;
    }
}
