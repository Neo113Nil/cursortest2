package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
public final class zzbd extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.tapandpay.TapAndPayClient {
    public static final /* synthetic */ int zza = 0;

    public zzbd(android.app.Activity activity) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) com.google.android.gms.tapandpay.TapAndPay.zza, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext> createPushProvisionSession(final com.google.android.gms.tapandpay.issuer.CreatePushProvisionSessionRequest createPushProvisionSessionRequest) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzae
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbm zzbmVar = (com.google.android.gms.internal.tapandpay.zzbm) obj;
                ((com.google.android.gms.internal.tapandpay.zzh) zzbmVar.getService()).zzu(createPushProvisionSessionRequest, new com.google.android.gms.internal.tapandpay.zzx(com.google.android.gms.internal.tapandpay.zzbd.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), com.google.android.gms.internal.tapandpay.zzf.zza(zzbmVar.getContext()));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzJ).setMethodKey(2107).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final void createWallet(final android.app.Activity activity, final int i) {
        doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzao
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbm zzbmVar = (com.google.android.gms.internal.tapandpay.zzbm) obj;
                int i2 = com.google.android.gms.internal.tapandpay.zzbd.zza;
                ((com.google.android.gms.internal.tapandpay.zzh) zzbmVar.getService()).zzo(new com.google.android.gms.internal.tapandpay.zzbl(activity, i), com.google.android.gms.internal.tapandpay.zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2112).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final com.google.android.gms.tasks.Task<java.lang.String> getActiveWalletId() {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzav
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbm zzbmVar = (com.google.android.gms.internal.tapandpay.zzbm) obj;
                ((com.google.android.gms.internal.tapandpay.zzh) zzbmVar.getService()).zze(new com.google.android.gms.internal.tapandpay.zzv(com.google.android.gms.internal.tapandpay.zzbd.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), com.google.android.gms.internal.tapandpay.zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2103).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.tapandpay.issuer.ReachableDeviceWalletInfo>> getActiveWalletInfos() {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzaw
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbm zzbmVar = (com.google.android.gms.internal.tapandpay.zzbm) obj;
                ((com.google.android.gms.internal.tapandpay.zzh) zzbmVar.getService()).zzB(new com.google.android.gms.internal.tapandpay.zzw(com.google.android.gms.internal.tapandpay.zzbd.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), com.google.android.gms.internal.tapandpay.zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2178).setFeatures(com.google.android.gms.tapandpay.zza.zzk).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    @java.lang.Deprecated
    public final com.google.android.gms.tasks.Task<java.lang.String> getEnvironment() {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzai
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbm zzbmVar = (com.google.android.gms.internal.tapandpay.zzbm) obj;
                ((com.google.android.gms.internal.tapandpay.zzh) zzbmVar.getService()).zzr(new com.google.android.gms.internal.tapandpay.zzaa(com.google.android.gms.internal.tapandpay.zzbd.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), com.google.android.gms.internal.tapandpay.zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2110).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final com.google.android.gms.tasks.Task<java.lang.String> getLinkingToken(final java.lang.String str) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzak
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbm zzbmVar = (com.google.android.gms.internal.tapandpay.zzbm) obj;
                ((com.google.android.gms.internal.tapandpay.zzh) zzbmVar.getService()).zzt(str, new com.google.android.gms.internal.tapandpay.zzn(com.google.android.gms.internal.tapandpay.zzbd.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), com.google.android.gms.internal.tapandpay.zzf.zza(zzbmVar.getContext()));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzb).setMethodKey(2111).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    @java.lang.Deprecated
    public final com.google.android.gms.tasks.Task<java.lang.String> getStableHardwareId() {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzag
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbm zzbmVar = (com.google.android.gms.internal.tapandpay.zzbm) obj;
                ((com.google.android.gms.internal.tapandpay.zzh) zzbmVar.getService()).zzp(new com.google.android.gms.internal.tapandpay.zzy(com.google.android.gms.internal.tapandpay.zzbd.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), com.google.android.gms.internal.tapandpay.zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2109).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    @java.lang.Deprecated
    public final com.google.android.gms.tasks.Task<com.google.android.gms.tapandpay.issuer.TokenStatus> getTokenStatus(final int i, final java.lang.String str) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzan
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbm zzbmVar = (com.google.android.gms.internal.tapandpay.zzbm) obj;
                ((com.google.android.gms.internal.tapandpay.zzh) zzbmVar.getService()).zzf(i, str, new com.google.android.gms.internal.tapandpay.zzt(com.google.android.gms.internal.tapandpay.zzbd.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), com.google.android.gms.internal.tapandpay.zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2102).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> hasEligibleTokenizationTarget(final com.google.android.gms.tapandpay.issuer.HasEligibleTokenizationTargetRequest hasEligibleTokenizationTargetRequest) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzat
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbm zzbmVar = (com.google.android.gms.internal.tapandpay.zzbm) obj;
                ((com.google.android.gms.internal.tapandpay.zzh) zzbmVar.getService()).zzA(hasEligibleTokenizationTargetRequest, new com.google.android.gms.internal.tapandpay.zzs(com.google.android.gms.internal.tapandpay.zzbd.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), com.google.android.gms.internal.tapandpay.zzf.zza(zzbmVar.getContext()));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzv).setMethodKey(2175).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> isTokenized(final com.google.android.gms.tapandpay.issuer.IsTokenizedRequest isTokenizedRequest) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzar
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbm zzbmVar = (com.google.android.gms.internal.tapandpay.zzbm) obj;
                ((com.google.android.gms.internal.tapandpay.zzh) zzbmVar.getService()).zzy(isTokenizedRequest, new com.google.android.gms.internal.tapandpay.zzq(com.google.android.gms.internal.tapandpay.zzbd.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), com.google.android.gms.internal.tapandpay.zzf.zza(zzbmVar.getContext()));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzZ).setMethodKey(2164).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    @java.lang.Deprecated
    public final com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.tapandpay.issuer.TokenInfo>> listTokens() {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzap
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbm zzbmVar = (com.google.android.gms.internal.tapandpay.zzbm) obj;
                ((com.google.android.gms.internal.tapandpay.zzh) zzbmVar.getService()).zzw(new com.google.android.gms.internal.tapandpay.zzo(com.google.android.gms.internal.tapandpay.zzbd.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), com.google.android.gms.internal.tapandpay.zzf.zza(zzbmVar.getContext()));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzZ).setMethodKey(2163).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final void pushTokenize(final android.app.Activity activity, final com.google.android.gms.tapandpay.issuer.PushTokenizeRequest pushTokenizeRequest, final int i) {
        doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzbb
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbm zzbmVar = (com.google.android.gms.internal.tapandpay.zzbm) obj;
                int i2 = com.google.android.gms.internal.tapandpay.zzbd.zza;
                ((com.google.android.gms.internal.tapandpay.zzh) zzbmVar.getService()).zzn(com.google.android.gms.tapandpay.issuer.PushTokenizeRequest.this, new com.google.android.gms.internal.tapandpay.zzbl(activity, i), com.google.android.gms.internal.tapandpay.zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2106).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> registerDataChangedListener(com.google.android.gms.tapandpay.TapAndPay.DataChangedListener dataChangedListener) {
        final com.google.android.gms.common.api.internal.ListenerHolder registerListener = registerListener(dataChangedListener, com.google.android.gms.tapandpay.TapAndPayClient.DATA_CHANGED_LISTENER_KEY);
        return doRegisterEventListener(com.google.android.gms.common.api.internal.RegistrationMethods.builder().withHolder(registerListener).register(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzal
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbm zzbmVar = (com.google.android.gms.internal.tapandpay.zzbm) obj;
                int i = com.google.android.gms.internal.tapandpay.zzbd.zza;
                ((com.google.android.gms.internal.tapandpay.zzh) zzbmVar.getService()).zzd(new com.google.android.gms.tapandpay.zze(null, com.google.android.gms.common.api.internal.ListenerHolder.this), com.google.android.gms.internal.tapandpay.zzf.zza(zzbmVar.getContext()));
                ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(null);
            }
        }).unregister(com.google.android.gms.internal.tapandpay.zzam.zza).setMethodKey(2155).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> removeDataChangedListener(com.google.android.gms.tapandpay.TapAndPay.DataChangedListener dataChangedListener) {
        return com.google.android.gms.common.api.internal.TaskUtil.toVoidTaskThatFailsOnFalse(doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(dataChangedListener, com.google.android.gms.tapandpay.TapAndPayClient.DATA_CHANGED_LISTENER_KEY), 2152));
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final void requestDeleteToken(final android.app.Activity activity, final com.google.android.gms.tapandpay.issuer.RequestDeleteTokenRequest requestDeleteTokenRequest, final int i) {
        doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzay
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbm zzbmVar = (com.google.android.gms.internal.tapandpay.zzbm) obj;
                int i2 = com.google.android.gms.internal.tapandpay.zzbd.zza;
                ((com.google.android.gms.internal.tapandpay.zzh) zzbmVar.getService()).zzm(com.google.android.gms.tapandpay.issuer.RequestDeleteTokenRequest.this, new com.google.android.gms.internal.tapandpay.zzbl(activity, i), com.google.android.gms.internal.tapandpay.zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2104).setFeatures(com.google.android.gms.tapandpay.zza.zzN).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    @java.lang.Deprecated
    public final void requestSelectToken(final android.app.Activity activity, final com.google.android.gms.tapandpay.issuer.RequestSelectTokenRequest requestSelectTokenRequest, final int i) {
        doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzba
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbm zzbmVar = (com.google.android.gms.internal.tapandpay.zzbm) obj;
                int i2 = com.google.android.gms.internal.tapandpay.zzbd.zza;
                ((com.google.android.gms.internal.tapandpay.zzh) zzbmVar.getService()).zzk(com.google.android.gms.tapandpay.issuer.RequestSelectTokenRequest.this, new com.google.android.gms.internal.tapandpay.zzbl(activity, i), com.google.android.gms.internal.tapandpay.zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2105).setFeatures(com.google.android.gms.tapandpay.zza.zzO).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final void serverPushProvision(final android.app.Activity activity, final com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest serverPushProvisionRequest, final int i) {
        doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzaf
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbm zzbmVar = (com.google.android.gms.internal.tapandpay.zzbm) obj;
                int i2 = com.google.android.gms.internal.tapandpay.zzbd.zza;
                ((com.google.android.gms.internal.tapandpay.zzh) zzbmVar.getService()).zzv(com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest.this, new com.google.android.gms.internal.tapandpay.zzbl(activity, i), com.google.android.gms.internal.tapandpay.zzf.zza(zzbmVar.getContext()));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzJ).setMethodKey(2108).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final void tokenize(final android.app.Activity activity, final com.google.android.gms.tapandpay.issuer.TokenizeRequest tokenizeRequest, final int i) {
        doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzac
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbm zzbmVar = (com.google.android.gms.internal.tapandpay.zzbm) obj;
                int i2 = com.google.android.gms.internal.tapandpay.zzbd.zza;
                ((com.google.android.gms.internal.tapandpay.zzh) zzbmVar.getService()).zzi(com.google.android.gms.tapandpay.issuer.TokenizeRequest.this, new com.google.android.gms.internal.tapandpay.zzbl(activity, i), com.google.android.gms.internal.tapandpay.zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2101).setFeatures(com.google.android.gms.tapandpay.zza.zzy).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final com.google.android.gms.tasks.Task<android.app.PendingIntent> viewToken(final com.google.android.gms.tapandpay.issuer.ViewTokenRequest viewTokenRequest) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzas
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbm zzbmVar = (com.google.android.gms.internal.tapandpay.zzbm) obj;
                ((com.google.android.gms.internal.tapandpay.zzh) zzbmVar.getService()).zzz(viewTokenRequest, new com.google.android.gms.internal.tapandpay.zzr(com.google.android.gms.internal.tapandpay.zzbd.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), com.google.android.gms.internal.tapandpay.zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2160).setFeatures(com.google.android.gms.tapandpay.zza.zzx).build());
    }

    public zzbd(android.content.Context context) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) com.google.android.gms.tapandpay.TapAndPay.zza, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final com.google.android.gms.tasks.Task<java.lang.String> getEnvironment(final com.google.android.gms.tapandpay.issuer.GetEnvironmentRequest getEnvironmentRequest) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzaj
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbm zzbmVar = (com.google.android.gms.internal.tapandpay.zzbm) obj;
                ((com.google.android.gms.internal.tapandpay.zzh) zzbmVar.getService()).zzs(getEnvironmentRequest, new com.google.android.gms.internal.tapandpay.zzab(com.google.android.gms.internal.tapandpay.zzbd.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), com.google.android.gms.internal.tapandpay.zzf.zza(zzbmVar.getContext()));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzo).setMethodKey(2110).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final com.google.android.gms.tasks.Task<java.lang.String> getStableHardwareId(final com.google.android.gms.tapandpay.issuer.GetStableHardwareIdRequest getStableHardwareIdRequest) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzah
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbm zzbmVar = (com.google.android.gms.internal.tapandpay.zzbm) obj;
                ((com.google.android.gms.internal.tapandpay.zzh) zzbmVar.getService()).zzq(getStableHardwareIdRequest, new com.google.android.gms.internal.tapandpay.zzz(com.google.android.gms.internal.tapandpay.zzbd.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), com.google.android.gms.internal.tapandpay.zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2109).setFeatures(com.google.android.gms.tapandpay.zza.zzr).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.tapandpay.issuer.TokenStatus> getTokenStatus(final com.google.android.gms.tapandpay.issuer.GetTokenStatusRequest getTokenStatusRequest) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzau
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbm zzbmVar = (com.google.android.gms.internal.tapandpay.zzbm) obj;
                ((com.google.android.gms.internal.tapandpay.zzh) zzbmVar.getService()).zzg(getTokenStatusRequest, new com.google.android.gms.internal.tapandpay.zzu(com.google.android.gms.internal.tapandpay.zzbd.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), com.google.android.gms.internal.tapandpay.zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2102).setFeatures(com.google.android.gms.tapandpay.zza.zzt).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final com.google.android.gms.tasks.Task<android.app.PendingIntent> pushTokenize(final com.google.android.gms.tapandpay.issuer.PushTokenizeRequest pushTokenizeRequest) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzad
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbm zzbmVar = (com.google.android.gms.internal.tapandpay.zzbm) obj;
                int i = com.google.android.gms.internal.tapandpay.zzbd.zza;
                ((com.google.android.gms.internal.tapandpay.zzh) zzbmVar.getService()).zzn(com.google.android.gms.tapandpay.issuer.PushTokenizeRequest.this, new com.google.android.gms.internal.tapandpay.zzbk((com.google.android.gms.tasks.TaskCompletionSource) obj2), com.google.android.gms.internal.tapandpay.zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2106).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    public final com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.tapandpay.issuer.TokenInfo>> listTokens(final com.google.android.gms.tapandpay.issuer.ListTokensRequest listTokensRequest) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzaq
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbm zzbmVar = (com.google.android.gms.internal.tapandpay.zzbm) obj;
                ((com.google.android.gms.internal.tapandpay.zzh) zzbmVar.getService()).zzx(listTokensRequest, new com.google.android.gms.internal.tapandpay.zzp(com.google.android.gms.internal.tapandpay.zzbd.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), com.google.android.gms.internal.tapandpay.zzf.zza(zzbmVar.getContext()));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzaa).setMethodKey(2163).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    @java.lang.Deprecated
    public final void requestDeleteToken(final android.app.Activity activity, final java.lang.String str, final int i, final int i2) {
        doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzax
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbm zzbmVar = (com.google.android.gms.internal.tapandpay.zzbm) obj;
                int i3 = com.google.android.gms.internal.tapandpay.zzbd.zza;
                ((com.google.android.gms.internal.tapandpay.zzh) zzbmVar.getService()).zzl(i, str, new com.google.android.gms.internal.tapandpay.zzbl(activity, i2), com.google.android.gms.internal.tapandpay.zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2104).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    @java.lang.Deprecated
    public final void requestSelectToken(final android.app.Activity activity, final java.lang.String str, final int i, final int i2) {
        doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzaz
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbm zzbmVar = (com.google.android.gms.internal.tapandpay.zzbm) obj;
                int i3 = com.google.android.gms.internal.tapandpay.zzbd.zza;
                ((com.google.android.gms.internal.tapandpay.zzh) zzbmVar.getService()).zzj(i, str, new com.google.android.gms.internal.tapandpay.zzbl(activity, i2), com.google.android.gms.internal.tapandpay.zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2105).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPayClient
    @java.lang.Deprecated
    public final void tokenize(final android.app.Activity activity, final java.lang.String str, final int i, final java.lang.String str2, final int i2, final int i3) {
        doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzbc
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbm zzbmVar = (com.google.android.gms.internal.tapandpay.zzbm) obj;
                int i4 = com.google.android.gms.internal.tapandpay.zzbd.zza;
                ((com.google.android.gms.internal.tapandpay.zzh) zzbmVar.getService()).zzh(i, str, str2, i2, new com.google.android.gms.internal.tapandpay.zzbl(activity, i3), com.google.android.gms.internal.tapandpay.zzf.zza(zzbmVar.getContext()));
            }
        }).setMethodKey(2101).build());
    }
}
