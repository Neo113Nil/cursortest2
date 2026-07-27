package com.google.android.play.core.hsdp.service;

import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes8.dex */
final class zzs {
    private static zzr zza;

    public static synchronized zzr zza(Intent intent, Context context) {
        zzr zzrVar;
        synchronized (zzs.class) {
            if (zza == null) {
                zzai zzaiVar = new zzai(intent, context.getApplicationContext());
                zzaiVar.zzp();
                zza = zzaiVar;
            }
            zzrVar = zza;
        }
        return zzrVar;
    }
}
