package com.paypal.oslo.feature.onboarding.signup.data.repository;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010!\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010%\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\u001d\u0010)\u001a\u00020&2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b'\u0010(J\u001d\u0010-\u001a\u00020*2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/data/repository/SignupComponentConfigurationBuilder;", "", "Lcom/paypal/oslo/feature/onboarding/signup/data/repository/FieldConfigFactory;", "fieldConfigFactory", "<init>", "(Lcom/paypal/oslo/feature/onboarding/signup/data/repository/FieldConfigFactory;)V", "", "componentId", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/ComponentType;", "componentType", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/HeaderComponentConfig;", "buildHeaderComponent-f16IgvE", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/HeaderComponentConfig;", "buildHeaderComponent", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/EmailComponentConfig;", "buildEmailComponent-f16IgvE", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/EmailComponentConfig;", "buildEmailComponent", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PhoneComponentConfig;", "buildPhoneComponent-f16IgvE", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PhoneComponentConfig;", "buildPhoneComponent", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PasswordComponentConfig;", "buildPasswordComponent-f16IgvE", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/PasswordComponentConfig;", "buildPasswordComponent", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/NameComponentConfig;", "buildNameComponent-f16IgvE", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/NameComponentConfig;", "buildNameComponent", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/AddressComponentConfig;", "buildAddressComponent-f16IgvE", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/AddressComponentConfig;", "buildAddressComponent", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/TermsAndConditionsComponentConfig;", "buildTermsAndConditionsComponent-f16IgvE", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/TermsAndConditionsComponentConfig;", "buildTermsAndConditionsComponent", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/LinkComponentConfig;", "buildLinkComponent-f16IgvE", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/LinkComponentConfig;", "buildLinkComponent", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/ButtonComponentConfig;", "buildButtonComponent-f16IgvE", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/ButtonComponentConfig;", "buildButtonComponent", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/onboarding/signup/data/repository/FieldConfigFactory;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupComponentConfigurationBuilder {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.onboarding.signup.data.repository.FieldConfigFactory Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public SignupComponentConfigurationBuilder(com.paypal.oslo.feature.onboarding.signup.data.repository.FieldConfigFactory fieldConfigFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldConfigFactory, "");
        this.Camera2StreamConfigurationMap = fieldConfigFactory;
    }

    /* renamed from: buildHeaderComponent-f16IgvE, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.HeaderComponentConfig m16261buildHeaderComponentf16IgvE(java.lang.String componentId, java.lang.String componentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentType, "");
        java.util.List mutableListOf = kotlin.collections.CollectionsKt.mutableListOf(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16552boximpl(com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16250getHEADER7vt1OyQ()));
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(mutableListOf, 10));
        java.util.Iterator it = mutableListOf.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig m16239createFieldConfigxn6kmkA = this.Camera2StreamConfigurationMap.m16239createFieldConfigxn6kmkA(componentId, ((com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType) it.next()).m16558unboximpl());
            if (m16239createFieldConfigxn6kmkA != null) {
                arrayList.add((com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLabelFieldConfig) m16239createFieldConfigxn6kmkA);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLabelFieldConfig");
            }
        }
        return new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.HeaderComponentConfig(componentId, componentType, arrayList, null);
    }

    /* renamed from: buildEmailComponent-f16IgvE, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.EmailComponentConfig m16260buildEmailComponentf16IgvE(java.lang.String componentId, java.lang.String componentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentType, "");
        com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig m16239createFieldConfigxn6kmkA = this.Camera2StreamConfigurationMap.m16239createFieldConfigxn6kmkA(componentId, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16248getEMAIL7vt1OyQ());
        if (m16239createFieldConfigxn6kmkA != null) {
            return new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.EmailComponentConfig(componentId, componentType, (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig) m16239createFieldConfigxn6kmkA, null);
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig");
    }

    /* renamed from: buildPhoneComponent-f16IgvE, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PhoneComponentConfig m16265buildPhoneComponentf16IgvE(java.lang.String componentId, java.lang.String componentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentType, "");
        com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig m16239createFieldConfigxn6kmkA = this.Camera2StreamConfigurationMap.m16239createFieldConfigxn6kmkA(componentId, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16254getPHONE7vt1OyQ());
        if (m16239createFieldConfigxn6kmkA != null) {
            return new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PhoneComponentConfig(componentId, componentType, (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig) m16239createFieldConfigxn6kmkA, null);
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig");
    }

    /* renamed from: buildPasswordComponent-f16IgvE, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PasswordComponentConfig m16264buildPasswordComponentf16IgvE(java.lang.String componentId, java.lang.String componentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentType, "");
        com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig m16239createFieldConfigxn6kmkA = this.Camera2StreamConfigurationMap.m16239createFieldConfigxn6kmkA(componentId, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16253getPASSWORD7vt1OyQ());
        if (m16239createFieldConfigxn6kmkA != null) {
            return new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.PasswordComponentConfig(componentId, componentType, (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig) m16239createFieldConfigxn6kmkA, null);
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig");
    }

    /* renamed from: buildNameComponent-f16IgvE, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.NameComponentConfig m16263buildNameComponentf16IgvE(java.lang.String componentId, java.lang.String componentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentType, "");
        com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig[] signupTextInputFieldConfigArr = new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig[2];
        com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig m16239createFieldConfigxn6kmkA = this.Camera2StreamConfigurationMap.m16239createFieldConfigxn6kmkA(componentId, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16249getFIRST_NAME7vt1OyQ());
        if (m16239createFieldConfigxn6kmkA == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig");
        }
        signupTextInputFieldConfigArr[0] = (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig) m16239createFieldConfigxn6kmkA;
        com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig m16239createFieldConfigxn6kmkA2 = this.Camera2StreamConfigurationMap.m16239createFieldConfigxn6kmkA(componentId, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16251getLAST_NAME7vt1OyQ());
        if (m16239createFieldConfigxn6kmkA2 != null) {
            signupTextInputFieldConfigArr[1] = (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig) m16239createFieldConfigxn6kmkA2;
            return new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.NameComponentConfig(componentId, componentType, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) signupTextInputFieldConfigArr), null);
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig");
    }

    /* renamed from: buildAddressComponent-f16IgvE, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.AddressComponentConfig m16258buildAddressComponentf16IgvE(java.lang.String componentId, java.lang.String componentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentType, "");
        com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig m16239createFieldConfigxn6kmkA = this.Camera2StreamConfigurationMap.m16239createFieldConfigxn6kmkA(componentId, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16246getCOMPRESSED_ADDRESS7vt1OyQ());
        if (m16239createFieldConfigxn6kmkA != null) {
            com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig signupTextInputFieldConfig = (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig) m16239createFieldConfigxn6kmkA;
            com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig[] fieldConfigArr = new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig[5];
            com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig m16239createFieldConfigxn6kmkA2 = this.Camera2StreamConfigurationMap.m16239createFieldConfigxn6kmkA(componentId, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16241getADDRESS_LINE17vt1OyQ());
            if (m16239createFieldConfigxn6kmkA2 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig");
            }
            fieldConfigArr[0] = (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig) m16239createFieldConfigxn6kmkA2;
            com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig m16239createFieldConfigxn6kmkA3 = this.Camera2StreamConfigurationMap.m16239createFieldConfigxn6kmkA(componentId, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16242getADDRESS_LINE27vt1OyQ());
            if (m16239createFieldConfigxn6kmkA3 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig");
            }
            fieldConfigArr[1] = (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig) m16239createFieldConfigxn6kmkA3;
            com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig m16239createFieldConfigxn6kmkA4 = this.Camera2StreamConfigurationMap.m16239createFieldConfigxn6kmkA(componentId, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16244getADMIN_AREA27vt1OyQ());
            if (m16239createFieldConfigxn6kmkA4 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig");
            }
            fieldConfigArr[2] = (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig) m16239createFieldConfigxn6kmkA4;
            com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig m16239createFieldConfigxn6kmkA5 = this.Camera2StreamConfigurationMap.m16239createFieldConfigxn6kmkA(componentId, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16243getADMIN_AREA17vt1OyQ());
            if (m16239createFieldConfigxn6kmkA5 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupDropdownFieldConfig");
            }
            fieldConfigArr[3] = (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupDropdownFieldConfig) m16239createFieldConfigxn6kmkA5;
            com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig m16239createFieldConfigxn6kmkA6 = this.Camera2StreamConfigurationMap.m16239createFieldConfigxn6kmkA(componentId, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16255getPOSTAL_CODE7vt1OyQ());
            if (m16239createFieldConfigxn6kmkA6 != null) {
                fieldConfigArr[4] = (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig) m16239createFieldConfigxn6kmkA6;
                return new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.AddressComponentConfig(componentId, componentType, signupTextInputFieldConfig, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) fieldConfigArr), null);
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig");
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig");
    }

    /* renamed from: buildTermsAndConditionsComponent-f16IgvE, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.TermsAndConditionsComponentConfig m16266buildTermsAndConditionsComponentf16IgvE(java.lang.String componentId, java.lang.String componentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentType, "");
        com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig m16239createFieldConfigxn6kmkA = this.Camera2StreamConfigurationMap.m16239createFieldConfigxn6kmkA(componentId, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16257getTERMS_AND_CONDITIONS7vt1OyQ());
        if (m16239createFieldConfigxn6kmkA != null) {
            return new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.TermsAndConditionsComponentConfig(componentId, componentType, (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTermsFieldConfig) m16239createFieldConfigxn6kmkA, null);
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTermsFieldConfig");
    }

    /* renamed from: buildLinkComponent-f16IgvE, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.LinkComponentConfig m16262buildLinkComponentf16IgvE(java.lang.String componentId, java.lang.String componentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentType, "");
        com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig m16239createFieldConfigxn6kmkA = this.Camera2StreamConfigurationMap.m16239createFieldConfigxn6kmkA(componentId, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16252getLINK7vt1OyQ());
        if (m16239createFieldConfigxn6kmkA != null) {
            return new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.LinkComponentConfig(componentId, componentType, (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLinkFieldConfig) m16239createFieldConfigxn6kmkA, null);
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLinkFieldConfig");
    }

    /* renamed from: buildButtonComponent-f16IgvE, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ButtonComponentConfig m16259buildButtonComponentf16IgvE(java.lang.String componentId, java.lang.String componentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentType, "");
        com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig m16239createFieldConfigxn6kmkA = this.Camera2StreamConfigurationMap.m16239createFieldConfigxn6kmkA(componentId, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16245getBUTTON7vt1OyQ());
        if (m16239createFieldConfigxn6kmkA != null) {
            return new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.ButtonComponentConfig(componentId, componentType, (com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLabelFieldConfig) m16239createFieldConfigxn6kmkA, null);
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLabelFieldConfig");
    }
}
