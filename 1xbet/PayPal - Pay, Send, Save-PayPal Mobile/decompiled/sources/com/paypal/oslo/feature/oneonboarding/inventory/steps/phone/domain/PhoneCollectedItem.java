package com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b(\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/domain/PhoneCollectedItem;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/CollectedItem;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/ComponentId;", "componentId", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardPhoneVariant;", "variant", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/Phone;", "phone", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/OnboardPhoneVariant;Lcom/paypal/oslo/feature/oneonboarding/api/domain/Phone;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-fHLlpbY", "()Ljava/lang/String;", "component1", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/OnboardPhoneVariant;", "component3", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/Phone;", "component4-ALGuh4w", "component4", "copy-PxDwnMk", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/OnboardPhoneVariant;Lcom/paypal/oslo/feature/oneonboarding/api/domain/Phone;Ljava/lang/String;)Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/domain/PhoneCollectedItem;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getComponentId-fHLlpbY", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardPhoneVariant;", "getVariant", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/Phone;", "getPhone", "getPhoneCountryCode-ALGuh4w"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PhoneCollectedItem implements com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem {
    public static final int $stable = 8;
    private final java.lang.String componentId;
    private final com.paypal.oslo.feature.oneonboarding.api.domain.Phone phone;
    private final java.lang.String phoneCountryCode;
    private final com.paypal.oslo.api.graphql.schema.type.OnboardPhoneVariant variant;

    private PhoneCollectedItem(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.OnboardPhoneVariant onboardPhoneVariant, com.paypal.oslo.feature.oneonboarding.api.domain.Phone phone, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboardPhoneVariant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phone, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.componentId = str;
        this.variant = onboardPhoneVariant;
        this.phone = phone;
        this.phoneCountryCode = str2;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem
    /* renamed from: getComponentId-fHLlpbY */
    public final java.lang.String getGetHighSpeedVideoSizes() {
        return this.componentId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.OnboardPhoneVariant getVariant() {
        return this.variant;
    }

    public final com.paypal.oslo.feature.oneonboarding.api.domain.Phone getPhone() {
        return this.phone;
    }

    /* renamed from: getPhoneCountryCode-ALGuh4w, reason: not valid java name */
    public final java.lang.String m16790getPhoneCountryCodeALGuh4w() {
        return this.phoneCountryCode;
    }

    public final java.lang.String toString() {
        java.lang.String m16613toStringimpl = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16613toStringimpl(this.componentId);
        com.paypal.oslo.api.graphql.schema.type.OnboardPhoneVariant onboardPhoneVariant = this.variant;
        com.paypal.oslo.feature.oneonboarding.api.domain.Phone phone = this.phone;
        java.lang.String m11368toStringimpl = com.paypal.oslo.core.i18n.domain.model.CountryCode.m11368toStringimpl(this.phoneCountryCode);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PhoneCollectedItem(componentId=");
        sb.append(m16613toStringimpl);
        sb.append(", variant=");
        sb.append(onboardPhoneVariant);
        sb.append(", phone=");
        sb.append(phone);
        sb.append(", phoneCountryCode=");
        sb.append(m11368toStringimpl);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16612hashCodeimpl(this.componentId) * 31) + this.variant.hashCode()) * 31) + this.phone.hashCode()) * 31) + com.paypal.oslo.core.i18n.domain.model.CountryCode.m11367hashCodeimpl(this.phoneCountryCode);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.PhoneCollectedItem)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.PhoneCollectedItem phoneCollectedItem = (com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.PhoneCollectedItem) other;
        return com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16611equalsimpl0(this.componentId, phoneCollectedItem.componentId) && this.variant == phoneCollectedItem.variant && kotlin.jvm.internal.Intrinsics.areEqual(this.phone, phoneCollectedItem.phone) && com.paypal.oslo.core.i18n.domain.model.CountryCode.m11366equalsimpl0(this.phoneCountryCode, phoneCollectedItem.phoneCountryCode);
    }

    /* renamed from: copy-PxDwnMk, reason: not valid java name */
    public final com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.PhoneCollectedItem m16789copyPxDwnMk(java.lang.String componentId, com.paypal.oslo.api.graphql.schema.type.OnboardPhoneVariant variant, com.paypal.oslo.feature.oneonboarding.api.domain.Phone phone, java.lang.String phoneCountryCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phone, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneCountryCode, "");
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.PhoneCollectedItem(componentId, variant, phone, phoneCountryCode, null);
    }

    /* renamed from: component4-ALGuh4w, reason: not valid java name and from getter */
    public final java.lang.String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.oneonboarding.api.domain.Phone getPhone() {
        return this.phone;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.OnboardPhoneVariant getVariant() {
        return this.variant;
    }

    /* renamed from: component1-fHLlpbY, reason: not valid java name and from getter */
    public final java.lang.String getComponentId() {
        return this.componentId;
    }

    /* renamed from: copy-PxDwnMk$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.PhoneCollectedItem m16786copyPxDwnMk$default(com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.PhoneCollectedItem phoneCollectedItem, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.OnboardPhoneVariant onboardPhoneVariant, com.paypal.oslo.feature.oneonboarding.api.domain.Phone phone, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = phoneCollectedItem.componentId;
        }
        if ((i & 2) != 0) {
            onboardPhoneVariant = phoneCollectedItem.variant;
        }
        if ((i & 4) != 0) {
            phone = phoneCollectedItem.phone;
        }
        if ((i & 8) != 0) {
            str2 = phoneCollectedItem.phoneCountryCode;
        }
        return phoneCollectedItem.m16789copyPxDwnMk(str, onboardPhoneVariant, phone, str2);
    }

    public /* synthetic */ PhoneCollectedItem(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.OnboardPhoneVariant onboardPhoneVariant, com.paypal.oslo.feature.oneonboarding.api.domain.Phone phone, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, onboardPhoneVariant, phone, str2);
    }
}
