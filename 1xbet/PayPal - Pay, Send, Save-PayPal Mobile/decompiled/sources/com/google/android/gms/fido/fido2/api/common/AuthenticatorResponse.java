package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public abstract class AuthenticatorResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public abstract byte[] getClientDataJSON();

    public abstract byte[] serializeToBytes();
}
