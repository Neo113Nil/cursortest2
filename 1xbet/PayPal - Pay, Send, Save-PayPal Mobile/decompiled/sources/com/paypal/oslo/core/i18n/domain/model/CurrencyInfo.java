package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/CurrencyInfo;", "", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyCode;", "currencyCode", "", "currencySymbol", "currencyName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-h-kTgrg", "()Ljava/lang/String;", "component1", "component2", "component3", "copy-sKlSBDo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/model/CurrencyInfo;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCurrencyCode-h-kTgrg", "getCurrencySymbol", "getCurrencyName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CurrencyInfo {
    private final java.lang.String currencyCode;
    private final java.lang.String currencyName;
    private final java.lang.String currencySymbol;

    private CurrencyInfo(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.currencyCode = str;
        this.currencySymbol = str2;
        this.currencyName = str3;
    }

    /* renamed from: getCurrencyCode-h-kTgrg, reason: not valid java name */
    public final java.lang.String m11397getCurrencyCodehkTgrg() {
        return this.currencyCode;
    }

    public final java.lang.String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public final java.lang.String getCurrencyName() {
        return this.currencyName;
    }

    public final java.lang.String toString() {
        java.lang.String m11388toStringimpl = com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11388toStringimpl(this.currencyCode);
        java.lang.String str = this.currencySymbol;
        java.lang.String str2 = this.currencyName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencyInfo(currencyCode=");
        sb.append(m11388toStringimpl);
        sb.append(", currencySymbol=");
        sb.append(str);
        sb.append(", currencyName=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11387hashCodeimpl(this.currencyCode) * 31) + this.currencySymbol.hashCode()) * 31) + this.currencyName.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.i18n.domain.model.CurrencyInfo)) {
            return false;
        }
        com.paypal.oslo.core.i18n.domain.model.CurrencyInfo currencyInfo = (com.paypal.oslo.core.i18n.domain.model.CurrencyInfo) other;
        return com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11386equalsimpl0(this.currencyCode, currencyInfo.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencySymbol, currencyInfo.currencySymbol) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyName, currencyInfo.currencyName);
    }

    /* renamed from: copy-sKlSBDo, reason: not valid java name */
    public final com.paypal.oslo.core.i18n.domain.model.CurrencyInfo m11396copysKlSBDo(java.lang.String currencyCode, java.lang.String currencySymbol, java.lang.String currencyName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencySymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyName, "");
        return new com.paypal.oslo.core.i18n.domain.model.CurrencyInfo(currencyCode, currencySymbol, currencyName, null);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCurrencyName() {
        return this.currencyName;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCurrencySymbol() {
        return this.currencySymbol;
    }

    /* renamed from: component1-h-kTgrg, reason: not valid java name and from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: copy-sKlSBDo$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.CurrencyInfo m11394copysKlSBDo$default(com.paypal.oslo.core.i18n.domain.model.CurrencyInfo currencyInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = currencyInfo.currencyCode;
        }
        if ((i & 2) != 0) {
            str2 = currencyInfo.currencySymbol;
        }
        if ((i & 4) != 0) {
            str3 = currencyInfo.currencyName;
        }
        return currencyInfo.m11396copysKlSBDo(str, str2, str3);
    }

    public /* synthetic */ CurrencyInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3);
    }
}
