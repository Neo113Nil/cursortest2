package com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u00042\u00020\u0001:\u0004\u0005\u0006\u0007\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardKey;", "", "<init>", "()V", "Companion", "Digit", "Decimal", "Backspace", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardKey$Backspace;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardKey$Decimal;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardKey$Digit;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class KeyboardKey {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey.Companion INSTANCE = new com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey.Companion(null);

    private KeyboardKey() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardKey$Digit;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardKey;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardKey$Digit;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getValue", "Companion_"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Digit extends com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey {
        public static final int $stable = 0;
        private static final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey.Digit.Companion_ Companion_ = new com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey.Digit.Companion_(null);

        @java.lang.Deprecated
        public static final int MAX_DIGIT = 9;

        @java.lang.Deprecated
        public static final int MIN_DIGIT = 0;
        private final int value;

        public Digit(int i) {
            super(null);
            this.value = i;
            if (i < 0 || i >= 10) {
                throw new java.lang.IllegalArgumentException("Digit must be between 0 and 9".toString());
            }
        }

        public final int getValue() {
            return this.value;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardKey$Digit$Companion_;", "", "<init>", "()V", "", "MIN_DIGIT", com.visa.cbp.getEncExpo.warmup, "MAX_DIGIT"}, k = 1, mv = {2, 3, 0}, xi = 48)
        static final class Companion_ {
            private Companion_() {
            }

            public /* synthetic */ Companion_(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            int i = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Digit(value=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.value);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey.Digit) && this.value == ((com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey.Digit) other).value;
        }

        public final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey.Digit copy(int value) {
            return new com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey.Digit(value);
        }

        /* renamed from: component1, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey.Digit copy$default(com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey.Digit digit, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = digit.value;
            }
            return digit.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardKey$Decimal;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardKey;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Decimal extends com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey.Decimal INSTANCE = new com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey.Decimal();

        public final int hashCode() {
            return -1031609001;
        }

        private Decimal() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Decimal";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey.Decimal)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardKey$Backspace;", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardKey;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Backspace extends com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey.Backspace INSTANCE = new com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey.Backspace();

        public final int hashCode() {
            return 1763069189;
        }

        private Backspace() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Backspace";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey.Backspace)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardKey$Companion;", "", "<init>", "()V", "", "char", "Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardKey;", "fromChar", "(C)Lcom/paypal/oslo/feature/moneymovement/api/amount/component/keyboard/KeyboardKey;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey fromChar(char r2) {
            if (java.lang.Character.isDigit(r2)) {
                return new com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey.Digit(kotlin.text.CharsKt.digitToInt(r2));
            }
            if (r2 == '.') {
                return com.paypal.oslo.feature.moneymovement.api.amount.component.keyboard.KeyboardKey.Decimal.INSTANCE;
            }
            return null;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ KeyboardKey(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
