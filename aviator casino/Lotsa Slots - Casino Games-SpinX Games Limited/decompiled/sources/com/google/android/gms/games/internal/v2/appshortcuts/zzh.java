package com.google.android.gms.games.internal.v2.appshortcuts;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public final class zzh extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.internal.v2.appshortcuts.zzh> CREATOR = new com.google.android.gms.games.internal.v2.appshortcuts.zzi();
    private final java.util.List zza;
    private final java.util.List zzb;
    private final java.util.List zzc;
    private final java.util.List zzd;

    zzh(java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4) {
        this.zza = list;
        this.zzb = list2;
        this.zzc = list3;
        this.zzd = list4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.util.List list = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 1, list, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 4, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final java.util.List zza() {
        return this.zzb;
    }

    public final java.util.List zzb() {
        return this.zzc;
    }

    public final java.util.List zzc() {
        return this.zzd;
    }

    public final java.util.List zzd() {
        return this.zza;
    }
}
