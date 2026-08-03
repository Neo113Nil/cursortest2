package com.google.android.gms.fido.u2f.api.messagebased;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@java.lang.Deprecated
/* loaded from: classes3.dex */
public enum RequestType {
    REGISTER("u2f_register_request"),
    SIGN("u2f_sign_request");

    private final java.lang.String zzb;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static class UnsupportedRequestTypeException extends java.lang.Exception {
        public UnsupportedRequestTypeException(java.lang.String str) {
            super("Unsupported request type ".concat(java.lang.String.valueOf(str)));
        }
    }

    RequestType(java.lang.String str) {
        this.zzb = str;
    }

    public static com.google.android.gms.fido.u2f.api.messagebased.RequestType fromString(java.lang.String str) throws com.google.android.gms.fido.u2f.api.messagebased.RequestType.UnsupportedRequestTypeException {
        for (com.google.android.gms.fido.u2f.api.messagebased.RequestType requestType : values()) {
            if (str.equals(requestType.zzb)) {
                return requestType;
            }
        }
        throw new com.google.android.gms.fido.u2f.api.messagebased.RequestType.UnsupportedRequestTypeException(str);
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.zzb;
    }
}
