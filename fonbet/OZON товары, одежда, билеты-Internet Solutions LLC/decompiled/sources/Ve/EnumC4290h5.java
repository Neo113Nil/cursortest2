package Ve;

import spay.sdk.data.dto.response.binding.BindingV3SessionResponseBodyDtoKt;

/* renamed from: Ve.h5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC4290h5 {
    REFRESH_TOKEN("refreshToken"),
    BNPL("bnpl"),
    COMPOUND_WALLET("compoundWallet"),
    CARD_BALANCE("cardBalance"),
    CARD_HELPER_BNPL("bnpl"),
    CARD_HELPER_SBP("sbp"),
    CARD_HELPER_CREDIT("newCreditCard"),
    CARD_HELPER_DEBIT("newDebitCard"),
    RETRIES("retries"),
    S_BONUSES("spasiboBonuses"),
    S_BONUSES_PAYMENT("spasiboBonusesPayment"),
    CARD_LIST_SORT("sortListCards"),
    USE_CACHED_CARDS_LIST("useCachedCardsList"),
    SSL("ssl"),
    DYNATRACE_METRICS("dynatrace"),
    CLICKSTREAM_METRICS("clickStream"),
    LOCAL_SESSION_ID("localSessionId"),
    SEAMLESS_AUTHORIZATION("seamlessAuth"),
    PAY_BINDING(BindingV3SessionResponseBodyDtoKt.CHECK_RESULT_BALANCE_CHECK_FIELD),
    PAY_BINDING_V2("payBindingV2"),
    S_BONUSES_PAYMENT_V2("spasiboBonusesPaymentv2"),
    PHONE_NUMBER_AUTH("phoneNumberAuth"),
    APP_AUTH("appAuth"),
    PHONE_NUMBER_AUTH_SSL("phoneNumberAuthSsl");


    /* renamed from: a, reason: collision with root package name */
    public final String f31167a;

    EnumC4290h5(String str) {
        this.f31167a = str;
    }
}
