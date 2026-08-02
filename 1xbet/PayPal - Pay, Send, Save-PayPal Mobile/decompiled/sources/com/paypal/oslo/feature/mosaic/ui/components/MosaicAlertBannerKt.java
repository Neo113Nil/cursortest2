package com.paypal.oslo.feature.mosaic.ui.components;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\u000e\u0010\u0007\u001a\u00020\b*\u0004\u0018\u00010\tH\u0002\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"MosaicAlertBanner", "", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicAlertBannerComponent;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicAlertBannerComponent;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "toBannerStyle", "Lcom/paypal/pds/components/BannerStyle;", "Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageContextualAlertComponentType;", "MosaicVerificationBannerPreview", "(Landroidx/compose/runtime/Composer;I)V", "mosaic_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MosaicAlertBannerKt {
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MosaicAlertBanner(final com.paypal.oslo.feature.mosaic.domain.model.MosaicAlertBannerComponent mosaicAlertBannerComponent, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.pds.components.BannerStyle.Neutral neutral;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicAlertBannerComponent, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(849463463);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(mosaicAlertBannerComponent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(849463463, i3, -1, "com.paypal.oslo.feature.mosaic.ui.components.MosaicAlertBanner (MosaicAlertBanner.kt:38)");
            }
            java.lang.String content = mosaicAlertBannerComponent.getContent();
            com.paypal.oslo.api.graphql.schema.type.MosaicPageContextualAlertComponentType type = mosaicAlertBannerComponent.getType();
            int i5 = type == null ? -1 : com.paypal.oslo.feature.mosaic.ui.components.MosaicAlertBannerKt.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i5 != -1) {
                if (i5 == 1) {
                    neutral = com.paypal.pds.components.BannerStyle.Negative.INSTANCE;
                } else if (i5 == 2) {
                    neutral = com.paypal.pds.components.BannerStyle.Positive.INSTANCE;
                } else if (i5 == 3) {
                    neutral = com.paypal.pds.components.BannerStyle.Warning.INSTANCE;
                } else if (i5 != 4 && i5 != 5) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.pds.components.BannerKt.Banner(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16()), neutral, (java.lang.String) null, content, (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, 0, 116);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            neutral = com.paypal.pds.components.BannerStyle.Neutral.INSTANCE;
            com.paypal.pds.components.BannerKt.Banner(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16()), neutral, (java.lang.String) null, content, (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, 0, 116);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.components.MosaicAlertBannerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.mosaic.ui.components.MosaicAlertBannerKt.$r8$lambda$pdRbOW24KscdzIz3YTpZt8_Cenw(com.paypal.oslo.feature.mosaic.domain.model.MosaicAlertBannerComponent.this, modifier, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$PViZvWOaJLt_T2-QDBzacuwtUGs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15777$r8$lambda$PViZvWOaJLt_T2QDBzacuwtUGs(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(656711290);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(656711290, updateChangedFlags, -1, "com.paypal.oslo.feature.mosaic.ui.components.MosaicVerificationBannerPreview (MosaicAlertBanner.kt:71)");
            }
            MosaicAlertBanner(new com.paypal.oslo.feature.mosaic.domain.model.MosaicAlertBannerComponent("Some of this info couldn't be verified. Check the info and resubmit for verification.", "preview", null, com.paypal.oslo.api.graphql.schema.type.MosaicPageContextualAlertComponentType.WARNING), null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.components.MosaicAlertBannerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.mosaic.ui.components.MosaicAlertBannerKt.m15777$r8$lambda$PViZvWOaJLt_T2QDBzacuwtUGs(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pdRbOW24KscdzIz3YTpZt8_Cenw(com.paypal.oslo.feature.mosaic.domain.model.MosaicAlertBannerComponent mosaicAlertBannerComponent, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        MosaicAlertBanner(mosaicAlertBannerComponent, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.MosaicPageContextualAlertComponentType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MosaicPageContextualAlertComponentType.INFO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MosaicPageContextualAlertComponentType.SUCCESS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MosaicPageContextualAlertComponentType.WARNING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MosaicPageContextualAlertComponentType.ERROR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MosaicPageContextualAlertComponentType.UNKNOWN__.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
