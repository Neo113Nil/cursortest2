package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final class AccountIdentifiers {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    AccountIdentifiers(java.lang.String str, java.lang.String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public java.lang.String getObfuscatedAccountId() {
        return this.zza;
    }

    public java.lang.String getObfuscatedProfileId() {
        return this.zzb;
    }
}
