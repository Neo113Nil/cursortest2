package com.paypal.oslo.feature.wallet.cards.domain.add.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b "}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "p0", "<init>", "(Ljava/lang/String;ILcom/paypal/oslo/core/commonui/utils/RefText;)V", "displayName", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getDisplayName", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "Companion", "AMEX", "CB_NATIONALE", "CETELEM", "CHINA_UNION_PAY", "COFIDIS", "COFINOGA", "DELTA", "DINERS", "DISCOVER", "ELECTRON", "ELO", "HIPER", "HIPERCARD", "JCB", "MAESTRO", "MASTERCARD", "RUPAY", "SOLO", "STAR", "SWITCH", "VISA", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CardBrand {
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand AMEX;
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand CB_NATIONALE;
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand CETELEM;
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand CHINA_UNION_PAY;
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand COFIDIS;
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand COFINOGA;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.Companion INSTANCE;
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand DELTA;
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand DINERS;
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand DISCOVER;
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand ELECTRON;
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand ELO;
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand HIPER;
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand HIPERCARD;
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand JCB;
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand MAESTRO;
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand MASTERCARD;
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand RUPAY;
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand SOLO;
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand STAR;
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand SWITCH;
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand UNKNOWN;
    public static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand VISA;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand[] getHighSpeedVideoSizes;
    private final com.paypal.oslo.core.commonui.utils.RefText displayName;

    private CardBrand(java.lang.String str, int i, com.paypal.oslo.core.commonui.utils.RefText refText) {
        this.displayName = refText;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getDisplayName() {
        return this.displayName;
    }

    static {
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand("AMEX", 0, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_brand_amex, new java.lang.Object[0]));
        AMEX = cardBrand;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand2 = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand("CB_NATIONALE", 1, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_brand_cb_nationale, new java.lang.Object[0]));
        CB_NATIONALE = cardBrand2;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand3 = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand("CETELEM", 2, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_brand_cetelem, new java.lang.Object[0]));
        CETELEM = cardBrand3;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand4 = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand("CHINA_UNION_PAY", 3, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_brand_china_union_pay, new java.lang.Object[0]));
        CHINA_UNION_PAY = cardBrand4;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand5 = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand("COFIDIS", 4, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_brand_cofidis, new java.lang.Object[0]));
        COFIDIS = cardBrand5;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand6 = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand("COFINOGA", 5, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_brand_cofinoga, new java.lang.Object[0]));
        COFINOGA = cardBrand6;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand7 = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand("DELTA", 6, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_brand_delta, new java.lang.Object[0]));
        DELTA = cardBrand7;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand8 = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand("DINERS", 7, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_brand_diners, new java.lang.Object[0]));
        DINERS = cardBrand8;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand9 = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand("DISCOVER", 8, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_brand_discover, new java.lang.Object[0]));
        DISCOVER = cardBrand9;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand10 = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand("ELECTRON", 9, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_brand_electron, new java.lang.Object[0]));
        ELECTRON = cardBrand10;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand11 = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand("ELO", 10, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_brand_elo, new java.lang.Object[0]));
        ELO = cardBrand11;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand12 = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand("HIPER", 11, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_brand_hiper, new java.lang.Object[0]));
        HIPER = cardBrand12;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand13 = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand("HIPERCARD", 12, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_brand_hipercard, new java.lang.Object[0]));
        HIPERCARD = cardBrand13;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand14 = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand("JCB", 13, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_brand_jcb, new java.lang.Object[0]));
        JCB = cardBrand14;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand15 = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand("MAESTRO", 14, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_brand_maestro, new java.lang.Object[0]));
        MAESTRO = cardBrand15;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand16 = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand("MASTERCARD", 15, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_brand_mastercard, new java.lang.Object[0]));
        MASTERCARD = cardBrand16;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand17 = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand("RUPAY", 16, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_brand_rupay, new java.lang.Object[0]));
        RUPAY = cardBrand17;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand18 = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand("SOLO", 17, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_brand_solo, new java.lang.Object[0]));
        SOLO = cardBrand18;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand19 = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand("STAR", 18, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_brand_star, new java.lang.Object[0]));
        STAR = cardBrand19;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand20 = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand("SWITCH", 19, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_brand_switch, new java.lang.Object[0]));
        SWITCH = cardBrand20;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand21 = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand("VISA", 20, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_brand_visa, new java.lang.Object[0]));
        VISA = cardBrand21;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand22 = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand("UNKNOWN", 21, com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_unknown, new java.lang.Object[0]));
        UNKNOWN = cardBrand22;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand[] cardBrandArr = {cardBrand, cardBrand2, cardBrand3, cardBrand4, cardBrand5, cardBrand6, cardBrand7, cardBrand8, cardBrand9, cardBrand10, cardBrand11, cardBrand12, cardBrand13, cardBrand14, cardBrand15, cardBrand16, cardBrand17, cardBrand18, cardBrand19, cardBrand20, cardBrand21, cardBrand22};
        getHighSpeedVideoSizes = cardBrandArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(cardBrandArr);
        INSTANCE = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand$Companion;", "", "<init>", "()V", "", "name", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;", "fromName", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand fromName(java.lang.String name2) {
            java.lang.Object obj;
            java.util.Iterator<E> it = com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand) next).name(), name2 != null ? kotlin.text.StringsKt.trim(name2).toString() : null)) {
                    obj = next;
                    break;
                }
            }
            com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand = (com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand) obj;
            return cardBrand == null ? com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.UNKNOWN : cardBrand;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand[] values() {
        return (com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
