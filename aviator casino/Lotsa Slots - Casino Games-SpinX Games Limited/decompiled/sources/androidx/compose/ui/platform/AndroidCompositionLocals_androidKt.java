package androidx.compose.ui.platform;

/* compiled from: AndroidCompositionLocals.android.kt */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a(\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00150\u0019¢\u0006\u0002\b\u001aH\u0001¢\u0006\u0002\u0010\u001b\u001a\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002\u001a\u001f\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0002H\u0003¢\u0006\u0002\u0010#\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0004\"\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0004\"\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0004\"\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0004\"\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0004¨\u0006$²\u0006\n\u0010\"\u001a\u00020\u0002X\u008a\u008e\u0002"}, d2 = {"LocalConfiguration", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroid/content/res/Configuration;", "getLocalConfiguration", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalContext", "Landroid/content/Context;", "getLocalContext", "LocalImageVectorCache", "Landroidx/compose/ui/res/ImageVectorCache;", "getLocalImageVectorCache", "LocalLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLocalLifecycleOwner", "LocalSavedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "getLocalSavedStateRegistryOwner", "LocalView", "Landroid/view/View;", "getLocalView", "ProvideAndroidCompositionLocals", "", "owner", "Landroidx/compose/ui/platform/AndroidComposeView;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "noLocalProvidedFor", "", "name", "", "obtainImageVectorCache", "context", "configuration", "(Landroid/content/Context;Landroid/content/res/Configuration;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/res/ImageVectorCache;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<android.content.res.Configuration> LocalConfiguration = androidx.compose.runtime.CompositionLocalKt.compositionLocalOf$default(null, new kotlin.jvm.functions.Function0<android.content.res.Configuration>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalConfiguration$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final android.content.res.Configuration invoke() {
            androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalConfiguration");
            throw new kotlin.KotlinNothingValueException();
        }
    }, 1, null);
    private static final androidx.compose.runtime.ProvidableCompositionLocal<android.content.Context> LocalContext = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<android.content.Context>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalContext$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final android.content.Context invoke() {
            androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalContext");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.res.ImageVectorCache> LocalImageVectorCache = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.ui.res.ImageVectorCache>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalImageVectorCache$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.ui.res.ImageVectorCache invoke() {
            androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalImageVectorCache");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.lifecycle.LifecycleOwner> LocalLifecycleOwner = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.lifecycle.LifecycleOwner>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalLifecycleOwner$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.LifecycleOwner invoke() {
            androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalLifecycleOwner");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.savedstate.SavedStateRegistryOwner> LocalSavedStateRegistryOwner = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.savedstate.SavedStateRegistryOwner>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalSavedStateRegistryOwner$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.savedstate.SavedStateRegistryOwner invoke() {
            androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalSavedStateRegistryOwner");
            throw new kotlin.KotlinNothingValueException();
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<android.view.View> LocalView = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<android.view.View>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalView$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final android.view.View invoke() {
            androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalView");
            throw new kotlin.KotlinNothingValueException();
        }
    });

    public static final androidx.compose.runtime.ProvidableCompositionLocal<android.content.res.Configuration> getLocalConfiguration() {
        return LocalConfiguration;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<android.content.Context> getLocalContext() {
        return LocalContext;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.res.ImageVectorCache> getLocalImageVectorCache() {
        return LocalImageVectorCache;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.lifecycle.LifecycleOwner> getLocalLifecycleOwner() {
        return LocalLifecycleOwner;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.savedstate.SavedStateRegistryOwner> getLocalSavedStateRegistryOwner() {
        return LocalSavedStateRegistryOwner;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<android.view.View> getLocalView() {
        return LocalView;
    }

    public static final void ProvideAndroidCompositionLocals(final androidx.compose.ui.platform.AndroidComposeView androidComposeView, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1396852028);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(ProvideAndroidCompositionLocals)P(1)88@3008L87,94@3197L39,99@3437L102,102@3544L104,108@3677L46,109@3728L589:AndroidCompositionLocals.android.kt#itgzvw");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1396852028, i, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:83)");
        }
        android.content.Context context = androidComposeView.getContext();
        startRestartGroup.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new android.content.res.Configuration(context.getResources().getConfiguration()), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
        startRestartGroup.startReplaceableGroup(-230243351);
        boolean changed = startRestartGroup.changed(mutableState);
        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<android.content.res.Configuration, kotlin.Unit>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.content.res.Configuration configuration) {
                    invoke2(configuration);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(android.content.res.Configuration configuration) {
                    mutableState.setValue(new android.content.res.Configuration(configuration));
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        androidComposeView.setConfigurationChangeObserver((kotlin.jvm.functions.Function1) rememberedValue2);
        startRestartGroup.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new androidx.compose.ui.platform.AndroidUriHandler(context);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.ui.platform.AndroidUriHandler androidUriHandler = (androidx.compose.ui.platform.AndroidUriHandler) rememberedValue3;
        androidx.compose.ui.platform.AndroidComposeView.ViewTreeOwners viewTreeOwners = androidComposeView.getViewTreeOwners();
        if (viewTreeOwners == null) {
            throw new java.lang.IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry(androidComposeView, viewTreeOwners.getSavedStateRegistryOwner());
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.ui.platform.DisposableSaveableStateRegistry disposableSaveableStateRegistry = (androidx.compose.ui.platform.DisposableSaveableStateRegistry) rememberedValue4;
        androidx.compose.runtime.EffectsKt.DisposableEffect(kotlin.Unit.INSTANCE, new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                final androidx.compose.ui.platform.DisposableSaveableStateRegistry disposableSaveableStateRegistry2 = androidx.compose.ui.platform.DisposableSaveableStateRegistry.this;
                return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        androidx.compose.ui.platform.DisposableSaveableStateRegistry.this.dispose();
                    }
                };
            }
        }, startRestartGroup, 6);
        androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{LocalConfiguration.provides(ProvideAndroidCompositionLocals$lambda$1(mutableState)), LocalContext.provides(context), LocalLifecycleOwner.provides(viewTreeOwners.getLifecycleOwner()), LocalSavedStateRegistryOwner.provides(viewTreeOwners.getSavedStateRegistryOwner()), androidx.compose.runtime.saveable.SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(disposableSaveableStateRegistry), LocalView.provides(androidComposeView.getView()), LocalImageVectorCache.provides(obtainImageVectorCache(context, ProvideAndroidCompositionLocals$lambda$1(mutableState), startRestartGroup, 72))}, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1471621628, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3
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

            public final void invoke(androidx.compose.runtime.Composer composer2, int i2) {
                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C118@4176L135:AndroidCompositionLocals.android.kt#itgzvw");
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1471621628, i2, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:118)");
                    }
                    androidx.compose.ui.platform.CompositionLocalsKt.ProvideCommonCompositionLocals(androidx.compose.ui.platform.AndroidComposeView.this, androidUriHandler, function2, composer2, 72);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, 56);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4
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

                public final void invoke(androidx.compose.runtime.Composer composer2, int i2) {
                    androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(androidx.compose.ui.platform.AndroidComposeView.this, function2, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final android.content.res.Configuration ProvideAndroidCompositionLocals$lambda$1(androidx.compose.runtime.MutableState<android.content.res.Configuration> mutableState) {
        return mutableState.getValue();
    }

    private static final androidx.compose.ui.res.ImageVectorCache obtainImageVectorCache(final android.content.Context context, android.content.res.Configuration configuration, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-485908294);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(obtainImageVectorCache)P(1)132@4482L31,133@4560L88,136@4669L557,153@5231L224:AndroidCompositionLocals.android.kt#itgzvw");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-485908294, i, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:131)");
        }
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.ui.res.ImageVectorCache();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final androidx.compose.ui.res.ImageVectorCache imageVectorCache = (androidx.compose.ui.res.ImageVectorCache) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        java.lang.Object obj = rememberedValue2;
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            android.content.res.Configuration configuration2 = new android.content.res.Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            composer.updateRememberedValue(configuration2);
            obj = configuration2;
        }
        composer.endReplaceableGroup();
        final android.content.res.Configuration configuration3 = (android.content.res.Configuration) obj;
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new android.content.ComponentCallbacks2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(android.content.res.Configuration configuration4) {
                    imageVectorCache.prune(configuration3.updateFrom(configuration4));
                    configuration3.setTo(configuration4);
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                    imageVectorCache.clear();
                }

                @Override // android.content.ComponentCallbacks2
                public void onTrimMemory(int level) {
                    imageVectorCache.clear();
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        final androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 = (androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1) rememberedValue3;
        androidx.compose.runtime.EffectsKt.DisposableEffect(imageVectorCache, new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                context.getApplicationContext().registerComponentCallbacks(androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1);
                final android.content.Context context2 = context;
                final androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$12 = androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1;
                return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        context2.getApplicationContext().unregisterComponentCallbacks(androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$12);
                    }
                };
            }
        }, composer, 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imageVectorCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Void noLocalProvidedFor(java.lang.String str) {
        throw new java.lang.IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
