package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class zzfjy extends ContentObserver {
    private final Context zza;
    private final AudioManager zzb;
    private float zzc;
    private final zzfkk zzd;

    public zzfjy(Handler handler, Context context, zzfjw zzfjwVar, zzfkk zzfkkVar) {
        super(handler);
        this.zza = context;
        this.zzb = (AudioManager) context.getSystemService("audio");
        this.zzd = zzfkkVar;
    }

    private final float zzc() {
        AudioManager audioManager = this.zzb;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f7 = streamVolume / streamMaxVolume;
        if (f7 > 1.0f) {
            return 1.0f;
        }
        return f7;
    }

    private final void zzd() {
        this.zzd.zze(this.zzc);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4) {
        super.onChange(z4);
        float fZzc = zzc();
        if (fZzc != this.zzc) {
            this.zzc = fZzc;
            zzd();
        }
    }

    public final void zza() {
        this.zzc = zzc();
        zzd();
        this.zza.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void zzb() {
        this.zza.getContentResolver().unregisterContentObserver(this);
    }
}
