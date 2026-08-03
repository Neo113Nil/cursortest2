package com.google.android.gms.fido.u2f.api.messagebased;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@java.lang.Deprecated
/* loaded from: classes3.dex */
public enum ResponseType {
    REGISTER("u2f_register_response"),
    SIGN("u2f_sign_response");

    private final java.lang.String zzb;

    ResponseType(java.lang.String str) {
        this.zzb = str;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.zzb;
    }

    public static com.google.android.gms.fido.u2f.api.messagebased.ResponseType getResponseTypeForRequestType(com.google.android.gms.fido.u2f.api.messagebased.RequestType requestType) throws com.google.android.gms.fido.u2f.api.messagebased.RequestType.UnsupportedRequestTypeException {
        if (requestType == null) {
            throw new com.google.android.gms.fido.u2f.api.messagebased.RequestType.UnsupportedRequestTypeException(null);
        }
        int ordinal = requestType.ordinal();
        if (ordinal == 0) {
            return REGISTER;
        }
        if (ordinal == 1) {
            return SIGN;
        }
        throw new com.google.android.gms.fido.u2f.api.messagebased.RequestType.UnsupportedRequestTypeException(requestType.toString());
    }
}
