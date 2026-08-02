package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/CustomStyle;", "Lcom/paypal/oslo/core/i18n/domain/model/DateFormat;", "", "pattern", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/model/CustomStyle;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPattern"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CustomStyle implements com.paypal.oslo.core.i18n.domain.model.DateFormat {
    private final java.lang.String pattern;

    public CustomStyle(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.pattern = str;
    }

    public final java.lang.String getPattern() {
        return this.pattern;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.pattern;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomStyle(pattern=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.pattern.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.core.i18n.domain.model.CustomStyle) && kotlin.jvm.internal.Intrinsics.areEqual(this.pattern, ((com.paypal.oslo.core.i18n.domain.model.CustomStyle) other).pattern);
    }

    public final com.paypal.oslo.core.i18n.domain.model.CustomStyle copy(java.lang.String pattern) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "");
        return new com.paypal.oslo.core.i18n.domain.model.CustomStyle(pattern);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPattern() {
        return this.pattern;
    }

    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.CustomStyle copy$default(com.paypal.oslo.core.i18n.domain.model.CustomStyle customStyle, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = customStyle.pattern;
        }
        return customStyle.copy(str);
    }
}
