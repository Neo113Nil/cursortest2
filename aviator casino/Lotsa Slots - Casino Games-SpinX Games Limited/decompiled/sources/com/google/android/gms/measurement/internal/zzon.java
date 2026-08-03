package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzon extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.zzon> CREATOR = new com.google.android.gms.measurement.internal.zzoo();
    public final java.util.List zza;

    zzon(java.util.List list) {
        this.zza = list;
    }

    public static com.google.android.gms.measurement.internal.zzon zza(com.google.android.gms.measurement.internal.zzlr... zzlrVarArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        arrayList.add(java.lang.Integer.valueOf(zzlrVarArr[0].zza()));
        return new com.google.android.gms.measurement.internal.zzon(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.util.List list = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerList(parcel, 1, list, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
