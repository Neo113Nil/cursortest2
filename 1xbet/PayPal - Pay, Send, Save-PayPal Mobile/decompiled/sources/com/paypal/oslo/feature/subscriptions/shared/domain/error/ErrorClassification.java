package com.paypal.oslo.feature.subscriptions.shared.domain.error;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/ErrorClassification;", "", "<init>", "()V", "", "TYPE_NETWORK", "Ljava/lang/String;", "TYPE_BUSINESS_RULE", "TYPE_GRAPHQL", "TYPE_AUTH", "TYPE_SYSTEM", "SOURCE_API_CALL", "SOURCE_APP_UI", "SOURCE_SDK"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ErrorClassification {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.error.ErrorClassification INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.domain.error.ErrorClassification();
    public static final java.lang.String SOURCE_API_CALL = "api_call";
    public static final java.lang.String SOURCE_APP_UI = "app_ui";
    public static final java.lang.String SOURCE_SDK = "sdk";
    public static final java.lang.String TYPE_AUTH = "auth";
    public static final java.lang.String TYPE_BUSINESS_RULE = "business_rule";
    public static final java.lang.String TYPE_GRAPHQL = "graphql";
    public static final java.lang.String TYPE_NETWORK = "network";
    public static final java.lang.String TYPE_SYSTEM = "system";

    private ErrorClassification() {
    }
}
