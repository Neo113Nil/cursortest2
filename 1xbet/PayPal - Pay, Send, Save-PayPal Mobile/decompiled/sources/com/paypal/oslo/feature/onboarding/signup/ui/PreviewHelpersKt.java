package com.paypal.oslo.feature.onboarding.signup.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\"\u0010\u0007\u001a\u00020\u00042\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/VariantResolver;", "createPreviewVariantResolver", "()Lcom/paypal/oslo/feature/onboarding/shared/variants/domain/VariantResolver;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "PreviewWrapper", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PreviewHelpersKt {
    public static final com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantResolver createPreviewVariantResolver() {
        return new com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantResolver() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.PreviewHelpersKt$createPreviewVariantResolver$1
            @Override // com.paypal.oslo.feature.onboarding.shared.variants.domain.VariantResolver
            /* renamed from: text-sTNpmkc */
            public final java.lang.String mo16199textsTNpmkc(java.lang.String key, java.lang.Object... formatArgs) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatArgs, "");
                return key;
            }
        };
    }

    public static final void PreviewWrapper(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(908657841);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(908657841, i2, -1, "com.paypal.oslo.feature.onboarding.signup.ui.PreviewWrapper (PreviewHelpers.kt:62)");
            }
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(com.paypal.oslo.feature.onboarding.shared.variants.ui.ComposeVariantsKt.getLocalVariantResolver().provides(createPreviewVariantResolver()), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-710999921, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.PreviewHelpersKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.ui.PreviewHelpersKt.m16438$r8$lambda$gIvl6P0wKWSO2h8iQXUNvhzOU(kotlin.jvm.functions.Function2.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, androidx.compose.runtime.ProvidedValue.$stable | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.PreviewHelpersKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.signup.ui.PreviewHelpersKt.$r8$lambda$Czw5hBVF2sNAAXEsFzJhzkFMQLc(kotlin.jvm.functions.Function2.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Czw5hBVF2sNAAXEsFzJhzkFMQLc(kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        PreviewWrapper(function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$g-Ivl6P0wKWSO2h8iQ-XUNvhzOU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16438$r8$lambda$gIvl6P0wKWSO2h8iQXUNvhzOU(kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-710999921, i, -1, "com.paypal.oslo.feature.onboarding.signup.ui.PreviewWrapper.<anonymous>.<anonymous> (PreviewHelpers.kt:66)");
            }
            function2.invoke(composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
