package com.google.android.gms.internal.auth;

import android.util.Base64;
import java.io.IOException;
import p031e1.k;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
final class zzcy extends zzdc {
    final /* synthetic */ zzhu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcy(zzcz zzczVar, String str, Object obj, boolean z4, zzhu zzhuVar, byte[] bArr) {
        super(zzczVar, "getTokenRefactor__blocked_packages", obj, true, null);
        this.zza = zzhuVar;
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final Object zza(Object obj) {
        try {
            return zzhr.zzk(Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            L.m(k.k("Invalid byte[] value for ", zzc(), ": "), (String) obj, "PhenotypeFlag");
            return null;
        }
    }
}
