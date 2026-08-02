package com.google.firebase.iid;

import android.os.Bundle;
import com.google.android.gms.common.data.DataBufferSafeParcelable;

/* loaded from: classes.dex */
final class zzag extends zzae<Bundle> {
    zzag(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    @Override // com.google.firebase.iid.zzae
    final void zzb(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(DataBufferSafeParcelable.DATA_FIELD);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        finish(bundle2);
    }

    @Override // com.google.firebase.iid.zzae
    final boolean zzv() {
        return false;
    }
}
