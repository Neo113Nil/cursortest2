package com.google.android.gms.auth.api;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes3.dex */
public final class AuthProxyOptions implements com.google.android.gms.common.api.Api.ApiOptions.Optional {
    public static final com.google.android.gms.auth.api.AuthProxyOptions zza = new com.google.android.gms.auth.api.AuthProxyOptions(new android.os.Bundle(), null);
    private final android.os.Bundle zzb;

    /* synthetic */ AuthProxyOptions(android.os.Bundle bundle, com.google.android.gms.auth.api.zzb zzbVar) {
        this.zzb = bundle;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.auth.api.AuthProxyOptions) {
            return com.google.android.gms.common.internal.Objects.checkBundlesEquality(this.zzb, ((com.google.android.gms.auth.api.AuthProxyOptions) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzb);
    }

    public final android.os.Bundle zza() {
        return new android.os.Bundle(this.zzb);
    }
}
