package com.paypal.pds.components.textinput;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0016\u0017\u0018\u0019\u001aB-\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0001\u0005\u001b\u001c\u001d\u001e\u001f"}, d2 = {"Lcom/paypal/pds/components/textinput/VisualTransformation;", "", "Landroidx/compose/foundation/text/input/OutputTransformation;", "p0", "Landroidx/compose/foundation/text/input/InputTransformation;", "p1", "", "p2", "<init>", "(Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/InputTransformation;Ljava/lang/String;)V", "outputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "getOutputTransformation$pds_release", "()Landroidx/compose/foundation/text/input/OutputTransformation;", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "getInputTransformation$pds_release", "()Landroidx/compose/foundation/text/input/InputTransformation;", "prefix", "Ljava/lang/String;", "getPrefix$pds_release", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Password", "Number", "PhoneWithDialingCode", "Currency", "Lcom/paypal/pds/components/textinput/VisualTransformation$Currency;", "Lcom/paypal/pds/components/textinput/VisualTransformation$None;", "Lcom/paypal/pds/components/textinput/VisualTransformation$Number;", "Lcom/paypal/pds/components/textinput/VisualTransformation$Password;", "Lcom/paypal/pds/components/textinput/VisualTransformation$PhoneWithDialingCode;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class VisualTransformation {
    public static final int $stable = 0;
    private final androidx.compose.foundation.text.input.InputTransformation inputTransformation;
    private final androidx.compose.foundation.text.input.OutputTransformation outputTransformation;
    private final java.lang.String prefix;

    private VisualTransformation(androidx.compose.foundation.text.input.OutputTransformation outputTransformation, androidx.compose.foundation.text.input.InputTransformation inputTransformation, java.lang.String str) {
        this.outputTransformation = outputTransformation;
        this.inputTransformation = inputTransformation;
        this.prefix = str;
    }

    public /* synthetic */ VisualTransformation(androidx.compose.foundation.text.input.OutputTransformation outputTransformation, androidx.compose.foundation.text.input.InputTransformation inputTransformation, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : outputTransformation, (i & 2) != 0 ? null : inputTransformation, (i & 4) != 0 ? null : str, null);
    }

    /* renamed from: getOutputTransformation$pds_release, reason: from getter */
    public final androidx.compose.foundation.text.input.OutputTransformation getOutputTransformation() {
        return this.outputTransformation;
    }

    /* renamed from: getInputTransformation$pds_release, reason: from getter */
    public final androidx.compose.foundation.text.input.InputTransformation getInputTransformation() {
        return this.inputTransformation;
    }

    /* renamed from: getPrefix$pds_release, reason: from getter */
    public final java.lang.String getPrefix() {
        return this.prefix;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/textinput/VisualTransformation$None;", "Lcom/paypal/pds/components/textinput/VisualTransformation;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class None extends com.paypal.pds.components.textinput.VisualTransformation {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.textinput.VisualTransformation.None INSTANCE = new com.paypal.pds.components.textinput.VisualTransformation.None();

        private None() {
            super(null, null, null, 7, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/textinput/VisualTransformation$Password;", "Lcom/paypal/pds/components/textinput/VisualTransformation;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Password extends com.paypal.pds.components.textinput.VisualTransformation {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.textinput.VisualTransformation.Password INSTANCE = new com.paypal.pds.components.textinput.VisualTransformation.Password();

        private Password() {
            super(new androidx.compose.foundation.text.input.OutputTransformation() { // from class: com.paypal.pds.components.textinput.VisualTransformation$Password$$ExternalSyntheticLambda0
                @Override // androidx.compose.foundation.text.input.OutputTransformation
                public final void transformOutput(androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer) {
                    com.paypal.pds.components.textinput.VisualTransformation.Password.m22095$r8$lambda$n4Pn88ydzoUduTlbIuhZSIZR5A(textFieldBuffer);
                }
            }, null, null, 6, null);
        }

        /* renamed from: $r8$lambda$n4Pn88ydzoUdu-TlbIuhZSIZR5A, reason: not valid java name */
        public static /* synthetic */ void m22095$r8$lambda$n4Pn88ydzoUduTlbIuhZSIZR5A(androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textFieldBuffer, "");
            if (textFieldBuffer.getLength() > 0) {
                textFieldBuffer.replace(0, textFieldBuffer.getLength(), kotlin.text.StringsKt.repeat("•", textFieldBuffer.getLength()));
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/pds/components/textinput/VisualTransformation$Number;", "Lcom/paypal/pds/components/textinput/VisualTransformation;", "", com.daon.sdk.face.license.License.FEATURE_MASK, "<init>", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Number extends com.paypal.pds.components.textinput.VisualTransformation {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Number(java.lang.String str) {
            super(new com.paypal.pds.components.textinput.NumberMaskingOutputTransformation(str), new com.paypal.pds.components.textinput.NumberMaskingInputTransformation(str), null, 4, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/pds/components/textinput/VisualTransformation$PhoneWithDialingCode;", "Lcom/paypal/pds/components/textinput/VisualTransformation;", "", com.daon.sdk.face.license.License.FEATURE_MASK, "dialingCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PhoneWithDialingCode extends com.paypal.pds.components.textinput.VisualTransformation {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PhoneWithDialingCode(java.lang.String str, java.lang.String str2) {
            super(new com.paypal.pds.components.textinput.NumberMaskingOutputTransformation(str), new com.paypal.pds.components.textinput.NumberMaskingInputTransformation(str), str2, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fB%\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000fB\u001d\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u0010"}, d2 = {"Lcom/paypal/pds/components/textinput/VisualTransformation$Currency;", "Lcom/paypal/pds/components/textinput/VisualTransformation;", "Lcom/paypal/pds/components/textinput/CurrencyFormattingConfig;", "p0", "<init>", "(Lcom/paypal/pds/components/textinput/CurrencyFormattingConfig;)V", "Ljava/util/Locale;", "locale", "Ljava/util/Currency;", "currency", "", "disableFractionalEntry", "(Ljava/util/Locale;Ljava/util/Currency;Z)V", "", "localeString", "(Ljava/lang/String;Ljava/util/Currency;Z)V", "(Ljava/util/Currency;Z)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Currency extends com.paypal.pds.components.textinput.VisualTransformation {
        public static final int $stable = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Currency(com.paypal.pds.components.textinput.CurrencyFormattingConfig currencyFormattingConfig) {
            super(r0, r1, kotlin.text.StringsKt.isBlank(r5) ? null : r5, null);
            com.paypal.pds.components.textinput.CurrencyOutputTransformation currencyOutputTransformation = new com.paypal.pds.components.textinput.CurrencyOutputTransformation(currencyFormattingConfig);
            com.paypal.pds.components.textinput.CurrencyFilteringInputTransformation currencyFilteringInputTransformation = new com.paypal.pds.components.textinput.CurrencyFilteringInputTransformation(currencyFormattingConfig);
            java.lang.String currencySymbol = currencyFormattingConfig.getCurrencySymbol();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Currency(java.util.Locale locale, java.util.Currency currency, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(locale, currency, (i & 4) != 0 ? false : z);
            if ((i & 2) != 0) {
                currency = java.util.Currency.getInstance("USD");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currency, "");
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Currency(java.util.Locale locale, java.util.Currency currency, boolean z) {
            this(com.paypal.pds.components.textinput.CurrencyFormattingConfigFactory.create$default(com.paypal.pds.components.textinput.CurrencyFormattingConfigFactory.INSTANCE, locale, null, currency, z, 2, null));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Currency(java.lang.String str, java.util.Currency currency, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, currency, (i & 4) != 0 ? false : z);
            if ((i & 2) != 0) {
                currency = java.util.Currency.getInstance("USD");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currency, "");
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Currency(java.lang.String str, java.util.Currency currency, boolean z) {
            this(com.paypal.pds.components.textinput.CurrencyFormattingConfigFactory.create$default(com.paypal.pds.components.textinput.CurrencyFormattingConfigFactory.INSTANCE, null, str, currency, z, 1, null));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Currency(java.util.Currency currency, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(currency, (i & 2) != 0 ? false : z);
            if ((i & 1) != 0) {
                currency = java.util.Currency.getInstance("USD");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currency, "");
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Currency(java.util.Currency currency, boolean z) {
            this(com.paypal.pds.components.textinput.CurrencyFormattingConfigFactory.create$default(com.paypal.pds.components.textinput.CurrencyFormattingConfigFactory.INSTANCE, null, "en_US", currency, z, 1, null));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        }
    }

    public /* synthetic */ VisualTransformation(androidx.compose.foundation.text.input.OutputTransformation outputTransformation, androidx.compose.foundation.text.input.InputTransformation inputTransformation, java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(outputTransformation, inputTransformation, str);
    }
}
