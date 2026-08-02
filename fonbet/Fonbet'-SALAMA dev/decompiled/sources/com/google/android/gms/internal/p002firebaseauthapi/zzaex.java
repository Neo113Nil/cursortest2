package com.google.android.gms.internal.p002firebaseauthapi;

import Q0.a;
import com.google.android.gms.common.api.Status;
import e1.k;
import i3.C1263a;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
final class zzaex extends zzade {
    private final String zza;
    private final /* synthetic */ zzaew zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaex(zzaew zzaewVar, zzade zzadeVar, String str) {
        super(zzadeVar);
        this.zzb = zzaewVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzade
    public final void zza(Status status) {
        C1263a c1263a;
        HashMap hashMap;
        c1263a = zzaew.zza;
        StringBuilder k7 = k.k("SMS verification code request failed: ", a.C(status.f11082a), " ");
        k7.append(status.f11083b);
        c1263a.c(k7.toString(), new Object[0]);
        hashMap = this.zzb.zzd;
        zzaez zzaezVar = (zzaez) hashMap.get(this.zza);
        if (zzaezVar == null) {
            return;
        }
        Iterator<zzade> it = zzaezVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(status);
        }
        this.zzb.zzc(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzade
    public final void zzb(String str) {
        C1263a c1263a;
        HashMap hashMap;
        c1263a = zzaew.zza;
        c1263a.a("onCodeSent", new Object[0]);
        hashMap = this.zzb.zzd;
        zzaez zzaezVar = (zzaez) hashMap.get(this.zza);
        if (zzaezVar == null) {
            return;
        }
        Iterator<zzade> it = zzaezVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zzb(str);
        }
        zzaezVar.zzg = true;
        zzaezVar.zzd = str;
        if (zzaezVar.zza <= 0) {
            this.zzb.zzb(this.zza);
        } else if (!zzaezVar.zzc) {
            this.zzb.zze(this.zza);
        } else {
            if (zzag.zzc(zzaezVar.zze)) {
                return;
            }
            zzaew.zza(this.zzb, this.zza);
        }
    }
}
