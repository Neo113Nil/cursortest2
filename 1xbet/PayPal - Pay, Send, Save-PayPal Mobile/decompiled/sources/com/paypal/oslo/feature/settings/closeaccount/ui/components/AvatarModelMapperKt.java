package com.paypal.oslo.feature.settings.closeaccount.ui.components;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\u0006\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\u0006\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/AvatarModel;", "", "ToAvatarComponent", "(Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/AvatarModel;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/AvatarModel$AvatarSize;", "Lcom/paypal/pds/components/AvatarSize;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/AvatarModel$AvatarSize;)Lcom/paypal/pds/components/AvatarSize;", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/AvatarModel$AvatarEmphasis;", "Lcom/paypal/pds/components/AvatarEmphasis;", "(Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/AvatarModel$AvatarEmphasis;)Lcom/paypal/pds/components/AvatarEmphasis;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AvatarModelMapperKt {
    public static final void ToAvatarComponent(final com.paypal.oslo.feature.settings.closeaccount.ui.model.AvatarModel avatarModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1498857365);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(avatarModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1498857365, i2, -1, "com.paypal.oslo.feature.settings.closeaccount.ui.components.ToAvatarComponent (AvatarModelMapper.kt:24)");
            }
            if (avatarModel instanceof com.paypal.oslo.feature.settings.closeaccount.ui.model.AvatarModel.IconAvatar) {
                startRestartGroup.startReplaceGroup(-1587880481);
                com.paypal.oslo.feature.settings.closeaccount.ui.model.AvatarModel.IconAvatar iconAvatar = (com.paypal.oslo.feature.settings.closeaccount.ui.model.AvatarModel.IconAvatar) avatarModel;
                com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(iconAvatar.getIcon()), null, getHighSpeedVideoFpsRanges(iconAvatar.getSize()), getHighSpeedVideoFpsRanges(iconAvatar.getEmphasis()), null, null, startRestartGroup, com.paypal.pds.components.AvatarSize.$stable << 6, 50);
                startRestartGroup.endReplaceGroup();
            } else if (avatarModel instanceof com.paypal.oslo.feature.settings.closeaccount.ui.model.AvatarModel.InitialsAvatar) {
                startRestartGroup.startReplaceGroup(-1587874393);
                com.paypal.oslo.feature.settings.closeaccount.ui.model.AvatarModel.InitialsAvatar initialsAvatar = (com.paypal.oslo.feature.settings.closeaccount.ui.model.AvatarModel.InitialsAvatar) avatarModel;
                com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Initials(initialsAvatar.getInitials()), null, getHighSpeedVideoFpsRanges(initialsAvatar.getSize()), getHighSpeedVideoFpsRanges(initialsAvatar.getEmphasis()), null, null, startRestartGroup, com.paypal.pds.components.AvatarSize.$stable << 6, 50);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1587881858);
                startRestartGroup.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.settings.closeaccount.ui.components.AvatarModelMapperKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.settings.closeaccount.ui.components.AvatarModelMapperKt.m19219$r8$lambda$lwcQqWApiZX2uHoNIPW_n_Yao(com.paypal.oslo.feature.settings.closeaccount.ui.model.AvatarModel.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final com.paypal.pds.components.AvatarSize getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.settings.closeaccount.ui.model.AvatarModel.AvatarSize avatarSize) {
        int i = com.paypal.oslo.feature.settings.closeaccount.ui.components.AvatarModelMapperKt.WhenMappings.$EnumSwitchMapping$0[avatarSize.ordinal()];
        if (i == 1) {
            return com.paypal.pds.components.AvatarSize.XSmall.INSTANCE;
        }
        if (i == 2) {
            return com.paypal.pds.components.AvatarSize.Small.INSTANCE;
        }
        if (i == 3) {
            return com.paypal.pds.components.AvatarSize.Medium.INSTANCE;
        }
        if (i == 4) {
            return com.paypal.pds.components.AvatarSize.Large.INSTANCE;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.pds.components.AvatarSize.XLarge.INSTANCE;
    }

    private static final com.paypal.pds.components.AvatarEmphasis getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.settings.closeaccount.ui.model.AvatarModel.AvatarEmphasis avatarEmphasis) {
        int i = com.paypal.oslo.feature.settings.closeaccount.ui.components.AvatarModelMapperKt.WhenMappings.$EnumSwitchMapping$1[avatarEmphasis.ordinal()];
        if (i == 1) {
            return com.paypal.pds.components.AvatarEmphasis.Default.INSTANCE;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.pds.components.AvatarEmphasis.High.INSTANCE;
    }

    /* renamed from: $r8$lambda$lw-cQqW-ApiZX2uHoNIPW_n_Yao, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19219$r8$lambda$lwcQqWApiZX2uHoNIPW_n_Yao(com.paypal.oslo.feature.settings.closeaccount.ui.model.AvatarModel avatarModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        ToAvatarComponent(avatarModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.settings.closeaccount.ui.model.AvatarModel.AvatarSize.values().length];
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.ui.model.AvatarModel.AvatarSize.XSmall.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.ui.model.AvatarModel.AvatarSize.Small.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.ui.model.AvatarModel.AvatarSize.Medium.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.ui.model.AvatarModel.AvatarSize.Large.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.closeaccount.ui.model.AvatarModel.AvatarSize.XLarge.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.settings.closeaccount.ui.model.AvatarModel.AvatarEmphasis.values().length];
            try {
                iArr2[com.paypal.oslo.feature.settings.closeaccount.ui.model.AvatarModel.AvatarEmphasis.Default.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.settings.closeaccount.ui.model.AvatarModel.AvatarEmphasis.High.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
