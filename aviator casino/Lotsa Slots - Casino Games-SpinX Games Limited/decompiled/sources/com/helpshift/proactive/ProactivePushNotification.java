package com.helpshift.proactive;

/* loaded from: classes5.dex */
public class ProactivePushNotification {
    public final java.lang.String analyticsId;
    public final com.helpshift.proactive.ProactiveActionEntity baseAction;
    public final java.lang.String bigText;
    public final java.util.List<com.helpshift.proactive.ProactivePushButton> buttons;
    public final java.lang.String clientProactiveEngageChannelId;
    public final java.lang.String clientProactiveSupportChannelId;
    public final java.lang.String content;
    public final int defaultLargeNotificationIconId;
    public final int defaultNotificationIconId;
    public final int defaultSoundId;
    public final long deliveryTime;
    public final java.lang.String largeImageUrl;
    public final java.lang.String notificationId;
    public final java.lang.String title;

    public ProactivePushNotification(java.lang.String str, java.lang.String str2, long j, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.helpshift.proactive.ProactiveActionEntity proactiveActionEntity, java.util.List<com.helpshift.proactive.ProactivePushButton> list, int i, int i2, int i3, java.lang.String str7, java.lang.String str8) {
        this.notificationId = str;
        this.analyticsId = str2;
        this.deliveryTime = j;
        this.title = str3;
        this.content = str4;
        this.bigText = str5;
        this.largeImageUrl = str6;
        this.baseAction = proactiveActionEntity;
        this.buttons = list;
        this.defaultNotificationIconId = i;
        this.defaultLargeNotificationIconId = i2;
        this.defaultSoundId = i3;
        this.clientProactiveSupportChannelId = str7;
        this.clientProactiveEngageChannelId = str8;
    }
}
