package com.paypal.oslo.feature.onboarding.signup.data.repository;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\u000e\u001a\u00028\u0000\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086\b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/data/repository/FieldConfigFactory;", "", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)V", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/FieldConfig;", "T", "", "componentId", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/FieldType;", "fieldType", "createFieldConfigTyped-xn6kmkA", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/FieldConfig;", "createFieldConfigTyped", "createFieldConfig-xn6kmkA", "createFieldConfig", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FieldConfigFactory {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public FieldConfigFactory(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        this.getHighResolutionOutputSizeshNQ4ISI = dynamicConfiguration;
    }

    /* renamed from: createFieldConfigTyped-xn6kmkA, reason: not valid java name */
    public final /* synthetic */ <T extends com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig> T m16240createFieldConfigTypedxn6kmkA(java.lang.String componentId, java.lang.String fieldType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldType, "");
        T t = (T) m16239createFieldConfigxn6kmkA(componentId, fieldType);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T");
        return t;
    }

    /* renamed from: createFieldConfig-xn6kmkA, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldConfig m16239createFieldConfigxn6kmkA(java.lang.String componentId, java.lang.String fieldType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldType, "");
        java.lang.String lowerCase = fieldType.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(componentId);
        sb.append(".");
        sb.append(lowerCase);
        java.lang.String obj = sb.toString();
        if (!com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16555equalsimpl0(fieldType, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16250getHEADER7vt1OyQ()) && !com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16555equalsimpl0(fieldType, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16256getSUBHEADER7vt1OyQ()) && !com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16555equalsimpl0(fieldType, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16245getBUTTON7vt1OyQ())) {
            if (!com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16555equalsimpl0(fieldType, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16248getEMAIL7vt1OyQ())) {
                if (!com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16555equalsimpl0(fieldType, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16257getTERMS_AND_CONDITIONS7vt1OyQ())) {
                    if (!com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16555equalsimpl0(fieldType, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16252getLINK7vt1OyQ())) {
                        if (!com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16555equalsimpl0(fieldType, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16243getADMIN_AREA17vt1OyQ()) && !com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16555equalsimpl0(fieldType, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16247getDROPDOWN7vt1OyQ())) {
                            if (!com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16555equalsimpl0(fieldType, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16254getPHONE7vt1OyQ()) && !com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16555equalsimpl0(fieldType, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16253getPASSWORD7vt1OyQ()) && !com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16555equalsimpl0(fieldType, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16249getFIRST_NAME7vt1OyQ()) && !com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16555equalsimpl0(fieldType, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16251getLAST_NAME7vt1OyQ()) && !com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16555equalsimpl0(fieldType, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16246getCOMPRESSED_ADDRESS7vt1OyQ()) && !com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16555equalsimpl0(fieldType, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16241getADDRESS_LINE17vt1OyQ()) && !com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16555equalsimpl0(fieldType, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16242getADDRESS_LINE27vt1OyQ()) && !com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16555equalsimpl0(fieldType, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16244getADMIN_AREA27vt1OyQ()) && !com.paypal.oslo.feature.onboarding.steps.struct.domain.model.FieldType.m16555equalsimpl0(fieldType, com.paypal.oslo.feature.onboarding.signup.data.repository.FieldTypes.INSTANCE.m16255getPOSTAL_CODE7vt1OyQ())) {
                                throw new java.lang.IllegalArgumentException("Unsupported field type: ".concat(java.lang.String.valueOf(fieldType)));
                            }
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append(obj);
                            sb2.append(".label");
                            return new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig(obj, fieldType, sb2.toString(), null, null, null, 48, null);
                        }
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append(obj);
                        sb3.append(".label");
                        java.lang.String obj2 = sb3.toString();
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                        sb4.append(obj);
                        sb4.append(".search.label");
                        java.lang.String obj3 = sb4.toString();
                        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                        sb5.append(obj);
                        sb5.append(".search.no_results");
                        return new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupDropdownFieldConfig(obj, fieldType, obj2, obj3, sb5.toString(), null);
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(obj);
                    sb6.append(".label");
                    return new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLinkFieldConfig(obj, fieldType, sb6.toString(), com.paypal.pds.components.LinkSize.Small.INSTANCE, null);
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(obj);
                sb7.append(".text");
                java.lang.String obj4 = sb7.toString();
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(obj);
                sb8.append(".link.esign_consent.label");
                java.lang.String obj5 = sb8.toString();
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                sb9.append(obj);
                sb9.append(".link.esign_consent.url");
                kotlin.Pair pair = kotlin.TuplesKt.to(obj5, sb9.toString());
                java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                sb10.append(obj);
                sb10.append(".link.user_agreement.label");
                java.lang.String obj6 = sb10.toString();
                java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
                sb11.append(obj);
                sb11.append(".link.user_agreement.url");
                kotlin.Pair pair2 = kotlin.TuplesKt.to(obj6, sb11.toString());
                java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
                sb12.append(obj);
                sb12.append(".link.privacy_statement.label");
                java.lang.String obj7 = sb12.toString();
                java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
                sb13.append(obj);
                sb13.append(".link.privacy_statement.url");
                return new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTermsFieldConfig(obj, fieldType, obj4, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{pair, pair2, kotlin.TuplesKt.to(obj7, sb13.toString())}), null);
            }
            java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
            sb14.append(obj);
            sb14.append(".label");
            return new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig(obj, fieldType, sb14.toString(), null, null, kotlin.collections.ArraysKt.toList((java.lang.Object[]) this.getHighResolutionOutputSizeshNQ4ISI.getValue(com.paypal.oslo.feature.onboarding.signup.email.data.config.OnboardingEmailDomainSuggestionsConfigSpec.INSTANCE.getEmailDomains())), 16, null);
        }
        java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
        sb15.append(obj);
        sb15.append(".label");
        return new com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupLabelFieldConfig(obj, fieldType, sb15.toString(), null, null, 16, null);
    }
}
