package com.paypal.oslo.feature.qrc.graphql.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/type/CardBrand;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", "AMEX", "CB_NATIONALE", "CETELEM", "CHINA_UNION_PAY", "COFIDIS", "COFINOGA", "DELTA", "DINERS", "DISCOVER", "ELECTRON", "ELO", "HIPER", "HIPERCARD", "JCB", "MAESTRO", "MASTER_CARD", "RUPAY", "SOLO", "STAR", "SWITCH", "VISA", "UNKNOWN", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardBrand {
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardBrand AMEX;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardBrand CB_NATIONALE;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardBrand CETELEM;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardBrand CHINA_UNION_PAY;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardBrand COFIDIS;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardBrand COFINOGA;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.graphql.type.CardBrand[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardBrand.Companion INSTANCE;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardBrand DELTA;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardBrand DINERS;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardBrand DISCOVER;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardBrand ELECTRON;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardBrand ELO;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardBrand HIPER;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardBrand HIPERCARD;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardBrand JCB;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardBrand MAESTRO;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardBrand MASTER_CARD;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardBrand RUPAY;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardBrand SOLO;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardBrand STAR;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardBrand SWITCH;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardBrand UNKNOWN;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardBrand UNKNOWN__;
    public static final com.paypal.oslo.feature.qrc.graphql.type.CardBrand VISA;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private CardBrand(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.qrc.graphql.type.CardBrand cardBrand = new com.paypal.oslo.feature.qrc.graphql.type.CardBrand("AMEX", 0, "AMEX");
        AMEX = cardBrand;
        com.paypal.oslo.feature.qrc.graphql.type.CardBrand cardBrand2 = new com.paypal.oslo.feature.qrc.graphql.type.CardBrand("CB_NATIONALE", 1, "CB_NATIONALE");
        CB_NATIONALE = cardBrand2;
        com.paypal.oslo.feature.qrc.graphql.type.CardBrand cardBrand3 = new com.paypal.oslo.feature.qrc.graphql.type.CardBrand("CETELEM", 2, "CETELEM");
        CETELEM = cardBrand3;
        com.paypal.oslo.feature.qrc.graphql.type.CardBrand cardBrand4 = new com.paypal.oslo.feature.qrc.graphql.type.CardBrand("CHINA_UNION_PAY", 3, "CHINA_UNION_PAY");
        CHINA_UNION_PAY = cardBrand4;
        com.paypal.oslo.feature.qrc.graphql.type.CardBrand cardBrand5 = new com.paypal.oslo.feature.qrc.graphql.type.CardBrand("COFIDIS", 4, "COFIDIS");
        COFIDIS = cardBrand5;
        com.paypal.oslo.feature.qrc.graphql.type.CardBrand cardBrand6 = new com.paypal.oslo.feature.qrc.graphql.type.CardBrand("COFINOGA", 5, "COFINOGA");
        COFINOGA = cardBrand6;
        com.paypal.oslo.feature.qrc.graphql.type.CardBrand cardBrand7 = new com.paypal.oslo.feature.qrc.graphql.type.CardBrand("DELTA", 6, "DELTA");
        DELTA = cardBrand7;
        com.paypal.oslo.feature.qrc.graphql.type.CardBrand cardBrand8 = new com.paypal.oslo.feature.qrc.graphql.type.CardBrand("DINERS", 7, "DINERS");
        DINERS = cardBrand8;
        com.paypal.oslo.feature.qrc.graphql.type.CardBrand cardBrand9 = new com.paypal.oslo.feature.qrc.graphql.type.CardBrand("DISCOVER", 8, "DISCOVER");
        DISCOVER = cardBrand9;
        com.paypal.oslo.feature.qrc.graphql.type.CardBrand cardBrand10 = new com.paypal.oslo.feature.qrc.graphql.type.CardBrand("ELECTRON", 9, "ELECTRON");
        ELECTRON = cardBrand10;
        com.paypal.oslo.feature.qrc.graphql.type.CardBrand cardBrand11 = new com.paypal.oslo.feature.qrc.graphql.type.CardBrand("ELO", 10, "ELO");
        ELO = cardBrand11;
        com.paypal.oslo.feature.qrc.graphql.type.CardBrand cardBrand12 = new com.paypal.oslo.feature.qrc.graphql.type.CardBrand("HIPER", 11, "HIPER");
        HIPER = cardBrand12;
        com.paypal.oslo.feature.qrc.graphql.type.CardBrand cardBrand13 = new com.paypal.oslo.feature.qrc.graphql.type.CardBrand("HIPERCARD", 12, "HIPERCARD");
        HIPERCARD = cardBrand13;
        com.paypal.oslo.feature.qrc.graphql.type.CardBrand cardBrand14 = new com.paypal.oslo.feature.qrc.graphql.type.CardBrand("JCB", 13, "JCB");
        JCB = cardBrand14;
        com.paypal.oslo.feature.qrc.graphql.type.CardBrand cardBrand15 = new com.paypal.oslo.feature.qrc.graphql.type.CardBrand("MAESTRO", 14, "MAESTRO");
        MAESTRO = cardBrand15;
        com.paypal.oslo.feature.qrc.graphql.type.CardBrand cardBrand16 = new com.paypal.oslo.feature.qrc.graphql.type.CardBrand("MASTER_CARD", 15, "MASTER_CARD");
        MASTER_CARD = cardBrand16;
        com.paypal.oslo.feature.qrc.graphql.type.CardBrand cardBrand17 = new com.paypal.oslo.feature.qrc.graphql.type.CardBrand("RUPAY", 16, "RUPAY");
        RUPAY = cardBrand17;
        com.paypal.oslo.feature.qrc.graphql.type.CardBrand cardBrand18 = new com.paypal.oslo.feature.qrc.graphql.type.CardBrand("SOLO", 17, "SOLO");
        SOLO = cardBrand18;
        com.paypal.oslo.feature.qrc.graphql.type.CardBrand cardBrand19 = new com.paypal.oslo.feature.qrc.graphql.type.CardBrand("STAR", 18, "STAR");
        STAR = cardBrand19;
        com.paypal.oslo.feature.qrc.graphql.type.CardBrand cardBrand20 = new com.paypal.oslo.feature.qrc.graphql.type.CardBrand("SWITCH", 19, "SWITCH");
        SWITCH = cardBrand20;
        com.paypal.oslo.feature.qrc.graphql.type.CardBrand cardBrand21 = new com.paypal.oslo.feature.qrc.graphql.type.CardBrand("VISA", 20, "VISA");
        VISA = cardBrand21;
        com.paypal.oslo.feature.qrc.graphql.type.CardBrand cardBrand22 = new com.paypal.oslo.feature.qrc.graphql.type.CardBrand("UNKNOWN", 21, "UNKNOWN");
        UNKNOWN = cardBrand22;
        com.paypal.oslo.feature.qrc.graphql.type.CardBrand cardBrand23 = new com.paypal.oslo.feature.qrc.graphql.type.CardBrand("UNKNOWN__", 22, "UNKNOWN__");
        UNKNOWN__ = cardBrand23;
        com.paypal.oslo.feature.qrc.graphql.type.CardBrand[] cardBrandArr = {cardBrand, cardBrand2, cardBrand3, cardBrand4, cardBrand5, cardBrand6, cardBrand7, cardBrand8, cardBrand9, cardBrand10, cardBrand11, cardBrand12, cardBrand13, cardBrand14, cardBrand15, cardBrand16, cardBrand17, cardBrand18, cardBrand19, cardBrand20, cardBrand21, cardBrand22, cardBrand23};
        Camera2StreamConfigurationMap = cardBrandArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(cardBrandArr);
        INSTANCE = new com.paypal.oslo.feature.qrc.graphql.type.CardBrand.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("CardBrand", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"AMEX", "CB_NATIONALE", "CETELEM", "CHINA_UNION_PAY", "COFIDIS", "COFINOGA", "DELTA", "DINERS", "DISCOVER", "ELECTRON", "ELO", "HIPER", "HIPERCARD", "JCB", "MAESTRO", "MASTER_CARD", "RUPAY", "SOLO", "STAR", "SWITCH", "VISA", "UNKNOWN"}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/type/CardBrand$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/qrc/graphql/type/CardBrand;", "knownValues", "()[Lcom/paypal/oslo/feature/qrc/graphql/type/CardBrand;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/graphql/type/CardBrand;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.feature.qrc.graphql.type.CardBrand.type;
        }

        public final java.util.List<com.paypal.oslo.feature.qrc.graphql.type.CardBrand> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.qrc.graphql.type.CardBrand[]{com.paypal.oslo.feature.qrc.graphql.type.CardBrand.AMEX, com.paypal.oslo.feature.qrc.graphql.type.CardBrand.CB_NATIONALE, com.paypal.oslo.feature.qrc.graphql.type.CardBrand.CETELEM, com.paypal.oslo.feature.qrc.graphql.type.CardBrand.CHINA_UNION_PAY, com.paypal.oslo.feature.qrc.graphql.type.CardBrand.COFIDIS, com.paypal.oslo.feature.qrc.graphql.type.CardBrand.COFINOGA, com.paypal.oslo.feature.qrc.graphql.type.CardBrand.DELTA, com.paypal.oslo.feature.qrc.graphql.type.CardBrand.DINERS, com.paypal.oslo.feature.qrc.graphql.type.CardBrand.DISCOVER, com.paypal.oslo.feature.qrc.graphql.type.CardBrand.ELECTRON, com.paypal.oslo.feature.qrc.graphql.type.CardBrand.ELO, com.paypal.oslo.feature.qrc.graphql.type.CardBrand.HIPER, com.paypal.oslo.feature.qrc.graphql.type.CardBrand.HIPERCARD, com.paypal.oslo.feature.qrc.graphql.type.CardBrand.JCB, com.paypal.oslo.feature.qrc.graphql.type.CardBrand.MAESTRO, com.paypal.oslo.feature.qrc.graphql.type.CardBrand.MASTER_CARD, com.paypal.oslo.feature.qrc.graphql.type.CardBrand.RUPAY, com.paypal.oslo.feature.qrc.graphql.type.CardBrand.SOLO, com.paypal.oslo.feature.qrc.graphql.type.CardBrand.STAR, com.paypal.oslo.feature.qrc.graphql.type.CardBrand.SWITCH, com.paypal.oslo.feature.qrc.graphql.type.CardBrand.VISA, com.paypal.oslo.feature.qrc.graphql.type.CardBrand.UNKNOWN});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.feature.qrc.graphql.type.CardBrand[] knownValues() {
            return (com.paypal.oslo.feature.qrc.graphql.type.CardBrand[]) getKnownEntries().toArray(new com.paypal.oslo.feature.qrc.graphql.type.CardBrand[0]);
        }

        public final com.paypal.oslo.feature.qrc.graphql.type.CardBrand safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.qrc.graphql.type.CardBrand.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.qrc.graphql.type.CardBrand) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.feature.qrc.graphql.type.CardBrand cardBrand = (com.paypal.oslo.feature.qrc.graphql.type.CardBrand) obj;
            return cardBrand == null ? com.paypal.oslo.feature.qrc.graphql.type.CardBrand.UNKNOWN__ : cardBrand;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.qrc.graphql.type.CardBrand[] values() {
        return (com.paypal.oslo.feature.qrc.graphql.type.CardBrand[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.qrc.graphql.type.CardBrand valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.graphql.type.CardBrand) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.graphql.type.CardBrand.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.graphql.type.CardBrand> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
