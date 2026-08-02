package com.paypal.oslo.feature.helpcenter.ui.screens;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\u001a-\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u008e\u0002²\u0006\f\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u008a\u008e\u0002"}, d2 = {"PositionSaveIntervalMs", "", "VideoPlayerScreen", "", "videoUrl", "", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "helpcenter_prodRelease", "savedPosition", "", "videoViewRef", "Landroid/widget/VideoView;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class VideoPlayerScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VideoPlayerScreen(final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-955288502);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-955288502, i3, -1, "com.paypal.oslo.feature.helpcenter.ui.screens.VideoPlayerScreen (VideoPlayerScreen.kt:66)");
                }
                java.lang.Object[] objArr = new java.lang.Object[0];
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.VideoPlayerScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            androidx.compose.runtime.MutableIntState mutableIntStateOf;
                            mutableIntStateOf = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
                            return mutableIntStateOf;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.runtime.MutableIntState mutableIntState = (androidx.compose.runtime.MutableIntState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 48);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                android.widget.VideoView videoView = (android.widget.VideoView) mutableState.getValue();
                boolean changed = startRestartGroup.changed(mutableIntState);
                com.paypal.oslo.feature.helpcenter.ui.screens.VideoPlayerScreenKt$VideoPlayerScreen$1$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.oslo.feature.helpcenter.ui.screens.VideoPlayerScreenKt$VideoPlayerScreen$1$1(mutableState, mutableIntState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(videoView, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 0);
                final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(context);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.VideoPlayerScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.helpcenter.ui.screens.VideoPlayerScreenKt.$r8$lambda$pq_xHNp9Eo7y40nSXK0ZYvm_Qsw(context, (androidx.compose.runtime.DisposableEffectScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                androidx.compose.runtime.EffectsKt.DisposableEffect(unit, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue4, startRestartGroup, 6);
                final androidx.compose.ui.Modifier modifier5 = modifier4;
                com.paypal.pds.core.ThemeKt.Theme(false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-355106067, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.VideoPlayerScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.helpcenter.ui.screens.VideoPlayerScreenKt.$r8$lambda$A8udy961NyfwvzoDCKMoCXt3oI4(androidx.compose.ui.Modifier.this, str, mutableIntState, function0, mutableState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, 54);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.VideoPlayerScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.helpcenter.ui.screens.VideoPlayerScreenKt.$r8$lambda$Ho2E305mc4IgnFjsIXd9eHeyEf8(str, function0, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ void $r8$lambda$4PAoNkN2A5mwdWRMOa0D0xn7V4E(android.widget.VideoView videoView, androidx.compose.runtime.MutableIntState mutableIntState, android.media.MediaPlayer mediaPlayer) {
        androidx.compose.runtime.MutableIntState mutableIntState2 = mutableIntState;
        if (mutableIntState2.getIntValue() > 0) {
            videoView.seekTo(mutableIntState2.getIntValue());
        }
        videoView.start();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$A8udy961NyfwvzoDCKMoCXt3oI4(androidx.compose.ui.Modifier modifier, final java.lang.String str, final androidx.compose.runtime.MutableIntState mutableIntState, kotlin.jvm.functions.Function0 function0, final androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-355106067, i, -1, "com.paypal.oslo.feature.helpcenter.ui.screens.VideoPlayerScreen.<anonymous> (VideoPlayerScreen.kt:102)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundUtilityEmphasis.INSTANCE, (androidx.compose.ui.graphics.Shape) null, composer, 48, 2), "video_player_container");
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, testTag);
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
            androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "video_player");
            boolean changed = composer.changed(str);
            boolean changed2 = composer.changed(mutableIntState);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.VideoPlayerScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.helpcenter.ui.screens.VideoPlayerScreenKt.$r8$lambda$JT9Pk1lyWw5bYHRXuXYSz0e2_7M(str, mutableIntState, mutableState, (android.content.Context) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.VideoPlayerScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.helpcenter.ui.screens.VideoPlayerScreenKt.$r8$lambda$iGyFptnsMNJGBck7ACm3dZhK7y8(androidx.compose.runtime.MutableState.this, (android.widget.VideoView) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(function1, testTag2, null, (kotlin.jvm.functions.Function1) rememberedValue2, null, composer, 3120, 20);
            com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.ArrowLeft.INSTANCE, function0, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopStart()), com.paypal.pds.core.ConstantsKt.getSpacing16()), "video_player_back_button"), com.paypal.pds.components.ButtonStyle.Overlay.INSTANCE, null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.core.common.ui.R.string.core_common_ui_top_bar_back_button_content_description, composer, 0), null, false, false, composer, 3078, 464);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Ho2E305mc4IgnFjsIXd9eHeyEf8(java.lang.String str, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        VideoPlayerScreen(str, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ android.widget.VideoView $r8$lambda$JT9Pk1lyWw5bYHRXuXYSz0e2_7M(java.lang.String str, final androidx.compose.runtime.MutableIntState mutableIntState, androidx.compose.runtime.MutableState mutableState, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        final android.widget.VideoView videoView = new android.widget.VideoView(context);
        videoView.setVideoURI(android.net.Uri.parse(str));
        android.widget.MediaController mediaController = new android.widget.MediaController(context);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.VideoPlayerScreenKt$$ExternalSyntheticLambda0
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(android.media.MediaPlayer mediaPlayer) {
                com.paypal.oslo.feature.helpcenter.ui.screens.VideoPlayerScreenKt.$r8$lambda$4PAoNkN2A5mwdWRMOa0D0xn7V4E(videoView, mutableIntState, mediaPlayer);
            }
        });
        mutableState.setValue(videoView);
        return videoView;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iGyFptnsMNJGBck7ACm3dZhK7y8(androidx.compose.runtime.MutableState mutableState, android.widget.VideoView videoView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoView, "");
        mutableState.setValue(null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$pq_xHNp9Eo7y40nSXK0ZYvm_Qsw(android.content.Context context, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        android.view.Window window;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null || (window = activity.getWindow()) == null) {
            return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.VideoPlayerScreenKt$VideoPlayerScreen$lambda$7$0$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public final void dispose() {
                }
            };
        }
        final androidx.core.view.WindowInsetsControllerCompat insetsController = androidx.core.view.WindowCompat.getInsetsController(window, window.getDecorView());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(insetsController, "");
        insetsController.hide(androidx.core.view.WindowInsetsCompat.Type.systemBars());
        insetsController.setSystemBarsBehavior(2);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.helpcenter.ui.screens.VideoPlayerScreenKt$VideoPlayerScreen$lambda$7$0$$inlined$onDispose$2
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.core.view.WindowInsetsControllerCompat.this.show(androidx.core.view.WindowInsetsCompat.Type.systemBars());
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ android.widget.VideoView access$VideoPlayerScreen$lambda$4(androidx.compose.runtime.MutableState mutableState) {
        return (android.widget.VideoView) mutableState.getValue();
    }
}
