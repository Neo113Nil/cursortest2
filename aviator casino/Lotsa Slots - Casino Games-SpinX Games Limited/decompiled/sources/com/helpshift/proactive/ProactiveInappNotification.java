package com.helpshift.proactive;

/* loaded from: classes5.dex */
public class ProactiveInappNotification {
    public final java.lang.String analyticsId;
    public final java.lang.String boldFontUrl;
    public final java.lang.String boldItalicsFontUrl;
    public final int defaultNotificationIconId;
    public final int defaultSoundId;
    public final long deliveryTime;
    public final int dismissAfter;
    public final java.lang.String encodedNotificationPayload;
    public final long expiry;
    public final java.lang.String fallbackPushNotificationText;
    public final java.lang.String fallbackPushNotificationTitle;
    public final org.json.JSONObject inAppData;
    public final boolean isDefaultNotificationEnabled;
    public final java.lang.String italicsFontUrl;
    public final java.lang.String notificationId;
    public final java.lang.String position;
    public final java.lang.String regularFontUrl;
    public final boolean rtl;
    public final boolean shouldDismiss;
    public final long showAfter;
    public final java.lang.String supportEngageChannelId;
    public final com.helpshift.proactive.InAppViewConstants.InAppNotificationType type;
    public long viewTime = 0;

    public ProactiveInappNotification(java.lang.String str, java.lang.String str2, java.lang.String str3, com.helpshift.proactive.InAppViewConstants.InAppNotificationType inAppNotificationType, java.lang.String str4, int i, boolean z, org.json.JSONObject jSONObject, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, boolean z2, long j, long j2, long j3, java.lang.String str9, java.lang.String str10, int i2, int i3, java.lang.String str11, boolean z3) {
        this.encodedNotificationPayload = str;
        this.notificationId = str2;
        this.analyticsId = str3;
        this.inAppData = jSONObject;
        this.type = inAppNotificationType;
        this.position = str4;
        this.dismissAfter = i;
        this.shouldDismiss = z;
        this.regularFontUrl = str5;
        this.boldFontUrl = str6;
        this.italicsFontUrl = str7;
        this.boldItalicsFontUrl = str8;
        this.rtl = z2;
        this.deliveryTime = j;
        this.expiry = j2;
        this.showAfter = j3;
        this.defaultNotificationIconId = i2;
        this.defaultSoundId = i3;
        this.supportEngageChannelId = str11;
        this.fallbackPushNotificationTitle = str10;
        this.fallbackPushNotificationText = str9;
        this.isDefaultNotificationEnabled = z3;
    }

    public boolean isExpired() {
        return this.expiry < java.lang.System.currentTimeMillis();
    }

    public void setViewTime(long j) {
        this.viewTime = j;
    }
}
