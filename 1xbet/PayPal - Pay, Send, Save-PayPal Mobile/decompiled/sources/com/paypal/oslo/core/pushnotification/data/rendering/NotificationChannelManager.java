package com.paypal.oslo.core.pushnotification.data.rendering;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\b*\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/data/rendering/NotificationChannelManager;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationChannel;", "channel", "", "getOrCreateChannelId", "(Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationChannel;)Ljava/lang/String;", "Landroid/app/NotificationChannel;", "p0", "", "Camera2StreamConfigurationMap", "(Landroid/app/NotificationChannel;)Z", "Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationChannel$Default;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationChannel$Default;)Ljava/lang/String;", "getHighSpeedVideoSizes", "Landroid/content/Context;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/app/NotificationManager;", "getHighSpeedVideoFpsRangesFor", "Landroid/app/NotificationManager;", "", "Ljava/util/Set;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NotificationChannelManager {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges;
    private final android.app.NotificationManager getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public NotificationChannelManager(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighResolutionOutputSizeshNQ4ISI = context;
        java.lang.Object systemService = context.getSystemService("notification");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        this.getHighSpeedVideoFpsRangesFor = (android.app.NotificationManager) systemService;
        this.getHighSpeedVideoFpsRanges = new java.util.LinkedHashSet();
    }

    public final java.lang.String getOrCreateChannelId(com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel channel) {
        kotlin.Triple triple;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(channel, "");
        int i = 4;
        if (channel instanceof com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default) {
            com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default r9 = (com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default) channel;
            java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(r9);
            java.lang.String highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(r9);
            if (!this.getHighSpeedVideoFpsRanges.contains(highSpeedVideoFpsRanges2)) {
                int i2 = com.paypal.oslo.core.pushnotification.data.rendering.NotificationChannelManager.WhenMappings.$EnumSwitchMapping$0[r9.ordinal()];
                if (i2 == 1) {
                    triple = new kotlin.Triple("General Notifications", "General app notifications", 3);
                } else {
                    if (i2 != 2) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    triple = new kotlin.Triple("Important Notifications", "Time-sensitive and important notifications", 4);
                }
                java.lang.String str = (java.lang.String) triple.component1();
                java.lang.String str2 = (java.lang.String) triple.component2();
                android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel(highSpeedVideoFpsRanges2, str, ((java.lang.Number) triple.component3()).intValue());
                notificationChannel.setDescription(str2);
                notificationChannel.enableVibration(true);
                notificationChannel.setShowBadge(true);
                if (Camera2StreamConfigurationMap(notificationChannel)) {
                    this.getHighSpeedVideoFpsRanges.add(highSpeedVideoFpsRanges2);
                }
            }
            return highSpeedVideoFpsRanges;
        }
        if (!(channel instanceof com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Custom)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Custom custom = (com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Custom) channel;
        if (!this.getHighSpeedVideoFpsRanges.contains(custom.getId())) {
            java.lang.String id = custom.getId();
            java.lang.String name2 = custom.getName();
            int i3 = com.paypal.oslo.core.pushnotification.data.rendering.NotificationChannelManager.WhenMappings.$EnumSwitchMapping$1[custom.getImportance().ordinal()];
            if (i3 == 1) {
                i = 0;
            } else if (i3 == 2) {
                i = 2;
            } else if (i3 == 3) {
                i = 3;
            } else if (i3 != 4) {
                i = 5;
                if (i3 != 5) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            android.app.NotificationChannel notificationChannel2 = new android.app.NotificationChannel(id, name2, i);
            notificationChannel2.setDescription(custom.getDescription());
            notificationChannel2.enableVibration(custom.getEnableVibration());
            notificationChannel2.setShowBadge(custom.getShowBadge());
            if (Camera2StreamConfigurationMap(notificationChannel2)) {
                this.getHighSpeedVideoFpsRanges.add(custom.getId());
            }
        }
        return custom.getId();
    }

    private final boolean Camera2StreamConfigurationMap(android.app.NotificationChannel p0) {
        try {
            this.getHighSpeedVideoFpsRangesFor.createNotificationChannel(p0);
            return true;
        } catch (java.lang.RuntimeException e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.pushnotification.LoggerKt.log, "Failed to create notification channel", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("channelId", p0.getId())), null, e, 4, null);
            return false;
        }
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default r1) {
        int i = com.paypal.oslo.core.pushnotification.data.rendering.NotificationChannelManager.WhenMappings.$EnumSwitchMapping$0[r1.ordinal()];
        if (i == 1) {
            return "oslo_push_general";
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return "oslo_push_important";
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default.values().length];
            try {
                iArr[com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default.GENERAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.pushnotification.domain.notification.NotificationChannel.Default.IMPORTANT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance.values().length];
            try {
                iArr2[com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance.LOW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance.DEFAULT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance.HIGH.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance.MAX.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
