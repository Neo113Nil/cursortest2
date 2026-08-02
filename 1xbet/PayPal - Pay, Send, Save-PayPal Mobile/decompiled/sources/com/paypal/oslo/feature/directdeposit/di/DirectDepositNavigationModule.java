package com.paypal.oslo.feature.directdeposit.di;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\r\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\fJ2\u0010\u000f\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\fJ2\u0010\u0010\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/di/DirectDepositNavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideIntroEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lkotlin/jvm/functions/Function1;", "provideFormEntryProviderInstaller", "provideESignatureEntryProviderInstaller", "provideBaseScreenEntryProviderInstaller", "providePdfViewerEntryProviderInstaller"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public final class DirectDepositNavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule INSTANCE = new com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule();

    private DirectDepositNavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideIntroEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.m14681$r8$lambda$NXLT_mvJjNEBJSOkRfeuVLMQsk(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideFormEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.$r8$lambda$2ssrvwawk741aQ9jZ0Lg9r4UTQw(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideESignatureEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.$r8$lambda$_T5KdkJZPm6GsHcvF9J4r3gARpA(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideBaseScreenEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.m14675$r8$lambda$AzE57TUPbqZLTizO6DL7MD5k1Q(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> providePdfViewerEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.m14689$r8$lambda$u0HusIN6Raiqb52nu4OPdRncgo(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$-hvX9QLpvwEu9bMuC6g1zKWx8_U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14673$r8$lambda$hvX9QLpvwEu9bMuC6g1zKWx8_U(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel directDepositPDFViewModel, final android.content.Context context, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(354037197, i, -1, "com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.provideFormEntryProviderInstaller.<anonymous>.<anonymous>.<anonymous> (DirectDepositNavigationModule.kt:92)");
            }
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.$r8$lambda$qpNEP0bnghKqR0XPthn16kTHla4(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changedInstance = composer.changedInstance(directDepositPDFViewModel);
            boolean changed2 = composer.changed(appNavigator);
            boolean changedInstance2 = composer.changedInstance(context);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changedInstance | changed2 | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function4
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                        return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.$r8$lambda$ev4GnfAWlcHODLlX8HQdrKRg2FU(com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel.this, appNavigator, context, (java.lang.String) obj, (java.lang.String) obj2, ((java.lang.Boolean) obj3).booleanValue(), (android.graphics.Bitmap) obj4);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositFormScreenKt.DirectDepositFormScreen(appNavigator, function0, (kotlin.jvm.functions.Function4) rememberedValue2, null, null, composer, 0, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$0Rs-3YSPqWkWuIdJWp3cyrPgc10, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14674$r8$lambda$0Rs3YSPqWkWuIdJWp3cyrPgc10(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel directDepositPDFViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(145918914, i, -1, "com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.provideBaseScreenEntryProviderInstaller.<anonymous>.<anonymous>.<anonymous> (DirectDepositNavigationModule.kt:164)");
            }
            com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseScreenKt.DirectDepositBaseScreen(function0, function02, new com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda21(directDepositPDFViewModel, appNavigator), null, null, composer, 0, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$17wwiDTPJ0XBqLnyqn4hf1PD7uU(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositIntroDestination directDepositIntroDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositIntroDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-607556314, i, -1, "com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.provideIntroEntryProviderInstaller.<anonymous>.<anonymous> (DirectDepositNavigationModule.kt:56)");
        }
        com.paypal.oslo.feature.directdeposit.ui.common.DirectDepositWindowInsetsWrapperKt.DirectDepositWindowInsetsWrapper(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(2030533995, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.m14688$r8$lambda$sF0aCpOy3XVXPlEdbuyihc7N0g(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2ssrvwawk741aQ9jZ0Lg9r4UTQw(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(226152520, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.$r8$lambda$9AgtuY567rUdoTwjkTjtacF7Fc8(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositFormDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositFormDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositFormDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$provideFormEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositFormDestination directDepositFormDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(directDepositFormDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositFormDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$provideFormEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositFormDestination directDepositFormDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6ZFzjL740P4fyS4R0NKoCl5wiN0(com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositPdfViewerDestination directDepositPdfViewerDestination, final com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel directDepositPDFViewModel, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final androidx.view.ComponentActivity componentActivity, final android.content.Context context, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(917586923, i, -1, "com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.providePdfViewerEntryProviderInstaller.<anonymous>.<anonymous>.<anonymous> (DirectDepositNavigationModule.kt:213)");
            }
            java.io.File file = new java.io.File(directDepositPdfViewerDestination.getPdfPath());
            boolean changedInstance = composer.changedInstance(directDepositPDFViewModel);
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.$r8$lambda$XuH4Ujjp0eidKL5XOqNEK_Rh49k(com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel.this, appNavigator);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changedInstance2 = composer.changedInstance(directDepositPDFViewModel);
            boolean changedInstance3 = composer.changedInstance(componentActivity);
            boolean changedInstance4 = composer.changedInstance(context);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changedInstance2 | changedInstance3 | changedInstance4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.$r8$lambda$ZE13r8WKTiHbhAPzsUnAbUN8478(com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel.this, componentActivity, context);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changedInstance5 = composer.changedInstance(directDepositPDFViewModel);
            boolean changedInstance6 = composer.changedInstance(componentActivity);
            boolean changedInstance7 = composer.changedInstance(context);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changedInstance5 | changedInstance6 | changedInstance7) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.m14680$r8$lambda$MZn0MB6cl2JJaDEe0zRofXKOdc(com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel.this, componentActivity, context);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            boolean changedInstance8 = composer.changedInstance(directDepositPDFViewModel);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if (changedInstance8 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.m14686$r8$lambda$hZRAmLw_Vq5gUadLQiw_6qWArM(com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue4;
            boolean changedInstance9 = composer.changedInstance(directDepositPDFViewModel);
            boolean changedInstance10 = composer.changedInstance(context);
            com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$providePdfViewerEntryProviderInstaller$1$1$1$5$1 rememberedValue5 = composer.rememberedValue();
            if ((changedInstance9 | changedInstance10) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$providePdfViewerEntryProviderInstaller$1$1$1$5$1(directDepositPDFViewModel, context, null);
                composer.updateRememberedValue(rememberedValue5);
            }
            com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPdfViewerScreenKt.DirectDepositPdfViewerScreen(file, function0, function02, function03, function04, (kotlin.jvm.functions.Function1) rememberedValue5, null, composer, 0, 64);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8KCQQL_cKqiVVxQWMkNowdsRogI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9AgtuY567rUdoTwjkTjtacF7Fc8(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositFormDestination directDepositFormDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositFormDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(226152520, i, -1, "com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.provideFormEntryProviderInstaller.<anonymous>.<anonymous> (DirectDepositNavigationModule.kt:88)");
        }
        final android.content.Context context = (android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
        java.lang.Object consume = composer.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
        androidx.view.ComponentActivity componentActivity = consume instanceof androidx.view.ComponentActivity ? (androidx.view.ComponentActivity) consume : null;
        if (componentActivity == null) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            return kotlin.Unit.INSTANCE;
        }
        androidx.view.ComponentActivity componentActivity2 = componentActivity;
        final com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel directDepositPDFViewModel = (com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel.class), componentActivity2, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(componentActivity2, composer, 0), componentActivity2 instanceof androidx.view.HasDefaultViewModelProviderFactory ? componentActivity2.getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
        com.paypal.oslo.feature.directdeposit.ui.common.DirectDepositWindowInsetsWrapperKt.DirectDepositWindowInsetsWrapper(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(354037197, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.m14673$r8$lambda$hvX9QLpvwEu9bMuC6g1zKWx8_U(com.paypal.oslo.core.navigation.AppNavigator.this, directDepositPDFViewModel, context, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$AzE57TUPbqZLTizO6DL7-MD5k1Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14675$r8$lambda$AzE57TUPbqZLTizO6DL7MD5k1Q(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.$r8$lambda$Sa85oIdhqBQ9EZJAKUaDJJAfQ84(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        };
        final kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.$r8$lambda$hplnwOQqDVqJ5OG3ze84BW7uW98(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        };
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1802795901, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.$r8$lambda$OxYv1EHJh4LeHzels2TIBQ55GTQ(kotlin.jvm.functions.Function0.this, function02, appNavigator, (com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$provideBaseScreenEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositDestination directDepositDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(directDepositDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$provideBaseScreenEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositDestination directDepositDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1850023075, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.$r8$lambda$hLFUOCaN14Nkmk6jdTkftKg9wbo(kotlin.jvm.functions.Function0.this, function02, appNavigator, (com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositBaseScreenDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositBaseScreenDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositBaseScreenDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$provideBaseScreenEntryProviderInstaller$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositBaseScreenDestination directDepositBaseScreenDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(directDepositBaseScreenDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositBaseScreenDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$provideBaseScreenEntryProviderInstaller$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositBaseScreenDestination directDepositBaseScreenDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map l2Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1881608700, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.$r8$lambda$QMxTRLcZxTXljP4IgN8qhFIXmbk(kotlin.jvm.functions.Function0.this, function02, appNavigator, (com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositSetupInfoDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositSetupInfoDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositSetupInfoDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$provideBaseScreenEntryProviderInstaller$lambda$0$$inlined$entry$default$5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositSetupInfoDestination directDepositSetupInfoDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(directDepositSetupInfoDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositSetupInfoDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$provideBaseScreenEntryProviderInstaller$lambda$0$$inlined$entry$default$6
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositSetupInfoDestination directDepositSetupInfoDestination) {
                return l2Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$B9EyoO-uJpwCW3hu64I2_XNWln8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14676$r8$lambda$B9EyoOuJpwCW3hu64I2_XNWln8(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel directDepositPDFViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1740903064, i, -1, "com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.provideBaseScreenEntryProviderInstaller.<anonymous>.<anonymous>.<anonymous> (DirectDepositNavigationModule.kt:177)");
            }
            com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseScreenKt.DirectDepositBaseScreen(function0, function02, new com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda21(directDepositPDFViewModel, appNavigator), null, null, composer, 0, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$EUzxLcrFCpicR-1G829hnYfJKeM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14677$r8$lambda$EUzxLcrFCpicR1G829hnYfJKeM(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$EcVOXVVCSBMX-1HFruTP2XSsHas, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14678$r8$lambda$EcVOXVVCSBMX1HFruTP2XSsHas(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel directDepositPDFViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-312437609, i, -1, "com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.provideBaseScreenEntryProviderInstaller.<anonymous>.<anonymous>.<anonymous> (DirectDepositNavigationModule.kt:190)");
            }
            com.paypal.oslo.feature.directdeposit.ui.basescreen.DirectDepositBaseScreenKt.DirectDepositBaseScreen(function0, function02, new com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda21(directDepositPDFViewModel, appNavigator), null, null, composer, 0, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Ef-aQGWUxeNQNOPJw9zNXl7I__s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14679$r8$lambda$EfaQGWUxeNQNOPJw9zNXl7I__s(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositFormDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$MZn0MB6cl2JJaDEe0zRo-fXKOdc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14680$r8$lambda$MZn0MB6cl2JJaDEe0zRofXKOdc(com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel directDepositPDFViewModel, androidx.view.ComponentActivity componentActivity, android.content.Context context) {
        directDepositPDFViewModel.trackDDFormReviewDownloadPressed();
        directDepositPDFViewModel.viewPDFDocumentDownload(componentActivity, context);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Mpu5DqLiAQ_jH8KIgNCwOzHjaD4(com.paypal.oslo.feature.directdeposit.ui.form.navigation.result.ESignatureNavResult eSignatureNavResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(eSignatureNavResult);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$NXLT_mvJjNEBJSOkRf-euVLMQsk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14681$r8$lambda$NXLT_mvJjNEBJSOkRfeuVLMQsk(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-607556314, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.$r8$lambda$17wwiDTPJ0XBqLnyqn4hf1PD7uU(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositIntroDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositIntroDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositIntroDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$provideIntroEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositIntroDestination directDepositIntroDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(directDepositIntroDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositIntroDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$provideIntroEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositIntroDestination directDepositIntroDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OxYv1EHJh4LeHzels2TIBQ55GTQ(final kotlin.jvm.functions.Function0 function0, final kotlin.jvm.functions.Function0 function02, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositDestination directDepositDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1802795901, i, -1, "com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.provideBaseScreenEntryProviderInstaller.<anonymous>.<anonymous> (DirectDepositNavigationModule.kt:161)");
        }
        java.lang.Object consume = composer.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
        androidx.view.ComponentActivity componentActivity = consume instanceof androidx.view.ComponentActivity ? (androidx.view.ComponentActivity) consume : null;
        if (componentActivity == null) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            return kotlin.Unit.INSTANCE;
        }
        androidx.view.ComponentActivity componentActivity2 = componentActivity;
        final com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel directDepositPDFViewModel = (com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel.class), componentActivity2, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(componentActivity2, composer, 0), componentActivity2 instanceof androidx.view.HasDefaultViewModelProviderFactory ? componentActivity2.getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
        com.paypal.oslo.feature.directdeposit.ui.common.DirectDepositWindowInsetsWrapperKt.DirectDepositWindowInsetsWrapper(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(145918914, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.m14674$r8$lambda$0Rs3YSPqWkWuIdJWp3cyrPgc10(kotlin.jvm.functions.Function0.this, function02, directDepositPDFViewModel, appNavigator, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$PmtjCWnIj4xVqdo-x_hh-FqOXuU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14682$r8$lambda$PmtjCWnIj4xVqdox_hhFqOXuU(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.$r8$lambda$rJvgmt6HCTxF2kDQhhe4mcxSMD4((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QMxTRLcZxTXljP4IgN8qhFIXmbk(final kotlin.jvm.functions.Function0 function0, final kotlin.jvm.functions.Function0 function02, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositSetupInfoDestination directDepositSetupInfoDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositSetupInfoDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1881608700, i, -1, "com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.provideBaseScreenEntryProviderInstaller.<anonymous>.<anonymous> (DirectDepositNavigationModule.kt:187)");
        }
        java.lang.Object consume = composer.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
        androidx.view.ComponentActivity componentActivity = consume instanceof androidx.view.ComponentActivity ? (androidx.view.ComponentActivity) consume : null;
        if (componentActivity == null) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            return kotlin.Unit.INSTANCE;
        }
        androidx.view.ComponentActivity componentActivity2 = componentActivity;
        final com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel directDepositPDFViewModel = (com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel.class), componentActivity2, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(componentActivity2, composer, 0), componentActivity2 instanceof androidx.view.HasDefaultViewModelProviderFactory ? componentActivity2.getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
        com.paypal.oslo.feature.directdeposit.ui.common.DirectDepositWindowInsetsWrapperKt.DirectDepositWindowInsetsWrapper(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-312437609, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.m14678$r8$lambda$EcVOXVVCSBMX1HFruTP2XSsHas(kotlin.jvm.functions.Function0.this, function02, directDepositPDFViewModel, appNavigator, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QjYxJDaWZqc_IMhi2la1z0OxxFY(com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel directDepositPDFViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        directDepositPDFViewModel.setVbaData(str, str2, str3);
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.m14679$r8$lambda$EfaQGWUxeNQNOPJw9zNXl7I__s((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Sa85oIdhqBQ9EZJAKUaDJJAfQ84(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.$r8$lambda$rF7xV9x9S6EslacYWLZI60yY2YY((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Wh2L_UGgyi0VOhnlU-vD9WfN_vQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14683$r8$lambda$Wh2L_UGgyi0VOhnlUvD9WfN_vQ(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XuH4Ujjp0eidKL5XOqNEK_Rh49k(com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel directDepositPDFViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        directDepositPDFViewModel.trackDDFormReviewScreenDismiss();
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.$r8$lambda$vQw2pp9xupGmdYNplLumTwZEwdU((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZE13r8WKTiHbhAPzsUnAbUN8478(com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel directDepositPDFViewModel, androidx.view.ComponentActivity componentActivity, android.content.Context context) {
        directDepositPDFViewModel.trackDDFormReviewEmailPressed();
        directDepositPDFViewModel.viewPDFDocument(componentActivity, context);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_HtNBQdzzw0opAkm1W02LjtE1BA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        final com.paypal.oslo.feature.directdeposit.ui.form.navigation.result.ESignatureNavResult create = new com.paypal.oslo.feature.directdeposit.ui.form.navigation.result.ESignatureNavResultFactory().create(bitmap);
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.$r8$lambda$Mpu5DqLiAQ_jH8KIgNCwOzHjaD4(com.paypal.oslo.feature.directdeposit.ui.form.navigation.result.ESignatureNavResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_T5KdkJZPm6GsHcvF9J4r3gARpA(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1382995034, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.m14685$r8$lambda$dgUkX2LpwmvMSK8iJ59eZuIU(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositESignatureDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositESignatureDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositESignatureDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$provideESignatureEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositESignatureDestination directDepositESignatureDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(directDepositESignatureDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositESignatureDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$provideESignatureEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositESignatureDestination directDepositESignatureDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$c-J_UmF1xrrDJQvKVG7hVBUKwzo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14684$r8$lambda$cJ_UmF1xrrDJQvKVG7hVBUKwzo(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositPdfViewerDestination directDepositPdfViewerDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositPdfViewerDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2047953062, i, -1, "com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.providePdfViewerEntryProviderInstaller.<anonymous>.<anonymous> (DirectDepositNavigationModule.kt:209)");
        }
        final android.content.Context context = (android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
        java.lang.Object consume = composer.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
        final androidx.view.ComponentActivity componentActivity = consume instanceof androidx.view.ComponentActivity ? (androidx.view.ComponentActivity) consume : null;
        if (componentActivity == null) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            return kotlin.Unit.INSTANCE;
        }
        androidx.view.ComponentActivity componentActivity2 = componentActivity;
        final com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel directDepositPDFViewModel = (com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel.class), componentActivity2, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(componentActivity2, composer, 0), componentActivity2 instanceof androidx.view.HasDefaultViewModelProviderFactory ? componentActivity2.getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
        com.paypal.oslo.feature.directdeposit.ui.common.DirectDepositWindowInsetsWrapperKt.DirectDepositWindowInsetsWrapper(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(917586923, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.$r8$lambda$6ZFzjL740P4fyS4R0NKoCl5wiN0(com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositPdfViewerDestination.this, directDepositPDFViewModel, appNavigator, componentActivity, context, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$dgUkX-2LpwmvMSK8-iJ59-eZuIU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14685$r8$lambda$dgUkX2LpwmvMSK8iJ59eZuIU(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositESignatureDestination directDepositESignatureDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositESignatureDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1382995034, i, -1, "com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.provideESignatureEntryProviderInstaller.<anonymous>.<anonymous> (DirectDepositNavigationModule.kt:124)");
        }
        com.paypal.oslo.feature.directdeposit.ui.common.DirectDepositWindowInsetsWrapperKt.DirectDepositWindowInsetsWrapper(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1038128725, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.$r8$lambda$vdMza9bYGAJN0oQT5zm8Pq2m2Gc(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ev4GnfAWlcHODLlX8HQdrKRg2FU(com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel directDepositPDFViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, final android.content.Context context, final java.lang.String str, java.lang.String str2, boolean z, android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        directDepositPDFViewModel.setFormData(str, str2, z, bitmap);
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.$r8$lambda$gf811DV6JrJuvRHiTHmy6_ePI9w(context, str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gf811DV6JrJuvRHiTHmy6_ePI9w(android.content.Context context, java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        java.lang.String absolutePath = new java.io.File(context.getCacheDir(), com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel.DD_PDF_NAME).getAbsolutePath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        navigationScope.push(new com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositPdfViewerDestination(absolutePath, str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hLFUOCaN14Nkmk6jdTkftKg9wbo(final kotlin.jvm.functions.Function0 function0, final kotlin.jvm.functions.Function0 function02, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositBaseScreenDestination directDepositBaseScreenDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directDepositBaseScreenDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1850023075, i, -1, "com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.provideBaseScreenEntryProviderInstaller.<anonymous>.<anonymous> (DirectDepositNavigationModule.kt:174)");
        }
        java.lang.Object consume = composer.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
        androidx.view.ComponentActivity componentActivity = consume instanceof androidx.view.ComponentActivity ? (androidx.view.ComponentActivity) consume : null;
        if (componentActivity == null) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            return kotlin.Unit.INSTANCE;
        }
        androidx.view.ComponentActivity componentActivity2 = componentActivity;
        final com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel directDepositPDFViewModel = (com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel.class), componentActivity2, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(componentActivity2, composer, 0), componentActivity2 instanceof androidx.view.HasDefaultViewModelProviderFactory ? componentActivity2.getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
        com.paypal.oslo.feature.directdeposit.ui.common.DirectDepositWindowInsetsWrapperKt.DirectDepositWindowInsetsWrapper(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1740903064, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.m14676$r8$lambda$B9EyoOuJpwCW3hu64I2_XNWln8(kotlin.jvm.functions.Function0.this, function02, directDepositPDFViewModel, appNavigator, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hZRAmLw_-Vq5gUadLQiw_6qWArM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14686$r8$lambda$hZRAmLw_Vq5gUadLQiw_6qWArM(com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel directDepositPDFViewModel) {
        directDepositPDFViewModel.trackDDFormReviewScreenShown();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hplnwOQqDVqJ5OG3ze84BW7uW98(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.$r8$lambda$puyBZVdWmS8UfAQOk5aoerK4YAw((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$llQ4G_4vQeIE2Vl8lUjoGEoV6u0(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.m14683$r8$lambda$Wh2L_UGgyi0VOhnlUvD9WfN_vQ((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mjzXKhp-OQ9NYSRZf-Dg6mdSt44, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14687$r8$lambda$mjzXKhpOQ9NYSRZfDg6mdSt44(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.$r8$lambda$8KCQQL_cKqiVVxQWMkNowdsRogI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$puyBZVdWmS8UfAQOk5aoerK4YAw(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.smartroute.api.navigation.SmartRouteDistributionDestination("direct_deposit_summary"));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qpNEP0bnghKqR0XPthn16kTHla4(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.m14677$r8$lambda$EUzxLcrFCpicR1G829hnYfJKeM((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rF7xV9x9S6EslacYWLZI60yY2YY(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rJvgmt6HCTxF2kDQhhe4mcxSMD4(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$sF0aCpOy3XVXPlEdbu-yihc7N0g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14688$r8$lambda$sF0aCpOy3XVXPlEdbuyihc7N0g(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2030533995, i, -1, "com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.provideIntroEntryProviderInstaller.<anonymous>.<anonymous>.<anonymous> (DirectDepositNavigationModule.kt:57)");
            }
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.$r8$lambda$llQ4G_4vQeIE2Vl8lUjoGEoV6u0(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.m14687$r8$lambda$mjzXKhpOQ9NYSRZfDg6mdSt44(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.directdeposit.ui.intro.composable.DirectDepositIntroScreenKt.DirectDepositIntroScreen(null, function0, (kotlin.jvm.functions.Function0) rememberedValue2, composer, 0, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$u0HusIN6Raiqb52nu4-OPdRncgo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14689$r8$lambda$u0HusIN6Raiqb52nu4OPdRncgo(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2047953062, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.m14684$r8$lambda$cJ_UmF1xrrDJQvKVG7hVBUKwzo(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositPdfViewerDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositPdfViewerDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositPdfViewerDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$providePdfViewerEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositPdfViewerDestination directDepositPdfViewerDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(directDepositPdfViewerDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositPdfViewerDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$providePdfViewerEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.directdeposit.api.navigation.DirectDepositPdfViewerDestination directDepositPdfViewerDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vQw2pp9xupGmdYNplLumTwZEwdU(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vdMza9bYGAJN0oQT5zm8Pq2m2Gc(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1038128725, i, -1, "com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.provideESignatureEntryProviderInstaller.<anonymous>.<anonymous>.<anonymous> (DirectDepositNavigationModule.kt:125)");
            }
            boolean changed = composer.changed(appNavigator);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.m14682$r8$lambda$PmtjCWnIj4xVqdox_hhFqOXuU(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changed2 = composer.changed(appNavigator);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.directdeposit.di.DirectDepositNavigationModule.$r8$lambda$_HtNBQdzzw0opAkm1W02LjtE1BA(com.paypal.oslo.core.navigation.AppNavigator.this, (android.graphics.Bitmap) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt.DirectDepositESignatureScreen(null, null, function0, (kotlin.jvm.functions.Function1) rememberedValue2, composer, 0, 3);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
