package com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0084\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00062\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b\u0007\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b-\u0010\u0013R\u001a\u0010\t\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b.\u0010\u0017R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u0010\u001bR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u0010\u001dR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b3\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpVerificationState;", "", "", "codeValue", "title", "maskedTarget", "", "isLoading", "errorMessage", "showMoreOptions", "Lkotlin/Function1;", "", "onCodeChange", "Lkotlin/Function0;", "onResendCode", "onMoreOptionsClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "component6", "component7", "()Lkotlin/jvm/functions/Function1;", "component8", "()Lkotlin/jvm/functions/Function0;", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/mvi/StepupOtpVerificationState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCodeValue", "getTitle", "getMaskedTarget", "Z", "getErrorMessage", "getShowMoreOptions", "Lkotlin/jvm/functions/Function1;", "getOnCodeChange", "Lkotlin/jvm/functions/Function0;", "getOnResendCode", "getOnMoreOptionsClick"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class StepupOtpVerificationState {
    public static final int $stable = 0;
    private final java.lang.String codeValue;
    private final java.lang.String errorMessage;
    private final boolean isLoading;
    private final java.lang.String maskedTarget;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onCodeChange;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onMoreOptionsClick;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onResendCode;
    private final boolean showMoreOptions;
    private final java.lang.String title;

    /* JADX WARN: Multi-variable type inference failed */
    public StepupOtpVerificationState(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, boolean z2, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        this.codeValue = str;
        this.title = str2;
        this.maskedTarget = str3;
        this.isLoading = z;
        this.errorMessage = str4;
        this.showMoreOptions = z2;
        this.onCodeChange = function1;
        this.onResendCode = function0;
        this.onMoreOptionsClick = function02;
    }

    public /* synthetic */ StepupOtpVerificationState(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, boolean z2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? true : z2, function1, function0, function02);
    }

    public final java.lang.String getCodeValue() {
        return this.codeValue;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getMaskedTarget() {
        return this.maskedTarget;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean getShowMoreOptions() {
        return this.showMoreOptions;
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOnCodeChange() {
        return this.onCodeChange;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnResendCode() {
        return this.onResendCode;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnMoreOptionsClick() {
        return this.onMoreOptionsClick;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.codeValue;
        java.lang.String str2 = this.title;
        java.lang.String str3 = this.maskedTarget;
        boolean z = this.isLoading;
        java.lang.String str4 = this.errorMessage;
        boolean z2 = this.showMoreOptions;
        kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = this.onCodeChange;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onResendCode;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02 = this.onMoreOptionsClick;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StepupOtpVerificationState(codeValue=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", maskedTarget=");
        sb.append(str3);
        sb.append(", isLoading=");
        sb.append(z);
        sb.append(", errorMessage=");
        sb.append(str4);
        sb.append(", showMoreOptions=");
        sb.append(z2);
        sb.append(", onCodeChange=");
        sb.append(function1);
        sb.append(", onResendCode=");
        sb.append(function0);
        sb.append(", onMoreOptionsClick=");
        sb.append(function02);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.codeValue.hashCode();
        int hashCode2 = this.title.hashCode();
        int hashCode3 = this.maskedTarget.hashCode();
        int hashCode4 = java.lang.Boolean.hashCode(this.isLoading);
        java.lang.String str = this.errorMessage;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.showMoreOptions)) * 31) + this.onCodeChange.hashCode()) * 31) + this.onResendCode.hashCode()) * 31) + this.onMoreOptionsClick.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpVerificationState)) {
            return false;
        }
        com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpVerificationState stepupOtpVerificationState = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpVerificationState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.codeValue, stepupOtpVerificationState.codeValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, stepupOtpVerificationState.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.maskedTarget, stepupOtpVerificationState.maskedTarget) && this.isLoading == stepupOtpVerificationState.isLoading && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, stepupOtpVerificationState.errorMessage) && this.showMoreOptions == stepupOtpVerificationState.showMoreOptions && kotlin.jvm.internal.Intrinsics.areEqual(this.onCodeChange, stepupOtpVerificationState.onCodeChange) && kotlin.jvm.internal.Intrinsics.areEqual(this.onResendCode, stepupOtpVerificationState.onResendCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.onMoreOptionsClick, stepupOtpVerificationState.onMoreOptionsClick);
    }

    public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpVerificationState copy(java.lang.String codeValue, java.lang.String title, java.lang.String maskedTarget, boolean isLoading, java.lang.String errorMessage, boolean showMoreOptions, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onCodeChange, kotlin.jvm.functions.Function0<kotlin.Unit> onResendCode, kotlin.jvm.functions.Function0<kotlin.Unit> onMoreOptionsClick) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(codeValue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maskedTarget, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCodeChange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onResendCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onMoreOptionsClick, "");
        return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.mvi.StepupOtpVerificationState(codeValue, title, maskedTarget, isLoading, errorMessage, showMoreOptions, onCodeChange, onResendCode, onMoreOptionsClick);
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component9() {
        return this.onMoreOptionsClick;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component8() {
        return this.onResendCode;
    }

    public final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> component7() {
        return this.onCodeChange;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowMoreOptions() {
        return this.showMoreOptions;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMaskedTarget() {
        return this.maskedTarget;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCodeValue() {
        return this.codeValue;
    }
}
