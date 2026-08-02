package com.google.android.gms.cloudmessaging;

/* loaded from: classes3.dex */
final class zzu extends com.google.android.gms.cloudmessaging.zzs {
    zzu(int i, int i2, android.os.Bundle bundle) {
        super(i, i2, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.zzs
    final void zza(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = bundle.getBundle(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (bundle2 == null) {
            bundle2 = android.os.Bundle.EMPTY;
        }
        zzd(bundle2);
    }

    @Override // com.google.android.gms.cloudmessaging.zzs
    final boolean zzb() {
        return false;
    }
}
