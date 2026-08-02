package com.paypal.oslo.feature.onboarding.signup.email.ui.field;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"SignupEmailField", "", "config", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupTextInputFieldConfig;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "stateMap", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentStateMap;", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/SignupTextInputFieldConfig;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/onboarding/signup/ui/model/ComponentStateMap;Landroidx/compose/runtime/Composer;II)V", "onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupEmailFieldKt {
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SignupEmailField(final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig signupTextInputFieldConfig, final java.lang.String str, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap3;
        int i4;
        androidx.compose.ui.Modifier modifier4;
        java.lang.String label;
        java.lang.String m16200variantCBRiV3w;
        java.util.List<arrow.core.Either<com.paypal.oslo.feature.onboarding.validators.domain.ValidationError, com.paypal.oslo.feature.onboarding.validators.domain.ValidationSuccess>> validationResults;
        boolean changed;
        java.lang.Object rememberedValue;
        java.util.List<java.lang.String> suggestions;
        boolean z;
        java.lang.Object rememberedValue2;
        java.util.Iterator<T> it;
        java.lang.Object obj;
        java.lang.String str2;
        final java.lang.String str3;
        int i5;
        androidx.compose.runtime.Composer composer3;
        androidx.compose.ui.text.TextLayoutResult m8016measurewNUYSr0;
        int i6;
        androidx.compose.runtime.Composer composer4;
        int i7;
        com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap4 = componentStateMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupTextInputFieldConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1026242746);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(signupTextInputFieldConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    if ((32768 & i) == 0 ? startRestartGroup.changed(componentStateMap4) : startRestartGroup.changedInstance(componentStateMap4)) {
                        i7 = 16384;
                        i3 |= i7;
                    }
                }
                i7 = 8192;
                i3 |= i7;
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        componentStateMap3 = componentStateMap4;
                        i4 = i3 & (-57345);
                        modifier4 = modifier2;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1026242746, i4, -1, "com.paypal.oslo.feature.onboarding.signup.email.ui.field.SignupEmailField (SignupEmailField.kt:64)");
                        }
                        android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                        label = signupTextInputFieldConfig.getLabel();
                        if (label != null) {
                            startRestartGroup.startReplaceGroup(-1220077060);
                            startRestartGroup.endReplaceGroup();
                            m16200variantCBRiV3w = null;
                        } else {
                            startRestartGroup.startReplaceGroup(-1220077059);
                            m16200variantCBRiV3w = com.paypal.oslo.feature.onboarding.shared.variants.ui.ComposeVariantsKt.m16200variantCBRiV3w(com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantKey.m16193constructorimpl(label), new java.lang.Object[0], startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        }
                        java.lang.String str4 = m16200variantCBRiV3w != null ? "" : m16200variantCBRiV3w;
                        com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Email email = (com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Email) com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiStateKt.getTypedInternal(componentStateMap3, com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType.EMAIL, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Email.class);
                        validationResults = email == null ? email.getValidationResults() : null;
                        if (validationResults == null) {
                            validationResults = kotlin.collections.CollectionsKt.emptyList();
                        }
                        changed = startRestartGroup.changed(validationResults);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = com.paypal.oslo.feature.onboarding.signup.ui.validation.ValidationUtilsKt.buildValidationAlerts(context, validationResults);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        java.util.List list = (java.util.List) rememberedValue;
                        suggestions = signupTextInputFieldConfig.getSuggestions();
                        if (suggestions == null) {
                            suggestions = kotlin.collections.CollectionsKt.emptyList();
                        }
                        int i9 = i4 & 112;
                        z = i9 != 32;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "@", false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.endsWith$default(str, "@", false, 2, (java.lang.Object) null)) {
                                java.lang.String substringAfter$default = kotlin.text.StringsKt.substringAfter$default(str, "@", (java.lang.String) null, 2, (java.lang.Object) null);
                                it = suggestions.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj = it.next();
                                        if (kotlin.text.StringsKt.startsWith$default((java.lang.String) obj, substringAfter$default, false, 2, (java.lang.Object) null)) {
                                            break;
                                        }
                                    } else {
                                        obj = null;
                                        break;
                                    }
                                }
                                str2 = (java.lang.String) obj;
                                if (str2 != null) {
                                    java.lang.Object substring = str2.substring(substringAfter$default.length());
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                                    rememberedValue2 = substring;
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                            }
                            rememberedValue2 = null;
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        str3 = (java.lang.String) rememberedValue2;
                        androidx.compose.ui.text.TextMeasurer rememberTextMeasurer = androidx.compose.ui.text.TextMeasurerHelperKt.rememberTextMeasurer(0, startRestartGroup, 0, 1);
                        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        int i10 = i4 >> 3;
                        int i11 = i4;
                        com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap5 = componentStateMap3;
                        boolean z2 = true;
                        androidx.compose.ui.Modifier modifier5 = modifier4;
                        com.paypal.pds.components.TextInputKt.TextInput(str, function1, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.onboarding.api.testtags.PreOnboardingTestTags.EmailEntry.EMAIL_INPUT), str4, (java.lang.String) null, (java.lang.String) null, false, false, new androidx.compose.foundation.text.KeyboardOptions(0, (java.lang.Boolean) null, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8267getEmailPjHm6EE(), 0, (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null), (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, true, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) list, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, (i10 & 112) | (i10 & 14) | 100663680, 48, 112368);
                        if (str3 != null) {
                            startRestartGroup.startReplaceGroup(878187553);
                            startRestartGroup.endReplaceGroup();
                            composer4 = startRestartGroup;
                        } else {
                            startRestartGroup.startReplaceGroup(878187554);
                            androidx.compose.ui.text.TextStyle textStyle = new androidx.compose.ui.text.TextStyle(0L, com.paypal.oslo.feature.onboarding.shared.ui.constants.TypographyConstants.INSTANCE.m16136getBODY_LARGE_FONT_SIZEXSAIIZE(), androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal(), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, com.paypal.oslo.feature.onboarding.shared.ui.constants.TypographyConstants.INSTANCE.m16137getBODY_LARGE_LETTER_SPACINGXSAIIZE(), (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 0, 0, 0L, (androidx.compose.ui.text.style.TextIndent) null, (androidx.compose.ui.text.PlatformTextStyle) null, (androidx.compose.ui.text.style.LineHeightStyle) null, 0, 0, (androidx.compose.ui.text.style.TextMotion) null, 16777081, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                            boolean z3 = i9 == 32;
                            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (z3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                i5 = i9;
                                composer3 = startRestartGroup;
                                m8016measurewNUYSr0 = rememberTextMeasurer.m8016measurewNUYSr0(str, (r24 & 2) != 0 ? androidx.compose.ui.text.TextStyle.INSTANCE.getDefault() : textStyle, (r24 & 4) != 0 ? androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8500getClipgIe3tQ8() : 0, (r24 & 8) != 0, (r24 & 16) != 0 ? Integer.MAX_VALUE : 0, (r24 & 32) != 0 ? androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : 0L, (r24 & 64) != 0 ? rememberTextMeasurer.Camera2StreamConfigurationMap : null, (r24 & 128) != 0 ? rememberTextMeasurer.getHighSpeedVideoFpsRanges : null, (r24 & 256) != 0 ? rememberTextMeasurer.getHighSpeedVideoSizes : null, (r24 & 512) != 0 ? false : false);
                                i6 = 32;
                                rememberedValue3 = androidx.compose.ui.unit.Dp.m8599boximpl(density.mo1415toDpu2uoSUM((int) (m8016measurewNUYSr0.getSize() >> 32)));
                                composer3.updateRememberedValue(rememberedValue3);
                            } else {
                                i6 = 32;
                                i5 = i9;
                                composer3 = startRestartGroup;
                            }
                            float m8615unboximpl = ((androidx.compose.ui.unit.Dp) rememberedValue3).m8615unboximpl();
                            com.paypal.pds.core.Color.ContentMuted contentMuted = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                            com.paypal.pds.core.Typography.BodyMedium bodyMedium = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
                            androidx.compose.ui.Modifier m1678offsetVpY3zN4 = androidx.compose.foundation.layout.OffsetKt.m1678offsetVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(com.paypal.pds.core.ConstantsKt.getSize20() + m8615unboximpl), androidx.compose.ui.unit.Dp.m8601constructorimpl(com.paypal.pds.core.ConstantsKt.getSpacing32() + com.paypal.pds.core.ConstantsKt.getSize2()));
                            boolean z4 = (i11 & 896) == 256;
                            if (i5 != i6) {
                                z2 = false;
                            }
                            boolean changed2 = composer3.changed(str3);
                            java.lang.Object rememberedValue4 = composer3.rememberedValue();
                            if ((changed2 || (z4 | z2)) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                composer4 = composer3;
                                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.signup.email.ui.field.SignupEmailFieldKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.onboarding.signup.email.ui.field.SignupEmailFieldKt.$r8$lambda$SPu1N5xCdeWM4gX07SI5FLs4dm0(kotlin.jvm.functions.Function1.this, str, str3);
                                    }
                                };
                                composer4.updateRememberedValue(rememberedValue4);
                            } else {
                                composer4 = composer3;
                            }
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str3, com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(m1678offsetVpY3zN4, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue4, composer4, 0, 31), contentMuted, null, null, null, false, 0, 0, null, bodyMedium, composer4, 384, 6, 1016);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            composer4.endReplaceGroup();
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        }
                        composer4.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        composer2 = composer4;
                        componentStateMap2 = componentStateMap5;
                        modifier3 = modifier5;
                    } else {
                        companion = modifier2;
                    }
                } else {
                    companion = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) != 0) {
                        componentStateMap4 = com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiStateKt.emptyComponentStateMap();
                        i3 &= -57345;
                    }
                }
                componentStateMap3 = componentStateMap4;
                i4 = i3;
                modifier4 = companion;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                android.content.Context context2 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                label = signupTextInputFieldConfig.getLabel();
                if (label != null) {
                }
                if (m16200variantCBRiV3w != null) {
                }
                com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Email email2 = (com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Email) com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiStateKt.getTypedInternal(componentStateMap3, com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType.EMAIL, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentUiState.Email.class);
                if (email2 == null) {
                }
                if (validationResults == null) {
                }
                changed = startRestartGroup.changed(validationResults);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = com.paypal.oslo.feature.onboarding.signup.ui.validation.ValidationUtilsKt.buildValidationAlerts(context2, validationResults);
                startRestartGroup.updateRememberedValue(rememberedValue);
                java.util.List list2 = (java.util.List) rememberedValue;
                suggestions = signupTextInputFieldConfig.getSuggestions();
                if (suggestions == null) {
                }
                int i92 = i4 & 112;
                if (i92 != 32) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z) {
                }
                if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "@", false, 2, (java.lang.Object) null)) {
                    java.lang.String substringAfter$default2 = kotlin.text.StringsKt.substringAfter$default(str, "@", (java.lang.String) null, 2, (java.lang.Object) null);
                    it = suggestions.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                        }
                    }
                    str2 = (java.lang.String) obj;
                    if (str2 != null) {
                    }
                }
                rememberedValue2 = null;
                startRestartGroup.updateRememberedValue(rememberedValue2);
                str3 = (java.lang.String) rememberedValue2;
                androidx.compose.ui.text.TextMeasurer rememberTextMeasurer2 = androidx.compose.ui.text.TextMeasurerHelperKt.rememberTextMeasurer(0, startRestartGroup, 0, 1);
                androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                int i102 = i4 >> 3;
                int i112 = i4;
                com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap52 = componentStateMap3;
                boolean z22 = true;
                androidx.compose.ui.Modifier modifier52 = modifier4;
                com.paypal.pds.components.TextInputKt.TextInput(str, function1, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.onboarding.api.testtags.PreOnboardingTestTags.EmailEntry.EMAIL_INPUT), str4, (java.lang.String) null, (java.lang.String) null, false, false, new androidx.compose.foundation.text.KeyboardOptions(0, (java.lang.Boolean) null, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8267getEmailPjHm6EE(), 0, (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null), (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, true, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) list2, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, (i102 & 112) | (i102 & 14) | 100663680, 48, 112368);
                if (str3 != null) {
                }
                composer4.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                composer2 = composer4;
                componentStateMap2 = componentStateMap52;
                modifier3 = modifier52;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                componentStateMap2 = componentStateMap4;
                modifier3 = modifier2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.email.ui.field.SignupEmailFieldKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.onboarding.signup.email.ui.field.SignupEmailFieldKt.$r8$lambda$UGLCpeH6bYXSEIWyE6cYLv6CegU(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig.this, str, function1, modifier3, componentStateMap2, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 24576) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SPu1N5xCdeWM4gX07SI5FLs4dm0(kotlin.jvm.functions.Function1 function1, java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(str2);
        function1.invoke(sb.toString());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UGLCpeH6bYXSEIWyE6cYLv6CegU(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.SignupTextInputFieldConfig signupTextInputFieldConfig, java.lang.String str, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.onboarding.signup.ui.model.ComponentStateMap componentStateMap, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SignupEmailField(signupTextInputFieldConfig, str, function1, modifier, componentStateMap, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
