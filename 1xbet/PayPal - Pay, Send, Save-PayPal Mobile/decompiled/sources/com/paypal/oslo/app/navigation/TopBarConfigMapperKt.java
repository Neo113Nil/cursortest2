package com.paypal.oslo.app.navigation;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/app/navigation/TopBarUiState;", "uiState", "Lkotlin/Function0;", "", "onLeftSectionClick", "onNotificationClick", "onAccountSwitchClick", "Lcom/paypal/oslo/core/navigation/ui/TopBarConfig;", "rememberTopBarConfig", "(Lcom/paypal/oslo/app/navigation/TopBarUiState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/core/navigation/ui/TopBarConfig;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TopBarConfigMapperKt {
    public static final com.paypal.oslo.core.navigation.ui.TopBarConfig rememberTopBarConfig(com.paypal.oslo.app.navigation.TopBarUiState topBarUiState, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.Composer composer, int i) {
        com.paypal.pds.components.AvatarSource avatarSource;
        com.paypal.pds.components.AvatarSource.Initials initials;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topBarUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-485755875, i, -1, "com.paypal.oslo.app.navigation.rememberTopBarConfig (TopBarConfigMapper.kt:34)");
        }
        if (topBarUiState.getShowAccountSwitch()) {
            composer.startReplaceGroup(-1408190104);
            java.lang.String profileImageUrl = topBarUiState.getProfileImageUrl();
            if (profileImageUrl != null && profileImageUrl.length() != 0) {
                composer.startReplaceGroup(-1408139233);
                com.paypal.pds.components.AvatarSource.Image image = new com.paypal.pds.components.AvatarSource.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(new com.paypal.oslo.core.commonui.components.ImageRequest.Builder((android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).data(topBarUiState.getProfileImageUrl()).crossfade(true).build(), null, null, null, null, composer, com.paypal.oslo.core.commonui.components.ImageRequest.$stable, 30), null, 2, null);
                composer.endReplaceGroup();
                initials = image;
            } else {
                composer.startReplaceGroup(-1407817422);
                composer.endReplaceGroup();
                java.lang.String displayName = topBarUiState.getDisplayName();
                if (displayName == null) {
                    displayName = "User";
                }
                initials = new com.paypal.pds.components.AvatarSource.Initials(displayName);
            }
            composer.endReplaceGroup();
            avatarSource = initials;
        } else {
            composer.startReplaceGroup(-1407725135);
            composer.endReplaceGroup();
            avatarSource = null;
        }
        com.paypal.oslo.core.navigation.ui.TopBarConfig topBarConfig = new com.paypal.oslo.core.navigation.ui.TopBarConfig(com.paypal.pds.core.Icon.AiMarkFill.INSTANCE, com.paypal.pds.core.Color.BackgroundBrandPrimary.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.app.R.string.main_top_bar_search_button, composer, 0), null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.searchandintelligence.R.string.feature_search_and_intelligence_input_placeholder, composer, 0), topBarUiState.getShowLeftSection(), avatarSource, true, topBarUiState.getNotificationCount(), false, function0, function03, function02, null, 8712, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return topBarConfig;
    }
}
