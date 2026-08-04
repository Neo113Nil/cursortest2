package com.google.android.gms.internal.consent_sdk;

import B1.m;
import B3.a;
import B3.h;
import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
final class zzn {
    private final Application zza;
    private final zzaq zzb;

    public zzn(Application application, zzaq zzaqVar) {
        this.zza = application;
        this.zzb = zzaqVar;
    }

    public final zzcj zzc(Activity activity, h hVar) {
        a aVarF = hVar.f1066b;
        if (aVarF == null) {
            aVarF = new m(this.zza).f();
        }
        return zzp.zza(new zzp(this, activity, aVarF, hVar, null));
    }
}
