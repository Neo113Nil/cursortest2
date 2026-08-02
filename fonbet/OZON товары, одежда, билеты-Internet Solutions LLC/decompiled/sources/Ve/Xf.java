package Ve;

/* loaded from: classes10.dex */
public enum Xf implements InterfaceC4443me {
    TOUCH_CARD("TouchCard"),
    TOUCH_BNPL("TouchBNPL"),
    TOUCH_PAY("TouchPay"),
    TOUCH_CANCEL("TouchCancel"),
    RQ_LIST_CARDS("RQListCards"),
    RQ_PAYMENT_ACCOUNTS("RQPaymentAccounts"),
    RQ_ORDER_SPASIBO_BONUSES("RQOrderSpasiboBonuses"),
    RQ_GOOD_LIST_CARDS("RQGoodListCards"),
    RQ_GOOD_PAYMENT_ACCOUNTS("RQGoodPaymentAccounts"),
    RQ_FAIL_LIST_CARDS("RQFailListCards"),
    RQ_FAIL_PAYMENT_ACCOUNTS("RQFailPaymentAccounts"),
    RS_GOOD_LIST_CARDS("RSGoodListCards"),
    RS_GOOD_PAYMENT_ACCOUNTS("RSGoodPaymentAccounts"),
    RS_FAIL_LIST_CARDS("RSFailListCards"),
    RS_FAIL_PAYMENT_ACCOUNTS("RSFailPaymentAccounts"),
    RQ_PAYMENT_TOKEN("RQPaymentToken"),
    RQ_GOOD_PAYMENT_TOKEN("RQGoodPaymentToken"),
    RQ_FAIL_PAYMENT_TOKEN("RQFailPaymentToken"),
    RS_GOOD_PAYMENT_TOKEN("RSGoodPaymentToken"),
    RS_FAIL_PAYMENT_TOKEN("RSFailPaymentToken"),
    RQ_PAYMENT_ORDER("RQPaymentOrder"),
    RQ_GOOD_PAYMENT_ORDER("RQGoodPaymentOrder"),
    RQ_FAIL_PAYMENT_ORDER("RQFailPaymentOrder"),
    RS_GOOD_PAYMENT_ORDER("RSGoodPaymentOrder"),
    RS_FAIL_PAYMENT_ORDER("RSFailPaymentOrder"),
    LC_BIO_AUTH_START("LCBioAuthStart"),
    LC_GOOD_BIO_AUTH("LCGoodBioAuth"),
    LC_FAIL_BIO_AUTH("LCFailBioAuth"),
    LC_BANK_APP_AUTH("LCBankAppAuth"),
    LC_BANK_APP_AUTH_GOOD("LCBankAppAuthGood"),
    LC_BANK_APP_AUTH_FAIL("LCBankAppAuthFail"),
    LC_PAY_VIEW_APPEARED("LCPayViewAppeared"),
    LC_PAY_VIEW_DISAPPEARED("LCPayViewDisappeared"),
    LC_PAY_BNPL_AVAILABLE("LCPayBnplAvailable"),
    LC_PAY_BNPL_UNAVAILABLE("LCPayBnplUnavailable"),
    LC_PAY_BNPL_START("LCPayBnplStart"),
    LC_PAY_SPASIBO_START("LCPaySpasiboStart");


    /* renamed from: a, reason: collision with root package name */
    public final String f30393a;

    Xf(String str) {
        this.f30393a = str;
    }

    @Override // Ve.InterfaceC4443me
    public final String a() {
        return this.f30393a;
    }
}
