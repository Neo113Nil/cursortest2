package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import i3.C1263a;
import java.util.HashMap;

/* loaded from: classes.dex */
final class zzafa extends BroadcastReceiver {
    private final String zza;
    private final /* synthetic */ zzaew zzb;

    public zzafa(zzaew zzaewVar, String str) {
        this.zzb = zzaewVar;
        this.zza = str;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        HashMap hashMap;
        C1263a c1263a;
        C1263a c1263a2;
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).f11082a == 0) {
                String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                hashMap = this.zzb.zzd;
                zzaez zzaezVar = (zzaez) hashMap.get(this.zza);
                if (zzaezVar == null) {
                    c1263a2 = zzaew.zza;
                    c1263a2.c("Verification code received with no active retrieval session.", new Object[0]);
                } else {
                    String zza = zzaew.zza(str);
                    zzaezVar.zze = zza;
                    if (zza == null) {
                        c1263a = zzaew.zza;
                        c1263a.c("Unable to extract verification code.", new Object[0]);
                    } else if (!zzag.zzc(zzaezVar.zzd)) {
                        zzaew.zza(this.zzb, this.zza);
                    }
                }
            }
            context.getApplicationContext().unregisterReceiver(this);
        }
    }
}
