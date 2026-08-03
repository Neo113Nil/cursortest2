package com.google.android.gms.auth.account;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes3.dex */
final class zzg implements com.google.android.gms.common.internal.PendingResultUtil.ResultConverter {
    zzg(com.google.android.gms.auth.account.WorkAccountClient workAccountClient) {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ java.lang.Object convert(com.google.android.gms.common.api.Result result) {
        return ((com.google.android.gms.auth.account.WorkAccountApi.AddAccountResult) result).getAccount();
    }
}
