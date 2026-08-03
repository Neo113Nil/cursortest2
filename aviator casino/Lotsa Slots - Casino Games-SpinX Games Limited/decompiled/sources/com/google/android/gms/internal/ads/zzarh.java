package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzarh {
    private final java.lang.String zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private java.lang.String zze;

    public zzarh(int i, int i2, int i3) {
        java.lang.String str;
        if (i != Integer.MIN_VALUE) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 1);
            sb.append(i);
            sb.append(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING);
            str = sb.toString();
        } else {
            str = "";
        }
        this.zza = str;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = Integer.MIN_VALUE;
        this.zze = "";
    }

    private final void zzd() {
        if (this.zzd == Integer.MIN_VALUE) {
            throw new java.lang.IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final void zza() {
        int i = this.zzd;
        int i2 = i == Integer.MIN_VALUE ? this.zzb : i + this.zzc;
        this.zzd = i2;
        java.lang.String str = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + java.lang.String.valueOf(i2).length());
        sb.append(str);
        sb.append(i2);
        this.zze = sb.toString();
    }

    public final int zzb() {
        zzd();
        return this.zzd;
    }

    public final java.lang.String zzc() {
        zzd();
        return this.zze;
    }
}
