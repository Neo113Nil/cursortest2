package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* compiled from: com.android.billingclient:billing@@8.3.0 */
/* loaded from: classes8.dex */
public final class zzaa extends zzas implements zzac {
    zzaa(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingDelegateToBackendCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzac
    public final void onDelegateToBackendResponse(Bundle bundle) throws RemoteException {
        throw null;
    }
}
