package Ve;

/* loaded from: classes10.dex */
public enum S implements InterfaceC4443me {
    RQ_IP("RQIp"),
    RQ_GOOD_IP("RQGoodIp"),
    RQ_FAIL_IP("RQFailIp"),
    RS_GOOD_IP("RSGoodIp"),
    RS_FAIL_IP("RSFailIp"),
    RQ_SESSION_ID("RQSessionId"),
    RQ_GOOD_SESSION_ID("RQGoodSessionId"),
    RQ_FAIL_SESSION_ID("RQFailSessionId"),
    RS_GOOD_SESSION_ID("RSGoodSessionId"),
    RS_FAIL_SESSION_ID("RSFailSessionId"),
    RQ_SDK_AUTH("RQSdkAuth"),
    RQ_GOOD_SDK_AUTH("RQGoodSdkAuth"),
    RQ_FAIL_SDK_AUTH("RQFailSdkAuth"),
    RS_GOOD_SDK_AUTH("RSGoodSdkAuth"),
    RS_FAIL_SDK_AUTH("RSFailSdkAuth"),
    RQ_LIST_CARDS("RQListCards"),
    RQ_GOOD_LIST_CARDS("RQGoodListCards"),
    RQ_FAIL_LIST_CARDS("RQFailListCards"),
    RS_GOOD_LIST_CARDS("RSGoodListCards"),
    RS_FAIL_LIST_CARDS("RSFailListCards"),
    RQ_GOOD_SPASIBO_BONUSES("RQGoodOrderSpasiboBonuses"),
    RQ_FAIL_SPASIBO_BONUSES("RQFailOrderSpasiboBonuses"),
    RS_GOOD_SPASIBO_BONUSES("RSGoodOrderSpasiboBonuses"),
    RS_FAIL_SPASIBO_BONUSES("RSFailOrderSpasiboBonuses"),
    RQ_PAYMENT_PLAN_BNPL("RQPaymentPlanBnpl"),
    RQ_GOOD_PAYMENT_PLAN_BNPL("RQGoodPaymentPlanBnpl"),
    RQ_FAIL_PAYMENT_PLAN_BNPL("RQFailPaymentPlanBnpl"),
    RS_GOOD_PAYMENT_PLAN_BNPL("RSGoodPaymentPlanBnpl"),
    RS_FAIL_PAYMENT_PLAN_BNPL("RSFailPaymentPlanBnpl"),
    RQ_CREATE_PAYMENT_PLAN("RQCreatePaymentPlan"),
    RQ_GOOD_CREATE_PAYMENT_PLAN("RQGoodCreatePaymentPlan"),
    RQ_FAIL_CREATE_PAYMENT_PLAN("RQFailCreatePaymentPlan"),
    RS_GOOD_CREATE_PAYMENT_PLAN("RSGoodCreatePaymentPlan"),
    RS_FAIL_CREATE_PAYMENT_PLAN("RSFailCreatePaymentPlan"),
    /* JADX INFO: Fake field, exist only in values array */
    LC_BANK_SDK_AUTH_VIEW_APPEARED("RQBnpl"),
    /* JADX INFO: Fake field, exist only in values array */
    LC_BANK_SDK_AUTH_VIEW_DISAPPEARED("RQGoodBnpl"),
    /* JADX INFO: Fake field, exist only in values array */
    LC_BANK_SDK_AUTH_VIEW_APPEARED("RQFailBnpl"),
    /* JADX INFO: Fake field, exist only in values array */
    LC_BANK_SDK_AUTH_VIEW_DISAPPEARED("RSGoodBnpl"),
    /* JADX INFO: Fake field, exist only in values array */
    LC_BANK_SDK_AUTH_VIEW_APPEARED("RSFailBnpl"),
    ST_GET_GOOD_REFRESH("STGetGoodRefresh"),
    ST_GET_FAIL_REFRESH("STGetFailRefresh"),
    ST_SAVE_REFRESH("STSaveRefresh"),
    /* JADX INFO: Fake field, exist only in values array */
    LC_BANK_SDK_AUTH_VIEW_APPEARED("LCBankSdkAuthViewAppeared"),
    /* JADX INFO: Fake field, exist only in values array */
    LC_BANK_SDK_AUTH_VIEW_DISAPPEARED("LCBankSdkAuthViewDisappeared"),
    LC_BANK_APP_SDK_AUTH("LCBankAppSdkAuth"),
    LC_BANK_APP_SDK_AUTH_GOOD("LCBankAppSdkAuthGood"),
    LC_BANK_APP_SDK_AUTH_FAIL("LCBankAppSdkAuthFail"),
    WV_CHECK_SERVER_TRUSTED("WVCheckServerTrusted"),
    WV_SSL_EXCEPTION("WVSslException");


    /* renamed from: a, reason: collision with root package name */
    public final String f29924a;

    S(String str) {
        this.f29924a = str;
    }

    @Override // Ve.InterfaceC4443me
    public final String a() {
        return this.f29924a;
    }
}
