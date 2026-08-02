package com.discover.mpos.sdk.cardreader.config;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/config/TerminalType;", "", "", "emvValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "isOfflineOnly$mpos_sdk_card_reader_offlineRegularRelease", "()Z", "Ljava/lang/String;", "getEmvValue", "()Ljava/lang/String;", "Companion", "ATTENDED_INSTITUTION_ONLINE_ONLY", "ATTENDED_INSTITUTION_OFFLINE_WITH_ONLINE_CAPABILITIES", "ATTENDED_INSTITUTION_OFFLINE_ONLY", "UNATTENDED_INSTITUTION_ONLINE_ONLY", "UNATTENDED_INSTITUTION_OFFLINE_WITH_ONLINE_CAPABILITIES", "UNATTENDED_INSTITUTION_OFFLINE_ONLY", "ATTENDED_MERCHANT_ONLINE_ONLY", "ATTENDED_MERCHANT_OFFLINE_WITH_ONLINE_CAPABILITIES", "ATTENDED_MERCHANT_OFFLINE_ONLY", "UNATTENDED_MERCHANT_ONLINE_ONLY", "UNATTENDED_MERCHANT_OFFLINE_WITH_ONLINE_CAPABILITIES", "UNATTENDED_MERCHANT_OFFLINE_ONLY", "UNATTENDED_CARD_HOLDER_ONLINE_ONLY", "UNATTENDED_CARD_HOLDER_OFFLINE_WITH_ONLINE_CAPABILITIES", "UNATTENDED_CARD_HOLDER_OFFLINE_ONLY", "UNSUPPORTED"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public enum TerminalType {
    ATTENDED_INSTITUTION_ONLINE_ONLY("11"),
    ATTENDED_INSTITUTION_OFFLINE_WITH_ONLINE_CAPABILITIES("12"),
    ATTENDED_INSTITUTION_OFFLINE_ONLY("13"),
    UNATTENDED_INSTITUTION_ONLINE_ONLY("14"),
    UNATTENDED_INSTITUTION_OFFLINE_WITH_ONLINE_CAPABILITIES("15"),
    UNATTENDED_INSTITUTION_OFFLINE_ONLY("16"),
    ATTENDED_MERCHANT_ONLINE_ONLY("21"),
    ATTENDED_MERCHANT_OFFLINE_WITH_ONLINE_CAPABILITIES("22"),
    ATTENDED_MERCHANT_OFFLINE_ONLY("23"),
    UNATTENDED_MERCHANT_ONLINE_ONLY("24"),
    UNATTENDED_MERCHANT_OFFLINE_WITH_ONLINE_CAPABILITIES("25"),
    UNATTENDED_MERCHANT_OFFLINE_ONLY("26"),
    UNATTENDED_CARD_HOLDER_ONLINE_ONLY("34"),
    UNATTENDED_CARD_HOLDER_OFFLINE_WITH_ONLINE_CAPABILITIES("35"),
    UNATTENDED_CARD_HOLDER_OFFLINE_ONLY("36"),
    UNSUPPORTED("");


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.discover.mpos.sdk.cardreader.config.TerminalType.Companion INSTANCE = new com.discover.mpos.sdk.cardreader.config.TerminalType.Companion(null);
    private final java.lang.String emvValue;

    TerminalType(java.lang.String str) {
        this.emvValue = str;
    }

    public final java.lang.String getEmvValue() {
        return this.emvValue;
    }

    public final boolean isOfflineOnly$mpos_sdk_card_reader_offlineRegularRelease() {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.discover.mpos.sdk.cardreader.config.TerminalType[]{ATTENDED_INSTITUTION_OFFLINE_ONLY, ATTENDED_MERCHANT_OFFLINE_ONLY, UNATTENDED_INSTITUTION_OFFLINE_ONLY, UNATTENDED_MERCHANT_OFFLINE_ONLY, UNATTENDED_CARD_HOLDER_OFFLINE_ONLY}).contains(this);
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/config/TerminalType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/discover/mpos/sdk/cardreader/config/TerminalType;", "getEnumByValue", "(Ljava/lang/String;)Lcom/discover/mpos/sdk/cardreader/config/TerminalType;"}, k = 1, mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.discover.mpos.sdk.cardreader.config.TerminalType getEnumByValue(java.lang.String value) {
            com.discover.mpos.sdk.cardreader.config.TerminalType terminalType;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            com.discover.mpos.sdk.cardreader.config.TerminalType[] values = com.discover.mpos.sdk.cardreader.config.TerminalType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    terminalType = null;
                    break;
                }
                terminalType = values[i];
                if (kotlin.jvm.internal.Intrinsics.areEqual(terminalType.getEmvValue(), value)) {
                    break;
                }
                i++;
            }
            return terminalType == null ? com.discover.mpos.sdk.cardreader.config.TerminalType.UNSUPPORTED : terminalType;
        }
    }
}
