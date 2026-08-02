package com.paypal.oslo.feature.activity.ui.common;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\n\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\rH\u0002\u001a\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, d2 = {"PopulatePaypalActivityAvatar", "", "activityAvatarType", "Lcom/paypal/oslo/feature/activity/api/models/ActivityAvatarType;", "avatarSize", "Lcom/paypal/pds/components/AvatarSize;", "modifier", "Landroidx/compose/ui/Modifier;", "avatarBadgeType", "Lcom/paypal/oslo/feature/activity/domain/common/models/AvatarBadgeType;", "(Lcom/paypal/oslo/feature/activity/api/models/ActivityAvatarType;Lcom/paypal/pds/components/AvatarSize;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/activity/domain/common/models/AvatarBadgeType;Landroidx/compose/runtime/Composer;II)V", "resolveAvatarEmphasis", "Lcom/paypal/pds/components/AvatarEmphasis;", "Lcom/paypal/pds/core/Icon;", "getAvatarBadge", "Lcom/paypal/pds/components/AvatarBadge;", "(Lcom/paypal/oslo/feature/activity/domain/common/models/AvatarBadgeType;Landroidx/compose/runtime/Composer;I)Lcom/paypal/pds/components/AvatarBadge;", "activity_prodRelease", "state", "Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$State;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PopulatePaypalActivityAvatarKt {
    /* JADX WARN: Removed duplicated region for block: B:49:0x02dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PopulatePaypalActivityAvatar(final com.paypal.oslo.feature.activity.api.models.ActivityAvatarType activityAvatarType, final com.paypal.pds.components.AvatarSize avatarSize, final androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.activity.domain.common.models.AvatarBadgeType avatarBadgeType, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.oslo.feature.activity.domain.common.models.AvatarBadgeType avatarBadgeType2;
        com.paypal.oslo.feature.activity.domain.common.models.AvatarBadgeType avatarBadgeType3;
        com.paypal.oslo.feature.activity.domain.common.models.AvatarBadgeType avatarBadgeType4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityAvatarType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarSize, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(691410218);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(activityAvatarType) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(avatarSize) : startRestartGroup.changedInstance(avatarSize) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(avatarBadgeType == null ? -1 : avatarBadgeType.ordinal()) ? 2048 : 1024;
        }
        int i5 = i3;
        if (!startRestartGroup.shouldExecute((i5 & 1171) != 1170, i5 & 1)) {
            startRestartGroup.skipToGroupEnd();
            avatarBadgeType2 = avatarBadgeType;
        } else {
            com.paypal.oslo.feature.activity.domain.common.models.AvatarBadgeType avatarBadgeType5 = i4 != 0 ? null : avatarBadgeType;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(691410218, i5, -1, "com.paypal.oslo.feature.activity.ui.common.PopulatePaypalActivityAvatar (PopulatePaypalActivityAvatar.kt:45)");
            }
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            if (activityAvatarType instanceof com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.GenericActivityAvatar) {
                startRestartGroup.startReplaceGroup(1210193228);
                com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.GenericActivityAvatar genericActivityAvatar = (com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.GenericActivityAvatar) activityAvatarType;
                com.paypal.pds.components.AvatarSource.Icon icon = new com.paypal.pds.components.AvatarSource.Icon(genericActivityAvatar.getName());
                com.paypal.pds.components.AvatarEmphasis Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(genericActivityAvatar.getName());
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "generic_avatar");
                int i6 = (com.paypal.pds.components.AvatarSize.$stable << 6) | 48 | ((i5 << 3) & 896);
                avatarBadgeType4 = avatarBadgeType5;
                com.paypal.pds.components.AvatarKt.Avatar(icon, testTag, avatarSize, Camera2StreamConfigurationMap, null, null, startRestartGroup, i6, 48);
                startRestartGroup.endReplaceGroup();
            } else {
                com.paypal.oslo.feature.activity.domain.common.models.AvatarBadgeType avatarBadgeType6 = avatarBadgeType5;
                if (activityAvatarType instanceof com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.ImageActivityAvatar) {
                    startRestartGroup.startReplaceGroup(1210580201);
                    com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.ImageActivityAvatar imageActivityAvatar = (com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.ImageActivityAvatar) activityAvatarType;
                    java.lang.String imageUrl = imageActivityAvatar.getImageUrl();
                    if (imageUrl != null && !kotlin.text.StringsKt.isBlank(imageUrl)) {
                        startRestartGroup.startReplaceGroup(1210636032);
                        com.paypal.pds.components.AvatarSource.Image image = new com.paypal.pds.components.AvatarSource.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(new com.paypal.oslo.core.commonui.components.ImageRequest.Builder((android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).scale(com.paypal.oslo.core.commonui.components.Scale.FIT).data(imageActivityAvatar.getImageUrl()).build(), null, null, null, null, startRestartGroup, com.paypal.oslo.core.commonui.components.ImageRequest.$stable, 30), androidx.compose.ui.layout.ContentScale.INSTANCE.getFit());
                        com.paypal.pds.components.AvatarBadge highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(avatarBadgeType6, startRestartGroup, (i5 >> 9) & 14);
                        androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "image_avatar");
                        int i7 = (com.paypal.pds.components.AvatarSize.$stable << 6) | 48 | ((i5 << 3) & 896) | (com.paypal.pds.components.AvatarBadge.$stable << 12);
                        avatarBadgeType4 = avatarBadgeType6;
                        com.paypal.pds.components.AvatarKt.Avatar(image, testTag2, avatarSize, null, highSpeedVideoFpsRangesFor, null, startRestartGroup, i7, 40);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(1211422967);
                        java.lang.String initials = imageActivityAvatar.getInitials();
                        com.paypal.pds.components.AvatarSource.Initials initials2 = new com.paypal.pds.components.AvatarSource.Initials(initials != null ? initials : "");
                        androidx.compose.ui.Modifier testTag3 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "initials_avatar_fallback");
                        int i8 = (com.paypal.pds.components.AvatarSize.$stable << 6) | 48 | ((i5 << 3) & 896);
                        avatarBadgeType4 = avatarBadgeType6;
                        com.paypal.pds.components.AvatarKt.Avatar(initials2, testTag3, avatarSize, null, null, null, startRestartGroup, i8, 56);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (activityAvatarType instanceof com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.InitialsActivityAvatar) {
                        startRestartGroup.startReplaceGroup(1211780211);
                        java.lang.String initials3 = ((com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.InitialsActivityAvatar) activityAvatarType).getInitials();
                        avatarBadgeType3 = avatarBadgeType6;
                        com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Initials(initials3 != null ? initials3 : ""), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "initials_avatar"), avatarSize, null, getHighSpeedVideoFpsRangesFor(avatarBadgeType6, startRestartGroup, (i5 >> 9) & 14), null, startRestartGroup, (com.paypal.pds.components.AvatarSize.$stable << 6) | 48 | ((i5 << 3) & 896) | (com.paypal.pds.components.AvatarBadge.$stable << 12), 40);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        avatarBadgeType3 = avatarBadgeType6;
                        if (!(activityAvatarType instanceof com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.IconActivityAvatar)) {
                            startRestartGroup.startReplaceGroup(-1207888766);
                            startRestartGroup.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        startRestartGroup.startReplaceGroup(1212150134);
                        com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.IconActivityAvatar iconActivityAvatar = (com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.IconActivityAvatar) activityAvatarType;
                        com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(iconActivityAvatar.getName()), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "icon_avatar"), avatarSize, Camera2StreamConfigurationMap(iconActivityAvatar.getName()), null, null, startRestartGroup, (com.paypal.pds.components.AvatarSize.$stable << 6) | 48 | ((i5 << 3) & 896), 48);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    avatarBadgeType2 = avatarBadgeType3;
                }
            }
            avatarBadgeType3 = avatarBadgeType4;
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            avatarBadgeType2 = avatarBadgeType3;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.common.PopulatePaypalActivityAvatarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.common.PopulatePaypalActivityAvatarKt.$r8$lambda$aHf9fqRdVgfoW0P3vYQXaIgKyx0(com.paypal.oslo.feature.activity.api.models.ActivityAvatarType.this, avatarSize, modifier, avatarBadgeType2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final com.paypal.pds.components.AvatarEmphasis Camera2StreamConfigurationMap(com.paypal.pds.core.Icon icon) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(icon, com.paypal.pds.core.Icon.Store.INSTANCE)) {
            return new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentUtilityInverse.INSTANCE, com.paypal.pds.core.Color.BackgroundUtilityEmphasis.INSTANCE);
        }
        return com.paypal.pds.components.AvatarEmphasis.Default.INSTANCE;
    }

    private static final com.paypal.pds.components.AvatarBadge getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.activity.domain.common.models.AvatarBadgeType avatarBadgeType, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(97535848);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(97535848, i, -1, "com.paypal.oslo.feature.activity.ui.common.getAvatarBadge (PopulatePaypalActivityAvatar.kt:116)");
        }
        if (avatarBadgeType == com.paypal.oslo.feature.activity.domain.common.models.AvatarBadgeType.VENMO) {
            com.paypal.oslo.core.commonui.components.AsyncImagePainter rememberAsyncImagePainter = com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.VENMO_BADGE_IMAGE_URL, null, null, null, null, composer, 6, 30);
            com.paypal.pds.components.AvatarBadge.Image image = ((com.paypal.oslo.core.commonui.components.AsyncImagePainter.State) androidx.compose.runtime.SnapshotStateKt.collectAsState(rememberAsyncImagePainter.getState(), null, composer, 0, 1).getValue()) instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Success ? new com.paypal.pds.components.AvatarBadge.Image(rememberAsyncImagePainter, new com.paypal.pds.components.BadgeStyle.Custom(com.paypal.pds.core.Color.BackgroundBase.INSTANCE, com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE)) : null;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return image;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return null;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aHf9fqRdVgfoW0P3vYQXaIgKyx0(com.paypal.oslo.feature.activity.api.models.ActivityAvatarType activityAvatarType, com.paypal.pds.components.AvatarSize avatarSize, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.activity.domain.common.models.AvatarBadgeType avatarBadgeType, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PopulatePaypalActivityAvatar(activityAvatarType, avatarSize, modifier, avatarBadgeType, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
