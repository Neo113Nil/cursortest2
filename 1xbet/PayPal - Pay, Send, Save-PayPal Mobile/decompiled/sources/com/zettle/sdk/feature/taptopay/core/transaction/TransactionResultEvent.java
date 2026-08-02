package com.zettle.sdk.feature.taptopay.core.transaction;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionResultEvent;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "Companion", "TransactionUnknownResult", "TransactionOfflineApproved", "TransactionSuccessful", com.ingo.sdk.kotlin.common.analytics.IScreenNames.TransactionDeclined, "TransactionFailed", "TransactionNoAppError", "TransactionFailedAllowFallback", "TransactionCardExpired", "TransactionOnlineFail", "TransactionCancel", "TransactionTimeout", "TransactionCardError", "TransactionConfigError", "TransactionSelectNextInterface", "TransactionRequireCDCVM", "TransactionEndApplicationError", "TransactionTryAgain", "TransactionGPODeclined", "TransactionPinNotSupported", "TransactionGPOFailed", "TransactionCardLocked"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public enum TransactionResultEvent {
    TransactionUnknownResult(-1000),
    TransactionOfflineApproved(16),
    TransactionSuccessful(0),
    TransactionDeclined(7004),
    TransactionFailed(7005),
    TransactionNoAppError(7006),
    TransactionFailedAllowFallback(7007),
    TransactionCardExpired(7008),
    TransactionOnlineFail(7020),
    TransactionCancel(7024),
    TransactionTimeout(7028),
    TransactionCardError(7030),
    TransactionConfigError(7052),
    TransactionSelectNextInterface(7053),
    TransactionRequireCDCVM(7054),
    TransactionEndApplicationError(7055),
    TransactionTryAgain(7056),
    TransactionGPODeclined(7057),
    TransactionPinNotSupported(7059),
    TransactionGPOFailed(7501),
    TransactionCardLocked(7502);


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.transaction.TransactionResultEvent.Companion INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionResultEvent.Companion(null);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    TransactionResultEvent(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionResultEvent$Companion;", "", "<init>", "()V", "", "findValue", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionResultEvent;", "from", "(I)Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionResultEvent;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.zettle.sdk.feature.taptopay.core.transaction.TransactionResultEvent from(int findValue) {
            com.zettle.sdk.feature.taptopay.core.transaction.TransactionResultEvent transactionResultEvent;
            com.zettle.sdk.feature.taptopay.core.transaction.TransactionResultEvent[] values = com.zettle.sdk.feature.taptopay.core.transaction.TransactionResultEvent.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    transactionResultEvent = null;
                    break;
                }
                transactionResultEvent = values[i];
                if (transactionResultEvent.Camera2StreamConfigurationMap == findValue) {
                    break;
                }
                i++;
            }
            return transactionResultEvent == null ? com.zettle.sdk.feature.taptopay.core.transaction.TransactionResultEvent.TransactionUnknownResult : transactionResultEvent;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
