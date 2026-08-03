package org.cocos2dx.bole.sdk.firebase;

/* loaded from: classes6.dex */
public class NotificationSender {
    static java.lang.String TAG = "FirebaseSDK";
    static java.lang.String channelId = "default_notification";
    static java.lang.String pushId = "push_id";
    static java.util.Random random = new java.util.Random();
    private android.content.Context context;
    private boolean isChannelCreate = false;
    android.os.Bundle pushData = null;

    public NotificationSender(android.content.Context context) {
        this.context = context;
    }

    public int send(android.os.Bundle bundle) {
        this.pushData = bundle;
        for (java.lang.String str : bundle.keySet()) {
            android.util.Log.d(TAG, "delay payload: " + str + com.ironsource.X3.j.b + bundle.get(str));
        }
        send();
        return this.pushData.getInt("push_id");
    }

    public int send(org.json.JSONObject jSONObject) throws org.json.JSONException {
        this.pushData = new android.os.Bundle();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            this.pushData.putString(next, jSONObject.getString(next));
        }
        send();
        return this.pushData.getInt(pushId);
    }

    public int send(java.util.Map<java.lang.String, java.lang.String> map) {
        this.pushData = new android.os.Bundle();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            this.pushData.putString(entry.getKey(), entry.getValue());
            android.util.Log.d(TAG, "payload: " + entry.getKey() + com.ironsource.X3.j.b + entry.getValue());
        }
        send();
        return this.pushData.getInt(pushId);
    }

    private void send() {
        try {
            this.pushData.putInt(pushId, random.nextInt());
            if (this.pushData.containsKey("eventTime")) {
                sendDelayNotification();
            } else if (!org.cocos2dx.bole.sdk.SDKHelper.isForeground()) {
                if (!this.pushData.containsKey("onlybg") && !this.pushData.containsKey("bigPicture")) {
                    sendNotification();
                }
                new java.lang.Thread(new java.lang.Runnable() { // from class: org.cocos2dx.bole.sdk.firebase.NotificationSender.1
                    @Override // java.lang.Runnable
                    public void run() {
                        org.cocos2dx.bole.sdk.firebase.NotificationSender.this.sendImgNotification();
                    }
                }).start();
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void cancel(int i, android.content.Context context) {
        ((android.app.AlarmManager) context.getSystemService(androidx.core.app.NotificationCompat.CATEGORY_ALARM)).cancel(android.app.PendingIntent.getBroadcast(context, i, new android.content.Intent(context, (java.lang.Class<?>) org.cocos2dx.bole.sdk.firebase.NotificationReceiver.class), androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL));
    }

    public void sendDelayNotification() {
        long parseLong = java.lang.Long.parseLong(this.pushData.getString("eventTime")) * 1000;
        this.pushData.remove("eventTime");
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) this.context.getSystemService(androidx.core.app.NotificationCompat.CATEGORY_ALARM);
        android.content.Intent intent = new android.content.Intent(this.context, (java.lang.Class<?>) org.cocos2dx.bole.sdk.firebase.NotificationReceiver.class);
        intent.putExtra(com.adjust.sdk.Constants.PUSH, this.pushData);
        android.app.PendingIntent broadcast = android.app.PendingIntent.getBroadcast(this.context, this.pushData.getInt(pushId), intent, androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        android.util.Log.d(TAG, "sendDelayNotification: " + parseLong);
        alarmManager.set(1, parseLong, broadcast);
    }

    public int getLayoutId(java.lang.String str) {
        return this.context.getResources().getIdentifier(str, "layout", this.context.getPackageName());
    }

    public int getId(java.lang.String str) {
        return this.context.getResources().getIdentifier(str, "id", this.context.getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendImgNotification() {
        try {
            androidx.core.app.NotificationCompat.Builder notifyBuilder = getNotifyBuilder();
            if (this.pushData.containsKey("onlybg")) {
                android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream(new java.net.URL(this.pushData.getString("bg1")).openConnection().getInputStream());
                android.graphics.Bitmap decodeStream2 = android.graphics.BitmapFactory.decodeStream(new java.net.URL(this.pushData.getString("bg2")).openConnection().getInputStream());
                android.widget.RemoteViews remoteViews = new android.widget.RemoteViews(this.context.getPackageName(), getLayoutId("notify_bg"));
                remoteViews.setImageViewBitmap(getId("os_bgimage_notif_bgimage"), decodeStream);
                notifyBuilder.setCustomContentView(remoteViews);
                android.widget.RemoteViews remoteViews2 = new android.widget.RemoteViews(this.context.getPackageName(), getLayoutId("notify_bg_big"));
                remoteViews2.setImageViewBitmap(getId("imageView"), decodeStream2);
                notifyBuilder.setCustomBigContentView(remoteViews2);
                notifyBuilder.setStyle(null);
            } else {
                android.graphics.Bitmap decodeStream3 = android.graphics.BitmapFactory.decodeStream(new java.net.URL(this.pushData.getString("bigPicture")).openConnection().getInputStream());
                androidx.core.app.NotificationCompat.BigPictureStyle bigPictureStyle = new androidx.core.app.NotificationCompat.BigPictureStyle();
                bigPictureStyle.bigPicture(decodeStream3);
                notifyBuilder.setStyle(bigPictureStyle);
            }
            sendNotification(notifyBuilder.build());
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    private androidx.core.app.NotificationCompat.Builder getNotifyBuilder() throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
        android.app.PendingIntent activity;
        int i = this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128).metaData.getInt(com.google.firebase.messaging.CommonNotificationBuilder.METADATA_DEFAULT_ICON);
        if (this.pushData.containsKey("url")) {
            activity = android.app.PendingIntent.getActivity(this.context, this.pushData.getInt(pushId), new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(this.pushData.getString("url"))), 201326592);
        } else {
            android.content.Intent intent = new android.content.Intent(this.context, (java.lang.Class<?>) org.cocos2dx.lua.AppActivity.class);
            intent.setAction("android.intent.action.VIEW");
            if (android.os.Build.VERSION.SDK_INT >= 24 && android.os.Build.VERSION.SDK_INT <= 25) {
                intent.setFlags(335544320);
            }
            intent.putExtras(this.pushData);
            activity = android.app.PendingIntent.getActivity(this.context, this.pushData.getInt(pushId), intent, 201326592);
        }
        androidx.core.app.NotificationCompat.Builder visibility = new androidx.core.app.NotificationCompat.Builder(this.context, channelId).setSmallIcon(i).setContentTitle(this.pushData.getString("title")).setContentText(this.pushData.getString("body")).setAutoCancel(true).setSound(getSound()).setContentIntent(activity).setNumber(1).setPriority(4).setVisibility(1);
        if (this.pushData.containsKey("largeIcon")) {
            visibility.setLargeIcon(android.graphics.BitmapFactory.decodeStream(new java.net.URL(this.pushData.getString("largeIcon")).openConnection().getInputStream()));
        }
        return visibility;
    }

    private void sendNotification() {
        try {
            sendNotification(getNotifyBuilder().build());
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    private void sendNotification(android.app.Notification notification) {
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) this.context.getSystemService(com.helpshift.util.ConfigValues.SOURCE_NOTIFICATION);
        if (android.os.Build.VERSION.SDK_INT >= 26 && !this.isChannelCreate) {
            this.isChannelCreate = true;
            android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel(notification.getChannelId(), "Lotsa Slots", 4);
            notificationChannel.setSound(getSound(), null);
            notificationChannel.setLockscreenVisibility(1);
            notificationChannel.setImportance(4);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        int i = this.pushData.getInt(pushId);
        notificationManager.notify(i, notification);
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) this.context.getSystemService(androidx.core.app.NotificationCompat.CATEGORY_ALARM);
        android.content.Intent intent = new android.content.Intent(this.context, (java.lang.Class<?>) org.cocos2dx.bole.sdk.firebase.NotificationReceiver.class);
        intent.putExtra("pushid", i);
        alarmManager.set(1, java.lang.System.currentTimeMillis() + 86400000, android.app.PendingIntent.getBroadcast(this.context, i, intent, androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL));
    }

    private android.net.Uri getSound() {
        java.lang.String str;
        android.net.Uri uri;
        if (!this.pushData.containsKey("sound")) {
            str = "n3";
        } else {
            str = this.pushData.getString("sound");
            java.lang.String[] split = str.split("\\.");
            if (split.length > 0) {
                str = split[0];
            }
        }
        int identifier = this.context.getResources().getIdentifier(str, "raw", this.context.getPackageName());
        if (identifier != 0) {
            uri = android.net.Uri.parse("android.resource://" + this.context.getPackageName() + com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING + identifier);
        } else {
            uri = null;
        }
        return uri == null ? android.media.RingtoneManager.getDefaultUri(2) : uri;
    }
}
