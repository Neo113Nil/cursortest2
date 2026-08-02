package com.google.android.gms.internal.p001authapiphone;

/* loaded from: classes8.dex */
public final class zzr extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.auth.api.phone.IncomingCallRetrieverClient {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.gms.common.logging.Logger zzb = new com.google.android.gms.common.logging.Logger("MissedCallRetriever", new java.lang.String[0]);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ zzr(android.content.Context context, com.google.android.gms.common.api.Api.AbstractClientBuilder abstractClientBuilder, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) new com.google.android.gms.common.api.Api("MissedCallRetriever.API", r3, r0), com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
        com.google.android.gms.internal.p001authapiphone.zzs zzsVar;
        com.google.android.gms.common.api.Api.ClientKey clientKey;
        zzsVar = com.google.android.gms.internal.p001authapiphone.zzt.zzb;
        com.google.android.gms.internal.p001authapiphone.zzs zzsVar2 = zzsVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzsVar2, "");
        clientKey = com.google.android.gms.internal.p001authapiphone.zzt.zza;
    }

    @Override // com.google.android.gms.auth.api.phone.IncomingCallRetrieverClient
    public final com.google.android.gms.tasks.Task<android.app.PendingIntent> startIncomingCallRetriever(final com.google.android.gms.auth.api.phone.IncomingCallRetrieverRequest incomingCallRetrieverRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(incomingCallRetrieverRequest, "");
        zzb.i("InternalMissedCallRetrieverClient#startMissedCallRetriever invoked", new java.lang.Object[0]);
        com.google.android.gms.tasks.Task<android.app.PendingIntent> doRead = doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p001authapiphone.zzan.zze).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth-api-phone.zzo
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = (com.google.android.gms.tasks.TaskCompletionSource) obj2;
                com.google.android.gms.internal.p001authapiphone.zzag zzagVar = (com.google.android.gms.internal.p001authapiphone.zzag) obj;
                int i = com.google.android.gms.internal.p001authapiphone.zzr.zza;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzagVar, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskCompletionSource, "");
                ((com.google.android.gms.internal.p001authapiphone.zzh) zzagVar.getService()).zzc(new com.google.android.gms.internal.p001authapiphone.zzp(taskCompletionSource), com.google.android.gms.auth.api.phone.IncomingCallRetrieverRequest.this);
            }
        }).setMethodKey(1715).build());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(doRead, "");
        return doRead;
    }

    @Override // com.google.android.gms.auth.api.phone.IncomingCallRetrieverClient
    public final com.google.android.gms.tasks.Task<android.app.PendingIntent> startUserConsent() {
        zzb.i("InternalMissedCallRetrieverClient#startUserConsent invoked", new java.lang.Object[0]);
        com.google.android.gms.tasks.Task<android.app.PendingIntent> doRead = doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.p001authapiphone.zzan.zzf).run(com.google.android.gms.internal.p001authapiphone.zzn.zza).setMethodKey(1735).build());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(doRead, "");
        return doRead;
    }
}
