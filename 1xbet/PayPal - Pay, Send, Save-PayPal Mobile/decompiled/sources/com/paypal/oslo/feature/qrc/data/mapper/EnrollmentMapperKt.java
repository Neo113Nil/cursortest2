package com.paypal.oslo.feature.qrc.data.mapper;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/EnrollConsumerPresentedQrCodeMutation$EnrollConsumerPresentedQrCode;", "Lcom/paypal/oslo/feature/qrc/domain/model/enrollment/QrcEnrollmentResult;", "toQrcEnrollmentResult", "(Lcom/paypal/oslo/feature/qrc/graphql/EnrollConsumerPresentedQrCodeMutation$EnrollConsumerPresentedQrCode;)Lcom/paypal/oslo/feature/qrc/domain/model/enrollment/QrcEnrollmentResult;", "Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$ConsumerPresentedQrCodeEligibility;", "Lcom/paypal/oslo/feature/qrc/domain/model/eligibility/QrcEligibility;", "toQrcEligibility", "(Lcom/paypal/oslo/feature/qrc/graphql/GetConsumerPresentedQrCodeEligibilityQuery$ConsumerPresentedQrCodeEligibility;)Lcom/paypal/oslo/feature/qrc/domain/model/eligibility/QrcEligibility;", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeType;", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeType;)Lcom/paypal/oslo/feature/qrc/domain/model/session/QrCodeType;", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeEligibilityStatus;", "Lcom/paypal/oslo/feature/qrc/domain/model/eligibility/QrcEligibilityStatus;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeEligibilityStatus;)Lcom/paypal/oslo/feature/qrc/domain/model/eligibility/QrcEligibilityStatus;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EnrollmentMapperKt {
    public static final com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentResult toQrcEnrollmentResult(com.paypal.oslo.feature.qrc.graphql.EnrollConsumerPresentedQrCodeMutation.EnrollConsumerPresentedQrCode enrollConsumerPresentedQrCode) {
        com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentStatus qrcEnrollmentStatus;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enrollConsumerPresentedQrCode, "");
        com.paypal.oslo.feature.qrc.graphql.type.QRCodeType qrCodeType = enrollConsumerPresentedQrCode.getQrCodeType();
        com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentNextAction qrcEnrollmentNextAction = null;
        com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType Camera2StreamConfigurationMap = qrCodeType != null ? Camera2StreamConfigurationMap(qrCodeType) : null;
        int i = com.paypal.oslo.feature.qrc.data.mapper.EnrollmentMapperKt.WhenMappings.$EnumSwitchMapping$1[enrollConsumerPresentedQrCode.getStatus().ordinal()];
        if (i == 1) {
            qrcEnrollmentStatus = com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentStatus.ENROLLED;
        } else if (i == 2) {
            qrcEnrollmentStatus = com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentStatus.DENIED;
        } else if (i == 3) {
            qrcEnrollmentStatus = com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentStatus.PENDING;
        } else if (i == 4) {
            qrcEnrollmentStatus = com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentStatus.NEED_MORE_DATA;
        } else {
            if (i != 5) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            qrcEnrollmentStatus = com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentStatus.DENIED;
        }
        java.lang.String deniedReason = enrollConsumerPresentedQrCode.getDeniedReason();
        com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentNextAction nextAction = enrollConsumerPresentedQrCode.getNextAction();
        if (nextAction != null) {
            int i2 = com.paypal.oslo.feature.qrc.data.mapper.EnrollmentMapperKt.WhenMappings.$EnumSwitchMapping$2[nextAction.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    qrcEnrollmentNextAction = com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentNextAction.IDENTITY_VERIFICATION_REQUIRED;
                } else if (i2 != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            qrcEnrollmentNextAction = com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentNextAction.STEPUP_AUTH_REQUIRED;
        }
        return new com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcEnrollmentResult(Camera2StreamConfigurationMap, qrcEnrollmentStatus, deniedReason, qrcEnrollmentNextAction, enrollConsumerPresentedQrCode.getStepupAuthContextId());
    }

    public static final com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibility toQrcEligibility(com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.ConsumerPresentedQrCodeEligibility consumerPresentedQrCodeEligibility) {
        com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability qrcCapability;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerPresentedQrCodeEligibility, "");
        java.util.List<com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeEligibilityStatus> qrCodeEligibilityStatuses = consumerPresentedQrCodeEligibility.getQrCodeEligibilityStatuses();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(qrCodeEligibilityStatuses, 10));
        for (com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeEligibilityStatus qrCodeEligibilityStatus : qrCodeEligibilityStatuses) {
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeType qrCodeType = qrCodeEligibilityStatus.getQrCodeType();
            java.util.ArrayList arrayList2 = null;
            com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType Camera2StreamConfigurationMap = qrCodeType != null ? Camera2StreamConfigurationMap(qrCodeType) : null;
            com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus status = qrCodeEligibilityStatus.getStatus();
            com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus highResolutionOutputSizeshNQ4ISI = status != null ? getHighResolutionOutputSizeshNQ4ISI(status) : null;
            java.lang.String statusReason = qrCodeEligibilityStatus.getStatusReason();
            java.util.List<com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeCapability> qrCodeCapabilities = qrCodeEligibilityStatus.getQrCodeCapabilities();
            if (qrCodeCapabilities != null) {
                java.util.List<com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeCapability> list = qrCodeCapabilities;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                for (com.paypal.oslo.feature.qrc.graphql.GetConsumerPresentedQrCodeEligibilityQuery.QrCodeCapability qrCodeCapability : list) {
                    com.paypal.oslo.feature.qrc.graphql.type.QRCodeCapability capability = qrCodeCapability.getCapability();
                    if (capability != null) {
                        int i = com.paypal.oslo.feature.qrc.data.mapper.EnrollmentMapperKt.WhenMappings.$EnumSwitchMapping$4[capability.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                qrcCapability = com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability.OFFLINE;
                            } else if (i != 3) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                        }
                        qrcCapability = com.paypal.oslo.feature.qrc.domain.model.enrollment.QrcCapability.ONLINE;
                    } else {
                        qrcCapability = null;
                    }
                    com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus status2 = qrCodeCapability.getStatus();
                    arrayList3.add(new com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcCapabilityEligibilityStatus(qrcCapability, status2 != null ? getHighResolutionOutputSizeshNQ4ISI(status2) : null, qrCodeCapability.getStatusReason()));
                }
                arrayList2 = arrayList3;
            }
            arrayList.add(new com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcTypeEligibilityStatus(Camera2StreamConfigurationMap, highResolutionOutputSizeshNQ4ISI, statusReason, arrayList2));
        }
        return new com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibility(arrayList);
    }

    private static final com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType Camera2StreamConfigurationMap(com.paypal.oslo.feature.qrc.graphql.type.QRCodeType qRCodeType) {
        int i = com.paypal.oslo.feature.qrc.data.mapper.EnrollmentMapperKt.WhenMappings.$EnumSwitchMapping$0[qRCodeType.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType.PAYPAL;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType.VENMO;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType.UNION_PAY_INTERNATIONAL;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType.PAYPAL_WORLD;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.qrc.domain.model.session.QrCodeType.PAYPAL;
    }

    private static final com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus qRCodeEligibilityStatus) {
        int i = com.paypal.oslo.feature.qrc.data.mapper.EnrollmentMapperKt.WhenMappings.$EnumSwitchMapping$3[qRCodeEligibilityStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus.ELIGIBLE;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus.ELIGIBLE_WITH_CONDITIONS;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus.INELIGIBLE;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus.ENROLLED;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.qrc.domain.model.eligibility.QrcEligibilityStatus.INELIGIBLE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.qrc.graphql.type.QRCodeType.values().length];
            try {
                iArr[com.paypal.oslo.feature.qrc.graphql.type.QRCodeType.PAYPAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.qrc.graphql.type.QRCodeType.VENMO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.qrc.graphql.type.QRCodeType.UNION_PAY_INTERNATIONAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.qrc.graphql.type.QRCodeType.PAYPAL_WORLD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.qrc.graphql.type.QRCodeType.UNKNOWN__.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentStatus.values().length];
            try {
                iArr2[com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentStatus.ENROLLED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentStatus.DENIED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentStatus.PENDING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentStatus.NEED_MORE_DATA.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentStatus.UNKNOWN__.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentNextAction.values().length];
            try {
                iArr3[com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentNextAction.STEPUP_AUTH_REQUIRED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr3[com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentNextAction.IDENTITY_VERIFICATION_REQUIRED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr3[com.paypal.oslo.feature.qrc.graphql.type.QRCodeEnrollmentNextAction.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus.values().length];
            try {
                iArr4[com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus.ELIGIBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr4[com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus.ELIGIBLE_WITH_CONDITIONS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr4[com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus.INELIGIBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr4[com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus.ENROLLED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr4[com.paypal.oslo.feature.qrc.graphql.type.QRCodeEligibilityStatus.UNKNOWN__.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[com.paypal.oslo.feature.qrc.graphql.type.QRCodeCapability.values().length];
            try {
                iArr5[com.paypal.oslo.feature.qrc.graphql.type.QRCodeCapability.ONLINE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr5[com.paypal.oslo.feature.qrc.graphql.type.QRCodeCapability.OFFLINE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr5[com.paypal.oslo.feature.qrc.graphql.type.QRCodeCapability.UNKNOWN__.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }
}
