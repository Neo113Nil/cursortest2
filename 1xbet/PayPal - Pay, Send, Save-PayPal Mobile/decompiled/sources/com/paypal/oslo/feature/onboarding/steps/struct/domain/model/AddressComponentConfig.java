package com.paypal.oslo.feature.onboarding.steps.struct.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/AddressComponentConfig;", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/ComponentConfig;", "", "componentId", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/ComponentType;", "componentType", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupTextInputFieldConfig;", "compressedField", "", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/FieldConfig;", "manualFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupTextInputFieldConfig;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2-NvngK3s", "component2", "component3", "()Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupTextInputFieldConfig;", "component4", "()Ljava/util/List;", "copy-BMBsGqQ", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupTextInputFieldConfig;Ljava/util/List;)Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/AddressComponentConfig;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getComponentId", "getComponentType-NvngK3s", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupTextInputFieldConfig;", "getCompressedField", "Ljava/util/List;", "getManualFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AddressComponentConfig implements com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentConfig {
    public static final int $stable = 8;
    private final java.lang.String componentId;
    private final java.lang.String componentType;
    private final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig compressedField;
    private final java.util.List<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig> manualFields;

    /* JADX WARN: Multi-variable type inference failed */
    private AddressComponentConfig(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig signupTextInputFieldConfig, java.util.List<? extends com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupTextInputFieldConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.componentId = str;
        this.componentType = str2;
        this.compressedField = signupTextInputFieldConfig;
        this.manualFields = list;
    }

    @Override // com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentConfig
    public final java.lang.String getComponentId() {
        return this.componentId;
    }

    @Override // com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentConfig
    /* renamed from: getComponentType-NvngK3s, reason: not valid java name */
    public final java.lang.String mo16534getComponentTypeNvngK3s() {
        return this.componentType;
    }

    public final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig getCompressedField() {
        return this.compressedField;
    }

    public final java.util.List<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig> getManualFields() {
        return this.manualFields;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.componentId;
        java.lang.String m16543toStringimpl = com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16543toStringimpl(this.componentType);
        com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig signupTextInputFieldConfig = this.compressedField;
        java.util.List<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig> list = this.manualFields;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressComponentConfig(componentId=");
        sb.append(str);
        sb.append(", componentType=");
        sb.append(m16543toStringimpl);
        sb.append(", compressedField=");
        sb.append(signupTextInputFieldConfig);
        sb.append(", manualFields=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.componentId.hashCode() * 31) + com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16542hashCodeimpl(this.componentType)) * 31) + this.compressedField.hashCode()) * 31) + this.manualFields.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.steps.struct.domain.model.AddressComponentConfig)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.steps.struct.domain.model.AddressComponentConfig addressComponentConfig = (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.AddressComponentConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.componentId, addressComponentConfig.componentId) && com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16541equalsimpl0(this.componentType, addressComponentConfig.componentType) && kotlin.jvm.internal.Intrinsics.areEqual(this.compressedField, addressComponentConfig.compressedField) && kotlin.jvm.internal.Intrinsics.areEqual(this.manualFields, addressComponentConfig.manualFields);
    }

    /* renamed from: copy-BMBsGqQ, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.AddressComponentConfig m16533copyBMBsGqQ(java.lang.String componentId, java.lang.String componentType, com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig compressedField, java.util.List<? extends com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig> manualFields) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compressedField, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manualFields, "");
        return new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.AddressComponentConfig(componentId, componentType, compressedField, manualFields, null);
    }

    public final java.util.List<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig> component4() {
        return this.manualFields;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig getCompressedField() {
        return this.compressedField;
    }

    /* renamed from: component2-NvngK3s, reason: not valid java name and from getter */
    public final java.lang.String getComponentType() {
        return this.componentType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getComponentId() {
        return this.componentId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-BMBsGqQ$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.onboarding.steps.struct.domain.model.AddressComponentConfig m16531copyBMBsGqQ$default(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.AddressComponentConfig addressComponentConfig, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig signupTextInputFieldConfig, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = addressComponentConfig.componentId;
        }
        if ((i & 2) != 0) {
            str2 = addressComponentConfig.componentType;
        }
        if ((i & 4) != 0) {
            signupTextInputFieldConfig = addressComponentConfig.compressedField;
        }
        if ((i & 8) != 0) {
            list = addressComponentConfig.manualFields;
        }
        return addressComponentConfig.m16533copyBMBsGqQ(str, str2, signupTextInputFieldConfig, list);
    }

    public /* synthetic */ AddressComponentConfig(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig signupTextInputFieldConfig, java.util.List list, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, signupTextInputFieldConfig, list);
    }
}
