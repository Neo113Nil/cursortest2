package com.google.android.gms.auth.account;

/* loaded from: classes8.dex */
final class zzg implements com.google.android.gms.common.internal.PendingResultUtil.ResultConverter {
    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ java.lang.Object convert(com.google.android.gms.common.api.Result result) {
        return ((com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult) result).getAccount();
    }

    zzg(com.google.android.gms.auth.account.WorkAccountClient workAccountClient) {
    }
}
