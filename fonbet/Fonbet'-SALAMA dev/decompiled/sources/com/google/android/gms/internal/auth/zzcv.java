package com.google.android.gms.internal.auth;

import e1.k;
import w1.L;

/* loaded from: classes.dex */
final class zzcv extends zzdc {
    public zzcv(zzcz zzczVar, String str, Long l7, boolean z4) {
        super(zzczVar, str, l7, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            L.m(k.k("Invalid long value for ", zzc(), ": "), (String) obj, "PhenotypeFlag");
            return null;
        }
    }
}
