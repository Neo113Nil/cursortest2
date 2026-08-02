package com.paypal.oslo.feature.identity.passkey.management.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$PasskeyListScreenKt {
    public static final com.paypal.oslo.feature.identity.passkey.management.ui.ComposableSingletons$PasskeyListScreenKt INSTANCE = new com.paypal.oslo.feature.identity.passkey.management.ui.ComposableSingletons$PasskeyListScreenKt();
    private static kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(777937532, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.ComposableSingletons$PasskeyListScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.identity.passkey.management.ui.ComposableSingletons$PasskeyListScreenKt.$r8$lambda$9vVrmQWUVpisb95KD7Ai0Upxn_c((androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });
    private static kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1740725531, false, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.ComposableSingletons$PasskeyListScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            return com.paypal.oslo.feature.identity.passkey.management.ui.ComposableSingletons$PasskeyListScreenKt.m15228$r8$lambda$N3er7FwLW0iUiIOKwln4_9H_A((androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$9vVrmQWUVpisb95KD7Ai0Upxn_c(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(777937532, i, -1, "com.paypal.oslo.feature.identity.passkey.management.ui.ComposableSingletons$PasskeyListScreenKt.lambda$777937532.<anonymous> (PasskeyListScreen.kt:461)");
            }
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer, 0);
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_manage_passkeys_list_state_title, composer, 0);
            com.paypal.pds.core.Typography.HeadingMedium headingMedium = com.paypal.pds.core.Typography.HeadingMedium.INSTANCE;
            com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.passkey.management.ui.ComposableSingletons$PasskeyListScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.identity.passkey.management.ui.ComposableSingletons$PasskeyListScreenKt.$r8$lambda$ArXp44oOs0Rsr1ly7MZiC0No1H4((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), contentBase, null, null, null, false, 0, 0, null, headingMedium, composer, 384, 6, 1016);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ArXp44oOs0Rsr1ly7MZiC0No1H4(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$N3er7FwLW0iUiIO-Kwln-4_9H_A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15228$r8$lambda$N3er7FwLW0iUiIOKwln4_9H_A(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1740725531, i, -1, "com.paypal.oslo.feature.identity.passkey.management.ui.ComposableSingletons$PasskeyListScreenKt.lambda$-1740725531.<anonymous> (PasskeyListScreen.kt:473)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.identity.R.string.feature_identity_manage_passkeys_list_state_description, composer, 0), null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 384, 6, 1018);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$777937532$identity_prodRelease() {
        return Camera2StreamConfigurationMap;
    }

    /* renamed from: getLambda$-1740725531$identity_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m15229getLambda$1740725531$identity_prodRelease() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
