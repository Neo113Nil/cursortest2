package com.google.android.gms.tapandpay;

/* loaded from: classes8.dex */
public abstract class TapAndPay {
    public static final java.lang.String ANDROID_WALLET = "androidpay";
    public static final int CARD_NETWORK_AMEX = 1;
    public static final int CARD_NETWORK_BANCOMAT = 14;
    public static final int CARD_NETWORK_DISCOVER = 2;
    public static final int CARD_NETWORK_EFTPOS = 7;
    public static final int CARD_NETWORK_ELO = 12;
    public static final int CARD_NETWORK_ID = 9;
    public static final int CARD_NETWORK_INTERAC = 5;
    public static final int CARD_NETWORK_JCB = 11;
    public static final int CARD_NETWORK_MADA = 18;
    public static final int CARD_NETWORK_MAESTRO = 8;
    public static final int CARD_NETWORK_MASTERCARD = 3;
    public static final int CARD_NETWORK_MIR = 13;
    public static final int CARD_NETWORK_POSTFINANCE = 22;
    public static final int CARD_NETWORK_PRIVATE_LABEL = 6;
    public static final int CARD_NETWORK_QUICPAY = 10;
    public static final int CARD_NETWORK_VISA = 4;
    public static final java.lang.String EXTRA_CARD_RESULT = "extra_card_result";
    public static final java.lang.String EXTRA_ISSUER_TOKEN_ID = "extra_issuer_token_id";
    public static final java.lang.String EXTRA_PUSH_TOKENIZE_RESULT = "extra_push_tokenize_result";
    public static final java.lang.String EXTRA_STATUS_LIST = "extra_status_list";
    public static final java.lang.String EXTRA_TOKENIZATION_SESSION_ID = "extra_tokenization_session_id";
    public static final java.lang.String EXTRA_TOKEN_RESULT = "extra_token_result";
    public static final java.lang.String EXTRA_VIRTUAL_CARDS_RESULT = "extra_virtual_cards_result";
    public static final java.lang.String FITBIT_WALLET = "fitbit";
    public static final int TOKEN_PROVIDER_AMEX = 2;
    public static final int TOKEN_PROVIDER_BANCOMAT = 17;
    public static final int TOKEN_PROVIDER_DISCOVER = 5;
    public static final int TOKEN_PROVIDER_EFTPOS = 6;
    public static final int TOKEN_PROVIDER_ELO = 14;
    public static final int TOKEN_PROVIDER_GEMALTO = 15;
    public static final int TOKEN_PROVIDER_IDEMIA = 19;
    public static final int TOKEN_PROVIDER_INTERAC = 7;
    public static final int TOKEN_PROVIDER_JCB = 13;
    public static final int TOKEN_PROVIDER_MASTERCARD = 3;
    public static final int TOKEN_PROVIDER_MIR = 16;
    public static final int TOKEN_PROVIDER_OBERTHUR = 8;
    public static final int TOKEN_PROVIDER_PAYPAL = 9;
    public static final int TOKEN_PROVIDER_THALES = 20;
    public static final int TOKEN_PROVIDER_VISA = 4;
    public static final int TOKEN_STATE_ACTIVE = 5;
    public static final int TOKEN_STATE_FELICA_PENDING_PROVISIONING = 6;
    public static final int TOKEN_STATE_NEEDS_IDENTITY_VERIFICATION = 3;
    public static final int TOKEN_STATE_PENDING = 2;
    public static final int TOKEN_STATE_SUSPENDED = 4;
    public static final int TOKEN_STATE_UNTOKENIZED = 1;
    public static final com.google.android.gms.common.api.Api zza;
    public static final com.google.android.gms.common.api.Api zzb;
    private static final com.google.android.gms.common.api.Api.ClientKey zzc;
    private static final com.google.android.gms.common.api.Api.ClientKey zzd;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zze;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zzf;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface CardNetwork {
    }

    public interface DataChangedListener {
        void onDataChanged();
    }

    public interface ServiceListener {
        void onResponse(byte[] bArr);
    }

    /* loaded from: classes3.dex */
    public @interface TokenRequestorId {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface TokenServiceProvider {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface TokenState {
    }

    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zzc = clientKey;
        com.google.android.gms.common.api.Api.ClientKey clientKey2 = new com.google.android.gms.common.api.Api.ClientKey();
        zzd = clientKey2;
        com.google.android.gms.tapandpay.zzb zzbVar = new com.google.android.gms.tapandpay.zzb();
        zze = zzbVar;
        com.google.android.gms.tapandpay.zzc zzcVar = new com.google.android.gms.tapandpay.zzc();
        zzf = zzcVar;
        zza = new com.google.android.gms.common.api.Api("TapAndPay.TAP_AND_PAY_API", zzbVar, clientKey);
        zzb = new com.google.android.gms.common.api.Api("TapAndPay.TAP_AND_PAY_SINGLE_USER_API", zzcVar, clientKey2);
    }

    public static com.google.android.gms.tapandpay.TapAndPayClient getClient(android.app.Activity activity) {
        return new com.google.android.gms.internal.tapandpay.zzbd(activity);
    }

    public static com.google.android.gms.tapandpay.TapAndPaySingleUserClient getSingleUserClient(android.content.Context context) {
        return new com.google.android.gms.internal.tapandpay.zzbi(context);
    }

    public static com.google.android.gms.tapandpay.TapAndPayClient getClient(android.content.Context context) {
        return new com.google.android.gms.internal.tapandpay.zzbd(context);
    }

    private TapAndPay() {
    }
}
