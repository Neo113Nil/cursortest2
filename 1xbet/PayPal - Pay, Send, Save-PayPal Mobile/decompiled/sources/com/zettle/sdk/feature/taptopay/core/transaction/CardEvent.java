package com.zettle.sdk.feature.taptopay.core.transaction;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/CardEvent;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "Companion", "UnknownCardEvent", "NfcUnexpectedError", "CardTapped", "CardReadError", "CardReadTimeout", "CardReadDuplicate"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public enum CardEvent {
    UnknownCardEvent(-1000),
    NfcUnexpectedError(-1),
    CardTapped(0),
    CardReadError(1),
    CardReadTimeout(2),
    CardReadDuplicate(3);


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.transaction.CardEvent.Companion INSTANCE = new com.zettle.sdk.feature.taptopay.core.transaction.CardEvent.Companion(null);

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    CardEvent(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/CardEvent$Companion;", "", "<init>", "()V", "", "findValue", "Lcom/zettle/sdk/feature/taptopay/core/transaction/CardEvent;", "from", "(I)Lcom/zettle/sdk/feature/taptopay/core/transaction/CardEvent;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.zettle.sdk.feature.taptopay.core.transaction.CardEvent from(int findValue) {
            com.zettle.sdk.feature.taptopay.core.transaction.CardEvent cardEvent;
            com.zettle.sdk.feature.taptopay.core.transaction.CardEvent[] values = com.zettle.sdk.feature.taptopay.core.transaction.CardEvent.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    cardEvent = null;
                    break;
                }
                cardEvent = values[i];
                if (cardEvent.getHighSpeedVideoSizes == findValue) {
                    break;
                }
                i++;
            }
            return cardEvent == null ? com.zettle.sdk.feature.taptopay.core.transaction.CardEvent.UnknownCardEvent : cardEvent;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
