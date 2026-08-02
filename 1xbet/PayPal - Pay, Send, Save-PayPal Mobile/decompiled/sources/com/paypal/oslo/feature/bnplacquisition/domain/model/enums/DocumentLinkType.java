package com.paypal.oslo.feature.bnplacquisition.domain.model.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/DocumentLinkType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "RELATIVE_PATH", "STATIC_HTML", "STATIC_PDF", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DocumentLinkType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType RELATIVE_PATH;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType STATIC_HTML;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType STATIC_PDF;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private DocumentLinkType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType documentLinkType = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType("RELATIVE_PATH", 0);
        RELATIVE_PATH = documentLinkType;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType documentLinkType2 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType("STATIC_HTML", 1);
        STATIC_HTML = documentLinkType2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType documentLinkType3 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType("STATIC_PDF", 2);
        STATIC_PDF = documentLinkType3;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType documentLinkType4 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType("UNKNOWN", 3);
        UNKNOWN = documentLinkType4;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType[] documentLinkTypeArr = {documentLinkType, documentLinkType2, documentLinkType3, documentLinkType4};
        getHighResolutionOutputSizeshNQ4ISI = documentLinkTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(documentLinkTypeArr);
        INSTANCE = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/DocumentLinkType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/DocumentLinkType;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/DocumentLinkType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType from(java.lang.String value) {
            java.lang.Object obj;
            java.util.Iterator<E> it = com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType documentLinkType = (com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType) obj;
            return documentLinkType == null ? com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType.UNKNOWN : documentLinkType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType[] values() {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplacquisition.domain.model.enums.DocumentLinkType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
