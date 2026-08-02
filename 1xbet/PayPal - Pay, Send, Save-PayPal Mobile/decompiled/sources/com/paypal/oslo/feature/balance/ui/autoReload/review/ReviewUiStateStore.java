package com.paypal.oslo.feature.balance.ui.autoReload.review;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B»\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010!J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010!J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b.\u0010!J\u0012\u0010/\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b1\u0010+J\u0010\u00102\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b2\u0010+J\u0012\u00103\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b3\u0010!J\u0010\u00104\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b6\u0010!JÄ\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010:\u001a\u00020\u000f2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010=\u001a\u00020<HÖ\u0001¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b?\u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010B\u001a\u0004\bC\u0010!R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010B\u001a\u0004\bD\u0010!R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\bE\u0010!R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010F\u001a\u0004\bG\u0010%R\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010B\u001a\u0004\bH\u0010!R\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010B\u001a\u0004\bI\u0010!R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010J\u001a\u0004\bK\u0010)R\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010L\u001a\u0004\bM\u0010+R\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010N\u001a\u0004\bO\u0010-R\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010B\u001a\u0004\bP\u0010!R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010Q\u001a\u0004\bR\u00100R\u001a\u0010\u0016\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010L\u001a\u0004\bS\u0010+R\u001a\u0010\u0017\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010L\u001a\u0004\bT\u0010+R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010B\u001a\u0004\bU\u0010!R\u001a\u0010\u001a\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010V\u001a\u0004\bW\u00105R\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010B\u001a\u0004\bX\u0010!"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewUiStateStore;", "", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy;", "reloadStrategy", "", "formattedRechargeAmount", "currencyCode", "formattedThresholdAmount", "Ljava/time/LocalDate;", "startDate", "formattedStartDate", "formattedDayOfWeek", "", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/FundingInstrumentOption;", "fundingInstrumentOptions", "", "hasFiInstantOptionAvailable", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewDisclaimerType;", "disclaimerType", "selectedFundingInstrumentId", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/FundingInstrumentUi;", "fundingInstrumentUi", "showFiSelectionSheet", "showNoFiSelectedAlert", "newlyAddedFiId", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewState;", "state", "balanceId", "<init>", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewDisclaimerType;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/FundingInstrumentUi;ZZLjava/lang/String;Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewState;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Ljava/time/LocalDate;", "component6", "component7", "component8", "()Ljava/util/List;", "component9", "()Z", "component10", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewDisclaimerType;", "component11", "component12", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/model/FundingInstrumentUi;", "component13", "component14", "component15", "component16", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewState;", "component17", "copy", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewDisclaimerType;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/FundingInstrumentUi;ZZLjava/lang/String;Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewState;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewUiStateStore;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy;", "getReloadStrategy", "Ljava/lang/String;", "getFormattedRechargeAmount", "getCurrencyCode", "getFormattedThresholdAmount", "Ljava/time/LocalDate;", "getStartDate", "getFormattedStartDate", "getFormattedDayOfWeek", "Ljava/util/List;", "getFundingInstrumentOptions", "Z", "getHasFiInstantOptionAvailable", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewDisclaimerType;", "getDisclaimerType", "getSelectedFundingInstrumentId", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/FundingInstrumentUi;", "getFundingInstrumentUi", "getShowFiSelectionSheet", "getShowNoFiSelectedAlert", "getNewlyAddedFiId", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewState;", "getState", "getBalanceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ReviewUiStateStore {
    public static final int $stable = 8;
    private final java.lang.String balanceId;
    private final java.lang.String currencyCode;
    private final com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType disclaimerType;
    private final java.lang.String formattedDayOfWeek;
    private final java.lang.String formattedRechargeAmount;
    private final java.lang.String formattedStartDate;
    private final java.lang.String formattedThresholdAmount;
    private final java.util.List<com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> fundingInstrumentOptions;
    private final com.paypal.oslo.feature.balance.ui.autoReload.model.FundingInstrumentUi fundingInstrumentUi;
    private final boolean hasFiInstantOptionAvailable;
    private final java.lang.String newlyAddedFiId;
    private final com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy reloadStrategy;
    private final java.lang.String selectedFundingInstrumentId;
    private final boolean showFiSelectionSheet;
    private final boolean showNoFiSelectedAlert;
    private final java.time.LocalDate startDate;
    private final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState state;

    /* JADX WARN: Multi-variable type inference failed */
    public ReviewUiStateStore(com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy reviewReloadStrategy, java.lang.String str, java.lang.String str2, java.lang.String str3, java.time.LocalDate localDate, java.lang.String str4, java.lang.String str5, java.util.List<? extends com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> list, boolean z, com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType reviewDisclaimerType, java.lang.String str6, com.paypal.oslo.feature.balance.ui.autoReload.model.FundingInstrumentUi fundingInstrumentUi, boolean z2, boolean z3, java.lang.String str7, com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState reviewState, java.lang.String str8) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewReloadStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewDisclaimerType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
        this.reloadStrategy = reviewReloadStrategy;
        this.formattedRechargeAmount = str;
        this.currencyCode = str2;
        this.formattedThresholdAmount = str3;
        this.startDate = localDate;
        this.formattedStartDate = str4;
        this.formattedDayOfWeek = str5;
        this.fundingInstrumentOptions = list;
        this.hasFiInstantOptionAvailable = z;
        this.disclaimerType = reviewDisclaimerType;
        this.selectedFundingInstrumentId = str6;
        this.fundingInstrumentUi = fundingInstrumentUi;
        this.showFiSelectionSheet = z2;
        this.showNoFiSelectedAlert = z3;
        this.newlyAddedFiId = str7;
        this.state = reviewState;
        this.balanceId = str8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ReviewUiStateStore(com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy reviewReloadStrategy, java.lang.String str, java.lang.String str2, java.lang.String str3, java.time.LocalDate localDate, java.lang.String str4, java.lang.String str5, java.util.List list, boolean z, com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType reviewDisclaimerType, java.lang.String str6, com.paypal.oslo.feature.balance.ui.autoReload.model.FundingInstrumentUi fundingInstrumentUi, boolean z2, boolean z3, java.lang.String str7, com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState reviewState, java.lang.String str8, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r5, r6, r7, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 256) != 0 ? false : z, (i & 512) != 0 ? com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType.NONE : reviewDisclaimerType, (i & 1024) != 0 ? "" : str6, (i & 2048) != 0 ? null : fundingInstrumentUi, (i & 4096) != 0 ? false : z2, (i & 8192) != 0 ? false : z3, (i & 16384) != 0 ? null : str7, (i & 32768) != 0 ? com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Initial.INSTANCE : reviewState, (i & 65536) != 0 ? "" : str8);
        com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance lowBalance;
        java.time.LocalDate localDate2;
        java.lang.String str9 = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        java.lang.Object[] objArr4 = 0;
        java.lang.Object[] objArr5 = 0;
        if ((i & 1) != 0) {
            int i2 = 3;
            lowBalance = new com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy.LowBalance(new com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi(str9, (java.lang.String) (objArr5 == true ? 1 : 0), i2, (kotlin.jvm.internal.DefaultConstructorMarker) (objArr4 == true ? 1 : 0)), new com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi((java.lang.String) (objArr3 == true ? 1 : 0), (java.lang.String) (objArr2 == true ? 1 : 0), i2, (kotlin.jvm.internal.DefaultConstructorMarker) (objArr == true ? 1 : 0)), (java.lang.String) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        } else {
            lowBalance = reviewReloadStrategy;
        }
        java.lang.String str10 = (i & 2) != 0 ? "" : str;
        java.lang.String str11 = (i & 4) != 0 ? "" : str2;
        java.lang.String str12 = (i & 8) != 0 ? "" : str3;
        if ((i & 16) != 0) {
            localDate2 = java.time.LocalDate.now();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localDate2, "");
        } else {
            localDate2 = localDate;
        }
    }

    public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy getReloadStrategy() {
        return this.reloadStrategy;
    }

    public final java.lang.String getFormattedRechargeAmount() {
        return this.formattedRechargeAmount;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.lang.String getFormattedThresholdAmount() {
        return this.formattedThresholdAmount;
    }

    public final java.time.LocalDate getStartDate() {
        return this.startDate;
    }

    public final java.lang.String getFormattedStartDate() {
        return this.formattedStartDate;
    }

    public final java.lang.String getFormattedDayOfWeek() {
        return this.formattedDayOfWeek;
    }

    public final java.util.List<com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> getFundingInstrumentOptions() {
        return this.fundingInstrumentOptions;
    }

    public final boolean getHasFiInstantOptionAvailable() {
        return this.hasFiInstantOptionAvailable;
    }

    public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType getDisclaimerType() {
        return this.disclaimerType;
    }

    public final java.lang.String getSelectedFundingInstrumentId() {
        return this.selectedFundingInstrumentId;
    }

    public final com.paypal.oslo.feature.balance.ui.autoReload.model.FundingInstrumentUi getFundingInstrumentUi() {
        return this.fundingInstrumentUi;
    }

    public final boolean getShowFiSelectionSheet() {
        return this.showFiSelectionSheet;
    }

    public final boolean getShowNoFiSelectedAlert() {
        return this.showNoFiSelectedAlert;
    }

    public final java.lang.String getNewlyAddedFiId() {
        return this.newlyAddedFiId;
    }

    public final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState getState() {
        return this.state;
    }

    public final java.lang.String getBalanceId() {
        return this.balanceId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy reviewReloadStrategy = this.reloadStrategy;
        java.lang.String str = this.formattedRechargeAmount;
        java.lang.String str2 = this.currencyCode;
        java.lang.String str3 = this.formattedThresholdAmount;
        java.time.LocalDate localDate = this.startDate;
        java.lang.String str4 = this.formattedStartDate;
        java.lang.String str5 = this.formattedDayOfWeek;
        java.util.List<com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> list = this.fundingInstrumentOptions;
        boolean z = this.hasFiInstantOptionAvailable;
        com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType reviewDisclaimerType = this.disclaimerType;
        java.lang.String str6 = this.selectedFundingInstrumentId;
        com.paypal.oslo.feature.balance.ui.autoReload.model.FundingInstrumentUi fundingInstrumentUi = this.fundingInstrumentUi;
        boolean z2 = this.showFiSelectionSheet;
        boolean z3 = this.showNoFiSelectedAlert;
        java.lang.String str7 = this.newlyAddedFiId;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState reviewState = this.state;
        java.lang.String str8 = this.balanceId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReviewUiStateStore(reloadStrategy=");
        sb.append(reviewReloadStrategy);
        sb.append(", formattedRechargeAmount=");
        sb.append(str);
        sb.append(", currencyCode=");
        sb.append(str2);
        sb.append(", formattedThresholdAmount=");
        sb.append(str3);
        sb.append(", startDate=");
        sb.append(localDate);
        sb.append(", formattedStartDate=");
        sb.append(str4);
        sb.append(", formattedDayOfWeek=");
        sb.append(str5);
        sb.append(", fundingInstrumentOptions=");
        sb.append(list);
        sb.append(", hasFiInstantOptionAvailable=");
        sb.append(z);
        sb.append(", disclaimerType=");
        sb.append(reviewDisclaimerType);
        sb.append(", selectedFundingInstrumentId=");
        sb.append(str6);
        sb.append(", fundingInstrumentUi=");
        sb.append(fundingInstrumentUi);
        sb.append(", showFiSelectionSheet=");
        sb.append(z2);
        sb.append(", showNoFiSelectedAlert=");
        sb.append(z3);
        sb.append(", newlyAddedFiId=");
        sb.append(str7);
        sb.append(", state=");
        sb.append(reviewState);
        sb.append(", balanceId=");
        sb.append(str8);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.reloadStrategy.hashCode();
        int hashCode2 = this.formattedRechargeAmount.hashCode();
        int hashCode3 = this.currencyCode.hashCode();
        int hashCode4 = this.formattedThresholdAmount.hashCode();
        int hashCode5 = this.startDate.hashCode();
        int hashCode6 = this.formattedStartDate.hashCode();
        int hashCode7 = this.formattedDayOfWeek.hashCode();
        int hashCode8 = this.fundingInstrumentOptions.hashCode();
        int hashCode9 = java.lang.Boolean.hashCode(this.hasFiInstantOptionAvailable);
        int hashCode10 = this.disclaimerType.hashCode();
        int hashCode11 = this.selectedFundingInstrumentId.hashCode();
        com.paypal.oslo.feature.balance.ui.autoReload.model.FundingInstrumentUi fundingInstrumentUi = this.fundingInstrumentUi;
        int hashCode12 = fundingInstrumentUi == null ? 0 : fundingInstrumentUi.hashCode();
        int hashCode13 = java.lang.Boolean.hashCode(this.showFiSelectionSheet);
        int hashCode14 = java.lang.Boolean.hashCode(this.showNoFiSelectedAlert);
        java.lang.String str = this.newlyAddedFiId;
        return (((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.state.hashCode()) * 31) + this.balanceId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore)) {
            return false;
        }
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore reviewUiStateStore = (com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.reloadStrategy, reviewUiStateStore.reloadStrategy) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedRechargeAmount, reviewUiStateStore.formattedRechargeAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, reviewUiStateStore.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedThresholdAmount, reviewUiStateStore.formattedThresholdAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.startDate, reviewUiStateStore.startDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedStartDate, reviewUiStateStore.formattedStartDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedDayOfWeek, reviewUiStateStore.formattedDayOfWeek) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrumentOptions, reviewUiStateStore.fundingInstrumentOptions) && this.hasFiInstantOptionAvailable == reviewUiStateStore.hasFiInstantOptionAvailable && this.disclaimerType == reviewUiStateStore.disclaimerType && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingInstrumentId, reviewUiStateStore.selectedFundingInstrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrumentUi, reviewUiStateStore.fundingInstrumentUi) && this.showFiSelectionSheet == reviewUiStateStore.showFiSelectionSheet && this.showNoFiSelectedAlert == reviewUiStateStore.showNoFiSelectedAlert && kotlin.jvm.internal.Intrinsics.areEqual(this.newlyAddedFiId, reviewUiStateStore.newlyAddedFiId) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, reviewUiStateStore.state) && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceId, reviewUiStateStore.balanceId);
    }

    public final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore copy(com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy reloadStrategy, java.lang.String formattedRechargeAmount, java.lang.String currencyCode, java.lang.String formattedThresholdAmount, java.time.LocalDate startDate, java.lang.String formattedStartDate, java.lang.String formattedDayOfWeek, java.util.List<? extends com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> fundingInstrumentOptions, boolean hasFiInstantOptionAvailable, com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType disclaimerType, java.lang.String selectedFundingInstrumentId, com.paypal.oslo.feature.balance.ui.autoReload.model.FundingInstrumentUi fundingInstrumentUi, boolean showFiSelectionSheet, boolean showNoFiSelectedAlert, java.lang.String newlyAddedFiId, com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState state, java.lang.String balanceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedRechargeAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedThresholdAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedStartDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedDayOfWeek, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentOptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disclaimerType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedFundingInstrumentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceId, "");
        return new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore(reloadStrategy, formattedRechargeAmount, currencyCode, formattedThresholdAmount, startDate, formattedStartDate, formattedDayOfWeek, fundingInstrumentOptions, hasFiInstantOptionAvailable, disclaimerType, selectedFundingInstrumentId, fundingInstrumentUi, showFiSelectionSheet, showNoFiSelectedAlert, newlyAddedFiId, state, balanceId);
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getHasFiInstantOptionAvailable() {
        return this.hasFiInstantOptionAvailable;
    }

    public final java.util.List<com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> component8() {
        return this.fundingInstrumentOptions;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getFormattedDayOfWeek() {
        return this.formattedDayOfWeek;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getFormattedStartDate() {
        return this.formattedStartDate;
    }

    /* renamed from: component5, reason: from getter */
    public final java.time.LocalDate getStartDate() {
        return this.startDate;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getFormattedThresholdAmount() {
        return this.formattedThresholdAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFormattedRechargeAmount() {
        return this.formattedRechargeAmount;
    }

    /* renamed from: component17, reason: from getter */
    public final java.lang.String getBalanceId() {
        return this.balanceId;
    }

    /* renamed from: component16, reason: from getter */
    public final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState getState() {
        return this.state;
    }

    /* renamed from: component15, reason: from getter */
    public final java.lang.String getNewlyAddedFiId() {
        return this.newlyAddedFiId;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getShowNoFiSelectedAlert() {
        return this.showNoFiSelectedAlert;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getShowFiSelectionSheet() {
        return this.showFiSelectionSheet;
    }

    /* renamed from: component12, reason: from getter */
    public final com.paypal.oslo.feature.balance.ui.autoReload.model.FundingInstrumentUi getFundingInstrumentUi() {
        return this.fundingInstrumentUi;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getSelectedFundingInstrumentId() {
        return this.selectedFundingInstrumentId;
    }

    /* renamed from: component10, reason: from getter */
    public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType getDisclaimerType() {
        return this.disclaimerType;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy getReloadStrategy() {
        return this.reloadStrategy;
    }

    public ReviewUiStateStore() {
        this(null, null, null, null, null, null, null, null, false, null, null, null, false, false, null, null, null, 131071, null);
    }
}
