package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfyl extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzfyl> CREATOR = new com.google.android.gms.internal.ads.zzfym();
    public final int zza;
    private com.google.android.gms.internal.ads.zzaym zzb = null;
    private byte[] zzc;

    zzfyl(int i, byte[] bArr) {
        this.zza = i;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        com.google.android.gms.internal.ads.zzaym zzaymVar = this.zzb;
        if (zzaymVar != null || this.zzc == null) {
            if (zzaymVar == null || this.zzc != null) {
                if (zzaymVar != null && this.zzc != null) {
                    throw new java.lang.IllegalStateException("Invalid internal representation - full");
                }
                if (zzaymVar != null || this.zzc != null) {
                    throw new java.lang.IllegalStateException("Impossible");
                }
                throw new java.lang.IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        byte[] bArr = this.zzc;
        if (bArr == null) {
            bArr = this.zzb.zzaN();
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final com.google.android.gms.internal.ads.zzaym zza() {
        if (this.zzb == null) {
            try {
                this.zzb = com.google.android.gms.internal.ads.zzaym.zzi(this.zzc, com.google.android.gms.internal.ads.zzido.zza());
                this.zzc = null;
            } catch (com.google.android.gms.internal.ads.zziet | java.lang.NullPointerException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }
        zzb();
        return this.zzb;
    }
}
