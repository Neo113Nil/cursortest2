package com.paypal.oslo.feature.consumerprivacy.ui.compose;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u007f\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015H\u0001¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0019\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"TagPrivacyStatement", "", "TagPrivacyNotice", "TagDescriptionUsSpecial", "TagDescriptionPartialConsent", "TagDescriptionDefault", "PersonalizedShoppingContent", "", "variant", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedShoppingVariant;", "modifier", "Landroidx/compose/ui/Modifier;", "isShoppingPersonalizationEnabled", "", "isToggleEnabled", "consentType", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/ConsentType;", "dataUsageDate", "onToggleChange", "Lkotlin/Function1;", "onPrivacyStatementClick", "Lkotlin/Function0;", "onPrivacyNoticeClick", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/state/PersonalizedShoppingVariant;Landroidx/compose/ui/Modifier;ZZLcom/paypal/oslo/feature/consumerprivacy/domain/model/ConsentType;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PersonalizedShoppingContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "PersonalizedShoppingContentPartialConsentPreview", "consumer-privacy_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PersonalizedShoppingContentKt {
    /* JADX WARN: Removed duplicated region for block: B:108:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PersonalizedShoppingContent(final com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant personalizedShoppingVariant, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType consentType, java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        androidx.compose.ui.Modifier modifier2;
        final com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType consentType2;
        final java.lang.String str2;
        final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function12;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        final boolean z5;
        final boolean z6;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function13;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personalizedShoppingVariant, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(583773271);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(personalizedShoppingVariant.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z4 = z2;
                    i3 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changed(consentType == null ? -1 : consentType.ordinal()) ? 16384 : 8192;
                    }
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changed(str) ? 131072 : 65536;
                    }
                    i8 = i2 & 64;
                    if (i8 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                    }
                    i9 = i2 & 128;
                    if (i9 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
                    }
                    i10 = i2 & 256;
                    if (i10 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changedInstance(function02) ? 67108864 : 33554432;
                    }
                    if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        consentType2 = consentType;
                        str2 = str;
                        function12 = function1;
                        function03 = function0;
                        z5 = z3;
                        z6 = z4;
                        function04 = function02;
                    } else {
                        androidx.compose.ui.Modifier.Companion companion = i11 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                        if (i4 != 0) {
                            z3 = false;
                        }
                        boolean z7 = i5 != 0 ? true : z4;
                        com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType consentType3 = i6 != 0 ? com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType.DENY : consentType;
                        java.lang.String str3 = i7 != 0 ? null : str;
                        if (i8 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContentKt$$ExternalSyntheticLambda9
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        kotlin.Unit unit;
                                        ((java.lang.Boolean) obj).booleanValue();
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function13 = (kotlin.jvm.functions.Function1) rememberedValue;
                        } else {
                            function13 = function1;
                        }
                        if (i9 != 0) {
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContentKt$$ExternalSyntheticLambda10
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            function05 = (kotlin.jvm.functions.Function0) rememberedValue2;
                        } else {
                            function05 = function0;
                        }
                        if (i10 != 0) {
                            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContentKt$$ExternalSyntheticLambda11
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            function06 = (kotlin.jvm.functions.Function0) rememberedValue3;
                        } else {
                            function06 = function02;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(583773271, i3, -1, "com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContent (PersonalizedShoppingContent.kt:56)");
                        }
                        androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing24()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "personalized_shopping_lazy_column");
                        boolean z8 = (i3 & 896) == 256;
                        boolean z9 = (3670016 & i3) == 1048576;
                        boolean z10 = (i3 & 7168) == 2048;
                        boolean z11 = (i3 & 14) == 4;
                        modifier2 = companion;
                        boolean z12 = (29360128 & i3) == 8388608;
                        boolean z13 = (234881024 & i3) == 67108864;
                        boolean z14 = (57344 & i3) == 16384;
                        boolean z15 = (i3 & 458752) == 131072;
                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if ((z12 | z8 | z9 | z10 | z11 | z13 | z14 | z15) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            final boolean z16 = z3;
                            final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function14 = function13;
                            final boolean z17 = z7;
                            final kotlin.jvm.functions.Function0<kotlin.Unit> function07 = function05;
                            final kotlin.jvm.functions.Function0<kotlin.Unit> function08 = function06;
                            final com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType consentType4 = consentType3;
                            final java.lang.String str4 = str3;
                            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContentKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContentKt.$r8$lambda$WhSa0Hd30N58Za4s9xgnURWmIDU(z16, function14, z17, personalizedShoppingVariant, function07, function08, consentType4, str4, (androidx.compose.foundation.lazy.LazyListScope) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(testTag, null, null, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue4, startRestartGroup, 6, 510);
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        function03 = function05;
                        z6 = z7;
                        consentType2 = consentType3;
                        z5 = z3;
                        str2 = str3;
                        function12 = function13;
                        function04 = function06;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier3 = modifier2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContentKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContentKt.$r8$lambda$asYOOgsORl1nFWtl8SzBwogaDtM(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant.this, modifier3, z5, z6, consentType2, str2, function12, function03, function04, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                z4 = z2;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                i9 = i2 & 128;
                if (i9 == 0) {
                }
                i10 = i2 & 256;
                if (i10 == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z4 = z2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            i9 = i2 & 128;
            if (i9 == 0) {
            }
            i10 = i2 & 256;
            if (i10 == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z4 = z2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        i9 = i2 & 128;
        if (i9 == 0) {
        }
        i10 = i2 & 256;
        if (i10 == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$3QIVUHUU0MHiXi7kjce-pNFgyIk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13543$r8$lambda$3QIVUHUU0MHiXi7kjcepNFgyIk(kotlin.jvm.functions.Function0 function0, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "privacy_statement")) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$FOE3j_tQ-qRbD_HF9beHMO8hztU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13544$r8$lambda$FOE3j_tQqRbD_HF9beHMO8hztU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1812548083);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1812548083, updateChangedFlags, -1, "com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContentPreview (PersonalizedShoppingContent.kt:178)");
            }
            PersonalizedShoppingContent(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant.DEFAULT, null, false, false, null, null, null, null, null, startRestartGroup, 6, 510);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContentKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContentKt.m13544$r8$lambda$FOE3j_tQqRbD_HF9beHMO8hztU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ISFtHXNQbpZA68JYuMbTBMGZ8h4(final boolean z, final kotlin.jvm.functions.Function1 function1, final boolean z2, final com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant personalizedShoppingVariant, final kotlin.jvm.functions.Function0 function0, final kotlin.jvm.functions.Function0 function02, final com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType consentType, final java.lang.String str, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1925690334, i, -1, "com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PersonalizedShoppingContent.kt:69)");
            }
            com.paypal.pds.components.CardKt.Card(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "personalized_shopping_card"), null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-524528760, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContentKt.m13547$r8$lambda$aMCUnFkC8qh2H3fEEF5p7iYXlI(z, function1, z2, personalizedShoppingVariant, function0, function02, consentType, str, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 805306374 | (com.paypal.pds.components.CardStyle.Outlined.$stable << 9), 502);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JsfVqFGLTaZsh4lhsjEp0gJX9Pc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2006225108);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2006225108, updateChangedFlags, -1, "com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContentPartialConsentPreview (PersonalizedShoppingContent.kt:184)");
            }
            PersonalizedShoppingContent(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant.DEFAULT, null, false, false, com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType.PARTIAL, "November 27, 2024", null, null, null, startRestartGroup, 221190, 462);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContentKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContentKt.$r8$lambda$JsfVqFGLTaZsh4lhsjEp0gJX9Pc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$RfRFq7Yuufy4bfOiJk-7NpxLEzM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13545$r8$lambda$RfRFq7Yuufy4bfOiJk7NpxLEzM(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "privacy_statement")) {
            function0.invoke();
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "privacy_notice")) {
            function02.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$UzmA4f5rfGrXKAcvNm8Ng-RUpHI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13546$r8$lambda$UzmA4f5rfGrXKAcvNm8NgRUpHI(kotlin.jvm.functions.Function0 function0, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "privacy_statement")) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WhSa0Hd30N58Za4s9xgnURWmIDU(final boolean z, final kotlin.jvm.functions.Function1 function1, final boolean z2, final com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant personalizedShoppingVariant, final kotlin.jvm.functions.Function0 function0, final kotlin.jvm.functions.Function0 function02, final com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType consentType, final java.lang.String str, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1925690334, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContentKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContentKt.$r8$lambda$ISFtHXNQbpZA68JYuMbTBMGZ8h4(z, function1, z2, personalizedShoppingVariant, function0, function02, consentType, str, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$aMCUnFkC8qh2H3f-EEF5p7iYXlI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13547$r8$lambda$aMCUnFkC8qh2H3fEEF5p7iYXlI(boolean z, kotlin.jvm.functions.Function1 function1, boolean z2, com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant personalizedShoppingVariant, final kotlin.jvm.functions.Function0 function0, final kotlin.jvm.functions.Function0 function02, com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType consentType, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String str2;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-524528760, i, -1, "com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PersonalizedShoppingContent.kt:75)");
            }
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1708paddingVpY3zN4$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.oslo.feature.consumerprivacy.ui.components.ToggleDescriptionCardSectionKt.ToggleDescriptionCardSection(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_personalized_shopping_recommendations_toggle_title, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_personalized_shopping_recommendations_toggle_description, composer, 0), z, function1, null, z2, false, composer, 0, 80);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer, 0);
            if (personalizedShoppingVariant == com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant.US_SPECIAL) {
                composer.startReplaceGroup(-1934933102);
                com.paypal.pds.core.RichText richText = com.paypal.pds.core.RichTextKt.toRichText(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_personalized_shopping_toggle_privacy_statement_ca_nd_vt_states_description, composer, 0), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{kotlin.TuplesKt.to(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_personalized_privacy_statement_text, composer, 0), "privacy_statement"), kotlin.TuplesKt.to(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_personalized_shopping_ca_nd_vt_text, composer, 0), "privacy_notice")}));
                com.paypal.pds.core.Typography.BodyMedium bodyMedium = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
                com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "description_us_special");
                com.paypal.pds.core.Color.ContentBase contentBase2 = contentBase;
                boolean changed = composer.changed(function0);
                boolean changed2 = composer.changed(function02);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContentKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContentKt.m13545$r8$lambda$RfRFq7Yuufy4bfOiJk7NpxLEzM(kotlin.jvm.functions.Function0.this, function02, (java.lang.String) obj, (java.lang.String) obj2);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(richText, testTag, contentBase2, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue, bodyMedium, null, composer, 432, 48, 5112);
                composer.endReplaceGroup();
            } else if (consentType != com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType.PARTIAL || (str2 = str) == null || kotlin.text.StringsKt.isBlank(str2)) {
                composer.startReplaceGroup(-1931709133);
                com.paypal.pds.core.RichText richText2 = com.paypal.pds.core.RichTextKt.toRichText(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_personalized_shopping_toggle_privacy_statement_rest_us_states_description, composer, 0), kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_personalized_privacy_statement_text, composer, 0), "privacy_statement")));
                com.paypal.pds.core.Typography.BodyMedium bodyMedium2 = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
                com.paypal.pds.core.Color.ContentBase contentBase3 = com.paypal.pds.core.Color.ContentBase.INSTANCE;
                androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "description_default");
                com.paypal.pds.core.Color.ContentBase contentBase4 = contentBase3;
                boolean changed3 = composer.changed(function0);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (changed3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContentKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContentKt.m13543$r8$lambda$3QIVUHUU0MHiXi7kjcepNFgyIk(kotlin.jvm.functions.Function0.this, (java.lang.String) obj, (java.lang.String) obj2);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(richText2, testTag2, contentBase4, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue2, bodyMedium2, null, composer, 432, 48, 5112);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1933151532);
                com.paypal.pds.core.RichText richText3 = com.paypal.pds.core.RichTextKt.toRichText(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_personalized_shopping_toggle_privacy_statement_partial_consent_description, new java.lang.Object[]{str}, composer, 0), kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_personalized_privacy_statement_text, composer, 0), "privacy_statement")));
                com.paypal.pds.core.Typography.BodyMedium bodyMedium3 = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
                com.paypal.pds.core.Color.ContentBase contentBase5 = com.paypal.pds.core.Color.ContentBase.INSTANCE;
                androidx.compose.ui.Modifier testTag3 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "description_partial_consent");
                com.paypal.pds.core.Color.ContentBase contentBase6 = contentBase5;
                boolean changed4 = composer.changed(function0);
                java.lang.Object rememberedValue3 = composer.rememberedValue();
                if (changed4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContentKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.consumerprivacy.ui.compose.PersonalizedShoppingContentKt.m13546$r8$lambda$UzmA4f5rfGrXKAcvNm8NgRUpHI(kotlin.jvm.functions.Function0.this, (java.lang.String) obj, (java.lang.String) obj2);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(richText3, testTag3, contentBase6, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue3, bodyMedium3, null, composer, 432, 48, 5112);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$asYOOgsORl1nFWtl8SzBwogaDtM(com.paypal.oslo.feature.consumerprivacy.ui.state.PersonalizedShoppingVariant personalizedShoppingVariant, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, com.paypal.oslo.feature.consumerprivacy.domain.model.ConsentType consentType, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PersonalizedShoppingContent(personalizedShoppingVariant, modifier, z, z2, consentType, str, function1, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
