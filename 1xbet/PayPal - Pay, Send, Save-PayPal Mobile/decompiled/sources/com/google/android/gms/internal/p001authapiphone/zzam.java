package com.google.android.gms.internal.p001authapiphone;

/* loaded from: classes8.dex */
public final class zzam extends com.google.android.gms.auth.api.phone.SmsRetrieverClient {
    public zzam(android.app.Activity activity) {
        super(activity);
    }

    @Override // com.google.android.gms.auth.api.phone.SmsRetrieverClient, com.google.android.gms.auth.api.phone.SmsRetrieverApi
    public final com.google.android.gms.tasks.Task<java.lang.Void> startSmsRetriever() {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api-phone.zzal
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.p001authapiphone.zzk) ((com.google.android.gms.internal.p001authapiphone.zzah) obj).getService()).zzc(new com.google.android.gms.internal.p001authapiphone.zzai(com.google.android.gms.internal.p001authapiphone.zzam.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setFeatures(com.google.android.gms.internal.p001authapiphone.zzan.zzc).setMethodKey(1567).build());
    }

    @Override // com.google.android.gms.auth.api.phone.SmsRetrieverClient, com.google.android.gms.auth.api.phone.SmsRetrieverApi
    public final com.google.android.gms.tasks.Task<java.lang.Void> startSmsUserConsent(final java.lang.String str) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api-phone.zzak
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.p001authapiphone.zzk) ((com.google.android.gms.internal.p001authapiphone.zzah) obj).getService()).zzd(str, new com.google.android.gms.internal.p001authapiphone.zzaj(com.google.android.gms.internal.p001authapiphone.zzam.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setFeatures(com.google.android.gms.internal.p001authapiphone.zzan.zzd).setMethodKey(1568).build());
    }

    public zzam(android.content.Context context) {
        super(context);
    }
}
