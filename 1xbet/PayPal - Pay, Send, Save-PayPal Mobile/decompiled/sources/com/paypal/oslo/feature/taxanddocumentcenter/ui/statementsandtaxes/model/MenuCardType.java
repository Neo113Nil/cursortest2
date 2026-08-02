package com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/model/MenuCardType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "TAX_DOCUMENTS", "FILE_TAXES", "ALL_TRANSACTIONS", "CUSTOM_STATEMENT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MenuCardType {
    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType ALL_TRANSACTIONS;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType CUSTOM_STATEMENT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType FILE_TAXES;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType TAX_DOCUMENTS;
    private static final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private MenuCardType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType menuCardType = new com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType("TAX_DOCUMENTS", 0);
        TAX_DOCUMENTS = menuCardType;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType menuCardType2 = new com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType("FILE_TAXES", 1);
        FILE_TAXES = menuCardType2;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType menuCardType3 = new com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType("ALL_TRANSACTIONS", 2);
        ALL_TRANSACTIONS = menuCardType3;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType menuCardType4 = new com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType("CUSTOM_STATEMENT", 3);
        CUSTOM_STATEMENT = menuCardType4;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType[] menuCardTypeArr = {menuCardType, menuCardType2, menuCardType3, menuCardType4};
        getHighSpeedVideoFpsRanges = menuCardTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(menuCardTypeArr);
        INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/model/MenuCardType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/model/MenuCardType;", "fromString", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/model/MenuCardType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType fromString(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            switch (value.hashCode()) {
                case -2109958317:
                    if (value.equals("ALL_TRANSACTIONS")) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType.ALL_TRANSACTIONS;
                    }
                    break;
                case -749020938:
                    if (value.equals("FILE_TAXES")) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType.FILE_TAXES;
                    }
                    break;
                case -347279644:
                    if (value.equals("TAX_DOCUMENTS")) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType.TAX_DOCUMENTS;
                    }
                    break;
                case 1452923393:
                    if (value.equals("CUSTOM_STATEMENT")) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType.CUSTOM_STATEMENT;
                    }
                    break;
            }
            throw new java.lang.IllegalArgumentException("Unknown cardType: ".concat(java.lang.String.valueOf(value)));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType[] values() {
        return (com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType) java.lang.Enum.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
