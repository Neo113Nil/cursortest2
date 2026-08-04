package com.google.android.gms.internal.auth;

import p031e1.k;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
final class zzcw extends zzdc {
    public zzcw(zzcz zzczVar, String str, Boolean bool, boolean z4) {
        super(zzczVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        if (zzcb.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzcb.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        L.m(k.k("Invalid boolean value for ", zzc(), ": "), (String) obj, "PhenotypeFlag");
        return null;
    }
}
