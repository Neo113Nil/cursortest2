package com.paypal.oslo.feature.bnplacquisition.ui.common.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/LocalizedDateFormat;", "", "", "inputMask", "datePattern", "validationPattern", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/LocalizedDateFormat;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInputMask", "getDatePattern", "getValidationPattern"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LocalizedDateFormat {
    public static final int $stable = 0;
    private final java.lang.String datePattern;
    private final java.lang.String inputMask;
    private final java.lang.String validationPattern;

    public LocalizedDateFormat(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.inputMask = str;
        this.datePattern = str2;
        this.validationPattern = str3;
    }

    public final java.lang.String getInputMask() {
        return this.inputMask;
    }

    public final java.lang.String getDatePattern() {
        return this.datePattern;
    }

    public final java.lang.String getValidationPattern() {
        return this.validationPattern;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.inputMask;
        java.lang.String str2 = this.datePattern;
        java.lang.String str3 = this.validationPattern;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LocalizedDateFormat(inputMask=");
        sb.append(str);
        sb.append(", datePattern=");
        sb.append(str2);
        sb.append(", validationPattern=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.inputMask.hashCode() * 31) + this.datePattern.hashCode()) * 31) + this.validationPattern.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.LocalizedDateFormat)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.common.model.LocalizedDateFormat localizedDateFormat = (com.paypal.oslo.feature.bnplacquisition.ui.common.model.LocalizedDateFormat) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.inputMask, localizedDateFormat.inputMask) && kotlin.jvm.internal.Intrinsics.areEqual(this.datePattern, localizedDateFormat.datePattern) && kotlin.jvm.internal.Intrinsics.areEqual(this.validationPattern, localizedDateFormat.validationPattern);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.LocalizedDateFormat copy(java.lang.String inputMask, java.lang.String datePattern, java.lang.String validationPattern) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputMask, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datePattern, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationPattern, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.LocalizedDateFormat(inputMask, datePattern, validationPattern);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getValidationPattern() {
        return this.validationPattern;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDatePattern() {
        return this.datePattern;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getInputMask() {
        return this.inputMask;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.LocalizedDateFormat copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.LocalizedDateFormat localizedDateFormat, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = localizedDateFormat.inputMask;
        }
        if ((i & 2) != 0) {
            str2 = localizedDateFormat.datePattern;
        }
        if ((i & 4) != 0) {
            str3 = localizedDateFormat.validationPattern;
        }
        return localizedDateFormat.copy(str, str2, str3);
    }
}
