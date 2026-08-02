package com.google.firebase.auth.internal;

import com.google.android.gms.common.api.internal.ComponentCallbacks2C0829c;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzcd implements ComponentCallbacks2C0829c.a {
    private final /* synthetic */ zzca zza;

    public zzcd(zzca zzcaVar) {
        Objects.requireNonNull(zzcaVar);
        this.zza = zzcaVar;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C0829c.a
    public final void onBackgroundStateChanged(boolean z) {
        boolean zzb;
        zzaq zzaqVar;
        if (z) {
            this.zza.zzc = true;
            this.zza.zza();
            return;
        }
        this.zza.zzc = false;
        zzb = this.zza.zzb();
        if (zzb) {
            zzaqVar = this.zza.zzb;
            zzaqVar.zzc();
        }
    }
}
