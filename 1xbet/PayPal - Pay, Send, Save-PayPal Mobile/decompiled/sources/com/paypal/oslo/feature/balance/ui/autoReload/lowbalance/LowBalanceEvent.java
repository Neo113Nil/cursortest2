package com.paypal.oslo.feature.balance.ui.autoReload.lowbalance;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\r\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\r\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnInitialize", "OnDataLoaded", "OnTurnOffSuccess", "OnDataError", "OnTurnOffError", "OnReloadAmountClick", "OnThresholdAmountClick", "OnNextButtonClick", "OnTurnOffButtonClick", "OnBackButtonClick", "OnSelectRechargeAmount", "OnSelectThresholdAmount", "OnUpdateRechargeOptions", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnBackButtonClick;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnDataError;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnDataLoaded;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnInitialize;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnNextButtonClick;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnReloadAmountClick;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnSelectRechargeAmount;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnSelectThresholdAmount;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnThresholdAmountClick;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnTurnOffButtonClick;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnTurnOffError;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnTurnOffSuccess;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnUpdateRechargeOptions;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class LowBalanceEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private LowBalanceEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnInitialize;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnInitialize extends com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnInitialize INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnInitialize();

        public final int hashCode() {
            return 686559170;
        }

        private OnInitialize() {
            super("OnInitialize", null);
        }

        public final java.lang.String toString() {
            return "OnInitialize";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnInitialize)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B£\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b%\u0010\u0019J¬\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b/\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b5\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b6\u0010\u0019R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010\u001dR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b9\u0010\u001dR\u001a\u0010\f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b:\u0010\u0019R\u001a\u0010\r\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b;\u0010\u0019R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b<\u0010\u001dR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b=\u0010\u001dR\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\b\u0011\u0010$R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\b?\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnDataLoaded;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;", "thresholdAmount", "rechargeAmount", "", "currencyCode", "minimumAmount", "maximumAmount", "", "thresholdOptions", "rechargeOptions", "formattedMinimum", "formattedMaximum", "formattedThresholdOptions", "formattedRechargeOptions", "", "isAutoReloadEnabled", "financialInstrumentId", "<init>", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "component10", "component11", "component12", "()Z", "component13", "copy", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;)Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnDataLoaded;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;", "getThresholdAmount", "getRechargeAmount", "Ljava/lang/String;", "getCurrencyCode", "getMinimumAmount", "getMaximumAmount", "Ljava/util/List;", "getThresholdOptions", "getRechargeOptions", "getFormattedMinimum", "getFormattedMaximum", "getFormattedThresholdOptions", "getFormattedRechargeOptions", "Z", "getFinancialInstrumentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDataLoaded extends com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent {
        public static final int $stable = 8;
        private final java.lang.String currencyCode;
        private final java.lang.String financialInstrumentId;
        private final java.lang.String formattedMaximum;
        private final java.lang.String formattedMinimum;
        private final java.util.List<java.lang.String> formattedRechargeOptions;
        private final java.util.List<java.lang.String> formattedThresholdOptions;
        private final boolean isAutoReloadEnabled;
        private final java.lang.String maximumAmount;
        private final java.lang.String minimumAmount;
        private final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi rechargeAmount;
        private final java.util.List<java.lang.String> rechargeOptions;
        private final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi thresholdAmount;
        private final java.util.List<java.lang.String> thresholdOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnDataLoaded(com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi, com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, java.lang.String str4, java.lang.String str5, java.util.List<java.lang.String> list3, java.util.List<java.lang.String> list4, boolean z, java.lang.String str6) {
            super("OnDataLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadAmountUi, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadAmountUi2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list4, "");
            this.thresholdAmount = reloadAmountUi;
            this.rechargeAmount = reloadAmountUi2;
            this.currencyCode = str;
            this.minimumAmount = str2;
            this.maximumAmount = str3;
            this.thresholdOptions = list;
            this.rechargeOptions = list2;
            this.formattedMinimum = str4;
            this.formattedMaximum = str5;
            this.formattedThresholdOptions = list3;
            this.formattedRechargeOptions = list4;
            this.isAutoReloadEnabled = z;
            this.financialInstrumentId = str6;
        }

        public /* synthetic */ OnDataLoaded(com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi, com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, java.util.List list2, java.lang.String str4, java.lang.String str5, java.util.List list3, java.util.List list4, boolean z, java.lang.String str6, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null) : reloadAmountUi, (i & 2) != 0 ? new com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null) : reloadAmountUi2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 64) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 128) != 0 ? "" : str4, (i & 256) == 0 ? str5 : "", (i & 512) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3, (i & 1024) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list4, (i & 2048) != 0 ? false : z, (i & 4096) == 0 ? str6 : null);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi getThresholdAmount() {
            return this.thresholdAmount;
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi getRechargeAmount() {
            return this.rechargeAmount;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getMinimumAmount() {
            return this.minimumAmount;
        }

        public final java.lang.String getMaximumAmount() {
            return this.maximumAmount;
        }

        public final java.util.List<java.lang.String> getThresholdOptions() {
            return this.thresholdOptions;
        }

        public final java.util.List<java.lang.String> getRechargeOptions() {
            return this.rechargeOptions;
        }

        public final java.lang.String getFormattedMinimum() {
            return this.formattedMinimum;
        }

        public final java.lang.String getFormattedMaximum() {
            return this.formattedMaximum;
        }

        public final java.util.List<java.lang.String> getFormattedThresholdOptions() {
            return this.formattedThresholdOptions;
        }

        public final java.util.List<java.lang.String> getFormattedRechargeOptions() {
            return this.formattedRechargeOptions;
        }

        public final boolean isAutoReloadEnabled() {
            return this.isAutoReloadEnabled;
        }

        public final java.lang.String getFinancialInstrumentId() {
            return this.financialInstrumentId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi = this.thresholdAmount;
            com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi2 = this.rechargeAmount;
            java.lang.String str = this.currencyCode;
            java.lang.String str2 = this.minimumAmount;
            java.lang.String str3 = this.maximumAmount;
            java.util.List<java.lang.String> list = this.thresholdOptions;
            java.util.List<java.lang.String> list2 = this.rechargeOptions;
            java.lang.String str4 = this.formattedMinimum;
            java.lang.String str5 = this.formattedMaximum;
            java.util.List<java.lang.String> list3 = this.formattedThresholdOptions;
            java.util.List<java.lang.String> list4 = this.formattedRechargeOptions;
            boolean z = this.isAutoReloadEnabled;
            java.lang.String str6 = this.financialInstrumentId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnDataLoaded(thresholdAmount=");
            sb.append(reloadAmountUi);
            sb.append(", rechargeAmount=");
            sb.append(reloadAmountUi2);
            sb.append(", currencyCode=");
            sb.append(str);
            sb.append(", minimumAmount=");
            sb.append(str2);
            sb.append(", maximumAmount=");
            sb.append(str3);
            sb.append(", thresholdOptions=");
            sb.append(list);
            sb.append(", rechargeOptions=");
            sb.append(list2);
            sb.append(", formattedMinimum=");
            sb.append(str4);
            sb.append(", formattedMaximum=");
            sb.append(str5);
            sb.append(", formattedThresholdOptions=");
            sb.append(list3);
            sb.append(", formattedRechargeOptions=");
            sb.append(list4);
            sb.append(", isAutoReloadEnabled=");
            sb.append(z);
            sb.append(", financialInstrumentId=");
            sb.append(str6);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.thresholdAmount.hashCode();
            int hashCode2 = this.rechargeAmount.hashCode();
            int hashCode3 = this.currencyCode.hashCode();
            int hashCode4 = this.minimumAmount.hashCode();
            int hashCode5 = this.maximumAmount.hashCode();
            int hashCode6 = this.thresholdOptions.hashCode();
            int hashCode7 = this.rechargeOptions.hashCode();
            int hashCode8 = this.formattedMinimum.hashCode();
            int hashCode9 = this.formattedMaximum.hashCode();
            int hashCode10 = this.formattedThresholdOptions.hashCode();
            int hashCode11 = this.formattedRechargeOptions.hashCode();
            int hashCode12 = java.lang.Boolean.hashCode(this.isAutoReloadEnabled);
            java.lang.String str = this.financialInstrumentId;
            return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnDataLoaded)) {
                return false;
            }
            com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnDataLoaded onDataLoaded = (com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnDataLoaded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.thresholdAmount, onDataLoaded.thresholdAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.rechargeAmount, onDataLoaded.rechargeAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, onDataLoaded.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.minimumAmount, onDataLoaded.minimumAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.maximumAmount, onDataLoaded.maximumAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.thresholdOptions, onDataLoaded.thresholdOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.rechargeOptions, onDataLoaded.rechargeOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedMinimum, onDataLoaded.formattedMinimum) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedMaximum, onDataLoaded.formattedMaximum) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedThresholdOptions, onDataLoaded.formattedThresholdOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedRechargeOptions, onDataLoaded.formattedRechargeOptions) && this.isAutoReloadEnabled == onDataLoaded.isAutoReloadEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.financialInstrumentId, onDataLoaded.financialInstrumentId);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnDataLoaded copy(com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi thresholdAmount, com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi rechargeAmount, java.lang.String currencyCode, java.lang.String minimumAmount, java.lang.String maximumAmount, java.util.List<java.lang.String> thresholdOptions, java.util.List<java.lang.String> rechargeOptions, java.lang.String formattedMinimum, java.lang.String formattedMaximum, java.util.List<java.lang.String> formattedThresholdOptions, java.util.List<java.lang.String> formattedRechargeOptions, boolean isAutoReloadEnabled, java.lang.String financialInstrumentId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thresholdAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rechargeAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minimumAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maximumAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thresholdOptions, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rechargeOptions, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedMinimum, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedMaximum, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedThresholdOptions, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedRechargeOptions, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnDataLoaded(thresholdAmount, rechargeAmount, currencyCode, minimumAmount, maximumAmount, thresholdOptions, rechargeOptions, formattedMinimum, formattedMaximum, formattedThresholdOptions, formattedRechargeOptions, isAutoReloadEnabled, financialInstrumentId);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getFormattedMaximum() {
            return this.formattedMaximum;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getFormattedMinimum() {
            return this.formattedMinimum;
        }

        public final java.util.List<java.lang.String> component7() {
            return this.rechargeOptions;
        }

        public final java.util.List<java.lang.String> component6() {
            return this.thresholdOptions;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getMaximumAmount() {
            return this.maximumAmount;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getMinimumAmount() {
            return this.minimumAmount;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi getRechargeAmount() {
            return this.rechargeAmount;
        }

        /* renamed from: component13, reason: from getter */
        public final java.lang.String getFinancialInstrumentId() {
            return this.financialInstrumentId;
        }

        /* renamed from: component12, reason: from getter */
        public final boolean getIsAutoReloadEnabled() {
            return this.isAutoReloadEnabled;
        }

        public final java.util.List<java.lang.String> component11() {
            return this.formattedRechargeOptions;
        }

        public final java.util.List<java.lang.String> component10() {
            return this.formattedThresholdOptions;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi getThresholdAmount() {
            return this.thresholdAmount;
        }

        public OnDataLoaded() {
            this(null, null, null, null, null, null, null, null, null, null, null, false, null, 8191, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnTurnOffSuccess;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnTurnOffSuccess extends com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnTurnOffSuccess INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnTurnOffSuccess();

        public final int hashCode() {
            return -984318173;
        }

        private OnTurnOffSuccess() {
            super("OnTurnOffSuccess", null);
        }

        public final java.lang.String toString() {
            return "OnTurnOffSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnTurnOffSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnDataError;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDataError extends com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnDataError INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnDataError();

        public final int hashCode() {
            return 160799244;
        }

        private OnDataError() {
            super("OnDataError", null);
        }

        public final java.lang.String toString() {
            return "OnDataError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnDataError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnTurnOffError;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnTurnOffError extends com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnTurnOffError INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnTurnOffError();

        public final int hashCode() {
            return -1855366872;
        }

        private OnTurnOffError() {
            super("OnTurnOffError", null);
        }

        public final java.lang.String toString() {
            return "OnTurnOffError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnTurnOffError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnReloadAmountClick;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnReloadAmountClick extends com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnReloadAmountClick INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnReloadAmountClick();

        public final int hashCode() {
            return -1047832507;
        }

        private OnReloadAmountClick() {
            super("OnReloadAmountClick", null);
        }

        public final java.lang.String toString() {
            return "OnReloadAmountClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnReloadAmountClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnThresholdAmountClick;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnThresholdAmountClick extends com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnThresholdAmountClick INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnThresholdAmountClick();

        public final int hashCode() {
            return -421753769;
        }

        private OnThresholdAmountClick() {
            super("OnThresholdAmountClick", null);
        }

        public final java.lang.String toString() {
            return "OnThresholdAmountClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnThresholdAmountClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnNextButtonClick;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnNextButtonClick extends com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnNextButtonClick INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnNextButtonClick();

        public final int hashCode() {
            return -2054439023;
        }

        private OnNextButtonClick() {
            super("OnNextButtonClick", null);
        }

        public final java.lang.String toString() {
            return "OnNextButtonClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnNextButtonClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnTurnOffButtonClick;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnTurnOffButtonClick extends com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnTurnOffButtonClick INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnTurnOffButtonClick();

        public final int hashCode() {
            return -599913322;
        }

        private OnTurnOffButtonClick() {
            super("OnTurnOffButtonClick", null);
        }

        public final java.lang.String toString() {
            return "OnTurnOffButtonClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnTurnOffButtonClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnBackButtonClick;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBackButtonClick extends com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnBackButtonClick INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnBackButtonClick();

        public final int hashCode() {
            return -238205667;
        }

        private OnBackButtonClick() {
            super("OnBackButtonClick", null);
        }

        public final java.lang.String toString() {
            return "OnBackButtonClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnBackButtonClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnSelectRechargeAmount;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;", "amount", "<init>", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;)V", "component1", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;", "copy", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;)Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnSelectRechargeAmount;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSelectRechargeAmount extends com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi amount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnSelectRechargeAmount(com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi) {
            super("OnSelectRechargeAmount", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadAmountUi, "");
            this.amount = reloadAmountUi;
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnSelectRechargeAmount(amount=");
            sb.append(reloadAmountUi);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnSelectRechargeAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, ((com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnSelectRechargeAmount) other).amount);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnSelectRechargeAmount copy(com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnSelectRechargeAmount(amount);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnSelectRechargeAmount copy$default(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnSelectRechargeAmount onSelectRechargeAmount, com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                reloadAmountUi = onSelectRechargeAmount.amount;
            }
            return onSelectRechargeAmount.copy(reloadAmountUi);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnSelectThresholdAmount;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;", "amount", "<init>", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;)V", "component1", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;", "copy", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;)Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnSelectThresholdAmount;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSelectThresholdAmount extends com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi amount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnSelectThresholdAmount(com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi) {
            super("OnSelectThresholdAmount", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadAmountUi, "");
            this.amount = reloadAmountUi;
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnSelectThresholdAmount(amount=");
            sb.append(reloadAmountUi);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnSelectThresholdAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, ((com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnSelectThresholdAmount) other).amount);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnSelectThresholdAmount copy(com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnSelectThresholdAmount(amount);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnSelectThresholdAmount copy$default(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnSelectThresholdAmount onSelectThresholdAmount, com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                reloadAmountUi = onSelectThresholdAmount.amount;
            }
            return onSelectThresholdAmount.copy(reloadAmountUi);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ0\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnUpdateRechargeOptions;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent;", "", "", "options", "formattedOptions", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEvent$OnUpdateRechargeOptions;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getOptions", "getFormattedOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnUpdateRechargeOptions extends com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent {
        public static final int $stable = 8;
        private final java.util.List<java.lang.String> formattedOptions;
        private final java.util.List<java.lang.String> options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnUpdateRechargeOptions(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
            super("OnUpdateRechargeOptions", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.options = list;
            this.formattedOptions = list2;
        }

        public final java.util.List<java.lang.String> getOptions() {
            return this.options;
        }

        public final java.util.List<java.lang.String> getFormattedOptions() {
            return this.formattedOptions;
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.String> list = this.options;
            java.util.List<java.lang.String> list2 = this.formattedOptions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnUpdateRechargeOptions(options=");
            sb.append(list);
            sb.append(", formattedOptions=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.options.hashCode() * 31) + this.formattedOptions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnUpdateRechargeOptions)) {
                return false;
            }
            com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnUpdateRechargeOptions onUpdateRechargeOptions = (com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnUpdateRechargeOptions) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.options, onUpdateRechargeOptions.options) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedOptions, onUpdateRechargeOptions.formattedOptions);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnUpdateRechargeOptions copy(java.util.List<java.lang.String> options, java.util.List<java.lang.String> formattedOptions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedOptions, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnUpdateRechargeOptions(options, formattedOptions);
        }

        public final java.util.List<java.lang.String> component2() {
            return this.formattedOptions;
        }

        public final java.util.List<java.lang.String> component1() {
            return this.options;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnUpdateRechargeOptions copy$default(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEvent.OnUpdateRechargeOptions onUpdateRechargeOptions, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = onUpdateRechargeOptions.options;
            }
            if ((i & 2) != 0) {
                list2 = onUpdateRechargeOptions.formattedOptions;
            }
            return onUpdateRechargeOptions.copy(list, list2);
        }
    }

    public /* synthetic */ LowBalanceEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
