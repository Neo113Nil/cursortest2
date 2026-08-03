package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzn extends android.content.BroadcastReceiver {
    final /* synthetic */ com.android.billingclient.api.zzo zza;
    private boolean zzb;
    private final boolean zzc;

    zzn(com.android.billingclient.api.zzo zzoVar, boolean z) {
        this.zza = zzoVar;
        this.zzc = z;
    }

    private final void zzd(android.os.Bundle bundle, com.android.billingclient.api.BillingResult billingResult, int i) {
        com.android.billingclient.api.zzcc zzccVar;
        com.android.billingclient.api.zzcc zzccVar2;
        if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
            zzccVar2 = this.zza.zze;
            zzccVar2.zza(com.android.billingclient.api.zzcb.zza(23, i, billingResult));
        } else {
            try {
                zzccVar = this.zza.zze;
                zzccVar.zza(com.google.android.gms.internal.play_billing.zzga.zzA(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), com.google.android.gms.internal.play_billing.zzcd.zza()));
            } catch (java.lang.Throwable unused) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", "Failed parsing Api failure.");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener;
        com.android.billingclient.api.zzcc zzccVar;
        com.android.billingclient.api.zzc zzcVar;
        com.android.billingclient.api.zzcc zzccVar2;
        com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener2;
        com.android.billingclient.api.zzcc zzccVar3;
        com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener3;
        com.android.billingclient.api.UserChoiceBillingListener userChoiceBillingListener;
        com.android.billingclient.api.zzc zzcVar2;
        com.android.billingclient.api.zzcc zzccVar4;
        com.android.billingclient.api.UserChoiceBillingListener userChoiceBillingListener2;
        com.android.billingclient.api.UserChoiceBillingListener userChoiceBillingListener3;
        com.android.billingclient.api.zzcc zzccVar5;
        com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener4;
        com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener5;
        com.android.billingclient.api.zzcc zzccVar6;
        com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener6;
        com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener7;
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", "Bundle is null.");
            zzccVar6 = this.zza.zze;
            zzccVar6.zza(com.android.billingclient.api.zzcb.zza(11, 1, com.android.billingclient.api.zzce.zzj));
            com.android.billingclient.api.zzo zzoVar = this.zza;
            purchasesUpdatedListener6 = zzoVar.zzb;
            if (purchasesUpdatedListener6 != null) {
                purchasesUpdatedListener7 = zzoVar.zzb;
                purchasesUpdatedListener7.onPurchasesUpdated(com.android.billingclient.api.zzce.zzj, null);
                return;
            }
            return;
        }
        com.android.billingclient.api.BillingResult zze = com.google.android.gms.internal.play_billing.zzb.zze(intent, "BillingBroadcastManager");
        java.lang.String action = intent.getAction();
        int i = true != java.util.Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 1 : 2;
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED") || action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            java.util.List<com.android.billingclient.api.Purchase> zzi = com.google.android.gms.internal.play_billing.zzb.zzi(extras);
            if (zze.getResponseCode() == 0) {
                zzccVar = this.zza.zze;
                zzccVar.zzc(com.android.billingclient.api.zzcb.zzc(i));
            } else {
                zzd(extras, zze, i);
            }
            purchasesUpdatedListener = this.zza.zzb;
            purchasesUpdatedListener.onPurchasesUpdated(zze, zzi);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (zze.getResponseCode() != 0) {
                zzd(extras, zze, i);
                purchasesUpdatedListener5 = this.zza.zzb;
                purchasesUpdatedListener5.onPurchasesUpdated(zze, com.google.android.gms.internal.play_billing.zzai.zzk());
                return;
            }
            com.android.billingclient.api.zzo zzoVar2 = this.zza;
            zzcVar = zzoVar2.zzc;
            if (zzcVar == null) {
                userChoiceBillingListener3 = zzoVar2.zzd;
                if (userChoiceBillingListener3 == null) {
                    com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                    zzccVar5 = this.zza.zze;
                    zzccVar5.zza(com.android.billingclient.api.zzcb.zza(77, i, com.android.billingclient.api.zzce.zzj));
                    purchasesUpdatedListener4 = this.zza.zzb;
                    purchasesUpdatedListener4.onPurchasesUpdated(com.android.billingclient.api.zzce.zzj, com.google.android.gms.internal.play_billing.zzai.zzk());
                    return;
                }
            }
            java.lang.String string = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
            if (string == null) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                zzccVar2 = this.zza.zze;
                zzccVar2.zza(com.android.billingclient.api.zzcb.zza(16, i, com.android.billingclient.api.zzce.zzj));
                purchasesUpdatedListener2 = this.zza.zzb;
                purchasesUpdatedListener2.onPurchasesUpdated(com.android.billingclient.api.zzce.zzj, com.google.android.gms.internal.play_billing.zzai.zzk());
                return;
            }
            try {
                userChoiceBillingListener = this.zza.zzd;
                if (userChoiceBillingListener != null) {
                    com.android.billingclient.api.UserChoiceDetails userChoiceDetails = new com.android.billingclient.api.UserChoiceDetails(string);
                    userChoiceBillingListener2 = this.zza.zzd;
                    userChoiceBillingListener2.userSelectedAlternativeBilling(userChoiceDetails);
                } else {
                    org.json.JSONArray optJSONArray = new org.json.JSONObject(string).optJSONArray("products");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    if (optJSONArray != null) {
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                            if (optJSONObject != null) {
                                arrayList.add(new com.android.billingclient.api.zze(optJSONObject, null));
                            }
                        }
                    }
                    zzcVar2 = this.zza.zzc;
                    zzcVar2.zza();
                }
                zzccVar4 = this.zza.zze;
                zzccVar4.zzc(com.android.billingclient.api.zzcb.zzc(i));
            } catch (org.json.JSONException unused) {
                com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", java.lang.String.format("Error when parsing invalid user choice data: [%s]", string));
                zzccVar3 = this.zza.zze;
                zzccVar3.zza(com.android.billingclient.api.zzcb.zza(17, i, com.android.billingclient.api.zzce.zzj));
                purchasesUpdatedListener3 = this.zza.zzb;
                purchasesUpdatedListener3.onPurchasesUpdated(com.android.billingclient.api.zzce.zzj, com.google.android.gms.internal.play_billing.zzai.zzk());
            }
        }
    }

    public final synchronized void zza(android.content.Context context, android.content.IntentFilter intentFilter) {
        if (this.zzb) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(this, intentFilter, true != this.zzc ? 4 : 2);
        } else {
            context.registerReceiver(this, intentFilter);
        }
        this.zzb = true;
    }

    public final synchronized void zzb(android.content.Context context, android.content.IntentFilter intentFilter, java.lang.String str) {
        if (this.zzb) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.zzc ? 4 : 2);
        } else {
            context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
        }
        this.zzb = true;
    }

    public final synchronized void zzc(android.content.Context context) {
        if (!this.zzb) {
            com.google.android.gms.internal.play_billing.zzb.zzk("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.zzb = false;
        }
    }
}
