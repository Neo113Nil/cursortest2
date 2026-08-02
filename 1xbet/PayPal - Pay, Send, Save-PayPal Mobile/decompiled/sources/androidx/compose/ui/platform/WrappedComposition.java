package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\f\u001a\u00020\n2\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00142\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\u001eR\u0016\u0010\u001c\u001a\u00020 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010#R!\u0010$\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020 8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020 8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'"}, d2 = {"Landroidx/compose/ui/platform/WrappedComposition;", "Landroidx/compose/runtime/Composition;", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/compose/runtime/CompositionServices;", "Landroidx/compose/ui/platform/AndroidComposeView;", "p0", "p1", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/runtime/Composition;)V", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "dispose", "()V", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/Lifecycle$Event;", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "T", "Landroidx/compose/runtime/CompositionServiceKey;", "getCompositionService", "(Landroidx/compose/runtime/CompositionServiceKey;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/platform/AndroidComposeView;", "()Landroidx/compose/ui/platform/AndroidComposeView;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/Composition;", "()Landroidx/compose/runtime/Composition;", "getHighSpeedVideoFpsRanges", "", "Z", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/Lifecycle;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function2;", "getHasInvalidations", "()Z", "getInputFormats", "isDisposed", "getInputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class WrappedComposition implements androidx.compose.runtime.Composition, androidx.view.LifecycleEventObserver, androidx.compose.runtime.CompositionServices {
    private kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt.INSTANCE.m7730getLambda$1759434350$ui();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.Composition getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.view.Lifecycle getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.ui.platform.AndroidComposeView getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    public WrappedComposition(androidx.compose.ui.platform.AndroidComposeView androidComposeView, androidx.compose.runtime.Composition composition) {
        this.getHighSpeedVideoSizes = androidComposeView;
        this.getHighSpeedVideoFpsRanges = composition;
    }

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
    public final androidx.compose.ui.platform.AndroidComposeView getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    /* renamed from: getHighSpeedVideoSizes, reason: from getter */
    public final androidx.compose.runtime.Composition getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.runtime.Composition
    public final void setContent(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> p0) {
        this.getHighSpeedVideoSizes.setOnViewTreeOwnersAvailable(new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners, kotlin.Unit>() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners viewTreeOwners) {
                getHighResolutionOutputSizeshNQ4ISI(viewTreeOwners);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners viewTreeOwners) {
                boolean z;
                androidx.view.Lifecycle lifecycle;
                z = androidx.compose.ui.platform.WrappedComposition.this.getHighResolutionOutputSizeshNQ4ISI;
                if (z) {
                    return;
                }
                androidx.view.Lifecycle lifecycle2 = viewTreeOwners.getLifecycleOwner().getLifecycle();
                androidx.compose.ui.platform.WrappedComposition.this.Camera2StreamConfigurationMap = p0;
                lifecycle = androidx.compose.ui.platform.WrappedComposition.this.getHighSpeedVideoFpsRangesFor;
                if (lifecycle == null) {
                    androidx.compose.ui.platform.WrappedComposition.this.getHighSpeedVideoFpsRangesFor = lifecycle2;
                    lifecycle2.addObserver(androidx.compose.ui.platform.WrappedComposition.this);
                } else if (lifecycle2.getCamera2StreamConfigurationMap().isAtLeast(androidx.lifecycle.Lifecycle.State.CREATED)) {
                    androidx.compose.runtime.Composition getHighSpeedVideoFpsRanges = androidx.compose.ui.platform.WrappedComposition.this.getGetHighSpeedVideoFpsRanges();
                    final androidx.compose.ui.platform.WrappedComposition wrappedComposition = androidx.compose.ui.platform.WrappedComposition.this;
                    final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = p0;
                    getHighSpeedVideoFpsRanges.setContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1330788943, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                            getHighResolutionOutputSizeshNQ4ISI(composer, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.Composer composer, int i) {
                            if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1330788943, i, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:125)");
                            }
                            java.lang.Object tag = androidx.compose.ui.platform.WrappedComposition.this.getGetHighSpeedVideoSizes().getTag(androidx.compose.ui.R.id.inspection_slot_table_set);
                            java.util.Set<androidx.compose.runtime.tooling.CompositionData> set = kotlin.jvm.internal.TypeIntrinsics.isMutableSet(tag) ? (java.util.Set) tag : null;
                            if (set == null) {
                                java.lang.Object parent = androidx.compose.ui.platform.WrappedComposition.this.getGetHighSpeedVideoSizes().getParent();
                                android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
                                java.lang.Object tag2 = view != null ? view.getTag(androidx.compose.ui.R.id.inspection_slot_table_set) : null;
                                set = kotlin.jvm.internal.TypeIntrinsics.isMutableSet(tag2) ? (java.util.Set) tag2 : null;
                            }
                            if (set != null) {
                                set.add(composer.getCompositionData());
                                composer.collectParameterInformation();
                            }
                            androidx.compose.ui.platform.AndroidComposeView getHighSpeedVideoSizes = androidx.compose.ui.platform.WrappedComposition.this.getGetHighSpeedVideoSizes();
                            boolean changedInstance = composer.changedInstance(androidx.compose.ui.platform.WrappedComposition.this);
                            androidx.compose.ui.platform.WrappedComposition wrappedComposition2 = androidx.compose.ui.platform.WrappedComposition.this;
                            androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1$1 rememberedValue = composer.rememberedValue();
                            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1$1(wrappedComposition2, null);
                                composer.updateRememberedValue(rememberedValue);
                            }
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(getHighSpeedVideoSizes, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer, 0);
                            androidx.compose.ui.platform.AndroidComposeView getHighSpeedVideoSizes2 = androidx.compose.ui.platform.WrappedComposition.this.getGetHighSpeedVideoSizes();
                            boolean changedInstance2 = composer.changedInstance(androidx.compose.ui.platform.WrappedComposition.this);
                            androidx.compose.ui.platform.WrappedComposition wrappedComposition3 = androidx.compose.ui.platform.WrappedComposition.this;
                            androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2$1 rememberedValue2 = composer.rememberedValue();
                            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2$1(wrappedComposition3, null);
                                composer.updateRememberedValue(rememberedValue2);
                            }
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(getHighSpeedVideoSizes2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer, 0);
                            androidx.compose.runtime.ProvidedValue<java.util.Set<androidx.compose.runtime.tooling.CompositionData>> provides = androidx.compose.runtime.tooling.InspectionTablesKt.getLocalInspectionTables().provides(set);
                            final androidx.compose.ui.platform.WrappedComposition wrappedComposition4 = androidx.compose.ui.platform.WrappedComposition.this;
                            final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = function2;
                            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(provides, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-280240369, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.platform.WrappedComposition.setContent.1.1.3
                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                    getHighResolutionOutputSizeshNQ4ISI(composer2, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.Composer composer2, int i2) {
                                    if (!composer2.shouldExecute((i2 & 3) != 2, i2 & 1)) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(-280240369, i2, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:141)");
                                    }
                                    androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(androidx.compose.ui.platform.WrappedComposition.this.getGetHighSpeedVideoSizes(), function22, composer2, 0);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }
                            }, composer, 54), composer, androidx.compose.runtime.ProvidedValue.$stable | 48);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }
                    }));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        });
    }

    @Override // androidx.compose.runtime.Composition
    public final void dispose() {
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoSizes.getView().setTag(androidx.compose.ui.R.id.wrapped_composition_tag, null);
            androidx.view.Lifecycle lifecycle = this.getHighSpeedVideoFpsRangesFor;
            if (lifecycle != null) {
                lifecycle.removeObserver(this);
            }
        }
        this.getHighSpeedVideoFpsRanges.dispose();
    }

    @Override // androidx.compose.runtime.Composition
    public final boolean getHasInvalidations() {
        return this.getHighSpeedVideoFpsRanges.getHasInvalidations();
    }

    @Override // androidx.compose.runtime.Composition
    public final boolean isDisposed() {
        return this.getHighSpeedVideoFpsRanges.isDisposed();
    }

    @Override // androidx.view.LifecycleEventObserver
    public final void onStateChanged(androidx.view.LifecycleOwner p0, androidx.lifecycle.Lifecycle.Event p1) {
        if (p1 == androidx.lifecycle.Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else {
            if (p1 != androidx.lifecycle.Lifecycle.Event.ON_CREATE || this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            setContent(this.Camera2StreamConfigurationMap);
        }
    }

    @Override // androidx.compose.runtime.CompositionServices
    public final <T> T getCompositionService(androidx.compose.runtime.CompositionServiceKey<T> p0) {
        androidx.compose.runtime.Composition composition = this.getHighSpeedVideoFpsRanges;
        androidx.compose.runtime.CompositionServices compositionServices = composition instanceof androidx.compose.runtime.CompositionServices ? (androidx.compose.runtime.CompositionServices) composition : null;
        if (compositionServices != null) {
            return (T) compositionServices.getCompositionService(p0);
        }
        return null;
    }
}
