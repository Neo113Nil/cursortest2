package com.paypal.oslo.feature.onboarding.steps.struct.domain.model;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001f\u0010\fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/NameComponentConfig;", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/ComponentConfig;", "", "componentId", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/ComponentType;", "componentType", "", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupTextInputFieldConfig;", "fields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2-NvngK3s", "component2", "component3", "()Ljava/util/List;", "copy-RrSt3xo", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/NameComponentConfig;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getComponentId", "getComponentType-NvngK3s", "Ljava/util/List;", "getFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class NameComponentConfig implements com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentConfig {
    public static final int $stable = 8;
    private final java.lang.String componentId;
    private final java.lang.String componentType;
    private final java.util.List<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig> fields;

    private NameComponentConfig(java.lang.String str, java.lang.String str2, java.util.List<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.componentId = str;
        this.componentType = str2;
        this.fields = list;
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

    public final java.util.List<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig> getFields() {
        return this.fields;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.componentId;
        java.lang.String m16543toStringimpl = com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16543toStringimpl(this.componentType);
        java.util.List<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig> list = this.fields;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NameComponentConfig(componentId=");
        sb.append(str);
        sb.append(", componentType=");
        sb.append(m16543toStringimpl);
        sb.append(", fields=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.componentId.hashCode() * 31) + com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16542hashCodeimpl(this.componentType)) * 31) + this.fields.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.steps.struct.domain.model.NameComponentConfig)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.steps.struct.domain.model.NameComponentConfig nameComponentConfig = (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.NameComponentConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.componentId, nameComponentConfig.componentId) && com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ComponentType.m16541equalsimpl0(this.componentType, nameComponentConfig.componentType) && kotlin.jvm.internal.Intrinsics.areEqual(this.fields, nameComponentConfig.fields);
    }

    /* renamed from: copy-RrSt3xo, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.NameComponentConfig m16567copyRrSt3xo(java.lang.String componentId, java.lang.String componentType, java.util.List<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig> fields) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fields, "");
        return new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.NameComponentConfig(componentId, componentType, fields, null);
    }

    public final java.util.List<com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig> component3() {
        return this.fields;
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
    /* renamed from: copy-RrSt3xo$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.onboarding.steps.struct.domain.model.NameComponentConfig m16565copyRrSt3xo$default(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.NameComponentConfig nameComponentConfig, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = nameComponentConfig.componentId;
        }
        if ((i & 2) != 0) {
            str2 = nameComponentConfig.componentType;
        }
        if ((i & 4) != 0) {
            list = nameComponentConfig.fields;
        }
        return nameComponentConfig.m16567copyRrSt3xo(str, str2, list);
    }

    public /* synthetic */ NameComponentConfig(java.lang.String str, java.lang.String str2, java.util.List list, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list);
    }
}
