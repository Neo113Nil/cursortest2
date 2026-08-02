package com.google.android.gms.auth.api.phone;

/* loaded from: classes8.dex */
public abstract class SmsRetrieverClient extends com.google.android.gms.common.api.GoogleApi<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> implements com.google.android.gms.auth.api.phone.SmsRetrieverApi {
    private static final com.google.android.gms.common.api.Api.ClientKey zza = new com.google.android.gms.common.api.Api.ClientKey();
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zzb = new com.google.android.gms.auth.api.phone.zzc();

    public SmsRetrieverClient(android.app.Activity activity) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) new com.google.android.gms.common.api.Api("SmsRetriever.API", zzb, zza), com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.auth.api.phone.SmsRetrieverApi
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> startSmsRetriever();

    @Override // com.google.android.gms.auth.api.phone.SmsRetrieverApi
    public abstract com.google.android.gms.tasks.Task<java.lang.Void> startSmsUserConsent(java.lang.String str);

    public SmsRetrieverClient(android.content.Context context) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) new com.google.android.gms.common.api.Api("SmsRetriever.API", zzb, zza), com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
