package com.paypal.oslo.feature.taptopay.ui.setup.loading;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/loading/LoadingContent;", "", "", com.datadog.android.rum.internal.metric.SessionEndedMetric.VIEW_COUNTS_BG_KEY, "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "titles", "<init>", "(ILjava/util/List;)V", "component1", "()I", "component2", "()Ljava/util/List;", "copy", "(ILjava/util/List;)Lcom/paypal/oslo/feature/taptopay/ui/setup/loading/LoadingContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getBackground", "Ljava/util/List;", "getTitles", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LoadingContent {
    private final int background;
    private final java.util.List<com.paypal.oslo.core.commonui.utils.RefText> titles;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent.Companion INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent.Companion(null);
    public static final int $stable = 8;
    private static final com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent Default = new com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent(com.paypal.oslo.feature.taptopay.R.drawable.feature_taptopay_tokenization_loading_background, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_setup_loading_header, new java.lang.Object[0])));
    private static final com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent PayPalDebit = new com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent(com.paypal.oslo.feature.taptopay.R.drawable.feature_taptopay_tokenization_loading_background, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_setup_loading_header, new java.lang.Object[0])));
    private static final com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent PayPalBusinessDebit = new com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent(com.paypal.oslo.feature.taptopay.R.drawable.feature_taptopay_tokenization_loading_background, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_setup_loading_header, new java.lang.Object[0])));
    private static final com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent PayLater = new com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent(com.paypal.oslo.feature.taptopay.R.drawable.feature_taptopay_tokenization_loading_background, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_setup_loading_header, new java.lang.Object[0])));
    private static final com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent ThirdParty = new com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent(com.paypal.oslo.feature.taptopay.R.drawable.feature_taptopay_tokenization_loading_background, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.taptopay.R.string.feature_taptopay_setup_loading_header, new java.lang.Object[0])));

    /* JADX WARN: Multi-variable type inference failed */
    public LoadingContent(int i, java.util.List<? extends com.paypal.oslo.core.commonui.utils.RefText> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.background = i;
        this.titles = list;
    }

    public final int getBackground() {
        return this.background;
    }

    public final java.util.List<com.paypal.oslo.core.commonui.utils.RefText> getTitles() {
        return this.titles;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/loading/LoadingContent$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardType;", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, "Lcom/paypal/oslo/feature/taptopay/ui/setup/loading/LoadingContent;", "forCardType", "(Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardType;)Lcom/paypal/oslo/feature/taptopay/ui/setup/loading/LoadingContent;", "Default", "Lcom/paypal/oslo/feature/taptopay/ui/setup/loading/LoadingContent;", "getDefault", "()Lcom/paypal/oslo/feature/taptopay/ui/setup/loading/LoadingContent;", "PayPalDebit", "getPayPalDebit", "PayPalBusinessDebit", "getPayPalBusinessDebit", "PayLater", "getPayLater", "ThirdParty", "getThirdParty"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent getDefault() {
            return com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent.Default;
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent getPayPalDebit() {
            return com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent.PayPalDebit;
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent getPayPalBusinessDebit() {
            return com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent.PayPalBusinessDebit;
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent getPayLater() {
            return com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent.PayLater;
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent getThirdParty() {
            return com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent.ThirdParty;
        }

        public final com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent forCardType(com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType) {
            switch (cardType == null ? -1 : com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent.Companion.WhenMappings.$EnumSwitchMapping$0[cardType.ordinal()]) {
                case -1:
                case 6:
                    return getDefault();
                case 0:
                default:
                    throw new kotlin.NoWhenBranchMatchedException();
                case 1:
                    return getPayPalDebit();
                case 2:
                    return getPayPalBusinessDebit();
                case 3:
                    return getPayLater();
                case 4:
                case 5:
                    return getThirdParty();
            }
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.values().length];
                try {
                    iArr[com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.PayPalConsumerDebit.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.PayPalBusinessDebit.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.PayLaterToGo.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.ThirdPartyCredit.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.ThirdPartyDebit.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr[com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.Unknown.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        int i = this.background;
        java.util.List<com.paypal.oslo.core.commonui.utils.RefText> list = this.titles;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadingContent(background=");
        sb.append(i);
        sb.append(", titles=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Integer.hashCode(this.background) * 31) + this.titles.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent loadingContent = (com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent) other;
        return this.background == loadingContent.background && kotlin.jvm.internal.Intrinsics.areEqual(this.titles, loadingContent.titles);
    }

    public final com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent copy(int background, java.util.List<? extends com.paypal.oslo.core.commonui.utils.RefText> titles) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(titles, "");
        return new com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent(background, titles);
    }

    public final java.util.List<com.paypal.oslo.core.commonui.utils.RefText> component2() {
        return this.titles;
    }

    /* renamed from: component1, reason: from getter */
    public final int getBackground() {
        return this.background;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent copy$default(com.paypal.oslo.feature.taptopay.ui.setup.loading.LoadingContent loadingContent, int i, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = loadingContent.background;
        }
        if ((i2 & 2) != 0) {
            list = loadingContent.titles;
        }
        return loadingContent.copy(i, list);
    }
}
