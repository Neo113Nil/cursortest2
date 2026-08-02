package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/CurrencyCode;", "", "", "code", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "toString-impl", "toString", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes10.dex */
public final class CurrencyCode {
    private final java.lang.String code;

    private /* synthetic */ CurrencyCode(java.lang.String str) {
        this.code = str;
    }

    public final java.lang.String getCode() {
        return this.code;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static java.lang.String m11384constructorimpl(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        if (new kotlin.text.Regex("^[A-Z]{3}$").matches(upperCase)) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid currency code: ");
        sb.append(upperCase);
        sb.append(". It must be a 3-letter uppercase ISO 4217 code.");
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ java.lang.String m11389unboximpl() {
        return this.code;
    }

    public final java.lang.String toString() {
        return m11388toStringimpl(this.code);
    }

    public final int hashCode() {
        return m11387hashCodeimpl(this.code);
    }

    public final boolean equals(java.lang.Object obj) {
        return m11385equalsimpl(this.code, obj);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m11388toStringimpl(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencyCode(code=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11387hashCodeimpl(java.lang.String str) {
        return str.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11386equalsimpl0(java.lang.String str, java.lang.String str2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(str, str2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11385equalsimpl(java.lang.String str, java.lang.Object obj) {
        return (obj instanceof com.paypal.oslo.core.i18n.domain.model.CurrencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(str, ((com.paypal.oslo.core.i18n.domain.model.CurrencyCode) obj).m11389unboximpl());
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.CurrencyCode m11383boximpl(java.lang.String str) {
        return new com.paypal.oslo.core.i18n.domain.model.CurrencyCode(str);
    }
}
