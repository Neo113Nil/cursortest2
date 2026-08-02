package com.ingo.sdk.kotlin.ux.textmachine;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/ingo/sdk/kotlin/ux/textmachine/AmountInputTextMachine;", "", "", "textInputString", "<init>", "(Ljava/lang/String;)V", "", "i", "", "onNumberInput", "(I)V", "", "getValueAsCents", "()J", "onBackSpace", "()V", "clear", "getFormattedTextString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AmountInputTextMachine {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.lang.String Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;

    public AmountInputTextMachine(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRangesFor = 8;
    }

    public /* synthetic */ AmountInputTextMachine(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    public final void onNumberInput(int i) {
        if (i < 0 || i > 9) {
            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.e$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Amount Text Machine", "Invalid Input", null, 4, null);
            return;
        }
        if (this.Camera2StreamConfigurationMap.length() <= this.getHighSpeedVideoFpsRangesFor) {
            java.lang.String str = this.Camera2StreamConfigurationMap;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(i);
            this.Camera2StreamConfigurationMap = sb.toString();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, "0")) {
            onBackSpace();
        }
    }

    public final long getValueAsCents() {
        return java.lang.Long.parseLong(this.Camera2StreamConfigurationMap);
    }

    public final void onBackSpace() {
        com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging().d("Amount Text Input Machine", "onBackSpace pre ".concat(java.lang.String.valueOf(this.Camera2StreamConfigurationMap)));
        java.lang.String str = "";
        if (this.Camera2StreamConfigurationMap.length() > 0) {
            java.lang.String substring = this.Camera2StreamConfigurationMap.substring(0, r0.length() - 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            str = substring;
        }
        this.Camera2StreamConfigurationMap = str;
        com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging().d("Amount Text Input Machine", "onBackSpace post ".concat(java.lang.String.valueOf(this.Camera2StreamConfigurationMap)));
    }

    public final void clear() {
        this.Camera2StreamConfigurationMap = "";
    }

    public final java.lang.String getFormattedTextString() {
        java.lang.String str = this.Camera2StreamConfigurationMap;
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.asReversed(kotlin.text.StringsKt.chunked(kotlin.text.StringsKt.reversed(java.lang.String.valueOf(!kotlin.text.StringsKt.isBlank(str) ? java.lang.Long.parseLong(str) / 100 : 0L)).toString(), 3)), ",", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.kotlin.ux.textmachine.AmountInputTextMachine$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.kotlin.ux.textmachine.AmountInputTextMachine.$r8$lambda$KmkRSJOuxWvKUugJ0FRmr7Ic1fI((java.lang.String) obj);
            }
        }, 30, null);
        java.lang.String str2 = this.Camera2StreamConfigurationMap;
        java.lang.String valueOf = java.lang.String.valueOf(kotlin.text.StringsKt.isBlank(str2) ? 0L : java.lang.Long.parseLong(str2) % 100);
        if (valueOf.length() == 1) {
            valueOf = "0".concat(java.lang.String.valueOf(valueOf));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD);
        sb.append(joinToString$default);
        sb.append(".");
        sb.append(valueOf);
        return sb.toString();
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$KmkRSJOuxWvKUugJ0FRmr7Ic1fI(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.text.StringsKt.reversed(str).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AmountInputTextMachine() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
