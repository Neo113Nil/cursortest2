package com.zettle.sdk.feature.taptopay.core.attestation;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "status", "", "Lcom/zettle/sdk/feature/taptopay/core/attestation/RecommendedAction;", "recoverableActions", "Lcom/zettle/sdk/feature/taptopay/core/attestation/AttestationResult;", "resolveAttestationStatus", "(ILjava/util/List;)Lcom/zettle/sdk/feature/taptopay/core/attestation/AttestationResult;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AttestationResultKt {
    public static /* synthetic */ com.zettle.sdk.feature.taptopay.core.attestation.AttestationResult resolveAttestationStatus$default(int i, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        return resolveAttestationStatus(i, list);
    }

    public static final com.zettle.sdk.feature.taptopay.core.attestation.AttestationResult resolveAttestationStatus(int i, java.util.List<com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction> list) {
        com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.UnknownError unknownError;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (i == 769) {
            return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.DifferentUserIdentifier.INSTANCE;
        }
        if (i != 770) {
            switch (i) {
                case -2:
                    return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NeedsPermissions.INSTANCE;
                case -1:
                    return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NotInit.INSTANCE;
                case 0:
                    return com.zettle.sdk.feature.taptopay.core.attestation.AttestationResult.AttestationOK.INSTANCE;
                case 1:
                    return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.GeneralError.INSTANCE;
                case 2:
                    return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.GeneralBusinessError.INSTANCE;
                case 3:
                    return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.InvalidArgument.INSTANCE;
                case 4:
                    return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.InvalidState.INSTANCE;
                case 5:
                    return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.BufferUnderFlow.INSTANCE;
                case 6:
                    return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.BufferOverflow.INSTANCE;
                case 7:
                    return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NullPointer.INSTANCE;
                case 8:
                    return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NotPermit.INSTANCE;
                case 9:
                    return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.OutOfMemory.INSTANCE;
                case 10:
                    return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.Todo.INSTANCE;
                case 11:
                    return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.GooglePlayServiceError.INSTANCE;
                case 12:
                    return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.SafetyNetError.INSTANCE;
                default:
                    switch (i) {
                        case 256:
                            return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.LibInvalidKey.INSTANCE;
                        case 257:
                            return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NoEntry.INSTANCE;
                        case 258:
                            return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NetworkError.INSTANCE;
                        case 259:
                            return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.InvalidResponse.INSTANCE;
                        default:
                            switch (i) {
                                case 513:
                                    return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.NoKey.INSTANCE;
                                case my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_KEY_INVALID /* 514 */:
                                    return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.KeyInvalid.INSTANCE;
                                case my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_DUKPT_KEY_INVALID /* 515 */:
                                    return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.DukptKeyInvalid.INSTANCE;
                                case my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR /* 516 */:
                                    return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.CryptoError.INSTANCE;
                                case my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CERTIFICATE /* 517 */:
                                    return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.InvalidCertificate.INSTANCE;
                                case my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CERTIFICATE_NOT_FOUND /* 518 */:
                                    return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.CertificateNotFound.INSTANCE;
                                case my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE /* 519 */:
                                    return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.InvalidCACertificate.INSTANCE;
                                case my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL /* 520 */:
                                    return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.AttestationCOTSFail.INSTANCE;
                                case my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL /* 521 */:
                                    return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.AttestationScrpFail.INSTANCE;
                                case my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ACTIVATION_SCRP_FAIL /* 522 */:
                                    return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.ActivationScrpFail.INSTANCE;
                                case 523:
                                    return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.ProvisionFail.INSTANCE;
                                case 524:
                                    return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.KeyExchangeFail.INSTANCE;
                                default:
                                    if (list.isEmpty()) {
                                        return new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.UnknownError(i);
                                    }
                                    java.lang.Object m23168fromIoAF18A = com.zettle.sdk.feature.taptopay.core.attestation.RemoteStatusCodes.INSTANCE.m23168fromIoAF18A(i);
                                    if (kotlin.Result.m23441isFailureimpl(m23168fromIoAF18A)) {
                                        m23168fromIoAF18A = null;
                                    }
                                    com.zettle.sdk.feature.taptopay.core.attestation.RemoteStatusCodes remoteStatusCodes = (com.zettle.sdk.feature.taptopay.core.attestation.RemoteStatusCodes) m23168fromIoAF18A;
                                    switch (remoteStatusCodes == null ? -1 : com.zettle.sdk.feature.taptopay.core.attestation.AttestationResultKt.WhenMappings.$EnumSwitchMapping$0[remoteStatusCodes.ordinal()]) {
                                        case -1:
                                            unknownError = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.UnknownError(i);
                                            break;
                                        case 0:
                                        default:
                                            throw new kotlin.NoWhenBranchMatchedException();
                                        case 1:
                                            unknownError = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.TimeMismatchDetected((com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction) kotlin.collections.CollectionsKt.first((java.util.List) list));
                                            break;
                                        case 2:
                                            unknownError = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.OutdatedSecurityPatch((com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction) kotlin.collections.CollectionsKt.first((java.util.List) list));
                                            break;
                                        case 3:
                                            unknownError = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.UnknownInstallationSource((com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction) kotlin.collections.CollectionsKt.first((java.util.List) list));
                                            break;
                                        case 4:
                                            unknownError = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.PlayIntegrityFail((com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction) kotlin.collections.CollectionsKt.first((java.util.List) list));
                                            break;
                                        case 5:
                                            unknownError = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.DeveloperOptionsDetected((com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction) kotlin.collections.CollectionsKt.first((java.util.List) list));
                                            break;
                                        case 6:
                                            unknownError = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.ADBDetected((com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction) kotlin.collections.CollectionsKt.first((java.util.List) list));
                                            break;
                                        case 7:
                                            unknownError = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.RootedDetected((com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction) kotlin.collections.CollectionsKt.first((java.util.List) list));
                                            break;
                                        case 8:
                                            unknownError = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.DebuggingDetected((com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction) kotlin.collections.CollectionsKt.first((java.util.List) list));
                                            break;
                                        case 9:
                                            unknownError = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.EmulatorDetected((com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction) kotlin.collections.CollectionsKt.first((java.util.List) list));
                                            break;
                                        case 10:
                                            unknownError = new com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.HookedDetected((com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction) kotlin.collections.CollectionsKt.first((java.util.List) list));
                                            break;
                                    }
                                    return unknownError;
                            }
                    }
            }
        }
        return com.zettle.sdk.feature.taptopay.core.attestation.ErrorReason.DiffScrpId.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.zettle.sdk.feature.taptopay.core.attestation.RemoteStatusCodes.values().length];
            try {
                iArr[com.zettle.sdk.feature.taptopay.core.attestation.RemoteStatusCodes.RST_POG_TIME_NOT_SYNC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.zettle.sdk.feature.taptopay.core.attestation.RemoteStatusCodes.RST_POG_OUTDATED_SECURITY_PATCH.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.zettle.sdk.feature.taptopay.core.attestation.RemoteStatusCodes.RST_POG_UNKNOWN_INSTALLATION_SOURCE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.zettle.sdk.feature.taptopay.core.attestation.RemoteStatusCodes.RST_POG_PLAY_INTEGRITY_FAIL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.zettle.sdk.feature.taptopay.core.attestation.RemoteStatusCodes.RST_POG_IS_DEVELOPER_OPTION_ENABLED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.zettle.sdk.feature.taptopay.core.attestation.RemoteStatusCodes.RST_POG_IS_ADB_ENABLED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.zettle.sdk.feature.taptopay.core.attestation.RemoteStatusCodes.RST_POG_IS_ROOTED_ERROR.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.zettle.sdk.feature.taptopay.core.attestation.RemoteStatusCodes.RST_POG_IS_DEBUGGING_ERROR.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.zettle.sdk.feature.taptopay.core.attestation.RemoteStatusCodes.RST_POG_IS_EMULATOR_ERROR.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.zettle.sdk.feature.taptopay.core.attestation.RemoteStatusCodes.RST_POG_IS_HOOKED_ERROR.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
