package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
public final class i implements com.google.android.play.core.integrity.k {
    @Override // com.google.android.play.core.integrity.k
    public final com.google.android.gms.common.api.ApiException a(android.os.Bundle bundle) {
        int i = bundle.getInt("error");
        if (i == 0) {
            return null;
        }
        return new com.google.android.play.core.integrity.IntegrityServiceException(i, null);
    }

    i() {
    }
}
