package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public abstract class zzi extends com.google.android.gms.internal.play_billing.zzw implements com.google.android.gms.internal.play_billing.zzj {
    public zzi() {
        super("com.android.vending.billing.IInAppBillingGetBillingConfigCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzw
    protected final boolean zzb(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.play_billing.zzx.zza(parcel, android.os.Bundle.CREATOR);
        com.google.android.gms.internal.play_billing.zzx.zzb(parcel);
        zza(bundle);
        parcel2.writeNoException();
        return true;
    }
}
