package com.paypal.oslo.feature.helpcenter.ui.components;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\u0010\u0015\u001a5\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u001aH\u0001¢\u0006\u0002\u0010\u001b\u001a\u001d\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0003¢\u0006\u0002\u0010\u001f\u001a\r\u0010 \u001a\u00020\bH\u0001¢\u0006\u0002\u0010!\u001a\r\u0010\"\u001a\u00020\bH\u0003¢\u0006\u0002\u0010!\u001a\u001f\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\u0010&\u001a\u0010\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\fH\u0000\u001a\r\u0010)\u001a\u00020\bH\u0003¢\u0006\u0002\u0010!\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u008e\u0002"}, d2 = {"AspectRatioWidescreen", "", "SmallIconMaxDimension", "", "YouTubeVideoIdGroupIndex", "YouTubeRegex", "Lkotlin/text/Regex;", "CircularIconButton", "", "icon", "Lcom/paypal/pds/core/Icon;", "contentDescription", "", "onClick", "Lkotlin/Function0;", "(Lcom/paypal/pds/core/Icon;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ArticleInlineImage", "image", "Lcom/paypal/oslo/feature/helpcenter/ui/models/InlineElement$Image;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/helpcenter/ui/models/InlineElement$Image;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ArticleVideoSection", "video", "Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement$Video;", "onVideoClick", "Lkotlin/Function1;", "(Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement$Video;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "VideoThumbnail", "thumbnailState", "Lcom/paypal/oslo/feature/helpcenter/ui/components/ThumbnailState;", "(Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement$Video;Lcom/paypal/oslo/feature/helpcenter/ui/components/ThumbnailState;Landroidx/compose/runtime/Composer;I)V", "VideoPlaceholder", "(Landroidx/compose/runtime/Composer;I)V", "PlayButtonOverlay", "ArticleYouTubeSection", "youtube", "Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement$YouTube;", "(Lcom/paypal/oslo/feature/helpcenter/ui/models/BlockElement$YouTube;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "extractYouTubeVideoId", "url", "PlayButtonOverlayPreview", "helpcenter_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ArticleComponentsKt {
    private static final kotlin.text.Regex getHighSpeedVideoSizes = new kotlin.text.Regex("^((?:https?:)?//)?((?:www|m)\\.)?(youtube(-nocookie)?\\.com|youtu.be)(/(?:[\\w\\-]+\\?v=|embed/|v/)?)([\\w\\-]+)(\\S+)?$");

    public static final void CircularIconButton(final com.paypal.pds.core.Icon icon, final java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        final int i3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1550909145);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(icon) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer2 = startRestartGroup;
            i3 = i;
            function02 = function0;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1550909145, i2, -1, "com.paypal.oslo.feature.helpcenter.ui.components.CircularIconButton (ArticleComponents.kt:99)");
            }
            androidx.compose.ui.Modifier m22100clickable_mRqjOc = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize32()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE, (androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape(), startRestartGroup, 48, 0), null, null, false, null, null, function0, startRestartGroup, (i2 << 12) & 3670016, 31);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m22100clickable_mRqjOc);
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
            composer2 = startRestartGroup;
            i3 = i;
            function02 = function0;
            com.paypal.pds.components.IconKt.Icon(icon, str, null, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, (i2 & 14) | 24576 | (i2 & 112), 12);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt.$r8$lambda$lQ90nBZbibluGZST6DOOPkEOq0U(com.paypal.pds.core.Icon.this, str, function02, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ArticleInlineImage(final com.paypal.oslo.feature.helpcenter.ui.models.InlineElement.Image image, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier fillMaxWidth$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(image, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-517821137);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(image) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-517821137, i3, -1, "com.paypal.oslo.feature.helpcenter.ui.components.ArticleInlineImage (ArticleComponents.kt:128)");
            }
            java.lang.Integer width = image.getWidth();
            java.lang.Integer height = image.getHeight();
            if (width != null && width.intValue() <= 100 && height != null && height.intValue() <= 100) {
                fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(modifier, androidx.compose.ui.unit.Dp.m8601constructorimpl(width.intValue()), androidx.compose.ui.unit.Dp.m8601constructorimpl(height.intValue()));
            } else {
                fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            }
            com.paypal.oslo.core.commonui.components.AsyncImageKt.AsyncImage(image.getSrc(), image.getAlt(), androidx.compose.ui.platform.TestTagKt.testTag(fillMaxWidth$default, "article_inline_image"), null, null, androidx.compose.ui.layout.ContentScale.INSTANCE.getFit(), startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt.$r8$lambda$F7Ll301RPYDh_DizGUo94bKuv3Y(com.paypal.oslo.feature.helpcenter.ui.models.InlineElement.Image.this, modifier, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ArticleVideoSection(final com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Video video, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12;
        androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function14;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(video, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(145711012);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(video) ? 4 : 2) | i;
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
                function12 = function1;
                i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function13 = function12;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt.m14787$r8$lambda$yp5nQkUpvtD2cSywRtXeYZRN4Q((java.lang.String) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                    } else {
                        function14 = function12;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(145711012, i3, -1, "com.paypal.oslo.feature.helpcenter.ui.components.ArticleVideoSection (ArticleComponents.kt:153)");
                    }
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState.Loading.INSTANCE, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                    final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.helpcenter.R.string.feature_helpcenter_accessibility_play_avatar, startRestartGroup, 0);
                    java.lang.String videoSource = video.getVideoSource();
                    java.lang.String thumbnailUrl = video.getThumbnailUrl();
                    int i6 = i3 & 14;
                    boolean z = i6 == 4;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt$ArticleVideoSection$2$1(video, mutableState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(videoSource, thumbnailUrl, (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, 0);
                    androidx.compose.ui.Modifier aspectRatio$default = androidx.compose.foundation.layout.AspectRatioKt.aspectRatio$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 1.7777778f, false, 2, null);
                    boolean changed = startRestartGroup.changed(stringResource);
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt.$r8$lambda$Gnn7vIY8tEMMYC8NbnXRcOnS2jc(stringResource, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(aspectRatio$default, false, (kotlin.jvm.functions.Function1) rememberedValue4, 1, null);
                    boolean z2 = (i3 & 896) == 256;
                    boolean z3 = i6 == 4;
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if ((z2 | z3) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt.m14786$r8$lambda$vx9fVnru8de35CwouQPaIqPrTk(kotlin.jvm.functions.Function1.this, video);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    function13 = function14;
                    modifier3 = modifier4;
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(semantics$default, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue5, startRestartGroup, 0, 31), "article_video");
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    Camera2StreamConfigurationMap(video, (com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState) mutableState.getValue(), startRestartGroup, i6);
                    getHighSpeedVideoFpsRanges(startRestartGroup, 0);
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier5 = modifier3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt.$r8$lambda$ofR5iVAV7SK3ZL1zII2diA01d3Q(com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Video.this, modifier5, function13, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function12 = function1;
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
        function12 = function1;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Video video, final com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState thumbnailState, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(121910104);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(video) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(thumbnailState) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(121910104, i2, -1, "com.paypal.oslo.feature.helpcenter.ui.components.VideoThumbnail (ArticleComponents.kt:195)");
            }
            if (video.getThumbnailUrl() != null) {
                startRestartGroup.startReplaceGroup(-1718262795);
                com.paypal.oslo.core.commonui.components.AsyncImageKt.AsyncImage(video.getThumbnailUrl(), null, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "article_video_thumbnail"), null, null, androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop(), startRestartGroup, 197040, 24);
                startRestartGroup.endReplaceGroup();
            } else if (thumbnailState instanceof com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState.Success) {
                startRestartGroup.startReplaceGroup(-1717878736);
                androidx.compose.foundation.ImageKt.m1335Image5hnEew(androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap(((com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState.Success) thumbnailState).getBitmap()), null, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "article_video_thumbnail"), null, androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, startRestartGroup, 25008, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                startRestartGroup.endReplaceGroup();
            } else if (thumbnailState instanceof com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState.Loading) {
                startRestartGroup.startReplaceGroup(-1717508069);
                com.paypal.pds.components.ShimmerKt.Shimmer((androidx.compose.ui.Modifier) null, (com.paypal.pds.components.ShimmerStyle) com.paypal.pds.components.ShimmerStyle.Container.INSTANCE, true, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) com.paypal.oslo.feature.helpcenter.ui.components.ComposableSingletons$ArticleComponentsKt.INSTANCE.m14791getLambda$557472757$helpcenter_prodRelease(), startRestartGroup, 3504, 1);
                startRestartGroup.endReplaceGroup();
            } else if (thumbnailState instanceof com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState.Failed) {
                startRestartGroup.startReplaceGroup(-1717286016);
                VideoPlaceholder(startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1717239702);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt.$r8$lambda$v0vdcJUYlxCqCT90qbY2bySXy7I(com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Video.this, thumbnailState, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void VideoPlaceholder(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-445440293);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-445440293, i, -1, "com.paypal.oslo.feature.helpcenter.ui.components.VideoPlaceholder (ArticleComponents.kt:235)");
            }
            androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), "article_video_thumbnail"), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt.m14785$r8$lambda$ieZ6g27rtzyXbSTxjf1MQRMElU(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1548829627);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1548829627, i, -1, "com.paypal.oslo.feature.helpcenter.ui.components.PlayButtonOverlay (ArticleComponents.kt:250)");
            }
            com.paypal.pds.core.ThemeKt.Theme(false, com.paypal.oslo.feature.helpcenter.ui.components.ComposableSingletons$ArticleComponentsKt.INSTANCE.getLambda$1446340392$helpcenter_prodRelease(), startRestartGroup, 54);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt.m14784$r8$lambda$brENeGrEofkekdyisIR76xHPYE(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ArticleYouTubeSection(final com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.YouTube youTube, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(youTube, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2141620887);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(youTube) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(2141620887, i3, -1, "com.paypal.oslo.feature.helpcenter.ui.components.ArticleYouTubeSection (ArticleComponents.kt:275)");
                }
                final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.helpcenter.R.string.feature_helpcenter_accessibility_play_avatar, startRestartGroup, 0);
                boolean changed = startRestartGroup.changed(youTube.getVideoSource());
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = extractYouTubeVideoId(youTube.getVideoSource());
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                java.lang.String str = (java.lang.String) rememberedValue;
                boolean changed2 = startRestartGroup.changed(str);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("https://img.youtube.com/vi/");
                    sb.append(str);
                    sb.append("/0.jpg");
                    rememberedValue2 = sb.toString();
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                java.lang.String str2 = (java.lang.String) rememberedValue2;
                androidx.compose.ui.Modifier aspectRatio$default = androidx.compose.foundation.layout.AspectRatioKt.aspectRatio$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), 1.7777778f, false, 2, null);
                boolean changed3 = startRestartGroup.changed(stringResource);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt.$r8$lambda$_NvB5ViqwlpbLlj24iZ7puxxra8(stringResource, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(aspectRatio$default, false, (kotlin.jvm.functions.Function1) rememberedValue3, 1, null);
                boolean z = (i3 & 14) == 4;
                boolean changedInstance = startRestartGroup.changedInstance(context);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if ((z | changedInstance) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt.m14783$r8$lambda$BbSGlFIT52xC_xTB4ysMtL8mnw(com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.YouTube.this, context);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                androidx.compose.ui.Modifier modifier4 = modifier3;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(semantics$default, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 0, 31), "article_youtube");
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                com.paypal.oslo.core.commonui.components.AsyncImageKt.AsyncImage(str2, null, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop(), startRestartGroup, 197040, 24);
                getHighSpeedVideoFpsRanges(startRestartGroup, 0);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt.$r8$lambda$djuloxMFwTtbC3ZouPdaSZVT__w(com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.YouTube.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final java.lang.String extractYouTubeVideoId(java.lang.String str) {
        java.util.List<java.lang.String> groupValues;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = null;
        kotlin.text.MatchResult find$default = kotlin.text.Regex.find$default(getHighSpeedVideoSizes, str, 0, 2, null);
        if (find$default != null && (groupValues = find$default.getGroupValues()) != null) {
            str2 = groupValues.get(6);
        }
        return str2 == null ? "" : str2;
    }

    /* renamed from: $r8$lambda$BbSGlFIT52xC_xTB4ysMtL-8mnw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14783$r8$lambda$BbSGlFIT52xC_xTB4ysMtL8mnw(com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.YouTube youTube, android.content.Context context) {
        context.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(youTube.getVideoSource())));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$F7Ll301RPYDh_DizGUo94bKuv3Y(com.paypal.oslo.feature.helpcenter.ui.models.InlineElement.Image image, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ArticleInlineImage(image, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Gnn7vIY8tEMMYC8NbnXRcOnS2jc(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SFNosugeD4THTaECWcIPAzLtTsk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-96760811);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-96760811, updateChangedFlags, -1, "com.paypal.oslo.feature.helpcenter.ui.components.PlayButtonOverlayPreview (ArticleComponents.kt:314)");
            }
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(200.0f)), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
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
            getHighSpeedVideoFpsRanges(startRestartGroup, 0);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.helpcenter.ui.components.ArticleComponentsKt.$r8$lambda$SFNosugeD4THTaECWcIPAzLtTsk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_NvB5ViqwlpbLlj24iZ7puxxra8(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$brENeGr-EofkekdyisIR76xHPYE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14784$r8$lambda$brENeGrEofkekdyisIR76xHPYE(int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$djuloxMFwTtbC3ZouPdaSZVT__w(com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.YouTube youTube, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ArticleYouTubeSection(youTube, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ieZ-6g27rtzyXbSTxjf1MQRMElU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14785$r8$lambda$ieZ6g27rtzyXbSTxjf1MQRMElU(int i, androidx.compose.runtime.Composer composer, int i2) {
        VideoPlaceholder(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lQ90nBZbibluGZST6DOOPkEOq0U(com.paypal.pds.core.Icon icon, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        CircularIconButton(icon, str, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ofR5iVAV7SK3ZL1zII2diA01d3Q(com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Video video, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ArticleVideoSection(video, modifier, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$v0vdcJUYlxCqCT90qbY2bySXy7I(com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Video video, com.paypal.oslo.feature.helpcenter.ui.components.ThumbnailState thumbnailState, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(video, thumbnailState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$vx9fVnru8de35CwouQPaIqPrT-k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14786$r8$lambda$vx9fVnru8de35CwouQPaIqPrTk(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.helpcenter.ui.models.BlockElement.Video video) {
        function1.invoke(video.getVideoSource());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$yp5n-QkUpvtD2cSywRtXeYZRN4Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14787$r8$lambda$yp5nQkUpvtD2cSywRtXeYZRN4Q(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }
}
