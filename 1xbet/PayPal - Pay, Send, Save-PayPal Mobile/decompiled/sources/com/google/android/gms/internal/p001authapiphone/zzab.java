package com.google.android.gms.internal.p001authapiphone;

/* loaded from: classes8.dex */
public final class zzab extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.auth.api.phone.SmsCodeAutofillClient {
    private static final com.google.android.gms.common.api.Api.ClientKey zza = new com.google.android.gms.common.api.Api.ClientKey();
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zzb = new com.google.android.gms.internal.p001authapiphone.zzu();

    public zzab(android.app.Activity activity) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) new com.google.android.gms.common.api.Api("SmsCodeAutofill.API", zzb, zza), com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.auth.api.phone.SmsCodeAutofillClient
    public final com.google.android.gms.tasks.Task<java.lang.Integer> checkPermissionState() {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p001authapiphone.zzan.zza).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api-phone.zzy
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.p001authapiphone.zzk) ((com.google.android.gms.internal.p001authapiphone.zzah) obj).getService()).zzf(new com.google.android.gms.internal.p001authapiphone.zzw(com.google.android.gms.internal.p001authapiphone.zzab.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setMethodKey(1564).build());
    }

    @Override // com.google.android.gms.auth.api.phone.SmsCodeAutofillClient
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> hasOngoingSmsRequest(final java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        com.google.android.gms.common.internal.Preconditions.checkArgument(!str.isEmpty(), "The package name cannot be empty.");
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p001authapiphone.zzan.zza).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api-phone.zzz
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.p001authapiphone.zzk) ((com.google.android.gms.internal.p001authapiphone.zzah) obj).getService()).zzg(str, new com.google.android.gms.internal.p001authapiphone.zzx(com.google.android.gms.internal.p001authapiphone.zzab.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setMethodKey(1565).build());
    }

    @Override // com.google.android.gms.auth.api.phone.SmsCodeAutofillClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> startSmsCodeRetriever() {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p001authapiphone.zzan.zza).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api-phone.zzaa
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.p001authapiphone.zzk) ((com.google.android.gms.internal.p001authapiphone.zzah) obj).getService()).zze(new com.google.android.gms.internal.p001authapiphone.zzv(com.google.android.gms.internal.p001authapiphone.zzab.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setMethodKey(1563).build());
    }

    public zzab(android.content.Context context) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) new com.google.android.gms.common.api.Api("SmsCodeAutofill.API", zzb, zza), com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
