package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class zzpd implements zzpp {
    final /* synthetic */ zzou zza;

    zzpd(zzou zzouVar) {
        this.zza = zzouVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzpp
    public final void zza(String str, String str2, Bundle bundle) {
        zzic zzicVar;
        zzic zzicVar2;
        boolean isEmpty = TextUtils.isEmpty(str);
        zzou zzouVar = this.zza;
        if (!isEmpty) {
            zzouVar.zzl().zzb(new zzpc(this, str, str2, bundle));
            return;
        }
        zzicVar = zzouVar.zzm;
        if (zzicVar != null) {
            zzicVar2 = this.zza.zzm;
            zzicVar2.zzj().zzg().zza("AppId not known when logging event", str2);
        }
    }
}
