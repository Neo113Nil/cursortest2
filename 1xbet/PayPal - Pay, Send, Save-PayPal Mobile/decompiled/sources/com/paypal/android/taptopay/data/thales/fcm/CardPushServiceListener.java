package com.paypal.android.taptopay.data.thales.fcm;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/fcm/CardPushServiceListener;", "Lcom/gemalto/mfs/mwsdk/provisioning/listener/PushServiceListener;", "Lcom/paypal/android/taptopay/data/thales/card/CardPushNotificationDataSource;", "cardPushNotificationDataSource", "<init>", "(Lcom/paypal/android/taptopay/data/thales/card/CardPushNotificationDataSource;)V", "", "onComplete", "()V", "Lcom/gemalto/mfs/mwsdk/provisioning/model/ProvisioningServiceError;", "error", "onError", "(Lcom/gemalto/mfs/mwsdk/provisioning/model/ProvisioningServiceError;)V", "", "tokenizedCardId", "Lcom/gemalto/mfs/mwsdk/provisioning/model/ProvisioningServiceMessage;", "message", "onServerMessage", "(Ljava/lang/String;Lcom/gemalto/mfs/mwsdk/provisioning/model/ProvisioningServiceMessage;)V", "Landroid/os/Bundle;", "bundle", "onUnsupportedPushContent", "(Landroid/os/Bundle;)V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/android/taptopay/data/thales/card/CardPushNotificationDataSource;", "getHighSpeedVideoSizes", "Ljava/util/Stack;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Stack;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CardPushServiceListener implements com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.data.thales.card.CardPushNotificationDataSource getHighSpeedVideoSizes;
    private final java.util.Stack<java.lang.String> getHighSpeedVideoFpsRangesFor;

    public CardPushServiceListener(com.paypal.android.taptopay.data.thales.card.CardPushNotificationDataSource cardPushNotificationDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardPushNotificationDataSource, "");
        this.getHighSpeedVideoSizes = cardPushNotificationDataSource;
        this.getHighSpeedVideoFpsRangesFor = new java.util.Stack<>();
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
    public final void onError(com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceError error) {
        com.paypal.android.logger.LogLevel logLevel;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes sdkErrorCode = error.getSdkErrorCode();
        int i = sdkErrorCode == null ? -1 : com.paypal.android.taptopay.data.thales.fcm.CardPushServiceListener.WhenMappings.$EnumSwitchMapping$0[sdkErrorCode.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            logLevel = com.paypal.android.logger.LogLevel.WARN;
        } else {
            logLevel = com.paypal.android.logger.LogLevel.ERROR;
        }
        java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", error.getErrorMessage()), kotlin.TuplesKt.to("cpsErrorCode", java.lang.Integer.valueOf(error.getCpsErrorCode())), kotlin.TuplesKt.to("sdkErrorCode", error.getSdkErrorCode().name()));
        if (com.paypal.android.logger.LogLevel.ERROR == logLevel) {
            com.paypal.android.logger.Logger.e$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "PushServiceListener onError", mapOf, null, error.getCausingException(), 4, null);
        } else {
            com.paypal.android.logger.Logger.w$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "PushServiceListener onError", mapOf, null, 4, null);
        }
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
    public final void onUnsupportedPushContent(android.os.Bundle bundle) {
        com.paypal.android.logger.Logger.e$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "onUnsupportedPushContent", null, null, null, 14, null);
    }

    @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
    public final void onServerMessage(java.lang.String tokenizedCardId, com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceMessage message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Received card provisioning service message", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("tokenizedCardId", tokenizedCardId), kotlin.TuplesKt.to("msgCode", message.getMsgCode()), kotlin.TuplesKt.to("msgSeverity", message.getMsgSeverity()), kotlin.TuplesKt.to("msgText", message.getMsgText()), kotlin.TuplesKt.to("msgParams", message.getMsgParams())), null, 4, null);
        this.getHighResolutionOutputSizeshNQ4ISI = tokenizedCardId;
        java.lang.String msgCode = message.getMsgCode();
        if (msgCode != null) {
            switch (msgCode.hashCode()) {
                case 572788758:
                    if (!msgCode.equals(com.gemalto.mfs.mwsdk.provisioning.model.KnownMessageCode.REQUEST_RENEW_CARD)) {
                        return;
                    }
                    break;
                case 577873409:
                    if (!msgCode.equals(com.gemalto.mfs.mwsdk.provisioning.model.KnownMessageCode.REQUEST_RESUME_CARD)) {
                        return;
                    }
                    break;
                case 1030789187:
                    if (!msgCode.equals(com.gemalto.mfs.mwsdk.provisioning.model.KnownMessageCode.REQUEST_DELETE_CARD)) {
                        return;
                    }
                    break;
                case 1052968798:
                    if (!msgCode.equals(com.gemalto.mfs.mwsdk.provisioning.model.KnownMessageCode.REQUEST_INSTALL_CARD)) {
                        return;
                    }
                    break;
                case 1443009413:
                    if (!msgCode.equals(com.gemalto.mfs.mwsdk.provisioning.model.KnownMessageCode.REQUEST_SUSPEND_CARD)) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            this.getHighSpeedVideoFpsRangesFor.push(message.getMsgCode());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0071 A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:2:0x0000, B:3:0x0020, B:5:0x0026, B:7:0x002f, B:8:0x0033, B:10:0x0037, B:12:0x003f, B:14:0x0071, B:17:0x00a8, B:21:0x0042, B:23:0x004a, B:24:0x004d, B:26:0x0055, B:27:0x0058, B:29:0x0060, B:30:0x0063, B:32:0x006b, B:35:0x00c3), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0020 A[SYNTHETIC] */
    @Override // com.gemalto.mfs.mwsdk.provisioning.listener.PushServiceListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onComplete() {
        com.paypal.android.taptopay.domain.model.card.CardStateChange.Type type;
        try {
            com.paypal.android.logger.Logger.i$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Completed processing of card provisioning service message", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("msgCodes", this.getHighSpeedVideoFpsRangesFor)), null, 4, null);
            for (java.lang.String str : this.getHighSpeedVideoFpsRangesFor) {
                kotlin.Unit unit = null;
                if (str != null) {
                    switch (str.hashCode()) {
                        case 572788758:
                            if (str.equals(com.gemalto.mfs.mwsdk.provisioning.model.KnownMessageCode.REQUEST_RENEW_CARD)) {
                                type = com.paypal.android.taptopay.domain.model.card.CardStateChange.Type.UPDATED;
                                break;
                            }
                            break;
                        case 577873409:
                            if (str.equals(com.gemalto.mfs.mwsdk.provisioning.model.KnownMessageCode.REQUEST_RESUME_CARD)) {
                                type = com.paypal.android.taptopay.domain.model.card.CardStateChange.Type.RESUMED;
                                break;
                            }
                            break;
                        case 1030789187:
                            if (str.equals(com.gemalto.mfs.mwsdk.provisioning.model.KnownMessageCode.REQUEST_DELETE_CARD)) {
                                type = com.paypal.android.taptopay.domain.model.card.CardStateChange.Type.DELETED;
                                break;
                            }
                            break;
                        case 1052968798:
                            if (str.equals(com.gemalto.mfs.mwsdk.provisioning.model.KnownMessageCode.REQUEST_INSTALL_CARD)) {
                                type = com.paypal.android.taptopay.domain.model.card.CardStateChange.Type.PROVISIONED;
                                break;
                            }
                            break;
                        case 1443009413:
                            if (str.equals(com.gemalto.mfs.mwsdk.provisioning.model.KnownMessageCode.REQUEST_SUSPEND_CARD)) {
                                type = com.paypal.android.taptopay.domain.model.card.CardStateChange.Type.SUSPENDED;
                                break;
                            }
                            break;
                    }
                    if (type != null) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "Notify data source", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("changeType", type), kotlin.TuplesKt.to("cardId", this.getHighResolutionOutputSizeshNQ4ISI)), null, 4, null);
                        this.getHighSpeedVideoSizes.notify(new com.paypal.android.taptopay.data.thales.fcm.model.CardPushNotification(type, this.getHighResolutionOutputSizeshNQ4ISI));
                        unit = kotlin.Unit.INSTANCE;
                    }
                    if (unit != null) {
                        com.paypal.android.taptopay.data.thales.fcm.CardPushServiceListener cardPushServiceListener = this;
                        com.paypal.android.logger.Logger.d$default(com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog(), "changeType not mapped", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("msgCode", str)), null, 4, null);
                    }
                }
                type = null;
                if (type != null) {
                }
                if (unit != null) {
                }
            }
            this.getHighSpeedVideoFpsRangesFor.clear();
        } catch (java.lang.Throwable th) {
            com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog().e("Failed processing of card provisioning service message completion", th);
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.values().length];
            try {
                iArr[com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_NO_INTERNET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_COMM_ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.gemalto.mfs.mwsdk.provisioning.model.ProvisioningServiceErrorCodes.COMMON_COMM_TIMEOUT_ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
