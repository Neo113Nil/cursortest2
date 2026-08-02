package com.paypal.oslo.feature.userprofile.ui.utils;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a8\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001ap\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\u0019\b\u0002\u0010\u0014\u001a\u0013\u0012\t\u0012\u00070\u0012¢\u0006\u0002\b\u0013\u0012\u0004\u0012\u00020\u00060\u00042\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0000¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$FullScreen;", "strategy", "Lkotlin/Function1;", "Lcom/paypal/oslo/core/navigation/AppNavigator$NavigationScope;", "", "Lkotlin/ExtensionFunctionType;", "preNavigation", "navigateToFullScreenError", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/userprofile/ui/utils/email/EmailErrorStrategy$FullScreen;Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/core/userstore/model/ProfileEmail;", "email", "Lkotlin/Function0;", "onEditEmail", "onConfirmEmail", "", "Lkotlin/ParameterName;", "onSetAsPrimary", "onRemoveEmail", "", "Lcom/paypal/oslo/feature/userprofile/ui/components/common/BottomSheetOption;", "prepareEmailOptions", "(Landroid/content/Context;Lcom/paypal/oslo/core/userstore/model/ProfileEmail;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class EmailUtilsKt {
    public static final void navigateToFullScreenError(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen fullScreen, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.navigation.AppNavigator.NavigationScope, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullScreen, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.utils.EmailUtilsKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.ui.utils.EmailUtilsKt.m20579$r8$lambda$UhgMrnRwuqsNojHmxb6Z7RbLxQ(kotlin.jvm.functions.Function1.this, fullScreen, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List prepareEmailOptions$default(android.content.Context context, com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function03, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.utils.EmailUtilsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit unit;
                    unit = kotlin.Unit.INSTANCE;
                    return unit;
                }
            };
        }
        kotlin.jvm.functions.Function0 function04 = function0;
        if ((i & 8) != 0) {
            function02 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.utils.EmailUtilsKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit unit;
                    unit = kotlin.Unit.INSTANCE;
                    return unit;
                }
            };
        }
        kotlin.jvm.functions.Function0 function05 = function02;
        if ((i & 16) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.utils.EmailUtilsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit unit;
                    ((java.lang.Boolean) obj2).booleanValue();
                    unit = kotlin.Unit.INSTANCE;
                    return unit;
                }
            };
        }
        kotlin.jvm.functions.Function1 function12 = function1;
        if ((i & 32) != 0) {
            function03 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.utils.EmailUtilsKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Unit unit;
                    unit = kotlin.Unit.INSTANCE;
                    return unit;
                }
            };
        }
        return prepareEmailOptions(context, profileEmail, function04, function05, function12, function03);
    }

    public static final java.util.List<com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption> prepareEmailOptions(android.content.Context context, final com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function03) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileEmail, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        if (!profileEmail.getConfirmed()) {
            com.paypal.pds.core.Icon.Check check = com.paypal.pds.core.Icon.Check.INSTANCE;
            java.lang.String string = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_confirm_button);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
            createListBuilder.add(new com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption(check, string, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.utils.EmailUtilsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.userprofile.ui.utils.EmailUtilsKt.$r8$lambda$K2fFLQS0jxyr8vlNke87p2Ic7t0(com.paypal.oslo.core.userstore.model.ProfileEmail.this, function02);
                }
            }));
        }
        com.paypal.pds.core.Icon.Pencil pencil = com.paypal.pds.core.Icon.Pencil.INSTANCE;
        java.lang.String string2 = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_options_edit);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
        createListBuilder.add(new com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption(pencil, string2, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.utils.EmailUtilsKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.userprofile.ui.utils.EmailUtilsKt.$r8$lambda$jm5vbWFF9krsNSoSrmBbYwT6kLY(com.paypal.oslo.core.userstore.model.ProfileEmail.this, function0);
            }
        }));
        if (!profileEmail.getPrimary()) {
            com.paypal.pds.core.Icon.Star star = com.paypal.pds.core.Icon.Star.INSTANCE;
            java.lang.String string3 = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_make_this_your_primary_email_option);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
            createListBuilder.add(new com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption(star, string3, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.utils.EmailUtilsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.userprofile.ui.utils.EmailUtilsKt.$r8$lambda$qctQARSoj8Fd0IFzOij8ZuUrDaA(com.paypal.oslo.core.userstore.model.ProfileEmail.this, function1);
                }
            }));
            com.paypal.pds.core.Icon.Trash trash = com.paypal.pds.core.Icon.Trash.INSTANCE;
            java.lang.String string4 = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_options_remove);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "");
            createListBuilder.add(new com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption(trash, string4, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.utils.EmailUtilsKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.userprofile.ui.utils.EmailUtilsKt.m20580$r8$lambda$WsK8KGnTivndhWbiqrYKAPedc(com.paypal.oslo.core.userstore.model.ProfileEmail.this, function03);
                }
            }));
        }
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$B281abXmV1MIbex_YRStTB5l6II(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen fullScreen, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        final androidx.navigation3.runtime.NavKey actionDestination = fullScreen.getActionDestination();
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.utils.EmailUtilsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.ui.utils.EmailUtilsKt.$r8$lambda$LkEY3oBtXtRl9UCVTFHnPVI46wg(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$K2fFLQS0jxyr8vlNke87p2Ic7t0(com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail, kotlin.jvm.functions.Function0 function0) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Confirm email clicked", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("emailId", profileEmail.getId())), null, 4, null);
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LkEY3oBtXtRl9UCVTFHnPVI46wg(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        if (navKey != null) {
            navigationScope.push(navKey);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$UhgMrnRwuqsNojHmx-b6Z7RbLxQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20579$r8$lambda$UhgMrnRwuqsNojHmxb6Z7RbLxQ(kotlin.jvm.functions.Function1 function1, final com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen fullScreen, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        function1.invoke(navigationScope);
        navigationScope.push(new com.paypal.oslo.feature.userprofile.api.navigation.FullScreenErrorDestination(fullScreen.getIconName(), fullScreen.getTitle(), fullScreen.getSubtitle(), fullScreen.getButtonText(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.utils.EmailUtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.ui.utils.EmailUtilsKt.$r8$lambda$B281abXmV1MIbex_YRStTB5l6II(com.paypal.oslo.feature.userprofile.ui.utils.email.EmailErrorStrategy.FullScreen.this, (com.paypal.oslo.core.navigation.AppNavigator) obj);
            }
        }));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$W-sK8KGn-TivndhWbiqrYKAPedc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20580$r8$lambda$WsK8KGnTivndhWbiqrYKAPedc(com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail, kotlin.jvm.functions.Function0 function0) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Remove email clicked", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("emailId", profileEmail.getId())), null, 4, null);
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jm5vbWFF9krsNSoSrmBbYwT6kLY(com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail, kotlin.jvm.functions.Function0 function0) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Edit email clicked", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("emailId", profileEmail.getId())), null, 4, null);
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qctQARSoj8Fd0IFzOij8ZuUrDaA(com.paypal.oslo.core.userstore.model.ProfileEmail profileEmail, kotlin.jvm.functions.Function1 function1) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Set as primary email clicked", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("emailId", profileEmail.getId())), null, 4, null);
        function1.invoke(java.lang.Boolean.valueOf(!profileEmail.getConfirmed()));
        return kotlin.Unit.INSTANCE;
    }
}
