package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzcb {
    public static final /* synthetic */ int zza = 0;

    static {
        com.google.android.gms.internal.play_billing.zzal zzalVar = com.android.billingclient.api.zzcc.zza;
    }

    public static com.google.android.gms.internal.play_billing.zzga zza(int i, int i2, com.android.billingclient.api.BillingResult billingResult) {
        try {
            com.google.android.gms.internal.play_billing.zzfz zzy = com.google.android.gms.internal.play_billing.zzga.zzy();
            com.google.android.gms.internal.play_billing.zzgg zzy2 = com.google.android.gms.internal.play_billing.zzgk.zzy();
            zzy2.zzn(billingResult.getResponseCode());
            zzy2.zzm(billingResult.getDebugMessage());
            zzy2.zzo(i);
            zzy.zzl(zzy2);
            zzy.zzn(i2);
            return (com.google.android.gms.internal.play_billing.zzga) zzy.zzf();
        } catch (java.lang.Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }

    public static com.google.android.gms.internal.play_billing.zzga zzb(int i, int i2, com.android.billingclient.api.BillingResult billingResult, java.lang.String str) {
        try {
            com.google.android.gms.internal.play_billing.zzgg zzy = com.google.android.gms.internal.play_billing.zzgk.zzy();
            zzy.zzn(billingResult.getResponseCode());
            zzy.zzm(billingResult.getDebugMessage());
            zzy.zzo(i);
            if (str != null) {
                zzy.zzl(str);
            }
            com.google.android.gms.internal.play_billing.zzfz zzy2 = com.google.android.gms.internal.play_billing.zzga.zzy();
            zzy2.zzl(zzy);
            zzy2.zzn(i2);
            return (com.google.android.gms.internal.play_billing.zzga) zzy2.zzf();
        } catch (java.lang.Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }

    public static com.google.android.gms.internal.play_billing.zzge zzc(int i) {
        try {
            com.google.android.gms.internal.play_billing.zzgd zzy = com.google.android.gms.internal.play_billing.zzge.zzy();
            zzy.zzm(i);
            return (com.google.android.gms.internal.play_billing.zzge) zzy.zzf();
        } catch (java.lang.Exception e) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
