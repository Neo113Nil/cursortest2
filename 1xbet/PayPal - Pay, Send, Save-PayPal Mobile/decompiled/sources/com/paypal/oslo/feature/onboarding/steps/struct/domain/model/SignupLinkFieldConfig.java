package com.paypal.oslo.feature.onboarding.steps.struct.domain.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b \u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b!\u0010\fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupLinkFieldConfig;", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/FieldConfig;", "", "fieldId", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/FieldType;", "fieldType", "text", "Lcom/paypal/pds/components/LinkSize;", "linkSize", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/components/LinkSize;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2-7vt1OyQ", "component2", "component3", "component4", "()Lcom/paypal/pds/components/LinkSize;", "copy-nPV7cUU", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/components/LinkSize;)Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupLinkFieldConfig;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFieldId", "getFieldType-7vt1OyQ", "getText", "Lcom/paypal/pds/components/LinkSize;", "getLinkSize"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SignupLinkFieldConfig implements com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig {
    public static final int $stable = com.paypal.pds.components.LinkSize.$stable;
    private final java.lang.String fieldId;
    private final java.lang.String fieldType;
    private final com.paypal.pds.components.LinkSize linkSize;
    private final java.lang.String text;

    private SignupLinkFieldConfig(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.pds.components.LinkSize linkSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkSize, "");
        this.fieldId = str;
        this.fieldType = str2;
        this.text = str3;
        this.linkSize = linkSize;
    }

    @Override // com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig
    public final java.lang.String getFieldId() {
        return this.fieldId;
    }

    @Override // com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig
    /* renamed from: getFieldType-7vt1OyQ */
    public final java.lang.String mo16551getFieldType7vt1OyQ() {
        return this.fieldType;
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public final com.paypal.pds.components.LinkSize getLinkSize() {
        return this.linkSize;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.fieldId;
        java.lang.String m16557toStringimpl = com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16557toStringimpl(this.fieldType);
        java.lang.String str2 = this.text;
        com.paypal.pds.components.LinkSize linkSize = this.linkSize;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SignupLinkFieldConfig(fieldId=");
        sb.append(str);
        sb.append(", fieldType=");
        sb.append(m16557toStringimpl);
        sb.append(", text=");
        sb.append(str2);
        sb.append(", linkSize=");
        sb.append(linkSize);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.fieldId.hashCode() * 31) + com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16556hashCodeimpl(this.fieldType)) * 31) + this.text.hashCode()) * 31) + this.linkSize.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLinkFieldConfig)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLinkFieldConfig signupLinkFieldConfig = (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLinkFieldConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fieldId, signupLinkFieldConfig.fieldId) && com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16555equalsimpl0(this.fieldType, signupLinkFieldConfig.fieldType) && kotlin.jvm.internal.Intrinsics.areEqual(this.text, signupLinkFieldConfig.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.linkSize, signupLinkFieldConfig.linkSize);
    }

    /* renamed from: copy-nPV7cUU, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLinkFieldConfig m16586copynPV7cUU(java.lang.String fieldId, java.lang.String fieldType, java.lang.String text, com.paypal.pds.components.LinkSize linkSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkSize, "");
        return new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLinkFieldConfig(fieldId, fieldType, text, linkSize, null);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.pds.components.LinkSize getLinkSize() {
        return this.linkSize;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    /* renamed from: component2-7vt1OyQ, reason: not valid java name and from getter */
    public final java.lang.String getFieldType() {
        return this.fieldType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFieldId() {
        return this.fieldId;
    }

    /* renamed from: copy-nPV7cUU$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLinkFieldConfig m16584copynPV7cUU$default(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLinkFieldConfig signupLinkFieldConfig, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.pds.components.LinkSize linkSize, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = signupLinkFieldConfig.fieldId;
        }
        if ((i & 2) != 0) {
            str2 = signupLinkFieldConfig.fieldType;
        }
        if ((i & 4) != 0) {
            str3 = signupLinkFieldConfig.text;
        }
        if ((i & 8) != 0) {
            linkSize = signupLinkFieldConfig.linkSize;
        }
        return signupLinkFieldConfig.m16586copynPV7cUU(str, str2, str3, linkSize);
    }

    public /* synthetic */ SignupLinkFieldConfig(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.pds.components.LinkSize linkSize, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, linkSize);
    }
}
