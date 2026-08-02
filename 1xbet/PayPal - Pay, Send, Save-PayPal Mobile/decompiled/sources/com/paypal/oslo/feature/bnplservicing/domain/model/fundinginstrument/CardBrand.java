package com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b "}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/CardBrand;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "displayName", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "Companion", "VISA", "MASTER_CARD", "AMEX", "DISCOVER", "DINERS", "JCB", "MAESTRO", "CHINA_UNION_PAY", "ELECTRON", "ELO", "HIPER", "HIPERCARD", "RUPAY", "SOLO", "STAR", "SWITCH", "DELTA", "CB_NATIONALE", "CETELEM", "COFIDIS", "COFINOGA", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CardBrand {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand AMEX;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand CB_NATIONALE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand CETELEM;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand CHINA_UNION_PAY;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand COFIDIS;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand COFINOGA;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand DELTA;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand DINERS;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand DISCOVER;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand ELECTRON;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand ELO;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand HIPER;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand HIPERCARD;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand JCB;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand MAESTRO;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand MASTER_CARD;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand RUPAY;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand SOLO;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand STAR;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand SWITCH;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand UNKNOWN;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand VISA;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private final java.lang.String displayName;

    private CardBrand(java.lang.String str, int i, java.lang.String str2) {
        this.displayName = str2;
    }

    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    static {
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand cardBrand = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand("VISA", 0, "Visa");
        VISA = cardBrand;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand cardBrand2 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand("MASTER_CARD", 1, "Mastercard");
        MASTER_CARD = cardBrand2;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand cardBrand3 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand("AMEX", 2, "American Express");
        AMEX = cardBrand3;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand cardBrand4 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand("DISCOVER", 3, "Discover");
        DISCOVER = cardBrand4;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand cardBrand5 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand("DINERS", 4, "Diners Club");
        DINERS = cardBrand5;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand cardBrand6 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand("JCB", 5, "JCB");
        JCB = cardBrand6;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand cardBrand7 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand("MAESTRO", 6, "Maestro");
        MAESTRO = cardBrand7;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand cardBrand8 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand("CHINA_UNION_PAY", 7, "China UnionPay");
        CHINA_UNION_PAY = cardBrand8;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand cardBrand9 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand("ELECTRON", 8, "Electron");
        ELECTRON = cardBrand9;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand cardBrand10 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand("ELO", 9, "Elo");
        ELO = cardBrand10;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand cardBrand11 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand("HIPER", 10, "Hiper");
        HIPER = cardBrand11;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand cardBrand12 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand("HIPERCARD", 11, "Hipercard");
        HIPERCARD = cardBrand12;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand cardBrand13 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand("RUPAY", 12, "RuPay");
        RUPAY = cardBrand13;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand cardBrand14 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand("SOLO", 13, "Solo");
        SOLO = cardBrand14;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand cardBrand15 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand("STAR", 14, "Star");
        STAR = cardBrand15;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand cardBrand16 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand("SWITCH", 15, "Switch");
        SWITCH = cardBrand16;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand cardBrand17 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand("DELTA", 16, "Delta");
        DELTA = cardBrand17;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand cardBrand18 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand("CB_NATIONALE", 17, "CB Nationale");
        CB_NATIONALE = cardBrand18;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand cardBrand19 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand("CETELEM", 18, "Cetelem");
        CETELEM = cardBrand19;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand cardBrand20 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand("COFIDIS", 19, "Cofidis");
        COFIDIS = cardBrand20;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand cardBrand21 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand("COFINOGA", 20, "Cofinoga");
        COFINOGA = cardBrand21;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand cardBrand22 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand("UNKNOWN", 21, "Unknown Brand");
        UNKNOWN = cardBrand22;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand[] cardBrandArr = {cardBrand, cardBrand2, cardBrand3, cardBrand4, cardBrand5, cardBrand6, cardBrand7, cardBrand8, cardBrand9, cardBrand10, cardBrand11, cardBrand12, cardBrand13, cardBrand14, cardBrand15, cardBrand16, cardBrand17, cardBrand18, cardBrand19, cardBrand20, cardBrand21, cardBrand22};
        Camera2StreamConfigurationMap = cardBrandArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(cardBrandArr);
        INSTANCE = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/CardBrand$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/CardBrand;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/CardBrand;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand from(java.lang.String value) {
            java.lang.Object obj;
            java.util.Iterator<E> it = com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand cardBrand = (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand) obj;
            return cardBrand == null ? com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand.UNKNOWN : cardBrand;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand[] values() {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardBrand> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
