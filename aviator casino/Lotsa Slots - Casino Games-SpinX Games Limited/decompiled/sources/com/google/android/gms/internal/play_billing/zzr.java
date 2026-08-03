package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public abstract class zzr extends com.google.android.gms.internal.play_billing.zzw implements com.google.android.gms.internal.play_billing.zzs {
    public static com.google.android.gms.internal.play_billing.zzs zzu(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        return queryLocalInterface instanceof com.google.android.gms.internal.play_billing.zzs ? (com.google.android.gms.internal.play_billing.zzs) queryLocalInterface : new com.google.android.gms.internal.play_billing.zzq(iBinder);
    }
}
