package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0080\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/legacyservicing/ServicingRedirectUrlKey;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "keyString", "Ljava/lang/String;", "getKeyString", "()Ljava/lang/String;", "Companion", "PAYMENTS_ONE_TIME", "PAYMENTS_AUTO_PAY", "ACCOUNT_SUMMARY", "ALERTS", "STATEMENTS", "PAYMENTS_HISTORY", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ServicingRedirectUrlKey {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey ACCOUNT_SUMMARY;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey ALERTS;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey.Companion INSTANCE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey PAYMENTS_AUTO_PAY;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey PAYMENTS_HISTORY;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey PAYMENTS_ONE_TIME;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey STATEMENTS;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final java.lang.String keyString;

    private ServicingRedirectUrlKey(java.lang.String str, int i, java.lang.String str2) {
        this.keyString = str2;
    }

    public final java.lang.String getKeyString() {
        return this.keyString;
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey servicingRedirectUrlKey = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey("PAYMENTS_ONE_TIME", 0, "payments_one_time");
        PAYMENTS_ONE_TIME = servicingRedirectUrlKey;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey servicingRedirectUrlKey2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey("PAYMENTS_AUTO_PAY", 1, "payments_auto_pay");
        PAYMENTS_AUTO_PAY = servicingRedirectUrlKey2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey servicingRedirectUrlKey3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey("ACCOUNT_SUMMARY", 2, "account_summary");
        ACCOUNT_SUMMARY = servicingRedirectUrlKey3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey servicingRedirectUrlKey4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey("ALERTS", 3, "alerts");
        ALERTS = servicingRedirectUrlKey4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey servicingRedirectUrlKey5 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey("STATEMENTS", 4, "statements");
        STATEMENTS = servicingRedirectUrlKey5;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey servicingRedirectUrlKey6 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey("PAYMENTS_HISTORY", 5, "payments_history");
        PAYMENTS_HISTORY = servicingRedirectUrlKey6;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey servicingRedirectUrlKey7 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey("UNKNOWN", 6, "");
        UNKNOWN = servicingRedirectUrlKey7;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey[] servicingRedirectUrlKeyArr = {servicingRedirectUrlKey, servicingRedirectUrlKey2, servicingRedirectUrlKey3, servicingRedirectUrlKey4, servicingRedirectUrlKey5, servicingRedirectUrlKey6, servicingRedirectUrlKey7};
        getHighResolutionOutputSizeshNQ4ISI = servicingRedirectUrlKeyArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(servicingRedirectUrlKeyArr);
        INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/legacyservicing/ServicingRedirectUrlKey$Companion;", "", "<init>", "()V", "", "key", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/legacyservicing/ServicingRedirectUrlKey;", "fromString", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/legacyservicing/ServicingRedirectUrlKey;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey fromString(java.lang.String key) {
            java.lang.Object obj;
            java.util.Iterator<E> it = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey) obj).getKeyString(), key)) {
                    break;
                }
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey servicingRedirectUrlKey = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey) obj;
            return servicingRedirectUrlKey == null ? com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey.UNKNOWN : servicingRedirectUrlKey;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingRedirectUrlKey> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
