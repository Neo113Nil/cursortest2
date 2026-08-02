package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* loaded from: classes.dex */
public final class zzcba implements AudioManager.OnAudioFocusChangeListener {
    private final AudioManager zza;
    private final zzcaz zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private float zzf = 1.0f;

    public zzcba(Context context, zzcaz zzcazVar) {
        this.zza = (AudioManager) context.getSystemService("audio");
        this.zzb = zzcazVar;
    }

    private final void zzf() {
        if (!this.zzd || this.zze || this.zzf <= 0.0f) {
            if (this.zzc) {
                AudioManager audioManager = this.zza;
                if (audioManager != null) {
                    this.zzc = audioManager.abandonAudioFocus(this) == 0;
                }
                this.zzb.zzn();
                return;
            }
            return;
        }
        if (this.zzc) {
            return;
        }
        AudioManager audioManager2 = this.zza;
        if (audioManager2 != null) {
            this.zzc = audioManager2.requestAudioFocus(this, 3, 2) == 1;
        }
        this.zzb.zzn();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i7) {
        this.zzc = i7 > 0;
        this.zzb.zzn();
    }

    public final float zza() {
        float f7 = this.zze ? 0.0f : this.zzf;
        if (this.zzc) {
            return f7;
        }
        return 0.0f;
    }

    public final void zzb() {
        this.zzd = true;
        zzf();
    }

    public final void zzc() {
        this.zzd = false;
        zzf();
    }

    public final void zzd(boolean z4) {
        this.zze = z4;
        zzf();
    }

    public final void zze(float f7) {
        this.zzf = f7;
        zzf();
    }
}
