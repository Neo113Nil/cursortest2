package com.paypal.oslo.feature.identity.passkey.management.ui;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u001aK\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\fH\u0000\u001a\f\u0010\r\u001a\u00020\u000e*\u00020\u000fH\u0000\u001a\f\u0010\u0010\u001a\u00020\u0011*\u00020\u000fH\u0001\u001a\f\u0010\u0012\u001a\u00020\u0011*\u00020\u000fH\u0001¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002"}, d2 = {"PasskeyManagementScreen", "", "onNavigateUp", "Lkotlin/Function0;", "onNavigateToEnrollment", "onNavigateToList", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyManagementViewModel;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyManagementViewModel;Landroidx/compose/runtime/Composer;II)V", "getActivityContext", "Landroid/content/Context;", "isActionableError", "", "Lcom/paypal/oslo/feature/identity/passkey/management/enrollment/create/domain/model/PasskeyCreateError;", "getErrorHeading", "", "getErrorDescription", "identity_prodRelease", "uiState", "Lcom/paypal/oslo/feature/identity/passkey/management/ui/PasskeyManagementUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PasskeyManagementScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PasskeyManagementScreen(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel passkeyManagementViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel passkeyManagementViewModel2;
        int i4;
        final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel passkeyManagementViewModel3;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel passkeyManagementViewModel4;
        androidx.compose.ui.Modifier modifier4;
        int i5;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel passkeyManagementViewModel5;
        androidx.compose.ui.Modifier modifier5;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-73133966);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function03) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    passkeyManagementViewModel2 = passkeyManagementViewModel;
                    if (startRestartGroup.changedInstance(passkeyManagementViewModel2)) {
                        i6 = 16384;
                        i3 |= i6;
                    }
                } else {
                    passkeyManagementViewModel2 = passkeyManagementViewModel;
                }
                i6 = 8192;
                i3 |= i6;
            } else {
                passkeyManagementViewModel2 = passkeyManagementViewModel;
            }
            i4 = i3;
            if (!startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                    }
                    passkeyManagementViewModel4 = passkeyManagementViewModel2;
                    i5 = i4;
                    modifier4 = modifier2;
                } else {
                    androidx.compose.ui.Modifier modifier6 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) != 0) {
                        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                        }
                        androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                        if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                            empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                        }
                        passkeyManagementViewModel4 = (com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        i5 = i4 & (-57345);
                        modifier4 = modifier6;
                    } else {
                        passkeyManagementViewModel4 = passkeyManagementViewModel2;
                        modifier4 = modifier6;
                        i5 = i4;
                    }
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-73133966, i5, -1, "com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementScreen (PasskeyManagementScreen.kt:56)");
                }
                int i8 = i5;
                final com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel passkeyManagementViewModel6 = passkeyManagementViewModel4;
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(passkeyManagementViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState passkeyManagementUiState = (com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState) collectAsStateWithLifecycle.getValue();
                boolean changed = startRestartGroup.changed(collectAsStateWithLifecycle);
                boolean z = (i8 & 112) == 32;
                boolean z2 = (i8 & 896) == 256;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changed | z | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementScreenKt$PasskeyManagementScreen$1$1(function02, function03, collectAsStateWithLifecycle, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(passkeyManagementUiState, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
                com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState passkeyManagementUiState2 = (com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState) collectAsStateWithLifecycle.getValue();
                if ((passkeyManagementUiState2 instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState.Loading) || (passkeyManagementUiState2 instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState.EmptyState) || (passkeyManagementUiState2 instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState.HasPasskeys)) {
                    passkeyManagementViewModel5 = passkeyManagementViewModel6;
                    modifier5 = modifier4;
                    startRestartGroup.startReplaceGroup(-1184607542);
                    com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyLoadingScreenKt.PasskeyLoadingScreen(function0, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(modifier5, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.identity.passkey.analytics.PasskeyAnalyticsConstants.Management.SCREEN_LOADING, 0, null, null, 14, null)), null, false, startRestartGroup, i8 & 14, 12);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (!(passkeyManagementUiState2 instanceof com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState.LoadError)) {
                        startRestartGroup.startReplaceGroup(-1562240511);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-1184283375);
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_heading_unable_to_load, startRestartGroup, 0);
                    java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_description_unable_to_load, startRestartGroup, 0);
                    java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_manage_passkeys_error_retry, startRestartGroup, 0);
                    boolean changedInstance = startRestartGroup.changedInstance(passkeyManagementViewModel6);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementScreenKt.$r8$lambda$EBzO05Vz2ugqRSZw7TInGPG7mUI(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    passkeyManagementViewModel5 = passkeyManagementViewModel6;
                    com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyErrorScreenKt.PasskeyErrorContent(stringResource, stringResource2, stringResource3, function0, (kotlin.jvm.functions.Function0) rememberedValue2, com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(modifier4, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module(com.paypal.oslo.feature.identity.passkey.analytics.PasskeyAnalyticsConstants.Management.SCREEN_ERROR, 0, null, null, 14, null)), startRestartGroup, (i8 << 9) & 7168, 0);
                    startRestartGroup.endReplaceGroup();
                    modifier5 = modifier4;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
                passkeyManagementViewModel3 = passkeyManagementViewModel5;
            } else {
                startRestartGroup.skipToGroupEnd();
                passkeyManagementViewModel3 = passkeyManagementViewModel2;
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementScreenKt.$r8$lambda$bnfTVFKJMd6h1P4yedJbjsmFgwU(kotlin.jvm.functions.Function0.this, function02, function03, modifier3, passkeyManagementViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        i4 = i3;
        if (!startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final android.content.Context getActivityContext(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof android.app.Activity) {
                return context;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
        }
        throw new java.lang.IllegalStateException("Context is not an Activity context".toString());
    }

    public static final boolean isActionableError(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyCreateError, "");
        if ((passkeyCreateError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.NotEligible) || (passkeyCreateError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.UnsupportedPlatform) || (passkeyCreateError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.SecurityError) || (passkeyCreateError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.MissingData) || (passkeyCreateError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.ValidationError)) {
            return true;
        }
        if (!(passkeyCreateError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.AttestationFailed)) {
            return false;
        }
        com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError passkeyAttestationError = ((com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.AttestationFailed) passkeyCreateError).getPasskeyAttestationError();
        return (passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.UserCancelled) || (passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.UnsupportedPlatform) || (passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.NoCreateOption) || (passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.CredentialAlreadyExists) || (passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.ProviderNotAvailable) || (passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.InvalidState) || (passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.SecurityError) || (passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.ValidationError) || (passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.MissingCredentialId) || (passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.InvalidCredentialType);
    }

    public static final int getErrorHeading(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyCreateError, "");
        if (passkeyCreateError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.NotEligible) {
            return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_heading_not_eligible;
        }
        if (passkeyCreateError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.UnsupportedPlatform) {
            return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_heading_unsupported_platform;
        }
        if (passkeyCreateError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.SecurityError) {
            return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_heading_permission_required;
        }
        if (passkeyCreateError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.MissingData) {
            return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_heading_missing_info;
        }
        if (passkeyCreateError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.ValidationError) {
            return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_heading_invalid_info;
        }
        if (passkeyCreateError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.AttestationFailed) {
            com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError passkeyAttestationError = ((com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.AttestationFailed) passkeyCreateError).getPasskeyAttestationError();
            if (passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.UserCancelled) {
                return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_heading_setup_cancelled;
            }
            if (passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.UnsupportedPlatform) {
                return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_heading_unsupported;
            }
            if (!(passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.NoCreateOption) && !(passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.CredentialAlreadyExists)) {
                if (passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.ProviderNotAvailable) {
                    return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_heading_provider_not_setup;
                }
                if (passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.InvalidState) {
                    return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_heading_unable_to_create;
                }
                if (passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.SecurityError) {
                    return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_heading_permission_required;
                }
                if (passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.ValidationError) {
                    return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_heading_invalid_info;
                }
                if (!(passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.MissingCredentialId) && !(passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.InvalidCredentialType)) {
                    return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_heading_unable_to_add;
                }
                return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_heading_creation_failed;
            }
            return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_exists_title;
        }
        return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_heading_unable_to_add;
    }

    public static final int getErrorDescription(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyCreateError, "");
        if (passkeyCreateError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.NotEligible) {
            return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_description;
        }
        if (passkeyCreateError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.UnsupportedPlatform) {
            return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_description_unsupported_platform;
        }
        if (passkeyCreateError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.SecurityError) {
            return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_description_permission_required;
        }
        if (passkeyCreateError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.MissingData) {
            return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_description_missing_data;
        }
        if (passkeyCreateError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.ValidationError) {
            return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_description_invalid_info;
        }
        if (passkeyCreateError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.AttestationFailed) {
            com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError passkeyAttestationError = ((com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError.AttestationFailed) passkeyCreateError).getPasskeyAttestationError();
            if (passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.UserCancelled) {
                return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_description_setup_cancelled;
            }
            if (passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.UnsupportedPlatform) {
                return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_description_device_unsupported;
            }
            if (!(passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.NoCreateOption) && !(passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.CredentialAlreadyExists)) {
                if (passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.ProviderNotAvailable) {
                    return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_description_provider_not_setup;
                }
                if (passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.InvalidState) {
                    return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_description_complete_previous_steps;
                }
                if (passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.SecurityError) {
                    return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_description_permission_required;
                }
                if (passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.ValidationError) {
                    return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_description_invalid_info;
                }
                if (!(passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.MissingCredentialId) && !(passkeyAttestationError instanceof com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.domain.model.PasskeyAttestationError.InvalidCredentialType)) {
                    return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_description_unable_to_add;
                }
                return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_description_creation_failed;
            }
            return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_exists_description;
        }
        return com.paypal.oslo.feature.identity.R.string.feature_identity_passkey_error_description_unable_to_add;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EBzO05Vz2ugqRSZw7TInGPG7mUI(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel passkeyManagementViewModel) {
        passkeyManagementViewModel.onEvent(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementEvent.RetryLoad.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bnfTVFKJMd6h1P4yedJbjsmFgwU(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementViewModel passkeyManagementViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PasskeyManagementScreen(function0, function02, function03, modifier, passkeyManagementViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState access$PasskeyManagementScreen$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyManagementUiState) state.getValue();
    }
}
