package com.paypal.oslo.feature.balance.ui.autoReload.scheduled;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", "Loading", "LoadingTurnOff", "Success", "InitializeError", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledState$Initial;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledState$InitializeError;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledState$Loading;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledState$LoadingTurnOff;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AutoReloadScheduledState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledState$Initial;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Initial INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Initial();

        public final int hashCode() {
            return 1800824146;
        }

        private Initial() {
            super("AutoReloadScheduledStateInitial", null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Initial)) {
                return false;
            }
            return true;
        }
    }

    private AutoReloadScheduledState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledState$Loading;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Loading INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Loading();

        public final int hashCode() {
            return 189132618;
        }

        private Loading() {
            super("AutoReloadScheduledStateLoading", null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledState$LoadingTurnOff;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadingTurnOff extends com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.LoadingTurnOff INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.LoadingTurnOff();

        public final int hashCode() {
            return 381831432;
        }

        private LoadingTurnOff() {
            super("AutoReloadScheduledStateLoadingTurnOff", null);
        }

        public final java.lang.String toString() {
            return "LoadingTurnOff";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.LoadingTurnOff)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u0010HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b'\u0010\u001eJ\u0010\u0010(\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b(\u0010\u001eJ\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u0010HÆ\u0003¢\u0006\u0004\b)\u0010&J \u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0010HÆ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b3\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010\u001cR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010 R\u001a\u0010\f\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b\f\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b>\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b?\u0010\u001eR\u001a\u0010\u000f\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b@\u0010\u001eR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bB\u0010&R\u001a\u0010\u0012\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010:\u001a\u0004\bC\u0010\u001eR\u001a\u0010\u0013\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010:\u001a\u0004\bD\u0010\u001eR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010A\u001a\u0004\bE\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledState$Success;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledState;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;", "frequency", "Ljava/time/LocalDate;", "startDate", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;", "reloadAmount", "", "currencyCode", "", "shouldShowTurnOffOption", "isAutoReloadEnabled", "financialInstrumentId", "minimumAmount", "maximumAmount", "", "options", "formattedMinimum", "formattedMaximum", "formattedOptions", "<init>", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;Ljava/time/LocalDate;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;", "component2", "()Ljava/time/LocalDate;", "component3", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;", "component4", "()Ljava/lang/String;", "component5", "()Z", "component6", "component7", "component8", "component9", "component10", "()Ljava/util/List;", "component11", "component12", "component13", "copy", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;Ljava/time/LocalDate;Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledState$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;", "getFrequency", "Ljava/time/LocalDate;", "getStartDate", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReloadAmountUi;", "getReloadAmount", "Ljava/lang/String;", "getCurrencyCode", "Z", "getShouldShowTurnOffOption", "getFinancialInstrumentId", "getMinimumAmount", "getMaximumAmount", "Ljava/util/List;", "getOptions", "getFormattedMinimum", "getFormattedMaximum", "getFormattedOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState {
        public static final int $stable = 8;
        private final java.lang.String currencyCode;
        private final java.lang.String financialInstrumentId;
        private final java.lang.String formattedMaximum;
        private final java.lang.String formattedMinimum;
        private final java.util.List<java.lang.String> formattedOptions;
        private final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency frequency;
        private final boolean isAutoReloadEnabled;
        private final java.lang.String maximumAmount;
        private final java.lang.String minimumAmount;
        private final java.util.List<java.lang.String> options;
        private final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmount;
        private final boolean shouldShowTurnOffOption;
        private final java.time.LocalDate startDate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency autoReloadFrequency, java.time.LocalDate localDate, com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi, java.lang.String str, boolean z, boolean z2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List<java.lang.String> list, java.lang.String str5, java.lang.String str6, java.util.List<java.lang.String> list2) {
            super("AutoReloadScheduledStateSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadFrequency, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadAmountUi, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.frequency = autoReloadFrequency;
            this.startDate = localDate;
            this.reloadAmount = reloadAmountUi;
            this.currencyCode = str;
            this.shouldShowTurnOffOption = z;
            this.isAutoReloadEnabled = z2;
            this.financialInstrumentId = str2;
            this.minimumAmount = str3;
            this.maximumAmount = str4;
            this.options = list;
            this.formattedMinimum = str5;
            this.formattedMaximum = str6;
            this.formattedOptions = list2;
        }

        public /* synthetic */ Success(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency autoReloadFrequency, java.time.LocalDate localDate, com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi, java.lang.String str, boolean z, boolean z2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, java.lang.String str5, java.lang.String str6, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(autoReloadFrequency, localDate, reloadAmountUi, str, z, z2, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? "" : str4, (i & 512) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 1024) != 0 ? "" : str5, (i & 2048) != 0 ? "" : str6, (i & 4096) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency getFrequency() {
            return this.frequency;
        }

        public final java.time.LocalDate getStartDate() {
            return this.startDate;
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi getReloadAmount() {
            return this.reloadAmount;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final boolean getShouldShowTurnOffOption() {
            return this.shouldShowTurnOffOption;
        }

        public final boolean isAutoReloadEnabled() {
            return this.isAutoReloadEnabled;
        }

        public final java.lang.String getFinancialInstrumentId() {
            return this.financialInstrumentId;
        }

        public final java.lang.String getMinimumAmount() {
            return this.minimumAmount;
        }

        public final java.lang.String getMaximumAmount() {
            return this.maximumAmount;
        }

        public final java.util.List<java.lang.String> getOptions() {
            return this.options;
        }

        public final java.lang.String getFormattedMinimum() {
            return this.formattedMinimum;
        }

        public final java.lang.String getFormattedMaximum() {
            return this.formattedMaximum;
        }

        public final java.util.List<java.lang.String> getFormattedOptions() {
            return this.formattedOptions;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency autoReloadFrequency = this.frequency;
            java.time.LocalDate localDate = this.startDate;
            com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmountUi = this.reloadAmount;
            java.lang.String str = this.currencyCode;
            boolean z = this.shouldShowTurnOffOption;
            boolean z2 = this.isAutoReloadEnabled;
            java.lang.String str2 = this.financialInstrumentId;
            java.lang.String str3 = this.minimumAmount;
            java.lang.String str4 = this.maximumAmount;
            java.util.List<java.lang.String> list = this.options;
            java.lang.String str5 = this.formattedMinimum;
            java.lang.String str6 = this.formattedMaximum;
            java.util.List<java.lang.String> list2 = this.formattedOptions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(frequency=");
            sb.append(autoReloadFrequency);
            sb.append(", startDate=");
            sb.append(localDate);
            sb.append(", reloadAmount=");
            sb.append(reloadAmountUi);
            sb.append(", currencyCode=");
            sb.append(str);
            sb.append(", shouldShowTurnOffOption=");
            sb.append(z);
            sb.append(", isAutoReloadEnabled=");
            sb.append(z2);
            sb.append(", financialInstrumentId=");
            sb.append(str2);
            sb.append(", minimumAmount=");
            sb.append(str3);
            sb.append(", maximumAmount=");
            sb.append(str4);
            sb.append(", options=");
            sb.append(list);
            sb.append(", formattedMinimum=");
            sb.append(str5);
            sb.append(", formattedMaximum=");
            sb.append(str6);
            sb.append(", formattedOptions=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.frequency.hashCode();
            int hashCode2 = this.startDate.hashCode();
            int hashCode3 = this.reloadAmount.hashCode();
            int hashCode4 = this.currencyCode.hashCode();
            int hashCode5 = java.lang.Boolean.hashCode(this.shouldShowTurnOffOption);
            int hashCode6 = java.lang.Boolean.hashCode(this.isAutoReloadEnabled);
            java.lang.String str = this.financialInstrumentId;
            return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.minimumAmount.hashCode()) * 31) + this.maximumAmount.hashCode()) * 31) + this.options.hashCode()) * 31) + this.formattedMinimum.hashCode()) * 31) + this.formattedMaximum.hashCode()) * 31) + this.formattedOptions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Success success = (com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.frequency, success.frequency) && kotlin.jvm.internal.Intrinsics.areEqual(this.startDate, success.startDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.reloadAmount, success.reloadAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, success.currencyCode) && this.shouldShowTurnOffOption == success.shouldShowTurnOffOption && this.isAutoReloadEnabled == success.isAutoReloadEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.financialInstrumentId, success.financialInstrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.minimumAmount, success.minimumAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.maximumAmount, success.maximumAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.options, success.options) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedMinimum, success.formattedMinimum) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedMaximum, success.formattedMaximum) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedOptions, success.formattedOptions);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Success copy(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency frequency, java.time.LocalDate startDate, com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi reloadAmount, java.lang.String currencyCode, boolean shouldShowTurnOffOption, boolean isAutoReloadEnabled, java.lang.String financialInstrumentId, java.lang.String minimumAmount, java.lang.String maximumAmount, java.util.List<java.lang.String> options, java.lang.String formattedMinimum, java.lang.String formattedMaximum, java.util.List<java.lang.String> formattedOptions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequency, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDate, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minimumAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maximumAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedMinimum, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedMaximum, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedOptions, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.Success(frequency, startDate, reloadAmount, currencyCode, shouldShowTurnOffOption, isAutoReloadEnabled, financialInstrumentId, minimumAmount, maximumAmount, options, formattedMinimum, formattedMaximum, formattedOptions);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getMaximumAmount() {
            return this.maximumAmount;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getMinimumAmount() {
            return this.minimumAmount;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getFinancialInstrumentId() {
            return this.financialInstrumentId;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsAutoReloadEnabled() {
            return this.isAutoReloadEnabled;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShouldShowTurnOffOption() {
            return this.shouldShowTurnOffOption;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReloadAmountUi getReloadAmount() {
            return this.reloadAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final java.time.LocalDate getStartDate() {
            return this.startDate;
        }

        public final java.util.List<java.lang.String> component13() {
            return this.formattedOptions;
        }

        /* renamed from: component12, reason: from getter */
        public final java.lang.String getFormattedMaximum() {
            return this.formattedMaximum;
        }

        /* renamed from: component11, reason: from getter */
        public final java.lang.String getFormattedMinimum() {
            return this.formattedMinimum;
        }

        public final java.util.List<java.lang.String> component10() {
            return this.options;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency getFrequency() {
            return this.frequency;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledState$InitializeError;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InitializeError extends com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.InitializeError INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.InitializeError();

        public final int hashCode() {
            return -1266945946;
        }

        private InitializeError() {
            super("AutoReloadScheduledStateError", null);
        }

        public final java.lang.String toString() {
            return "InitializeError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledState.InitializeError)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ AutoReloadScheduledState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
