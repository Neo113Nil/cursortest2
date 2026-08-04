package com.google.android.gms.internal.auth;

import p031e1.k;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
final class zzcx extends zzdc {
    public zzcx(zzcz zzczVar, String str, Double d7, boolean z4) {
        super(zzczVar, str, d7, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            L.m(k.k("Invalid double value for ", zzc(), ": "), (String) obj, "PhenotypeFlag");
            return null;
        }
    }
}
