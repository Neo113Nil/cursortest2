package com.zettle.sdk.feature.taptopay.core.transaction;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionUIEvent;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Companion", "UnknownEvent", "EventCardReadOk", "EnterPin", "CancelPin", "PinBypass", "PinEnterTimeout", "PinEntered"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public enum TransactionUIEvent {
    UnknownEvent(255),
    EventCardReadOk(23),
    EnterPin(65),
    CancelPin(66),
    PinBypass(67),
    PinEnterTimeout(68),
    PinEntered(69);


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.transaction.TransactionUIEvent.Companion INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionUIEvent.Companion(null);
    private final int getHighSpeedVideoFpsRangesFor;

    TransactionUIEvent(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionUIEvent$Companion;", "", "<init>", "()V", "", "findValue", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionUIEvent;", "from", "(I)Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionUIEvent;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.zettle.sdk.feature.taptopay.core.transaction.TransactionUIEvent from(int findValue) {
            com.zettle.sdk.feature.taptopay.core.transaction.TransactionUIEvent transactionUIEvent;
            com.zettle.sdk.feature.taptopay.core.transaction.TransactionUIEvent[] values = com.zettle.sdk.feature.taptopay.core.transaction.TransactionUIEvent.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    transactionUIEvent = null;
                    break;
                }
                transactionUIEvent = values[i];
                if (transactionUIEvent.getHighSpeedVideoFpsRangesFor == findValue) {
                    break;
                }
                i++;
            }
            return transactionUIEvent == null ? com.zettle.sdk.feature.taptopay.core.transaction.TransactionUIEvent.UnknownEvent : transactionUIEvent;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
