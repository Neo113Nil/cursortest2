package com.paypal.oslo.feature.inappcheckout.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/LatencyEvents;", "", "<init>", "()V", "", "BRAINTREE_APP_SWITCH", "Ljava/lang/String;", "APP_SWITCH_RECEIVED", "INITIATED_AUTHENTICATION", "FINISHED_AUTHENTICATION", "FINISHED_RECEIVING_TOKEN_DETAILS", "FINISHED_INITIAL_WEB_PRESENTATION", "FINISHED_WEB_RYP_PAGE_RENDER"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LatencyEvents {
    public static final int $stable = 0;
    public static final java.lang.String APP_SWITCH_RECEIVED = "App_switch_App_Redirection";
    public static final java.lang.String BRAINTREE_APP_SWITCH = "braintree_triggered_appswitch";
    public static final java.lang.String FINISHED_AUTHENTICATION = "App_switch_Identity_Authentication";
    public static final java.lang.String FINISHED_INITIAL_WEB_PRESENTATION = "App_Switch_Initial_Web_Launch_Complete";
    public static final java.lang.String FINISHED_RECEIVING_TOKEN_DETAILS = "App_switch_get_BA_details";
    public static final java.lang.String FINISHED_WEB_RYP_PAGE_RENDER = "App_Switch_Web_Launch_Render_Complete";
    public static final java.lang.String INITIATED_AUTHENTICATION = "App_switch_Identity_Authentication_Started";
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.LatencyEvents INSTANCE = new com.paypal.oslo.feature.inappcheckout.domain.model.LatencyEvents();

    private LatencyEvents() {
    }
}
