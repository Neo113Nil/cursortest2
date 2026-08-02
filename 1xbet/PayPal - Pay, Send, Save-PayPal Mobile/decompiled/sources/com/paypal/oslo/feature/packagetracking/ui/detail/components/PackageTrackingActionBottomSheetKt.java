package com.paypal.oslo.feature.packagetracking.ui.detail.components;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"PackageTrackingActionBottomSheet", "", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "title", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "confirmButtonText", "cancelButtonText", "onConfirm", "Lkotlin/Function0;", "onDismiss", "onSecondary", "image", "Landroidx/compose/ui/graphics/painter/Painter;", com.paypal.oslo.feature.savings.ui.onboarding.SavingsTermsLinkTags.Privacy, "isLoading", "", "(Lcom/paypal/pds/components/BottomSheetController;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;III)V", "package-tracking_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PackageTrackingActionBottomSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PackageTrackingActionBottomSheet(final com.paypal.pds.components.BottomSheetController bottomSheetController, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.ui.graphics.painter.Painter painter, java.lang.String str5, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.graphics.painter.Painter painter2;
        final java.lang.String str6;
        final boolean z2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(229344119);
        if ((i & 6) == 0) {
            i4 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changed(str4) ? 16384 : 8192;
        }
        if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= startRestartGroup.changedInstance(function03) ? 8388608 : 4194304;
        }
        int i9 = i3 & 256;
        int i10 = 100663296;
        if (i9 == 0) {
            if ((i & 100663296) == 0) {
                i10 = (i & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) == 0 ? startRestartGroup.changed(painter) : startRestartGroup.changedInstance(painter) ? 67108864 : 33554432;
            }
            i5 = i3 & 512;
            if (i5 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i4 |= startRestartGroup.changed(str5) ? 536870912 : 268435456;
            }
            i6 = i3 & 1024;
            if (i6 == 0) {
                i8 = i2 | 6;
            } else {
                if ((i2 & 6) != 0) {
                    i7 = i2;
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i7 & 3) != 2, i4 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        painter2 = painter;
                        str6 = str5;
                        z2 = z;
                    } else {
                        androidx.compose.ui.graphics.painter.Painter painter3 = i9 != 0 ? null : painter;
                        java.lang.String str7 = i5 != 0 ? null : str5;
                        boolean z3 = i6 == 0 ? z : false;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(229344119, i4, i7, "com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingActionBottomSheet (PackageTrackingActionBottomSheet.kt:77)");
                        }
                        final androidx.compose.ui.graphics.painter.Painter painter4 = painter3;
                        int i11 = i4;
                        final java.lang.String str8 = str7;
                        final boolean z4 = z3;
                        composer2 = startRestartGroup;
                        com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function02, new com.paypal.pds.components.TopNavConfig(null, false, null, 7, null), null, null, null, function02, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-785174786, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingActionBottomSheetKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingActionBottomSheetKt.m17553$r8$lambda$tkrywoD5_7zstkPEwZWD9cQHZ0(androidx.compose.ui.graphics.painter.Painter.this, str, str2, str8, str3, str4, z4, function0, function03, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 805306368 | (i11 & 14) | ((i11 >> 15) & 112) | (com.paypal.pds.components.TopNavConfig.$stable << 6) | (i11 & 3670016), 440);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        painter2 = painter3;
                        z2 = z3;
                        str6 = str7;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingActionBottomSheetKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingActionBottomSheetKt.$r8$lambda$iZCsRpKVt8z_Hr3zQe92Y2vTCIM(com.paypal.pds.components.BottomSheetController.this, str, str2, str3, str4, function0, function02, function03, painter2, str6, z2, i, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i8 = i2 | (startRestartGroup.changed(z) ? 4 : 2);
            }
            i7 = i8;
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i7 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 |= i10;
        i5 = i3 & 512;
        if (i5 == 0) {
        }
        i6 = i3 & 1024;
        if (i6 == 0) {
        }
        i7 = i8;
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i7 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iZCsRpKVt8z_Hr3zQe92Y2vTCIM(com.paypal.pds.components.BottomSheetController bottomSheetController, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, androidx.compose.ui.graphics.painter.Painter painter, java.lang.String str5, boolean z, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        PackageTrackingActionBottomSheet(bottomSheetController, str, str2, str3, str4, function0, function02, function03, painter, str5, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$tkrywoD5_7zstkPEwZ-WD9cQHZ0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17553$r8$lambda$tkrywoD5_7zstkPEwZWD9cQHZ0(androidx.compose.ui.graphics.painter.Painter painter, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.Composer composer2;
        java.lang.Object obj;
        float f;
        int i2;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-785174786, i, -1, "com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingActionBottomSheet.<anonymous> (PackageTrackingActionBottomSheet.kt:84)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1706padding3ABfNKs);
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
            if (painter != null) {
                composer.startReplaceGroup(81636495);
                com.paypal.pds.components.ImageKt.Image(painter, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_content_description_image, composer, 0), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize64()), androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f), com.paypal.pds.core.Color.BorderMuted.INSTANCE, androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape(), composer, 432, 0), com.paypal.pds.core.ConstantsKt.getSpacing8()), null, null, null, null, composer, androidx.compose.ui.graphics.painter.Painter.$stable, 120);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(82141454);
                composer.endReplaceGroup();
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, composer, 384, 6, 1018);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, composer, 384, 6, 1018);
            if (str3 != null) {
                composer2 = composer;
                composer2.startReplaceGroup(82502201);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingActionBottomSheetKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            kotlin.Unit unit;
                            unit = kotlin.Unit.INSTANCE;
                            return unit;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue;
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.PackageTrackingActionBottomSheetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            kotlin.Unit unit;
                            unit = kotlin.Unit.INSTANCE;
                            return unit;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsPrivacyPolicyLabelKt.PackageSettingsPrivacyPolicyLabel(str3, function03, (kotlin.jvm.functions.Function0) rememberedValue2, composer2, 432);
                composer.endReplaceGroup();
            } else {
                composer2 = composer;
                composer2.startReplaceGroup(82737646);
                composer.endReplaceGroup();
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, 0);
            if (str4 == null) {
                composer2.startReplaceGroup(82836845);
                composer.endReplaceGroup();
                obj = null;
                f = 0.0f;
                i2 = 1;
            } else {
                composer2.startReplaceGroup(82836846);
                obj = null;
                f = 0.0f;
                i2 = 1;
                com.paypal.pds.components.ButtonKt.Button(function0, str4, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.packagetracking.ui.PTUiConstants.BUTTON_TAG_CONFIRM), null, null, null, null, !z, z, composer, 384, 120);
                composer.endReplaceGroup();
            }
            if (str5 == null) {
                composer2.startReplaceGroup(83217091);
                composer.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(83217092);
                com.paypal.pds.components.ButtonKt.Button(function02, str5, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f, i2, obj), com.paypal.oslo.feature.packagetracking.ui.PTUiConstants.BUTTON_TAG_SECONDARY), null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, null, !z, false, composer, 196992, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_HKD);
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
}
