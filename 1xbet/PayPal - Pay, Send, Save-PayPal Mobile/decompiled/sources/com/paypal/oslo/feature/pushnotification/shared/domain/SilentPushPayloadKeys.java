package com.paypal.oslo.feature.pushnotification.shared.domain;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/shared/domain/SilentPushPayloadKeys;", "", "<init>", "()V", "", "PREFIX", "Ljava/lang/String;", "TARGET_MODULE", "CAMPAIGN_ID", "MESSAGE_ID", "MESSAGE_NAME", "ENCRYPTED_CUSTOMER_ID", "MIN_APP_VERSION", "UNP_TID", "SENT_TIMESTAMP"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SilentPushPayloadKeys {
    public static final int $stable = 0;
    public static final java.lang.String CAMPAIGN_ID = "cmpn_id";
    public static final java.lang.String ENCRYPTED_CUSTOMER_ID = "encr_cust_id";
    public static final com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys INSTANCE = new com.paypal.oslo.feature.pushnotification.shared.domain.SilentPushPayloadKeys();
    public static final java.lang.String MESSAGE_ID = "msg_id";
    public static final java.lang.String MESSAGE_NAME = "msg_name";
    public static final java.lang.String MIN_APP_VERSION = "min_app_ver";
    public static final java.lang.String PREFIX = "SP.";
    public static final java.lang.String SENT_TIMESTAMP = "sent_ts";
    public static final java.lang.String TARGET_MODULE = "target_module";
    public static final java.lang.String UNP_TID = "unp_tid";

    private SilentPushPayloadKeys() {
    }
}
