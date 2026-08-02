package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzai implements com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult {
    private static final android.accounts.Account zza = new android.accounts.Account("DUMMY_NAME", "com.google");
    private final com.google.android.gms.common.api.Status zzb;
    private final android.accounts.Account zzc;

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zzb;
    }

    @Override // com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult
    public final android.accounts.Account getAccount() {
        return this.zzc;
    }

    public zzai(com.google.android.gms.common.api.Status status, android.accounts.Account account) {
        this.zzb = status;
        this.zzc = account == null ? zza : account;
    }
}
