package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\"\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JL\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\"\u0010\u0011R,\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/BusinessValidationData;", "", "", "pattern", "", "regexShouldMatch", "caseSensitive", "Lkotlin/Function1;", "", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "Lcom/paypal/oslo/core/i18n/domain/model/NameValidationError;", "errorCreator", "<init>", "(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "()Lkotlin/jvm/functions/Function1;", "copy", "(Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/core/i18n/domain/usecase/BusinessValidationData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPattern", "Z", "getRegexShouldMatch", "getCaseSensitive", "Lkotlin/jvm/functions/Function1;", "getErrorCreator"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class BusinessValidationData {
    private final boolean caseSensitive;
    private final kotlin.jvm.functions.Function1<java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Field>, com.paypal.oslo.core.i18n.domain.model.NameValidationError> errorCreator;
    private final java.lang.String pattern;
    private final boolean regexShouldMatch;

    /* JADX WARN: Multi-variable type inference failed */
    public BusinessValidationData(java.lang.String str, boolean z, boolean z2, kotlin.jvm.functions.Function1<? super java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Field>, ? extends com.paypal.oslo.core.i18n.domain.model.NameValidationError> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.pattern = str;
        this.regexShouldMatch = z;
        this.caseSensitive = z2;
        this.errorCreator = function1;
    }

    public /* synthetic */ BusinessValidationData(java.lang.String str, boolean z, boolean z2, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z, z2, function1);
    }

    public final java.lang.String getPattern() {
        return this.pattern;
    }

    public final boolean getRegexShouldMatch() {
        return this.regexShouldMatch;
    }

    public final boolean getCaseSensitive() {
        return this.caseSensitive;
    }

    public final kotlin.jvm.functions.Function1<java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Field>, com.paypal.oslo.core.i18n.domain.model.NameValidationError> getErrorCreator() {
        return this.errorCreator;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.pattern;
        boolean z = this.regexShouldMatch;
        boolean z2 = this.caseSensitive;
        kotlin.jvm.functions.Function1<java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Field>, com.paypal.oslo.core.i18n.domain.model.NameValidationError> function1 = this.errorCreator;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BusinessValidationData(pattern=");
        sb.append(str);
        sb.append(", regexShouldMatch=");
        sb.append(z);
        sb.append(", caseSensitive=");
        sb.append(z2);
        sb.append(", errorCreator=");
        sb.append(function1);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.pattern;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + java.lang.Boolean.hashCode(this.regexShouldMatch)) * 31) + java.lang.Boolean.hashCode(this.caseSensitive)) * 31) + this.errorCreator.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.i18n.domain.usecase.BusinessValidationData)) {
            return false;
        }
        com.paypal.oslo.core.i18n.domain.usecase.BusinessValidationData businessValidationData = (com.paypal.oslo.core.i18n.domain.usecase.BusinessValidationData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.pattern, businessValidationData.pattern) && this.regexShouldMatch == businessValidationData.regexShouldMatch && this.caseSensitive == businessValidationData.caseSensitive && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCreator, businessValidationData.errorCreator);
    }

    public final com.paypal.oslo.core.i18n.domain.usecase.BusinessValidationData copy(java.lang.String pattern, boolean regexShouldMatch, boolean caseSensitive, kotlin.jvm.functions.Function1<? super java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Field>, ? extends com.paypal.oslo.core.i18n.domain.model.NameValidationError> errorCreator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCreator, "");
        return new com.paypal.oslo.core.i18n.domain.usecase.BusinessValidationData(pattern, regexShouldMatch, caseSensitive, errorCreator);
    }

    public final kotlin.jvm.functions.Function1<java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Field>, com.paypal.oslo.core.i18n.domain.model.NameValidationError> component4() {
        return this.errorCreator;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCaseSensitive() {
        return this.caseSensitive;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getRegexShouldMatch() {
        return this.regexShouldMatch;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPattern() {
        return this.pattern;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.usecase.BusinessValidationData copy$default(com.paypal.oslo.core.i18n.domain.usecase.BusinessValidationData businessValidationData, java.lang.String str, boolean z, boolean z2, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = businessValidationData.pattern;
        }
        if ((i & 2) != 0) {
            z = businessValidationData.regexShouldMatch;
        }
        if ((i & 4) != 0) {
            z2 = businessValidationData.caseSensitive;
        }
        if ((i & 8) != 0) {
            function1 = businessValidationData.errorCreator;
        }
        return businessValidationData.copy(str, z, z2, function1);
    }
}
