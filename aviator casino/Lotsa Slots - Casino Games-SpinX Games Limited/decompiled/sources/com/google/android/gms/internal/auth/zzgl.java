package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
final class zzgl extends com.google.android.gms.internal.auth.zzgv {
    zzgl(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgv
    public final void zza() {
        if (!zzj()) {
            for (int i = 0; i < zzb(); i++) {
                java.util.Map.Entry zzg = zzg(i);
                if (((com.google.android.gms.internal.auth.zzep) zzg.getKey()).zzc()) {
                    zzg.setValue(java.util.Collections.unmodifiableList((java.util.List) zzg.getValue()));
                }
            }
            for (java.util.Map.Entry entry : zzc()) {
                if (((com.google.android.gms.internal.auth.zzep) entry.getKey()).zzc()) {
                    entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
