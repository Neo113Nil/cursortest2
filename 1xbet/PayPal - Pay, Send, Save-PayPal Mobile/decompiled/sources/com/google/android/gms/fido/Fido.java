package com.google.android.gms.fido;

/* loaded from: classes8.dex */
public class Fido {
    public static final java.lang.String FIDO2_KEY_CREDENTIAL_EXTRA = "FIDO2_CREDENTIAL_EXTRA";

    @java.lang.Deprecated
    public static final java.lang.String FIDO2_KEY_ERROR_EXTRA = "FIDO2_ERROR_EXTRA";

    @java.lang.Deprecated
    public static final java.lang.String FIDO2_KEY_RESPONSE_EXTRA = "FIDO2_RESPONSE_EXTRA";
    public static final java.lang.String FIDO_CREDENTIAL_JSON_EXTRA = "FIDO2_CREDENTIAL_JSON_EXTRA";
    public static final java.lang.String KEY_RESPONSE_EXTRA = "RESPONSE_EXTRA";
    public static final com.google.android.gms.common.api.Api.ClientKey zza;
    public static final com.google.android.gms.common.api.Api zzb;
    public static final com.google.android.gms.internal.fido.zzaa zzc;

    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zza = clientKey;
        zzb = new com.google.android.gms.common.api.Api("Fido.U2F_ZERO_PARTY_API", new com.google.android.gms.internal.fido.zzab(), clientKey);
        zzc = new com.google.android.gms.internal.fido.zzaa();
    }

    public static com.google.android.gms.fido.fido2.Fido2ApiClient getFido2ApiClient(android.app.Activity activity) {
        return new com.google.android.gms.fido.fido2.Fido2ApiClient(activity);
    }

    public static com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient getFido2PrivilegedApiClient(android.app.Activity activity) {
        return new com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient(activity);
    }

    public static com.google.android.gms.fido.u2f.U2fApiClient getU2fApiClient(android.app.Activity activity) {
        return new com.google.android.gms.fido.u2f.U2fApiClient(activity);
    }

    public static com.google.android.gms.fido.fido2.Fido2ApiClient getFido2ApiClient(android.content.Context context) {
        return new com.google.android.gms.fido.fido2.Fido2ApiClient(context);
    }

    public static com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient getFido2PrivilegedApiClient(android.content.Context context) {
        return new com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient(context);
    }

    public static com.google.android.gms.fido.u2f.U2fApiClient getU2fApiClient(android.content.Context context) {
        return new com.google.android.gms.fido.u2f.U2fApiClient(context);
    }

    private Fido() {
    }
}
