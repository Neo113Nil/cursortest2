package com.paypal.oslo.feature.packagetracking.ui.common;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aY\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b0\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\f\u0010\r\u001a\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/pds/core/RichText;", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/pds/components/BannerStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "", "onLinkClick", "Lkotlin/Function0;", "onDismiss", "PackageTrackingBanner", "(Lcom/paypal/pds/core/RichText;Lcom/paypal/pds/core/RichText;Lcom/paypal/pds/components/BannerStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PackageTrackingBannerWarningPreview", "(Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PackageTrackingBannerKt {
    public static final void PackageTrackingBanner(final com.paypal.pds.core.RichText richText, final com.paypal.pds.core.RichText richText2, final com.paypal.pds.components.BannerStyle bannerStyle, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(richText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerStyle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-921936130);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(richText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(richText2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(bannerStyle) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if (!startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-921936130, i2, -1, "com.paypal.oslo.feature.packagetracking.ui.common.PackageTrackingBanner (PackageTrackingBanner.kt:33)");
            }
            int i3 = i2 << 6;
            com.paypal.pds.components.BannerKt.Banner(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), bannerStyle, richText, richText2, (com.paypal.pds.components.BannerTrailingElement) null, function2, function0, startRestartGroup, ((i2 >> 3) & 112) | 6 | (i3 & 896) | (i3 & 7168) | (458752 & i3) | (i3 & 3670016), 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.common.PackageTrackingBannerKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.common.PackageTrackingBannerKt.$r8$lambda$H4694ffmgy39fUAUVEZJqFX8c4U(com.paypal.pds.core.RichText.this, richText2, bannerStyle, function2, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PackageTrackingBannerWarningPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-141263537);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-141263537, i, -1, "com.paypal.oslo.feature.packagetracking.ui.common.PackageTrackingBannerWarningPreview (PackageTrackingBanner.kt:46)");
            }
            com.paypal.pds.core.RichText invoke$default = com.paypal.pds.core.RichText.Companion.invoke$default(com.paypal.pds.core.RichText.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_error_email_unlinking_title, startRestartGroup, 0), null, false, null, 14, null);
            com.paypal.pds.core.RichText parseRichTextWithLinkTags = com.paypal.oslo.feature.packagetracking.ui.utils.StringExtensions.INSTANCE.parseRichTextWithLinkTags(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_banner_description_contact_us, startRestartGroup, 0));
            com.paypal.pds.components.BannerStyle.Warning warning = com.paypal.pds.components.BannerStyle.Warning.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.common.PackageTrackingBannerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.packagetracking.ui.common.PackageTrackingBannerKt.m17479$r8$lambda$FpIYYIuWRk8_gx6Dl4Ve6YjtRI((java.lang.String) obj, (java.lang.String) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.common.PackageTrackingBannerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            PackageTrackingBanner(invoke$default, parseRichTextWithLinkTags, warning, function2, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 28032);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.common.PackageTrackingBannerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.common.PackageTrackingBannerKt.$r8$lambda$Dp_UhYfgCnBriAyjgU5laCjx2Rc(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Dp_UhYfgCnBriAyjgU5laCjx2Rc(int i, androidx.compose.runtime.Composer composer, int i2) {
        PackageTrackingBannerWarningPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$FpIY-YIuWRk8_gx6Dl4Ve6YjtRI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17479$r8$lambda$FpIYYIuWRk8_gx6Dl4Ve6YjtRI(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.areEqual(str2, com.paypal.oslo.feature.packagetracking.ui.PTUiConstants.LINK_CONTACT_US_KEY);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$H4694ffmgy39fUAUVEZJqFX8c4U(com.paypal.pds.core.RichText richText, com.paypal.pds.core.RichText richText2, com.paypal.pds.components.BannerStyle bannerStyle, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        PackageTrackingBanner(richText, richText2, bannerStyle, function2, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
