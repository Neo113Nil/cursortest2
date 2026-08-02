package com.google.android.gms.internal.measurement;

import android.support.v4.media.b;
import defpackage.g;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzbi extends zzav {
    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao zza(String str, zzg zzgVar, List list) {
        if (str == null || str.isEmpty() || !zzgVar.zzd(str)) {
            throw new IllegalArgumentException(g.a("Command not found: ", str));
        }
        zzao zzh = zzgVar.zzh(str);
        if (zzh instanceof zzai) {
            return ((zzai) zzh).zza(zzgVar, list);
        }
        throw new IllegalArgumentException(b.b("Function ", str, " is not defined"));
    }
}
