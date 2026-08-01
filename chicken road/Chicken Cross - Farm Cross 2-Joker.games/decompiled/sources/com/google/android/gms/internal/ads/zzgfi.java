package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgfi implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzgfi(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzgfi zza(zziof zziofVar, zziof zziofVar2) {
        return new zzgfi(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        ExecutorService executorService = (ExecutorService) this.zza.zzb();
        zzgei zzgeiVar = (zzgei) this.zzb.zzb();
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length() + 1);
        sb.append("Mozilla/5.0 (Linux; Android ");
        sb.append(str);
        sb.append("; ");
        sb.append(str2);
        sb.append(")");
        return new zzgfn(executorService, sb.toString(), zzgeiVar.zzn());
    }
}
