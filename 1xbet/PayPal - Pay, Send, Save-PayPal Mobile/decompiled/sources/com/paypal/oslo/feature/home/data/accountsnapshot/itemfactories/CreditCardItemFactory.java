package com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 #2\u00020\u0001:\u0002$#BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\u001f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/CreditCardItemFactory;", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/AccountSnapshotItemFactory;", "", "staticRank", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;", "type", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;", "Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditAccountFields;", "extractor", "Lcom/paypal/oslo/feature/home/graphql/fragment/HomeCreditNextBestActionFields;", "nbaExtractor", "", "productTypeId", "<init>", "(ILcom/paypal/oslo/feature/home/api/AccountSnapshotType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "rank", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)I", "Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "createItem", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "p0", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/CreditCardItemFactory$NbaFooter;", "getHighSpeedVideoSizes", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/CreditCardItemFactory$NbaFooter;", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "Companion", "NbaFooter"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CreditCardItemFactory implements com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields> getHighSpeedVideoFpsRanges;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.home.api.AccountSnapshotType getHighSpeedVideoSizes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.CreditCardItemFactory.Companion INSTANCE = new com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.CreditCardItemFactory.Companion(null);
    public static final int $stable = com.paypal.oslo.feature.home.api.AccountSnapshotType.$stable;
    private static final java.time.format.DateTimeFormatter getHighSpeedVideoSizes = java.time.format.DateTimeFormatter.ofPattern(com.paypal.oslo.feature.bnplacquisition.ui.offers.OfferItem.INSTALLMENT_DATE_OUTPUT_PATTERN, java.util.Locale.US);

    /* JADX WARN: Multi-variable type inference failed */
    public CreditCardItemFactory(int i, com.paypal.oslo.feature.home.api.AccountSnapshotType accountSnapshotType, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields> function1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data, com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields> function12, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSnapshotType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoSizes = accountSnapshotType;
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighSpeedVideoFpsRanges = function12;
        this.Camera2StreamConfigurationMap = str;
    }

    @Override // com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory
    public final int rank(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    @Override // com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem createItem(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields.Billing billing;
        com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields.CurrentBalance currentBalance;
        com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.CreditCardItemFactory.NbaFooter nbaFooter;
        com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields.CardDisplayLogo cardDisplayLogo;
        java.lang.Object url;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields invoke = this.getHighSpeedVideoFpsRangesFor.invoke(data);
        if (invoke != null && (billing = invoke.getBilling()) != null && (currentBalance = billing.getCurrentBalance()) != null) {
            java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(currentBalance.getValue());
            if (bigDecimalOrNull == null) {
                bigDecimalOrNull = java.math.BigDecimal.ZERO;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimalOrNull);
            java.lang.String formatAmount = com.paypal.oslo.feature.home.data.accountsnapshot.MoneyUtilsKt.formatAmount(bigDecimalOrNull);
            com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields.Product product = invoke.getProduct();
            java.lang.String cardDisplayName = product != null ? product.getCardDisplayName() : null;
            if (cardDisplayName != null) {
                com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields invoke2 = this.getHighSpeedVideoFpsRanges.invoke(data);
                if (invoke2 != null) {
                    if (invoke2.getOnRevolvingCreditPastDue() != null) {
                        nbaFooter = new com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.CreditCardItemFactory.NbaFooter("Payment past due", com.paypal.oslo.feature.home.domain.model.FooterColors.Negative.INSTANCE, com.paypal.oslo.feature.home.domain.model.HomeIcon.Warning, com.paypal.oslo.feature.home.domain.model.FooterColors.Negative.INSTANCE);
                    } else if (invoke2.getOnRevolvingCreditMinimumPaymentDue() == null) {
                        if (invoke2.getOnRevolvingCreditAutopayCustomAmount() != null) {
                            nbaFooter = getHighSpeedVideoSizes(invoke2.getOnRevolvingCreditAutopayCustomAmount().getNextPaymentDueTime().toString());
                        } else if (invoke2.getOnRevolvingCreditAutopayMinimumPaymentDue() != null) {
                            nbaFooter = getHighSpeedVideoSizes(invoke2.getOnRevolvingCreditAutopayMinimumPaymentDue().getNextPaymentDueTime().toString());
                        } else if (invoke2.getOnRevolvingCreditAutopayLastStatement() != null) {
                            nbaFooter = getHighSpeedVideoSizes(invoke2.getOnRevolvingCreditAutopayLastStatement().getNextPaymentDueTime().toString());
                        }
                    } else {
                        java.lang.String formatDueDate$home_prodRelease = INSTANCE.formatDueDate$home_prodRelease(invoke2.getOnRevolvingCreditMinimumPaymentDue().getNextPaymentDueTime().toString());
                        if (formatDueDate$home_prodRelease != null) {
                            str = "Payment Due ".concat(java.lang.String.valueOf(formatDueDate$home_prodRelease));
                        } else {
                            str = "Payment Due";
                        }
                        nbaFooter = new com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.CreditCardItemFactory.NbaFooter(str, com.paypal.oslo.feature.home.domain.model.FooterColors.Neutral.INSTANCE, null, null);
                    }
                    java.lang.String str2 = this.Camera2StreamConfigurationMap;
                    java.lang.Object creditAccountId = invoke.getCreditAccountId();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(str2);
                    sb.append("-");
                    sb.append(creditAccountId);
                    java.lang.String obj = sb.toString();
                    com.paypal.oslo.feature.home.api.AccountSnapshotType accountSnapshotType = this.getHighSpeedVideoSizes;
                    java.lang.String str3 = nbaFooter == null ? nbaFooter.getHighSpeedVideoSizes : null;
                    if (nbaFooter != null || (r4 = nbaFooter.getHighSpeedVideoFpsRanges) == null) {
                        com.paypal.oslo.feature.home.domain.model.FooterColors.Neutral neutral = com.paypal.oslo.feature.home.domain.model.FooterColors.Neutral.INSTANCE;
                    }
                    com.paypal.oslo.feature.home.domain.model.FooterColors footerColors = neutral;
                    com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields.Product product2 = invoke.getProduct();
                    return new com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem(obj, accountSnapshotType, com.paypal.oslo.feature.home.domain.model.BackgroundColors.Default.INSTANCE, cardDisplayName, null, formatAmount, null, "Current balance", str3, footerColors, nbaFooter == null ? nbaFooter.getHighResolutionOutputSizeshNQ4ISI : null, nbaFooter != null ? nbaFooter.Camera2StreamConfigurationMap : null, kotlin.collections.CollectionsKt.listOfNotNull((product2 != null || (cardDisplayLogo = product2.getCardDisplayLogo()) == null || (url = cardDisplayLogo.getUrl()) == null) ? null : url.toString()), kotlin.collections.CollectionsKt.emptyList(), null, 16448, null);
                }
                nbaFooter = null;
                java.lang.String str22 = this.Camera2StreamConfigurationMap;
                java.lang.Object creditAccountId2 = invoke.getCreditAccountId();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str22);
                sb2.append("-");
                sb2.append(creditAccountId2);
                java.lang.String obj2 = sb2.toString();
                com.paypal.oslo.feature.home.api.AccountSnapshotType accountSnapshotType2 = this.getHighSpeedVideoSizes;
                if (nbaFooter == null) {
                }
                if (nbaFooter != null) {
                }
                com.paypal.oslo.feature.home.domain.model.FooterColors.Neutral neutral2 = com.paypal.oslo.feature.home.domain.model.FooterColors.Neutral.INSTANCE;
                com.paypal.oslo.feature.home.domain.model.FooterColors footerColors2 = neutral2;
                com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields.Product product22 = invoke.getProduct();
                return new com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem(obj2, accountSnapshotType2, com.paypal.oslo.feature.home.domain.model.BackgroundColors.Default.INSTANCE, cardDisplayName, null, formatAmount, null, "Current balance", str3, footerColors2, nbaFooter == null ? nbaFooter.getHighResolutionOutputSizeshNQ4ISI : null, nbaFooter != null ? nbaFooter.Camera2StreamConfigurationMap : null, kotlin.collections.CollectionsKt.listOfNotNull((product22 != null || (cardDisplayLogo = product22.getCardDisplayLogo()) == null || (url = cardDisplayLogo.getUrl()) == null) ? null : url.toString()), kotlin.collections.CollectionsKt.emptyList(), null, 16448, null);
            }
        }
        return null;
    }

    private static com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.CreditCardItemFactory.NbaFooter getHighSpeedVideoSizes(java.lang.String p0) {
        java.lang.String str;
        java.lang.String formatDueDate$home_prodRelease = INSTANCE.formatDueDate$home_prodRelease(p0);
        if (formatDueDate$home_prodRelease != null) {
            str = "Autopay ".concat(java.lang.String.valueOf(formatDueDate$home_prodRelease));
        } else {
            str = "Autopay";
        }
        return new com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.CreditCardItemFactory.NbaFooter(str, com.paypal.oslo.feature.home.domain.model.FooterColors.Warning.INSTANCE, null, null);
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/CreditCardItemFactory$NbaFooter;", "", "", "p0", "Lcom/paypal/oslo/feature/home/domain/model/FooterColors;", "p1", "Lcom/paypal/oslo/feature/home/domain/model/HomeIcon;", "p2", "p3", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/domain/model/FooterColors;Lcom/paypal/oslo/feature/home/domain/model/HomeIcon;Lcom/paypal/oslo/feature/home/domain/model/FooterColors;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/home/domain/model/FooterColors;", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/home/domain/model/HomeIcon;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    static final /* data */ class NbaFooter {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        final com.paypal.oslo.feature.home.domain.model.HomeIcon getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        final java.lang.String getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final com.paypal.oslo.feature.home.domain.model.FooterColors getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        final com.paypal.oslo.feature.home.domain.model.FooterColors Camera2StreamConfigurationMap;

        public NbaFooter(java.lang.String str, com.paypal.oslo.feature.home.domain.model.FooterColors footerColors, com.paypal.oslo.feature.home.domain.model.HomeIcon homeIcon, com.paypal.oslo.feature.home.domain.model.FooterColors footerColors2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(footerColors, "");
            this.getHighSpeedVideoSizes = str;
            this.getHighSpeedVideoFpsRanges = footerColors;
            this.getHighResolutionOutputSizeshNQ4ISI = homeIcon;
            this.Camera2StreamConfigurationMap = footerColors2;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.home.domain.model.FooterColors footerColors = this.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.home.domain.model.HomeIcon homeIcon = this.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.home.domain.model.FooterColors footerColors2 = this.Camera2StreamConfigurationMap;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NbaFooter(getHighSpeedVideoSizes=");
            sb.append(str);
            sb.append(", getHighSpeedVideoFpsRanges=");
            sb.append(footerColors);
            sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
            sb.append(homeIcon);
            sb.append(", Camera2StreamConfigurationMap=");
            sb.append(footerColors2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.getHighSpeedVideoSizes.hashCode();
            int hashCode2 = this.getHighSpeedVideoFpsRanges.hashCode();
            com.paypal.oslo.feature.home.domain.model.HomeIcon homeIcon = this.getHighResolutionOutputSizeshNQ4ISI;
            int hashCode3 = homeIcon == null ? 0 : homeIcon.hashCode();
            com.paypal.oslo.feature.home.domain.model.FooterColors footerColors = this.Camera2StreamConfigurationMap;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (footerColors != null ? footerColors.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.CreditCardItemFactory.NbaFooter)) {
                return false;
            }
            com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.CreditCardItemFactory.NbaFooter nbaFooter = (com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.CreditCardItemFactory.NbaFooter) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, nbaFooter.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, nbaFooter.getHighSpeedVideoFpsRanges) && this.getHighResolutionOutputSizeshNQ4ISI == nbaFooter.getHighResolutionOutputSizeshNQ4ISI && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, nbaFooter.Camera2StreamConfigurationMap);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006*\u00020\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/CreditCardItemFactory$Companion;", "", "<init>", "()V", "", "dateString", "formatDueDate$home_prodRelease", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/time/format/DateTimeFormatter;", "getHighSpeedVideoSizes", "Ljava/time/format/DateTimeFormatter;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String formatDueDate$home_prodRelease(java.lang.String dateString) {
            if (dateString == null) {
                return null;
            }
            try {
                return java.time.OffsetDateTime.parse(dateString).format(com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.CreditCardItemFactory.getHighSpeedVideoSizes);
            } catch (java.time.format.DateTimeParseException unused) {
                return null;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
