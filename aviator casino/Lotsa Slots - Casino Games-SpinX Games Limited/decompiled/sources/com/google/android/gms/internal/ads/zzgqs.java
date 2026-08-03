package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgqs extends com.google.android.gms.internal.ads.zzgrt {
    private final android.os.IBinder zza;
    private final java.lang.String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;
    private final java.lang.String zzf;

    /* synthetic */ zzgqs(android.os.IBinder iBinder, java.lang.String str, int i, float f, int i2, int i3, java.lang.String str2, int i4, java.lang.String str3, java.lang.String str4, java.lang.String str5, byte[] bArr) {
        this.zza = iBinder;
        this.zzb = str;
        this.zzc = i;
        this.zzd = f;
        this.zze = i4;
        this.zzf = str4;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzgrt) {
            com.google.android.gms.internal.ads.zzgrt zzgrtVar = (com.google.android.gms.internal.ads.zzgrt) obj;
            if (this.zza.equals(zzgrtVar.zza()) && ((str = this.zzb) != null ? str.equals(zzgrtVar.zzb()) : zzgrtVar.zzb() == null) && this.zzc == zzgrtVar.zzc() && java.lang.Float.floatToIntBits(this.zzd) == java.lang.Float.floatToIntBits(zzgrtVar.zzd())) {
                zzgrtVar.zze();
                zzgrtVar.zzf();
                zzgrtVar.zzg();
                if (this.zze == zzgrtVar.zzh()) {
                    zzgrtVar.zzi();
                    java.lang.String str2 = this.zzf;
                    if (str2 != null ? str2.equals(zzgrtVar.zzj()) : zzgrtVar.zzj() == null) {
                        zzgrtVar.zzk();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        java.lang.String str = this.zzb;
        int hashCode2 = (((((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc) * 1000003) ^ java.lang.Float.floatToIntBits(this.zzd);
        int i = this.zze;
        java.lang.String str2 = this.zzf;
        return ((((hashCode2 * 1525764945) ^ i) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        int length = obj.length();
        java.lang.String str = this.zzb;
        int length2 = java.lang.String.valueOf(str).length();
        int i = this.zzc;
        int length3 = java.lang.String.valueOf(i).length();
        float f = this.zzd;
        int length4 = java.lang.String.valueOf(f).length();
        int i2 = this.zze;
        int length5 = java.lang.String.valueOf(i2).length();
        java.lang.String str2 = this.zzf;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 46 + length2 + 16 + length3 + 23 + length4 + 65 + length5 + 33 + java.lang.String.valueOf(str2).length() + 30);
        sb.append("OverlayDisplayShowRequest{windowToken=");
        sb.append(obj);
        sb.append(", appId=");
        sb.append(str);
        sb.append(", layoutGravity=");
        sb.append(i);
        sb.append(", layoutVerticalMargin=");
        sb.append(f);
        sb.append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        sb.append(i2);
        sb.append(", deeplinkUrl=null, adFieldEnifd=");
        sb.append(str2);
        sb.append(", thirdPartyAuthCallerId=null}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgrt
    public final android.os.IBinder zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgrt
    public final java.lang.String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgrt
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgrt
    public final float zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgrt
    public final int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgrt
    public final int zzf() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgrt
    public final java.lang.String zzg() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgrt
    public final int zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgrt
    public final java.lang.String zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgrt
    public final java.lang.String zzj() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgrt
    public final java.lang.String zzk() {
        return null;
    }
}
