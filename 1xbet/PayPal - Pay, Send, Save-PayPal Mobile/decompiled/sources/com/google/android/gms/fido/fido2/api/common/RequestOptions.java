package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public abstract class RequestOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public abstract com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions getAuthenticationExtensions();

    public abstract byte[] getChallenge();

    public abstract java.lang.Integer getRequestId();

    public abstract java.lang.Double getTimeoutSeconds();

    public abstract com.google.android.gms.fido.fido2.api.common.TokenBinding getTokenBinding();

    public byte[] serializeToBytes() {
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(this);
    }
}
