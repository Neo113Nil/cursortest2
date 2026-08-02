package com.paypal.oslo.feature.qrc.data.mapper;

@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u00020\fH\u0000¢\u0006\u0004\b\u0002\u0010\u000f\u001a\u0013\u0010\u0006\u001a\u00020\u0011*\u00020\u0010H\u0000¢\u0006\u0004\b\u0006\u0010\u0012\u001a\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0002\u001a\u00020\u0018*\u00020\u0017H\u0000¢\u0006\u0004\b\u0002\u0010\u0019\u001a\u0013\u0010\u0002\u001a\u00020\u001b*\u00020\u001aH\u0000¢\u0006\u0004\b\u0002\u0010\u001c\u001a\u0013\u0010\u0002\u001a\u00020\u001e*\u00020\u001dH\u0000¢\u0006\u0004\b\u0002\u0010\u001f\u001a\u0015\u0010\"\u001a\u0004\u0018\u00010!*\u00020 H\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010&\u001a\u00020%*\u00020$H\u0000¢\u0006\u0004\b&\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;", "Lcom/paypal/oslo/feature/qrc/graphql/type/MoneyInput;", "toInput", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcMoney;)Lcom/paypal/oslo/feature/qrc/graphql/type/MoneyInput;", "Lcom/paypal/oslo/feature/qrc/domain/model/cancelpayment/QrcPaymentCancellationReason;", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodePaymentCancellationReason;", "toGraphQL", "(Lcom/paypal/oslo/feature/qrc/domain/model/cancelpayment/QrcPaymentCancellationReason;)Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodePaymentCancellationReason;", "", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodePaymentMethod;", "toQRPaymentMethod", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodePaymentMethod;", "Lcom/paypal/oslo/feature/qrc/domain/model/scanner/DeviceMetadata;", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/feature/qrc/graphql/type/DeviceMetadataInput;", "(Lcom/paypal/oslo/feature/qrc/domain/model/scanner/DeviceMetadata;)Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/feature/qrc/domain/model/enrollment/QrcCapability;", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeCapability;", "(Lcom/paypal/oslo/feature/qrc/domain/model/enrollment/QrcCapability;)Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeCapability;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeType;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;)Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeType;", "Lcom/paypal/oslo/feature/qrc/domain/model/enrollment/QrcEnrollmentRequest;", "Lcom/paypal/oslo/feature/qrc/graphql/type/EnrollConsumerPresentedQRCodeInput;", "(Lcom/paypal/oslo/feature/qrc/domain/model/enrollment/QrcEnrollmentRequest;)Lcom/paypal/oslo/feature/qrc/graphql/type/EnrollConsumerPresentedQRCodeInput;", "Lcom/paypal/oslo/feature/qrc/domain/model/eligibility/QrcTypeCapabilityFilter;", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeTypeCapabilityInput;", "(Lcom/paypal/oslo/feature/qrc/domain/model/eligibility/QrcTypeCapabilityFilter;)Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeTypeCapabilityInput;", "Lcom/paypal/oslo/feature/qrc/domain/model/eligibility/QrcEligibilityRequest;", "Lcom/paypal/oslo/feature/qrc/graphql/type/ConsumerPresentedQRCodeEligibilityInput;", "(Lcom/paypal/oslo/feature/qrc/domain/model/eligibility/QrcEligibilityRequest;)Lcom/paypal/oslo/feature/qrc/graphql/type/ConsumerPresentedQRCodeEligibilityInput;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/ProductFlow;", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeClientConfigurationProductFlow;", "toGraphQLProductFlow", "(Lcom/paypal/oslo/feature/qrc/domain/model/session/ProductFlow;)Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeClientConfigurationProductFlow;", "Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentPlanningRequest;", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodePaymentOptionsInput;", "toQRCodePaymentOptionsInput", "(Lcom/paypal/oslo/feature/qrc/domain/model/review/PaymentPlanningRequest;)Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodePaymentOptionsInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class InputMappersKt {
    public static final com.paypal.oslo.feature.qrc.graphql.type.MoneyInput toInput(com.paypal.oslo.feature.qrc.domain.model.session.QrcMoney qrcMoney) {
        java.lang.Object m23436constructorimpl;
        java.lang.String value;
        java.math.BigDecimal scale;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcMoney, "");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.lang.Integer.valueOf(java.util.Currency.getInstance(qrcMoney.getCurrencyCode()).getDefaultFractionDigits()));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = 2;
        }
        int intValue = ((java.lang.Number) m23436constructorimpl).intValue();
        java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(qrcMoney.getValue());
        if (bigDecimalOrNull == null || (scale = bigDecimalOrNull.setScale(intValue, java.math.RoundingMode.HALF_UP)) == null || (value = scale.toPlainString()) == null) {
            value = qrcMoney.getValue();
        }
        return new com.paypal.oslo.feature.qrc.graphql.type.MoneyInput(qrcMoney.getCurrencyCode(), value);
    }

    public static final com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentCancellationReason toGraphQL(com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason qrcPaymentCancellationReason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcPaymentCancellationReason, "");
        int i = com.paypal.oslo.feature.qrc.data.mapper.InputMappersKt.WhenMappings.$EnumSwitchMapping$0[qrcPaymentCancellationReason.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentCancellationReason.USER_CANCELLATION;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentCancellationReason.FUNDING_OPTIONS_UNAVAILABLE;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentCancellationReason.RISK_DECLINE;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentCancellationReason.THREE_D_SECURE_AUTHENTICATION_FAILURE;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentCancellationReason.INTERNAL_ERROR;
    }

    public static final com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentMethod toQRPaymentMethod(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int hashCode = str.hashCode();
        if (hashCode != -1941875981) {
            if (hashCode != 81555809) {
                if (hashCode == 873568038 && str.equals("PAYPAL_WORLD")) {
                    return com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentMethod.PAYPAL_WORLD;
                }
            } else if (str.equals("VENMO")) {
                return com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentMethod.VENMO;
            }
        } else if (str.equals("PAYPAL")) {
            return com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentMethod.PAYPAL;
        }
        return com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentMethod.PAYPAL;
    }

    public static final com.apollographql.apollo.api.Optional<com.paypal.oslo.feature.qrc.graphql.type.DeviceMetadataInput> toInput(com.paypal.oslo.feature.qrc.domain.model.scanner.DeviceMetadata deviceMetadata) {
        com.apollographql.apollo.api.Optional absent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceMetadata, "");
        if (deviceMetadata.getGeoCountry() == null) {
            return com.apollographql.apollo.api.Optional.INSTANCE.absent();
        }
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String geoCountry = deviceMetadata.getGeoCountry();
        if (geoCountry == null || (absent = com.apollographql.apollo.api.Optional.INSTANCE.present(geoCountry)) == null) {
            absent = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        }
        return companion.present(new com.paypal.oslo.feature.qrc.graphql.type.DeviceMetadataInput(null, null, null, null, null, absent, null, 95, null));
    }

    public static final com.paypal.oslo.feature.qrc.graphql.type.QRCodeCapability toGraphQL(com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability qrcCapability) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcCapability, "");
        int i = com.paypal.oslo.feature.qrc.data.mapper.InputMappersKt.WhenMappings.$EnumSwitchMapping$1[qrcCapability.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.qrc.graphql.type.QRCodeCapability.ONLINE;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.qrc.graphql.type.QRCodeCapability.OFFLINE;
    }

    private static final com.paypal.oslo.feature.qrc.graphql.type.QRCodeType getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType) {
        int i = com.paypal.oslo.feature.qrc.data.mapper.InputMappersKt.WhenMappings.$EnumSwitchMapping$2[qrCodeType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.qrc.graphql.type.QRCodeType.PAYPAL;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.qrc.graphql.type.QRCodeType.VENMO;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.qrc.graphql.type.QRCodeType.UNION_PAY_INTERNATIONAL;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.qrc.graphql.type.QRCodeType.PAYPAL_WORLD;
    }

    public static final com.paypal.oslo.feature.qrc.graphql.type.EnrollConsumerPresentedQRCodeInput toInput(com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentRequest qrcEnrollmentRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcEnrollmentRequest, "");
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType qrCodeType = qrcEnrollmentRequest.getQrCodeType();
        java.util.ArrayList arrayList = null;
        com.apollographql.apollo.api.Optional presentIfNotNull = companion.presentIfNotNull(qrCodeType != null ? getHighResolutionOutputSizeshNQ4ISI(qrCodeType) : null);
        com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.util.List<com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability> capabilities = qrcEnrollmentRequest.getCapabilities();
        if (capabilities != null) {
            java.util.List<com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability> list = capabilities;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(toGraphQL((com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability) it.next()));
            }
            arrayList = arrayList2;
        }
        return new com.paypal.oslo.feature.qrc.graphql.type.EnrollConsumerPresentedQRCodeInput(presentIfNotNull, companion2.presentIfNotNull(arrayList), com.apollographql.apollo.api.Optional.INSTANCE.present(java.lang.Integer.valueOf(qrcEnrollmentRequest.getEnrollmentVersion())));
    }

    public static final com.paypal.oslo.feature.qrc.graphql.type.QRCodeTypeCapabilityInput toInput(com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcTypeCapabilityFilter qrcTypeCapabilityFilter) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcTypeCapabilityFilter, "");
        com.paypal.oslo.feature.qrc.graphql.type.QRCodeType highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(qrcTypeCapabilityFilter.getQrCodeType());
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        java.util.List<com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability> capabilities = qrcTypeCapabilityFilter.getCapabilities();
        if (capabilities != null) {
            java.util.List<com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability> list = capabilities;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(toGraphQL((com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability) it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new com.paypal.oslo.feature.qrc.graphql.type.QRCodeTypeCapabilityInput(highResolutionOutputSizeshNQ4ISI, companion.presentIfNotNull(arrayList), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(qrcTypeCapabilityFilter.getEnrollmentVersion()));
    }

    public static final com.paypal.oslo.feature.qrc.graphql.type.ConsumerPresentedQRCodeEligibilityInput toInput(com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityRequest qrcEligibilityRequest) {
        com.apollographql.apollo.api.Optional.Absent absent;
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcEligibilityRequest, "");
        com.paypal.oslo.feature.qrc.domain.model.scanner.DeviceMetadata deviceMetadata = qrcEligibilityRequest.getDeviceMetadata();
        if (deviceMetadata == null || (absent = toInput(deviceMetadata)) == null) {
            absent = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        }
        com.apollographql.apollo.api.Optional presentIfNotNull = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(qrcEligibilityRequest.getAccountId());
        com.apollographql.apollo.api.Optional presentIfNotNull2 = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(qrcEligibilityRequest.getExternalId());
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        java.util.List<com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcTypeCapabilityFilter> filterCriteria = qrcEligibilityRequest.getFilterCriteria();
        if (filterCriteria != null) {
            java.util.List<com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcTypeCapabilityFilter> list = filterCriteria;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(toInput((com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcTypeCapabilityFilter) it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new com.paypal.oslo.feature.qrc.graphql.type.ConsumerPresentedQRCodeEligibilityInput(absent, presentIfNotNull, presentIfNotNull2, companion.presentIfNotNull(arrayList));
    }

    public static final com.paypal.oslo.feature.qrc.graphql.type.QRCodeClientConfigurationProductFlow toGraphQLProductFlow(com.paypal.oslo.feature.qrc.domain.model.session.ProductFlow productFlow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productFlow, "");
        int i = com.paypal.oslo.feature.qrc.data.mapper.InputMappersKt.WhenMappings.$EnumSwitchMapping$3[productFlow.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.qrc.graphql.type.QRCodeClientConfigurationProductFlow.DIRECT_INTEGRATION_IN_STORE_PAYMENT;
        }
        if (i == 2) {
            return null;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentOptionsInput toQRCodePaymentOptionsInput(com.paypal.oslo.feature.qrc.domain.model.review.PaymentPlanningRequest paymentPlanningRequest) {
        com.apollographql.apollo.api.Optional.Absent absent;
        com.apollographql.apollo.api.Optional.Absent absent2;
        com.apollographql.apollo.api.Optional.Absent absent3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentPlanningRequest, "");
        if (paymentPlanningRequest.isPayPalWorld()) {
            absent = com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.feature.qrc.graphql.type.NetworkOfWalletsInput(com.paypal.oslo.feature.qrc.graphql.type.NetworkOfWalletsName.PAYPAL_WORLD));
        } else {
            absent = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        }
        com.apollographql.apollo.api.Optional optional = absent;
        java.util.List<java.lang.String> flowDirectives = paymentPlanningRequest.getFlowDirectives();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(flowDirectives, 10));
        java.util.Iterator<T> it = flowDirectives.iterator();
        while (it.hasNext()) {
            arrayList.add(com.paypal.oslo.feature.qrc.graphql.type.QRCodeFlowDirective.INSTANCE.safeValueOf((java.lang.String) it.next()));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (((com.paypal.oslo.feature.qrc.graphql.type.QRCodeFlowDirective) obj) != com.paypal.oslo.feature.qrc.graphql.type.QRCodeFlowDirective.UNKNOWN__) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = arrayList2;
        if (arrayList3.isEmpty()) {
            arrayList3 = null;
        }
        java.lang.String qrCodeReferenceId = paymentPlanningRequest.getQrCodeReferenceId();
        if (paymentPlanningRequest.getPaymentAmount() != null) {
            absent2 = com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.feature.qrc.graphql.type.MoneyInput(paymentPlanningRequest.getPaymentAmount().getCurrencyCode(), paymentPlanningRequest.getPaymentAmount().getValue()));
        } else {
            absent2 = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        }
        com.apollographql.apollo.api.Optional optional2 = absent2;
        if (paymentPlanningRequest.getTipAmount() != null) {
            absent3 = com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.feature.qrc.graphql.type.MoneyInput(paymentPlanningRequest.getTipAmount().getCurrencyCode(), paymentPlanningRequest.getTipAmount().getValue()));
        } else {
            absent3 = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        }
        com.apollographql.apollo.api.Optional optional3 = absent3;
        com.apollographql.apollo.api.Optional.Present present = com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.feature.qrc.graphql.type.QRCodeClientConfigurationProductCode.IN_STORE);
        com.apollographql.apollo.api.Optional.Present present2 = com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.feature.qrc.graphql.type.QRCodeClientConfigurationProductFeature.IN_STORE_PAYMENT);
        com.apollographql.apollo.api.Optional.Present present3 = com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.feature.qrc.graphql.type.QRCodeClientConfigurationAPIName.PAYMENT_OPTIONS_V1);
        com.apollographql.apollo.api.Optional.Present present4 = com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.feature.qrc.graphql.type.QRCodeUserExperienceFlow.NATIVE);
        com.apollographql.apollo.api.Optional.Present present5 = com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.feature.qrc.graphql.type.QRCodeClientConfigurationEntryPoint.QR_CODE);
        com.apollographql.apollo.api.Optional.Present present6 = com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.feature.qrc.graphql.type.QRCodeClientConfigurationChannel.MOBILE_APP);
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.qrc.domain.model.session.ProductFlow productFlow = paymentPlanningRequest.getProductFlow();
        return new com.paypal.oslo.feature.qrc.graphql.type.QRCodePaymentOptionsInput(qrCodeReferenceId, optional2, optional3, null, null, new com.paypal.oslo.feature.qrc.graphql.type.QRCodeClientConfigurationInput(present, present2, present3, new com.paypal.oslo.feature.qrc.graphql.type.QRCodeProductExperienceInput(present4, present5, present6, companion.presentIfNotNull(productFlow != null ? toGraphQLProductFlow(productFlow) : null)), optional), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(arrayList3), null, 152, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason.values().length];
            try {
                iArr[com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason.USER_CANCELLATION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason.FUNDING_OPTIONS_UNAVAILABLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason.RISK_DECLINE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason.THREE_D_SECURE_AUTHENTICATION_FAILURE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason.INTERNAL_ERROR.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability.values().length];
            try {
                iArr2[com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability.ONLINE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability.OFFLINE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType.values().length];
            try {
                iArr3[com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType.PAYPAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr3[com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType.VENMO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr3[com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType.UNION_PAY_INTERNATIONAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr3[com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType.PAYPAL_WORLD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[com.paypal.oslo.feature.qrc.domain.model.session.ProductFlow.values().length];
            try {
                iArr4[com.paypal.oslo.feature.qrc.domain.model.session.ProductFlow.DIRECT_INTEGRATION_IN_STORE_PAYMENT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr4[com.paypal.oslo.feature.qrc.domain.model.session.ProductFlow.IN_PERSON_PAYMENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }
}
