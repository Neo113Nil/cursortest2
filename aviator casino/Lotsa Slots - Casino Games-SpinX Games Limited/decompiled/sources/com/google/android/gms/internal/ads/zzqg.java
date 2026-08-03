package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzqg {
    public static final com.google.android.gms.internal.ads.zzqg zza;
    public final int zzb;
    public final int zzc;
    private final com.google.android.gms.internal.ads.zzgww zzd;

    static {
        com.google.android.gms.internal.ads.zzqg zzqgVar;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            com.google.android.gms.internal.ads.zzgwv zzgwvVar = new com.google.android.gms.internal.ads.zzgwv();
            for (int i = 1; i <= 10; i++) {
                zzgwvVar.zzf(java.lang.Integer.valueOf(com.google.android.gms.internal.ads.zzfl.zzE(i)));
            }
            zzqgVar = new com.google.android.gms.internal.ads.zzqg(2, zzgwvVar.zzh());
        } else {
            zzqgVar = new com.google.android.gms.internal.ads.zzqg(2, 10);
        }
        zza = zzqgVar;
    }

    public zzqg(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = null;
    }

    public zzqg(int i, java.util.Set set) {
        this.zzb = i;
        com.google.android.gms.internal.ads.zzgww zzp = com.google.android.gms.internal.ads.zzgww.zzp(set);
        this.zzd = zzp;
        com.google.android.gms.internal.ads.zzgza it = zzp.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 = java.lang.Math.max(i2, java.lang.Integer.bitCount(((java.lang.Integer) it.next()).intValue()));
        }
        this.zzc = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzqg)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzqg zzqgVar = (com.google.android.gms.internal.ads.zzqg) obj;
        return this.zzb == zzqgVar.zzb && this.zzc == zzqgVar.zzc && java.util.Objects.equals(this.zzd, zzqgVar.zzd);
    }

    public final int hashCode() {
        com.google.android.gms.internal.ads.zzgww zzgwwVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzgwwVar == null ? 0 : zzgwwVar.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zzd);
        int i = this.zzb;
        int length = java.lang.String.valueOf(i).length();
        int i2 = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 38 + java.lang.String.valueOf(i2).length() + 15 + java.lang.String.valueOf(valueOf).length() + 1);
        sb.append("AudioProfile[format=");
        sb.append(i);
        sb.append(", maxChannelCount=");
        sb.append(i2);
        sb.append(", channelMasks=");
        sb.append(valueOf);
        sb.append(com.ironsource.X3.j.e);
        return sb.toString();
    }

    public final boolean zza(int i) {
        com.google.android.gms.internal.ads.zzgww zzgwwVar = this.zzd;
        if (zzgwwVar == null) {
            return i <= this.zzc;
        }
        int zzE = com.google.android.gms.internal.ads.zzfl.zzE(i);
        if (zzE == 0) {
            return false;
        }
        return zzgwwVar.contains(java.lang.Integer.valueOf(zzE));
    }

    public final int zzb(int i, com.google.android.gms.internal.ads.zzd zzdVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (android.os.Build.VERSION.SDK_INT < 29) {
            java.lang.Integer num = (java.lang.Integer) com.google.android.gms.internal.ads.zzqh.zzb.getOrDefault(java.lang.Integer.valueOf(this.zzb), 0);
            num.getClass();
            return num.intValue();
        }
        int i2 = this.zzb;
        for (int i3 = 10; i3 > 0; i3--) {
            int zzE = com.google.android.gms.internal.ads.zzfl.zzE(i3);
            if (zzE != 0 && android.media.AudioTrack.isDirectPlaybackSupported(new android.media.AudioFormat.Builder().setEncoding(i2).setSampleRate(i).setChannelMask(zzE).build(), zzdVar.zza())) {
                return i3;
            }
        }
        return 0;
    }
}
