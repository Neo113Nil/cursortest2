package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class zzos {
    public static final zzos zza;
    public final int zzb;
    public final int zzc;
    private final zzfwm zzd;

    static {
        zzos zzosVar;
        if (zzen.zza >= 33) {
            zzfwl zzfwlVar = new zzfwl();
            for (int i7 = 1; i7 <= 10; i7++) {
                zzfwlVar.zzf(Integer.valueOf(zzen.zzi(i7)));
            }
            zzosVar = new zzos(2, zzfwlVar.zzi());
        } else {
            zzosVar = new zzos(2, 10);
        }
        zza = zzosVar;
    }

    public zzos(int i7, int i8) {
        this.zzb = i7;
        this.zzc = i8;
        this.zzd = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzos)) {
            return false;
        }
        zzos zzosVar = (zzos) obj;
        if (this.zzb == zzosVar.zzb && this.zzc == zzosVar.zzc) {
            zzfwm zzfwmVar = this.zzd;
            zzfwm zzfwmVar2 = zzosVar.zzd;
            int i7 = zzen.zza;
            if (Objects.equals(zzfwmVar, zzfwmVar2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        zzfwm zzfwmVar = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzfwmVar == null ? 0 : zzfwmVar.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.zzb + ", maxChannelCount=" + this.zzc + ", channelMasks=" + String.valueOf(this.zzd) + "]";
    }

    public final int zza(int i7, zze zzeVar) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (zzen.zza < 29) {
            Integer num = (Integer) zzot.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
            num.getClass();
            return num.intValue();
        }
        int i8 = this.zzb;
        for (int i9 = 10; i9 > 0; i9--) {
            int iZzi = zzen.zzi(i9);
            if (iZzi != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i8).setSampleRate(i7).setChannelMask(iZzi).build(), zzeVar.zza().zza)) {
                return i9;
            }
        }
        return 0;
    }

    public final boolean zzb(int i7) {
        if (this.zzd == null) {
            return i7 <= this.zzc;
        }
        int iZzi = zzen.zzi(i7);
        if (iZzi == 0) {
            return false;
        }
        return this.zzd.contains(Integer.valueOf(iZzi));
    }

    public zzos(int i7, Set set) {
        this.zzb = i7;
        zzfwm zzfwmVarZzl = zzfwm.zzl(set);
        this.zzd = zzfwmVarZzl;
        zzfyn it = zzfwmVarZzl.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = iMax;
    }
}
