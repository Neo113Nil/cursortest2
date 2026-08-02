package com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u0007\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardConfig;", "", "", "showDecimalKey", "showPreselectedAmountChips", "", "maxInputLength", "isEnabled", "<init>", "(ZZIZ)V", "component1", "()Z", "component2", "component3", "()I", "component4", "copy", "(ZZIZ)Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Z", "getShowDecimalKey", "getShowPreselectedAmountChips", com.visa.cbp.getEncExpo.warmup, "getMaxInputLength", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class KeyboardConfig {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig.Companion INSTANCE = new com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig.Companion(null);
    private final boolean isEnabled;
    private final int maxInputLength;
    private final boolean showDecimalKey;
    private final boolean showPreselectedAmountChips;

    public KeyboardConfig(boolean z, boolean z2, int i, boolean z3) {
        this.showDecimalKey = z;
        this.showPreselectedAmountChips = z2;
        this.maxInputLength = i;
        this.isEnabled = z3;
    }

    public /* synthetic */ KeyboardConfig(boolean z, boolean z2, int i, boolean z3, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? 9 : i, (i2 & 8) != 0 ? true : z3);
    }

    public final boolean getShowDecimalKey() {
        return this.showDecimalKey;
    }

    public final boolean getShowPreselectedAmountChips() {
        return this.showPreselectedAmountChips;
    }

    public final int getMaxInputLength() {
        return this.maxInputLength;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardConfig$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardConfig;", "fiatDefault", "()Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardConfig;", "wholeNumbersOnly"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig fiatDefault() {
            return new com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig(false, false, 0, false, 15, null);
        }

        public final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig wholeNumbersOnly() {
            return new com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig(false, false, 0, false, 14, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        boolean z = this.showDecimalKey;
        boolean z2 = this.showPreselectedAmountChips;
        int i = this.maxInputLength;
        boolean z3 = this.isEnabled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("KeyboardConfig(showDecimalKey=");
        sb.append(z);
        sb.append(", showPreselectedAmountChips=");
        sb.append(z2);
        sb.append(", maxInputLength=");
        sb.append(i);
        sb.append(", isEnabled=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.showDecimalKey) * 31) + java.lang.Boolean.hashCode(this.showPreselectedAmountChips)) * 31) + java.lang.Integer.hashCode(this.maxInputLength)) * 31) + java.lang.Boolean.hashCode(this.isEnabled);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig keyboardConfig = (com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig) other;
        return this.showDecimalKey == keyboardConfig.showDecimalKey && this.showPreselectedAmountChips == keyboardConfig.showPreselectedAmountChips && this.maxInputLength == keyboardConfig.maxInputLength && this.isEnabled == keyboardConfig.isEnabled;
    }

    public final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig copy(boolean showDecimalKey, boolean showPreselectedAmountChips, int maxInputLength, boolean isEnabled) {
        return new com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig(showDecimalKey, showPreselectedAmountChips, maxInputLength, isEnabled);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxInputLength() {
        return this.maxInputLength;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowPreselectedAmountChips() {
        return this.showPreselectedAmountChips;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowDecimalKey() {
        return this.showDecimalKey;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig copy$default(com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardConfig keyboardConfig, boolean z, boolean z2, int i, boolean z3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = keyboardConfig.showDecimalKey;
        }
        if ((i2 & 2) != 0) {
            z2 = keyboardConfig.showPreselectedAmountChips;
        }
        if ((i2 & 4) != 0) {
            i = keyboardConfig.maxInputLength;
        }
        if ((i2 & 8) != 0) {
            z3 = keyboardConfig.isEnabled;
        }
        return keyboardConfig.copy(z, z2, i, z3);
    }

    public KeyboardConfig() {
        this(false, false, 0, false, 15, null);
    }
}
