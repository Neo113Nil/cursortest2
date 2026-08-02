package com.paypal.oslo.feature.debitcard.shared.ui.components;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u008e\u0002"}, d2 = {"DebitCardArtImageWithShimmer", "", "debitCardArtConfig", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitCardArtConfig;", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitCardArtConfig;Landroidx/compose/runtime/Composer;I)V", "DebitCardArtImageWithShimmerPreview", "(Landroidx/compose/runtime/Composer;I)V", "debit-card_prodRelease", "shouldShowShimmer", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DebitCardArtImageWithShimmerKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void DebitCardArtImageWithShimmer(final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitCardArtConfig debitCardArtConfig, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardArtConfig, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1374838747);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(debitCardArtConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1374838747, i2, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtImageWithShimmer (DebitCardArtImageWithShimmer.kt:45)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.valueOf(debitCardArtConfig.getShouldShowShimmer()), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            com.paypal.pds.components.ShimmerKt.Shimmer(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.components.ShimmerStyle.Container.INSTANCE, ((java.lang.Boolean) mutableState.getValue()).booleanValue(), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1361018670, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtImageWithShimmerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtImageWithShimmerKt.m14603$r8$lambda$9iy_FfdP0c80GFjP4qj0uVNI5M(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitCardArtConfig.this, mutableState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 3126, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtImageWithShimmerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtImageWithShimmerKt.$r8$lambda$rcVPTBxQQ_9jZGg9d66RkwtdOAQ(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitCardArtConfig.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$9iy_FfdP0c80GFjP4qj0-uVNI5M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14603$r8$lambda$9iy_FfdP0c80GFjP4qj0uVNI5M(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitCardArtConfig debitCardArtConfig, final androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1361018670, i, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtImageWithShimmer.<anonymous> (DebitCardArtImageWithShimmer.kt:52)");
            }
            androidx.compose.ui.Modifier clip = androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.ui.Modifier.INSTANCE, null, false, 3, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(debitCardArtConfig.m14660getCornerSizeD9Ej5fM()));
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, clip);
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
            java.lang.String cardImageUrl = debitCardArtConfig.getCardImageUrl();
            java.lang.String cardContentDescription = debitCardArtConfig.getCardContentDescription();
            androidx.compose.ui.Modifier wrapContentSize$default = androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(debitCardArtConfig.getModifier(), null, false, 3, null);
            androidx.compose.ui.layout.ContentScale contentScale = debitCardArtConfig.getContentScale();
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtImageWithShimmerKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtImageWithShimmerKt.m14604$r8$lambda$c4OyFA6BYrfJFR2VllyqDf06sI(androidx.compose.runtime.MutableState.this, (com.paypal.oslo.core.commonui.components.AsyncImagePainter.State) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.core.commonui.components.AsyncImageKt.AsyncImage(cardImageUrl, cardContentDescription, (kotlin.jvm.functions.Function1) rememberedValue, wrapContentSize$default, contentScale, composer, 384, 0);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HNluG5HIYUy7H5M1E_faNab_9Iw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-689711796);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-689711796, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtImageWithShimmerPreview (DebitCardArtImageWithShimmer.kt:102)");
            }
            DebitCardArtImageWithShimmer(new com.paypal.oslo.feature.debitcard.shared.ui.model.DebitCardArtConfig("https://www.paypalobjects.com/ucs/card/ppdc/de/cons-debit-card-large.png", "Processing your request", null, null, false, 0.0f, 60, null), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtImageWithShimmerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.shared.ui.components.DebitCardArtImageWithShimmerKt.$r8$lambda$HNluG5HIYUy7H5M1E_faNab_9Iw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$c4O-yFA6BYrfJFR2VllyqDf06sI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14604$r8$lambda$c4OyFA6BYrfJFR2VllyqDf06sI(androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.core.commonui.components.AsyncImagePainter.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        if (state instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Success) {
            mutableState.setValue(java.lang.Boolean.FALSE);
        } else if (state instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Loading) {
            mutableState.setValue(java.lang.Boolean.TRUE);
        } else if (state instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Empty) {
            mutableState.setValue(java.lang.Boolean.FALSE);
        } else {
            if (!(state instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Error)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            mutableState.setValue(java.lang.Boolean.FALSE);
            com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Error error = (com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Error) state;
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Debit card art image load failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, "image_loading"), kotlin.TuplesKt.to("state", error.toString())), null, error.getResult().getThrowable(), 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rcVPTBxQQ_9jZGg9d66RkwtdOAQ(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitCardArtConfig debitCardArtConfig, int i, androidx.compose.runtime.Composer composer, int i2) {
        DebitCardArtImageWithShimmer(debitCardArtConfig, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
