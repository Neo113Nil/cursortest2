package com.paypal.oslo.core.companion.domain;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/companion/domain/CompanionIpcConstants;", "", "<init>", "()V", "", "ID_MAIN_APP_PACKAGE", "Ljava/lang/String;", "ID_COMPANION_APP_PACKAGE", "ACTION_LAUNCH_COMPANION", "ACTION_SYNC_CONFIG", "KEY_CONFIG_DATA", "KEY_ERROR", "MessageCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CompanionIpcConstants {
    public static final java.lang.String ACTION_LAUNCH_COMPANION = "com.paypal.oslo.action.LAUNCH_COMPANION";
    public static final java.lang.String ACTION_SYNC_CONFIG = "com.paypal.oslo.action.SYNC_CONFIG";
    public static final java.lang.String ID_COMPANION_APP_PACKAGE = "com.paypal.oslo.companion";
    public static final java.lang.String ID_MAIN_APP_PACKAGE = "com.paypal.android.p2pmobile";
    public static final com.paypal.oslo.core.companion.domain.CompanionIpcConstants INSTANCE = new com.paypal.oslo.core.companion.domain.CompanionIpcConstants();
    public static final java.lang.String KEY_CONFIG_DATA = "config_data";
    public static final java.lang.String KEY_ERROR = "error";

    private CompanionIpcConstants() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/companion/domain/CompanionIpcConstants$MessageCode;", "", "<init>", "()V", "", "GET_CONFIG", com.visa.cbp.getEncExpo.warmup, "GET_CONFIG_RESPONSE", "SYNC_CONFIG", "SYNC_CONFIG_RESPONSE", "ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class MessageCode {
        public static final int ERROR = -1;
        public static final int GET_CONFIG = 1;
        public static final int GET_CONFIG_RESPONSE = 2;
        public static final com.paypal.oslo.core.companion.domain.CompanionIpcConstants.MessageCode INSTANCE = new com.paypal.oslo.core.companion.domain.CompanionIpcConstants.MessageCode();
        public static final int SYNC_CONFIG = 5;
        public static final int SYNC_CONFIG_RESPONSE = 6;

        private MessageCode() {
        }
    }
}
