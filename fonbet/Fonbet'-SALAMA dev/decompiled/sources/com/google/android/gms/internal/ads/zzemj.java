package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.C0294b;
import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzemj implements zzesh {
    private final zzgbn zza;
    private final Context zzb;

    public zzemj(zzgbn zzgbnVar, Context context) {
        this.zza = zzgbnVar;
        this.zzb = context;
    }

    public static zzemk zzc(zzemj zzemjVar) {
        boolean z4;
        int i7;
        int i8;
        AudioManager audioManager = (AudioManager) zzemjVar.zzb.getSystemService("audio");
        o oVar = o.f1952C;
        float a2 = oVar.f1962h.a();
        C0294b c0294b = oVar.f1962h;
        synchronized (c0294b) {
            z4 = c0294b.f3591a;
        }
        if (audioManager == null) {
            return new zzemk(-1, false, false, -1, -1, -1, -1, -1, a2, z4, true);
        }
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkX)).booleanValue()) {
            i7 = oVar.f1959e.e(audioManager);
            i8 = audioManager.getStreamMaxVolume(3);
        } else {
            i7 = -1;
            i8 = -1;
        }
        return new zzemk(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i7, i8, audioManager.getRingerMode(), audioManager.getStreamVolume(2), a2, z4, false);
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
                return zzemj.zzc(zzemj.this);
            }
        });
    }
}
