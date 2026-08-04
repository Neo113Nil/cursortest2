package com.google.android.gms.internal.ads;

import android.os.IBinder;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
final class zzfqp extends zzfrs {
    private final IBinder zza;
    private final String zzb;
    private final int zzc;
    private final float zzd;
    private final int zze;
    private final String zzf;

    public /* synthetic */ zzfqp(IBinder iBinder, String str, int i7, float f7, int i8, int i9, String str2, int i10, String str3, String str4, String str5, zzfqo zzfqoVar) {
        this.zza = iBinder;
        this.zzb = str;
        this.zzc = i7;
        this.zzd = f7;
        this.zze = i10;
        this.zzf = str4;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfrs) {
            zzfrs zzfrsVar = (zzfrs) obj;
            if (this.zza.equals(zzfrsVar.zzf()) && ((str = this.zzb) != null ? str.equals(zzfrsVar.zzh()) : zzfrsVar.zzh() == null) && this.zzc == zzfrsVar.zzc() && Float.floatToIntBits(this.zzd) == Float.floatToIntBits(zzfrsVar.zza())) {
                zzfrsVar.zzb();
                zzfrsVar.zzd();
                zzfrsVar.zzj();
                if (this.zze == zzfrsVar.zze()) {
                    zzfrsVar.zzi();
                    String str2 = this.zzf;
                    if (str2 != null ? str2.equals(zzfrsVar.zzg()) : zzfrsVar.zzg() == null) {
                        zzfrsVar.zzk();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        String str = this.zzb;
        int iHashCode2 = (((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.zzc) * 1000003) ^ Float.floatToIntBits(this.zzd);
        int i7 = this.zze;
        String str2 = this.zzf;
        return ((((iHashCode2 * 1525764945) ^ i7) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    public final String toString() {
        StringBuilder sbK = k.k("OverlayDisplayShowRequest{windowToken=", this.zza.toString(), ", appId=");
        sbK.append(this.zzb);
        sbK.append(", layoutGravity=");
        sbK.append(this.zzc);
        sbK.append(", layoutVerticalMargin=");
        sbK.append(this.zzd);
        sbK.append(", displayMode=0, triggerMode=0, sessionToken=null, windowWidthPx=");
        sbK.append(this.zze);
        sbK.append(", deeplinkUrl=null, adFieldEnifd=");
        return k.i(sbK, this.zzf, ", thirdPartyAuthCallerId=null}");
    }

    @Override // com.google.android.gms.internal.ads.zzfrs
    public final float zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfrs
    public final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfrs
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfrs
    public final int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfrs
    public final int zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfrs
    public final IBinder zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfrs
    public final String zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzfrs
    public final String zzh() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfrs
    public final String zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfrs
    public final String zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfrs
    public final String zzk() {
        return null;
    }
}
