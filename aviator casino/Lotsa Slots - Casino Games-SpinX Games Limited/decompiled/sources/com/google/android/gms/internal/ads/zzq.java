package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzq implements java.util.Comparator<com.google.android.gms.internal.ads.zzp>, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzq> CREATOR = new com.google.android.gms.internal.ads.zzn();
    public final java.lang.String zza;
    public final int zzb;
    private final com.google.android.gms.internal.ads.zzp[] zzc;
    private int zzd;

    zzq(android.os.Parcel parcel) {
        this.zza = parcel.readString();
        com.google.android.gms.internal.ads.zzp[] zzpVarArr = (com.google.android.gms.internal.ads.zzp[]) parcel.createTypedArray(com.google.android.gms.internal.ads.zzp.CREATOR);
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        com.google.android.gms.internal.ads.zzp[] zzpVarArr2 = zzpVarArr;
        this.zzc = zzpVarArr2;
        this.zzb = zzpVarArr2.length;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(com.google.android.gms.internal.ads.zzp zzpVar, com.google.android.gms.internal.ads.zzp zzpVar2) {
        com.google.android.gms.internal.ads.zzp zzpVar3 = zzpVar2;
        java.util.UUID uuid = com.google.android.gms.internal.ads.zzg.zza;
        java.util.UUID uuid2 = zzpVar.zza;
        return uuid.equals(uuid2) ? !uuid.equals(zzpVar3.zza) ? 1 : 0 : uuid2.compareTo(zzpVar3.zza);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzq zzqVar = (com.google.android.gms.internal.ads.zzq) obj;
            if (java.util.Objects.equals(this.zza, zzqVar.zza) && java.util.Arrays.equals(this.zzc, zzqVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzc, 0);
    }

    public final com.google.android.gms.internal.ads.zzp zza(int i) {
        return this.zzc[i];
    }

    public final com.google.android.gms.internal.ads.zzq zzb(java.lang.String str) {
        return java.util.Objects.equals(this.zza, str) ? this : new com.google.android.gms.internal.ads.zzq(str, false, this.zzc);
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i != 0) {
            return i;
        }
        java.lang.String str = this.zza;
        int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + java.util.Arrays.hashCode(this.zzc);
        this.zzd = hashCode;
        return hashCode;
    }

    private zzq(java.lang.String str, boolean z, com.google.android.gms.internal.ads.zzp... zzpVarArr) {
        this.zza = str;
        zzpVarArr = z ? (com.google.android.gms.internal.ads.zzp[]) zzpVarArr.clone() : zzpVarArr;
        this.zzc = zzpVarArr;
        this.zzb = zzpVarArr.length;
        java.util.Arrays.sort(zzpVarArr, this);
    }

    public zzq(java.lang.String str, com.google.android.gms.internal.ads.zzp... zzpVarArr) {
        this(null, true, zzpVarArr);
    }

    public zzq(java.util.List list) {
        this(null, false, (com.google.android.gms.internal.ads.zzp[]) list.toArray(new com.google.android.gms.internal.ads.zzp[0]));
    }
}
