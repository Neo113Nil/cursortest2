package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzti implements zzrj {
    private final Context zza;
    private final zzth zzb;
    private final float zzc;
    private zzeg zzd;
    private zzdp zze;
    private zzql zzf;
    private zzqr zzg;
    private Looper zzh;
    private Context zzi;
    private final zztm zzj;

    /* synthetic */ zzti(zztg zztgVar, byte[] bArr) {
        this.zza = zztgVar.zzd();
        zztm zzg = zztgVar.zzg();
        zzg.getClass();
        this.zzj = zzg;
        this.zzf = zztgVar.zze();
        this.zzb = zztgVar.zzd() != null ? new zzth(this, null) : null;
        this.zzc = 8.0f;
        this.zze = zzdp.zza;
    }

    @EnsuresNonNull({"audioCapabilities"})
    private final void zzk(zzrc zzrcVar) {
        Context context;
        zzl();
        zzqr zzqrVar = this.zzg;
        if (zzqrVar == null && (context = this.zza) != null) {
            zzqr zzqrVar2 = new zzqr(context, new zzqq() { // from class: com.google.android.gms.internal.ads.zztf
                @Override // com.google.android.gms.internal.ads.zzqq
                public final /* synthetic */ void zza(zzql zzqlVar) {
                    zzti.this.zzh(zzqlVar);
                }
            }, zzrcVar.zzb, zzrcVar.zzc);
            this.zzg = zzqrVar2;
            this.zzf = zzqrVar2.zzd();
        } else if (zzqrVar != null) {
            AudioDeviceInfo audioDeviceInfo = zzrcVar.zzc;
            if (audioDeviceInfo != null) {
                zzqrVar.zzc(audioDeviceInfo);
            }
            this.zzg.zzb(zzrcVar.zzb);
        }
        this.zzf.getClass();
    }

    private final void zzl() {
        if (this.zza == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zzh;
        boolean z = true;
        if (looper != null && looper != myLooper) {
            z = false;
        }
        String zzm = zzm(looper);
        String zzm2 = zzm(myLooper);
        if (!z) {
            throw new IllegalStateException(zzgvb.zzd("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", zzm, zzm2));
        }
        this.zzh = myLooper;
    }

    private static String zzm(Looper looper) {
        return looper == null ? "null" : looper.getThread().getName();
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final zzre zza(zzrc zzrcVar) {
        zzk(zzrcVar);
        zztm zztmVar = this.zzj;
        zzv zzvVar = zzrcVar.zza;
        zzd zzdVar = zzrcVar.zzb;
        zzqw zza = zztmVar.zza(zzvVar, zzdVar);
        zzrd zzrdVar = new zzrd();
        int i = 0;
        if (!Objects.equals(zzvVar.zzp, "audio/raw") ? this.zzf.zzf(zzvVar, zzdVar) != null : zzvVar.zzL == 2) {
            i = 2;
        }
        zzrdVar.zzd(i);
        zzrdVar.zza(zza.zzb);
        zzrdVar.zzb(zza.zzc);
        zzrdVar.zzc(zza.zzd);
        return zzrdVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final zzri zzb(zzrc zzrcVar) throws zzra {
        int i;
        int intValue;
        int intValue2;
        int i2;
        int i3;
        zzk(zzrcVar);
        zzv zzvVar = zzrcVar.zza;
        String str = zzvVar.zzp;
        if (Objects.equals(str, "audio/raw")) {
            int i4 = zzvVar.zzL;
            zzguk.zza(zzfm.zzE(i4));
            i = zzvVar.zzK;
            intValue2 = zzfm.zzF(zzvVar);
            i3 = zzfm.zzI(i4) * zzvVar.zzI;
            intValue = i4;
            i2 = 0;
        } else {
            i = zzvVar.zzK;
            zzqw zzqwVar = zzqw.zza;
            Pair zzf = this.zzf.zzf(zzvVar, zzrcVar.zzb);
            if (zzf == null) {
                String valueOf = String.valueOf(zzvVar);
                String.valueOf(valueOf);
                throw new zzra("Unable to configure passthrough for: ".concat(String.valueOf(valueOf)));
            }
            intValue = ((Integer) zzf.first).intValue();
            intValue2 = ((Integer) zzf.second).intValue();
            i2 = 2;
            i3 = -1;
        }
        int i5 = zzvVar.zzj;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i5 == -1) {
            i5 = 768000;
        }
        int i6 = i5;
        int i7 = zzrcVar.zzf;
        if (i7 == -1) {
            zzguk.zzi(AudioTrack.getMinBufferSize(i, intValue2, intValue) != -2);
            if (i3 == -1) {
                i3 = 1;
            }
            i7 = (((Math.max(r1, zzty.zzb(r1, intValue, i2, i3, i, i6)) + i3) - 1) / i3) * i3;
        }
        zzrh zzrhVar = new zzrh();
        zzrhVar.zzb(i);
        zzrhVar.zzc(intValue2);
        zzrhVar.zza(intValue);
        zzrhVar.zze(i7);
        zzrhVar.zzg(zzrcVar.zzd);
        zzrhVar.zzf(zzrcVar.zzb);
        zzrhVar.zzd(false);
        zzrhVar.zzh(zzrcVar.zze);
        return new zzri(zzrhVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzc(zzrg zzrgVar) {
        zzl();
        if (this.zzd == null) {
            this.zzd = new zzeg(Thread.currentThread());
        }
        this.zzd.zzc(zzrgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzd(zzdp zzdpVar) {
        this.zze = zzdpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zze() {
        zzeg zzegVar = this.zzd;
        if (zzegVar != null) {
            zzegVar.zzg();
        }
        zzqr zzqrVar = this.zzg;
        if (zzqrVar != null) {
            zzqrVar.zze();
        }
    }

    public final zztd zzf(zzri zzriVar) throws zzrf {
        Context context;
        try {
            int i = zzriVar.zzg;
            int i2 = zzriVar.zzh;
            Context context2 = null;
            if (i2 != -1 && (context = this.zza) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.zzi;
                if (context3 == null || context3.getDeviceId() != i2) {
                    this.zzi = context.createDeviceContext(i2);
                }
                context2 = this.zzi;
                i = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(zzriVar.zzf.zza()).setAudioFormat(new AudioFormat.Builder().setSampleRate(zzriVar.zzb).setChannelMask(zzriVar.zzc).setEncoding(zzriVar.zza).build()).setTransferMode(1).setBufferSizeInBytes(zzriVar.zze).setSessionId(i);
            if (Build.VERSION.SDK_INT >= 29) {
                sessionId.setOffloadedPlayback(false);
            }
            if (Build.VERSION.SDK_INT >= 34 && context2 != null) {
                sessionId.setContext(context2);
            }
            AudioTrack build = sessionId.build();
            if (build.getState() == 1) {
                return new zztd(build, zzriVar, this.zzb, this.zzc, this.zze);
            }
            try {
                build.release();
            } catch (Exception unused) {
            }
            throw new zzrf();
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new zzrf(e);
        }
    }

    public final zzql zzg() {
        return this.zzf;
    }

    final void zzh(zzql zzqlVar) {
        zzl();
        zzql zzqlVar2 = this.zzf;
        if (zzqlVar2 == null || zzqlVar.equals(zzqlVar2)) {
            return;
        }
        this.zzf = zzqlVar;
        zzeg zzegVar = this.zzd;
        if (zzegVar != null) {
            zzegVar.zze(-1, zzte.zza);
            zzegVar.zzf();
        }
    }

    final /* synthetic */ void zzi(zzql zzqlVar) {
        this.zzf = zzqlVar;
    }

    final /* synthetic */ zzqr zzj() {
        return this.zzg;
    }
}
