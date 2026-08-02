package com.paypal.oslo.feature.contacts.ui.contacts.views;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComposableSingletons$SearchContactKt {
    public static final com.paypal.oslo.feature.contacts.ui.contacts.views.ComposableSingletons$SearchContactKt INSTANCE = new com.paypal.oslo.feature.contacts.ui.contacts.views.ComposableSingletons$SearchContactKt();
    private static kotlin.jvm.functions.Function4<java.lang.String, java.lang.Boolean, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1035620125, false, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.ComposableSingletons$SearchContactKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function4
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            return com.paypal.oslo.feature.contacts.ui.contacts.views.ComposableSingletons$SearchContactKt.$r8$lambda$otLR1qZNdxjJeszwiwyoC_MXyJQ((java.lang.String) obj, ((java.lang.Boolean) obj2).booleanValue(), (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
        }
    });
    private static kotlin.jvm.functions.Function4<java.lang.String, java.lang.Boolean, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1707315345, false, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.contacts.ui.contacts.views.ComposableSingletons$SearchContactKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function4
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            return com.paypal.oslo.feature.contacts.ui.contacts.views.ComposableSingletons$SearchContactKt.$r8$lambda$ljVBgu3jy7cPX0aXrSt3fXEw_cY((java.lang.String) obj, ((java.lang.Boolean) obj2).booleanValue(), (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$ljVBgu3jy7cPX0aXrSt3fXEw_cY(java.lang.String str, boolean z, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composer.changed(z) ? 32 : 16;
        }
        if (composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1707315345, i2, -1, "com.paypal.oslo.feature.contacts.ui.contacts.views.ComposableSingletons$SearchContactKt.lambda$1707315345.<anonymous> (SearchContact.kt:158)");
            }
            com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactKt.Camera2StreamConfigurationMap(z, str, composer, ((i2 >> 3) & 14) | ((i2 << 3) & 112));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$otLR1qZNdxjJeszwiwyoC_MXyJQ(java.lang.String str, boolean z, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if ((i & 6) == 0) {
            i2 = (composer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composer.changed(z) ? 32 : 16;
        }
        if (composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1035620125, i2, -1, "com.paypal.oslo.feature.contacts.ui.contacts.views.ComposableSingletons$SearchContactKt.lambda$1035620125.<anonymous> (SearchContact.kt:118)");
            }
            com.paypal.oslo.feature.contacts.ui.contacts.views.SearchContactKt.Camera2StreamConfigurationMap(z, str, composer, ((i2 >> 3) & 14) | ((i2 << 3) & 112));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function4<java.lang.String, java.lang.Boolean, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1707315345$contacts_prodRelease() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public final kotlin.jvm.functions.Function4<java.lang.String, java.lang.Boolean, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1035620125$contacts_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
