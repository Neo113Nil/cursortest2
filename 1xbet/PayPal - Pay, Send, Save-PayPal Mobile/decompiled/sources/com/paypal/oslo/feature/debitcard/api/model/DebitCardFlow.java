package com.paypal.oslo.feature.debitcard.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlow;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "CREATE", "DISPLAY", "ACTIVATE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardFlow {
    public static final com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow ACTIVATE;
    public static final com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow CREATE;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow.Companion INSTANCE;
    public static final com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow DISPLAY;
    public static final com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow[] getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String value;

    private DebitCardFlow(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow debitCardFlow = new com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow("CREATE", 0, "create");
        CREATE = debitCardFlow;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow debitCardFlow2 = new com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow("DISPLAY", 1, com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        DISPLAY = debitCardFlow2;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow debitCardFlow3 = new com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow("ACTIVATE", 2, "activate");
        ACTIVATE = debitCardFlow3;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow debitCardFlow4 = new com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow("UNKNOWN", 3, "unknown");
        UNKNOWN = debitCardFlow4;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow[] debitCardFlowArr = {debitCardFlow, debitCardFlow2, debitCardFlow3, debitCardFlow4};
        getHighResolutionOutputSizeshNQ4ISI = debitCardFlowArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(debitCardFlowArr);
        INSTANCE = new com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlow$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlow;", "fromValue", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow fromValue(java.lang.String value) {
            java.lang.Object obj = null;
            if (value == null) {
                return null;
            }
            java.util.Iterator<E> it = com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow) next).getValue(), value)) {
                    obj = next;
                    break;
                }
            }
            com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow debitCardFlow = (com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow) obj;
            return debitCardFlow == null ? com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow.UNKNOWN : debitCardFlow;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow[] values() {
        return (com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow) java.lang.Enum.valueOf(com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
