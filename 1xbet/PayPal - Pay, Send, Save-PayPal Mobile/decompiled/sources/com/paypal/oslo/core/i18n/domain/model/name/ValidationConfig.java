package com.paypal.oslo.core.i18n.domain.model.name;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010JH\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/name/ValidationConfig;", "", "", "countryRegex", "defaultRegex", "pattern", "", "regexShouldMatch", "caseSensitive", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/paypal/oslo/core/i18n/domain/model/name/ValidationConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCountryRegex", "getDefaultRegex", "getPattern", "Z", "getRegexShouldMatch", "getCaseSensitive"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ValidationConfig {
    private final boolean caseSensitive;
    private final java.lang.String countryRegex;
    private final java.lang.String defaultRegex;
    private final java.lang.String pattern;
    private final boolean regexShouldMatch;

    public ValidationConfig(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2) {
        this.countryRegex = str;
        this.defaultRegex = str2;
        this.pattern = str3;
        this.regexShouldMatch = z;
        this.caseSensitive = z2;
    }

    public /* synthetic */ ValidationConfig(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2);
    }

    public final java.lang.String getCountryRegex() {
        return this.countryRegex;
    }

    public final java.lang.String getDefaultRegex() {
        return this.defaultRegex;
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

    public final java.lang.String toString() {
        java.lang.String str = this.countryRegex;
        java.lang.String str2 = this.defaultRegex;
        java.lang.String str3 = this.pattern;
        boolean z = this.regexShouldMatch;
        boolean z2 = this.caseSensitive;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationConfig(countryRegex=");
        sb.append(str);
        sb.append(", defaultRegex=");
        sb.append(str2);
        sb.append(", pattern=");
        sb.append(str3);
        sb.append(", regexShouldMatch=");
        sb.append(z);
        sb.append(", caseSensitive=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.countryRegex;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.defaultRegex;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.pattern;
        return (((((((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.regexShouldMatch)) * 31) + java.lang.Boolean.hashCode(this.caseSensitive);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.i18n.domain.model.name.ValidationConfig)) {
            return false;
        }
        com.paypal.oslo.core.i18n.domain.model.name.ValidationConfig validationConfig = (com.paypal.oslo.core.i18n.domain.model.name.ValidationConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.countryRegex, validationConfig.countryRegex) && kotlin.jvm.internal.Intrinsics.areEqual(this.defaultRegex, validationConfig.defaultRegex) && kotlin.jvm.internal.Intrinsics.areEqual(this.pattern, validationConfig.pattern) && this.regexShouldMatch == validationConfig.regexShouldMatch && this.caseSensitive == validationConfig.caseSensitive;
    }

    public final com.paypal.oslo.core.i18n.domain.model.name.ValidationConfig copy(java.lang.String countryRegex, java.lang.String defaultRegex, java.lang.String pattern, boolean regexShouldMatch, boolean caseSensitive) {
        return new com.paypal.oslo.core.i18n.domain.model.name.ValidationConfig(countryRegex, defaultRegex, pattern, regexShouldMatch, caseSensitive);
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getCaseSensitive() {
        return this.caseSensitive;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getRegexShouldMatch() {
        return this.regexShouldMatch;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPattern() {
        return this.pattern;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDefaultRegex() {
        return this.defaultRegex;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCountryRegex() {
        return this.countryRegex;
    }

    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.name.ValidationConfig copy$default(com.paypal.oslo.core.i18n.domain.model.name.ValidationConfig validationConfig, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = validationConfig.countryRegex;
        }
        if ((i & 2) != 0) {
            str2 = validationConfig.defaultRegex;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = validationConfig.pattern;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            z = validationConfig.regexShouldMatch;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = validationConfig.caseSensitive;
        }
        return validationConfig.copy(str, str4, str5, z3, z2);
    }
}
