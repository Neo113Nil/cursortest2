package com.paypal.oslo.feature.notificationcenter.ui;

@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0001¢\u0006\u0002\u0010\r\u001a\u001d\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0012\u001a\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001a\r\u0010\u0017\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0018\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"ElapsedTimeTestTag", "", "NotificationCenterItem", "", "notification", "Lcom/paypal/oslo/feature/notificationcenter/domain/model/Notification;", "timeProvider", "Lcom/paypal/oslo/feature/notificationcenter/domain/provider/TimeProvider;", "modifier", "Landroidx/compose/ui/Modifier;", "onNotificationOptionClick", "Lkotlin/Function0;", "onNotificationClick", "(Lcom/paypal/oslo/feature/notificationcenter/domain/model/Notification;Lcom/paypal/oslo/feature/notificationcenter/domain/provider/TimeProvider;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "rememberAvatarSource", "Lcom/paypal/pds/components/AvatarSource;", "isUrgent", "", "(ZLcom/paypal/oslo/feature/notificationcenter/domain/model/Notification;Landroidx/compose/runtime/Composer;I)Lcom/paypal/pds/components/AvatarSource;", "getListStyleForNotification", "Lcom/paypal/pds/components/ListStyle;", "textColor", "Lcom/paypal/pds/core/Color;", "NotificationCenterItemLightPreview", "(Landroidx/compose/runtime/Composer;I)V", "notification-center_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NotificationCenterItemKt {
    public static final java.lang.String ElapsedTimeTestTag = "ElapsedTime";

    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NotificationCenterItem(final com.paypal.oslo.feature.notificationcenter.domain.model.Notification notification, final com.paypal.oslo.feature.notificationcenter.domain.provider.TimeProvider timeProvider, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.pds.components.AvatarBadge.Pip pip;
        int i5;
        androidx.compose.runtime.internal.ComposableLambda composableLambda;
        com.paypal.pds.components.AvatarSource.Image image;
        final com.paypal.pds.components.AvatarSource avatarSource;
        java.lang.String iconIdentifier;
        com.paypal.pds.components.AvatarEmphasis.Default r7;
        com.paypal.pds.core.Color.ContentMuted contentMuted;
        boolean z;
        androidx.compose.runtime.internal.ComposableLambda composableLambda2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notification, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1424170775);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(notification) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(timeProvider) : startRestartGroup.changedInstance(timeProvider) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
            }
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1424170775, i4, -1, "com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterItem (NotificationCenterItem.kt:83)");
                }
                boolean isUrgent = com.paypal.oslo.feature.notificationcenter.domain.model.NotificationSectionTag.INSTANCE.isUrgent(notification.getSectionTag());
                com.paypal.pds.components.AvatarBadge.Pip pip2 = com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus.INSTANCE.isUnread(notification.getStatus()) ? new com.paypal.pds.components.AvatarBadge.Pip(com.paypal.pds.components.BadgeStyle.Info.INSTANCE) : null;
                int i7 = (i4 << 3) & 112;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-2133632628, i7, -1, "com.paypal.oslo.feature.notificationcenter.ui.rememberAvatarSource (NotificationCenterItem.kt:242)");
                }
                if (isUrgent) {
                    startRestartGroup.startReplaceGroup(-1828485815);
                    startRestartGroup.endReplaceGroup();
                    avatarSource = new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.Alert.INSTANCE);
                    pip = pip2;
                    i5 = i4;
                    composableLambda = null;
                } else {
                    if (notification.getIconType() == com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType.URL && (iconIdentifier = notification.getIconIdentifier()) != null && !kotlin.text.StringsKt.isBlank(iconIdentifier)) {
                        startRestartGroup.startReplaceGroup(-1828329358);
                        pip = pip2;
                        i5 = i4;
                        composableLambda = null;
                        com.paypal.pds.components.AvatarSource.Image image2 = new com.paypal.pds.components.AvatarSource.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(notification.getIconIdentifier(), null, com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(com.paypal.oslo.feature.notificationcenter.utils.NotificationCenterUtilsKt.FallbackAvatarUrl, null, null, null, null, startRestartGroup, 6, 30), null, null, null, startRestartGroup, 0, 58), null, 2, null);
                        startRestartGroup.endReplaceGroup();
                        image = image2;
                    } else {
                        pip = pip2;
                        i5 = i4;
                        composableLambda = null;
                        startRestartGroup.startReplaceGroup(-1828092952);
                        com.paypal.pds.components.AvatarSource.Image image3 = new com.paypal.pds.components.AvatarSource.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(com.paypal.oslo.feature.notificationcenter.utils.NotificationCenterUtilsKt.FallbackAvatarUrl, null, null, null, null, startRestartGroup, 6, 30), null, 2, null);
                        startRestartGroup.endReplaceGroup();
                        image = image3;
                    }
                    avatarSource = image;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                if (isUrgent) {
                    r7 = new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentBase.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleEmphasisNegative.INSTANCE);
                } else {
                    r7 = com.paypal.pds.components.AvatarEmphasis.Default.INSTANCE;
                }
                final com.paypal.pds.components.AvatarEmphasis avatarEmphasis = r7;
                com.paypal.oslo.feature.notificationcenter.utils.NotificationTimeStrings notificationTimeStrings = new com.paypal.oslo.feature.notificationcenter.utils.NotificationTimeStrings(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.notificationcenter.R.string.feature_notification_center_elapsed_time_now, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.notificationcenter.R.string.feature_notification_center_elapsed_time_minute, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.notificationcenter.R.string.feature_notification_center_elapsed_time_hour, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.notificationcenter.R.string.feature_notification_center_elapsed_time_day, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.notificationcenter.R.string.feature_notification_center_elapsed_time_week, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.notificationcenter.R.string.feature_notification_center_elapsed_time_month, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.notificationcenter.R.string.feature_notification_center_elapsed_time_year, startRestartGroup, 0));
                com.paypal.oslo.feature.notificationcenter.utils.NotificationTimeStrings notificationTimeStrings2 = new com.paypal.oslo.feature.notificationcenter.utils.NotificationTimeStrings(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.notificationcenter.R.string.feature_notification_center_elapsed_time_accessibility_now, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.notificationcenter.R.string.feature_notification_center_elapsed_time_accessibility_minute, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.notificationcenter.R.string.feature_notification_center_elapsed_time_accessibility_hour, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.notificationcenter.R.string.feature_notification_center_elapsed_time_accessibility_day, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.notificationcenter.R.string.feature_notification_center_elapsed_time_accessibility_week, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.notificationcenter.R.string.feature_notification_center_elapsed_time_accessibility_month, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.notificationcenter.R.string.feature_notification_center_elapsed_time_accessibility_year, startRestartGroup, 0));
                boolean changed = startRestartGroup.changed(notification.getNotificationId());
                boolean changed2 = startRestartGroup.changed(notificationTimeStrings);
                boolean changed3 = startRestartGroup.changed(notificationTimeStrings2);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changed | changed2 | changed3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    long currentTimeMillis = timeProvider.currentTimeMillis();
                    rememberedValue = kotlin.TuplesKt.to(com.paypal.oslo.feature.notificationcenter.utils.NotificationCenterUtilsKt.formatNotificationTime(notification.getCreatedTime(), currentTimeMillis, notificationTimeStrings), com.paypal.oslo.feature.notificationcenter.utils.NotificationCenterUtilsKt.formatNotificationTimeAccessibility(notification.getCreatedTime(), currentTimeMillis, notificationTimeStrings2));
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.Pair pair = (kotlin.Pair) rememberedValue;
                final java.lang.String str = (java.lang.String) pair.component1();
                final java.lang.String str2 = (java.lang.String) pair.component2();
                if (notification.getStatus() != com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus.CLICKED) {
                    contentMuted = com.paypal.pds.core.Color.ContentBase.INSTANCE;
                } else {
                    contentMuted = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                }
                com.paypal.pds.components.ListStyle listStyle = new com.paypal.pds.components.ListStyle(contentMuted, contentMuted, com.paypal.pds.core.Color.ContentBase.INSTANCE, com.paypal.pds.core.Color.ContentMuted.INSTANCE);
                if (str.length() == 0) {
                    startRestartGroup.startReplaceGroup(1787928983);
                    startRestartGroup.endReplaceGroup();
                    composableLambda2 = composableLambda;
                    z = true;
                } else {
                    startRestartGroup.startReplaceGroup(1787967578);
                    z = true;
                    androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-774994953, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterItemKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterItemKt.m15838$r8$lambda$luLiWuOqA2yQYR8VLobfFbBQAM(str2, str, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54);
                    startRestartGroup.endReplaceGroup();
                    composableLambda2 = rememberComposableLambda;
                }
                final com.paypal.pds.components.AvatarBadge.Pip pip3 = pip;
                composer2 = startRestartGroup;
                com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(notification.getTitle(), com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.pds.core.ModifierExtensionsKt.background(modifier3, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, ((i5 >> 6) & 14) | 48, 2), com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsTracker.INSTANCE.notificationComponentContext("clicked", notification)), notification.getDescription(), null, null, false, true, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1652668927, z, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterItemKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterItemKt.m15835$r8$lambda$BtLU53dobc6w2mvNg9BLB1p0fA(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(946275010, z, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterItemKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterItemKt.m15837$r8$lambda$dKTQTVle2OY8sMXuWqHnIdoU(com.paypal.pds.components.AvatarSource.this, avatarEmphasis, pip3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), composableLambda2, null, null, false, function02, null, null, listStyle, null, false, composer2, 114819072, ((i5 >> 3) & 7168) | (com.paypal.pds.components.ListStyle.$stable << 18), 449592);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterItemKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterItemKt.m15836$r8$lambda$YOybI5p12cCgCtUul6Myw4yDU4(com.paypal.oslo.feature.notificationcenter.domain.model.Notification.this, timeProvider, modifier4, function0, function02, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$6VmORgGCKT-uXqAH_JLP504rCGI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15834$r8$lambda$6VmORgGCKTuXqAH_JLP504rCGI(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$BtLU53do-bc6w2mvNg9BLB1p0fA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15835$r8$lambda$BtLU53dobc6w2mvNg9BLB1p0fA(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1652668927, i, -1, "com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterItem.<anonymous> (NotificationCenterItem.kt:209)");
            }
            com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.DotsVertical.INSTANCE, function0, androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.ui.Modifier.INSTANCE, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext[]{new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.MOBILE_NOTIFICATIONS, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Feature.NOTIFICATION_CENTER, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CONTEXT_MENU_OPENED), new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext("notification_context_menu", null)})), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Item.OVERFLOW_MENU_BUTTON, 0, 2, null)), "Options"), com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, null, "Options", null, false, false, composer, 199686, 464);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$YOy-bI5p12cCgCtUul6Myw4yDU4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15836$r8$lambda$YOybI5p12cCgCtUul6Myw4yDU4(com.paypal.oslo.feature.notificationcenter.domain.model.Notification notification, com.paypal.oslo.feature.notificationcenter.domain.provider.TimeProvider timeProvider, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        NotificationCenterItem(notification, timeProvider, modifier, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$dKTQTVle2O-Y8sMXuW-q-HnIdoU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15837$r8$lambda$dKTQTVle2OY8sMXuWqHnIdoU(com.paypal.pds.components.AvatarSource avatarSource, com.paypal.pds.components.AvatarEmphasis avatarEmphasis, com.paypal.pds.components.AvatarBadge.Pip pip, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(946275010, i, -1, "com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterItem.<anonymous> (NotificationCenterItem.kt:200)");
            }
            com.paypal.pds.components.AvatarKt.Avatar(avatarSource, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f)), null, avatarEmphasis, pip, null, composer, (com.paypal.pds.components.AvatarBadge.Pip.$stable << 12) | 48, 36);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$l-uLiWuOqA2yQYR8VLobfFbBQAM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15838$r8$lambda$luLiWuOqA2yQYR8VLobfFbBQAM(final java.lang.String str, java.lang.String str2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-774994953, i, -1, "com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterItem.<anonymous> (NotificationCenterItem.kt:174)");
            }
            com.paypal.pds.core.Typography.LabelSmall labelSmall = com.paypal.pds.core.Typography.LabelSmall.INSTANCE;
            com.paypal.pds.core.Color.ContentMuted contentMuted = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
            int m8501getEllipsisgIe3tQ8 = androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8501getEllipsisgIe3tQ8();
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, ElapsedTimeTestTag);
            boolean changed = composer.changed(str);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterItemKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterItemKt.m15834$r8$lambda$6VmORgGCKTuXqAH_JLP504rCGI(str, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(testTag, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), contentMuted, null, null, androidx.compose.ui.text.style.TextOverflow.m8488boximpl(m8501getEllipsisgIe3tQ8), false, 1, 0, null, labelSmall, composer, 12779904, 6, 856);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$n8rtaNLxUdmViMX9N938AZoMTwk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1739921527);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1739921527, updateChangedFlags, -1, "com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterItemLightPreview (NotificationCenterItem.kt:270)");
            }
            com.paypal.oslo.feature.notificationcenter.domain.model.Notification notification = new com.paypal.oslo.feature.notificationcenter.domain.model.Notification("notif1", "ALL", null, "75150515619548257013", "instance-3", "google_pay_card", "Add your PayPal Debit Card to Google Pay", "Leave your card at home and pay with your phone.", com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIconType.URL, "URL", "paypal://notificationCenter?source=dashboard", com.paypal.oslo.feature.notificationcenter.domain.model.NotificationStatus.PRESENTED, 1637097600000L, "f0hRGxJ4HHMTcRx9Vn4FMFZnXmwUABcMQQwfSScMJx9-HDEeZlJq67673gydgeuyfgduyzY8eFRrU2JeYwdAAkEZeBF3HXUbeEcrEG8kGSI");
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.notificationcenter.domain.provider.TimeProvider() { // from class: com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterItemKt$$ExternalSyntheticLambda4
                    @Override // com.paypal.oslo.feature.notificationcenter.domain.provider.TimeProvider
                    public final long currentTimeMillis() {
                        long currentTimeMillis;
                        currentTimeMillis = java.lang.System.currentTimeMillis();
                        return currentTimeMillis;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.notificationcenter.domain.provider.TimeProvider timeProvider = (com.paypal.oslo.feature.notificationcenter.domain.provider.TimeProvider) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterItemKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterItemKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            NotificationCenterItem(notification, timeProvider, null, function0, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 27648, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterItemKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterItemKt.$r8$lambda$n8rtaNLxUdmViMX9N938AZoMTwk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
