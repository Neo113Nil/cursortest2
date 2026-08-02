package com.paypal.oslo.feature.helpcenter.ui.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/models/ErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_NOT_FOUND, "NETWORK_ERROR", "GENERIC"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErrorType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.helpcenter.ui.models.ErrorType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.helpcenter.ui.models.ErrorType GENERIC;
    public static final com.paypal.oslo.feature.helpcenter.ui.models.ErrorType NETWORK_ERROR;
    public static final com.paypal.oslo.feature.helpcenter.ui.models.ErrorType NOT_FOUND;
    private static final /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.models.ErrorType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private ErrorType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.helpcenter.ui.models.ErrorType errorType = new com.paypal.oslo.feature.helpcenter.ui.models.ErrorType(com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError.CODE_NOT_FOUND, 0);
        NOT_FOUND = errorType;
        com.paypal.oslo.feature.helpcenter.ui.models.ErrorType errorType2 = new com.paypal.oslo.feature.helpcenter.ui.models.ErrorType("NETWORK_ERROR", 1);
        NETWORK_ERROR = errorType2;
        com.paypal.oslo.feature.helpcenter.ui.models.ErrorType errorType3 = new com.paypal.oslo.feature.helpcenter.ui.models.ErrorType("GENERIC", 2);
        GENERIC = errorType3;
        com.paypal.oslo.feature.helpcenter.ui.models.ErrorType[] errorTypeArr = {errorType, errorType2, errorType3};
        getHighResolutionOutputSizeshNQ4ISI = errorTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(errorTypeArr);
        INSTANCE = new com.paypal.oslo.feature.helpcenter.ui.models.ErrorType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/models/ErrorType$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "callError", "Lcom/paypal/oslo/feature/helpcenter/ui/models/ErrorType;", "from", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/helpcenter/ui/models/ErrorType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.helpcenter.ui.models.ErrorType from(com.paypal.oslo.core.network.graphql.error.CallError callError) {
            if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
                return com.paypal.oslo.feature.helpcenter.ui.models.ErrorType.NETWORK_ERROR;
            }
            if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
                return com.paypal.oslo.feature.helpcenter.ui.models.ErrorType.GENERIC;
            }
            if (callError != null) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return com.paypal.oslo.feature.helpcenter.ui.models.ErrorType.NOT_FOUND;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.helpcenter.ui.models.ErrorType[] values() {
        return (com.paypal.oslo.feature.helpcenter.ui.models.ErrorType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.helpcenter.ui.models.ErrorType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.helpcenter.ui.models.ErrorType) java.lang.Enum.valueOf(com.paypal.oslo.feature.helpcenter.ui.models.ErrorType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.helpcenter.ui.models.ErrorType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
