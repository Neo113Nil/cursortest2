package com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006JE\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/di/StepDocUploadViewComponentAttacher;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/di/DocUploadViewComponentAttacher;", "<init>", "()V", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetState;", "rememberState", "(Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetState;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/domain/DocUploadViewComponentConfig;", "config", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/domain/DocUploadCollectedItem;", "", "onDocumentUpload", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "Landroidx/compose/ui/Modifier;", "modifier", "state", "Attach", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/docupload/domain/DocUploadViewComponentConfig;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetState;Landroidx/compose/runtime/Composer;I)V", "AttachBottomSheet", "(Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetState;Landroidx/compose/runtime/Composer;I)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StepDocUploadViewComponentAttacher implements com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentAttacher {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher INSTANCE = new com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher();

    private StepDocUploadViewComponentAttacher() {
    }

    @Override // com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentAttacher
    public final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState rememberState(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(-1979965024);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1979965024, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher.rememberState (DocUploadViewComponentAttacher.kt:141)");
        }
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState rememberDocUploadWidgetState = com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetKt.rememberDocUploadWidgetState(composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberDocUploadWidgetState;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentAttacher
    public final void Attach(final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadViewComponentConfig docUploadViewComponentConfig, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCollectedItem, kotlin.Unit> function1, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, androidx.compose.ui.Modifier modifier, final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState docUploadWidgetState, androidx.compose.runtime.Composer composer, int i) {
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docUploadViewComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        composer.startReplaceGroup(369568955);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(369568955, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher.Attach (DocUploadViewComponentAttacher.kt:151)");
        }
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0);
        if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
            empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
        } else {
            empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
        }
        final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui.DocUploadViewModel docUploadViewModel = (com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui.DocUploadViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui.DocUploadViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, composer, 0, 0);
        boolean changed = composer.changed(docUploadViewModel);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher.$r8$lambda$ldF9ATvw6_vALVUPI5nqYxVV6x8(com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui.DocUploadViewModel.this, (com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetConfig widgetConfig = com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui.DocUploadViewComponentConfigMapperKt.toWidgetConfig(docUploadViewComponentConfig, (kotlin.jvm.functions.Function3) rememberedValue, intentId);
        if (widgetConfig == null) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
        } else if (docUploadWidgetState == null) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
        } else {
            com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui.DocUploadViewComponentContentKt.DocUploadViewComponentContent(modifier, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(759126733, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher.$r8$lambda$W1JHOrqpsA1FhlcfY6VIz08MFOM(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetConfig.this, docUploadWidgetState, docUploadViewComponentConfig, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, ((i >> 9) & 14) | 48, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
        }
    }

    @Override // com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentAttacher
    public final void AttachBottomSheet(final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState docUploadWidgetState, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-74848135);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(docUploadWidgetState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-74848135, i2, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher.AttachBottomSheet (DocUploadViewComponentAttacher.kt:211)");
            }
            if (docUploadWidgetState == null) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher.m17026$r8$lambda$c3ZzUXVeabE7QVUCJOLHPhNQQ(com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher.this, docUploadWidgetState, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                    endRestartGroup.updateScope(function2);
                }
                return;
            }
            com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetKt.DocUploadWidgetBottomSheet(docUploadWidgetState, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher.$r8$lambda$ZEppj4fXSQVl0vEFBjH8JWQxnW4(com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher.this, docUploadWidgetState, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            };
            endRestartGroup.updateScope(function2);
        }
    }

    /* renamed from: $r8$lambda$6Vx_UTYFVXsxRQwcDkE_lO5-vH0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17025$r8$lambda$6Vx_UTYFVXsxRQwcDkE_lO5vH0(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Error error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.DocUploadViewComponentAttacherKt.handleDocUploadError(error.getDocUploadError());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SU5Kml0BSS21AyzvSvTz5k9ShOs(com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadViewComponentConfig docUploadViewComponentConfig, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Success success) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(success, "");
        function1.invoke(new com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadCollectedItem(docUploadViewComponentConfig.mo16702getIdfHLlpbY(), docUploadViewComponentConfig.getDocumentCategory(), com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui.DocumentTypeMapperKt.toDocUploadDocumentType(success.getDocType()), success.getDocRefId(), (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$W1JHOrqpsA1FhlcfY6VIz08MFOM(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetConfig docUploadWidgetConfig, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState docUploadWidgetState, final com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadViewComponentConfig docUploadViewComponentConfig, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(759126733, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher.Attach.<anonymous> (DocUploadViewComponentAttacher.kt:188)");
            }
            boolean changedInstance = composer.changedInstance(docUploadViewComponentConfig);
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher.$r8$lambda$SU5Kml0BSS21AyzvSvTz5k9ShOs(com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadViewComponentConfig.this, function1, (com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Success) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher.m17025$r8$lambda$6Vx_UTYFVXsxRQwcDkE_lO5vH0((com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Error) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetKt.DocUploadWidget(docUploadWidgetConfig, docUploadWidgetState, null, null, null, function12, (kotlin.jvm.functions.Function1) rememberedValue2, composer, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetConfig.$stable | 1572864, 28);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZEppj4fXSQVl0vEFBjH8JWQxnW4(com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher stepDocUploadViewComponentAttacher, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState docUploadWidgetState, int i, androidx.compose.runtime.Composer composer, int i2) {
        stepDocUploadViewComponentAttacher.AttachBottomSheet(docUploadWidgetState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$c3ZzUX-VeabE7QVUCJ-OLHPhNQQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17026$r8$lambda$c3ZzUXVeabE7QVUCJOLHPhNQQ(com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher stepDocUploadViewComponentAttacher, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState docUploadWidgetState, int i, androidx.compose.runtime.Composer composer, int i2) {
        stepDocUploadViewComponentAttacher.AttachBottomSheet(docUploadWidgetState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$ldF9ATvw6_vALVUPI5nqYxVV6x8(com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui.DocUploadViewModel docUploadViewModel, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentTypeID, "");
        composer.startReplaceGroup(-916464925);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-916464925, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher.Attach.<anonymous>.<anonymous> (DocUploadViewComponentAttacher.kt:156)");
        }
        java.lang.String firstName = docUploadViewModel.getFirstName();
        java.lang.String lastName = docUploadViewModel.getLastName();
        switch (com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.di.StepDocUploadViewComponentAttacher.WhenMappings.$EnumSwitchMapping$0[com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.ui.DocumentTypeMapperKt.toDocUploadDocumentType(documentTypeID).ordinal()]) {
            case 1:
                composer.startReplaceGroup(-254487785);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_drivers_license, new java.lang.Object[]{firstName, lastName}, composer, 0);
                composer.endReplaceGroup();
                break;
            case 2:
                composer.startReplaceGroup(-254482544);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_passport, new java.lang.Object[]{firstName, lastName}, composer, 0);
                composer.endReplaceGroup();
                break;
            case 3:
                composer.startReplaceGroup(-254477367);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_drivers_license_and_id, composer, 0);
                composer.endReplaceGroup();
                break;
            case 4:
                composer.startReplaceGroup(-254472452);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_government_issued_id, new java.lang.Object[]{firstName, lastName}, composer, 0);
                composer.endReplaceGroup();
                break;
            case 5:
                composer.startReplaceGroup(-254467229);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_ssn_itin_generic, composer, 0);
                composer.endReplaceGroup();
                break;
            case 6:
            case 7:
            case 8:
                composer.startReplaceGroup(-254458783);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_utilities_bill, composer, 0);
                composer.endReplaceGroup();
                break;
            default:
                composer.startReplaceGroup(701801786);
                composer.endReplaceGroup();
                stringResource = null;
                break;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return stringResource;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.values().length];
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.DRIVERS_LICENSE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.PASSPORT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.STATE_ID_CARD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.PROOF_OF_ID.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.SSN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.PHONE_BILL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.UTILITIES_BILL.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.docupload.domain.DocUploadDocumentType.PROOF_OF_ADDRESS.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
