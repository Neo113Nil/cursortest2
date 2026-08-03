package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
class BillingClientImpl extends com.android.billingclient.api.BillingClient {
    private boolean zzA;
    private java.util.concurrent.ExecutorService zzB;
    private volatile int zza;
    private final java.lang.String zzb;
    private final android.os.Handler zzc;
    private volatile com.android.billingclient.api.zzo zzd;
    private android.content.Context zze;
    private com.android.billingclient.api.zzcc zzf;
    private volatile com.google.android.gms.internal.play_billing.zzs zzg;
    private volatile com.android.billingclient.api.zzbc zzh;
    private boolean zzi;
    private boolean zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private com.android.billingclient.api.PendingPurchasesParams zzz;

    private BillingClientImpl(android.app.Activity activity, com.android.billingclient.api.PendingPurchasesParams pendingPurchasesParams, java.lang.String str) {
        this(activity.getApplicationContext(), pendingPurchasesParams, new com.android.billingclient.api.zzbu(), str, null, null, null, null);
    }

    private void initialize(android.content.Context context, com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener, com.android.billingclient.api.PendingPurchasesParams pendingPurchasesParams, com.android.billingclient.api.zzc zzcVar, java.lang.String str, com.android.billingclient.api.zzcc zzccVar) {
        this.zze = context.getApplicationContext();
        com.google.android.gms.internal.play_billing.zzgt zzy = com.google.android.gms.internal.play_billing.zzgu.zzy();
        zzy.zzn(str);
        zzy.zzm(this.zze.getPackageName());
        if (zzccVar != null) {
            this.zzf = zzccVar;
        } else {
            this.zzf = new com.android.billingclient.api.zzch(this.zze, (com.google.android.gms.internal.play_billing.zzgu) zzy.zzf());
        }
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zzd = new com.android.billingclient.api.zzo(this.zze, purchasesUpdatedListener, null, zzcVar, null, this.zzf);
        this.zzz = pendingPurchasesParams;
        this.zzA = zzcVar != null;
        this.zze.getPackageName();
    }

    private int launchBillingFlowCpp(android.app.Activity activity, com.android.billingclient.api.BillingFlowParams billingFlowParams) {
        return launchBillingFlow(activity, billingFlowParams).getResponseCode();
    }

    private void startConnection(long j) {
        com.android.billingclient.api.zzbu zzbuVar = new com.android.billingclient.api.zzbu(j);
        if (isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Service connection is valid. No need to re-initialize.");
            zzaq(com.android.billingclient.api.zzcb.zzc(6));
            zzbuVar.onBillingSetupFinished(com.android.billingclient.api.zzce.zzl);
            return;
        }
        int i = 1;
        if (this.zza == 1) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Client is already in the process of connecting to billing service.");
            zzap(com.android.billingclient.api.zzcb.zza(37, 6, com.android.billingclient.api.zzce.zzd));
            zzbuVar.onBillingSetupFinished(com.android.billingclient.api.zzce.zzd);
            return;
        }
        if (this.zza == 3) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            zzap(com.android.billingclient.api.zzcb.zza(38, 6, com.android.billingclient.api.zzce.zzm));
            zzbuVar.onBillingSetupFinished(com.android.billingclient.api.zzce.zzm);
            return;
        }
        this.zza = 1;
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Starting in-app billing setup.");
        this.zzh = new com.android.billingclient.api.zzbc(this, zzbuVar, null);
        android.content.Intent intent = new android.content.Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        java.util.List<android.content.pm.ResolveInfo> queryIntentServices = this.zze.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            i = 41;
        } else {
            android.content.pm.ResolveInfo resolveInfo = queryIntentServices.get(0);
            if (resolveInfo.serviceInfo != null) {
                java.lang.String str = resolveInfo.serviceInfo.packageName;
                java.lang.String str2 = resolveInfo.serviceInfo.name;
                if (!"com.android.vending".equals(str) || str2 == null) {
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "The device doesn't have valid Play Store.");
                    i = 40;
                } else {
                    android.content.ComponentName componentName = new android.content.ComponentName(str, str2);
                    android.content.Intent intent2 = new android.content.Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.zzb);
                    if (this.zze.bindService(intent2, this.zzh, 1)) {
                        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Service was bonded successfully.");
                        return;
                    } else {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Connection to Billing service is blocked.");
                        i = 39;
                    }
                }
            }
        }
        this.zza = 0;
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Billing service unavailable on device.");
        zzap(com.android.billingclient.api.zzcb.zza(i, 6, com.android.billingclient.api.zzce.zzc));
        zzbuVar.onBillingSetupFinished(com.android.billingclient.api.zzce.zzc);
    }

    static /* bridge */ /* synthetic */ com.android.billingclient.api.zzcz zzag(com.android.billingclient.api.BillingClientImpl billingClientImpl, java.lang.String str, int i) {
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Querying owned items, item type: ".concat(java.lang.String.valueOf(str)));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.os.Bundle zzc = com.google.android.gms.internal.play_billing.zzb.zzc(billingClientImpl.zzn, billingClientImpl.zzv, billingClientImpl.zzz.isEnabledForOneTimeProducts(), billingClientImpl.zzz.isEnabledForPrepaidPlans(), billingClientImpl.zzb);
        java.util.List list = null;
        java.lang.String str2 = null;
        while (true) {
            try {
                android.os.Bundle zzj = billingClientImpl.zzn ? billingClientImpl.zzg.zzj(true != billingClientImpl.zzv ? 9 : 19, billingClientImpl.zze.getPackageName(), str, str2, zzc) : billingClientImpl.zzg.zzi(3, billingClientImpl.zze.getPackageName(), str, str2);
                com.android.billingclient.api.zzda zza = com.android.billingclient.api.zzdb.zza(zzj, "BillingClient", "getPurchase()");
                com.android.billingclient.api.BillingResult zza2 = zza.zza();
                if (zza2 != com.android.billingclient.api.zzce.zzl) {
                    billingClientImpl.zzap(com.android.billingclient.api.zzcb.zza(zza.zzb(), 9, zza2));
                    return new com.android.billingclient.api.zzcz(zza2, list);
                }
                java.util.ArrayList<java.lang.String> stringArrayList = zzj.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                java.util.ArrayList<java.lang.String> stringArrayList2 = zzj.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                java.util.ArrayList<java.lang.String> stringArrayList3 = zzj.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z = false;
                for (int i2 = 0; i2 < stringArrayList2.size(); i2++) {
                    java.lang.String str3 = stringArrayList2.get(i2);
                    java.lang.String str4 = stringArrayList3.get(i2);
                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Sku is owned: ".concat(java.lang.String.valueOf(stringArrayList.get(i2))));
                    try {
                        com.android.billingclient.api.Purchase purchase = new com.android.billingclient.api.Purchase(str3, str4);
                        if (android.text.TextUtils.isEmpty(purchase.getPurchaseToken())) {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "BUG: empty/null token!");
                            z = true;
                        }
                        arrayList.add(purchase);
                    } catch (org.json.JSONException e) {
                        com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got an exception trying to decode the purchase!", e);
                        billingClientImpl.zzap(com.android.billingclient.api.zzcb.zza(51, 9, com.android.billingclient.api.zzce.zzj));
                        return new com.android.billingclient.api.zzcz(com.android.billingclient.api.zzce.zzj, null);
                    }
                }
                if (z) {
                    billingClientImpl.zzap(com.android.billingclient.api.zzcb.zza(26, 9, com.android.billingclient.api.zzce.zzj));
                }
                str2 = zzj.getString("INAPP_CONTINUATION_TOKEN");
                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Continuation token: ".concat(java.lang.String.valueOf(str2)));
                if (android.text.TextUtils.isEmpty(str2)) {
                    return new com.android.billingclient.api.zzcz(com.android.billingclient.api.zzce.zzl, arrayList);
                }
                list = null;
            } catch (java.lang.Exception e2) {
                billingClientImpl.zzap(com.android.billingclient.api.zzcb.zza(52, 9, com.android.billingclient.api.zzce.zzm));
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got exception trying to get purchasesm try to reconnect", e2);
                return new com.android.billingclient.api.zzcz(com.android.billingclient.api.zzce.zzm, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.os.Handler zzaj() {
        return android.os.Looper.myLooper() == null ? this.zzc : new android.os.Handler(android.os.Looper.myLooper());
    }

    private final com.android.billingclient.api.BillingResult zzak(final com.android.billingclient.api.BillingResult billingResult) {
        if (java.lang.Thread.interrupted()) {
            return billingResult;
        }
        this.zzc.post(new java.lang.Runnable() { // from class: com.android.billingclient.api.zzq
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.BillingClientImpl.this.zzS(billingResult);
            }
        });
        return billingResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.android.billingclient.api.BillingResult zzal() {
        return (this.zza == 0 || this.zza == 3) ? com.android.billingclient.api.zzce.zzm : com.android.billingclient.api.zzce.zzj;
    }

    private final java.lang.String zzam(com.android.billingclient.api.QueryProductDetailsParams queryProductDetailsParams) {
        if (android.text.TextUtils.isEmpty(null)) {
            return this.zze.getPackageName();
        }
        return null;
    }

    private static java.lang.String zzan() {
        try {
            return (java.lang.String) java.lang.Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (java.lang.Exception unused) {
            return com.android.billingclient.BuildConfig.VERSION_NAME;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.concurrent.Future zzao(java.util.concurrent.Callable callable, long j, final java.lang.Runnable runnable, android.os.Handler handler) {
        if (this.zzB == null) {
            this.zzB = java.util.concurrent.Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.zzb.zza, new com.android.billingclient.api.zzat(this));
        }
        try {
            final java.util.concurrent.Future submit = this.zzB.submit(callable);
            handler.postDelayed(new java.lang.Runnable() { // from class: com.android.billingclient.api.zzy
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.concurrent.Future future = submit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    java.lang.Runnable runnable2 = runnable;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j * 0.95d));
            return submit;
        } catch (java.lang.Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzap(com.google.android.gms.internal.play_billing.zzga zzgaVar) {
        this.zzf.zzb(zzgaVar, this.zzk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaq(com.google.android.gms.internal.play_billing.zzge zzgeVar) {
        this.zzf.zzd(zzgeVar, this.zzk);
    }

    private final void zzar(java.lang.String str, final com.android.billingclient.api.PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        if (!isReady()) {
            zzap(com.android.billingclient.api.zzcb.zza(2, 11, com.android.billingclient.api.zzce.zzm));
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(com.android.billingclient.api.zzce.zzm, null);
        } else if (zzao(new com.android.billingclient.api.zzav(this, str, purchaseHistoryResponseListener), 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzam
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.BillingClientImpl.this.zzaa(purchaseHistoryResponseListener);
            }
        }, zzaj()) == null) {
            com.android.billingclient.api.BillingResult zzal = zzal();
            zzap(com.android.billingclient.api.zzcb.zza(25, 11, zzal));
            purchaseHistoryResponseListener.onPurchaseHistoryResponse(zzal, null);
        }
    }

    private final void zzas(java.lang.String str, final com.android.billingclient.api.PurchasesResponseListener purchasesResponseListener) {
        if (!isReady()) {
            zzap(com.android.billingclient.api.zzcb.zza(2, 9, com.android.billingclient.api.zzce.zzm));
            purchasesResponseListener.onQueryPurchasesResponse(com.android.billingclient.api.zzce.zzm, com.google.android.gms.internal.play_billing.zzai.zzk());
        } else if (android.text.TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please provide a valid product type.");
            zzap(com.android.billingclient.api.zzcb.zza(50, 9, com.android.billingclient.api.zzce.zzg));
            purchasesResponseListener.onQueryPurchasesResponse(com.android.billingclient.api.zzce.zzg, com.google.android.gms.internal.play_billing.zzai.zzk());
        } else if (zzao(new com.android.billingclient.api.zzau(this, str, purchasesResponseListener), 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzae
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.BillingClientImpl.this.zzab(purchasesResponseListener);
            }
        }, zzaj()) == null) {
            com.android.billingclient.api.BillingResult zzal = zzal();
            zzap(com.android.billingclient.api.zzcb.zza(25, 9, zzal));
            purchasesResponseListener.onQueryPurchasesResponse(zzal, com.google.android.gms.internal.play_billing.zzai.zzk());
        }
    }

    private final boolean zzat() {
        return this.zzv && this.zzz.isEnabledForPrepaidPlans();
    }

    private final void zzau(com.android.billingclient.api.BillingResult billingResult, int i, int i2) {
        com.google.android.gms.internal.play_billing.zzge zzgeVar = null;
        com.google.android.gms.internal.play_billing.zzga zzgaVar = null;
        if (billingResult.getResponseCode() == 0) {
            int i3 = com.android.billingclient.api.zzcb.zza;
            try {
                com.google.android.gms.internal.play_billing.zzgd zzy = com.google.android.gms.internal.play_billing.zzge.zzy();
                zzy.zzm(5);
                com.google.android.gms.internal.play_billing.zzgz zzy2 = com.google.android.gms.internal.play_billing.zzhb.zzy();
                zzy2.zzl(i2);
                zzy.zzl((com.google.android.gms.internal.play_billing.zzhb) zzy2.zzf());
                zzgeVar = (com.google.android.gms.internal.play_billing.zzge) zzy.zzf();
            } catch (java.lang.Exception e) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to create logging payload", e);
            }
            zzaq(zzgeVar);
            return;
        }
        int i4 = com.android.billingclient.api.zzcb.zza;
        try {
            com.google.android.gms.internal.play_billing.zzfz zzy3 = com.google.android.gms.internal.play_billing.zzga.zzy();
            com.google.android.gms.internal.play_billing.zzgg zzy4 = com.google.android.gms.internal.play_billing.zzgk.zzy();
            zzy4.zzn(billingResult.getResponseCode());
            zzy4.zzm(billingResult.getDebugMessage());
            zzy4.zzo(i);
            zzy3.zzl(zzy4);
            zzy3.zzn(5);
            com.google.android.gms.internal.play_billing.zzgz zzy5 = com.google.android.gms.internal.play_billing.zzhb.zzy();
            zzy5.zzl(i2);
            zzy3.zzm((com.google.android.gms.internal.play_billing.zzhb) zzy5.zzf());
            zzgaVar = (com.google.android.gms.internal.play_billing.zzga) zzy3.zzf();
        } catch (java.lang.Exception e2) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to create logging payload", e2);
        }
        zzap(zzgaVar);
    }

    static /* bridge */ /* synthetic */ com.android.billingclient.api.zzbt zzg(com.android.billingclient.api.BillingClientImpl billingClientImpl, java.lang.String str) {
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Querying purchase history, item type: ".concat(java.lang.String.valueOf(str)));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.os.Bundle zzc = com.google.android.gms.internal.play_billing.zzb.zzc(billingClientImpl.zzn, billingClientImpl.zzv, billingClientImpl.zzz.isEnabledForOneTimeProducts(), billingClientImpl.zzz.isEnabledForPrepaidPlans(), billingClientImpl.zzb);
        java.lang.String str2 = null;
        while (billingClientImpl.zzl) {
            try {
                android.os.Bundle zzh = billingClientImpl.zzg.zzh(6, billingClientImpl.zze.getPackageName(), str, str2, zzc);
                com.android.billingclient.api.zzda zza = com.android.billingclient.api.zzdb.zza(zzh, "BillingClient", "getPurchaseHistory()");
                com.android.billingclient.api.BillingResult zza2 = zza.zza();
                if (zza2 != com.android.billingclient.api.zzce.zzl) {
                    billingClientImpl.zzap(com.android.billingclient.api.zzcb.zza(zza.zzb(), 11, zza2));
                    return new com.android.billingclient.api.zzbt(zza2, null);
                }
                java.util.ArrayList<java.lang.String> stringArrayList = zzh.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                java.util.ArrayList<java.lang.String> stringArrayList2 = zzh.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                java.util.ArrayList<java.lang.String> stringArrayList3 = zzh.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z = false;
                for (int i = 0; i < stringArrayList2.size(); i++) {
                    java.lang.String str3 = stringArrayList2.get(i);
                    java.lang.String str4 = stringArrayList3.get(i);
                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Purchase record found for sku : ".concat(java.lang.String.valueOf(stringArrayList.get(i))));
                    try {
                        com.android.billingclient.api.PurchaseHistoryRecord purchaseHistoryRecord = new com.android.billingclient.api.PurchaseHistoryRecord(str3, str4);
                        if (android.text.TextUtils.isEmpty(purchaseHistoryRecord.getPurchaseToken())) {
                            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "BUG: empty/null token!");
                            z = true;
                        }
                        arrayList.add(purchaseHistoryRecord);
                    } catch (org.json.JSONException e) {
                        com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got an exception trying to decode the purchase!", e);
                        billingClientImpl.zzap(com.android.billingclient.api.zzcb.zza(51, 11, com.android.billingclient.api.zzce.zzj));
                        return new com.android.billingclient.api.zzbt(com.android.billingclient.api.zzce.zzj, null);
                    }
                }
                if (z) {
                    billingClientImpl.zzap(com.android.billingclient.api.zzcb.zza(26, 11, com.android.billingclient.api.zzce.zzj));
                }
                str2 = zzh.getString("INAPP_CONTINUATION_TOKEN");
                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Continuation token: ".concat(java.lang.String.valueOf(str2)));
                if (android.text.TextUtils.isEmpty(str2)) {
                    return new com.android.billingclient.api.zzbt(com.android.billingclient.api.zzce.zzl, arrayList);
                }
            } catch (android.os.RemoteException e2) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got exception trying to get purchase history, try to reconnect", e2);
                billingClientImpl.zzap(com.android.billingclient.api.zzcb.zza(59, 11, com.android.billingclient.api.zzce.zzm));
                return new com.android.billingclient.api.zzbt(com.android.billingclient.api.zzce.zzm, null);
            }
        }
        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getPurchaseHistory is not supported on current device");
        return new com.android.billingclient.api.zzbt(com.android.billingclient.api.zzce.zzq, null);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void acknowledgePurchase(final com.android.billingclient.api.AcknowledgePurchaseParams acknowledgePurchaseParams, final com.android.billingclient.api.AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        if (!isReady()) {
            zzap(com.android.billingclient.api.zzcb.zza(2, 3, com.android.billingclient.api.zzce.zzm));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(com.android.billingclient.api.zzce.zzm);
            return;
        }
        if (android.text.TextUtils.isEmpty(acknowledgePurchaseParams.getPurchaseToken())) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please provide a valid purchase token.");
            zzap(com.android.billingclient.api.zzcb.zza(26, 3, com.android.billingclient.api.zzce.zzi));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(com.android.billingclient.api.zzce.zzi);
        } else if (!this.zzn) {
            zzap(com.android.billingclient.api.zzcb.zza(27, 3, com.android.billingclient.api.zzce.zzb));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(com.android.billingclient.api.zzce.zzb);
        } else if (zzao(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzu
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.android.billingclient.api.BillingClientImpl.this.zzk(acknowledgePurchaseParams, acknowledgePurchaseResponseListener);
                return null;
            }
        }, 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzv
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.BillingClientImpl.this.zzR(acknowledgePurchaseResponseListener);
            }
        }, zzaj()) == null) {
            com.android.billingclient.api.BillingResult zzal = zzal();
            zzap(com.android.billingclient.api.zzcb.zza(25, 3, zzal));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(zzal);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void consumeAsync(final com.android.billingclient.api.ConsumeParams consumeParams, final com.android.billingclient.api.ConsumeResponseListener consumeResponseListener) {
        if (!isReady()) {
            zzap(com.android.billingclient.api.zzcb.zza(2, 4, com.android.billingclient.api.zzce.zzm));
            consumeResponseListener.onConsumeResponse(com.android.billingclient.api.zzce.zzm, consumeParams.getPurchaseToken());
        } else if (zzao(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzah
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.android.billingclient.api.BillingClientImpl.this.zzl(consumeParams, consumeResponseListener);
                return null;
            }
        }, 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzai
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.BillingClientImpl.this.zzT(consumeResponseListener, consumeParams);
            }
        }, zzaj()) == null) {
            com.android.billingclient.api.BillingResult zzal = zzal();
            zzap(com.android.billingclient.api.zzcb.zza(25, 4, zzal));
            consumeResponseListener.onConsumeResponse(zzal, consumeParams.getPurchaseToken());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void createAlternativeBillingOnlyReportingDetailsAsync(final com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        if (!isReady()) {
            zzap(com.android.billingclient.api.zzcb.zza(2, 15, com.android.billingclient.api.zzce.zzm));
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(com.android.billingclient.api.zzce.zzm, null);
        } else if (!this.zzx) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support alternative billing only.");
            zzap(com.android.billingclient.api.zzcb.zza(66, 15, com.android.billingclient.api.zzce.zzE));
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(com.android.billingclient.api.zzce.zzE, null);
        } else if (zzao(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzz
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.android.billingclient.api.BillingClientImpl.this.zzq(alternativeBillingOnlyReportingDetailsListener);
                return null;
            }
        }, 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzaa
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.BillingClientImpl.this.zzU(alternativeBillingOnlyReportingDetailsListener);
            }
        }, zzaj()) == null) {
            com.android.billingclient.api.BillingResult zzal = zzal();
            zzap(com.android.billingclient.api.zzcb.zza(25, 15, zzal));
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(zzal, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void createExternalOfferReportingDetailsAsync(final com.android.billingclient.api.ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        if (!isReady()) {
            zzap(com.android.billingclient.api.zzcb.zza(2, 24, com.android.billingclient.api.zzce.zzm));
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(com.android.billingclient.api.zzce.zzm, null);
        } else if (!this.zzy) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support external offer.");
            zzap(com.android.billingclient.api.zzcb.zza(103, 24, com.android.billingclient.api.zzce.zzy));
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(com.android.billingclient.api.zzce.zzy, null);
        } else if (zzao(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzab
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.android.billingclient.api.BillingClientImpl.this.zzr(externalOfferReportingDetailsListener);
                return null;
            }
        }, 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzak
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.BillingClientImpl.this.zzV(externalOfferReportingDetailsListener);
            }
        }, zzaj()) == null) {
            com.android.billingclient.api.BillingResult zzal = zzal();
            zzap(com.android.billingclient.api.zzcb.zza(25, 24, zzal));
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(zzal, null);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void endConnection() {
        zzaq(com.android.billingclient.api.zzcb.zzc(12));
        try {
            try {
                if (this.zzd != null) {
                    this.zzd.zzf();
                }
                if (this.zzh != null) {
                    this.zzh.zzc();
                }
                if (this.zzh != null && this.zzg != null) {
                    com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Unbinding from service.");
                    this.zze.unbindService(this.zzh);
                    this.zzh = null;
                }
                this.zzg = null;
                java.util.concurrent.ExecutorService executorService = this.zzB;
                if (executorService != null) {
                    executorService.shutdownNow();
                    this.zzB = null;
                }
            } catch (java.lang.Exception e) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "There was an exception while ending connection!", e);
            }
        } finally {
            this.zza = 3;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void getBillingConfigAsync(com.android.billingclient.api.GetBillingConfigParams getBillingConfigParams, final com.android.billingclient.api.BillingConfigResponseListener billingConfigResponseListener) {
        if (!isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Service disconnected.");
            zzap(com.android.billingclient.api.zzcb.zza(2, 13, com.android.billingclient.api.zzce.zzm));
            billingConfigResponseListener.onBillingConfigResponse(com.android.billingclient.api.zzce.zzm, null);
        } else {
            if (!this.zzu) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support get billing config.");
                zzap(com.android.billingclient.api.zzcb.zza(32, 13, com.android.billingclient.api.zzce.zzA));
                billingConfigResponseListener.onBillingConfigResponse(com.android.billingclient.api.zzce.zzA, null);
                return;
            }
            java.lang.String str = this.zzb;
            final android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("playBillingLibraryVersion", str);
            if (zzao(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzw
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    com.android.billingclient.api.BillingClientImpl.this.zzm(bundle, billingConfigResponseListener);
                    return null;
                }
            }, 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzx
                @Override // java.lang.Runnable
                public final void run() {
                    com.android.billingclient.api.BillingClientImpl.this.zzW(billingConfigResponseListener);
                }
            }, zzaj()) == null) {
                com.android.billingclient.api.BillingResult zzal = zzal();
                zzap(com.android.billingclient.api.zzcb.zza(25, 13, zzal));
                billingConfigResponseListener.onBillingConfigResponse(zzal, null);
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final int getConnectionState() {
        return this.zza;
    }

    @Override // com.android.billingclient.api.BillingClient
    public void isAlternativeBillingOnlyAvailableAsync(final com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        if (!isReady()) {
            zzap(com.android.billingclient.api.zzcb.zza(2, 14, com.android.billingclient.api.zzce.zzm));
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(com.android.billingclient.api.zzce.zzm);
        } else if (!this.zzx) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support alternative billing only.");
            zzap(com.android.billingclient.api.zzcb.zza(66, 14, com.android.billingclient.api.zzce.zzE));
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(com.android.billingclient.api.zzce.zzE);
        } else if (zzao(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzaf
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.android.billingclient.api.BillingClientImpl.this.zzs(alternativeBillingOnlyAvailabilityListener);
                return null;
            }
        }, 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzag
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.BillingClientImpl.this.zzX(alternativeBillingOnlyAvailabilityListener);
            }
        }, zzaj()) == null) {
            com.android.billingclient.api.BillingResult zzal = zzal();
            zzap(com.android.billingclient.api.zzcb.zza(25, 14, zzal));
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(zzal);
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public void isExternalOfferAvailableAsync(final com.android.billingclient.api.ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        if (!isReady()) {
            zzap(com.android.billingclient.api.zzcb.zza(2, 23, com.android.billingclient.api.zzce.zzm));
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(com.android.billingclient.api.zzce.zzm);
        } else if (!this.zzy) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support external offer.");
            zzap(com.android.billingclient.api.zzcb.zza(103, 23, com.android.billingclient.api.zzce.zzy));
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(com.android.billingclient.api.zzce.zzy);
        } else if (zzao(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzaq
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.android.billingclient.api.BillingClientImpl.this.zzt(externalOfferAvailabilityListener);
                return null;
            }
        }, 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzar
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.BillingClientImpl.this.zzY(externalOfferAvailabilityListener);
            }
        }, zzaj()) == null) {
            com.android.billingclient.api.BillingResult zzal = zzal();
            zzap(com.android.billingclient.api.zzcb.zza(25, 23, zzal));
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(zzal);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.android.billingclient.api.BillingClient
    public final com.android.billingclient.api.BillingResult isFeatureSupported(java.lang.String str) {
        char c;
        if (!isReady()) {
            com.android.billingclient.api.BillingResult billingResult = com.android.billingclient.api.zzce.zzm;
            if (billingResult.getResponseCode() != 0) {
                zzap(com.android.billingclient.api.zzcb.zza(2, 5, billingResult));
            } else {
                zzaq(com.android.billingclient.api.zzcb.zzc(5));
            }
            return com.android.billingclient.api.zzce.zzm;
        }
        int i = com.android.billingclient.api.zzce.zzG;
        switch (str.hashCode()) {
            case -422092961:
                if (str.equals(com.android.billingclient.api.BillingClient.FeatureType.SUBSCRIPTIONS_UPDATE)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 96321:
                if (str.equals("aaa")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 97314:
                if (str.equals(com.android.billingclient.api.BillingClient.FeatureType.IN_APP_MESSAGING)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 98307:
                if (str.equals("ccc")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 99300:
                if (str.equals("ddd")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 100293:
                if (str.equals("eee")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 101286:
                if (str.equals(com.android.billingclient.api.BillingClient.FeatureType.PRODUCT_DETAILS)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 102279:
                if (str.equals(com.android.billingclient.api.BillingClient.FeatureType.BILLING_CONFIG)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 103272:
                if (str.equals("hhh")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 104265:
                if (str.equals("iii")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 105258:
                if (str.equals(com.android.billingclient.api.BillingClient.FeatureType.ALTERNATIVE_BILLING_ONLY)) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 106251:
                if (str.equals(com.android.billingclient.api.BillingClient.FeatureType.EXTERNAL_OFFER)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 207616302:
                if (str.equals(com.android.billingclient.api.BillingClient.FeatureType.PRICE_CHANGE_CONFIRMATION)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1987365622:
                if (str.equals("subscriptions")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                com.android.billingclient.api.BillingResult billingResult2 = this.zzi ? com.android.billingclient.api.zzce.zzl : com.android.billingclient.api.zzce.zzo;
                zzau(billingResult2, 9, 2);
                return billingResult2;
            case 1:
                com.android.billingclient.api.BillingResult billingResult3 = this.zzj ? com.android.billingclient.api.zzce.zzl : com.android.billingclient.api.zzce.zzp;
                zzau(billingResult3, 10, 3);
                return billingResult3;
            case 2:
                com.android.billingclient.api.BillingResult billingResult4 = this.zzm ? com.android.billingclient.api.zzce.zzl : com.android.billingclient.api.zzce.zzr;
                zzau(billingResult4, 35, 4);
                return billingResult4;
            case 3:
                com.android.billingclient.api.BillingResult billingResult5 = this.zzp ? com.android.billingclient.api.zzce.zzl : com.android.billingclient.api.zzce.zzw;
                zzau(billingResult5, 30, 5);
                return billingResult5;
            case 4:
                com.android.billingclient.api.BillingResult billingResult6 = this.zzr ? com.android.billingclient.api.zzce.zzl : com.android.billingclient.api.zzce.zzs;
                zzau(billingResult6, 31, 6);
                return billingResult6;
            case 5:
                com.android.billingclient.api.BillingResult billingResult7 = this.zzq ? com.android.billingclient.api.zzce.zzl : com.android.billingclient.api.zzce.zzu;
                zzau(billingResult7, 21, 7);
                return billingResult7;
            case 6:
                com.android.billingclient.api.BillingResult billingResult8 = this.zzs ? com.android.billingclient.api.zzce.zzl : com.android.billingclient.api.zzce.zzt;
                zzau(billingResult8, 19, 8);
                return billingResult8;
            case 7:
                com.android.billingclient.api.BillingResult billingResult9 = this.zzs ? com.android.billingclient.api.zzce.zzl : com.android.billingclient.api.zzce.zzt;
                zzau(billingResult9, 61, 9);
                return billingResult9;
            case '\b':
                com.android.billingclient.api.BillingResult billingResult10 = this.zzt ? com.android.billingclient.api.zzce.zzl : com.android.billingclient.api.zzce.zzv;
                zzau(billingResult10, 20, 10);
                return billingResult10;
            case '\t':
                com.android.billingclient.api.BillingResult billingResult11 = this.zzu ? com.android.billingclient.api.zzce.zzl : com.android.billingclient.api.zzce.zzA;
                zzau(billingResult11, 32, 11);
                return billingResult11;
            case '\n':
                com.android.billingclient.api.BillingResult billingResult12 = this.zzu ? com.android.billingclient.api.zzce.zzl : com.android.billingclient.api.zzce.zzB;
                zzau(billingResult12, 33, 12);
                return billingResult12;
            case 11:
                com.android.billingclient.api.BillingResult billingResult13 = this.zzw ? com.android.billingclient.api.zzce.zzl : com.android.billingclient.api.zzce.zzD;
                zzau(billingResult13, 60, 13);
                return billingResult13;
            case '\f':
                com.android.billingclient.api.BillingResult billingResult14 = this.zzx ? com.android.billingclient.api.zzce.zzl : com.android.billingclient.api.zzce.zzE;
                zzau(billingResult14, 66, 14);
                return billingResult14;
            case '\r':
                com.android.billingclient.api.BillingResult billingResult15 = this.zzy ? com.android.billingclient.api.zzce.zzl : com.android.billingclient.api.zzce.zzy;
                zzau(billingResult15, 103, 18);
                return billingResult15;
            default:
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Unsupported feature: ".concat(java.lang.String.valueOf(str)));
                zzau(com.android.billingclient.api.zzce.zzz, 34, 1);
                return com.android.billingclient.api.zzce.zzz;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final boolean isReady() {
        return (this.zza != 2 || this.zzg == null || this.zzh == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0484 A[Catch: Exception -> 0x04ec, CancellationException -> 0x0503, TimeoutException -> 0x0505, TRY_ENTER, TryCatch #4 {CancellationException -> 0x0503, TimeoutException -> 0x0505, Exception -> 0x04ec, blocks: (B:136:0x0484, B:138:0x0496, B:140:0x04aa, B:143:0x04c6, B:145:0x04d2), top: B:134:0x0482 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0496 A[Catch: Exception -> 0x04ec, CancellationException -> 0x0503, TimeoutException -> 0x0505, TryCatch #4 {CancellationException -> 0x0503, TimeoutException -> 0x0505, Exception -> 0x04ec, blocks: (B:136:0x0484, B:138:0x0496, B:140:0x04aa, B:143:0x04c6, B:145:0x04d2), top: B:134:0x0482 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x043b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03f7  */
    @Override // com.android.billingclient.api.BillingClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.android.billingclient.api.BillingResult launchBillingFlow(android.app.Activity activity, final com.android.billingclient.api.BillingFlowParams billingFlowParams) {
        final java.lang.String productId;
        final java.lang.String productType;
        java.lang.String str;
        java.lang.String str2;
        java.util.concurrent.Future zzao;
        int i;
        boolean z;
        java.lang.String str3;
        com.android.billingclient.api.SkuDetails skuDetails;
        com.android.billingclient.api.BillingFlowParams.ProductDetailsParams productDetailsParams;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        boolean z2;
        android.content.Intent intent;
        java.lang.String str7;
        com.android.billingclient.api.BillingFlowParams.ProductDetailsParams productDetailsParams2;
        final com.android.billingclient.api.BillingClientImpl billingClientImpl = this;
        if (billingClientImpl.zzd == null || billingClientImpl.zzd.zzd() == null) {
            billingClientImpl.zzap(com.android.billingclient.api.zzcb.zza(12, 2, com.android.billingclient.api.zzce.zzF));
            return com.android.billingclient.api.zzce.zzF;
        }
        if (!isReady()) {
            billingClientImpl.zzap(com.android.billingclient.api.zzcb.zza(2, 2, com.android.billingclient.api.zzce.zzm));
            com.android.billingclient.api.BillingResult billingResult = com.android.billingclient.api.zzce.zzm;
            billingClientImpl.zzak(billingResult);
            return billingResult;
        }
        java.util.ArrayList<com.android.billingclient.api.SkuDetails> zzf = billingFlowParams.zzf();
        java.util.List zzg = billingFlowParams.zzg();
        com.android.billingclient.api.SkuDetails skuDetails2 = (com.android.billingclient.api.SkuDetails) com.google.android.gms.internal.play_billing.zzan.zza(zzf, null);
        com.android.billingclient.api.BillingFlowParams.ProductDetailsParams productDetailsParams3 = (com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) com.google.android.gms.internal.play_billing.zzan.zza(zzg, null);
        if (skuDetails2 != null) {
            productId = skuDetails2.getSku();
            productType = skuDetails2.getType();
        } else {
            productId = productDetailsParams3.zza().getProductId();
            productType = productDetailsParams3.zza().getProductType();
        }
        if (productType.equals("subs") && !billingClientImpl.zzi) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support subscriptions.");
            billingClientImpl.zzap(com.android.billingclient.api.zzcb.zza(9, 2, com.android.billingclient.api.zzce.zzo));
            com.android.billingclient.api.BillingResult billingResult2 = com.android.billingclient.api.zzce.zzo;
            billingClientImpl.zzak(billingResult2);
            return billingResult2;
        }
        if (billingFlowParams.zzp() && !billingClientImpl.zzl) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support extra params for buy intent.");
            billingClientImpl.zzap(com.android.billingclient.api.zzcb.zza(18, 2, com.android.billingclient.api.zzce.zzh));
            com.android.billingclient.api.BillingResult billingResult3 = com.android.billingclient.api.zzce.zzh;
            billingClientImpl.zzak(billingResult3);
            return billingResult3;
        }
        if (zzf.size() > 1 && !billingClientImpl.zzs) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support multi-item purchases.");
            billingClientImpl.zzap(com.android.billingclient.api.zzcb.zza(19, 2, com.android.billingclient.api.zzce.zzt));
            com.android.billingclient.api.BillingResult billingResult4 = com.android.billingclient.api.zzce.zzt;
            billingClientImpl.zzak(billingResult4);
            return billingResult4;
        }
        if (!zzg.isEmpty() && !billingClientImpl.zzt) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            billingClientImpl.zzap(com.android.billingclient.api.zzcb.zza(20, 2, com.android.billingclient.api.zzce.zzv));
            com.android.billingclient.api.BillingResult billingResult5 = com.android.billingclient.api.zzce.zzv;
            billingClientImpl.zzak(billingResult5);
            return billingResult5;
        }
        if (billingClientImpl.zzl) {
            boolean z3 = billingClientImpl.zzn;
            boolean z4 = billingClientImpl.zzv;
            boolean isEnabledForOneTimeProducts = billingClientImpl.zzz.isEnabledForOneTimeProducts();
            boolean isEnabledForPrepaidPlans = billingClientImpl.zzz.isEnabledForPrepaidPlans();
            boolean z5 = billingClientImpl.zzA;
            str = "BUY_INTENT";
            java.lang.String str8 = billingClientImpl.zzb;
            final android.os.Bundle bundle = new android.os.Bundle();
            final java.lang.String str9 = productType;
            bundle.putString("playBillingLibraryVersion", str8);
            if (billingFlowParams.zza() != 0) {
                bundle.putInt("prorationMode", billingFlowParams.zza());
            }
            if (!android.text.TextUtils.isEmpty(billingFlowParams.zzb())) {
                bundle.putString(com.android.billingclient.api.BillingFlowParams.EXTRA_PARAM_KEY_ACCOUNT_ID, billingFlowParams.zzb());
            }
            if (!android.text.TextUtils.isEmpty(billingFlowParams.zzc())) {
                bundle.putString("obfuscatedProfileId", billingFlowParams.zzc());
            }
            if (billingFlowParams.zzo()) {
                bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
            }
            if (!android.text.TextUtils.isEmpty(null)) {
                bundle.putStringArrayList("skusToReplace", new java.util.ArrayList<>(java.util.Arrays.asList(null)));
            }
            if (!android.text.TextUtils.isEmpty(billingFlowParams.zzd())) {
                bundle.putString("oldSkuPurchaseToken", billingFlowParams.zzd());
            }
            java.lang.String str10 = null;
            if (!android.text.TextUtils.isEmpty(null)) {
                bundle.putString("oldSkuPurchaseId", null);
            }
            if (!android.text.TextUtils.isEmpty(billingFlowParams.zze())) {
                bundle.putString("originalExternalTransactionId", billingFlowParams.zze());
                str10 = null;
            }
            if (!android.text.TextUtils.isEmpty(str10)) {
                bundle.putString("paymentsPurchaseParams", str10);
            }
            if (z3 && isEnabledForOneTimeProducts) {
                z = true;
                bundle.putBoolean("enablePendingPurchases", true);
            } else {
                z = true;
            }
            if (z4 && isEnabledForPrepaidPlans) {
                bundle.putBoolean("enablePendingPurchaseForSubscriptions", z);
            }
            if (z5) {
                bundle.putBoolean("enableAlternativeBilling", z);
            }
            if (zzf.isEmpty()) {
                str3 = "proxyPackageVersion";
                skuDetails = skuDetails2;
                productDetailsParams = productDetailsParams3;
                str4 = productId;
                str5 = "BillingClient";
                java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(zzg.size() - 1);
                java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>(zzg.size() - 1);
                java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList<>();
                java.util.ArrayList<java.lang.String> arrayList4 = new java.util.ArrayList<>();
                java.util.ArrayList<java.lang.String> arrayList5 = new java.util.ArrayList<>();
                for (int i2 = 0; i2 < zzg.size(); i2++) {
                    com.android.billingclient.api.BillingFlowParams.ProductDetailsParams productDetailsParams4 = (com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) zzg.get(i2);
                    com.android.billingclient.api.ProductDetails zza = productDetailsParams4.zza();
                    if (!zza.zzb().isEmpty()) {
                        arrayList3.add(zza.zzb());
                    }
                    arrayList4.add(productDetailsParams4.zzb());
                    if (!android.text.TextUtils.isEmpty(zza.zzc())) {
                        arrayList5.add(zza.zzc());
                    }
                    if (i2 > 0) {
                        arrayList.add(((com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) zzg.get(i2)).zza().getProductId());
                        arrayList2.add(((com.android.billingclient.api.BillingFlowParams.ProductDetailsParams) zzg.get(i2)).zza().getProductType());
                    }
                }
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                if (!arrayList3.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList3);
                }
                if (!arrayList5.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (!arrayList.isEmpty()) {
                    bundle.putStringArrayList("additionalSkus", arrayList);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList2);
                }
            } else {
                java.util.ArrayList<java.lang.String> arrayList6 = new java.util.ArrayList<>();
                java.util.ArrayList<java.lang.String> arrayList7 = new java.util.ArrayList<>();
                str4 = productId;
                java.util.ArrayList<java.lang.String> arrayList8 = new java.util.ArrayList<>();
                str3 = "proxyPackageVersion";
                java.util.ArrayList<java.lang.Integer> arrayList9 = new java.util.ArrayList<>();
                str5 = "BillingClient";
                java.util.ArrayList<java.lang.String> arrayList10 = new java.util.ArrayList<>();
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                for (com.android.billingclient.api.SkuDetails skuDetails3 : zzf) {
                    if (skuDetails3.zzf().isEmpty()) {
                        productDetailsParams2 = productDetailsParams3;
                    } else {
                        productDetailsParams2 = productDetailsParams3;
                        arrayList6.add(skuDetails3.zzf());
                    }
                    java.lang.String zzc = skuDetails3.zzc();
                    com.android.billingclient.api.SkuDetails skuDetails4 = skuDetails2;
                    java.lang.String zzb = skuDetails3.zzb();
                    int zza2 = skuDetails3.zza();
                    java.lang.String zze = skuDetails3.zze();
                    arrayList7.add(zzc);
                    z6 |= !android.text.TextUtils.isEmpty(zzc);
                    arrayList8.add(zzb);
                    z7 |= !android.text.TextUtils.isEmpty(zzb);
                    arrayList9.add(java.lang.Integer.valueOf(zza2));
                    z8 |= zza2 != 0;
                    z9 |= !android.text.TextUtils.isEmpty(zze);
                    arrayList10.add(zze);
                    productDetailsParams3 = productDetailsParams2;
                    skuDetails2 = skuDetails4;
                }
                skuDetails = skuDetails2;
                productDetailsParams = productDetailsParams3;
                if (!arrayList6.isEmpty()) {
                    bundle.putStringArrayList("skuDetailsTokens", arrayList6);
                }
                if (z6) {
                    bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList7);
                }
                if (z7) {
                    bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList8);
                }
                if (z8) {
                    bundle.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList9);
                }
                if (z9) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList10);
                }
                if (zzf.size() > 1) {
                    java.util.ArrayList<java.lang.String> arrayList11 = new java.util.ArrayList<>(zzf.size() - 1);
                    java.util.ArrayList<java.lang.String> arrayList12 = new java.util.ArrayList<>(zzf.size() - 1);
                    for (int i3 = 1; i3 < zzf.size(); i3++) {
                        arrayList11.add(((com.android.billingclient.api.SkuDetails) zzf.get(i3)).getSku());
                        arrayList12.add(((com.android.billingclient.api.SkuDetails) zzf.get(i3)).getType());
                    }
                    bundle.putStringArrayList("additionalSkus", arrayList11);
                    bundle.putStringArrayList("additionalSkuTypes", arrayList12);
                }
            }
            billingClientImpl = this;
            if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !billingClientImpl.zzq) {
                billingClientImpl.zzap(com.android.billingclient.api.zzcb.zza(21, 2, com.android.billingclient.api.zzce.zzu));
                com.android.billingclient.api.BillingResult billingResult6 = com.android.billingclient.api.zzce.zzu;
                billingClientImpl.zzak(billingResult6);
                return billingResult6;
            }
            if (skuDetails != null && !android.text.TextUtils.isEmpty(skuDetails.zzd())) {
                bundle.putString("skuPackageName", skuDetails.zzd());
            } else if (productDetailsParams == null || android.text.TextUtils.isEmpty(productDetailsParams.zza().zza())) {
                str6 = null;
                z2 = false;
                if (!android.text.TextUtils.isEmpty(str6)) {
                    bundle.putString("accountName", str6);
                }
                intent = activity.getIntent();
                if (intent != null) {
                    str2 = str5;
                    com.google.android.gms.internal.play_billing.zzb.zzk(str2, "Activity's intent is null.");
                } else {
                    str2 = str5;
                    if (!android.text.TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                        java.lang.String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                        bundle.putString("proxyPackage", stringExtra);
                        try {
                            str7 = str3;
                            try {
                                bundle.putString(str7, billingClientImpl.zze.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                                bundle.putString(str7, "package not found");
                                if (billingClientImpl.zzt) {
                                }
                                final java.lang.String str11 = str4;
                                zzao = zzao(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzas
                                    @Override // java.util.concurrent.Callable
                                    public final java.lang.Object call() {
                                        return com.android.billingclient.api.BillingClientImpl.this.zzc(r2, str11, str9, billingFlowParams, bundle);
                                    }
                                }, 5000L, null, billingClientImpl.zzc);
                                i = 78;
                                if (zzao != null) {
                                }
                            }
                        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                            str7 = str3;
                        }
                    }
                }
                final int i4 = (billingClientImpl.zzt || zzg.isEmpty()) ? (billingClientImpl.zzr || !z2) ? billingClientImpl.zzn ? 9 : 6 : 15 : 17;
                final java.lang.String str112 = str4;
                zzao = zzao(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzas
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        return com.android.billingclient.api.BillingClientImpl.this.zzc(i4, str112, str9, billingFlowParams, bundle);
                    }
                }, 5000L, null, billingClientImpl.zzc);
                i = 78;
            } else {
                bundle.putString("skuPackageName", productDetailsParams.zza().zza());
            }
            str6 = null;
            z2 = true;
            if (!android.text.TextUtils.isEmpty(str6)) {
            }
            intent = activity.getIntent();
            if (intent != null) {
            }
            if (billingClientImpl.zzt) {
            }
            final java.lang.String str1122 = str4;
            zzao = zzao(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzas
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return com.android.billingclient.api.BillingClientImpl.this.zzc(i4, str1122, str9, billingFlowParams, bundle);
                }
            }, 5000L, null, billingClientImpl.zzc);
            i = 78;
        } else {
            str = "BUY_INTENT";
            str2 = "BillingClient";
            zzao = zzao(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzr
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return com.android.billingclient.api.BillingClientImpl.this.zzd(productId, productType);
                }
            }, 5000L, null, billingClientImpl.zzc);
            i = 80;
        }
        try {
            if (zzao != null) {
                billingClientImpl.zzap(com.android.billingclient.api.zzcb.zza(25, 2, com.android.billingclient.api.zzce.zzm));
                com.android.billingclient.api.BillingResult billingResult7 = com.android.billingclient.api.zzce.zzm;
                billingClientImpl.zzak(billingResult7);
                return billingResult7;
            }
            android.os.Bundle bundle2 = (android.os.Bundle) zzao.get(5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            int zzb2 = com.google.android.gms.internal.play_billing.zzb.zzb(bundle2, str2);
            java.lang.String zzg2 = com.google.android.gms.internal.play_billing.zzb.zzg(bundle2, str2);
            if (zzb2 == 0) {
                android.content.Intent intent2 = new android.content.Intent(activity, (java.lang.Class<?>) com.android.billingclient.api.ProxyBillingActivity.class);
                java.lang.String str12 = str;
                intent2.putExtra(str12, (android.app.PendingIntent) bundle2.getParcelable(str12));
                activity.startActivity(intent2);
                return com.android.billingclient.api.zzce.zzl;
            }
            com.google.android.gms.internal.play_billing.zzb.zzk(str2, "Unable to buy item, Error response code: " + zzb2);
            com.android.billingclient.api.BillingResult zza3 = com.android.billingclient.api.zzce.zza(zzb2, zzg2);
            if (bundle2 != null) {
                i = 23;
            }
            billingClientImpl.zzap(com.android.billingclient.api.zzcb.zza(i, 2, zza3));
            billingClientImpl.zzak(zza3);
            return zza3;
        } catch (java.util.concurrent.CancellationException e) {
            e = e;
            com.google.android.gms.internal.play_billing.zzb.zzl(str2, "Time out while launching billing flow. Try to reconnect", e);
            billingClientImpl.zzap(com.android.billingclient.api.zzcb.zza(4, 2, com.android.billingclient.api.zzce.zzn));
            com.android.billingclient.api.BillingResult billingResult8 = com.android.billingclient.api.zzce.zzn;
            billingClientImpl.zzak(billingResult8);
            return billingResult8;
        } catch (java.util.concurrent.TimeoutException e2) {
            e = e2;
            com.google.android.gms.internal.play_billing.zzb.zzl(str2, "Time out while launching billing flow. Try to reconnect", e);
            billingClientImpl.zzap(com.android.billingclient.api.zzcb.zza(4, 2, com.android.billingclient.api.zzce.zzn));
            com.android.billingclient.api.BillingResult billingResult82 = com.android.billingclient.api.zzce.zzn;
            billingClientImpl.zzak(billingResult82);
            return billingResult82;
        } catch (java.lang.Exception e3) {
            com.google.android.gms.internal.play_billing.zzb.zzl(str2, "Exception while launching billing flow. Try to reconnect", e3);
            billingClientImpl.zzap(com.android.billingclient.api.zzcb.zza(5, 2, com.android.billingclient.api.zzce.zzm));
            com.android.billingclient.api.BillingResult billingResult9 = com.android.billingclient.api.zzce.zzm;
            billingClientImpl.zzak(billingResult9);
            return billingResult9;
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryProductDetailsAsync(final com.android.billingclient.api.QueryProductDetailsParams queryProductDetailsParams, final com.android.billingclient.api.ProductDetailsResponseListener productDetailsResponseListener) {
        if (!isReady()) {
            zzap(com.android.billingclient.api.zzcb.zza(2, 7, com.android.billingclient.api.zzce.zzm));
            productDetailsResponseListener.onProductDetailsResponse(com.android.billingclient.api.zzce.zzm, new java.util.ArrayList());
        } else if (!this.zzt) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Querying product details is not supported.");
            zzap(com.android.billingclient.api.zzcb.zza(20, 7, com.android.billingclient.api.zzce.zzv));
            productDetailsResponseListener.onProductDetailsResponse(com.android.billingclient.api.zzce.zzv, new java.util.ArrayList());
        } else if (zzao(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzan
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.android.billingclient.api.BillingClientImpl.this.zzn(queryProductDetailsParams, productDetailsResponseListener);
                return null;
            }
        }, 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzao
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.BillingClientImpl.this.zzZ(productDetailsResponseListener);
            }
        }, zzaj()) == null) {
            com.android.billingclient.api.BillingResult zzal = zzal();
            zzap(com.android.billingclient.api.zzcb.zza(25, 7, zzal));
            productDetailsResponseListener.onProductDetailsResponse(zzal, new java.util.ArrayList());
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(com.android.billingclient.api.QueryPurchaseHistoryParams queryPurchaseHistoryParams, com.android.billingclient.api.PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzar(queryPurchaseHistoryParams.zza(), purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(com.android.billingclient.api.QueryPurchasesParams queryPurchasesParams, com.android.billingclient.api.PurchasesResponseListener purchasesResponseListener) {
        zzas(queryPurchasesParams.zza(), purchasesResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void querySkuDetailsAsync(com.android.billingclient.api.SkuDetailsParams skuDetailsParams, final com.android.billingclient.api.SkuDetailsResponseListener skuDetailsResponseListener) {
        if (!isReady()) {
            zzap(com.android.billingclient.api.zzcb.zza(2, 8, com.android.billingclient.api.zzce.zzm));
            skuDetailsResponseListener.onSkuDetailsResponse(com.android.billingclient.api.zzce.zzm, null);
            return;
        }
        final java.lang.String skuType = skuDetailsParams.getSkuType();
        final java.util.List<java.lang.String> skusList = skuDetailsParams.getSkusList();
        if (android.text.TextUtils.isEmpty(skuType)) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please fix the input params. SKU type can't be empty.");
            zzap(com.android.billingclient.api.zzcb.zza(49, 8, com.android.billingclient.api.zzce.zzf));
            skuDetailsResponseListener.onSkuDetailsResponse(com.android.billingclient.api.zzce.zzf, null);
        } else if (skusList == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
            zzap(com.android.billingclient.api.zzcb.zza(48, 8, com.android.billingclient.api.zzce.zze));
            skuDetailsResponseListener.onSkuDetailsResponse(com.android.billingclient.api.zzce.zze, null);
        } else {
            final java.lang.String str = null;
            if (zzao(new java.util.concurrent.Callable(skuType, skusList, str, skuDetailsResponseListener) { // from class: com.android.billingclient.api.zzac
                public final /* synthetic */ java.lang.String zzb;
                public final /* synthetic */ java.util.List zzc;
                public final /* synthetic */ com.android.billingclient.api.SkuDetailsResponseListener zzd;

                {
                    this.zzd = skuDetailsResponseListener;
                }

                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    com.android.billingclient.api.BillingClientImpl.this.zzo(this.zzb, this.zzc, null, this.zzd);
                    return null;
                }
            }, 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzad
                @Override // java.lang.Runnable
                public final void run() {
                    com.android.billingclient.api.BillingClientImpl.this.zzac(skuDetailsResponseListener);
                }
            }, zzaj()) == null) {
                com.android.billingclient.api.BillingResult zzal = zzal();
                zzap(com.android.billingclient.api.zzcb.zza(25, 8, zzal));
                skuDetailsResponseListener.onSkuDetailsResponse(zzal, null);
            }
        }
    }

    @Override // com.android.billingclient.api.BillingClient
    public final com.android.billingclient.api.BillingResult showInAppMessages(final android.app.Activity activity, com.android.billingclient.api.InAppMessageParams inAppMessageParams, com.android.billingclient.api.InAppMessageResponseListener inAppMessageResponseListener) {
        if (!isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Service disconnected.");
            return com.android.billingclient.api.zzce.zzm;
        }
        if (!this.zzp) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current client doesn't support showing in-app messages.");
            return com.android.billingclient.api.zzce.zzw;
        }
        android.view.View findViewById = activity.findViewById(android.R.id.content);
        android.os.IBinder windowToken = findViewById.getWindowToken();
        android.graphics.Rect rect = new android.graphics.Rect();
        findViewById.getGlobalVisibleRect(rect);
        final android.os.Bundle bundle = new android.os.Bundle();
        androidx.core.app.BundleCompat.putBinder(bundle, "KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.zzb);
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", inAppMessageParams.zza());
        final com.android.billingclient.api.zzaw zzawVar = new com.android.billingclient.api.zzaw(this, this.zzc, inAppMessageResponseListener);
        zzao(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzap
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.android.billingclient.api.BillingClientImpl.this.zzp(bundle, activity, zzawVar);
                return null;
            }
        }, 5000L, null, this.zzc);
        return com.android.billingclient.api.zzce.zzl;
    }

    final /* synthetic */ void zzR(com.android.billingclient.api.AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        zzap(com.android.billingclient.api.zzcb.zza(24, 3, com.android.billingclient.api.zzce.zzn));
        acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(com.android.billingclient.api.zzce.zzn);
    }

    final /* synthetic */ void zzS(com.android.billingclient.api.BillingResult billingResult) {
        if (this.zzd.zzd() != null) {
            this.zzd.zzd().onPurchasesUpdated(billingResult, null);
        } else {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    final /* synthetic */ void zzT(com.android.billingclient.api.ConsumeResponseListener consumeResponseListener, com.android.billingclient.api.ConsumeParams consumeParams) {
        zzap(com.android.billingclient.api.zzcb.zza(24, 4, com.android.billingclient.api.zzce.zzn));
        consumeResponseListener.onConsumeResponse(com.android.billingclient.api.zzce.zzn, consumeParams.getPurchaseToken());
    }

    final /* synthetic */ void zzU(com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) {
        zzap(com.android.billingclient.api.zzcb.zza(24, 15, com.android.billingclient.api.zzce.zzn));
        alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(com.android.billingclient.api.zzce.zzn, null);
    }

    final /* synthetic */ void zzV(com.android.billingclient.api.ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) {
        zzap(com.android.billingclient.api.zzcb.zza(24, 24, com.android.billingclient.api.zzce.zzn));
        externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(com.android.billingclient.api.zzce.zzn, null);
    }

    final /* synthetic */ void zzW(com.android.billingclient.api.BillingConfigResponseListener billingConfigResponseListener) {
        zzap(com.android.billingclient.api.zzcb.zza(24, 13, com.android.billingclient.api.zzce.zzn));
        billingConfigResponseListener.onBillingConfigResponse(com.android.billingclient.api.zzce.zzn, null);
    }

    final /* synthetic */ void zzX(com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) {
        zzap(com.android.billingclient.api.zzcb.zza(24, 14, com.android.billingclient.api.zzce.zzn));
        alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(com.android.billingclient.api.zzce.zzn);
    }

    final /* synthetic */ void zzY(com.android.billingclient.api.ExternalOfferAvailabilityListener externalOfferAvailabilityListener) {
        zzap(com.android.billingclient.api.zzcb.zza(24, 23, com.android.billingclient.api.zzce.zzn));
        externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(com.android.billingclient.api.zzce.zzn);
    }

    final /* synthetic */ void zzZ(com.android.billingclient.api.ProductDetailsResponseListener productDetailsResponseListener) {
        zzap(com.android.billingclient.api.zzcb.zza(24, 7, com.android.billingclient.api.zzce.zzn));
        productDetailsResponseListener.onProductDetailsResponse(com.android.billingclient.api.zzce.zzn, new java.util.ArrayList());
    }

    final /* synthetic */ void zzaa(com.android.billingclient.api.PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzap(com.android.billingclient.api.zzcb.zza(24, 11, com.android.billingclient.api.zzce.zzn));
        purchaseHistoryResponseListener.onPurchaseHistoryResponse(com.android.billingclient.api.zzce.zzn, null);
    }

    final /* synthetic */ void zzab(com.android.billingclient.api.PurchasesResponseListener purchasesResponseListener) {
        zzap(com.android.billingclient.api.zzcb.zza(24, 9, com.android.billingclient.api.zzce.zzn));
        purchasesResponseListener.onQueryPurchasesResponse(com.android.billingclient.api.zzce.zzn, com.google.android.gms.internal.play_billing.zzai.zzk());
    }

    final /* synthetic */ void zzac(com.android.billingclient.api.SkuDetailsResponseListener skuDetailsResponseListener) {
        zzap(com.android.billingclient.api.zzcb.zza(24, 8, com.android.billingclient.api.zzce.zzn));
        skuDetailsResponseListener.onSkuDetailsResponse(com.android.billingclient.api.zzce.zzn, null);
    }

    final /* synthetic */ void zzad(com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        zzap(com.android.billingclient.api.zzcb.zza(24, 16, com.android.billingclient.api.zzce.zzn));
        alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(com.android.billingclient.api.zzce.zzn);
    }

    final /* synthetic */ void zzae(com.android.billingclient.api.ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        zzap(com.android.billingclient.api.zzcb.zza(24, 25, com.android.billingclient.api.zzce.zzn));
        externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(com.android.billingclient.api.zzce.zzn);
    }

    final /* synthetic */ android.os.Bundle zzc(int i, java.lang.String str, java.lang.String str2, com.android.billingclient.api.BillingFlowParams billingFlowParams, android.os.Bundle bundle) throws java.lang.Exception {
        return this.zzg.zzg(i, this.zze.getPackageName(), str, str2, null, bundle);
    }

    final /* synthetic */ android.os.Bundle zzd(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        return this.zzg.zzf(3, this.zze.getPackageName(), str, str2, null);
    }

    final /* synthetic */ java.lang.Object zzk(com.android.billingclient.api.AcknowledgePurchaseParams acknowledgePurchaseParams, com.android.billingclient.api.AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) throws java.lang.Exception {
        try {
            com.google.android.gms.internal.play_billing.zzs zzsVar = this.zzg;
            java.lang.String packageName = this.zze.getPackageName();
            java.lang.String purchaseToken = acknowledgePurchaseParams.getPurchaseToken();
            java.lang.String str = this.zzb;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("playBillingLibraryVersion", str);
            android.os.Bundle zzd = zzsVar.zzd(9, packageName, purchaseToken, bundle);
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(com.android.billingclient.api.zzce.zza(com.google.android.gms.internal.play_billing.zzb.zzb(zzd, "BillingClient"), com.google.android.gms.internal.play_billing.zzb.zzg(zzd, "BillingClient")));
            return null;
        } catch (java.lang.Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Error acknowledge purchase!", e);
            zzap(com.android.billingclient.api.zzcb.zza(28, 3, com.android.billingclient.api.zzce.zzm));
            acknowledgePurchaseResponseListener.onAcknowledgePurchaseResponse(com.android.billingclient.api.zzce.zzm);
            return null;
        }
    }

    final /* synthetic */ java.lang.Object zzl(com.android.billingclient.api.ConsumeParams consumeParams, com.android.billingclient.api.ConsumeResponseListener consumeResponseListener) throws java.lang.Exception {
        int zza;
        java.lang.String str;
        java.lang.String purchaseToken = consumeParams.getPurchaseToken();
        try {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Consuming purchase with token: " + purchaseToken);
            if (this.zzn) {
                com.google.android.gms.internal.play_billing.zzs zzsVar = this.zzg;
                java.lang.String packageName = this.zze.getPackageName();
                boolean z = this.zzn;
                java.lang.String str2 = this.zzb;
                android.os.Bundle bundle = new android.os.Bundle();
                if (z) {
                    bundle.putString("playBillingLibraryVersion", str2);
                }
                android.os.Bundle zze = zzsVar.zze(9, packageName, purchaseToken, bundle);
                zza = zze.getInt("RESPONSE_CODE");
                str = com.google.android.gms.internal.play_billing.zzb.zzg(zze, "BillingClient");
            } else {
                zza = this.zzg.zza(3, this.zze.getPackageName(), purchaseToken);
                str = "";
            }
            com.android.billingclient.api.BillingResult zza2 = com.android.billingclient.api.zzce.zza(zza, str);
            if (zza == 0) {
                com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Successfully consumed purchase.");
                consumeResponseListener.onConsumeResponse(zza2, purchaseToken);
                return null;
            }
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Error consuming purchase with token. Response code: " + zza);
            zzap(com.android.billingclient.api.zzcb.zza(23, 4, zza2));
            consumeResponseListener.onConsumeResponse(zza2, purchaseToken);
            return null;
        } catch (java.lang.Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Error consuming purchase!", e);
            zzap(com.android.billingclient.api.zzcb.zza(29, 4, com.android.billingclient.api.zzce.zzm));
            consumeResponseListener.onConsumeResponse(com.android.billingclient.api.zzce.zzm, purchaseToken);
            return null;
        }
    }

    final /* synthetic */ java.lang.Object zzm(android.os.Bundle bundle, com.android.billingclient.api.BillingConfigResponseListener billingConfigResponseListener) throws java.lang.Exception {
        try {
            this.zzg.zzp(18, this.zze.getPackageName(), bundle, new com.android.billingclient.api.zzbk(billingConfigResponseListener, this.zzf, this.zzk, null));
        } catch (android.os.DeadObjectException e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "getBillingConfig got a dead object exception (try to reconnect).", e);
            zzap(com.android.billingclient.api.zzcb.zza(62, 13, com.android.billingclient.api.zzce.zzm));
            billingConfigResponseListener.onBillingConfigResponse(com.android.billingclient.api.zzce.zzm, null);
        } catch (java.lang.Exception e2) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "getBillingConfig got an exception.", e2);
            zzap(com.android.billingclient.api.zzcb.zza(62, 13, com.android.billingclient.api.zzce.zzj));
            billingConfigResponseListener.onBillingConfigResponse(com.android.billingclient.api.zzce.zzj, null);
        }
        return null;
    }

    final /* synthetic */ java.lang.Object zzn(com.android.billingclient.api.QueryProductDetailsParams queryProductDetailsParams, com.android.billingclient.api.ProductDetailsResponseListener productDetailsResponseListener) throws java.lang.Exception {
        java.lang.String str;
        int i;
        int i2;
        com.google.android.gms.internal.play_billing.zzs zzsVar;
        int i3;
        java.lang.String packageName;
        android.os.Bundle bundle;
        com.google.android.gms.internal.play_billing.zzai zzaiVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String zzb = queryProductDetailsParams.zzb();
        com.google.android.gms.internal.play_billing.zzai zza = queryProductDetailsParams.zza();
        int size = zza.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                str = "";
                i = 0;
                break;
            }
            int i5 = i4 + 20;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(zza.subList(i4, i5 > size ? size : i5));
            java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList<>();
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                arrayList3.add(((com.android.billingclient.api.QueryProductDetailsParams.Product) arrayList2.get(i6)).zza());
            }
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle2.putString("playBillingLibraryVersion", this.zzb);
            try {
                zzsVar = this.zzg;
                i3 = true != this.zzw ? 17 : 20;
                packageName = this.zze.getPackageName();
                boolean zzat = zzat();
                java.lang.String str2 = this.zzb;
                zzam(queryProductDetailsParams);
                zzam(queryProductDetailsParams);
                zzam(queryProductDetailsParams);
                bundle = new android.os.Bundle();
                bundle.putString("playBillingLibraryVersion", str2);
                bundle.putBoolean("enablePendingPurchases", true);
                bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                if (zzat) {
                    bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
                }
                java.util.ArrayList<java.lang.String> arrayList4 = new java.util.ArrayList<>();
                java.util.ArrayList<java.lang.String> arrayList5 = new java.util.ArrayList<>();
                int size3 = arrayList2.size();
                zzaiVar = zza;
                int i7 = 0;
                boolean z = false;
                boolean z2 = false;
                while (i7 < size3) {
                    com.android.billingclient.api.QueryProductDetailsParams.Product product = (com.android.billingclient.api.QueryProductDetailsParams.Product) arrayList2.get(i7);
                    java.util.ArrayList arrayList6 = arrayList2;
                    arrayList4.add(null);
                    z |= !android.text.TextUtils.isEmpty(null);
                    java.lang.String zzb2 = product.zzb();
                    int i8 = size3;
                    if (zzb2.equals("first_party")) {
                        com.google.android.gms.internal.play_billing.zzaa.zzc(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                        arrayList5.add(null);
                        z2 = true;
                    }
                    i7++;
                    size3 = i8;
                    arrayList2 = arrayList6;
                }
                if (z) {
                    bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                }
                if (!arrayList5.isEmpty()) {
                    bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (z2 && !android.text.TextUtils.isEmpty(null)) {
                    bundle.putString("accountName", null);
                }
                i2 = 7;
            } catch (java.lang.Exception e) {
                e = e;
                i2 = 7;
            }
            try {
                android.os.Bundle zzl = zzsVar.zzl(i3, packageName, zzb, bundle2, bundle);
                str = "Item is unavailable for purchase.";
                if (zzl == null) {
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "queryProductDetailsAsync got empty product details response.");
                    zzap(com.android.billingclient.api.zzcb.zza(44, 7, com.android.billingclient.api.zzce.zzC));
                    break;
                }
                if (zzl.containsKey("DETAILS_LIST")) {
                    java.util.ArrayList<java.lang.String> stringArrayList = zzl.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList == null) {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "queryProductDetailsAsync got null response list");
                        zzap(com.android.billingclient.api.zzcb.zza(46, 7, com.android.billingclient.api.zzce.zzC));
                        break;
                    }
                    for (int i9 = 0; i9 < stringArrayList.size(); i9++) {
                        try {
                            com.android.billingclient.api.ProductDetails productDetails = new com.android.billingclient.api.ProductDetails(stringArrayList.get(i9));
                            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Got product details: ".concat(productDetails.toString()));
                            arrayList.add(productDetails);
                        } catch (org.json.JSONException e2) {
                            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e2);
                            str = "Error trying to decode SkuDetails.";
                            zzap(com.android.billingclient.api.zzcb.zza(47, 7, com.android.billingclient.api.zzce.zza(6, "Error trying to decode SkuDetails.")));
                            i = 6;
                            productDetailsResponseListener.onProductDetailsResponse(com.android.billingclient.api.zzce.zza(i, str), arrayList);
                            return null;
                        }
                    }
                    i4 = i5;
                    zza = zzaiVar;
                } else {
                    i = com.google.android.gms.internal.play_billing.zzb.zzb(zzl, "BillingClient");
                    str = com.google.android.gms.internal.play_billing.zzb.zzg(zzl, "BillingClient");
                    if (i != 0) {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + i);
                        zzap(com.android.billingclient.api.zzcb.zza(23, 7, com.android.billingclient.api.zzce.zza(i, str)));
                    } else {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                        zzap(com.android.billingclient.api.zzcb.zza(45, 7, com.android.billingclient.api.zzce.zza(6, str)));
                    }
                }
            } catch (java.lang.Exception e3) {
                e = e3;
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                zzap(com.android.billingclient.api.zzcb.zza(43, i2, com.android.billingclient.api.zzce.zzj));
                str = "An internal error occurred.";
                i = 6;
                productDetailsResponseListener.onProductDetailsResponse(com.android.billingclient.api.zzce.zza(i, str), arrayList);
                return null;
            }
        }
        i = 4;
        productDetailsResponseListener.onProductDetailsResponse(com.android.billingclient.api.zzce.zza(i, str), arrayList);
        return null;
    }

    final /* synthetic */ java.lang.Object zzo(java.lang.String str, java.util.List list, java.lang.String str2, com.android.billingclient.api.SkuDetailsResponseListener skuDetailsResponseListener) throws java.lang.Exception {
        java.lang.String str3;
        int i;
        android.os.Bundle zzk;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                str3 = "";
                i = 0;
                break;
            }
            int i3 = i2 + 20;
            java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>(list.subList(i2, i3 > size ? size : i3));
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList2);
            bundle.putString("playBillingLibraryVersion", this.zzb);
            try {
                if (this.zzo) {
                    com.google.android.gms.internal.play_billing.zzs zzsVar = this.zzg;
                    java.lang.String packageName = this.zze.getPackageName();
                    int i4 = this.zzk;
                    boolean isEnabledForOneTimeProducts = this.zzz.isEnabledForOneTimeProducts();
                    boolean zzat = zzat();
                    java.lang.String str4 = this.zzb;
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    if (i4 >= 9) {
                        bundle2.putString("playBillingLibraryVersion", str4);
                    }
                    if (i4 >= 9 && isEnabledForOneTimeProducts) {
                        bundle2.putBoolean("enablePendingPurchases", true);
                    }
                    if (zzat) {
                        bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                    }
                    zzk = zzsVar.zzl(10, packageName, str, bundle, bundle2);
                } else {
                    zzk = this.zzg.zzk(3, this.zze.getPackageName(), str, bundle);
                }
                str3 = "Item is unavailable for purchase.";
                if (zzk == null) {
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "querySkuDetailsAsync got null sku details list");
                    zzap(com.android.billingclient.api.zzcb.zza(44, 8, com.android.billingclient.api.zzce.zzC));
                    break;
                }
                if (zzk.containsKey("DETAILS_LIST")) {
                    java.util.ArrayList<java.lang.String> stringArrayList = zzk.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList == null) {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "querySkuDetailsAsync got null response list");
                        zzap(com.android.billingclient.api.zzcb.zza(46, 8, com.android.billingclient.api.zzce.zzC));
                        break;
                    }
                    for (int i5 = 0; i5 < stringArrayList.size(); i5++) {
                        try {
                            com.android.billingclient.api.SkuDetails skuDetails = new com.android.billingclient.api.SkuDetails(stringArrayList.get(i5));
                            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                            arrayList.add(skuDetails);
                        } catch (org.json.JSONException e) {
                            com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "Got a JSON exception trying to decode SkuDetails.", e);
                            str3 = "Error trying to decode SkuDetails.";
                            zzap(com.android.billingclient.api.zzcb.zza(47, 8, com.android.billingclient.api.zzce.zza(6, "Error trying to decode SkuDetails.")));
                            arrayList = null;
                            i = 6;
                            skuDetailsResponseListener.onSkuDetailsResponse(com.android.billingclient.api.zzce.zza(i, str3), arrayList);
                            return null;
                        }
                    }
                    i2 = i3;
                } else {
                    int zzb = com.google.android.gms.internal.play_billing.zzb.zzb(zzk, "BillingClient");
                    str3 = com.google.android.gms.internal.play_billing.zzb.zzg(zzk, "BillingClient");
                    if (zzb != 0) {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getSkuDetails() failed. Response code: " + zzb);
                        zzap(com.android.billingclient.api.zzcb.zza(23, 8, com.android.billingclient.api.zzce.zza(zzb, str3)));
                        i = zzb;
                    } else {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                        zzap(com.android.billingclient.api.zzcb.zza(45, 8, com.android.billingclient.api.zzce.zza(6, str3)));
                    }
                }
            } catch (java.lang.Exception e2) {
                com.google.android.gms.internal.play_billing.zzb.zzl("BillingClient", "querySkuDetailsAsync got a remote exception (try to reconnect).", e2);
                zzap(com.android.billingclient.api.zzcb.zza(43, 8, com.android.billingclient.api.zzce.zzm));
                str3 = "Service connection is disconnected.";
                i = -1;
                arrayList = null;
            }
        }
        arrayList = null;
        i = 4;
        skuDetailsResponseListener.onSkuDetailsResponse(com.android.billingclient.api.zzce.zza(i, str3), arrayList);
        return null;
    }

    final /* synthetic */ java.lang.Object zzp(android.os.Bundle bundle, android.app.Activity activity, android.os.ResultReceiver resultReceiver) throws java.lang.Exception {
        this.zzg.zzt(12, this.zze.getPackageName(), bundle, new com.android.billingclient.api.zzbs(new java.lang.ref.WeakReference(activity), resultReceiver, null));
        return null;
    }

    final /* synthetic */ java.lang.Void zzq(com.android.billingclient.api.AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener) throws java.lang.Exception {
        try {
            this.zzg.zzm(21, this.zze.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.zzb), new com.android.billingclient.api.zzbe(alternativeBillingOnlyReportingDetailsListener, this.zzf, this.zzk, null));
        } catch (java.lang.Exception unused) {
            zzap(com.android.billingclient.api.zzcb.zza(70, 15, com.android.billingclient.api.zzce.zzj));
            alternativeBillingOnlyReportingDetailsListener.onAlternativeBillingOnlyTokenResponse(com.android.billingclient.api.zzce.zzj, null);
        }
        return null;
    }

    final /* synthetic */ java.lang.Void zzr(com.android.billingclient.api.ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener) throws java.lang.Exception {
        try {
            this.zzg.zzn(22, this.zze.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.zzb), new com.android.billingclient.api.zzbg(externalOfferReportingDetailsListener, this.zzf, this.zzk, null));
        } catch (java.lang.Exception e) {
            zzap(com.android.billingclient.api.zzcb.zzb(94, 24, com.android.billingclient.api.zzce.zzj, java.lang.String.format("%s: %s", e.getClass().getName(), com.google.android.gms.internal.play_billing.zzab.zzb(e.getMessage()))));
            externalOfferReportingDetailsListener.onExternalOfferReportingDetailsResponse(com.android.billingclient.api.zzce.zzj, null);
        }
        return null;
    }

    final /* synthetic */ java.lang.Void zzs(com.android.billingclient.api.AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener) throws java.lang.Exception {
        try {
            this.zzg.zzr(21, this.zze.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.zzb), new com.android.billingclient.api.zzbo(alternativeBillingOnlyAvailabilityListener, this.zzf, this.zzk, null));
        } catch (java.lang.Exception unused) {
            zzap(com.android.billingclient.api.zzcb.zza(69, 14, com.android.billingclient.api.zzce.zzj));
            alternativeBillingOnlyAvailabilityListener.onAlternativeBillingOnlyAvailabilityResponse(com.android.billingclient.api.zzce.zzj);
        }
        return null;
    }

    final /* synthetic */ java.lang.Void zzt(com.android.billingclient.api.ExternalOfferAvailabilityListener externalOfferAvailabilityListener) throws java.lang.Exception {
        try {
            this.zzg.zzs(22, this.zze.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.zzb), new com.android.billingclient.api.zzbq(externalOfferAvailabilityListener, this.zzf, this.zzk, null));
        } catch (java.lang.Exception e) {
            zzap(com.android.billingclient.api.zzcb.zzb(91, 23, com.android.billingclient.api.zzce.zzj, java.lang.String.format("%s: %s", e.getClass().getName(), com.google.android.gms.internal.play_billing.zzab.zzb(e.getMessage()))));
            externalOfferAvailabilityListener.onExternalOfferAvailabilityResponse(com.android.billingclient.api.zzce.zzj);
        }
        return null;
    }

    final /* synthetic */ java.lang.Void zzu(android.app.Activity activity, android.os.ResultReceiver resultReceiver, com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) throws java.lang.Exception {
        try {
            this.zzg.zzo(21, this.zze.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.zzb), new com.android.billingclient.api.zzbi(new java.lang.ref.WeakReference(activity), resultReceiver, null));
        } catch (java.lang.Exception unused) {
            zzap(com.android.billingclient.api.zzcb.zza(74, 16, com.android.billingclient.api.zzce.zzj));
            alternativeBillingOnlyInformationDialogListener.onAlternativeBillingOnlyInformationDialogResponse(com.android.billingclient.api.zzce.zzj);
        }
        return null;
    }

    final /* synthetic */ java.lang.Void zzv(android.app.Activity activity, android.os.ResultReceiver resultReceiver, com.android.billingclient.api.ExternalOfferInformationDialogListener externalOfferInformationDialogListener) throws java.lang.Exception {
        try {
            this.zzg.zzq(22, this.zze.getPackageName(), com.google.android.gms.internal.play_billing.zzb.zzd(this.zzb), new com.android.billingclient.api.zzbm(new java.lang.ref.WeakReference(activity), resultReceiver, null));
        } catch (java.lang.Exception e) {
            zzap(com.android.billingclient.api.zzcb.zzb(98, 25, com.android.billingclient.api.zzce.zzj, java.lang.String.format("%s: %s", e.getClass().getName(), com.google.android.gms.internal.play_billing.zzab.zzb(e.getMessage()))));
            externalOfferInformationDialogListener.onExternalOfferInformationDialogResponse(com.android.billingclient.api.zzce.zzj);
        }
        return null;
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchaseHistoryAsync(java.lang.String str, com.android.billingclient.api.PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        zzar(str, purchaseHistoryResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void queryPurchasesAsync(java.lang.String str, com.android.billingclient.api.PurchasesResponseListener purchasesResponseListener) {
        zzas(str, purchasesResponseListener);
    }

    @Override // com.android.billingclient.api.BillingClient
    public com.android.billingclient.api.BillingResult showAlternativeBillingOnlyInformationDialog(final android.app.Activity activity, final com.android.billingclient.api.AlternativeBillingOnlyInformationDialogListener alternativeBillingOnlyInformationDialogListener) {
        if (activity == null) {
            throw new java.lang.IllegalArgumentException("Please provide a valid activity.");
        }
        if (!isReady()) {
            zzap(com.android.billingclient.api.zzcb.zza(2, 16, com.android.billingclient.api.zzce.zzm));
            return com.android.billingclient.api.zzce.zzm;
        }
        if (!this.zzx) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current Play Store version doesn't support alternative billing only.");
            zzap(com.android.billingclient.api.zzcb.zza(66, 16, com.android.billingclient.api.zzce.zzE));
            return com.android.billingclient.api.zzce.zzE;
        }
        final com.android.billingclient.api.zzax zzaxVar = new com.android.billingclient.api.zzax(this, this.zzc, alternativeBillingOnlyInformationDialogListener);
        if (zzao(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzs
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.android.billingclient.api.BillingClientImpl.this.zzu(activity, zzaxVar, alternativeBillingOnlyInformationDialogListener);
                return null;
            }
        }, 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzt
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.BillingClientImpl.this.zzad(alternativeBillingOnlyInformationDialogListener);
            }
        }, this.zzc) != null) {
            return com.android.billingclient.api.zzce.zzl;
        }
        com.android.billingclient.api.BillingResult zzal = zzal();
        zzap(com.android.billingclient.api.zzcb.zza(25, 16, zzal));
        return zzal;
    }

    @Override // com.android.billingclient.api.BillingClient
    public com.android.billingclient.api.BillingResult showExternalOfferInformationDialog(final android.app.Activity activity, final com.android.billingclient.api.ExternalOfferInformationDialogListener externalOfferInformationDialogListener) {
        if (activity == null) {
            throw new java.lang.IllegalArgumentException("Please provide a valid activity.");
        }
        if (!isReady()) {
            zzap(com.android.billingclient.api.zzcb.zza(2, 25, com.android.billingclient.api.zzce.zzm));
            return com.android.billingclient.api.zzce.zzm;
        }
        if (!this.zzy) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Current Play Store version doesn't support external offer.");
            zzap(com.android.billingclient.api.zzcb.zza(103, 25, com.android.billingclient.api.zzce.zzy));
            return com.android.billingclient.api.zzce.zzy;
        }
        final com.android.billingclient.api.zzay zzayVar = new com.android.billingclient.api.zzay(this, this.zzc, externalOfferInformationDialogListener);
        if (zzao(new java.util.concurrent.Callable() { // from class: com.android.billingclient.api.zzaj
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.android.billingclient.api.BillingClientImpl.this.zzv(activity, zzayVar, externalOfferInformationDialogListener);
                return null;
            }
        }, 30000L, new java.lang.Runnable() { // from class: com.android.billingclient.api.zzal
            @Override // java.lang.Runnable
            public final void run() {
                com.android.billingclient.api.BillingClientImpl.this.zzae(externalOfferInformationDialogListener);
            }
        }, this.zzc) != null) {
            return com.android.billingclient.api.zzce.zzl;
        }
        com.android.billingclient.api.BillingResult zzal = zzal();
        zzap(com.android.billingclient.api.zzcb.zza(25, 25, zzal));
        return zzal;
    }

    private BillingClientImpl(android.content.Context context, com.android.billingclient.api.PendingPurchasesParams pendingPurchasesParams, com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener, java.lang.String str, java.lang.String str2, com.android.billingclient.api.UserChoiceBillingListener userChoiceBillingListener, com.android.billingclient.api.zzcc zzccVar, java.util.concurrent.ExecutorService executorService) {
        this.zza = 0;
        this.zzc = new android.os.Handler(android.os.Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = str;
        initialize(context, purchasesUpdatedListener, pendingPurchasesParams, userChoiceBillingListener, str, (com.android.billingclient.api.zzcc) null);
    }

    private BillingClientImpl(java.lang.String str) {
        this.zza = 0;
        this.zzc = new android.os.Handler(android.os.Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = str;
    }

    BillingClientImpl(java.lang.String str, android.content.Context context, com.android.billingclient.api.zzcc zzccVar, java.util.concurrent.ExecutorService executorService) {
        this.zza = 0;
        this.zzc = new android.os.Handler(android.os.Looper.getMainLooper());
        this.zzk = 0;
        java.lang.String zzan = zzan();
        this.zzb = zzan;
        this.zze = context.getApplicationContext();
        com.google.android.gms.internal.play_billing.zzgt zzy = com.google.android.gms.internal.play_billing.zzgu.zzy();
        zzy.zzn(zzan);
        zzy.zzm(this.zze.getPackageName());
        this.zzf = new com.android.billingclient.api.zzch(this.zze, (com.google.android.gms.internal.play_billing.zzgu) zzy.zzf());
        this.zze.getPackageName();
    }

    private void initialize(android.content.Context context, com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener, com.android.billingclient.api.PendingPurchasesParams pendingPurchasesParams, com.android.billingclient.api.UserChoiceBillingListener userChoiceBillingListener, java.lang.String str, com.android.billingclient.api.zzcc zzccVar) {
        this.zze = context.getApplicationContext();
        com.google.android.gms.internal.play_billing.zzgt zzy = com.google.android.gms.internal.play_billing.zzgu.zzy();
        zzy.zzn(str);
        zzy.zzm(this.zze.getPackageName());
        if (zzccVar != null) {
            this.zzf = zzccVar;
        } else {
            this.zzf = new com.android.billingclient.api.zzch(this.zze, (com.google.android.gms.internal.play_billing.zzgu) zzy.zzf());
        }
        if (purchasesUpdatedListener == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.zzd = new com.android.billingclient.api.zzo(this.zze, purchasesUpdatedListener, null, null, userChoiceBillingListener, this.zzf);
        this.zzz = pendingPurchasesParams;
        this.zzA = userChoiceBillingListener != null;
    }

    BillingClientImpl(java.lang.String str, com.android.billingclient.api.PendingPurchasesParams pendingPurchasesParams, android.content.Context context, com.android.billingclient.api.zzck zzckVar, com.android.billingclient.api.zzcc zzccVar, java.util.concurrent.ExecutorService executorService) {
        this.zza = 0;
        this.zzc = new android.os.Handler(android.os.Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = zzan();
        this.zze = context.getApplicationContext();
        com.google.android.gms.internal.play_billing.zzgt zzy = com.google.android.gms.internal.play_billing.zzgu.zzy();
        zzy.zzn(zzan());
        zzy.zzm(this.zze.getPackageName());
        this.zzf = new com.android.billingclient.api.zzch(this.zze, (com.google.android.gms.internal.play_billing.zzgu) zzy.zzf());
        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.zzd = new com.android.billingclient.api.zzo(this.zze, null, null, null, null, this.zzf);
        this.zzz = pendingPurchasesParams;
        this.zze.getPackageName();
    }

    BillingClientImpl(java.lang.String str, com.android.billingclient.api.PendingPurchasesParams pendingPurchasesParams, android.content.Context context, com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener, com.android.billingclient.api.zzc zzcVar, com.android.billingclient.api.zzcc zzccVar, java.util.concurrent.ExecutorService executorService) {
        java.lang.String zzan = zzan();
        this.zza = 0;
        this.zzc = new android.os.Handler(android.os.Looper.getMainLooper());
        this.zzk = 0;
        this.zzb = zzan;
        initialize(context, purchasesUpdatedListener, pendingPurchasesParams, (com.android.billingclient.api.zzc) null, zzan, (com.android.billingclient.api.zzcc) null);
    }

    BillingClientImpl(java.lang.String str, com.android.billingclient.api.PendingPurchasesParams pendingPurchasesParams, android.content.Context context, com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener, com.android.billingclient.api.UserChoiceBillingListener userChoiceBillingListener, com.android.billingclient.api.zzcc zzccVar, java.util.concurrent.ExecutorService executorService) {
        this(context, pendingPurchasesParams, purchasesUpdatedListener, zzan(), null, userChoiceBillingListener, null, null);
    }

    @Override // com.android.billingclient.api.BillingClient
    public final void startConnection(com.android.billingclient.api.BillingClientStateListener billingClientStateListener) {
        if (isReady()) {
            com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Service connection is valid. No need to re-initialize.");
            zzaq(com.android.billingclient.api.zzcb.zzc(6));
            billingClientStateListener.onBillingSetupFinished(com.android.billingclient.api.zzce.zzl);
            return;
        }
        int i = 1;
        if (this.zza == 1) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Client is already in the process of connecting to billing service.");
            zzap(com.android.billingclient.api.zzcb.zza(37, 6, com.android.billingclient.api.zzce.zzd));
            billingClientStateListener.onBillingSetupFinished(com.android.billingclient.api.zzce.zzd);
            return;
        }
        if (this.zza == 3) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            zzap(com.android.billingclient.api.zzcb.zza(38, 6, com.android.billingclient.api.zzce.zzm));
            billingClientStateListener.onBillingSetupFinished(com.android.billingclient.api.zzce.zzm);
            return;
        }
        this.zza = 1;
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Starting in-app billing setup.");
        this.zzh = new com.android.billingclient.api.zzbc(this, billingClientStateListener, null);
        android.content.Intent intent = new android.content.Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        java.util.List<android.content.pm.ResolveInfo> queryIntentServices = this.zze.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            i = 41;
        } else {
            android.content.pm.ResolveInfo resolveInfo = queryIntentServices.get(0);
            if (resolveInfo.serviceInfo != null) {
                java.lang.String str = resolveInfo.serviceInfo.packageName;
                java.lang.String str2 = resolveInfo.serviceInfo.name;
                if (!"com.android.vending".equals(str) || str2 == null) {
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "The device doesn't have valid Play Store.");
                    i = 40;
                } else {
                    android.content.ComponentName componentName = new android.content.ComponentName(str, str2);
                    android.content.Intent intent2 = new android.content.Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.zzb);
                    if (this.zze.bindService(intent2, this.zzh, 1)) {
                        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Service was bonded successfully.");
                        return;
                    } else {
                        com.google.android.gms.internal.play_billing.zzb.zzk("BillingClient", "Connection to Billing service is blocked.");
                        i = 39;
                    }
                }
            }
        }
        this.zza = 0;
        com.google.android.gms.internal.play_billing.zzb.zzj("BillingClient", "Billing service unavailable on device.");
        zzap(com.android.billingclient.api.zzcb.zza(i, 6, com.android.billingclient.api.zzce.zzc));
        billingClientStateListener.onBillingSetupFinished(com.android.billingclient.api.zzce.zzc);
    }
}
