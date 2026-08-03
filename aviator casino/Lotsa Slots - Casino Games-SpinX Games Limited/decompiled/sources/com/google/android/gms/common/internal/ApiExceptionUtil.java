package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes3.dex */
public class ApiExceptionUtil {
    public static com.google.android.gms.common.api.ApiException fromStatus(com.google.android.gms.common.api.Status status) {
        return status.hasResolution() ? new com.google.android.gms.common.api.ResolvableApiException(status) : new com.google.android.gms.common.api.ApiException(status);
    }
}
