package com.google.firebase.auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;

/* loaded from: classes4.dex */
public class TotpMultiFactorAssertion extends MultiFactorAssertion {
    private final String zza;

    @Nullable
    private final TotpSecret zzb;

    @Nullable
    private final String zzc;

    public TotpMultiFactorAssertion(@NonNull String str, @Nullable TotpSecret totpSecret, @Nullable String str2) {
        C0875q.d(str);
        this.zza = str;
        this.zzb = totpSecret;
        this.zzc = str2;
    }

    @Override // com.google.firebase.auth.MultiFactorAssertion
    @NonNull
    public String getFactorId() {
        return TotpMultiFactorGenerator.FACTOR_ID;
    }

    @Nullable
    public final TotpSecret zza() {
        return this.zzb;
    }

    @Nullable
    public final String zzb() {
        return this.zzc;
    }

    @NonNull
    public final String zzc() {
        return this.zza;
    }
}
