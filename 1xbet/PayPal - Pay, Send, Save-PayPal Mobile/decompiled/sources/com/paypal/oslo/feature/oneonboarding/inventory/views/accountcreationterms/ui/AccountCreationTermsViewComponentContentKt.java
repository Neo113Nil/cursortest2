package com.paypal.oslo.feature.oneonboarding.inventory.views.accountcreationterms.ui;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001aA\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"resolveDeviceLocale", "Ljava/util/Locale;", "locales", "Landroid/os/LocaleList;", "AccountCreationTermsViewComponentContent", "", "countryCode", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "intentId", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "modifier", "Landroidx/compose/ui/Modifier;", "onLinkClick", "Lkotlin/Function1;", "", "AccountCreationTermsViewComponentContent-XR8wf50", "(Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "AccountCreationTermsViewComponentContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "one-onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AccountCreationTermsViewComponentContentKt {
    public static final java.util.Locale resolveDeviceLocale(android.os.LocaleList localeList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeList, "");
        if (localeList.isEmpty()) {
            java.util.Locale locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            return locale;
        }
        java.util.Locale locale2 = localeList.get(0);
        kotlin.jvm.internal.Intrinsics.checkNotNull(locale2);
        return locale2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005c  */
    /* renamed from: AccountCreationTermsViewComponentContent-XR8wf50, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m16893AccountCreationTermsViewComponentContentXR8wf50(final java.lang.String str, final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1889877001);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(intentId) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13 = i4 != 0 ? null : function12;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1889877001, i3, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.accountcreationterms.ui.AccountCreationTermsViewComponentContent (AccountCreationTermsViewComponentContent.kt:75)");
                    }
                    final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    boolean changedInstance = startRestartGroup.changedInstance(intentId);
                    boolean z = (i3 & 7168) == 2048;
                    boolean changedInstance2 = startRestartGroup.changedInstance(context);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((z | changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.accountcreationterms.ui.AccountCreationTermsViewComponentContentKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.oneonboarding.inventory.views.accountcreationterms.ui.AccountCreationTermsViewComponentContentKt.$r8$lambda$DaORAoloQrg_yuALomBNHBFKdWo(kotlin.jvm.functions.Function1.this, intentId, context, (java.lang.String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final kotlin.jvm.functions.Function1 function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                    android.os.LocaleList locales = ((android.content.res.Configuration) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration())).getLocales();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locales, "");
                    java.util.Locale resolveDeviceLocale = resolveDeviceLocale(locales);
                    boolean changed = startRestartGroup.changed(resolveDeviceLocale);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        java.lang.String languageTag = resolveDeviceLocale.toLanguageTag();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(languageTag, "");
                        rememberedValue2 = kotlin.text.StringsKt.replace$default(languageTag, '-', '_', false, 4, (java.lang.Object) null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    java.lang.String str2 = (java.lang.String) rememberedValue2;
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_account_creation_terms_link_esign_consent, startRestartGroup, 0);
                    java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_account_creation_terms_link_user_agreement, startRestartGroup, 0);
                    java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_account_creation_terms_link_privacy_statement, startRestartGroup, 0);
                    java.util.List listOf = kotlin.collections.CollectionsKt.listOf(com.paypal.pds.components.LegalConsentItem.Companion.implicit$default(com.paypal.pds.components.LegalConsentItem.INSTANCE, com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabelKt.rememberRichTextWithLinks(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_account_creation_terms_agreement, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{kotlin.TuplesKt.to(stringResource, com.paypal.oslo.feature.oneonboarding.inventory.views.accountcreationterms.ui.AccountCreationTermsUrls.INSTANCE.eSignConsent(str, str2)), kotlin.TuplesKt.to(stringResource2, com.paypal.oslo.feature.oneonboarding.inventory.views.accountcreationterms.ui.AccountCreationTermsUrls.INSTANCE.userAgreement(str, str2)), kotlin.TuplesKt.to(stringResource3, com.paypal.oslo.feature.oneonboarding.inventory.views.accountcreationterms.ui.AccountCreationTermsUrls.INSTANCE.privacyStatement(str, str2))}), new java.lang.Object[]{stringResource, stringResource2, stringResource3}, startRestartGroup, 0), (com.paypal.pds.core.AnalyticsScope) null, 2, (java.lang.Object) null));
                    androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 1, null);
                    boolean changed2 = startRestartGroup.changed(function14);
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.accountcreationterms.ui.AccountCreationTermsViewComponentContentKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function3
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.oneonboarding.inventory.views.accountcreationterms.ui.AccountCreationTermsViewComponentContentKt.$r8$lambda$vFaHKTYiX4JctOJL_fzJ35iWL_Q(kotlin.jvm.functions.Function1.this, ((java.lang.Integer) obj).intValue(), (java.lang.String) obj2, (java.lang.String) obj3);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function15 = function13;
                    com.paypal.pds.components.LegalConsentKt.LegalConsent(listOf, m1708paddingVpY3zN4$default, null, (kotlin.jvm.functions.Function3) rememberedValue3, null, startRestartGroup, com.paypal.pds.components.LegalConsentItem.$stable, 20);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function12 = function15;
                    modifier3 = modifier4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function16 = function12;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.accountcreationterms.ui.AccountCreationTermsViewComponentContentKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.oneonboarding.inventory.views.accountcreationterms.ui.AccountCreationTermsViewComponentContentKt.m16892$r8$lambda$kJUc9O9C3rqDvuD1BOXpjOUS2Q(str, intentId, modifier3, function16, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function12 = function1;
            if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function12 = function1;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DaORAoloQrg_yuALomBNHBFKdWo(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, final android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        java.lang.String str3 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "esign", false, 2, (java.lang.Object) null) ? com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalytics.ItemEsignConsent : kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "useragreement", false, 2, (java.lang.Object) null) ? "user_agreement" : kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkTags.Privacy, false, 2, (java.lang.Object) null) ? "privacy_statement" : null;
        if (str3 != null) {
            com.paypal.oslo.feature.oneonboarding.inventory.steps.personalinfo.analytics.PersonalInfoAnalyticsKt.trackPersonalInfoItemPressed$default(intentId, str3, null, 4, null);
        }
        if (function1 == null) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.accountcreationterms.ui.AccountCreationTermsViewComponentContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.accountcreationterms.ui.AccountCreationTermsViewComponentContentKt.m16891$r8$lambda$WMERuLUvrqNBuPfuj9YNqqM6dA(context, (java.lang.String) obj);
                }
            };
        }
        function1.invoke(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LrPw64OauexPQgZIDm9IVSDarO4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-519322449);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-519322449, updateChangedFlags, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.accountcreationterms.ui.AccountCreationTermsViewComponentContentPreview (AccountCreationTermsViewComponentContent.kt:130)");
            }
            m16893AccountCreationTermsViewComponentContentXR8wf50(com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl("US"), new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.BankingBundle(null, 1, null), null, null, startRestartGroup, 6, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.accountcreationterms.ui.AccountCreationTermsViewComponentContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.accountcreationterms.ui.AccountCreationTermsViewComponentContentKt.$r8$lambda$LrPw64OauexPQgZIDm9IVSDarO4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$WMERuLUvrqNBuPfuj9-YNqqM6dA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16891$r8$lambda$WMERuLUvrqNBuPfuj9YNqqM6dA(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.feature.oneonboarding.ui.util.UrlUtilsKt.launchUrlInBrowser(str, context);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kJUc9O9C3rqDvuD1BOXpj-OUS2Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16892$r8$lambda$kJUc9O9C3rqDvuD1BOXpjOUS2Q(java.lang.String str, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m16893AccountCreationTermsViewComponentContentXR8wf50(str, intentId, modifier, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vFaHKTYiX4JctOJL_fzJ35iWL_Q(kotlin.jvm.functions.Function1 function1, int i, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        function1.invoke(str2);
        return kotlin.Unit.INSTANCE;
    }
}
