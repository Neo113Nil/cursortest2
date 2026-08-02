package com.paypal.oslo.feature.onboarding.steps.struct.domain.model;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/TermsAndConditionsComponentConfig;", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/ComponentConfig;", "", "componentId", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/ComponentType;", "componentType", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupTermsFieldConfig;", "termsField", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupTermsFieldConfig;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2-NvngK3s", "component2", "component3", "()Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupTermsFieldConfig;", "copy-RrSt3xo", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupTermsFieldConfig;)Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/TermsAndConditionsComponentConfig;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getComponentId", "getComponentType-NvngK3s", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupTermsFieldConfig;", "getTermsField"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TermsAndConditionsComponentConfig implements com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentConfig {
    public static final int $stable = 8;
    private final java.lang.String componentId;
    private final java.lang.String componentType;
    private final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTermsFieldConfig termsField;

    private TermsAndConditionsComponentConfig(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTermsFieldConfig signupTermsFieldConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupTermsFieldConfig, "");
        this.componentId = str;
        this.componentType = str2;
        this.termsField = signupTermsFieldConfig;
    }

    @Override // com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentConfig
    public final java.lang.String getComponentId() {
        return this.componentId;
    }

    @Override // com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentConfig
    /* renamed from: getComponentType-NvngK3s */
    public final java.lang.String mo16534getComponentTypeNvngK3s() {
        return this.componentType;
    }

    public final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTermsFieldConfig getTermsField() {
        return this.termsField;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.componentId;
        java.lang.String m16543toStringimpl = com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16543toStringimpl(this.componentType);
        com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTermsFieldConfig signupTermsFieldConfig = this.termsField;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TermsAndConditionsComponentConfig(componentId=");
        sb.append(str);
        sb.append(", componentType=");
        sb.append(m16543toStringimpl);
        sb.append(", termsField=");
        sb.append(signupTermsFieldConfig);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.componentId.hashCode() * 31) + com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16542hashCodeimpl(this.componentType)) * 31) + this.termsField.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.steps.struct.domain.model.TermsAndConditionsComponentConfig)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.steps.struct.domain.model.TermsAndConditionsComponentConfig termsAndConditionsComponentConfig = (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.TermsAndConditionsComponentConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.componentId, termsAndConditionsComponentConfig.componentId) && com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16541equalsimpl0(this.componentType, termsAndConditionsComponentConfig.componentType) && kotlin.jvm.internal.Intrinsics.areEqual(this.termsField, termsAndConditionsComponentConfig.termsField);
    }

    /* renamed from: copy-RrSt3xo, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.TermsAndConditionsComponentConfig m16595copyRrSt3xo(java.lang.String componentId, java.lang.String componentType, com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTermsFieldConfig termsField) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(termsField, "");
        return new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.TermsAndConditionsComponentConfig(componentId, componentType, termsField, null);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTermsFieldConfig getTermsField() {
        return this.termsField;
    }

    /* renamed from: component2-NvngK3s, reason: not valid java name and from getter */
    public final java.lang.String getComponentType() {
        return this.componentType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getComponentId() {
        return this.componentId;
    }

    /* renamed from: copy-RrSt3xo$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.onboarding.steps.struct.domain.model.TermsAndConditionsComponentConfig m16593copyRrSt3xo$default(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.TermsAndConditionsComponentConfig termsAndConditionsComponentConfig, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTermsFieldConfig signupTermsFieldConfig, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = termsAndConditionsComponentConfig.componentId;
        }
        if ((i & 2) != 0) {
            str2 = termsAndConditionsComponentConfig.componentType;
        }
        if ((i & 4) != 0) {
            signupTermsFieldConfig = termsAndConditionsComponentConfig.termsField;
        }
        return termsAndConditionsComponentConfig.m16595copyRrSt3xo(str, str2, signupTermsFieldConfig);
    }

    public /* synthetic */ TermsAndConditionsComponentConfig(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTermsFieldConfig signupTermsFieldConfig, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, signupTermsFieldConfig);
    }
}
