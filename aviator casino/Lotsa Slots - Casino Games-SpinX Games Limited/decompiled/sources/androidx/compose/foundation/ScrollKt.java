package androidx.compose.foundation;

/* compiled from: Scroll.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a2\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\t\u001a6\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0002\u001a2\u0010\u0010\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\t¨\u0006\u0011"}, d2 = {"rememberScrollState", "Landroidx/compose/foundation/ScrollState;", "initial", "", "(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;", "horizontalScroll", "Landroidx/compose/ui/Modifier;", "state", "enabled", "", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "reverseScrolling", com.helpshift.proactive.InAppViewConstants.SCROLL, "isScrollable", "isVertical", "verticalScroll", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollKt {
    public static final androidx.compose.foundation.ScrollState rememberScrollState(final int i, androidx.compose.runtime.Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-1464256199);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberScrollState)74@3377L90:Scroll.kt#71ulvw");
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1464256199, i2, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:73)");
        }
        java.lang.Object[] objArr = new java.lang.Object[0];
        androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.ScrollState, ?> saver = androidx.compose.foundation.ScrollState.INSTANCE.getSaver();
        composer.startReplaceableGroup(-699453458);
        boolean changed = composer.changed(i);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.compose.foundation.ScrollState>() { // from class: androidx.compose.foundation.ScrollKt$rememberScrollState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final androidx.compose.foundation.ScrollState invoke() {
                    return new androidx.compose.foundation.ScrollState(i);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.foundation.ScrollState scrollState = (androidx.compose.foundation.ScrollState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue, composer, 72, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return scrollState;
    }

    public static /* synthetic */ androidx.compose.ui.Modifier verticalScroll$default(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.ScrollState scrollState, boolean z, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            flingBehavior = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return verticalScroll(modifier, scrollState, z, flingBehavior, z2);
    }

    public static final androidx.compose.ui.Modifier verticalScroll(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.ScrollState scrollState, boolean z, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2) {
        return scroll(modifier, scrollState, z2, flingBehavior, z, true);
    }

    public static /* synthetic */ androidx.compose.ui.Modifier horizontalScroll$default(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.ScrollState scrollState, boolean z, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            flingBehavior = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return horizontalScroll(modifier, scrollState, z, flingBehavior, z2);
    }

    public static final androidx.compose.ui.Modifier horizontalScroll(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.ScrollState scrollState, boolean z, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2) {
        return scroll(modifier, scrollState, z2, flingBehavior, z, false);
    }

    private static final androidx.compose.ui.Modifier scroll(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.ScrollState scrollState, final boolean z, final androidx.compose.foundation.gestures.FlingBehavior flingBehavior, final boolean z2, final boolean z3) {
        return androidx.compose.ui.ComposedModifierKt.composed(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.ScrollKt$scroll$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName(com.helpshift.proactive.InAppViewConstants.SCROLL);
                inspectorInfo.getProperties().set("state", androidx.compose.foundation.ScrollState.this);
                inspectorInfo.getProperties().set("reverseScrolling", java.lang.Boolean.valueOf(z));
                inspectorInfo.getProperties().set("flingBehavior", flingBehavior);
                inspectorInfo.getProperties().set("isScrollable", java.lang.Boolean.valueOf(z2));
                inspectorInfo.getProperties().set("isVertical", java.lang.Boolean.valueOf(z3));
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.Modifier>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier2, androidx.compose.runtime.Composer composer, int i) {
                composer.startReplaceableGroup(1478351300);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C272@10178L18,273@10226L24,306@11719L7:Scroll.kt#71ulvw");
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1478351300, i, -1, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:272)");
                }
                androidx.compose.foundation.OverscrollEffect overscrollEffect = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.overscrollEffect(composer, 6);
                composer.startReplaceableGroup(773894976);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                composer.startReplaceableGroup(-492369756);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller(androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer));
                    composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    rememberedValue = compositionScopedCoroutineScopeCanceller;
                }
                composer.endReplaceableGroup();
                final kotlinx.coroutines.CoroutineScope coroutineScope = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                composer.endReplaceableGroup();
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                final boolean z4 = z;
                final boolean z5 = z3;
                final boolean z6 = z2;
                final androidx.compose.foundation.ScrollState scrollState2 = scrollState;
                androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1
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
                        androidx.compose.ui.semantics.SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
                        final androidx.compose.foundation.ScrollState scrollState3 = scrollState2;
                        kotlin.jvm.functions.Function0<java.lang.Float> function0 = new kotlin.jvm.functions.Function0<java.lang.Float>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$accessibilityScrollState$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Float invoke() {
                                return java.lang.Float.valueOf(androidx.compose.foundation.ScrollState.this.getValue());
                            }
                        };
                        final androidx.compose.foundation.ScrollState scrollState4 = scrollState2;
                        androidx.compose.ui.semantics.ScrollAxisRange scrollAxisRange = new androidx.compose.ui.semantics.ScrollAxisRange(function0, new kotlin.jvm.functions.Function0<java.lang.Float>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$accessibilityScrollState$2
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Float invoke() {
                                return java.lang.Float.valueOf(androidx.compose.foundation.ScrollState.this.getMaxValue());
                            }
                        }, z4);
                        if (z5) {
                            androidx.compose.ui.semantics.SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
                        } else {
                            androidx.compose.ui.semantics.SemanticsPropertiesKt.setHorizontalScrollAxisRange(semanticsPropertyReceiver, scrollAxisRange);
                        }
                        if (z6) {
                            final kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                            final boolean z7 = z5;
                            final androidx.compose.foundation.ScrollState scrollState5 = scrollState2;
                            androidx.compose.ui.semantics.SemanticsPropertiesKt.scrollBy$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function2<java.lang.Float, java.lang.Float, java.lang.Boolean>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Float f, java.lang.Float f2) {
                                    return invoke(f.floatValue(), f2.floatValue());
                                }

                                /* compiled from: Scroll.kt */
                                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", f = "Scroll.kt", i = {}, l = {293, 295}, m = "invokeSuspend", n = {}, s = {})
                                /* renamed from: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1, reason: invalid class name and collision with other inner class name */
                                static final class C00081 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                    final /* synthetic */ boolean $isVertical;
                                    final /* synthetic */ androidx.compose.foundation.ScrollState $state;
                                    final /* synthetic */ float $x;
                                    final /* synthetic */ float $y;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C00081(boolean z, androidx.compose.foundation.ScrollState scrollState, float f, float f2, kotlin.coroutines.Continuation<? super androidx.compose.foundation.ScrollKt$scroll$2$semantics$1.AnonymousClass1.C00081> continuation) {
                                        super(2, continuation);
                                        this.$isVertical = z;
                                        this.$state = scrollState;
                                        this.$y = f;
                                        this.$x = f2;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                        return new androidx.compose.foundation.ScrollKt$scroll$2$semantics$1.AnonymousClass1.C00081(this.$isVertical, this.$state, this.$y, this.$x, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                        return ((androidx.compose.foundation.ScrollKt$scroll$2$semantics$1.AnonymousClass1.C00081) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            kotlin.ResultKt.throwOnFailure(obj);
                                            if (this.$isVertical) {
                                                androidx.compose.foundation.ScrollState scrollState = this.$state;
                                                kotlin.jvm.internal.Intrinsics.checkNotNull(scrollState, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                                                this.label = 1;
                                                if (androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy$default(scrollState, this.$y, null, this, 2, null) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            } else {
                                                androidx.compose.foundation.ScrollState scrollState2 = this.$state;
                                                kotlin.jvm.internal.Intrinsics.checkNotNull(scrollState2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                                                this.label = 2;
                                                if (androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy$default(scrollState2, this.$x, null, this, 2, null) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            }
                                        } else {
                                            if (i != 1 && i != 2) {
                                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            kotlin.ResultKt.throwOnFailure(obj);
                                        }
                                        return kotlin.Unit.INSTANCE;
                                    }
                                }

                                public final java.lang.Boolean invoke(float f, float f2) {
                                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScope.this, null, null, new androidx.compose.foundation.ScrollKt$scroll$2$semantics$1.AnonymousClass1.C00081(z7, scrollState5, f2, f, null), 3, null);
                                    return true;
                                }
                            }, 1, null);
                        }
                    }
                }, 1, null);
                androidx.compose.foundation.gestures.Orientation orientation = z3 ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal;
                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.foundation.gestures.ScrollableDefaults scrollableDefaults = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume = composer.consume(localLayoutDirection);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
                androidx.compose.ui.Modifier then = androidx.compose.foundation.OverscrollKt.overscroll(androidx.compose.foundation.ClipScrollableContainerKt.clipScrollableContainer(semantics$default, orientation), overscrollEffect).then(androidx.compose.foundation.gestures.ScrollableKt.scrollable$default(companion2, scrollState, orientation, overscrollEffect, z2, scrollableDefaults.reverseDirection((androidx.compose.ui.unit.LayoutDirection) consume, orientation, z), flingBehavior, scrollState.getInternalInteractionSource(), null, 128, null)).then(new androidx.compose.foundation.ScrollingLayoutElement(scrollState, z, z3));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return then;
            }
        });
    }
}
