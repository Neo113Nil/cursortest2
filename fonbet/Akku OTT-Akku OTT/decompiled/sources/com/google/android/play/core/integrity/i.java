package com.google.android.play.core.integrity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.firebase.messaging.Constants;

/* loaded from: classes4.dex */
public final class i implements k {
    @Override // com.google.android.play.core.integrity.k
    @Nullable
    public final com.google.android.gms.common.api.b a(Bundle bundle) {
        int i = bundle.getInt(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        if (i == 0) {
            return null;
        }
        return new IntegrityServiceException(i, null);
    }
}
