package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\r\u001a&\u0012\"\u0012 \u0012\u0004\u0012\u00020\t\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0007\u0012\u0004\u0012\u00020\f0\n0\b0\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u000eJ=\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/usecase/ValidationConfigBuilder;", "", "<init>", "()V", "Lcom/paypal/oslo/core/i18n/domain/model/name/ScriptValidation;", "countryScriptValidation", "defaultScriptValidation", "", "Lkotlin/Pair;", "Lcom/paypal/oslo/core/i18n/domain/model/name/ValidationConfig;", "Lkotlin/Function1;", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "Lcom/paypal/oslo/core/i18n/domain/model/NameValidationError;", "buildPersonScriptValidations", "(Lcom/paypal/oslo/core/i18n/domain/model/name/ScriptValidation;Lcom/paypal/oslo/core/i18n/domain/model/name/ScriptValidation;)Ljava/util/List;", "Lcom/paypal/oslo/core/i18n/domain/usecase/BusinessValidationData;", "buildBusinessValidations", "", "", "p0", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ValidationConfigBuilder {
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0167, code lost:
    
        if ((r15 != null ? r15.getPunctuationRegex() : null) != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if ((r15 != null ? r15.getCharacterRange() : null) != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<kotlin.Pair<com.paypal.oslo.core.i18n.domain.model.name.ValidationConfig, kotlin.jvm.functions.Function1<java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Field>, com.paypal.oslo.core.i18n.domain.model.NameValidationError>>> buildPersonScriptValidations(com.paypal.oslo.core.i18n.domain.model.name.ScriptValidation countryScriptValidation, com.paypal.oslo.core.i18n.domain.model.name.ScriptValidation defaultScriptValidation) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String characterRange;
        java.lang.String characterRange2;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> validList;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> validList2;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> offensive;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> offensive2;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> nonVowel;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> nonVowel2;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> keyboardBanging;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> keyboardBanging2;
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        java.util.Map<java.lang.String, java.lang.String> map = null;
        if ((countryScriptValidation != null ? countryScriptValidation.getCharacterRange() : null) == null) {
        }
        if (countryScriptValidation == null || (characterRange2 = countryScriptValidation.getCharacterRange()) == null) {
            str = null;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("^(");
            sb.append(characterRange2);
            sb.append(")*$");
            str = sb.toString();
        }
        if (defaultScriptValidation == null || (characterRange = defaultScriptValidation.getCharacterRange()) == null) {
            str2 = null;
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("^(");
            sb2.append(characterRange);
            sb2.append(")*$");
            str2 = sb2.toString();
        }
        createListBuilder.add(kotlin.TuplesKt.to(new com.paypal.oslo.core.i18n.domain.model.name.ValidationConfig(str, str2, null, false, false, 16, null), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.i18n.domain.usecase.ValidationConfigBuilder$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.core.i18n.domain.usecase.ValidationConfigBuilder.m11570$r8$lambda$ohsu_5t3tXzHpYK_BSASCNTXyA((java.util.List) obj);
            }
        }));
        java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((countryScriptValidation == null || (keyboardBanging2 = countryScriptValidation.getKeyboardBanging()) == null) ? null : keyboardBanging2.get("pattern"), (defaultScriptValidation == null || (keyboardBanging = defaultScriptValidation.getKeyboardBanging()) == null) ? null : keyboardBanging.get("pattern"));
        if (highResolutionOutputSizeshNQ4ISI != null) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(".*?(");
            sb3.append(highResolutionOutputSizeshNQ4ISI);
            sb3.append(").*?");
            createListBuilder.add(kotlin.TuplesKt.to(new com.paypal.oslo.core.i18n.domain.model.name.ValidationConfig(null, null, sb3.toString(), true, false), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.i18n.domain.usecase.ValidationConfigBuilder$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.core.i18n.domain.usecase.ValidationConfigBuilder.$r8$lambda$y25aOk7iBVISglJdxPyJZeLFUwI((java.util.List) obj);
                }
            }));
        }
        java.lang.String highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI((countryScriptValidation == null || (nonVowel2 = countryScriptValidation.getNonVowel()) == null) ? null : nonVowel2.get("pattern"), (defaultScriptValidation == null || (nonVowel = defaultScriptValidation.getNonVowel()) == null) ? null : nonVowel.get("pattern"));
        if (highResolutionOutputSizeshNQ4ISI2 != null) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("^(");
            sb4.append(highResolutionOutputSizeshNQ4ISI2);
            sb4.append(")$");
            createListBuilder.add(kotlin.TuplesKt.to(new com.paypal.oslo.core.i18n.domain.model.name.ValidationConfig(null, null, sb4.toString(), true, false), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.i18n.domain.usecase.ValidationConfigBuilder$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.core.i18n.domain.usecase.ValidationConfigBuilder.$r8$lambda$VY5fcYhBjAQ2c9B5D6v3rVQnRAY((java.util.List) obj);
                }
            }));
        }
        java.lang.String highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI((countryScriptValidation == null || (offensive2 = countryScriptValidation.getOffensive()) == null) ? null : offensive2.get("pattern"), (defaultScriptValidation == null || (offensive = defaultScriptValidation.getOffensive()) == null) ? null : offensive.get("pattern"));
        if (highResolutionOutputSizeshNQ4ISI3 != null) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder(".*?");
            sb5.append(highResolutionOutputSizeshNQ4ISI3);
            sb5.append(".*?");
            createListBuilder.add(kotlin.TuplesKt.to(new com.paypal.oslo.core.i18n.domain.model.name.ValidationConfig(null, null, sb5.toString(), true, false), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.i18n.domain.usecase.ValidationConfigBuilder$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.core.i18n.domain.usecase.ValidationConfigBuilder.m11568$r8$lambda$dAlQzPNT6a_lYOxbiBFkYM88pA((java.util.List) obj);
                }
            }));
        }
        if ((countryScriptValidation != null ? countryScriptValidation.getPunctuationRegex() : null) == null) {
        }
        createListBuilder.add(kotlin.TuplesKt.to(new com.paypal.oslo.core.i18n.domain.model.name.ValidationConfig(countryScriptValidation != null ? countryScriptValidation.getPunctuationRegex() : null, defaultScriptValidation != null ? defaultScriptValidation.getPunctuationRegex() : null, null, true, false), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.i18n.domain.usecase.ValidationConfigBuilder$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.core.i18n.domain.usecase.ValidationConfigBuilder.$r8$lambda$jawoFijwpThLCMPX6kc2n8W8lSw((java.util.List) obj);
            }
        }));
        java.util.Map<java.lang.String, java.lang.String> map2 = (countryScriptValidation == null || (validList2 = countryScriptValidation.getValidList()) == null) ? null : validList2.get("pattern");
        if (defaultScriptValidation != null && (validList = defaultScriptValidation.getValidList()) != null) {
            map = validList.get("pattern");
        }
        java.lang.String highResolutionOutputSizeshNQ4ISI4 = getHighResolutionOutputSizeshNQ4ISI(map2, map);
        if (highResolutionOutputSizeshNQ4ISI4 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("^(");
            sb6.append(highResolutionOutputSizeshNQ4ISI4);
            sb6.append(")$");
            createListBuilder.add(kotlin.TuplesKt.to(new com.paypal.oslo.core.i18n.domain.model.name.ValidationConfig(null, null, sb6.toString(), true, false), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.i18n.domain.usecase.ValidationConfigBuilder$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.core.i18n.domain.usecase.ValidationConfigBuilder.$r8$lambda$BPy9SvROO0AMtK5qnhz4VNIa7vM((java.util.List) obj);
                }
            }));
        }
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x012f, code lost:
    
        if ((r16 != null ? r16.getCharacterRange() : null) != null) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<com.paypal.oslo.core.i18n.domain.usecase.BusinessValidationData> buildBusinessValidations(com.paypal.oslo.core.i18n.domain.model.name.ScriptValidation countryScriptValidation, com.paypal.oslo.core.i18n.domain.model.name.ScriptValidation defaultScriptValidation) {
        java.lang.String obj;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> numberRange;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> numberRange2;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> offensive;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> offensive2;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> restrictedBusinessNameRange;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> restrictedBusinessNameRange2;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> punctuation;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> punctuation2;
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((countryScriptValidation == null || (punctuation2 = countryScriptValidation.getPunctuation()) == null) ? null : punctuation2.get("pattern"), (defaultScriptValidation == null || (punctuation = defaultScriptValidation.getPunctuation()) == null) ? null : punctuation.get("pattern"));
        if (highResolutionOutputSizeshNQ4ISI != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("^(");
            sb.append(highResolutionOutputSizeshNQ4ISI);
            sb.append(")*?$");
            createListBuilder.add(new com.paypal.oslo.core.i18n.domain.usecase.BusinessValidationData(sb.toString(), false, true, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.i18n.domain.usecase.ValidationConfigBuilder$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.core.i18n.domain.usecase.ValidationConfigBuilder.$r8$lambda$juX71egfLO_pcyepI2Q6j1Nilfc((java.util.List) obj2);
                }
            }, 2, null));
        }
        java.lang.String highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI((countryScriptValidation == null || (restrictedBusinessNameRange2 = countryScriptValidation.getRestrictedBusinessNameRange()) == null) ? null : restrictedBusinessNameRange2.get("pattern"), (defaultScriptValidation == null || (restrictedBusinessNameRange = defaultScriptValidation.getRestrictedBusinessNameRange()) == null) ? null : restrictedBusinessNameRange.get("pattern"));
        if (highResolutionOutputSizeshNQ4ISI2 != null) {
            createListBuilder.add(new com.paypal.oslo.core.i18n.domain.usecase.BusinessValidationData(highResolutionOutputSizeshNQ4ISI2, false, false, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.i18n.domain.usecase.ValidationConfigBuilder$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.core.i18n.domain.usecase.ValidationConfigBuilder.$r8$lambda$SLG6jsWEK8Vey_f_KTJDmwXpcB0((java.util.List) obj2);
                }
            }, 2, null));
        }
        java.lang.String highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI((countryScriptValidation == null || (offensive2 = countryScriptValidation.getOffensive()) == null) ? null : offensive2.get("pattern"), (defaultScriptValidation == null || (offensive = defaultScriptValidation.getOffensive()) == null) ? null : offensive.get("pattern"));
        if (highResolutionOutputSizeshNQ4ISI3 != null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(".*?");
            sb2.append(highResolutionOutputSizeshNQ4ISI3);
            sb2.append(".*?");
            createListBuilder.add(new com.paypal.oslo.core.i18n.domain.usecase.BusinessValidationData(sb2.toString(), false, false, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.i18n.domain.usecase.ValidationConfigBuilder$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.core.i18n.domain.usecase.ValidationConfigBuilder.m11566$r8$lambda$XvZQlkREFBEH6IyLyzIWVP5IWY((java.util.List) obj2);
                }
            }, 2, null));
        }
        java.lang.String highResolutionOutputSizeshNQ4ISI4 = getHighResolutionOutputSizeshNQ4ISI((countryScriptValidation == null || (numberRange2 = countryScriptValidation.getNumberRange()) == null) ? null : numberRange2.get("pattern"), (defaultScriptValidation == null || (numberRange = defaultScriptValidation.getNumberRange()) == null) ? null : numberRange.get("pattern"));
        if (highResolutionOutputSizeshNQ4ISI4 != null) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("^(");
            sb3.append(highResolutionOutputSizeshNQ4ISI4);
            sb3.append("*?)$");
            createListBuilder.add(new com.paypal.oslo.core.i18n.domain.usecase.BusinessValidationData(sb3.toString(), false, false, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.i18n.domain.usecase.ValidationConfigBuilder$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.core.i18n.domain.usecase.ValidationConfigBuilder.m11569$r8$lambda$nC4hFwofqSj3FcHCfVmMfr8ps((java.util.List) obj2);
                }
            }, 2, null));
        }
        if ((countryScriptValidation != null ? countryScriptValidation.getCharacterRange() : null) == null) {
        }
        if ((countryScriptValidation != null ? countryScriptValidation.getCharacterRange() : null) != null) {
            java.lang.String characterRange = countryScriptValidation.getCharacterRange();
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("^(");
            sb4.append(characterRange);
            sb4.append(")*?$");
            obj = sb4.toString();
        } else {
            java.lang.String characterRange2 = defaultScriptValidation != null ? defaultScriptValidation.getCharacterRange() : null;
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("^(");
            sb5.append(characterRange2);
            sb5.append(")*?$");
            obj = sb5.toString();
        }
        createListBuilder.add(new com.paypal.oslo.core.i18n.domain.usecase.BusinessValidationData(obj, false, true, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.i18n.domain.usecase.ValidationConfigBuilder$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.core.i18n.domain.usecase.ValidationConfigBuilder.m11567$r8$lambda$YH9rkM9l3WEhWWOL16YW6qL42o((java.util.List) obj2);
            }
        }));
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.util.Map<java.lang.String, java.lang.String> p0, java.util.Map<java.lang.String, java.lang.String> p1) {
        java.lang.String str;
        if (p0 != null && (str = p0.get(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT)) != null) {
            return str;
        }
        if (p1 != null) {
            return p1.get(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT);
        }
        return null;
    }

    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllRestricted $r8$lambda$BPy9SvROO0AMtK5qnhz4VNIa7vM(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return new com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllRestricted(list);
    }

    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.NameValidationError $r8$lambda$SLG6jsWEK8Vey_f_KTJDmwXpcB0(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return new com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllRestricted(list);
    }

    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllNonVowel $r8$lambda$VY5fcYhBjAQ2c9B5D6v3rVQnRAY(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return new com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllNonVowel(list);
    }

    /* renamed from: $r8$lambda$XvZQlkREFBEH6-IyLyzIWVP5IWY, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.NameValidationError m11566$r8$lambda$XvZQlkREFBEH6IyLyzIWVP5IWY(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return new com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllOffensive(list);
    }

    /* renamed from: $r8$lambda$YH9rkM9l3WEh-WWOL16YW6qL42o, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.NameValidationError m11567$r8$lambda$YH9rkM9l3WEhWWOL16YW6qL42o(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return new com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllRestricted(list);
    }

    /* renamed from: $r8$lambda$dAlQzPNT-6a_lYOxbiBFkYM88pA, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllOffensive m11568$r8$lambda$dAlQzPNT6a_lYOxbiBFkYM88pA(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return new com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllOffensive(list);
    }

    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllPunctuation $r8$lambda$jawoFijwpThLCMPX6kc2n8W8lSw(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return new com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllPunctuation(list);
    }

    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.NameValidationError $r8$lambda$juX71egfLO_pcyepI2Q6j1Nilfc(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return new com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllPunctuation(list);
    }

    /* renamed from: $r8$lambda$nC4hFwofq-Sj3FcHCfV-mMfr8ps, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.NameValidationError m11569$r8$lambda$nC4hFwofqSj3FcHCfVmMfr8ps(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return new com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllRestricted(list);
    }

    /* renamed from: $r8$lambda$ohsu_5t3tXzHpYK_BSASCNTXy-A, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllRestricted m11570$r8$lambda$ohsu_5t3tXzHpYK_BSASCNTXyA(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return new com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidAllRestricted(list);
    }

    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidKeyboardBanging $r8$lambda$y25aOk7iBVISglJdxPyJZeLFUwI(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return new com.paypal.oslo.core.i18n.domain.model.NameValidationError.InvalidKeyboardBanging(list);
    }
}
