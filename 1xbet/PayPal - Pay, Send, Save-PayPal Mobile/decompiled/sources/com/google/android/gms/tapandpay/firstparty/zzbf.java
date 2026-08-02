package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzbf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzbf> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzbg();
    private int zza;
    private java.lang.String zzb;
    private java.lang.String zzc;
    private com.google.android.gms.tapandpay.firstparty.zzbd zzd;
    private java.lang.String zze;
    private java.lang.String zzf;
    private java.lang.String zzg;
    private java.lang.String zzh;
    private com.google.android.gms.tapandpay.firstparty.zzan zzi;

    private zzbf() {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.tapandpay.firstparty.zzbf)) {
            return false;
        }
        com.google.android.gms.tapandpay.firstparty.zzbf zzbfVar = (com.google.android.gms.tapandpay.firstparty.zzbf) obj;
        return com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(zzbfVar.zza)) && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzbfVar.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, zzbfVar.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzi, zzbfVar.zzi) && com.google.android.gms.common.internal.Objects.equal(this.zzd, zzbfVar.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zze, zzbfVar.zze) && com.google.android.gms.common.internal.Objects.equal(this.zzf, zzbfVar.zzf) && com.google.android.gms.common.internal.Objects.equal(this.zzg, zzbfVar.zzg) && com.google.android.gms.common.internal.Objects.equal(this.zzh, zzbfVar.zzh);
    }

    public final int hashCode() {
        int i = this.zza;
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(i), this.zzb, this.zzc, this.zzi, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzg, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        com.google.android.gms.tapandpay.firstparty.zzan zzanVar = this.zzi;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 5, zzanVar == null ? null : zzanVar.asBinder(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    zzbf(int i, java.lang.String str, java.lang.String str2, android.os.IBinder iBinder, com.google.android.gms.tapandpay.firstparty.zzbd zzbdVar, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        com.google.android.gms.tapandpay.firstparty.zzan zzanVar;
        if (iBinder == null) {
            zzanVar = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tapandpay.firstparty.IRenderCallback");
            zzanVar = queryLocalInterface instanceof com.google.android.gms.tapandpay.firstparty.zzan ? (com.google.android.gms.tapandpay.firstparty.zzan) queryLocalInterface : new com.google.android.gms.tapandpay.firstparty.zzan(iBinder);
        }
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzi = zzanVar;
        this.zzd = zzbdVar;
        this.zze = str3;
        this.zzf = str4;
        this.zzg = str5;
        this.zzh = str6;
    }
}
