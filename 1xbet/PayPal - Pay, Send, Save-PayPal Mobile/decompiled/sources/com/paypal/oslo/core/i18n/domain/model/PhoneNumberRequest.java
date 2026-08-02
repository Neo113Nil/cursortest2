package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberRequest;", "", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "regionCode", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-ALGuh4w", "()Ljava/lang/String;", "component1", "copy-tgPz1l0", "(Ljava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberRequest;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getRegionCode-ALGuh4w"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PhoneNumberRequest {
    private final java.lang.String regionCode;

    private PhoneNumberRequest(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.regionCode = str;
    }

    /* renamed from: getRegionCode-ALGuh4w, reason: not valid java name */
    public final java.lang.String m11458getRegionCodeALGuh4w() {
        return this.regionCode;
    }

    public final java.lang.String toString() {
        java.lang.String m11368toStringimpl = com.paypal.oslo.core.i18n.domain.model.CountryCode.m11368toStringimpl(this.regionCode);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PhoneNumberRequest(regionCode=");
        sb.append(m11368toStringimpl);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return com.paypal.oslo.core.i18n.domain.model.CountryCode.m11367hashCodeimpl(this.regionCode);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.core.i18n.domain.model.PhoneNumberRequest) && com.paypal.oslo.core.i18n.domain.model.CountryCode.m11366equalsimpl0(this.regionCode, ((com.paypal.oslo.core.i18n.domain.model.PhoneNumberRequest) other).regionCode);
    }

    /* renamed from: copy-tgPz1l0, reason: not valid java name */
    public final com.paypal.oslo.core.i18n.domain.model.PhoneNumberRequest m11457copytgPz1l0(java.lang.String regionCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(regionCode, "");
        return new com.paypal.oslo.core.i18n.domain.model.PhoneNumberRequest(regionCode, null);
    }

    /* renamed from: component1-ALGuh4w, reason: not valid java name and from getter */
    public final java.lang.String getRegionCode() {
        return this.regionCode;
    }

    /* renamed from: copy-tgPz1l0$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.PhoneNumberRequest m11455copytgPz1l0$default(com.paypal.oslo.core.i18n.domain.model.PhoneNumberRequest phoneNumberRequest, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = phoneNumberRequest.regionCode;
        }
        return phoneNumberRequest.m11457copytgPz1l0(str);
    }

    public /* synthetic */ PhoneNumberRequest(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
