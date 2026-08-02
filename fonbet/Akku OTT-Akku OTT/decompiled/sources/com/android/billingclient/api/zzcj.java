package com.android.billingclient.api;

import androidx.compose.runtime.changelist.d;
import com.android.billingclient.api.BillingResult;

/* loaded from: classes3.dex */
final class zzcj {
    static final BillingResult zzA;
    static final BillingResult zzB;
    static final BillingResult zzC;
    static final BillingResult zzD;
    static final BillingResult zzE;
    static final BillingResult zzF;
    static final BillingResult zzG;
    public static final /* synthetic */ int zzH = 0;
    static final BillingResult zza = d.a(3, "Google Play In-app Billing API version is less than 3");
    static final BillingResult zzb = d.a(3, "Google Play In-app Billing API version is less than 9");
    static final BillingResult zzc = d.a(3, "Billing service unavailable on device.");
    static final BillingResult zzd = d.a(2, "Billing service unavailable on device.");
    static final BillingResult zze = d.a(5, "Client is already in the process of connecting to billing service.");
    static final BillingResult zzf = d.a(5, "The list of SKUs can't be empty.");
    static final BillingResult zzg = d.a(5, "SKU type can't be empty.");
    static final BillingResult zzh = d.a(5, "Product type can't be empty.");
    static final BillingResult zzi = d.a(-2, "Client does not support extra params.");
    static final BillingResult zzj = d.a(5, "Invalid purchase token.");
    static final BillingResult zzk = d.a(6, "An internal error occurred.");
    static final BillingResult zzl;
    static final BillingResult zzm;
    static final BillingResult zzn;
    static final BillingResult zzo;
    static final BillingResult zzp;
    static final BillingResult zzq;
    static final BillingResult zzr;
    static final BillingResult zzs;
    static final BillingResult zzt;
    static final BillingResult zzu;
    static final BillingResult zzv;
    static final BillingResult zzw;
    static final BillingResult zzx;
    static final BillingResult zzy;
    static final BillingResult zzz;

    static {
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(5);
        newBuilder.setDebugMessage("SKU can't be null.");
        newBuilder.build();
        BillingResult.Builder newBuilder2 = BillingResult.newBuilder();
        newBuilder2.setResponseCode(0);
        zzl = newBuilder2.build();
        zzm = d.a(-1, "Service connection is disconnected.");
        zzn = d.a(2, "Timeout communicating with service.");
        zzo = d.a(-2, "Client does not support subscriptions.");
        zzp = d.a(-2, "Client does not support subscriptions update.");
        zzq = d.a(-2, "Client does not support get purchase history.");
        zzr = d.a(-2, "Client does not support price change confirmation.");
        zzs = d.a(-2, "Play Store version installed does not support cross selling products.");
        zzt = d.a(-2, "Client does not support multi-item purchases.");
        zzu = d.a(-2, "Client does not support offer_id_token.");
        zzv = d.a(-2, "Client does not support ProductDetails.");
        zzw = d.a(-2, "Client does not support in-app messages.");
        BillingResult.Builder newBuilder3 = BillingResult.newBuilder();
        newBuilder3.setResponseCode(-2);
        newBuilder3.setDebugMessage("Client does not support user choice billing.");
        newBuilder3.build();
        BillingResult.Builder newBuilder4 = BillingResult.newBuilder();
        newBuilder4.setResponseCode(-2);
        newBuilder4.setDebugMessage("Play Store version installed does not support external offer.");
        zzx = newBuilder4.build();
        zzy = d.a(-2, "Play Store version installed does not support multi-item purchases with season pass in one cart.");
        zzz = d.a(5, "Unknown feature");
        zzA = d.a(-2, "Play Store version installed does not support get billing config.");
        zzB = d.a(-2, "Query product details with serialized docid is not supported.");
        zzC = d.a(4, "Item is unavailable for purchase.");
        zzD = d.a(-2, "Query product details with developer specified account is not supported.");
        zzE = d.a(-2, "Play Store version installed does not support alternative billing only.");
        zzF = d.a(5, "To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
        zzG = d.a(6, "An error occurred while retrieving billing override.");
    }

    public static BillingResult zza(int i, String str) {
        return d.a(i, str);
    }
}
