package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import kotlinx.coroutines.DebugKt;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class zzld implements zzpp {
    private final /* synthetic */ zzju zza;

    zzld(zzju zzjuVar) {
        this.zza = zzjuVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzpp
    public final void zza(String str, String str2, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        zzju zzjuVar = this.zza;
        if (isEmpty) {
            zzjuVar.zzb(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, str2, bundle);
        } else {
            zzjuVar.zza(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, str2, bundle, str);
        }
    }
}
