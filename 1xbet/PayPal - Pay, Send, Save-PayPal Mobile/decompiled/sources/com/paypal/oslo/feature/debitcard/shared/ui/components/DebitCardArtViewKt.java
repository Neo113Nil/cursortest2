package com.paypal.oslo.feature.debitcard.shared.ui.components;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a7\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0001¢\u0006\u0002\u0010\f\u001a5\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u000e\u001a\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\r\u0010\u0013\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0010X\u008a\u008e\u0002"}, d2 = {"CardArtAspectRatio", "", "DebitCardArtView", "", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "debitCardArt", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardArt;", "modifier", "Landroidx/compose/ui/Modifier;", "onIconClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardArt;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "CardLastFourDigitAndInfoIconView", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardArt;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "isFooterDarkTheme", "", "getFooterLabelColor", "Lcom/paypal/pds/core/Color;", "DebitCardArtViewPreview", "(Landroidx/compose/runtime/Composer;I)V", "debit-card_prodRelease", "shouldShowShimmer", "isImageLoadFailed"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardArtViewKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DebitCardArtView(final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardArt debitCardArt, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardArt, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(340365300);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(debitCardProductName.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(debitCardArt) ? 32 : 16;
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
                function02 = function0;
                i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
                if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    function03 = function02;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtViewKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function04 = (kotlin.jvm.functions.Function0) rememberedValue;
                    } else {
                        function04 = function02;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(340365300, i3, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtView (DebitCardArtView.kt:100)");
                    }
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue3;
                    com.paypal.pds.components.ShimmerStyle.Container container = com.paypal.pds.components.ShimmerStyle.Container.INSTANCE;
                    final kotlin.jvm.functions.Function0<kotlin.Unit> function05 = function04;
                    modifier3 = modifier4;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.ShimmerKt.Shimmer(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.AspectRatioKt.aspectRatio$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.platform.TestTagKt.testTag(modifier4, com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.DEBIT_CARD_ART_IMAGE), 0.0f, 1, null), 1.504f, false, 2, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSize24())), container, ((java.lang.Boolean) mutableState.getValue()).booleanValue(), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1905343585, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtViewKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtViewKt.$r8$lambda$w4ZH1XUTppuXrUu2RQUmQh5fB_g(androidx.compose.runtime.MutableState.this, debitCardArt, debitCardProductName, function05, mutableState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, 3120, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function03 = function04;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtViewKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtViewKt.$r8$lambda$0VbdRoxIC_YCofTFBYaaqNoETs4(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.this, debitCardArt, modifier3, function03, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function02 = function0;
            if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function02 = function0;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardArt debitCardArt, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1518848350);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(debitCardProductName.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(debitCardArt) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1518848350, i3, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.CardLastFourDigitAndInfoIconView (DebitCardArtView.kt:199)");
            }
            com.paypal.pds.core.ThemeKt.Theme(debitCardProductName == com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.CONSUMER_DEBIT_CARD, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1460488571, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtViewKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtViewKt.$r8$lambda$lEDldCHTgInZVxK6XHye9P0Ed8M(androidx.compose.ui.Modifier.this, debitCardArt, debitCardProductName, function0, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtViewKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtViewKt.m14605$r8$lambda$XeUty2kKUsSgz1_990IaUZQcC8(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.this, debitCardArt, function0, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0VbdRoxIC_YCofTFBYaaqNoETs4(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardArt debitCardArt, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DebitCardArtView(debitCardProductName, debitCardArt, modifier, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GO5XaqX0cdou9jfcbcAKovZbpos(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, com.paypal.oslo.core.commonui.components.AsyncImagePainter.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        if (state instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Success) {
            mutableState.setValue(java.lang.Boolean.FALSE);
            mutableState2.setValue(java.lang.Boolean.FALSE);
        } else if (state instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Loading) {
            mutableState.setValue(java.lang.Boolean.TRUE);
        } else if (state instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Empty) {
            mutableState.setValue(java.lang.Boolean.FALSE);
            mutableState2.setValue(java.lang.Boolean.TRUE);
        } else {
            if (!(state instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Error)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            mutableState.setValue(java.lang.Boolean.FALSE);
            mutableState2.setValue(java.lang.Boolean.TRUE);
            com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Error error = (com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Error) state;
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Debit card art image load failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, "image_loading"), kotlin.TuplesKt.to("state", error.toString())), null, error.getResult().getThrowable(), 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JCbz_VfQqXLnrBMXluEdBVHFVUA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1311705982);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1311705982, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtViewPreview (DebitCardArtView.kt:266)");
            }
            DebitCardArtView(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.CONSUMER_DEBIT_CARD, new com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardArt("https://via.placeholder.com/300x190.png?text=Debit+Card+Image", "Sample debit card image", "1234", null, null, null, null, 120, null), null, null, startRestartGroup, 6, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtViewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtViewKt.$r8$lambda$JCbz_VfQqXLnrBMXluEdBVHFVUA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QZvazNfdUllDRv9DzO82SdGxrIs(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.hideFromAccessibility(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Xe-Uty2kKUsSgz1_990IaUZQcC8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14605$r8$lambda$XeUty2kKUsSgz1_990IaUZQcC8(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardArt debitCardArt, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(debitCardProductName, debitCardArt, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lEDldCHTgInZVxK6XHye9P0Ed8M(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardArt debitCardArt, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1460488571, i, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.CardLastFourDigitAndInfoIconView.<anonymous> (DebitCardArtView.kt:202)");
            }
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSize8()), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), composer, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, modifier);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            java.lang.String cardLastFourDigitText = debitCardArt.getCardLastFourDigitText();
            if (cardLastFourDigitText == null) {
                composer.startReplaceGroup(-1878022800);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1878022799);
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_card_art_last4, new java.lang.Object[]{cardLastFourDigitText}, composer, 0);
                com.paypal.pds.core.Typography.BodyLarge bodyLarge = com.paypal.pds.core.Typography.BodyLarge.INSTANCE;
                int i2 = com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtViewKt.WhenMappings.$EnumSwitchMapping$0[debitCardProductName.ordinal()];
                com.paypal.pds.core.Color.ContentBrandPrimary contentBrandPrimary = i2 != 1 ? i2 != 2 ? null : com.paypal.pds.core.Color.ContentBrandSecondary.INSTANCE : com.paypal.pds.core.Color.ContentBrandPrimary.INSTANCE;
                if (contentBrandPrimary == null) {
                    contentBrandPrimary = debitCardArt.getCardLastFourDigitTextColor();
                }
                int m8501getEllipsisgIe3tQ8 = androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8();
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtViewKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtViewKt.$r8$lambda$QZvazNfdUllDRv9DzO82SdGxrIs((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), contentBrandPrimary, null, null, androidx.compose.ui.text.style.TextOverflow.m8488boximpl(m8501getEllipsisgIe3tQ8), false, 0, 0, null, bodyLarge, composer, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 6, 984);
                composer.endReplaceGroup();
            }
            com.paypal.pds.core.Icon cardInfoIcon = debitCardArt.getCardInfoIcon();
            if (cardInfoIcon == null) {
                composer.startReplaceGroup(-1877527451);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1877527450);
                com.paypal.pds.components.IconButtonKt.IconButton(cardInfoIcon, function0, androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.debitcard.shared.analytics.ManageCardAnalytics.INSTANCE.getINFO_CARD_BUTTON()), com.paypal.oslo.feature.debitcard.shared.constants.DebitCardTestTagConstants.SHOW_CARD_EYE_ICON), debitCardArt.getCardInfoIconStyle(), com.paypal.pds.components.ButtonSize.Small.INSTANCE, debitCardArt.getCardInfoIconContentDescription(), null, false, false, composer, 24576, 448);
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$w4ZH1XUTppuXrUu2RQUmQh5fB_g(final androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardArt debitCardArt, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, kotlin.jvm.functions.Function0 function0, final androidx.compose.runtime.MutableState mutableState2, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.ui.Modifier.Companion companion;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1905343585, i, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtView.<anonymous> (DebitCardArtView.kt:113)");
            }
            androidx.compose.ui.Modifier aspectRatio$default = androidx.compose.foundation.layout.AspectRatioKt.aspectRatio$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.504f, false, 2, null);
            if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                composer.startReplaceGroup(-196822634);
                companion = com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) null, composer, 54, 2);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-196681119);
                composer.endReplaceGroup();
                companion = androidx.compose.ui.Modifier.INSTANCE;
            }
            androidx.compose.ui.Modifier then = aspectRatio$default.then(companion);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, then);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            java.lang.String cardImageUrl = debitCardArt.getCardImageUrl();
            java.lang.String cardContentDescription = debitCardArt.getCardContentDescription();
            androidx.compose.ui.Modifier aspectRatio$default2 = androidx.compose.foundation.layout.AspectRatioKt.aspectRatio$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.504f, false, 2, null);
            androidx.compose.ui.layout.ContentScale fillBounds = androidx.compose.ui.layout.ContentScale.INSTANCE.getFillBounds();
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtViewKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtViewKt.$r8$lambda$GO5XaqX0cdou9jfcbcAKovZbpos(androidx.compose.runtime.MutableState.this, mutableState, (com.paypal.oslo.core.commonui.components.AsyncImagePainter.State) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.core.commonui.components.AsyncImageKt.AsyncImage(cardImageUrl, cardContentDescription, (kotlin.jvm.functions.Function1) rememberedValue, aspectRatio$default2, fillBounds, composer, 28032, 0);
            getHighSpeedVideoFpsRangesFor(debitCardProductName, debitCardArt, function0, androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getBottomStart()), com.paypal.pds.core.ConstantsKt.getSize16(), com.paypal.pds.core.ConstantsKt.getSize8()), composer, 0, 0);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.values().length];
            try {
                iArr[com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.BUSINESS_DEBIT_CARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.CONSUMER_DEBIT_CARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
