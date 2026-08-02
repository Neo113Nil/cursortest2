package com.paypal.oslo.feature.wallet.me.domain;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\rR\u0014\u0010\u0006\u001a\u00020\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u0004\u0018\u00018\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/Product;", "T", "", "Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;", "getType", "()Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;", "type", "", "isEnrolled", "()Z", "getData", "()Ljava/lang/Object;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface Product<T> {
    T getData();

    com.paypal.oslo.feature.wallet.me.domain.Product.Type getType();

    boolean isEnrolled();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;", "", "<init>", "(Ljava/lang/String;I)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "asCreditProductId", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "BUY_NOW_PAY_LATER", "CREDIT_SMART_CONNECT", "CREDIT_UK", "CREDIT_US", "CREDIT_US_CASHBACK_MASTERCARD", "CREDIT_US_EBAY_MASTERCARD", "CREDIT_US_EXTRAS_MASTERCARD", "CREDIT_US_MASTERCARD", com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, "DEBIT_INSTRUMENTS", "LINKED_3P_LOYALTY", "LINKED_BANKS", "LINKED_CARDS", "MONEY_POOLS", "PAYMENT_PREFERENCES", "PYUSD", "REWARDS", "SAVINGS", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Type {
        public static final com.paypal.oslo.feature.wallet.me.domain.Product.Type BALANCE;
        public static final com.paypal.oslo.feature.wallet.me.domain.Product.Type BUY_NOW_PAY_LATER;
        public static final com.paypal.oslo.feature.wallet.me.domain.Product.Type CREDIT_SMART_CONNECT;
        public static final com.paypal.oslo.feature.wallet.me.domain.Product.Type CREDIT_UK;
        public static final com.paypal.oslo.feature.wallet.me.domain.Product.Type CREDIT_US;
        public static final com.paypal.oslo.feature.wallet.me.domain.Product.Type CREDIT_US_CASHBACK_MASTERCARD;
        public static final com.paypal.oslo.feature.wallet.me.domain.Product.Type CREDIT_US_EBAY_MASTERCARD;
        public static final com.paypal.oslo.feature.wallet.me.domain.Product.Type CREDIT_US_EXTRAS_MASTERCARD;
        public static final com.paypal.oslo.feature.wallet.me.domain.Product.Type CREDIT_US_MASTERCARD;
        public static final com.paypal.oslo.feature.wallet.me.domain.Product.Type CRYPTO;
        private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
        public static final com.paypal.oslo.feature.wallet.me.domain.Product.Type DEBIT_INSTRUMENTS;
        public static final com.paypal.oslo.feature.wallet.me.domain.Product.Type LINKED_3P_LOYALTY;
        public static final com.paypal.oslo.feature.wallet.me.domain.Product.Type LINKED_BANKS;
        public static final com.paypal.oslo.feature.wallet.me.domain.Product.Type LINKED_CARDS;
        public static final com.paypal.oslo.feature.wallet.me.domain.Product.Type MONEY_POOLS;
        public static final com.paypal.oslo.feature.wallet.me.domain.Product.Type PAYMENT_PREFERENCES;
        public static final com.paypal.oslo.feature.wallet.me.domain.Product.Type PYUSD;
        public static final com.paypal.oslo.feature.wallet.me.domain.Product.Type REWARDS;
        public static final com.paypal.oslo.feature.wallet.me.domain.Product.Type SAVINGS;
        public static final com.paypal.oslo.feature.wallet.me.domain.Product.Type UNKNOWN;
        private static final /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.Product.Type[] getHighSpeedVideoFpsRangesFor;

        private Type(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.wallet.me.domain.Product.Type type = new com.paypal.oslo.feature.wallet.me.domain.Product.Type(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, 0);
            BALANCE = type;
            com.paypal.oslo.feature.wallet.me.domain.Product.Type type2 = new com.paypal.oslo.feature.wallet.me.domain.Product.Type("BUY_NOW_PAY_LATER", 1);
            BUY_NOW_PAY_LATER = type2;
            com.paypal.oslo.feature.wallet.me.domain.Product.Type type3 = new com.paypal.oslo.feature.wallet.me.domain.Product.Type("CREDIT_SMART_CONNECT", 2);
            CREDIT_SMART_CONNECT = type3;
            com.paypal.oslo.feature.wallet.me.domain.Product.Type type4 = new com.paypal.oslo.feature.wallet.me.domain.Product.Type("CREDIT_UK", 3);
            CREDIT_UK = type4;
            com.paypal.oslo.feature.wallet.me.domain.Product.Type type5 = new com.paypal.oslo.feature.wallet.me.domain.Product.Type("CREDIT_US", 4);
            CREDIT_US = type5;
            com.paypal.oslo.feature.wallet.me.domain.Product.Type type6 = new com.paypal.oslo.feature.wallet.me.domain.Product.Type("CREDIT_US_CASHBACK_MASTERCARD", 5);
            CREDIT_US_CASHBACK_MASTERCARD = type6;
            com.paypal.oslo.feature.wallet.me.domain.Product.Type type7 = new com.paypal.oslo.feature.wallet.me.domain.Product.Type("CREDIT_US_EBAY_MASTERCARD", 6);
            CREDIT_US_EBAY_MASTERCARD = type7;
            com.paypal.oslo.feature.wallet.me.domain.Product.Type type8 = new com.paypal.oslo.feature.wallet.me.domain.Product.Type("CREDIT_US_EXTRAS_MASTERCARD", 7);
            CREDIT_US_EXTRAS_MASTERCARD = type8;
            com.paypal.oslo.feature.wallet.me.domain.Product.Type type9 = new com.paypal.oslo.feature.wallet.me.domain.Product.Type("CREDIT_US_MASTERCARD", 8);
            CREDIT_US_MASTERCARD = type9;
            com.paypal.oslo.feature.wallet.me.domain.Product.Type type10 = new com.paypal.oslo.feature.wallet.me.domain.Product.Type(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO, 9);
            CRYPTO = type10;
            com.paypal.oslo.feature.wallet.me.domain.Product.Type type11 = new com.paypal.oslo.feature.wallet.me.domain.Product.Type("DEBIT_INSTRUMENTS", 10);
            DEBIT_INSTRUMENTS = type11;
            com.paypal.oslo.feature.wallet.me.domain.Product.Type type12 = new com.paypal.oslo.feature.wallet.me.domain.Product.Type("LINKED_3P_LOYALTY", 11);
            LINKED_3P_LOYALTY = type12;
            com.paypal.oslo.feature.wallet.me.domain.Product.Type type13 = new com.paypal.oslo.feature.wallet.me.domain.Product.Type("LINKED_BANKS", 12);
            LINKED_BANKS = type13;
            com.paypal.oslo.feature.wallet.me.domain.Product.Type type14 = new com.paypal.oslo.feature.wallet.me.domain.Product.Type("LINKED_CARDS", 13);
            LINKED_CARDS = type14;
            com.paypal.oslo.feature.wallet.me.domain.Product.Type type15 = new com.paypal.oslo.feature.wallet.me.domain.Product.Type("MONEY_POOLS", 14);
            MONEY_POOLS = type15;
            com.paypal.oslo.feature.wallet.me.domain.Product.Type type16 = new com.paypal.oslo.feature.wallet.me.domain.Product.Type("PAYMENT_PREFERENCES", 15);
            PAYMENT_PREFERENCES = type16;
            com.paypal.oslo.feature.wallet.me.domain.Product.Type type17 = new com.paypal.oslo.feature.wallet.me.domain.Product.Type("PYUSD", 16);
            PYUSD = type17;
            com.paypal.oslo.feature.wallet.me.domain.Product.Type type18 = new com.paypal.oslo.feature.wallet.me.domain.Product.Type("REWARDS", 17);
            REWARDS = type18;
            com.paypal.oslo.feature.wallet.me.domain.Product.Type type19 = new com.paypal.oslo.feature.wallet.me.domain.Product.Type("SAVINGS", 18);
            SAVINGS = type19;
            com.paypal.oslo.feature.wallet.me.domain.Product.Type type20 = new com.paypal.oslo.feature.wallet.me.domain.Product.Type("UNKNOWN", 19);
            UNKNOWN = type20;
            com.paypal.oslo.feature.wallet.me.domain.Product.Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18, type19, type20};
            getHighSpeedVideoFpsRangesFor = typeArr;
            Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(typeArr);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier asCreditProductId() {
            switch (com.paypal.oslo.feature.wallet.me.domain.Product.Type.WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                    return com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.SYF_US_SMTCNCT;
                case 2:
                    return com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PP_UK_PPC;
                case 3:
                    return com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PPC_US_V2;
                case 4:
                    return com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US;
                case 5:
                    return com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.SYF_US_EBAYMC;
                case 6:
                    return com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.SYF_US_PPMC;
                case 7:
                    return com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PAYPAL_CREDIT_CARD_US;
                default:
                    return com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.UNKNOWN;
            }
        }

        public static com.paypal.oslo.feature.wallet.me.domain.Product.Type[] values() {
            return (com.paypal.oslo.feature.wallet.me.domain.Product.Type[]) getHighSpeedVideoFpsRangesFor.clone();
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.paypal.oslo.feature.wallet.me.domain.Product.Type.values().length];
                try {
                    iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_SMART_CONNECT.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_UK.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_US.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_US_CASHBACK_MASTERCARD.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_US_EBAY_MASTERCARD.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_US_EXTRAS_MASTERCARD.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                try {
                    iArr[com.paypal.oslo.feature.wallet.me.domain.Product.Type.CREDIT_US_MASTERCARD.ordinal()] = 7;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static com.paypal.oslo.feature.wallet.me.domain.Product.Type valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.wallet.me.domain.Product.Type) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.me.domain.Product.Type.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.me.domain.Product.Type> getEntries() {
            return Camera2StreamConfigurationMap;
        }
    }
}
