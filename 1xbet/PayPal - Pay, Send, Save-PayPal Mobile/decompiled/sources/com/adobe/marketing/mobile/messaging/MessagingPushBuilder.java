package com.adobe.marketing.mobile.messaging;

/* loaded from: classes7.dex */
class MessagingPushBuilder {
    MessagingPushBuilder() {
    }

    static /* synthetic */ androidx.core.app.NotificationCompat.Builder getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.MessagingPushPayload messagingPushPayload, androidx.core.app.NotificationCompat.Builder builder) {
        java.util.concurrent.ScheduledExecutorService newSingleThreadScheduledExecutor = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
        com.adobe.marketing.mobile.services.caching.CacheResult join = com.adobe.marketing.mobile.messaging.MessagingPushUtils.getHighSpeedVideoFpsRangesFor(newSingleThreadScheduledExecutor, messagingPushPayload.getImageUrl()).join();
        newSingleThreadScheduledExecutor.shutdown();
        if (join == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushBuilder", "Failed to download the rich media. A text only notification will be displayed.", new java.lang.Object[0]);
            return builder;
        }
        android.net.Uri highSpeedVideoFpsRanges = com.adobe.marketing.mobile.messaging.MessagingPushUtils.getHighSpeedVideoFpsRanges(join);
        if (highSpeedVideoFpsRanges == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushBuilder", "Failed to find cached rich media, uri not built.", new java.lang.Object[0]);
        } else {
            androidx.core.app.NotificationCompat.BigPictureStyle bigPictureStyle = new androidx.core.app.NotificationCompat.BigPictureStyle();
            bigPictureStyle.bigPicture(android.graphics.drawable.Icon.createWithContentUri(highSpeedVideoFpsRanges));
            builder.setStyle(bigPictureStyle);
        }
        return builder;
    }

    private static android.app.PendingIntent getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.MessagingPushPayload messagingPushPayload, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.content.Intent intent = new android.content.Intent(str);
        intent.setClass(context.getApplicationContext(), com.adobe.marketing.mobile.messaging.MessagingPushTrackerActivity.class);
        intent.setFlags(536870912);
        if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str2)) {
            intent.putExtra("actionUri", str2);
        }
        if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str3)) {
            intent.putExtra(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, str3);
        }
        if (messagingPushPayload != null) {
            messagingPushPayload.putDataInExtras(intent);
        }
        com.adobe.marketing.mobile.Messaging.addPushTrackingDetails(intent, messagingPushPayload.getMessageId(), messagingPushPayload.getData());
        return android.app.TaskStackBuilder.create(context).addNextIntentWithParentStack(intent).getPendingIntent(new java.util.Random().nextInt(), 201326592);
    }

    static android.app.Notification getHighSpeedVideoSizes(final com.adobe.marketing.mobile.MessagingPushPayload messagingPushPayload, android.content.Context context) {
        android.app.PendingIntent highSpeedVideoFpsRanges;
        android.app.PendingIntent highSpeedVideoFpsRanges2;
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService("notification");
        java.lang.String channelId = messagingPushPayload.getChannelId();
        if (channelId != null && notificationManager.getNotificationChannel(channelId) != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Channel exists for channel ID: ");
            sb.append(channelId);
            sb.append(". Using the same for push notification.");
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushBuilder", sb.toString(), new java.lang.Object[0]);
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Channel does not exist for channel ID obtained from payload ( ");
            sb2.append(channelId);
            sb2.append("). Using the Messaging Extension's default channel.");
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushBuilder", sb2.toString(), new java.lang.Object[0]);
            channelId = "AJOPushChannel";
            if (notificationManager.getNotificationChannel("AJOPushChannel") != null) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushBuilder", "Channel already exists for the default channel ID: AJOPushChannel", new java.lang.Object[0]);
            } else {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushBuilder", "Creating a new channel for the default channel ID: AJOPushChannel.", new java.lang.Object[0]);
                notificationManager.createNotificationChannel(new android.app.NotificationChannel("AJOPushChannel", "General Notifications", 3));
            }
        }
        final androidx.core.app.NotificationCompat.Builder builder = new androidx.core.app.NotificationCompat.Builder(context, channelId);
        builder.setContentTitle(messagingPushPayload.getTitle());
        builder.setContentText(messagingPushPayload.getBody());
        builder.setNumber(messagingPushPayload.getBadgeCount());
        builder.setPriority(messagingPushPayload.getNotificationPriority());
        builder.setAutoCancel(true);
        int highResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.messaging.MessagingPushUtils.getHighResolutionOutputSizeshNQ4ISI(messagingPushPayload.getIcon(), context);
        int smallIconResourceID = com.adobe.marketing.mobile.MobileCore.getSmallIconResourceID();
        if (highResolutionOutputSizeshNQ4ISI > 0) {
            builder.setSmallIcon(highResolutionOutputSizeshNQ4ISI);
        } else if (smallIconResourceID > 0) {
            builder.setSmallIcon(smallIconResourceID);
        } else {
            int Camera2StreamConfigurationMap = com.adobe.marketing.mobile.messaging.MessagingPushUtils.Camera2StreamConfigurationMap(context);
            if (Camera2StreamConfigurationMap <= 0) {
                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushBuilder", "No valid small icon found. Notification will not be displayed.", new java.lang.Object[0]);
            } else {
                builder.setSmallIcon(Camera2StreamConfigurationMap);
            }
        }
        int notificationVisibility = messagingPushPayload.getNotificationVisibility();
        if (notificationVisibility == -1) {
            builder.setVisibility(-1);
        } else if (notificationVisibility == 0) {
            builder.setVisibility(0);
        } else if (notificationVisibility == 1) {
            builder.setVisibility(1);
        } else {
            builder.setVisibility(0);
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.messaging.MessagingConstants.LOG_TAG, "MessagingPushBuilder", "Invalid visibility value received from the payload. Using the default visibility value.", new java.lang.Object[0]);
        }
        java.util.List<com.adobe.marketing.mobile.MessagingPushPayload.ActionButton> actionButtons = messagingPushPayload.getActionButtons();
        if (actionButtons != null && !actionButtons.isEmpty()) {
            for (com.adobe.marketing.mobile.MessagingPushPayload.ActionButton actionButton : actionButtons) {
                if (actionButton.getType() == com.adobe.marketing.mobile.MessagingPushPayload.ActionType.DEEPLINK || actionButton.getType() == com.adobe.marketing.mobile.MessagingPushPayload.ActionType.WEBURL) {
                    highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(messagingPushPayload, context, "Notification Button Clicked", actionButton.getLink(), actionButton.getLabel());
                } else {
                    highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(messagingPushPayload, context, "Notification Button Clicked", null, actionButton.getLabel());
                }
                builder.addAction(0, actionButton.getLabel(), highSpeedVideoFpsRanges2);
            }
        }
        if (!com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(messagingPushPayload.getSound())) {
            builder.setSound(com.adobe.marketing.mobile.messaging.MessagingPushUtils.Camera2StreamConfigurationMap(messagingPushPayload.getSound(), context));
        } else {
            builder.setSound(android.media.RingtoneManager.getDefaultUri(2));
        }
        if (messagingPushPayload.getActionType() == com.adobe.marketing.mobile.MessagingPushPayload.ActionType.DEEPLINK || messagingPushPayload.getActionType() == com.adobe.marketing.mobile.MessagingPushPayload.ActionType.WEBURL) {
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(messagingPushPayload, context, "Notification Opened", messagingPushPayload.getActionUri(), null);
        } else {
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(messagingPushPayload, context, "Notification Opened", null, null);
        }
        builder.setContentIntent(highSpeedVideoFpsRanges);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.adobe.marketing.mobile.messaging.NotificationInteractionReceiver.class);
        intent.setAction("Notification Dismissed");
        com.adobe.marketing.mobile.Messaging.addPushTrackingDetails(intent, messagingPushPayload.getMessageId(), messagingPushPayload.getData());
        builder.setDeleteIntent(android.app.PendingIntent.getBroadcast(context, new java.util.Random().nextInt(), intent, 201326592));
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(messagingPushPayload.getImageUrl())) {
            return builder.build();
        }
        if (android.os.Build.VERSION.SDK_INT < 34 || !com.adobe.marketing.mobile.messaging.MessagingPushUtils.getHighSpeedVideoFpsRanges(messagingPushPayload.getImageUrl())) {
            android.graphics.Bitmap highSpeedVideoSizes = com.adobe.marketing.mobile.messaging.MessagingPushUtils.getHighSpeedVideoSizes(messagingPushPayload.getImageUrl());
            if (highSpeedVideoSizes == null) {
                return builder.build();
            }
            androidx.core.app.NotificationCompat.BigPictureStyle bigPictureStyle = new androidx.core.app.NotificationCompat.BigPictureStyle();
            bigPictureStyle.bigPicture(highSpeedVideoSizes);
            builder.setStyle(bigPictureStyle);
            return builder.build();
        }
        return (android.app.Notification) java.util.concurrent.CompletableFuture.supplyAsync(new java.util.function.Supplier() { // from class: com.adobe.marketing.mobile.messaging.MessagingPushBuilder$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return com.adobe.marketing.mobile.messaging.MessagingPushBuilder.getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.MessagingPushPayload.this, builder);
            }
        }).thenApply(new java.util.function.Function() { // from class: com.adobe.marketing.mobile.messaging.MessagingPushBuilder$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                android.app.Notification build;
                build = ((androidx.core.app.NotificationCompat.Builder) obj).build();
                return build;
            }
        }).join();
    }
}
