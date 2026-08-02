package com.paypal.oslo.feature.qrc.ui.review.preview;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentReviewScreenPreviewsKt {
    /* renamed from: $r8$lambda$-_jWPy29corI5Z5cgJIHJOkFjbo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17889$r8$lambda$_jWPy29corI5Z5cgJIHJOkFjbo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1113394275);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1113394275, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewContentConversionSheetPayPalPreview (PaymentReviewScreenPreviews.kt:114)");
            }
            com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content content = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content(com.paypal.oslo.feature.qrc.ui.review.preview.PreviewData.INSTANCE.getPAYMENT_REVIEW_CONVERSION_SHEET_PAYPAL());
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt.$r8$lambda$0cdZN_OHG0FwNztExlX_cXSnea0((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.PaymentReviewContent(content, (kotlin.jvm.functions.Function1) rememberedValue, com.paypal.oslo.feature.qrc.ui.review.components.PreviewCommonComponents.INSTANCE, null, startRestartGroup, 432, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt.m17889$r8$lambda$_jWPy29corI5Z5cgJIHJOkFjbo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0cdZN_OHG0FwNztExlX_cXSnea0(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent paymentReviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReviewEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$0gKOHMr5Izpqwy2qkMNgfJ-f5-I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17890$r8$lambda$0gKOHMr5Izpqwy2qkMNgfJf5I(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-80562925);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-80562925, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewContentWithoutBalancePreview (PaymentReviewScreenPreviews.kt:44)");
            }
            com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content content = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content(com.paypal.oslo.feature.qrc.ui.review.preview.PreviewData.INSTANCE.getPAYMENT_REVIEW_ONLY_FI());
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt.$r8$lambda$aoqnO1yxGLC8to1BXki0jlEpNcg((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.PaymentReviewContent(content, (kotlin.jvm.functions.Function1) rememberedValue, com.paypal.oslo.feature.qrc.ui.review.components.PreviewCommonComponents.INSTANCE, null, startRestartGroup, 432, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt.m17890$r8$lambda$0gKOHMr5Izpqwy2qkMNgfJf5I(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2dTet5r6EVwetpbkrWypZ4OHQx4(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent paymentReviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReviewEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3Pwlf3z7QaqS6gHXfYrw5EWd4nU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1059704719);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1059704719, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewContentConversionSheetIssuerBalanceDisabledPreview (PaymentReviewScreenPreviews.kt:128)");
            }
            com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content content = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content(com.paypal.oslo.feature.qrc.ui.review.preview.PreviewData.INSTANCE.getPAYMENT_REVIEW_CONVERSION_SHEET_ISSUER_BALANCE_DISABLED());
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt.$r8$lambda$2dTet5r6EVwetpbkrWypZ4OHQx4((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.PaymentReviewContent(content, (kotlin.jvm.functions.Function1) rememberedValue, com.paypal.oslo.feature.qrc.ui.review.components.PreviewCommonComponents.INSTANCE, null, startRestartGroup, 432, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt.$r8$lambda$3Pwlf3z7QaqS6gHXfYrw5EWd4nU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4d1hMSG9OkXvpoyfFGfk9K9FjE8(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent paymentReviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReviewEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8Pr4A_O4ZEKArk51uvQIYvPGz5M(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent paymentReviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReviewEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9-vA4LiPvcq86bDNBLB_OArrBGw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17891$r8$lambda$9vA4LiPvcq86bDNBLB_OArrBGw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1272524270);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1272524270, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.review.preview.LowBalanceBottomSheetPreview (PaymentReviewScreenPreviews.kt:156)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt.$r8$lambda$yzRNl84g5RdKEIuvKHwjoXyYpso((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewBottomSheetsKt.LowBalanceBottomSheet(true, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 54);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt.m17891$r8$lambda$9vA4LiPvcq86bDNBLB_OArrBGw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AcqKEHVrCCsGbZ3eX_pKWW1dj0Y(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent paymentReviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReviewEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OgCWBX0Izya98xMDSgvJBujGXI0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1375600755);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1375600755, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.review.preview.LoadingStatePreview (PaymentReviewScreenPreviews.kt:142)");
            }
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
            com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewLoadingStateKt.LoadingState(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, startRestartGroup, 6);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt.$r8$lambda$OgCWBX0Izya98xMDSgvJBujGXI0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QezInKRS2cboDk3mM0gONaEBwUQ(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent paymentReviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReviewEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Yepu5b-lN0UPQ26fupy_xE8jdVg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17892$r8$lambda$Yepu5blN0UPQ26fupy_xE8jdVg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1379249562);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1379249562, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewContentPayPalWorldPreview (PaymentReviewScreenPreviews.kt:58)");
            }
            com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content content = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content(com.paypal.oslo.feature.qrc.ui.review.preview.PreviewData.INSTANCE.getPAYMENT_REVIEW_PPW());
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt.$r8$lambda$AcqKEHVrCCsGbZ3eX_pKWW1dj0Y((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.PaymentReviewContent(content, (kotlin.jvm.functions.Function1) rememberedValue, com.paypal.oslo.feature.qrc.ui.review.components.PreviewCommonComponents.INSTANCE, null, startRestartGroup, 432, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt.m17892$r8$lambda$Yepu5blN0UPQ26fupy_xE8jdVg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZbGh7ZkG39U8g7FQb6MveGlqWkE(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-635076450);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-635076450, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewContentConversionPayPalPreview (PaymentReviewScreenPreviews.kt:72)");
            }
            com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content content = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content(com.paypal.oslo.feature.qrc.ui.review.preview.PreviewData.INSTANCE.getPAYMENT_REVIEW_CONVERSION_PAYPAL());
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt.$r8$lambda$8Pr4A_O4ZEKArk51uvQIYvPGz5M((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.PaymentReviewContent(content, (kotlin.jvm.functions.Function1) rememberedValue, com.paypal.oslo.feature.qrc.ui.review.components.PreviewCommonComponents.INSTANCE, null, startRestartGroup, 432, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt.$r8$lambda$ZbGh7ZkG39U8g7FQb6MveGlqWkE(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_VR8jH4Zbrcekc0usUOBlSVLKwQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1016796424);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1016796424, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewContentConversionIssuerPreview (PaymentReviewScreenPreviews.kt:86)");
            }
            com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content content = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content(com.paypal.oslo.feature.qrc.ui.review.preview.PreviewData.INSTANCE.getPAYMENT_REVIEW_CONVERSION_ISSUER());
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt.$r8$lambda$uVs55WD31x8gLXOPIiu4AntIWCo((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.PaymentReviewContent(content, (kotlin.jvm.functions.Function1) rememberedValue, com.paypal.oslo.feature.qrc.ui.review.components.PreviewCommonComponents.INSTANCE, null, startRestartGroup, 432, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt.$r8$lambda$_VR8jH4Zbrcekc0usUOBlSVLKwQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$aXCP0i_0bXTViB-dC-C9UPEN9vQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17893$r8$lambda$aXCP0i_0bXTViBdCC9UPEN9vQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1731338983);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1731338983, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewContentPreview (PaymentReviewScreenPreviews.kt:30)");
            }
            com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content content = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content(com.paypal.oslo.feature.qrc.ui.review.preview.PreviewData.INSTANCE.getPAYMENT_REVIEW_PP_BALANCE());
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt.$r8$lambda$QezInKRS2cboDk3mM0gONaEBwUQ((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.PaymentReviewContent(content, (kotlin.jvm.functions.Function1) rememberedValue, com.paypal.oslo.feature.qrc.ui.review.components.PreviewCommonComponents.INSTANCE, null, startRestartGroup, 432, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt.m17893$r8$lambda$aXCP0i_0bXTViBdCC9UPEN9vQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aoqnO1yxGLC8to1BXki0jlEpNcg(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent paymentReviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReviewEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bF4vwGrnTtfBzr2N-nGjF7Em88Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17894$r8$lambda$bF4vwGrnTtfBzr2NnGjF7Em88Y(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2056550638);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2056550638, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.review.preview.NoFIBottomSheetPreview (PaymentReviewScreenPreviews.kt:164)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt.$r8$lambda$4d1hMSG9OkXvpoyfFGfk9K9FjE8((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.qrc.ui.review.components.PaymentReviewBottomSheetsKt.NoFIBottomSheet(true, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 54);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt.m17894$r8$lambda$bF4vwGrnTtfBzr2NnGjF7Em88Y(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$duIY1fPkC-KekJ_By-1CngPOFe8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17895$r8$lambda$duIY1fPkCKekJ_By1CngPOFe8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(148496720);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(148496720, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewContentConversionIssuerBalanceDisabledPreview (PaymentReviewScreenPreviews.kt:100)");
            }
            com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content content = new com.paypal.oslo.feature.qrc.ui.review.PaymentReviewUiState.Content(com.paypal.oslo.feature.qrc.ui.review.preview.PreviewData.INSTANCE.getPAYMENT_REVIEW_CONVERSION_ISSUER_BALANCE_DISABLED());
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt.$r8$lambda$sM9FpmNZnuqL8GsQHCscV99BBJA((com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.qrc.ui.review.PaymentReviewScreenKt.PaymentReviewContent(content, (kotlin.jvm.functions.Function1) rememberedValue, com.paypal.oslo.feature.qrc.ui.review.components.PreviewCommonComponents.INSTANCE, null, startRestartGroup, 432, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.review.preview.PaymentReviewScreenPreviewsKt.m17895$r8$lambda$duIY1fPkCKekJ_By1CngPOFe8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sM9FpmNZnuqL8GsQHCscV99BBJA(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent paymentReviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReviewEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uVs55WD31x8gLXOPIiu4AntIWCo(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent paymentReviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReviewEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yzRNl84g5RdKEIuvKHwjoXyYpso(com.paypal.oslo.feature.qrc.ui.review.PaymentReviewEvent paymentReviewEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentReviewEvent, "");
        return kotlin.Unit.INSTANCE;
    }
}
