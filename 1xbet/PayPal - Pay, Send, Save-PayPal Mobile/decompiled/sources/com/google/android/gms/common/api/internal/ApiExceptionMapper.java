package com.google.android.gms.common.api.internal;

/* loaded from: classes3.dex */
public class ApiExceptionMapper implements com.google.android.gms.common.api.internal.StatusExceptionMapper {
    @Override // com.google.android.gms.common.api.internal.StatusExceptionMapper
    public final java.lang.Exception getException(com.google.android.gms.common.api.Status status) {
        return com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(status);
    }
}
