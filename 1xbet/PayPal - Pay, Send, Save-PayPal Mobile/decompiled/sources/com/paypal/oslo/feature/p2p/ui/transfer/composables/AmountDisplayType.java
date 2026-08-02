package com.paypal.oslo.feature.p2p.ui.transfer.composables;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\b\tR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/composables/AmountDisplayType;", "", "Lkotlin/Function1;", "", "", "getOnAmountChange", "()Lkotlin/jvm/functions/Function1;", "onAmountChange", "Standard", "CrossBorder", "Lcom/paypal/oslo/feature/p2p/ui/transfer/composables/AmountDisplayType$CrossBorder;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/composables/AmountDisplayType$Standard;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface AmountDisplayType {
    kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnAmountChange();

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0015J\u0086\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b)\u0010\u0018J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u001aR&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u001cR&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b4\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u0010\u001fR\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\b8\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010+\u001a\u0004\b9\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/composables/AmountDisplayType$Standard;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/composables/AmountDisplayType;", "", "amount", "currencyCode", "", "selectedCurrencyIndex", "Landroidx/compose/ui/graphics/painter/Painter;", "cashAvatarPainter", "Lkotlin/Function1;", "", "onAmountChange", "onCurrencySelectionChange", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "money", "", "cryptoPickerEnabled", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILandroidx/compose/ui/graphics/painter/Painter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;ZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "()Landroidx/compose/ui/graphics/painter/Painter;", "component5", "()Lkotlin/jvm/functions/Function1;", "component6", "component7", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "component8", "()Z", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;ILandroidx/compose/ui/graphics/painter/Painter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;ZLjava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/transfer/composables/AmountDisplayType$Standard;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getAmount", "getCurrencyCode", com.visa.cbp.getEncExpo.warmup, "getSelectedCurrencyIndex", "Landroidx/compose/ui/graphics/painter/Painter;", "getCashAvatarPainter", "Lkotlin/jvm/functions/Function1;", "getOnAmountChange", "getOnCurrencySelectionChange", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "getMoney", "Z", "getCryptoPickerEnabled", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Standard implements com.paypal.oslo.feature.p2p.ui.transfer.composables.AmountDisplayType {
        public static final int $stable = androidx.compose.ui.graphics.painter.Painter.$stable;
        private final java.lang.String amount;
        private final androidx.compose.ui.graphics.painter.Painter cashAvatarPainter;
        private final boolean cryptoPickerEnabled;
        private final java.lang.String currencyCode;
        private final java.lang.String errorMessage;
        private final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount money;
        private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onAmountChange;
        private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> onCurrencySelectionChange;
        private final int selectedCurrencyIndex;

        /* JADX WARN: Multi-variable type inference failed */
        public Standard(java.lang.String str, java.lang.String str2, int i, androidx.compose.ui.graphics.painter.Painter painter, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function12, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, boolean z, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(painter, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
            this.amount = str;
            this.currencyCode = str2;
            this.selectedCurrencyIndex = i;
            this.cashAvatarPainter = painter;
            this.onAmountChange = function1;
            this.onCurrencySelectionChange = function12;
            this.money = moneyAmount;
            this.cryptoPickerEnabled = z;
            this.errorMessage = str3;
        }

        public /* synthetic */ Standard(java.lang.String str, java.lang.String str2, int i, androidx.compose.ui.graphics.painter.Painter painter, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, boolean z, java.lang.String str3, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, i, painter, function1, function12, (i2 & 64) != 0 ? null : moneyAmount, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? null : str3);
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final int getSelectedCurrencyIndex() {
            return this.selectedCurrencyIndex;
        }

        public final androidx.compose.ui.graphics.painter.Painter getCashAvatarPainter() {
            return this.cashAvatarPainter;
        }

        @Override // com.paypal.oslo.feature.p2p.ui.transfer.composables.AmountDisplayType
        public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnAmountChange() {
            return this.onAmountChange;
        }

        public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getOnCurrencySelectionChange() {
            return this.onCurrencySelectionChange;
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getMoney() {
            return this.money;
        }

        public final boolean getCryptoPickerEnabled() {
            return this.cryptoPickerEnabled;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.amount;
            java.lang.String str2 = this.currencyCode;
            int i = this.selectedCurrencyIndex;
            androidx.compose.ui.graphics.painter.Painter painter = this.cashAvatarPainter;
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = this.onAmountChange;
            kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> function12 = this.onCurrencySelectionChange;
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = this.money;
            boolean z = this.cryptoPickerEnabled;
            java.lang.String str3 = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Standard(amount=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(str2);
            sb.append(", selectedCurrencyIndex=");
            sb.append(i);
            sb.append(", cashAvatarPainter=");
            sb.append(painter);
            sb.append(", onAmountChange=");
            sb.append(function1);
            sb.append(", onCurrencySelectionChange=");
            sb.append(function12);
            sb.append(", money=");
            sb.append(moneyAmount);
            sb.append(", cryptoPickerEnabled=");
            sb.append(z);
            sb.append(", errorMessage=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.amount.hashCode();
            int hashCode2 = this.currencyCode.hashCode();
            int hashCode3 = java.lang.Integer.hashCode(this.selectedCurrencyIndex);
            int hashCode4 = this.cashAvatarPainter.hashCode();
            int hashCode5 = this.onAmountChange.hashCode();
            int hashCode6 = this.onCurrencySelectionChange.hashCode();
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = this.money;
            int hashCode7 = moneyAmount == null ? 0 : moneyAmount.hashCode();
            int hashCode8 = java.lang.Boolean.hashCode(this.cryptoPickerEnabled);
            java.lang.String str = this.errorMessage;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (str != null ? str.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.transfer.composables.AmountDisplayType.Standard)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.transfer.composables.AmountDisplayType.Standard standard = (com.paypal.oslo.feature.p2p.ui.transfer.composables.AmountDisplayType.Standard) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, standard.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, standard.currencyCode) && this.selectedCurrencyIndex == standard.selectedCurrencyIndex && kotlin.jvm.internal.Intrinsics.areEqual(this.cashAvatarPainter, standard.cashAvatarPainter) && kotlin.jvm.internal.Intrinsics.areEqual(this.onAmountChange, standard.onAmountChange) && kotlin.jvm.internal.Intrinsics.areEqual(this.onCurrencySelectionChange, standard.onCurrencySelectionChange) && kotlin.jvm.internal.Intrinsics.areEqual(this.money, standard.money) && this.cryptoPickerEnabled == standard.cryptoPickerEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, standard.errorMessage);
        }

        public final com.paypal.oslo.feature.p2p.ui.transfer.composables.AmountDisplayType.Standard copy(java.lang.String amount, java.lang.String currencyCode, int selectedCurrencyIndex, androidx.compose.ui.graphics.painter.Painter cashAvatarPainter, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onAmountChange, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onCurrencySelectionChange, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount money, boolean cryptoPickerEnabled, java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashAvatarPainter, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onAmountChange, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCurrencySelectionChange, "");
            return new com.paypal.oslo.feature.p2p.ui.transfer.composables.AmountDisplayType.Standard(amount, currencyCode, selectedCurrencyIndex, cashAvatarPainter, onAmountChange, onCurrencySelectionChange, money, cryptoPickerEnabled, errorMessage);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getCryptoPickerEnabled() {
            return this.cryptoPickerEnabled;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getMoney() {
            return this.money;
        }

        public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> component6() {
            return this.onCurrencySelectionChange;
        }

        public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> component5() {
            return this.onAmountChange;
        }

        /* renamed from: component4, reason: from getter */
        public final androidx.compose.ui.graphics.painter.Painter getCashAvatarPainter() {
            return this.cashAvatarPainter;
        }

        /* renamed from: component3, reason: from getter */
        public final int getSelectedCurrencyIndex() {
            return this.selectedCurrencyIndex;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u001c\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003¢\u0006\u0004\b%\u0010&J\u001c\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0016\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011HÆ\u0003¢\u0006\u0004\b*\u0010)J\u0010\u0010+\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b+\u0010$J\u0012\u0010,\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b.\u0010-JÎ\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00112\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00106\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b8\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b=\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b>\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b?\u0010\u001bR\u001a\u0010\t\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b@\u0010\u001eR\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\bA\u0010\u001bR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\b\f\u0010$R&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bD\u0010&R&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010C\u001a\u0004\bE\u0010&R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010F\u001a\u0004\bG\u0010)R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010F\u001a\u0004\bH\u0010)R\u001a\u0010\u0014\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010B\u001a\u0004\b\u0014\u0010$R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010I\u001a\u0004\bJ\u0010-R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010I\u001a\u0004\bK\u0010-"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/transfer/composables/AmountDisplayType$CrossBorder;", "Lcom/paypal/oslo/feature/p2p/ui/transfer/composables/AmountDisplayType;", "", "sendAmount", "sendCurrencyCode", "Landroidx/compose/ui/graphics/painter/Painter;", "sendCurrencyCodePainter", "receiveAmount", "receiveCurrencyCode", "receiveCurrencyCodePainter", "exchangeRate", "", "isLoadingReceiveAmount", "Lkotlin/Function1;", "", "onAmountChange", "onReceiveAmountChange", "Lkotlin/Function0;", "onSendCurrencyClick", "onReceiveCurrencyClick", "isReceiveAmountEditable", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "sendMoney", "receiveMoney", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Landroidx/compose/ui/graphics/painter/Painter;", "component4", "component5", "component6", "component7", "component8", "()Z", "component9", "()Lkotlin/jvm/functions/Function1;", "component10", "component11", "()Lkotlin/jvm/functions/Function0;", "component12", "component13", "component14", "()Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;)Lcom/paypal/oslo/feature/p2p/ui/transfer/composables/AmountDisplayType$CrossBorder;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSendAmount", "getSendCurrencyCode", "Landroidx/compose/ui/graphics/painter/Painter;", "getSendCurrencyCodePainter", "getReceiveAmount", "getReceiveCurrencyCode", "getReceiveCurrencyCodePainter", "getExchangeRate", "Z", "Lkotlin/jvm/functions/Function1;", "getOnAmountChange", "getOnReceiveAmountChange", "Lkotlin/jvm/functions/Function0;", "getOnSendCurrencyClick", "getOnReceiveCurrencyClick", "Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "getSendMoney", "getReceiveMoney"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CrossBorder implements com.paypal.oslo.feature.p2p.ui.transfer.composables.AmountDisplayType {
        public static final int $stable;
        private final java.lang.String exchangeRate;
        private final boolean isLoadingReceiveAmount;
        private final boolean isReceiveAmountEditable;
        private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onAmountChange;
        private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onReceiveAmountChange;
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onReceiveCurrencyClick;
        private final kotlin.jvm.functions.Function0<kotlin.Unit> onSendCurrencyClick;
        private final java.lang.String receiveAmount;
        private final java.lang.String receiveCurrencyCode;
        private final androidx.compose.ui.graphics.painter.Painter receiveCurrencyCodePainter;
        private final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount receiveMoney;
        private final java.lang.String sendAmount;
        private final java.lang.String sendCurrencyCode;
        private final androidx.compose.ui.graphics.painter.Painter sendCurrencyCodePainter;
        private final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount sendMoney;

        /* JADX WARN: Multi-variable type inference failed */
        public CrossBorder(java.lang.String str, java.lang.String str2, androidx.compose.ui.graphics.painter.Painter painter, java.lang.String str3, java.lang.String str4, androidx.compose.ui.graphics.painter.Painter painter2, java.lang.String str5, boolean z, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, boolean z2, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(painter, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(painter2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
            this.sendAmount = str;
            this.sendCurrencyCode = str2;
            this.sendCurrencyCodePainter = painter;
            this.receiveAmount = str3;
            this.receiveCurrencyCode = str4;
            this.receiveCurrencyCodePainter = painter2;
            this.exchangeRate = str5;
            this.isLoadingReceiveAmount = z;
            this.onAmountChange = function1;
            this.onReceiveAmountChange = function12;
            this.onSendCurrencyClick = function0;
            this.onReceiveCurrencyClick = function02;
            this.isReceiveAmountEditable = z2;
            this.sendMoney = moneyAmount;
            this.receiveMoney = moneyAmount2;
        }

        public final java.lang.String getSendAmount() {
            return this.sendAmount;
        }

        public final java.lang.String getSendCurrencyCode() {
            return this.sendCurrencyCode;
        }

        public final androidx.compose.ui.graphics.painter.Painter getSendCurrencyCodePainter() {
            return this.sendCurrencyCodePainter;
        }

        public final java.lang.String getReceiveAmount() {
            return this.receiveAmount;
        }

        public final java.lang.String getReceiveCurrencyCode() {
            return this.receiveCurrencyCode;
        }

        public final androidx.compose.ui.graphics.painter.Painter getReceiveCurrencyCodePainter() {
            return this.receiveCurrencyCodePainter;
        }

        public final java.lang.String getExchangeRate() {
            return this.exchangeRate;
        }

        public final boolean isLoadingReceiveAmount() {
            return this.isLoadingReceiveAmount;
        }

        @Override // com.paypal.oslo.feature.p2p.ui.transfer.composables.AmountDisplayType
        public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnAmountChange() {
            return this.onAmountChange;
        }

        public /* synthetic */ CrossBorder(java.lang.String str, java.lang.String str2, androidx.compose.ui.graphics.painter.Painter painter, java.lang.String str3, java.lang.String str4, androidx.compose.ui.graphics.painter.Painter painter2, java.lang.String str5, boolean z, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, boolean z2, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, painter, str3, str4, painter2, str5, z, function1, (i & 512) != 0 ? new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.transfer.composables.AmountDisplayType$CrossBorder$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.p2p.ui.transfer.composables.AmountDisplayType.CrossBorder.$r8$lambda$aJZpjgzIqQ3eMmgLziUw5GOsmcM((java.lang.String) obj);
                }
            } : function12, function0, function02, (i & 4096) != 0 ? true : z2, (i & 8192) != 0 ? null : moneyAmount, (i & 16384) != 0 ? null : moneyAmount2);
        }

        public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnReceiveAmountChange() {
            return this.onReceiveAmountChange;
        }

        public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnSendCurrencyClick() {
            return this.onSendCurrencyClick;
        }

        public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnReceiveCurrencyClick() {
            return this.onReceiveCurrencyClick;
        }

        public final boolean isReceiveAmountEditable() {
            return this.isReceiveAmountEditable;
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getSendMoney() {
            return this.sendMoney;
        }

        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getReceiveMoney() {
            return this.receiveMoney;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$aJZpjgzIqQ3eMmgLziUw5GOsmcM(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            return kotlin.Unit.INSTANCE;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.sendAmount;
            java.lang.String str2 = this.sendCurrencyCode;
            androidx.compose.ui.graphics.painter.Painter painter = this.sendCurrencyCodePainter;
            java.lang.String str3 = this.receiveAmount;
            java.lang.String str4 = this.receiveCurrencyCode;
            androidx.compose.ui.graphics.painter.Painter painter2 = this.receiveCurrencyCodePainter;
            java.lang.String str5 = this.exchangeRate;
            boolean z = this.isLoadingReceiveAmount;
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = this.onAmountChange;
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function12 = this.onReceiveAmountChange;
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onSendCurrencyClick;
            kotlin.jvm.functions.Function0<kotlin.Unit> function02 = this.onReceiveCurrencyClick;
            boolean z2 = this.isReceiveAmountEditable;
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = this.sendMoney;
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2 = this.receiveMoney;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CrossBorder(sendAmount=");
            sb.append(str);
            sb.append(", sendCurrencyCode=");
            sb.append(str2);
            sb.append(", sendCurrencyCodePainter=");
            sb.append(painter);
            sb.append(", receiveAmount=");
            sb.append(str3);
            sb.append(", receiveCurrencyCode=");
            sb.append(str4);
            sb.append(", receiveCurrencyCodePainter=");
            sb.append(painter2);
            sb.append(", exchangeRate=");
            sb.append(str5);
            sb.append(", isLoadingReceiveAmount=");
            sb.append(z);
            sb.append(", onAmountChange=");
            sb.append(function1);
            sb.append(", onReceiveAmountChange=");
            sb.append(function12);
            sb.append(", onSendCurrencyClick=");
            sb.append(function0);
            sb.append(", onReceiveCurrencyClick=");
            sb.append(function02);
            sb.append(", isReceiveAmountEditable=");
            sb.append(z2);
            sb.append(", sendMoney=");
            sb.append(moneyAmount);
            sb.append(", receiveMoney=");
            sb.append(moneyAmount2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.sendAmount.hashCode();
            int hashCode2 = this.sendCurrencyCode.hashCode();
            int hashCode3 = this.sendCurrencyCodePainter.hashCode();
            int hashCode4 = this.receiveAmount.hashCode();
            int hashCode5 = this.receiveCurrencyCode.hashCode();
            int hashCode6 = this.receiveCurrencyCodePainter.hashCode();
            int hashCode7 = this.exchangeRate.hashCode();
            int hashCode8 = java.lang.Boolean.hashCode(this.isLoadingReceiveAmount);
            int hashCode9 = this.onAmountChange.hashCode();
            int hashCode10 = this.onReceiveAmountChange.hashCode();
            int hashCode11 = this.onSendCurrencyClick.hashCode();
            int hashCode12 = this.onReceiveCurrencyClick.hashCode();
            int hashCode13 = java.lang.Boolean.hashCode(this.isReceiveAmountEditable);
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount = this.sendMoney;
            int hashCode14 = moneyAmount == null ? 0 : moneyAmount.hashCode();
            com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount2 = this.receiveMoney;
            return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + (moneyAmount2 != null ? moneyAmount2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.transfer.composables.AmountDisplayType.CrossBorder)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.transfer.composables.AmountDisplayType.CrossBorder crossBorder = (com.paypal.oslo.feature.p2p.ui.transfer.composables.AmountDisplayType.CrossBorder) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.sendAmount, crossBorder.sendAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.sendCurrencyCode, crossBorder.sendCurrencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.sendCurrencyCodePainter, crossBorder.sendCurrencyCodePainter) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiveAmount, crossBorder.receiveAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiveCurrencyCode, crossBorder.receiveCurrencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiveCurrencyCodePainter, crossBorder.receiveCurrencyCodePainter) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRate, crossBorder.exchangeRate) && this.isLoadingReceiveAmount == crossBorder.isLoadingReceiveAmount && kotlin.jvm.internal.Intrinsics.areEqual(this.onAmountChange, crossBorder.onAmountChange) && kotlin.jvm.internal.Intrinsics.areEqual(this.onReceiveAmountChange, crossBorder.onReceiveAmountChange) && kotlin.jvm.internal.Intrinsics.areEqual(this.onSendCurrencyClick, crossBorder.onSendCurrencyClick) && kotlin.jvm.internal.Intrinsics.areEqual(this.onReceiveCurrencyClick, crossBorder.onReceiveCurrencyClick) && this.isReceiveAmountEditable == crossBorder.isReceiveAmountEditable && kotlin.jvm.internal.Intrinsics.areEqual(this.sendMoney, crossBorder.sendMoney) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiveMoney, crossBorder.receiveMoney);
        }

        public final com.paypal.oslo.feature.p2p.ui.transfer.composables.AmountDisplayType.CrossBorder copy(java.lang.String sendAmount, java.lang.String sendCurrencyCode, androidx.compose.ui.graphics.painter.Painter sendCurrencyCodePainter, java.lang.String receiveAmount, java.lang.String receiveCurrencyCode, androidx.compose.ui.graphics.painter.Painter receiveCurrencyCodePainter, java.lang.String exchangeRate, boolean isLoadingReceiveAmount, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onAmountChange, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onReceiveAmountChange, kotlin.jvm.functions.Function0<kotlin.Unit> onSendCurrencyClick, kotlin.jvm.functions.Function0<kotlin.Unit> onReceiveCurrencyClick, boolean isReceiveAmountEditable, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount sendMoney, com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount receiveMoney) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendCurrencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendCurrencyCodePainter, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiveAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiveCurrencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiveCurrencyCodePainter, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRate, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onAmountChange, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onReceiveAmountChange, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onSendCurrencyClick, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onReceiveCurrencyClick, "");
            return new com.paypal.oslo.feature.p2p.ui.transfer.composables.AmountDisplayType.CrossBorder(sendAmount, sendCurrencyCode, sendCurrencyCodePainter, receiveAmount, receiveCurrencyCode, receiveCurrencyCodePainter, exchangeRate, isLoadingReceiveAmount, onAmountChange, onReceiveAmountChange, onSendCurrencyClick, onReceiveCurrencyClick, isReceiveAmountEditable, sendMoney, receiveMoney);
        }

        public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> component9() {
            return this.onAmountChange;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsLoadingReceiveAmount() {
            return this.isLoadingReceiveAmount;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getExchangeRate() {
            return this.exchangeRate;
        }

        /* renamed from: component6, reason: from getter */
        public final androidx.compose.ui.graphics.painter.Painter getReceiveCurrencyCodePainter() {
            return this.receiveCurrencyCodePainter;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getReceiveCurrencyCode() {
            return this.receiveCurrencyCode;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getReceiveAmount() {
            return this.receiveAmount;
        }

        /* renamed from: component3, reason: from getter */
        public final androidx.compose.ui.graphics.painter.Painter getSendCurrencyCodePainter() {
            return this.sendCurrencyCodePainter;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSendCurrencyCode() {
            return this.sendCurrencyCode;
        }

        /* renamed from: component15, reason: from getter */
        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getReceiveMoney() {
            return this.receiveMoney;
        }

        /* renamed from: component14, reason: from getter */
        public final com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount getSendMoney() {
            return this.sendMoney;
        }

        /* renamed from: component13, reason: from getter */
        public final boolean getIsReceiveAmountEditable() {
            return this.isReceiveAmountEditable;
        }

        public final kotlin.jvm.functions.Function0<kotlin.Unit> component12() {
            return this.onReceiveCurrencyClick;
        }

        public final kotlin.jvm.functions.Function0<kotlin.Unit> component11() {
            return this.onSendCurrencyClick;
        }

        public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> component10() {
            return this.onReceiveAmountChange;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSendAmount() {
            return this.sendAmount;
        }

        static {
            int i = androidx.compose.ui.graphics.painter.Painter.$stable;
            $stable = i | i;
        }
    }
}
