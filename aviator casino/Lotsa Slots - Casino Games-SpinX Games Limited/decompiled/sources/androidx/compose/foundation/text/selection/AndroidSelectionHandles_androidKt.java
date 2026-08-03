package androidx.compose.foundation.text.selection;

/* compiled from: AndroidSelectionHandles.android.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\bH\u0001¢\u0006\u0002\u0010\t\u001a5\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\u0010\u0013\u001a+\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u0016\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u0017\u001a\u0018\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\rH\u0000\u001a \u0010\u0016\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0000\u001a\u0014\u0010\u001a\u001a\u00020\u001b*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0000\u001a\"\u0010\u001f\u001a\u00020\u0012*\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u0016\u001a\u00020\rH\u0000¨\u0006 "}, d2 = {"HandlePopup", "", "positionProvider", "Landroidx/compose/foundation/text/selection/OffsetProvider;", "handleReferencePoint", "Landroidx/compose/foundation/text/selection/HandleReferencePoint;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/text/selection/OffsetProvider;Landroidx/compose/foundation/text/selection/HandleReferencePoint;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SelectionHandle", "offsetProvider", "isStartHandle", "", "direction", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "handlesCrossed", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/foundation/text/selection/OffsetProvider;ZLandroidx/compose/ui/text/style/ResolvedTextDirection;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "SelectionHandleIcon", "iconVisible", "isLeft", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "isHandleLtrDirection", "areHandlesCrossed", "createHandleImage", "Landroidx/compose/ui/graphics/ImageBitmap;", "Landroidx/compose/ui/draw/CacheDrawScope;", com.helpshift.proactive.InAppViewConstants.RADIUS, "", "drawSelectionHandle", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidSelectionHandles_androidKt {
    public static final void SelectionHandle(final androidx.compose.foundation.text.selection.OffsetProvider offsetProvider, final boolean z, final androidx.compose.ui.text.style.ResolvedTextDirection resolvedTextDirection, final boolean z2, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-626955031);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(SelectionHandle)P(4,2)72@3246L7,73@3258L817:AndroidSelectionHandles.android.kt#eksfi3");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(offsetProvider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(resolvedTextDirection) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        int i3 = i2;
        if ((46811 & i3) != 9362 || !startRestartGroup.getSkipping()) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-626955031, i3, -1, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:66)");
            }
            final boolean isLeft = isLeft(z, resolvedTextDirection, z2);
            androidx.compose.foundation.text.selection.HandleReferencePoint handleReferencePoint = isLeft ? androidx.compose.foundation.text.selection.HandleReferencePoint.TopRight : androidx.compose.foundation.text.selection.HandleReferencePoint.TopLeft;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = startRestartGroup.consume(localViewConfiguration);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume;
            HandlePopup(offsetProvider, handleReferencePoint, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1868300064, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i4) {
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C74@3360L709:AndroidSelectionHandles.android.kt#eksfi3");
                    if ((i4 & 11) != 2 || !composer2.getSkipping()) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1868300064, i4, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:74)");
                        }
                        androidx.compose.runtime.ProvidedValue<androidx.compose.ui.platform.ViewConfiguration> provides = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration().provides(androidx.compose.ui.platform.ViewConfiguration.this);
                        final androidx.compose.ui.Modifier modifier2 = modifier;
                        final boolean z3 = isLeft;
                        final androidx.compose.foundation.text.selection.OffsetProvider offsetProvider2 = offsetProvider;
                        final boolean z4 = z;
                        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(provides, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -1338858912, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                invoke(composer3, num.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(androidx.compose.runtime.Composer composer3, int i5) {
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C75@3450L609:AndroidSelectionHandles.android.kt#eksfi3");
                                if ((i5 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-1338858912, i5, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:75)");
                                }
                                androidx.compose.ui.Modifier modifier3 = androidx.compose.ui.Modifier.this;
                                final androidx.compose.foundation.text.selection.OffsetProvider offsetProvider3 = offsetProvider2;
                                final boolean z5 = z4;
                                final boolean z6 = z3;
                                androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(modifier3, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.SelectionHandle.1.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        long mo850provideF1C5BW0 = androidx.compose.foundation.text.selection.OffsetProvider.this.mo850provideF1C5BW0();
                                        semanticsPropertyReceiver.set(androidx.compose.foundation.text.selection.SelectionHandlesKt.getSelectionHandleInfoKey(), new androidx.compose.foundation.text.selection.SelectionHandleInfo(z5 ? androidx.compose.foundation.text.Handle.SelectionStart : androidx.compose.foundation.text.Handle.SelectionEnd, mo850provideF1C5BW0, z6 ? androidx.compose.foundation.text.selection.SelectionHandleAnchor.Left : androidx.compose.foundation.text.selection.SelectionHandleAnchor.Right, androidx.compose.ui.geometry.OffsetKt.m1890isSpecifiedk4lQ0M(mo850provideF1C5BW0), null));
                                    }
                                }, 1, null);
                                final androidx.compose.foundation.text.selection.OffsetProvider offsetProvider4 = offsetProvider2;
                                androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.SelectionHandleIcon(semantics$default, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.SelectionHandle.1.1.2
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Boolean invoke() {
                                        return java.lang.Boolean.valueOf(androidx.compose.ui.geometry.OffsetKt.m1890isSpecifiedk4lQ0M(androidx.compose.foundation.text.selection.OffsetProvider.this.mo850provideF1C5BW0()));
                                    }
                                }, z3, composer3, 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 56);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, (i3 & 14) | 384);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandle$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i4) {
                    androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.SelectionHandle(androidx.compose.foundation.text.selection.OffsetProvider.this, z, resolvedTextDirection, z2, modifier, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void SelectionHandleIcon(final androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function0<java.lang.Boolean> function0, final boolean z, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2111672474);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(SelectionHandleIcon)P(2)99@4233L129:AndroidSelectionHandles.android.kt#eksfi3");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2111672474, i2, -1, "androidx.compose.foundation.text.selection.SelectionHandleIcon (AndroidSelectionHandles.android.kt:98)");
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(drawSelectionHandle(androidx.compose.foundation.layout.SizeKt.m619sizeVpY3zN4(modifier, androidx.compose.foundation.text.selection.SelectionHandlesKt.getHandleWidth(), androidx.compose.foundation.text.selection.SelectionHandlesKt.getHandleHeight()), function0, z), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandleIcon$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i3) {
                    androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.SelectionHandleIcon(androidx.compose.ui.Modifier.this, function0, z, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final androidx.compose.ui.Modifier drawSelectionHandle(androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function0<java.lang.Boolean> function0, final boolean z) {
        return androidx.compose.ui.ComposedModifierKt.composed$default(modifier, null, new kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.Modifier>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, int i) {
                composer.startReplaceableGroup(-196777734);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C110@4533L7:AndroidSelectionHandles.android.kt#eksfi3");
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-196777734, i, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:110)");
                }
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.text.selection.TextSelectionColors> localTextSelectionColors = androidx.compose.foundation.text.selection.TextSelectionColorsKt.getLocalTextSelectionColors();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume = composer.consume(localTextSelectionColors);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
                final long handleColor = ((androidx.compose.foundation.text.selection.TextSelectionColors) consume).getHandleColor();
                composer.startReplaceableGroup(442417347);
                boolean changed = composer.changed(handleColor) | composer.changedInstance(function0) | composer.changed(z);
                final kotlin.jvm.functions.Function0<java.lang.Boolean> function02 = function0;
                final boolean z2 = z;
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.draw.CacheDrawScope, androidx.compose.ui.draw.DrawResult>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final androidx.compose.ui.draw.DrawResult invoke(androidx.compose.ui.draw.CacheDrawScope cacheDrawScope) {
                            final androidx.compose.ui.graphics.ImageBitmap createHandleImage = androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.createHandleImage(cacheDrawScope, androidx.compose.ui.geometry.Size.m1940getWidthimpl(cacheDrawScope.m1778getSizeNHjbRc()) / 2.0f);
                            final androidx.compose.ui.graphics.ColorFilter m2154tintxETnrds$default = androidx.compose.ui.graphics.ColorFilter.Companion.m2154tintxETnrds$default(androidx.compose.ui.graphics.ColorFilter.INSTANCE, handleColor, 0, 2, null);
                            final kotlin.jvm.functions.Function0<java.lang.Boolean> function03 = function02;
                            final boolean z3 = z2;
                            return cacheDrawScope.onDrawWithContent(new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.ContentDrawScope, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
                                    invoke2(contentDrawScope);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
                                    contentDrawScope.drawContent();
                                    if (function03.invoke().booleanValue()) {
                                        if (z3) {
                                            androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope2 = contentDrawScope;
                                            androidx.compose.ui.graphics.ImageBitmap imageBitmap = createHandleImage;
                                            androidx.compose.ui.graphics.ColorFilter colorFilter = m2154tintxETnrds$default;
                                            long mo2591getCenterF1C5BW0 = contentDrawScope2.mo2591getCenterF1C5BW0();
                                            androidx.compose.ui.graphics.drawscope.DrawContext drawContext = contentDrawScope2.getDrawContext();
                                            long mo2598getSizeNHjbRc = drawContext.mo2598getSizeNHjbRc();
                                            drawContext.getCanvas().save();
                                            drawContext.getTransform().mo2605scale0AR0LA0(-1.0f, 1.0f, mo2591getCenterF1C5BW0);
                                            androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2662drawImagegbVJVH8$default(contentDrawScope2, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
                                            drawContext.getCanvas().restore();
                                            drawContext.mo2599setSizeuvyYCjk(mo2598getSizeNHjbRc);
                                            return;
                                        }
                                        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2662drawImagegbVJVH8$default(contentDrawScope, createHandleImage, 0L, 0.0f, null, m2154tintxETnrds$default, 0, 46, null);
                                    }
                                }
                            });
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                androidx.compose.ui.Modifier drawWithCache = androidx.compose.ui.draw.DrawModifierKt.drawWithCache(modifier2, (kotlin.jvm.functions.Function1) rememberedValue);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return drawWithCache;
            }
        }, 1, null);
    }

    public static final androidx.compose.ui.graphics.ImageBitmap createHandleImage(androidx.compose.ui.draw.CacheDrawScope cacheDrawScope, float f) {
        int ceil = ((int) java.lang.Math.ceil(f)) * 2;
        androidx.compose.ui.graphics.ImageBitmap imageBitmap = androidx.compose.foundation.text.selection.HandleImageCache.INSTANCE.getImageBitmap();
        androidx.compose.ui.graphics.Canvas canvas = androidx.compose.foundation.text.selection.HandleImageCache.INSTANCE.getCanvas();
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope = androidx.compose.foundation.text.selection.HandleImageCache.INSTANCE.getCanvasDrawScope();
        if (imageBitmap == null || canvas == null || ceil > imageBitmap.getWidth() || ceil > imageBitmap.getHeight()) {
            imageBitmap = androidx.compose.ui.graphics.ImageBitmapKt.m2347ImageBitmapx__hDU$default(ceil, ceil, androidx.compose.ui.graphics.ImageBitmapConfig.INSTANCE.m2341getAlpha8_sVssgQ(), false, null, 24, null);
            androidx.compose.foundation.text.selection.HandleImageCache.INSTANCE.setImageBitmap(imageBitmap);
            canvas = androidx.compose.ui.graphics.CanvasKt.Canvas(imageBitmap);
            androidx.compose.foundation.text.selection.HandleImageCache.INSTANCE.setCanvas(canvas);
        }
        androidx.compose.ui.graphics.ImageBitmap imageBitmap2 = imageBitmap;
        androidx.compose.ui.graphics.Canvas canvas2 = canvas;
        if (canvasDrawScope == null) {
            canvasDrawScope = new androidx.compose.ui.graphics.drawscope.CanvasDrawScope();
            androidx.compose.foundation.text.selection.HandleImageCache.INSTANCE.setCanvasDrawScope(canvasDrawScope);
        }
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        androidx.compose.ui.unit.LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        long Size = androidx.compose.ui.geometry.SizeKt.Size(imageBitmap2.getWidth(), imageBitmap2.getHeight());
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
        androidx.compose.ui.unit.Density density = drawParams.getDensity();
        androidx.compose.ui.unit.LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvas3 = drawParams.getCanvas();
        long size = drawParams.getSize();
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas2);
        drawParams2.m2597setSizeuvyYCjk(Size);
        canvas2.save();
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope3 = canvasDrawScope2;
        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2672drawRectnJ9OG0$default(canvasDrawScope3, androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU(), 0L, canvasDrawScope3.mo2592getSizeNHjbRc(), 0.0f, null, null, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2028getClear0nO6VwU(), 58, null);
        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2672drawRectnJ9OG0$default(canvasDrawScope3, androidx.compose.ui.graphics.ColorKt.Color(4278190080L), androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0(), androidx.compose.ui.geometry.SizeKt.Size(f, f), 0.0f, null, null, 0, 120, null);
        androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2659drawCircleVaOC9Bg$default(canvasDrawScope3, androidx.compose.ui.graphics.ColorKt.Color(4278190080L), f, androidx.compose.ui.geometry.OffsetKt.Offset(f, f), 0.0f, null, null, 0, 120, null);
        canvas2.restore();
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
        drawParams3.setDensity(density);
        drawParams3.setLayoutDirection(layoutDirection2);
        drawParams3.setCanvas(canvas3);
        drawParams3.m2597setSizeuvyYCjk(size);
        return imageBitmap2;
    }

    public static final void HandlePopup(final androidx.compose.foundation.text.selection.OffsetProvider offsetProvider, final androidx.compose.foundation.text.selection.HandleReferencePoint handleReferencePoint, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(345017889);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(HandlePopup)P(2,1)224@8202L127,227@8334L190:AndroidSelectionHandles.android.kt#eksfi3");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(offsetProvider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(handleReferencePoint) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(345017889, i2, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:223)");
            }
            int i3 = i2 << 3;
            startRestartGroup.startReplaceableGroup(511388516);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(handleReferencePoint) | startRestartGroup.changed(offsetProvider);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.foundation.text.selection.HandlePositionProvider(handleReferencePoint, offsetProvider);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.ui.window.AndroidPopup_androidKt.Popup((androidx.compose.foundation.text.selection.HandlePositionProvider) rememberedValue, null, new androidx.compose.ui.window.PopupProperties(false, false, false, null, true, false, 15, null), function2, startRestartGroup, (i3 & 7168) | 384, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$HandlePopup$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i4) {
                    androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.HandlePopup(androidx.compose.foundation.text.selection.OffsetProvider.this, handleReferencePoint, function2, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final boolean isLeft(boolean z, androidx.compose.ui.text.style.ResolvedTextDirection resolvedTextDirection, boolean z2) {
        if (z) {
            return isHandleLtrDirection(resolvedTextDirection, z2);
        }
        return !isHandleLtrDirection(resolvedTextDirection, z2);
    }

    public static final boolean isHandleLtrDirection(androidx.compose.ui.text.style.ResolvedTextDirection resolvedTextDirection, boolean z) {
        return (resolvedTextDirection == androidx.compose.ui.text.style.ResolvedTextDirection.Ltr && !z) || (resolvedTextDirection == androidx.compose.ui.text.style.ResolvedTextDirection.Rtl && z);
    }
}
