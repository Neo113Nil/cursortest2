package com.paypal.oslo.feature.subscriptions.shared.ui;

@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0002\u0010\b\u001a+\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0003¢\u0006\u0002\u0010\b\u001a+\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0002\u0010\r\u001a+\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0002\u0010\b\u001a?\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0001¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0018¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u0084\u0002"}, d2 = {"FundingInstrumentCardArt", "", "fundingInstrument", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;", "modifier", "Landroidx/compose/ui/Modifier;", "contentDescription", "", "(Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "CardArtImageContainer", "CardArtImageContainerContent", com.google.android.libraries.places.api.model.PlaceTypes.PAINTER, "Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter;", "(Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "CardArtFallback", "CardArtIconContainer", "icon", "Lcom/paypal/pds/core/Icon;", "iconSize", "Lcom/paypal/pds/components/IconSize;", "iconTint", "Lcom/paypal/pds/core/Color;", "(Lcom/paypal/pds/core/Icon;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/paypal/pds/components/IconSize;Lcom/paypal/pds/core/Color;Landroidx/compose/runtime/Composer;II)V", "CardArtWithThumbnailPreview", "(Landroidx/compose/runtime/Composer;I)V", "CardArtIconContainerPreview", "subscriptions_prodRelease", "painterState", "Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$State;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class FundingInstrumentCardArtKt {
    public static final void FundingInstrumentCardArt(final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, androidx.compose.ui.Modifier modifier, java.lang.String str, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2123406357);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(fundingInstrumentUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (i5 != 0) {
                str = null;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2123406357, i3, -1, "com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentCardArt (FundingInstrumentCardArt.kt:51)");
            }
            java.lang.String thumbnail = fundingInstrumentUiModel.getThumbnail();
            if (thumbnail != null && thumbnail.length() != 0) {
                startRestartGroup.startReplaceGroup(-2120230881);
                getHighResolutionOutputSizeshNQ4ISI(fundingInstrumentUiModel, modifier, str, startRestartGroup, i3 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-2120042587);
                CardArtFallback(fundingInstrumentUiModel, modifier, str, startRestartGroup, i3 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO, 0);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        final java.lang.String str2 = str;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentCardArtKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentCardArtKt.$r8$lambda$uzrvpf500IERNx9Kknn4hbI5C0s(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.this, modifier2, str2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, androidx.compose.ui.Modifier modifier, java.lang.String str, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.lang.String str2;
        final androidx.compose.ui.Modifier modifier3;
        final java.lang.String str3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1554826269);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(fundingInstrumentUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                str2 = str;
                i3 |= startRestartGroup.changed(str2) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    str3 = str2;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    java.lang.String str4 = i4 != 0 ? null : str2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1554826269, i3, -1, "com.paypal.oslo.feature.subscriptions.shared.ui.CardArtImageContainer (FundingInstrumentCardArt.kt:72)");
                    }
                    com.paypal.oslo.core.commonui.components.AsyncImagePainter rememberAsyncImagePainter = com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(new com.paypal.oslo.core.commonui.components.ImageRequest.Builder((android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).data(fundingInstrumentUiModel.getThumbnail()).build(), null, null, null, null, startRestartGroup, com.paypal.oslo.core.commonui.components.ImageRequest.$stable, 30);
                    com.paypal.oslo.core.commonui.components.AsyncImagePainter.State state = (com.paypal.oslo.core.commonui.components.AsyncImagePainter.State) androidx.compose.runtime.SnapshotStateKt.collectAsState(rememberAsyncImagePainter.getState(), null, startRestartGroup, 0, 1).getValue();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(state, com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Empty.INSTANCE) || (state instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Loading)) {
                        startRestartGroup.startReplaceGroup(-1392402651);
                        androidx.compose.foundation.layout.BoxKt.Box(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(modifier4, androidx.compose.ui.unit.Dp.m8601constructorimpl(54.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(36.0f)), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4())), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else if (state instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Error) {
                        startRestartGroup.startReplaceGroup(-1392105733);
                        CardArtFallback(fundingInstrumentUiModel, modifier4, str4, startRestartGroup, i3 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        if (!(state instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Success)) {
                            startRestartGroup.startReplaceGroup(-460561033);
                            startRestartGroup.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        startRestartGroup.startReplaceGroup(-1391858942);
                        CardArtImageContainerContent(rememberAsyncImagePainter, modifier4, str4, startRestartGroup, i3 & 1008, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    str3 = str4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentCardArtKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentCardArtKt.$r8$lambda$wn61moz6L5Rq0tBk_uQw5FsDGtw(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.this, modifier3, str3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            str2 = str;
            if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str2 = str;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CardArtImageContainerContent(final com.paypal.oslo.core.commonui.components.AsyncImagePainter asyncImagePainter, androidx.compose.ui.Modifier modifier, java.lang.String str, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.lang.String str2;
        androidx.compose.ui.Modifier modifier3;
        final java.lang.String str3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asyncImagePainter, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-552623519);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(asyncImagePainter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                str2 = str;
                i3 |= startRestartGroup.changed(str2) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    str3 = str2;
                } else {
                    modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    java.lang.String str4 = i4 != 0 ? null : str2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-552623519, i3, -1, "com.paypal.oslo.feature.subscriptions.shared.ui.CardArtImageContainerContent (FundingInstrumentCardArt.kt:113)");
                    }
                    androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(modifier3, androidx.compose.ui.unit.Dp.m8601constructorimpl(54.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(36.0f)), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4())), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    java.lang.String str5 = str4;
                    androidx.compose.foundation.ImageKt.Image(asyncImagePainter, str5, boxScopeInstance.matchParentSize(androidx.compose.ui.Modifier.INSTANCE), (androidx.compose.ui.Alignment) null, androidx.compose.ui.layout.ContentScale.INSTANCE.getFit(), 0.0f, (androidx.compose.ui.graphics.ColorFilter) null, startRestartGroup, (i3 & 14) | 24576 | ((i3 >> 3) & 112), 104);
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    str3 = str4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier4 = modifier3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentCardArtKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentCardArtKt.m19970$r8$lambda$2Bs6qITbfMMkM6QEJTvzJjoT1I(com.paypal.oslo.core.commonui.components.AsyncImagePainter.this, modifier4, str3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            str2 = str;
            if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str2 = str;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CardArtFallback(final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, androidx.compose.ui.Modifier modifier, java.lang.String str, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.lang.String str2;
        androidx.compose.ui.Modifier modifier3;
        final java.lang.String str3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-158179999);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(fundingInstrumentUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                str2 = str;
                i3 |= startRestartGroup.changed(str2) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    str3 = str2;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    java.lang.String str4 = i4 != 0 ? null : str2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-158179999, i3, -1, "com.paypal.oslo.feature.subscriptions.shared.ui.CardArtFallback (FundingInstrumentCardArt.kt:135)");
                    }
                    com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig fundingInstrumentFallbackConfig = com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig.INSTANCE.getFundingInstrumentFallbackConfig(fundingInstrumentUiModel.getType());
                    if (fundingInstrumentFallbackConfig instanceof com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig.Icon) {
                        startRestartGroup.startReplaceGroup(-760871979);
                        com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig.Icon icon = (com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig.Icon) fundingInstrumentFallbackConfig;
                        CardArtIconContainer(icon.getIcon(), modifier4, str4, null, icon.getIconTint(), startRestartGroup, i3 & 1008, 8);
                        startRestartGroup.endReplaceGroup();
                        modifier3 = modifier4;
                    } else if (fundingInstrumentFallbackConfig instanceof com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig.Image) {
                        startRestartGroup.startReplaceGroup(-760572054);
                        com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig.Image image = (com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentFallbackConfig.Image) fundingInstrumentFallbackConfig;
                        androidx.compose.ui.Modifier modifier5 = modifier4;
                        com.paypal.oslo.core.commonui.components.AsyncImagePainter rememberAsyncImagePainter = com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(new com.paypal.oslo.core.commonui.components.ImageRequest.Builder((android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).data(image.getUrl()).build(), null, null, null, null, startRestartGroup, com.paypal.oslo.core.commonui.components.ImageRequest.$stable, 30);
                        com.paypal.oslo.core.commonui.components.AsyncImagePainter.State state = (com.paypal.oslo.core.commonui.components.AsyncImagePainter.State) androidx.compose.runtime.SnapshotStateKt.collectAsState(rememberAsyncImagePainter.getState(), null, startRestartGroup, 0, 1).getValue();
                        if (state instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Success) {
                            startRestartGroup.startReplaceGroup(-760242834);
                            CardArtImageContainerContent(rememberAsyncImagePainter, modifier5, str4, startRestartGroup, i3 & 1008, 0);
                            startRestartGroup.endReplaceGroup();
                        } else if (state instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Error) {
                            startRestartGroup.startReplaceGroup(-759937453);
                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "CardArtImageFallback: failed to load fallback image", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", image.getUrl()), kotlin.TuplesKt.to("error", java.lang.String.valueOf(((com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Error) state).getResult().getThrowable()))), null, 4, null);
                            CardArtIconContainer(com.paypal.pds.core.Icon.NoIcon.INSTANCE, modifier5, str4, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, (i3 & 112) | 24582 | (i3 & 896), 8);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-759305239);
                            modifier3 = modifier5;
                            androidx.compose.foundation.layout.BoxKt.Box(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(modifier3, androidx.compose.ui.unit.Dp.m8601constructorimpl(54.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(36.0f)), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing4())), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.endReplaceGroup();
                        }
                        modifier3 = modifier5;
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1687116698);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    str3 = str4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier6 = modifier3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentCardArtKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentCardArtKt.$r8$lambda$OCHfQMbpHNHi8pOAsW4REPZbXhA(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.this, modifier6, str3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            str2 = str;
            if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str2 = str;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CardArtIconContainer(final com.paypal.pds.core.Icon icon, androidx.compose.ui.Modifier modifier, java.lang.String str, com.paypal.pds.components.IconSize iconSize, com.paypal.pds.core.Color color, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.lang.String str2;
        int i5;
        com.paypal.pds.components.IconSize iconSize2;
        int i6;
        com.paypal.pds.core.Color color2;
        int i7;
        final androidx.compose.ui.Modifier modifier3;
        final java.lang.String str3;
        final com.paypal.pds.components.IconSize iconSize3;
        final com.paypal.pds.core.Color color3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1430280602);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(icon) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                str2 = str;
                i3 |= startRestartGroup.changed(str2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    iconSize2 = iconSize;
                    i3 |= startRestartGroup.changed(iconSize2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        color2 = color;
                        i3 |= startRestartGroup.changed(color2) ? 16384 : 8192;
                        i7 = i3;
                        if (!startRestartGroup.shouldExecute((i7 & 9363) != 9362, i7 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            str3 = str2;
                            iconSize3 = iconSize2;
                            color3 = color2;
                        } else {
                            androidx.compose.ui.Modifier modifier4 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            java.lang.String str4 = i4 != 0 ? null : str2;
                            com.paypal.pds.components.IconSize iconSize4 = i5 != 0 ? com.paypal.pds.components.IconSize.Small.INSTANCE : iconSize2;
                            if (i6 != 0) {
                                color2 = com.paypal.pds.core.Color.ContentBase.INSTANCE;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1430280602, i7, -1, "com.paypal.oslo.feature.subscriptions.shared.ui.CardArtIconContainer (FundingInstrumentCardArt.kt:197)");
                            }
                            androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(modifier4, androidx.compose.ui.unit.Dp.m8601constructorimpl(54.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(36.0f)), com.paypal.pds.core.ConstantsKt.getBorderSize1(), com.paypal.pds.core.Color.BorderBase.INSTANCE, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape4(), startRestartGroup, 384, 0), com.paypal.pds.core.ConstantsKt.getRoundedCornerShape4()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), com.paypal.pds.core.ConstantsKt.getSpacing12(), com.paypal.pds.core.ConstantsKt.getSpacing8());
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1707paddingVpY3zN4);
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
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            com.paypal.pds.components.IconKt.Icon(icon, str4, null, iconSize4, color2, startRestartGroup, (i7 & 14) | ((i7 >> 3) & 112) | (i7 & 7168) | (57344 & i7), 4);
                            startRestartGroup.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            color3 = color2;
                            modifier3 = modifier4;
                            str3 = str4;
                            iconSize3 = iconSize4;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentCardArtKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentCardArtKt.m19971$r8$lambda$waXTzaGxNy10imAhs0JFWDTPE(com.paypal.pds.core.Icon.this, modifier3, str3, iconSize3, color3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    color2 = color;
                    i7 = i3;
                    if (!startRestartGroup.shouldExecute((i7 & 9363) != 9362, i7 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                iconSize2 = iconSize;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                color2 = color;
                i7 = i3;
                if (!startRestartGroup.shouldExecute((i7 & 9363) != 9362, i7 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            str2 = str;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            iconSize2 = iconSize;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            color2 = color;
            i7 = i3;
            if (!startRestartGroup.shouldExecute((i7 & 9363) != 9362, i7 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str2 = str;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        iconSize2 = iconSize;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        color2 = color;
        i7 = i3;
        if (!startRestartGroup.shouldExecute((i7 & 9363) != 9362, i7 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$2Bs6qITbfMMkM6QEJTv-zJjoT1I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19970$r8$lambda$2Bs6qITbfMMkM6QEJTvzJjoT1I(com.paypal.oslo.core.commonui.components.AsyncImagePainter asyncImagePainter, androidx.compose.ui.Modifier modifier, java.lang.String str, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CardArtImageContainerContent(asyncImagePainter, modifier, str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4_nbJ5LeesRPImpp3kqL2np88qY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2120788010);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2120788010, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.shared.ui.CardArtWithThumbnailPreview (FundingInstrumentCardArt.kt:222)");
            }
            FundingInstrumentCardArt(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel.copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentPreviewData.INSTANCE.getCreditCard(), "preview-1", null, null, null, null, "https://www.paypalobjects.com/dp/wallet/card/visa_small.png", 30, null), null, "Visa credit card", startRestartGroup, 384, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentCardArtKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentCardArtKt.$r8$lambda$4_nbJ5LeesRPImpp3kqL2np88qY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OCHfQMbpHNHi8pOAsW4REPZbXhA(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, androidx.compose.ui.Modifier modifier, java.lang.String str, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CardArtFallback(fundingInstrumentUiModel, modifier, str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$niQtJqltgRCT4Ysqj0SPmErjaz4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-625516392);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-625516392, updateChangedFlags, -1, "com.paypal.oslo.feature.subscriptions.shared.ui.CardArtIconContainerPreview (FundingInstrumentCardArt.kt:236)");
            }
            CardArtIconContainer(com.paypal.pds.core.Icon.Alert.INSTANCE, null, "No backup payment method", null, com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE, startRestartGroup, 24966, 10);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentCardArtKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.shared.ui.FundingInstrumentCardArtKt.$r8$lambda$niQtJqltgRCT4Ysqj0SPmErjaz4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uzrvpf500IERNx9Kknn4hbI5C0s(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, androidx.compose.ui.Modifier modifier, java.lang.String str, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FundingInstrumentCardArt(fundingInstrumentUiModel, modifier, str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$waXTzaGxNy10imAhs0JFW-DTP-E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19971$r8$lambda$waXTzaGxNy10imAhs0JFWDTPE(com.paypal.pds.core.Icon icon, androidx.compose.ui.Modifier modifier, java.lang.String str, com.paypal.pds.components.IconSize iconSize, com.paypal.pds.core.Color color, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CardArtIconContainer(icon, modifier, str, iconSize, color, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wn61moz6L5Rq0tBk_uQw5FsDGtw(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, androidx.compose.ui.Modifier modifier, java.lang.String str, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(fundingInstrumentUiModel, modifier, str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
