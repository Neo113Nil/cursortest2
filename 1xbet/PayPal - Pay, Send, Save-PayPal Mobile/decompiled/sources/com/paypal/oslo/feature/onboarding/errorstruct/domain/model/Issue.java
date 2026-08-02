package com.paypal.oslo.feature.onboarding.errorstruct.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/Issue;", "", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/CosErrorCode;", "errorCode", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "field", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/CosErrorCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/CosErrorCode;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/CosErrorCode;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/Issue;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/CosErrorCode;", "getErrorCode", "Ljava/lang/String;", "getDescription", "getField", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Issue {
    public static final int $stable = 0;
    private final java.lang.String description;
    private final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode errorCode;
    private final java.lang.String field;
    private final java.lang.String value;

    public Issue(com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cosErrorCode, "");
        this.errorCode = cosErrorCode;
        this.description = str;
        this.field = str2;
        this.value = str3;
    }

    public final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode getErrorCode() {
        return this.errorCode;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String getField() {
        return this.field;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode = this.errorCode;
        java.lang.String str = this.description;
        java.lang.String str2 = this.field;
        java.lang.String str3 = this.value;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Issue(errorCode=");
        sb.append(cosErrorCode);
        sb.append(", description=");
        sb.append(str);
        sb.append(", field=");
        sb.append(str2);
        sb.append(", value=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.errorCode.hashCode();
        java.lang.String str = this.description;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.field;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.value;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.Issue)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.errorstruct.domain.model.Issue issue = (com.paypal.oslo.feature.onboarding.errorstruct.domain.model.Issue) other;
        return this.errorCode == issue.errorCode && kotlin.jvm.internal.Intrinsics.areEqual(this.description, issue.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.field, issue.field) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, issue.value);
    }

    public final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.Issue copy(com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode errorCode, java.lang.String description, java.lang.String field, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
        return new com.paypal.oslo.feature.onboarding.errorstruct.domain.model.Issue(errorCode, description, field, value);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getField() {
        return this.field;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode getErrorCode() {
        return this.errorCode;
    }

    public static /* synthetic */ com.paypal.oslo.feature.onboarding.errorstruct.domain.model.Issue copy$default(com.paypal.oslo.feature.onboarding.errorstruct.domain.model.Issue issue, com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode cosErrorCode, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cosErrorCode = issue.errorCode;
        }
        if ((i & 2) != 0) {
            str = issue.description;
        }
        if ((i & 4) != 0) {
            str2 = issue.field;
        }
        if ((i & 8) != 0) {
            str3 = issue.value;
        }
        return issue.copy(cosErrorCode, str, str2, str3);
    }
}
