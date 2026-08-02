package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/NameLayoutUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/repository/NameRepository;", "nameRepository", "Lcom/paypal/oslo/core/i18n/domain/util/NameUtil;", "nameUtil", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/repository/NameRepository;Lcom/paypal/oslo/core/i18n/domain/util/NameUtil;)V", "Lcom/paypal/oslo/core/i18n/domain/model/NameInput;", "nameInput", "Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration;", "nameConfiguration", "Larrow/core/Either;", "Lcom/paypal/oslo/core/i18n/domain/model/NameError;", "Lcom/paypal/oslo/core/i18n/domain/model/NameLayout;", "invoke", "(Lcom/paypal/oslo/core/i18n/domain/model/NameInput;Lcom/paypal/oslo/core/i18n/domain/model/NameConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/i18n/domain/repository/NameRepository;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/i18n/domain/util/NameUtil;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NameLayoutUseCase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.util.NameUtil getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.repository.NameRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public NameLayoutUseCase(com.paypal.oslo.core.i18n.domain.repository.NameRepository nameRepository, com.paypal.oslo.core.i18n.domain.util.NameUtil nameUtil) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameUtil, "");
        this.getHighSpeedVideoSizes = nameRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = nameUtil;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.core.i18n.domain.usecase.NameLayoutUseCase nameLayoutUseCase, com.paypal.oslo.core.i18n.domain.model.NameInput nameInput, com.paypal.oslo.core.i18n.domain.model.NameConfiguration nameConfiguration, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            nameConfiguration = null;
        }
        return nameLayoutUseCase.invoke(nameInput, nameConfiguration, continuation);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x022f, code lost:
    
        if (r10 != null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x018b, code lost:
    
        if (r10 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01c2, code lost:
    
        if (r10 != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01f8, code lost:
    
        if (r10 != null) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.core.i18n.domain.model.NameInput nameInput, com.paypal.oslo.core.i18n.domain.model.NameConfiguration nameConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.i18n.domain.model.NameError, com.paypal.oslo.core.i18n.domain.model.NameLayout>> continuation) {
        com.paypal.oslo.core.i18n.domain.usecase.NameLayoutUseCase$invoke$1 nameLayoutUseCase$invoke$1;
        int i;
        com.paypal.oslo.core.i18n.domain.model.name.NameMetadata nameMetadata;
        java.lang.String primaryScript;
        com.paypal.oslo.core.i18n.domain.model.name.PersonNameMetadata defaultMetadata;
        java.lang.String resolveLayout$i18n_release;
        kotlin.Triple triple;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        com.paypal.oslo.core.i18n.domain.model.name.PersonNameMetadata countryMetadata;
        com.paypal.oslo.core.i18n.domain.model.NameInput nameInput2 = nameInput;
        com.paypal.oslo.core.i18n.domain.model.NameConfiguration nameConfiguration2 = nameConfiguration;
        if (continuation instanceof com.paypal.oslo.core.i18n.domain.usecase.NameLayoutUseCase$invoke$1) {
            nameLayoutUseCase$invoke$1 = (com.paypal.oslo.core.i18n.domain.usecase.NameLayoutUseCase$invoke$1) continuation;
            if ((nameLayoutUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                nameLayoutUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = nameLayoutUseCase$invoke$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = nameLayoutUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.i18n.LoggerKt.log, "NameLayout UseCase invoked", null, null, 6, null);
                    java.util.Locale resolveLocale$i18n_release = this.getHighResolutionOutputSizeshNQ4ISI.resolveLocale$i18n_release(nameInput2, nameConfiguration2);
                    kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.core.i18n.domain.error.NameMetadataError, com.paypal.oslo.core.i18n.domain.model.name.NameMetadata>> nameMetadata2 = this.getHighSpeedVideoSizes.getNameMetadata(resolveLocale$i18n_release != null ? resolveLocale$i18n_release.getCountry() : null, resolveLocale$i18n_release);
                    nameLayoutUseCase$invoke$1.getHighSpeedVideoFpsRanges = nameInput2;
                    nameLayoutUseCase$invoke$1.getHighSpeedVideoSizes = nameConfiguration2;
                    nameLayoutUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(resolveLocale$i18n_release);
                    nameLayoutUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.first(nameMetadata2, nameLayoutUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.paypal.oslo.core.i18n.domain.model.NameConfiguration nameConfiguration3 = (com.paypal.oslo.core.i18n.domain.model.NameConfiguration) nameLayoutUseCase$invoke$1.getHighSpeedVideoSizes;
                    com.paypal.oslo.core.i18n.domain.model.NameInput nameInput3 = (com.paypal.oslo.core.i18n.domain.model.NameInput) nameLayoutUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    nameConfiguration2 = nameConfiguration3;
                    nameInput2 = nameInput3;
                }
                nameMetadata = (com.paypal.oslo.core.i18n.domain.model.name.NameMetadata) ((arrow.core.Either) obj).getOrNull();
                if (nameMetadata != null || (countryMetadata = nameMetadata.getCountryMetadata()) == null || (primaryScript = countryMetadata.getPrimaryScript()) == null) {
                    primaryScript = (nameMetadata != null || (defaultMetadata = nameMetadata.getDefaultMetadata()) == null) ? null : defaultMetadata.getPrimaryScript();
                }
                resolveLayout$i18n_release = this.getHighResolutionOutputSizeshNQ4ISI.resolveLayout$i18n_release(nameInput2, nameConfiguration2, primaryScript, nameMetadata);
                if (resolveLayout$i18n_release != null) {
                    return arrow.core.EitherKt.left(new com.paypal.oslo.core.i18n.domain.model.NameError.NoLayoutFound("No Layout Found for script ".concat(java.lang.String.valueOf(primaryScript))));
                }
                java.util.List<java.lang.String> layoutProperties$i18n_release = this.getHighResolutionOutputSizeshNQ4ISI.getLayoutProperties$i18n_release(nameInput2, nameConfiguration2, primaryScript, nameMetadata);
                com.paypal.oslo.core.i18n.domain.model.name.NameLabelMetadata countryNameLabel = nameMetadata != null ? nameMetadata.getCountryNameLabel() : null;
                com.paypal.oslo.core.i18n.domain.model.name.NameLabelMetadata defaultNameLabel = nameMetadata != null ? nameMetadata.getDefaultNameLabel() : null;
                kotlin.text.Regex regex = new kotlin.text.Regex("\\{([^}]+)\\}");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                boolean z = false;
                java.util.Iterator it = kotlin.text.Regex.findAll$default(regex, resolveLayout$i18n_release, 0, 2, null).iterator();
                int i2 = 0;
                while (true) {
                    java.lang.String str5 = "";
                    if (!it.hasNext()) {
                        if (i2 < resolveLayout$i18n_release.length()) {
                            java.lang.String substring = resolveLayout$i18n_release.substring(i2);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                            if (substring.length() > 0) {
                                arrayList.add(new com.paypal.oslo.core.i18n.domain.model.NameLayout.NameComponent(com.paypal.oslo.core.i18n.domain.model.UnknownNameField.m11540boximpl(com.paypal.oslo.core.i18n.domain.model.UnknownNameField.m11541constructorimpl(substring)), "", false));
                            }
                        }
                        return arrow.core.EitherKt.right(new com.paypal.oslo.core.i18n.domain.model.NameLayout(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.i18n.domain.model.NameLayout.NameRow(arrayList))));
                    }
                    kotlin.text.MatchResult matchResult = (kotlin.text.MatchResult) it.next();
                    java.lang.String str6 = matchResult.getGroupValues().get(1);
                    boolean shouldSkipField$i18n_release = this.getHighResolutionOutputSizeshNQ4ISI.shouldSkipField$i18n_release(str6, layoutProperties$i18n_release);
                    if (matchResult.getRange().getFirst() > i2 && !shouldSkipField$i18n_release) {
                        java.lang.String substring2 = resolveLayout$i18n_release.substring(i2, matchResult.getRange().getFirst());
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
                        if (substring2.length() > 0) {
                            arrayList.add(new com.paypal.oslo.core.i18n.domain.model.NameLayout.NameComponent(com.paypal.oslo.core.i18n.domain.model.UnknownNameField.m11540boximpl(com.paypal.oslo.core.i18n.domain.model.UnknownNameField.m11541constructorimpl(substring2)), "", z));
                        }
                    }
                    if (!shouldSkipField$i18n_release) {
                        if (nameInput2 instanceof com.paypal.oslo.core.i18n.domain.model.NameInput.Person) {
                            com.paypal.oslo.core.i18n.domain.model.PersonName name2 = ((com.paypal.oslo.core.i18n.domain.model.NameInput.Person) nameInput2).getName();
                            int hashCode = str6.hashCode();
                            java.lang.Boolean bool = java.lang.Boolean.TRUE;
                            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                            switch (hashCode) {
                                case -1852993317:
                                    if (str6.equals("surname")) {
                                        java.lang.String m11449getSurName5MXJos4 = name2.m11449getSurName5MXJos4();
                                        if (m11449getSurName5MXJos4 == null) {
                                            m11449getSurName5MXJos4 = null;
                                        }
                                        if (m11449getSurName5MXJos4 == null) {
                                            m11449getSurName5MXJos4 = "";
                                        }
                                        com.paypal.oslo.core.i18n.domain.model.Surname m11522boximpl = com.paypal.oslo.core.i18n.domain.model.Surname.m11522boximpl(com.paypal.oslo.core.i18n.domain.model.Surname.m11523constructorimpl(m11449getSurName5MXJos4));
                                        if (countryNameLabel == null || (str = countryNameLabel.getSurname()) == null) {
                                            if (defaultNameLabel == null) {
                                                str = null;
                                                break;
                                            } else {
                                                str = defaultNameLabel.getSurname();
                                                break;
                                            }
                                        }
                                        str5 = str;
                                        triple = new kotlin.Triple(m11522boximpl, str5, bool);
                                        break;
                                    }
                                    triple = new kotlin.Triple(com.paypal.oslo.core.i18n.domain.model.UnknownNameField.m11540boximpl(com.paypal.oslo.core.i18n.domain.model.UnknownNameField.m11541constructorimpl("")), str6, bool2);
                                    break;
                                case -818219584:
                                    if (str6.equals(com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName)) {
                                        java.lang.String m11447getMiddleName114sck0 = name2.m11447getMiddleName114sck0();
                                        if (m11447getMiddleName114sck0 == null) {
                                            m11447getMiddleName114sck0 = null;
                                        }
                                        if (m11447getMiddleName114sck0 == null) {
                                            m11447getMiddleName114sck0 = "";
                                        }
                                        com.paypal.oslo.core.i18n.domain.model.MiddleName m11428boximpl = com.paypal.oslo.core.i18n.domain.model.MiddleName.m11428boximpl(com.paypal.oslo.core.i18n.domain.model.MiddleName.m11429constructorimpl(m11447getMiddleName114sck0));
                                        if (countryNameLabel == null || (str2 = countryNameLabel.getMiddleName()) == null) {
                                            if (defaultNameLabel == null) {
                                                str2 = null;
                                                break;
                                            } else {
                                                str2 = defaultNameLabel.getMiddleName();
                                                break;
                                            }
                                        }
                                        str5 = str2;
                                        triple = new kotlin.Triple(m11428boximpl, str5, bool2);
                                        break;
                                    }
                                    triple = new kotlin.Triple(com.paypal.oslo.core.i18n.domain.model.UnknownNameField.m11540boximpl(com.paypal.oslo.core.i18n.domain.model.UnknownNameField.m11541constructorimpl("")), str6, bool2);
                                    break;
                                case -329336377:
                                    if (str6.equals("secondSurname")) {
                                        java.lang.String m11448getSecondSurnamedtlYlO0 = name2.m11448getSecondSurnamedtlYlO0();
                                        if (m11448getSecondSurnamedtlYlO0 == null) {
                                            m11448getSecondSurnamedtlYlO0 = null;
                                        }
                                        if (m11448getSecondSurnamedtlYlO0 == null) {
                                            m11448getSecondSurnamedtlYlO0 = "";
                                        }
                                        com.paypal.oslo.core.i18n.domain.model.SecondSurname m11477boximpl = com.paypal.oslo.core.i18n.domain.model.SecondSurname.m11477boximpl(com.paypal.oslo.core.i18n.domain.model.SecondSurname.m11478constructorimpl(m11448getSecondSurnamedtlYlO0));
                                        if (countryNameLabel == null || (str3 = countryNameLabel.getSecondSurname()) == null) {
                                            if (defaultNameLabel == null) {
                                                str3 = null;
                                                break;
                                            } else {
                                                str3 = defaultNameLabel.getSecondSurname();
                                                break;
                                            }
                                        }
                                        str5 = str3;
                                        triple = new kotlin.Triple(m11477boximpl, str5, bool2);
                                        break;
                                    }
                                    triple = new kotlin.Triple(com.paypal.oslo.core.i18n.domain.model.UnknownNameField.m11540boximpl(com.paypal.oslo.core.i18n.domain.model.UnknownNameField.m11541constructorimpl("")), str6, bool2);
                                    break;
                                case 1469046696:
                                    if (str6.equals(com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName)) {
                                        java.lang.String m11446getGivenNamedfzjkSU = name2.m11446getGivenNamedfzjkSU();
                                        if (m11446getGivenNamedfzjkSU == null) {
                                            m11446getGivenNamedfzjkSU = null;
                                        }
                                        if (m11446getGivenNamedfzjkSU == null) {
                                            m11446getGivenNamedfzjkSU = "";
                                        }
                                        com.paypal.oslo.core.i18n.domain.model.GivenName m11413boximpl = com.paypal.oslo.core.i18n.domain.model.GivenName.m11413boximpl(com.paypal.oslo.core.i18n.domain.model.GivenName.m11414constructorimpl(m11446getGivenNamedfzjkSU));
                                        if (countryNameLabel == null || (str4 = countryNameLabel.getGivenName()) == null) {
                                            if (defaultNameLabel == null) {
                                                str4 = null;
                                                break;
                                            } else {
                                                str4 = defaultNameLabel.getGivenName();
                                                break;
                                            }
                                        }
                                        str5 = str4;
                                        triple = new kotlin.Triple(m11413boximpl, str5, bool);
                                        break;
                                    }
                                    triple = new kotlin.Triple(com.paypal.oslo.core.i18n.domain.model.UnknownNameField.m11540boximpl(com.paypal.oslo.core.i18n.domain.model.UnknownNameField.m11541constructorimpl("")), str6, bool2);
                                    break;
                                default:
                                    triple = new kotlin.Triple(com.paypal.oslo.core.i18n.domain.model.UnknownNameField.m11540boximpl(com.paypal.oslo.core.i18n.domain.model.UnknownNameField.m11541constructorimpl("")), str6, bool2);
                                    break;
                            }
                        } else {
                            if (!(nameInput2 instanceof com.paypal.oslo.core.i18n.domain.model.NameInput.Business)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            triple = kotlin.jvm.internal.Intrinsics.areEqual(str6, "businessName") ? new kotlin.Triple(com.paypal.oslo.core.i18n.domain.model.BusinessEntityName.m11345boximpl(com.paypal.oslo.core.i18n.domain.model.BusinessEntityName.m11346constructorimpl(((com.paypal.oslo.core.i18n.domain.model.NameInput.Business) nameInput2).getBusinessName())), "Business Name", java.lang.Boolean.TRUE) : new kotlin.Triple(com.paypal.oslo.core.i18n.domain.model.UnknownNameField.m11540boximpl(com.paypal.oslo.core.i18n.domain.model.UnknownNameField.m11541constructorimpl("")), str6, java.lang.Boolean.FALSE);
                        }
                        arrayList.add(new com.paypal.oslo.core.i18n.domain.model.NameLayout.NameComponent((com.paypal.oslo.core.i18n.domain.model.Field) triple.component1(), (java.lang.String) triple.component2(), ((java.lang.Boolean) triple.component3()).booleanValue()));
                    }
                    i2 = matchResult.getRange().getLast() + 1;
                    z = false;
                }
            }
        }
        nameLayoutUseCase$invoke$1 = new com.paypal.oslo.core.i18n.domain.usecase.NameLayoutUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = nameLayoutUseCase$invoke$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = nameLayoutUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        nameMetadata = (com.paypal.oslo.core.i18n.domain.model.name.NameMetadata) ((arrow.core.Either) obj2).getOrNull();
        if (nameMetadata != null) {
        }
        if (nameMetadata != null) {
        }
        resolveLayout$i18n_release = this.getHighResolutionOutputSizeshNQ4ISI.resolveLayout$i18n_release(nameInput2, nameConfiguration2, primaryScript, nameMetadata);
        if (resolveLayout$i18n_release != null) {
        }
    }
}
