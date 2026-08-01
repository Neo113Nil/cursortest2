package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import com.ironsource.U3;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzqk {
    public static final zzqk zza;
    public final int zzb;
    public final int zzc;
    private final zzgxw zzd;

    static {
        zzqk zzqkVar;
        if (Build.VERSION.SDK_INT >= 33) {
            zzgxv zzgxvVar = new zzgxv();
            for (int i = 1; i <= 10; i++) {
                zzgxvVar.zzf(Integer.valueOf(zzfm.zzG(i)));
            }
            zzqkVar = new zzqk(2, zzgxvVar.zzh());
        } else {
            zzqkVar = new zzqk(2, 10);
        }
        zza = zzqkVar;
    }

    public zzqk(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = null;
    }

    public zzqk(int i, Set set) {
        this.zzb = i;
        zzgxw zzp = zzgxw.zzp(set);
        this.zzd = zzp;
        zzhaa it = zzp.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 = Math.max(i2, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzqk)) {
            return false;
        }
        zzqk zzqkVar = (zzqk) obj;
        return this.zzb == zzqkVar.zzb && this.zzc == zzqkVar.zzc && Objects.equals(this.zzd, zzqkVar.zzd);
    }

    public final int hashCode() {
        zzgxw zzgxwVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzgxwVar == null ? 0 : zzgxwVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        int i = this.zzb;
        int length = String.valueOf(i).length();
        int i2 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 38 + String.valueOf(i2).length() + 15 + String.valueOf(valueOf).length() + 1);
        sb.append("AudioProfile[format=");
        sb.append(i);
        sb.append(", maxChannelCount=");
        sb.append(i2);
        sb.append(", channelMasks=");
        sb.append(valueOf);
        sb.append(U3.j.e);
        return sb.toString();
    }

    public final int zza(int i, zzd zzdVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (Build.VERSION.SDK_INT < 29) {
            Integer num = (Integer) zzql.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
            num.getClass();
            return num.intValue();
        }
        int i2 = this.zzb;
        for (int i3 = 10; i3 > 0; i3--) {
            int zzG = zzfm.zzG(i3);
            if (zzG != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i2).setSampleRate(i).setChannelMask(zzG).build(), zzdVar.zza())) {
                return i3;
            }
        }
        return 0;
    }

    final /* synthetic */ boolean zzb(int i, zzv zzvVar) {
        zzgxw zzgxwVar = this.zzd;
        if (zzgxwVar == null) {
            return i <= this.zzc;
        }
        int i2 = zzvVar.zzJ;
        if (i2 == -1 || zzvVar.zzI != i) {
            i2 = zzfm.zzG(i);
        }
        if (i2 != 0) {
            return zzgxwVar.contains(Integer.valueOf(i2));
        }
        return false;
    }
}
