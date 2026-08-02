package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import android.media.AudioTrack;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
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
        boolean isDirectPlaybackSupported;
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
            int zzi = zzen.zzi(i9);
            if (zzi != 0) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i8).setSampleRate(i7).setChannelMask(zzi).build(), zzeVar.zza().zza);
                if (isDirectPlaybackSupported) {
                    return i9;
                }
            }
        }
        return 0;
    }

    public final boolean zzb(int i7) {
        if (this.zzd == null) {
            return i7 <= this.zzc;
        }
        int zzi = zzen.zzi(i7);
        if (zzi == 0) {
            return false;
        }
        return this.zzd.contains(Integer.valueOf(zzi));
    }

    public zzos(int i7, Set set) {
        this.zzb = i7;
        zzfwm zzl = zzfwm.zzl(set);
        this.zzd = zzl;
        zzfyn it = zzl.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8 = Math.max(i8, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.zzc = i8;
    }
}
