package com.paypal.oslo.feature.home.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0081\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/model/HomeIcon;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "Trophy", "Information", "Nfc", "Wallet", com.google.common.net.HttpHeaders.WARNING, "Bank", com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD, "PayPal", "Add"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final class HomeIcon {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ com.paypal.oslo.feature.home.domain.model.HomeIcon[] $VALUES;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate;

    @kotlinx.serialization.SerialName(com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD)
    public static final com.paypal.oslo.feature.home.domain.model.HomeIcon Add;

    @kotlinx.serialization.SerialName("bank")
    public static final com.paypal.oslo.feature.home.domain.model.HomeIcon Bank;

    @kotlinx.serialization.SerialName("card")
    public static final com.paypal.oslo.feature.home.domain.model.HomeIcon Card;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.home.domain.model.HomeIcon.Companion INSTANCE;

    @kotlinx.serialization.SerialName("information")
    public static final com.paypal.oslo.feature.home.domain.model.HomeIcon Information;

    @kotlinx.serialization.SerialName("nfc")
    public static final com.paypal.oslo.feature.home.domain.model.HomeIcon Nfc;

    @kotlinx.serialization.SerialName("paypal")
    public static final com.paypal.oslo.feature.home.domain.model.HomeIcon PayPal;

    @kotlinx.serialization.SerialName("trophy")
    public static final com.paypal.oslo.feature.home.domain.model.HomeIcon Trophy;

    @kotlinx.serialization.SerialName(com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET)
    public static final com.paypal.oslo.feature.home.domain.model.HomeIcon Wallet;

    @kotlinx.serialization.SerialName(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ErrorTypes.WARNING)
    public static final com.paypal.oslo.feature.home.domain.model.HomeIcon Warning;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/model/HomeIcon$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/home/domain/model/HomeIcon;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.home.domain.model.HomeIcon> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.home.domain.model.HomeIcon.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private HomeIcon(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.home.domain.model.HomeIcon homeIcon = new com.paypal.oslo.feature.home.domain.model.HomeIcon("Trophy", 0);
        Trophy = homeIcon;
        com.paypal.oslo.feature.home.domain.model.HomeIcon homeIcon2 = new com.paypal.oslo.feature.home.domain.model.HomeIcon("Information", 1);
        Information = homeIcon2;
        com.paypal.oslo.feature.home.domain.model.HomeIcon homeIcon3 = new com.paypal.oslo.feature.home.domain.model.HomeIcon("Nfc", 2);
        Nfc = homeIcon3;
        com.paypal.oslo.feature.home.domain.model.HomeIcon homeIcon4 = new com.paypal.oslo.feature.home.domain.model.HomeIcon("Wallet", 3);
        Wallet = homeIcon4;
        com.paypal.oslo.feature.home.domain.model.HomeIcon homeIcon5 = new com.paypal.oslo.feature.home.domain.model.HomeIcon(com.google.common.net.HttpHeaders.WARNING, 4);
        Warning = homeIcon5;
        com.paypal.oslo.feature.home.domain.model.HomeIcon homeIcon6 = new com.paypal.oslo.feature.home.domain.model.HomeIcon("Bank", 5);
        Bank = homeIcon6;
        com.paypal.oslo.feature.home.domain.model.HomeIcon homeIcon7 = new com.paypal.oslo.feature.home.domain.model.HomeIcon(com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD, 6);
        Card = homeIcon7;
        com.paypal.oslo.feature.home.domain.model.HomeIcon homeIcon8 = new com.paypal.oslo.feature.home.domain.model.HomeIcon("PayPal", 7);
        PayPal = homeIcon8;
        com.paypal.oslo.feature.home.domain.model.HomeIcon homeIcon9 = new com.paypal.oslo.feature.home.domain.model.HomeIcon("Add", 8);
        Add = homeIcon9;
        com.paypal.oslo.feature.home.domain.model.HomeIcon[] homeIconArr = {homeIcon, homeIcon2, homeIcon3, homeIcon4, homeIcon5, homeIcon6, homeIcon7, homeIcon8, homeIcon9};
        $VALUES = homeIconArr;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(homeIconArr);
        INSTANCE = new com.paypal.oslo.feature.home.domain.model.HomeIcon.Companion(null);
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.domain.model.HomeIcon$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer createAnnotatedEnumSerializer;
                createAnnotatedEnumSerializer = kotlinx.serialization.internal.EnumsKt.createAnnotatedEnumSerializer("com.paypal.oslo.feature.home.domain.model.HomeIcon", com.paypal.oslo.feature.home.domain.model.HomeIcon.values(), new java.lang.String[]{"trophy", "information", "nfc", com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET, com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ErrorTypes.WARNING, "bank", "card", "paypal", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD}, new java.lang.annotation.Annotation[][]{null, null, null, null, null, null, null, null, null}, null);
                return createAnnotatedEnumSerializer;
            }
        });
    }

    public static com.paypal.oslo.feature.home.domain.model.HomeIcon[] values() {
        return (com.paypal.oslo.feature.home.domain.model.HomeIcon[]) $VALUES.clone();
    }

    public static com.paypal.oslo.feature.home.domain.model.HomeIcon valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.home.domain.model.HomeIcon) java.lang.Enum.valueOf(com.paypal.oslo.feature.home.domain.model.HomeIcon.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.home.domain.model.HomeIcon> getEntries() {
        return $ENTRIES;
    }
}
