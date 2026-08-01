package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzbyn implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbyp zza;

    zzbyn(zzbyp zzbypVar) {
        Objects.requireNonNull(zzbypVar);
        this.zza = zzbypVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        zzbyp zzbypVar = this.zza;
        Intent zzb = zzbypVar.zzb();
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzs.zzY(zzbypVar.zzc(), zzb);
    }
}
