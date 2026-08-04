package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.C0294b;
import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zzemj implements zzesh {
    private final zzgbn zza;
    private final Context zzb;

    public zzemj(zzgbn zzgbnVar, Context context) {
        this.zza = zzgbnVar;
        this.zzb = context;
    }

    public static zzemk zzc(zzemj zzemjVar) {
        boolean z4;
        int iE;
        int streamMaxVolume;
        AudioManager audioManager = (AudioManager) zzemjVar.zzb.getSystemService("audio");
        o oVar = o.f1952C;
        float fA = oVar.f1962h.a();
        C0294b c0294b = oVar.f1962h;
        synchronized (c0294b) {
            z4 = c0294b.f3591a;
        }
        if (audioManager == null) {
            return new zzemk(-1, false, false, -1, -1, -1, -1, -1, fA, z4, true);
        }
        int mode = audioManager.getMode();
        boolean zIsMusicActive = audioManager.isMusicActive();
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkX)).booleanValue()) {
            iE = oVar.f1959e.e(audioManager);
            streamMaxVolume = audioManager.getStreamMaxVolume(3);
        } else {
            iE = -1;
            streamMaxVolume = -1;
        }
        return new zzemk(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, iE, streamMaxVolume, audioManager.getRingerMode(), audioManager.getStreamVolume(2), fA, z4, false);
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 13;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzemi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzemj.zzc(this.zza);
            }
        });
    }
}
