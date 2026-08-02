package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberInfo;", "", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "regionCode", "Lcom/paypal/oslo/core/i18n/domain/model/Type;", "type", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/Type;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-ALGuh4w", "()Ljava/lang/String;", "component1", "component2", "()Lcom/paypal/oslo/core/i18n/domain/model/Type;", "copy-n_l99Nk", "(Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/Type;)Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberInfo;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getRegionCode-ALGuh4w", "Lcom/paypal/oslo/core/i18n/domain/model/Type;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PhoneNumberInfo {
    private final java.lang.String regionCode;
    private final com.paypal.oslo.core.i18n.domain.model.Type type;

    private PhoneNumberInfo(java.lang.String str, com.paypal.oslo.core.i18n.domain.model.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        this.regionCode = str;
        this.type = type;
    }

    /* renamed from: getRegionCode-ALGuh4w, reason: not valid java name */
    public final java.lang.String m11453getRegionCodeALGuh4w() {
        return this.regionCode;
    }

    public final com.paypal.oslo.core.i18n.domain.model.Type getType() {
        return this.type;
    }

    public final java.lang.String toString() {
        java.lang.String m11368toStringimpl = com.paypal.oslo.core.i18n.domain.model.CountryCode.m11368toStringimpl(this.regionCode);
        com.paypal.oslo.core.i18n.domain.model.Type type = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PhoneNumberInfo(regionCode=");
        sb.append(m11368toStringimpl);
        sb.append(", type=");
        sb.append(type);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (com.paypal.oslo.core.i18n.domain.model.CountryCode.m11367hashCodeimpl(this.regionCode) * 31) + this.type.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.i18n.domain.model.PhoneNumberInfo)) {
            return false;
        }
        com.paypal.oslo.core.i18n.domain.model.PhoneNumberInfo phoneNumberInfo = (com.paypal.oslo.core.i18n.domain.model.PhoneNumberInfo) other;
        return com.paypal.oslo.core.i18n.domain.model.CountryCode.m11366equalsimpl0(this.regionCode, phoneNumberInfo.regionCode) && this.type == phoneNumberInfo.type;
    }

    /* renamed from: copy-n_l99Nk, reason: not valid java name */
    public final com.paypal.oslo.core.i18n.domain.model.PhoneNumberInfo m11452copyn_l99Nk(java.lang.String regionCode, com.paypal.oslo.core.i18n.domain.model.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(regionCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.core.i18n.domain.model.PhoneNumberInfo(regionCode, type, null);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.i18n.domain.model.Type getType() {
        return this.type;
    }

    /* renamed from: component1-ALGuh4w, reason: not valid java name and from getter */
    public final java.lang.String getRegionCode() {
        return this.regionCode;
    }

    /* renamed from: copy-n_l99Nk$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.PhoneNumberInfo m11450copyn_l99Nk$default(com.paypal.oslo.core.i18n.domain.model.PhoneNumberInfo phoneNumberInfo, java.lang.String str, com.paypal.oslo.core.i18n.domain.model.Type type, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = phoneNumberInfo.regionCode;
        }
        if ((i & 2) != 0) {
            type = phoneNumberInfo.type;
        }
        return phoneNumberInfo.m11452copyn_l99Nk(str, type);
    }

    public /* synthetic */ PhoneNumberInfo(java.lang.String str, com.paypal.oslo.core.i18n.domain.model.Type type, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, type);
    }
}
