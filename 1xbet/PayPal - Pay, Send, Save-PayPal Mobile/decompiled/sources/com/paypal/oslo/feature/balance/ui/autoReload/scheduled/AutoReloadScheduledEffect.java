package com.paypal.oslo.feature.balance.ui.autoReload.scheduled;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OpenScheduledFrequencyBottomSheet", "OpenScheduledAmountBottomSheet", "OpenReviewBottomSheet", "TurnOffAutoReloadResult", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledEffect$OpenReviewBottomSheet;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledEffect$OpenScheduledAmountBottomSheet;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledEffect$OpenScheduledFrequencyBottomSheet;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledEffect$TurnOffAutoReloadResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class AutoReloadScheduledEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledEffect$OpenScheduledFrequencyBottomSheet;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledEffect;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;", "frequency", "<init>", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;)V", "component1", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;", "copy", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;)Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledEffect$OpenScheduledFrequencyBottomSheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;", "getFrequency"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenScheduledFrequencyBottomSheet extends com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency frequency;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenScheduledFrequencyBottomSheet(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency autoReloadFrequency) {
            super("OpenScheduledFrequencyBottomSheet", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadFrequency, "");
            this.frequency = autoReloadFrequency;
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency getFrequency() {
            return this.frequency;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency autoReloadFrequency = this.frequency;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenScheduledFrequencyBottomSheet(frequency=");
            sb.append(autoReloadFrequency);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.frequency.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenScheduledFrequencyBottomSheet) && kotlin.jvm.internal.Intrinsics.areEqual(this.frequency, ((com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenScheduledFrequencyBottomSheet) other).frequency);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenScheduledFrequencyBottomSheet copy(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency frequency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequency, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenScheduledFrequencyBottomSheet(frequency);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency getFrequency() {
            return this.frequency;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenScheduledFrequencyBottomSheet copy$default(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenScheduledFrequencyBottomSheet openScheduledFrequencyBottomSheet, com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency autoReloadFrequency, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                autoReloadFrequency = openScheduledFrequencyBottomSheet.frequency;
            }
            return openScheduledFrequencyBottomSheet.copy(autoReloadFrequency);
        }
    }

    private AutoReloadScheduledEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018Jv\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\tHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b,\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b-\u0010\u0013R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b0\u0010\u0013R\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b1\u0010\u0013R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b2\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledEffect$OpenScheduledAmountBottomSheet;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledEffect;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent;", "intent", "", "currencyCode", "currencySymbol", "minimumAmount", "maximumAmount", "", "options", "formattedMinimum", "formattedMaximum", "formattedOptions", "<init>", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "copy", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledEffect$OpenScheduledAmountBottomSheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadAmountIntent;", "getIntent", "Ljava/lang/String;", "getCurrencyCode", "getCurrencySymbol", "getMinimumAmount", "getMaximumAmount", "Ljava/util/List;", "getOptions", "getFormattedMinimum", "getFormattedMaximum", "getFormattedOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenScheduledAmountBottomSheet extends com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect {
        public static final int $stable = 8;
        private final java.lang.String currencyCode;
        private final java.lang.String currencySymbol;
        private final java.lang.String formattedMaximum;
        private final java.lang.String formattedMinimum;
        private final java.util.List<java.lang.String> formattedOptions;
        private final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent intent;
        private final java.lang.String maximumAmount;
        private final java.lang.String minimumAmount;
        private final java.util.List<java.lang.String> options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenScheduledAmountBottomSheet(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent autoReloadAmountIntent, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List<java.lang.String> list, java.lang.String str5, java.lang.String str6, java.util.List<java.lang.String> list2) {
            super("OpenScheduledAmountBottomSheet", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadAmountIntent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.intent = autoReloadAmountIntent;
            this.currencyCode = str;
            this.currencySymbol = str2;
            this.minimumAmount = str3;
            this.maximumAmount = str4;
            this.options = list;
            this.formattedMinimum = str5;
            this.formattedMaximum = str6;
            this.formattedOptions = list2;
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent getIntent() {
            return this.intent;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final java.lang.String getCurrencySymbol() {
            return this.currencySymbol;
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
            com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent autoReloadAmountIntent = this.intent;
            java.lang.String str = this.currencyCode;
            java.lang.String str2 = this.currencySymbol;
            java.lang.String str3 = this.minimumAmount;
            java.lang.String str4 = this.maximumAmount;
            java.util.List<java.lang.String> list = this.options;
            java.lang.String str5 = this.formattedMinimum;
            java.lang.String str6 = this.formattedMaximum;
            java.util.List<java.lang.String> list2 = this.formattedOptions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenScheduledAmountBottomSheet(intent=");
            sb.append(autoReloadAmountIntent);
            sb.append(", currencyCode=");
            sb.append(str);
            sb.append(", currencySymbol=");
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
            return (((((((((((((((this.intent.hashCode() * 31) + this.currencyCode.hashCode()) * 31) + this.currencySymbol.hashCode()) * 31) + this.minimumAmount.hashCode()) * 31) + this.maximumAmount.hashCode()) * 31) + this.options.hashCode()) * 31) + this.formattedMinimum.hashCode()) * 31) + this.formattedMaximum.hashCode()) * 31) + this.formattedOptions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenScheduledAmountBottomSheet)) {
                return false;
            }
            com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenScheduledAmountBottomSheet openScheduledAmountBottomSheet = (com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenScheduledAmountBottomSheet) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.intent, openScheduledAmountBottomSheet.intent) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, openScheduledAmountBottomSheet.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencySymbol, openScheduledAmountBottomSheet.currencySymbol) && kotlin.jvm.internal.Intrinsics.areEqual(this.minimumAmount, openScheduledAmountBottomSheet.minimumAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.maximumAmount, openScheduledAmountBottomSheet.maximumAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.options, openScheduledAmountBottomSheet.options) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedMinimum, openScheduledAmountBottomSheet.formattedMinimum) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedMaximum, openScheduledAmountBottomSheet.formattedMaximum) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedOptions, openScheduledAmountBottomSheet.formattedOptions);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenScheduledAmountBottomSheet copy(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent intent, java.lang.String currencyCode, java.lang.String currencySymbol, java.lang.String minimumAmount, java.lang.String maximumAmount, java.util.List<java.lang.String> options, java.lang.String formattedMinimum, java.lang.String formattedMaximum, java.util.List<java.lang.String> formattedOptions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencySymbol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minimumAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maximumAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedMinimum, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedMaximum, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedOptions, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenScheduledAmountBottomSheet(intent, currencyCode, currencySymbol, minimumAmount, maximumAmount, options, formattedMinimum, formattedMaximum, formattedOptions);
        }

        public final java.util.List<java.lang.String> component9() {
            return this.formattedOptions;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getFormattedMaximum() {
            return this.formattedMaximum;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getFormattedMinimum() {
            return this.formattedMinimum;
        }

        public final java.util.List<java.lang.String> component6() {
            return this.options;
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
        public final java.lang.String getCurrencySymbol() {
            return this.currencySymbol;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadAmountIntent getIntent() {
            return this.intent;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledEffect$OpenReviewBottomSheet;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledEffect;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy;", "strategy", "", "currencyCode", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "<init>", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadFlowType;)V", "component1", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadFlowType;", "copy", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadFlowType;)Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledEffect$OpenReviewBottomSheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/ReviewReloadStrategy;", "getStrategy", "Ljava/lang/String;", "getCurrencyCode", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/AutoReloadFlowType;", "getFlowType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenReviewBottomSheet extends com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect {
        public static final int $stable = 8;
        private final java.lang.String currencyCode;
        private final com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadFlowType flowType;
        private final com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy strategy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenReviewBottomSheet(com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy reviewReloadStrategy, java.lang.String str, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadFlowType autoReloadFlowType) {
            super("OpenReviewBottomSheet", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewReloadStrategy, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoReloadFlowType, "");
            this.strategy = reviewReloadStrategy;
            this.currencyCode = str;
            this.flowType = autoReloadFlowType;
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy getStrategy() {
            return this.strategy;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadFlowType getFlowType() {
            return this.flowType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy reviewReloadStrategy = this.strategy;
            java.lang.String str = this.currencyCode;
            com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadFlowType autoReloadFlowType = this.flowType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenReviewBottomSheet(strategy=");
            sb.append(reviewReloadStrategy);
            sb.append(", currencyCode=");
            sb.append(str);
            sb.append(", flowType=");
            sb.append(autoReloadFlowType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.strategy.hashCode() * 31) + this.currencyCode.hashCode()) * 31) + this.flowType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenReviewBottomSheet)) {
                return false;
            }
            com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenReviewBottomSheet openReviewBottomSheet = (com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenReviewBottomSheet) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.strategy, openReviewBottomSheet.strategy) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, openReviewBottomSheet.currencyCode) && this.flowType == openReviewBottomSheet.flowType;
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenReviewBottomSheet copy(com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy strategy, java.lang.String currencyCode, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadFlowType flowType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenReviewBottomSheet(strategy, currencyCode, flowType);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadFlowType getFlowType() {
            return this.flowType;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy getStrategy() {
            return this.strategy;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenReviewBottomSheet copy$default(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenReviewBottomSheet openReviewBottomSheet, com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewReloadStrategy reviewReloadStrategy, java.lang.String str, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadFlowType autoReloadFlowType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                reviewReloadStrategy = openReviewBottomSheet.strategy;
            }
            if ((i & 2) != 0) {
                str = openReviewBottomSheet.currencyCode;
            }
            if ((i & 4) != 0) {
                autoReloadFlowType = openReviewBottomSheet.flowType;
            }
            return openReviewBottomSheet.copy(reviewReloadStrategy, str, autoReloadFlowType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledEffect$TurnOffAutoReloadResult;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TurnOffAutoReloadResult extends com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.TurnOffAutoReloadResult INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.TurnOffAutoReloadResult();

        public final int hashCode() {
            return -1894758001;
        }

        private TurnOffAutoReloadResult() {
            super("TurnOffAutoReloadResult", null);
        }

        public final java.lang.String toString() {
            return "TurnOffAutoReloadResult";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.TurnOffAutoReloadResult)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ AutoReloadScheduledEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
