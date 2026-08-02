package com.google.android.gms.internal.p001authapiphone;

/* loaded from: classes8.dex */
public final class zzaf extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.auth.api.phone.SmsCodeBrowserClient {
    private static final com.google.android.gms.common.api.Api.ClientKey zza = new com.google.android.gms.common.api.Api.ClientKey();
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zzb = new com.google.android.gms.internal.p001authapiphone.zzac();

    public zzaf(android.app.Activity activity) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) new com.google.android.gms.common.api.Api("SmsCodeBrowser.API", zzb, zza), com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.auth.api.phone.SmsCodeBrowserClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> startSmsCodeRetriever() {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p001authapiphone.zzan.zzb).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api-phone.zzae
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.p001authapiphone.zzk) ((com.google.android.gms.internal.p001authapiphone.zzah) obj).getService()).zzh(new com.google.android.gms.internal.p001authapiphone.zzad(com.google.android.gms.internal.p001authapiphone.zzaf.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setMethodKey(1566).build());
    }

    public zzaf(android.content.Context context) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) new com.google.android.gms.common.api.Api("SmsCodeBrowser.API", zzb, zza), com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
