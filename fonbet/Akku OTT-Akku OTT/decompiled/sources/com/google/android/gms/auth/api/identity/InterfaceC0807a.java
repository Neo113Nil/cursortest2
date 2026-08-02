package com.google.android.gms.auth.api.identity;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.auth.api.identity.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC0807a {
    @NonNull
    Task<C0809c> authorize(@NonNull AuthorizationRequest authorizationRequest);

    @NonNull
    Task<Void> clearToken(@NonNull ClearTokenRequest clearTokenRequest);

    @NonNull
    C0809c getAuthorizationResultFromIntent(@Nullable Intent intent) throws com.google.android.gms.common.api.b;

    @NonNull
    Task<Void> revokeAccess(@NonNull RevokeAccessRequest revokeAccessRequest);
}
