package com.paypal.android.threeds.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a'\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"BrandingView", "", "issuerImage", "Lcom/paypal/android/threeds/data/model/ChallengeImage;", "psImage", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/android/threeds/data/model/ChallengeImage;Lcom/paypal/android/threeds/data/model/ChallengeImage;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BrandingImageView", "challengeImage", "contentDesc", "", "(Lcom/paypal/android/threeds/data/model/ChallengeImage;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "three-ds_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BrandingViewKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BrandingView(final com.paypal.android.threeds.data.model.ChallengeImage challengeImage, final com.paypal.android.threeds.data.model.ChallengeImage challengeImage2, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-138372505);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(challengeImage) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(challengeImage2) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier5 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-138372505, i4, -1, "com.paypal.android.threeds.ui.BrandingView (BrandingView.kt:39)");
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.SizeKt.m1728heightInVpY3zN4$default(modifier5, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11029getThree_ds_margin_80D9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null), com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11013getThree_ds_margin_16D9Ej5fM(), com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11008getThree_ds_margin_12D9Ej5fM()), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.android.threeds.R.string.test_tag_branding_image, startRestartGroup, 0));
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11021getThree_ds_margin_40D9Ej5fM()), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 54);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(hashCode))) {
                    m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(hashCode));
                    m5299constructorimpl.apply(java.lang.Integer.valueOf(hashCode), setCompositeKeyHash);
                }
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                if (challengeImage != null) {
                    startRestartGroup.startReplaceGroup(371628250);
                    modifier4 = modifier5;
                    BrandingImageView(challengeImage, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.android.threeds.R.string.content_desc_issuer_image, startRestartGroup, 0), androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, modifier5, 1.0f, false, 2, null), startRestartGroup, i4 & 14, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    modifier4 = modifier5;
                    startRestartGroup.startReplaceGroup(371809879);
                    startRestartGroup.endReplaceGroup();
                }
                if (challengeImage2 != null) {
                    startRestartGroup.startReplaceGroup(371845250);
                    BrandingImageView(challengeImage2, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.android.threeds.R.string.content_desc_ps_image, startRestartGroup, 0), androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, modifier4, 1.0f, false, 2, null), startRestartGroup, (i4 >> 3) & 14, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(372019191);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.BrandingViewKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.android.threeds.ui.BrandingViewKt.$r8$lambda$igwDlCQnzW8fxYyySUcKbnhM0vo(com.paypal.android.threeds.data.model.ChallengeImage.this, challengeImage2, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BrandingImageView(final com.paypal.android.threeds.data.model.ChallengeImage challengeImage, final java.lang.String str, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeImage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-225960443);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(challengeImage) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-225960443, i3, -1, "com.paypal.android.threeds.ui.BrandingImageView (BrandingView.kt:75)");
                }
                androidx.compose.ui.Modifier modifier5 = modifier4;
                composer2 = startRestartGroup;
                coil3.compose.SingletonAsyncImageKt.m9749AsyncImage10Xjiaw(challengeImage.getExtraHigh(), str, androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(modifier4, com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11026getThree_ds_margin_56D9Ej5fM()), com.paypal.android.threeds.ui.theme.Dimensions.INSTANCE.m11010getThree_ds_margin_128D9Ej5fM()), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, i3 & 112, 0, 2040);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.BrandingViewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.android.threeds.ui.BrandingViewKt.$r8$lambda$nuXfqXnOXfcYfCg_dU9avv1uGGU(com.paypal.android.threeds.data.model.ChallengeImage.this, str, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$igwDlCQnzW8fxYyySUcKbnhM0vo(com.paypal.android.threeds.data.model.ChallengeImage challengeImage, com.paypal.android.threeds.data.model.ChallengeImage challengeImage2, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BrandingView(challengeImage, challengeImage2, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nuXfqXnOXfcYfCg_dU9avv1uGGU(com.paypal.android.threeds.data.model.ChallengeImage challengeImage, java.lang.String str, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BrandingImageView(challengeImage, str, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
