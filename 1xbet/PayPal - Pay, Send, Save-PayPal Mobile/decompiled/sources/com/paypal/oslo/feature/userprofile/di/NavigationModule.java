package com.paypal.oslo.feature.userprofile.di;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\u0013\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000f\u0012\u0004\u0012\u00020\u00100\u000ej\u0002`\u0011¢\u0006\u0002\b\u00122\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/di/NavigationModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/userprofile/config/UserProfileConfig;", "config", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEntryProviderInstaller", "(Landroid/content/Context;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/userprofile/config/UserProfileConfig;Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;Lcom/paypal/oslo/core/userstore/UserStore;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.userprofile.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.userprofile.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(@dagger.hilt.android.qualifiers.ApplicationContext final android.content.Context context, final com.paypal.oslo.core.navigation.AppNavigator navigator, final com.paypal.oslo.feature.userprofile.config.UserProfileConfig config, final com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, final com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$1BdFHqo8iM10ps2oa_rlg0Wlmfs(context, navigator, config, featureGate, userStore, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$-msRgOCrKpjaPOorNwGPS3q17O8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20446$r8$lambda$msRgOCrKpjaPOorNwGPS3q17O8(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.userprofile.api.navigation.UpdatePhotoDestination updatePhotoDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePhotoDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1008514574, i, -1, "com.paypal.oslo.feature.userprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:388)");
        }
        com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt.ProfilePhotoOptionsScreen(appNavigator, userStore, null, null, null, composer, 0, 28);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$0XxnpxL7KzeP8VdkOTuVT-EZTVM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20447$r8$lambda$0XxnpxL7KzeP8VdkOTuVTEZTVM(com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        photoUploadViewModel.handleAction(com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.Reset.INSTANCE);
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$Qlo97TWcc3_wLnb_lLw8uIdY4xk((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1BdFHqo8iM10ps2oa_rlg0Wlmfs(final android.content.Context context, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.userprofile.config.UserProfileConfig userProfileConfig, final com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, final com.paypal.oslo.core.userstore.UserStore userStore, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_name_management_title), false, null, null, false, null, null, false, 509, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1698317174, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$CPlob_Z_ZCIAroqc4SSVtnlZHT8(com.paypal.oslo.core.navigation.AppNavigator.this, userProfileConfig, featureGate, (com.paypal.oslo.feature.userprofile.api.navigation.UpdateNameDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.UpdateNameDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.UpdateNameDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.UpdateNameDestination updateNameDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(updateNameDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.UpdateNameDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.userprofile.api.navigation.UpdateNameDestination updateNameDestination) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_emails_title), false, null, null, true, null, null, false, 473, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1894375597, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.m20448$r8$lambda$2RDiRuPpANbIsPj4znFReu98s(com.paypal.oslo.core.navigation.AppNavigator.this, userProfileConfig, featureGate, (com.paypal.oslo.feature.userprofile.api.navigation.AllEmailsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.AllEmailsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.AllEmailsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.AllEmailsDestination allEmailsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(allEmailsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.AllEmailsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.userprofile.api.navigation.AllEmailsDestination allEmailsDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map bottomSheetMetadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, true, true, null, null, null, 115, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1630714132, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$oUDmaFm4tqbWvGYVKyfbitbZhfc(com.paypal.oslo.core.navigation.AppNavigator.this, userStore, (com.paypal.oslo.feature.userprofile.api.navigation.EmailOptionsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.EmailOptionsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.EmailOptionsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.EmailOptionsDestination emailOptionsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(emailOptionsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.EmailOptionsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$6
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.userprofile.api.navigation.EmailOptionsDestination emailOptionsDestination) {
                return bottomSheetMetadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        final java.util.Map bottomSheetMetadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, true, true, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$RaQsWNInHMfGcjpkj4JYeXZQovM(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, null, 81, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(72711172, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$2XxWyNzOXj0aYXzJcW9lJ4uFUy4(com.paypal.oslo.core.navigation.AppNavigator.this, userStore, (com.paypal.oslo.feature.userprofile.api.navigation.DeleteEmailDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.DeleteEmailDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.DeleteEmailDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.DeleteEmailDestination deleteEmailDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(deleteEmailDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.DeleteEmailDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$8
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.userprofile.api.navigation.DeleteEmailDestination deleteEmailDestination) {
                return bottomSheetMetadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance4);
        final java.util.Map bottomSheetMetadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, true, true, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.m20457$r8$lambda$zeoxCZLGsj4Khl16ljUxsoEAHY(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, null, 81, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance5 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(404599982, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$Pl8z4xXhetewAIKLoXdA3QrGsmg(com.paypal.oslo.core.navigation.AppNavigator.this, userStore, (com.paypal.oslo.feature.userprofile.api.navigation.SetPrimaryEmailDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.SetPrimaryEmailDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.SetPrimaryEmailDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.SetPrimaryEmailDestination setPrimaryEmailDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(setPrimaryEmailDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.SetPrimaryEmailDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$10
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.userprofile.api.navigation.SetPrimaryEmailDestination setPrimaryEmailDestination) {
                return bottomSheetMetadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance5);
        final java.util.Map l3Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_add_email_title), false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-2105610398, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.m20453$r8$lambda$TMOc2Fvk0MiegiTwfKIn65Sn4(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.userprofile.api.navigation.AddEmailDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.AddEmailDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.AddEmailDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.AddEmailDestination addEmailDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(addEmailDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.AddEmailDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$12
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.userprofile.api.navigation.AddEmailDestination addEmailDestination) {
                return l3Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance6);
        final java.util.Map l3Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_update_primary_email_title), false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance7 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1031292310, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$CUqC4jg1VnLWpgqy3ULSy_DXv9E(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.userprofile.api.navigation.EditPrimaryEmailDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.EditPrimaryEmailDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.EditPrimaryEmailDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.EditPrimaryEmailDestination editPrimaryEmailDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(editPrimaryEmailDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.EditPrimaryEmailDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$14
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.userprofile.api.navigation.EditPrimaryEmailDestination editPrimaryEmailDestination) {
                return l3Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance7);
        final java.util.Map l3Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_update_email_title), false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance8 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(413573313, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.m20454$r8$lambda$bsMbXUyJyEYhZhnHWNFQHGlNMw(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.userprofile.api.navigation.EditEmailDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.EditEmailDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.EditEmailDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.EditEmailDestination editEmailDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(editEmailDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.EditEmailDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$16
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.userprofile.api.navigation.EditEmailDestination editEmailDestination) {
                return l3Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance8);
        final java.util.Map l3Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance9 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-453799521, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.m20450$r8$lambda$FOozP65oTZktVk5ylhB0_tA_30(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.userprofile.api.navigation.EmailConfirmationDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.EmailConfirmationDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.EmailConfirmationDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.EmailConfirmationDestination emailConfirmationDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(emailConfirmationDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.EmailConfirmationDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$18
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.userprofile.api.navigation.EmailConfirmationDestination emailConfirmationDestination) {
                return l3Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance9);
        final java.util.Map l2Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_phone_numbers), false, null, null, true, null, null, false, 473, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance10 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-276563437, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$XdyGaWIjZbOXaSpZiwRpkvVFJNA(com.paypal.oslo.core.navigation.AppNavigator.this, userProfileConfig, featureGate, (com.paypal.oslo.feature.userprofile.api.navigation.AllPhonesDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.AllPhonesDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.AllPhonesDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$19
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.AllPhonesDestination allPhonesDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(allPhonesDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.AllPhonesDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$20
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.userprofile.api.navigation.AllPhonesDestination allPhonesDestination) {
                return l2Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance10);
        final java.util.Map l2Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, java.lang.Integer.valueOf(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_addresses_title), false, null, null, true, null, null, false, 473, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance11 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1585070958, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$YVmypvS1V0BEsCm5TduAY1AcsHc(com.paypal.oslo.core.navigation.AppNavigator.this, userProfileConfig, featureGate, (com.paypal.oslo.feature.userprofile.api.navigation.AllAddressDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.AllAddressDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.AllAddressDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$21
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.AllAddressDestination allAddressDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(allAddressDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.AllAddressDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$22
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.userprofile.api.navigation.AllAddressDestination allAddressDestination) {
                return l2Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance11);
        final java.util.Map l3Metadata$default5 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, true, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance12 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-32544755, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$s8jxK_Ju4wvGA1DG1Te7laYslsg(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.userprofile.api.navigation.AddAddressDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.AddAddressDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.AddAddressDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$23
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.AddAddressDestination addAddressDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(addAddressDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.AddAddressDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$24
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.userprofile.api.navigation.AddAddressDestination addAddressDestination) {
                return l3Metadata$default5;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance12);
        final java.util.Map l3Metadata$default6 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance13 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-510074638, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$lyJJJnz3un27v9cU6Tmup70Jkqw(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.userprofile.api.navigation.AddPhoneDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.AddPhoneDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.AddPhoneDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$25
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.AddPhoneDestination addPhoneDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(addPhoneDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.AddPhoneDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$26
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.userprofile.api.navigation.AddPhoneDestination addPhoneDestination) {
                return l3Metadata$default6;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance13);
        final java.util.Map l3Metadata$default7 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance14 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1457232752, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$dydgwQYmgpu1KoSRlhngtIe9UdA(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.userprofile.api.navigation.EditPhoneDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.EditPhoneDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.EditPhoneDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$27
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.EditPhoneDestination editPhoneDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(editPhoneDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.EditPhoneDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$28
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.userprofile.api.navigation.EditPhoneDestination editPhoneDestination) {
                return l3Metadata$default7;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance14);
        final java.util.Map l3Metadata$default8 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance15 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-2048299377, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$ILuYqJ5oMs3qQDyRMynBWhjjQVM(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.userprofile.api.navigation.ConfirmPhoneDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.ConfirmPhoneDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.ConfirmPhoneDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$29
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.ConfirmPhoneDestination confirmPhoneDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(confirmPhoneDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.ConfirmPhoneDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$30
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.userprofile.api.navigation.ConfirmPhoneDestination confirmPhoneDestination) {
                return l3Metadata$default8;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance15);
        final java.util.Map l3Metadata$default9 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance16 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2063443431, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$4kg16ad9ZLe47DOsvi0_3Y3wJec(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.userprofile.api.navigation.UpdatePrimaryPhoneDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.UpdatePrimaryPhoneDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.UpdatePrimaryPhoneDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$31
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.UpdatePrimaryPhoneDestination updatePrimaryPhoneDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(updatePrimaryPhoneDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.UpdatePrimaryPhoneDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$32
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.userprofile.api.navigation.UpdatePrimaryPhoneDestination updatePrimaryPhoneDestination) {
                return l3Metadata$default9;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance16);
        final java.util.Map bottomSheetMetadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, true, false, null, null, null, 115, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance17 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-401154414, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.m20452$r8$lambda$SeTPaGwI8EBs1jooXqYeXfOyKQ(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.userprofile.api.navigation.ConfirmationBottomSheetDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.ConfirmationBottomSheetDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.ConfirmationBottomSheetDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$33
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.ConfirmationBottomSheetDestination confirmationBottomSheetDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(confirmationBottomSheetDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.ConfirmationBottomSheetDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$34
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.userprofile.api.navigation.ConfirmationBottomSheetDestination confirmationBottomSheetDestination) {
                return bottomSheetMetadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance17);
        final java.util.Map bottomSheetMetadata$default5 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, true, true, null, null, null, 115, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance18 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1049243414, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$n_2vdM8E3fCAAxrElnee4m_Od8U(com.paypal.oslo.core.navigation.AppNavigator.this, userStore, (com.paypal.oslo.feature.userprofile.api.navigation.PhoneOptionsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.PhoneOptionsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.PhoneOptionsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$35
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.PhoneOptionsDestination phoneOptionsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(phoneOptionsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.PhoneOptionsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$36
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.userprofile.api.navigation.PhoneOptionsDestination phoneOptionsDestination) {
                return bottomSheetMetadata$default5;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance18);
        final java.util.Map bottomSheetMetadata$default6 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, true, true, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$Uu_I7cnuy4Bn1sQ0oet3QU1TbhM(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, null, 81, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance19 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1037703476, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$Cz3D8qRPB5NZv4IqGpjAy2YGYog(com.paypal.oslo.core.navigation.AppNavigator.this, userStore, (com.paypal.oslo.feature.userprofile.api.navigation.DeletePhoneDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.DeletePhoneDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.DeletePhoneDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$37
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.DeletePhoneDestination deletePhoneDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(deletePhoneDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.DeletePhoneDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$38
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.userprofile.api.navigation.DeletePhoneDestination deletePhoneDestination) {
                return bottomSheetMetadata$default6;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance19);
        final java.util.Map bottomSheetMetadata$default7 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, true, true, null, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$KdBkbrMyAJd5uDj093HEyVX5TAg(com.paypal.oslo.core.navigation.AppNavigator.this);
            }
        }, null, 81, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance20 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(583733918, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$Hf7XHxqv18UtdcdyDIiRuZkOT8Y(com.paypal.oslo.core.navigation.AppNavigator.this, userStore, (com.paypal.oslo.feature.userprofile.api.navigation.MakePrimaryPhoneDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.MakePrimaryPhoneDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.MakePrimaryPhoneDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$39
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.MakePrimaryPhoneDestination makePrimaryPhoneDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(makePrimaryPhoneDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.MakePrimaryPhoneDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$40
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.userprofile.api.navigation.MakePrimaryPhoneDestination makePrimaryPhoneDestination) {
                return bottomSheetMetadata$default7;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance20);
        final java.util.Map l2Metadata$default5 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, true, null, null, false, 473, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance21 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-865533077, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$v3LD5izrHZuW8Q8HQRe1olpAnOU(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.userprofile.api.navigation.FullScreenErrorDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.FullScreenErrorDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.FullScreenErrorDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$41
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.FullScreenErrorDestination fullScreenErrorDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(fullScreenErrorDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.FullScreenErrorDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$42
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.userprofile.api.navigation.FullScreenErrorDestination fullScreenErrorDestination) {
                return l2Metadata$default5;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance21);
        final java.util.Map bottomSheetMetadata$default8 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, true, true, null, null, null, 114, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance22 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1008514574, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.m20446$r8$lambda$msRgOCrKpjaPOorNwGPS3q17O8(com.paypal.oslo.core.navigation.AppNavigator.this, userStore, (com.paypal.oslo.feature.userprofile.api.navigation.UpdatePhotoDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.UpdatePhotoDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.UpdatePhotoDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$43
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.UpdatePhotoDestination updatePhotoDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(updatePhotoDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.UpdatePhotoDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$44
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.userprofile.api.navigation.UpdatePhotoDestination updatePhotoDestination) {
                return bottomSheetMetadata$default8;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance22);
        final java.util.Map bottomSheetMetadata$default9 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_change_photo_title), false, true, false, null, null, null, 114, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance23 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2011043009, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$3gerxdfgIy9xeFkQT3mrq3mZiTo(com.paypal.oslo.core.navigation.AppNavigator.this, userStore, (com.paypal.oslo.feature.userprofile.api.navigation.ProfilePhotoOptionsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.ProfilePhotoOptionsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.ProfilePhotoOptionsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$45
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.ProfilePhotoOptionsDestination profilePhotoOptionsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(profilePhotoOptionsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.ProfilePhotoOptionsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$46
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.userprofile.api.navigation.ProfilePhotoOptionsDestination profilePhotoOptionsDestination) {
                return bottomSheetMetadata$default9;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance23);
        final java.util.Map bottomSheetMetadata$default10 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, false, false, null, null, null, 115, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance24 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1852436743, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.m20451$r8$lambda$L58dOJwPyTD5K8NXYFR10jekBc(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.userprofile.api.navigation.DeletePhotoConfirmationDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.DeletePhotoConfirmationDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.DeletePhotoConfirmationDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$47
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.DeletePhotoConfirmationDestination deletePhotoConfirmationDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(deletePhotoConfirmationDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.DeletePhotoConfirmationDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$48
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.userprofile.api.navigation.DeletePhotoConfirmationDestination deletePhotoConfirmationDestination) {
                return bottomSheetMetadata$default10;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance24);
        final java.util.Map bottomSheetMetadata$default11 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, false, false, null, null, null, 115, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance25 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(48493622, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$Wug9dLap1b3QkQtV5KmSGpxQCxQ(context, appNavigator, (com.paypal.oslo.feature.userprofile.api.navigation.UgcmErrorBottomSheetDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.UgcmErrorBottomSheetDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.UgcmErrorBottomSheetDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$49
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.UgcmErrorBottomSheetDestination ugcmErrorBottomSheetDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(ugcmErrorBottomSheetDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.UgcmErrorBottomSheetDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$50
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.userprofile.api.navigation.UgcmErrorBottomSheetDestination ugcmErrorBottomSheetDestination) {
                return bottomSheetMetadata$default11;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance25);
        final java.util.Map l3Metadata$default10 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l3Metadata$default(false, null, false, null, null, false, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance26 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1075692030, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$tMD55REnRexpikZ55AbKyDmMVP8(com.paypal.oslo.core.userstore.UserStore.this, appNavigator, (com.paypal.oslo.feature.userprofile.api.navigation.UserProfileWebViewDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.UserProfileWebViewDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.UserProfileWebViewDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$51
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.UserProfileWebViewDestination userProfileWebViewDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(userProfileWebViewDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.userprofile.api.navigation.UserProfileWebViewDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$52
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.userprofile.api.navigation.UserProfileWebViewDestination userProfileWebViewDestination) {
                return l3Metadata$default10;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance26);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1QrLmKvZ3y3jqPno2TO6iTCcSsE(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$2RDiRuPpANbIsPj4znFRe-u-98s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20448$r8$lambda$2RDiRuPpANbIsPj4znFReu98s(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.config.UserProfileConfig userProfileConfig, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.userprofile.api.navigation.AllEmailsDestination allEmailsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allEmailsDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1894375597, i, -1, "com.paypal.oslo.feature.userprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:126)");
        }
        com.paypal.oslo.feature.userprofile.ui.screens.email.AllEmailsScreenKt.AllEmailsScreen(appNavigator, userProfileConfig, featureGate, null, null, composer, 0, 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2XxWyNzOXj0aYXzJcW9lJ4uFUy4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.userprofile.api.navigation.DeleteEmailDestination deleteEmailDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteEmailDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(72711172, i, -1, "com.paypal.oslo.feature.userprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:151)");
        }
        com.paypal.oslo.feature.userprofile.ui.screens.email.DeleteEmailScreenKt.DeleteEmailScreen(deleteEmailDestination.getEmailId(), appNavigator, userStore, null, null, composer, 0, 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3gerxdfgIy9xeFkQT3mrq3mZiTo(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.userprofile.api.navigation.ProfilePhotoOptionsDestination profilePhotoOptionsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profilePhotoOptionsDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2011043009, i, -1, "com.paypal.oslo.feature.userprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:397)");
        }
        com.paypal.oslo.feature.userprofile.ui.screens.photo.ProfilePhotoOptionsScreenKt.ProfilePhotoOptionsScreen(appNavigator, userStore, null, null, null, composer, 0, 28);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$4RMJFOi8LFDXcW_aWwWpjqX-oHg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20449$r8$lambda$4RMJFOi8LFDXcW_aWwWpjqXoHg(com.paypal.oslo.core.userstore.model.ProfileAddress profileAddress, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.userprofile.api.navigation.result.AddressSavedNavResult(profileAddress));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4kg16ad9ZLe47DOsvi0_3Y3wJec(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.api.navigation.UpdatePrimaryPhoneDestination updatePrimaryPhoneDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePrimaryPhoneDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2063443431, i, -1, "com.paypal.oslo.feature.userprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:303)");
        }
        com.paypal.oslo.feature.userprofile.ui.screens.phone.UpdatePrimaryScreenKt.UpdatePrimaryScreen(updatePrimaryPhoneDestination.getPhoneId(), appNavigator, null, null, composer, 0, 12);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9BzwJtF4QB4lIpCMLTUeaJxDPUM(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.popTo(com.paypal.oslo.feature.settings.api.navigation.SettingsDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CPlob_Z_ZCIAroqc4SSVtnlZHT8(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.config.UserProfileConfig userProfileConfig, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.userprofile.api.navigation.UpdateNameDestination updateNameDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateNameDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1698317174, i, -1, "com.paypal.oslo.feature.userprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:117)");
        }
        com.paypal.oslo.feature.userprofile.ui.screens.name.UpdateNameScreenKt.UpdateNameScreen(appNavigator, userProfileConfig, featureGate, null, composer, 0, 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CUqC4jg1VnLWpgqy3ULSy_DXv9E(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.api.navigation.EditPrimaryEmailDestination editPrimaryEmailDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editPrimaryEmailDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1031292310, i, -1, "com.paypal.oslo.feature.userprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:191)");
        }
        com.paypal.oslo.feature.userprofile.ui.screens.email.AddEditEmailScreenKt.AddEditEmailScreen(appNavigator, editPrimaryEmailDestination.getEmailId(), null, composer, 0, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Cz3D8qRPB5NZv4IqGpjAy2YGYog(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.userprofile.api.navigation.DeletePhoneDestination deletePhoneDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deletePhoneDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1037703476, i, -1, "com.paypal.oslo.feature.userprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:344)");
        }
        com.paypal.oslo.feature.userprofile.ui.screens.phone.DeletePhoneScreenKt.DeletePhoneScreen(deletePhoneDestination.getPhoneId(), appNavigator, userStore, null, null, composer, 0, 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$FOozP65oTZktVk-5ylhB0_tA_30, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20450$r8$lambda$FOozP65oTZktVk5ylhB0_tA_30(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.api.navigation.EmailConfirmationDestination emailConfirmationDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailConfirmationDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-453799521, i, -1, "com.paypal.oslo.feature.userprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:215)");
        }
        com.paypal.oslo.feature.userprofile.ui.screens.email.ConfirmEmailScreenKt.ConfirmEmailScreen(emailConfirmationDestination.getEmailAddress(), emailConfirmationDestination.getEmailId(), emailConfirmationDestination.getMakePrimary(), appNavigator, emailConfirmationDestination.getReplaceId(), null, composer, 0, 32);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Hf7XHxqv18UtdcdyDIiRuZkOT8Y(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.userprofile.api.navigation.MakePrimaryPhoneDestination makePrimaryPhoneDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(makePrimaryPhoneDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(583733918, i, -1, "com.paypal.oslo.feature.userprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:361)");
        }
        com.paypal.oslo.feature.userprofile.ui.screens.phone.MakePrimaryPhoneScreenKt.MakePrimaryPhoneScreen(makePrimaryPhoneDestination.getPhoneId(), appNavigator, userStore, null, null, composer, 0, 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ILuYqJ5oMs3qQDyRMynBWhjjQVM(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.api.navigation.ConfirmPhoneDestination confirmPhoneDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmPhoneDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2048299377, i, -1, "com.paypal.oslo.feature.userprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:291)");
        }
        com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt.ConfirmPhoneScreen(confirmPhoneDestination.getPhoneId(), confirmPhoneDestination.getMaskedPhoneNumber(), appNavigator, null, composer, 0, 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KdBkbrMyAJd5uDj093HEyVX5TAg(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$VV6uKeTJ9KKPQGu84REFqQZRCME((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$L58dOJwPyT-D5K8NXYFR10jekBc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20451$r8$lambda$L58dOJwPyTD5K8NXYFR10jekBc(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.api.navigation.DeletePhotoConfirmationDestination deletePhotoConfirmationDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deletePhotoConfirmationDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1852436743, i, -1, "com.paypal.oslo.feature.userprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:402)");
        }
        com.paypal.oslo.feature.userprofile.ui.screens.photo.DeletePhotoConfirmationBottomSheetKt.DeletePhotoConfirmationScreen(appNavigator, null, null, composer, 0, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Pl8z4xXhetewAIKLoXdA3QrGsmg(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.userprofile.api.navigation.SetPrimaryEmailDestination setPrimaryEmailDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setPrimaryEmailDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(404599982, i, -1, "com.paypal.oslo.feature.userprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:168)");
        }
        com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt.MakePrimaryEmailScreen(setPrimaryEmailDestination.getEmailId(), setPrimaryEmailDestination.getConfirm(), appNavigator, userStore, null, null, composer, 0, 48);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Qlo97TWcc3_wLnb_lLw8uIdY4xk(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RaQsWNInHMfGcjpkj4JYeXZQovM(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$1QrLmKvZ3y3jqPno2TO6iTCcSsE((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$SeTPaGwI8EBs1jo-oXqYeXfOyKQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20452$r8$lambda$SeTPaGwI8EBs1jooXqYeXfOyKQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.api.navigation.ConfirmationBottomSheetDestination confirmationBottomSheetDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmationBottomSheetDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-401154414, i, -1, "com.paypal.oslo.feature.userprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:315)");
        }
        com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationBottomSheetWrapperKt.ConfirmationBottomSheetWrapper(confirmationBottomSheetDestination, appNavigator, null, null, composer, i & 14, 12);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$TMOc-2Fvk0MiegiTwfKIn65S-n4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20453$r8$lambda$TMOc2Fvk0MiegiTwfKIn65Sn4(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.api.navigation.AddEmailDestination addEmailDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addEmailDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2105610398, i, -1, "com.paypal.oslo.feature.userprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:181)");
        }
        com.paypal.oslo.feature.userprofile.ui.screens.email.AddEditEmailScreenKt.AddEditEmailScreen(appNavigator, null, null, composer, 0, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Uu_I7cnuy4Bn1sQ0oet3QU1TbhM(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.m20455$r8$lambda$tLFNBKb1AxvkOoQH_dtoyy54s((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VV6uKeTJ9KKPQGu84REFqQZRCME(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Wug9dLap1b3QkQtV5KmSGpxQCxQ(android.content.Context context, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.api.navigation.UgcmErrorBottomSheetDestination ugcmErrorBottomSheetDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ugcmErrorBottomSheetDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(48493622, i, -1, "com.paypal.oslo.feature.userprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:408)");
        }
        java.lang.Object consume = composer.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
        kotlin.jvm.internal.Intrinsics.checkNotNull(consume, "");
        androidx.view.ComponentActivity componentActivity = (androidx.view.ComponentActivity) consume;
        final com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel = (com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel.class), componentActivity, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(componentActivity, composer, 0), componentActivity instanceof androidx.view.HasDefaultViewModelProviderFactory ? componentActivity.getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
        com.paypal.pds.core.Icon.Alert alert = com.paypal.pds.core.Icon.Alert.INSTANCE;
        java.lang.String string = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_ugcm_csam_title);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_ugcm_csam_subtitle);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.String string3 = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_ugcm_csam_button);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
        boolean changedInstance = composer.changedInstance(photoUploadViewModel);
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.userprofile.di.NavigationModule.m20447$r8$lambda$0XxnpxL7KzeP8VdkOTuVTEZTVM(com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel.this, appNavigator);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.userprofile.ui.components.common.GenericErrorHalfSheetKt.GenericErrorHalfSheet(alert, string, string2, string3, (kotlin.jvm.functions.Function0) rememberedValue, "ugcm_error_button", "ugcm_error_bottom_sheet", null, composer, 1769478, 128);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XdyGaWIjZbOXaSpZiwRpkvVFJNA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.config.UserProfileConfig userProfileConfig, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.userprofile.api.navigation.AllPhonesDestination allPhonesDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allPhonesDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-276563437, i, -1, "com.paypal.oslo.feature.userprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:230)");
        }
        com.paypal.oslo.feature.userprofile.ui.screens.phone.AllPhonesScreenKt.AllPhonesScreen(appNavigator, userProfileConfig, featureGate, null, null, composer, 0, 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YVmypvS1V0BEsCm5TduAY1AcsHc(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.config.UserProfileConfig userProfileConfig, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.userprofile.api.navigation.AllAddressDestination allAddressDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allAddressDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1585070958, i, -1, "com.paypal.oslo.feature.userprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:239)");
        }
        com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt.AllAddressesScreen(appNavigator, userProfileConfig, featureGate, null, null, composer, 0, 24);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bsMbXUyJyEYhZhn-HWNFQHGlNMw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20454$r8$lambda$bsMbXUyJyEYhZhnHWNFQHGlNMw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.api.navigation.EditEmailDestination editEmailDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editEmailDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(413573313, i, -1, "com.paypal.oslo.feature.userprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:202)");
        }
        com.paypal.oslo.feature.userprofile.ui.screens.email.AddEditEmailScreenKt.AddEditEmailScreen(appNavigator, editEmailDestination.getEmailId(), null, composer, 0, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dydgwQYmgpu1KoSRlhngtIe9UdA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.api.navigation.EditPhoneDestination editPhoneDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(editPhoneDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1457232752, i, -1, "com.paypal.oslo.feature.userprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:280)");
        }
        com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt.AddEditPhoneScreen(appNavigator, editPhoneDestination.getPhoneId(), null, null, composer, 0, 12);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hUiqlzjJFMpovPuwNP7hlCx_BbU(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$9BzwJtF4QB4lIpCMLTUeaJxDPUM((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jdGa3P1U7TOlvMQjo2HiO6t48_M(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.core.userstore.model.ProfileAddress profileAddress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileAddress, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Address saved", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("savedAddress", profileAddress)), null, 4, null);
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.m20449$r8$lambda$4RMJFOi8LFDXcW_aWwWpjqXoHg(com.paypal.oslo.core.userstore.model.ProfileAddress.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lyJJJnz3un27v9cU6Tmup70Jkqw(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.api.navigation.AddPhoneDestination addPhoneDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addPhoneDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-510074638, i, -1, "com.paypal.oslo.feature.userprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:269)");
        }
        com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt.AddEditPhoneScreen(appNavigator, null, addPhoneDestination.getInitialCategory(), null, composer, 0, 10);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$n_2vdM8E3fCAAxrElnee4m_Od8U(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.userprofile.api.navigation.PhoneOptionsDestination phoneOptionsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneOptionsDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1049243414, i, -1, "com.paypal.oslo.feature.userprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:327)");
        }
        com.paypal.oslo.feature.userprofile.ui.screens.phone.PhoneOptionsScreenKt.PhoneOptionsScreen(phoneOptionsDestination.getPhoneId(), appNavigator, userStore, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oUDmaFm4tqbWvGYVKyfbitbZhfc(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.userprofile.api.navigation.EmailOptionsDestination emailOptionsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailOptionsDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1630714132, i, -1, "com.paypal.oslo.feature.userprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:134)");
        }
        com.paypal.oslo.feature.userprofile.ui.screens.email.EmailOptionsScreenKt.EmailOptionsScreen(emailOptionsDestination.getEmailId(), appNavigator, userStore, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$s8jxK_Ju4wvGA1DG1Te7laYslsg(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.api.navigation.AddAddressDestination addAddressDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addAddressDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-32544755, i, -1, "com.paypal.oslo.feature.userprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:248)");
        }
        com.paypal.oslo.feature.userprofile.ui.screens.address.AddressScreenMode addressScreenMode = com.paypal.oslo.feature.userprofile.ui.screens.address.AddressScreenMode.ADD;
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$jdGa3P1U7TOlvMQjo2HiO6t48_M(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.core.userstore.model.ProfileAddress) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.userprofile.ui.screens.address.AddEditAddressScreenKt.AddEditAddressScreen(addressScreenMode, (kotlin.jvm.functions.Function1) rememberedValue, appNavigator, null, composer, 6, 8);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$tLFNBKb1Axv-kOoQH_dtoyy-54s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20455$r8$lambda$tLFNBKb1AxvkOoQH_dtoyy54s(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tMD55REnRexpikZ55AbKyDmMVP8(com.paypal.oslo.core.userstore.UserStore userStore, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.api.navigation.UserProfileWebViewDestination userProfileWebViewDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileWebViewDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1075692030, i, -1, "com.paypal.oslo.feature.userprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:432)");
        }
        java.lang.String url = userProfileWebViewDestination.getUrl();
        java.lang.String title = userProfileWebViewDestination.getTitle();
        java.lang.String source = userProfileWebViewDestination.getSource();
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.userprofile.di.NavigationModule.$r8$lambda$hUiqlzjJFMpovPuwNP7hlCx_BbU(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.userprofile.ui.screens.webview.UserProfileWebViewScreenKt.UserProfileWebViewScreen(url, title, source, userStore, (kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 32);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$v3LD5izrHZuW8Q8HQRe1olpAnOU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.api.navigation.FullScreenErrorDestination fullScreenErrorDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullScreenErrorDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-865533077, i, -1, "com.paypal.oslo.feature.userprofile.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:375)");
        }
        com.paypal.oslo.feature.userprofile.ui.components.common.GenericFullScreenErrorKt.GenericFullScreenError(fullScreenErrorDestination, appNavigator, null, composer, i & 14, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$wVyG-BPiWPTbwiuAO5dmSATD924, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20456$r8$lambda$wVyGBPiWPTbwiuAO5dmSATD924(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zeoxCZLGsj4Khl-16ljUxsoEAHY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20457$r8$lambda$zeoxCZLGsj4Khl16ljUxsoEAHY(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.di.NavigationModule$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.di.NavigationModule.m20456$r8$lambda$wVyGBPiWPTbwiuAO5dmSATD924((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
