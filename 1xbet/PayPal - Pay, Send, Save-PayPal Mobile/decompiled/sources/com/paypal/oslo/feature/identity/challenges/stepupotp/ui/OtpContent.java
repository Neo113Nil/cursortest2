package com.paypal.oslo.feature.identity.challenges.stepupotp.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/OtpContent;", "", "", "titleResId", "", "maskedTarget", "codeSentMessageResId", "<init>", "(ILjava/lang/String;I)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "copy", "(ILjava/lang/String;I)Lcom/paypal/oslo/feature/identity/challenges/stepupotp/ui/OtpContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getTitleResId", "Ljava/lang/String;", "getMaskedTarget", "getCodeSentMessageResId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class OtpContent {
    public static final int $stable = 0;
    private final int codeSentMessageResId;
    private final java.lang.String maskedTarget;
    private final int titleResId;

    public OtpContent(int i, java.lang.String str, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.titleResId = i;
        this.maskedTarget = str;
        this.codeSentMessageResId = i2;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }

    public final java.lang.String getMaskedTarget() {
        return this.maskedTarget;
    }

    public final int getCodeSentMessageResId() {
        return this.codeSentMessageResId;
    }

    public final java.lang.String toString() {
        int i = this.titleResId;
        java.lang.String str = this.maskedTarget;
        int i2 = this.codeSentMessageResId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OtpContent(titleResId=");
        sb.append(i);
        sb.append(", maskedTarget=");
        sb.append(str);
        sb.append(", codeSentMessageResId=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Integer.hashCode(this.titleResId) * 31) + this.maskedTarget.hashCode()) * 31) + java.lang.Integer.hashCode(this.codeSentMessageResId);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.challenges.stepupotp.ui.OtpContent)) {
            return false;
        }
        com.paypal.oslo.feature.identity.challenges.stepupotp.ui.OtpContent otpContent = (com.paypal.oslo.feature.identity.challenges.stepupotp.ui.OtpContent) other;
        return this.titleResId == otpContent.titleResId && kotlin.jvm.internal.Intrinsics.areEqual(this.maskedTarget, otpContent.maskedTarget) && this.codeSentMessageResId == otpContent.codeSentMessageResId;
    }

    public final com.paypal.oslo.feature.identity.challenges.stepupotp.ui.OtpContent copy(int titleResId, java.lang.String maskedTarget, int codeSentMessageResId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maskedTarget, "");
        return new com.paypal.oslo.feature.identity.challenges.stepupotp.ui.OtpContent(titleResId, maskedTarget, codeSentMessageResId);
    }

    /* renamed from: component3, reason: from getter */
    public final int getCodeSentMessageResId() {
        return this.codeSentMessageResId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMaskedTarget() {
        return this.maskedTarget;
    }

    /* renamed from: component1, reason: from getter */
    public final int getTitleResId() {
        return this.titleResId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupotp.ui.OtpContent copy$default(com.paypal.oslo.feature.identity.challenges.stepupotp.ui.OtpContent otpContent, int i, java.lang.String str, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = otpContent.titleResId;
        }
        if ((i3 & 2) != 0) {
            str = otpContent.maskedTarget;
        }
        if ((i3 & 4) != 0) {
            i2 = otpContent.codeSentMessageResId;
        }
        return otpContent.copy(i, str, i2);
    }
}
