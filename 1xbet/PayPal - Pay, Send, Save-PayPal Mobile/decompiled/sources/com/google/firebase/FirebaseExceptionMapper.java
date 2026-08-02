package com.google.firebase;

/* loaded from: classes9.dex */
public class FirebaseExceptionMapper implements com.google.android.gms.common.api.internal.StatusExceptionMapper {
    @Override // com.google.android.gms.common.api.internal.StatusExceptionMapper
    public final java.lang.Exception getException(com.google.android.gms.common.api.Status status) {
        return status.getStatusCode() == 8 ? new com.google.firebase.FirebaseException(status.zza()) : new com.google.firebase.FirebaseApiNotAvailableException(status.zza());
    }
}
