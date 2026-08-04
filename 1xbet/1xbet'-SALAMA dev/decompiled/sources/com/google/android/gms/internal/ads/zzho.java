package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class zzho {
    private final float zza = 1.0f;

    public zzho(final Context context, Handler handler, zzhn zzhnVar) {
        zzfud.zza(new zzftz() { // from class: com.google.android.gms.internal.ads.zzhm
            @Override // com.google.android.gms.internal.ads.zzftz
            public final Object zza() {
                AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                audioManager.getClass();
                return audioManager;
            }
        });
    }

    public final float zza() {
        return 1.0f;
    }
}
