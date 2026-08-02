package com.google.firebase.messaging;

/* loaded from: classes4.dex */
class DisplayNotification {
    private static final int IMAGE_DOWNLOAD_TIMEOUT_SECONDS = 5;
    private final android.content.Context context;
    private final java.util.concurrent.ExecutorService networkIoExecutor;
    private final com.google.firebase.messaging.NotificationParams params;

    public DisplayNotification(android.content.Context context, com.google.firebase.messaging.NotificationParams notificationParams, java.util.concurrent.ExecutorService executorService) {
        this.networkIoExecutor = executorService;
        this.context = context;
        this.params = notificationParams;
    }

    private boolean isAppForeground() {
        if (((android.app.KeyguardManager) this.context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop()) {
            android.os.SystemClock.sleep(10L);
        }
        int myPid = android.os.Process.myPid();
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) this.context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            java.util.Iterator<android.app.ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                android.app.ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == myPid) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean handleNotification() {
        if (this.params.getBoolean(com.google.firebase.messaging.Constants.MessageNotificationKeys.NO_UI)) {
            return true;
        }
        if (isAppForeground()) {
            return false;
        }
        com.google.firebase.messaging.ImageDownload startImageDownloadInBackground = startImageDownloadInBackground();
        com.google.firebase.messaging.CommonNotificationBuilder.DisplayNotificationInfo createNotificationInfo = com.google.firebase.messaging.CommonNotificationBuilder.createNotificationInfo(this.context, this.params);
        waitForAndApplyImageDownload(createNotificationInfo.notificationBuilder, startImageDownloadInBackground);
        showNotification(createNotificationInfo);
        return true;
    }

    private com.google.firebase.messaging.ImageDownload startImageDownloadInBackground() {
        com.google.firebase.messaging.ImageDownload create = com.google.firebase.messaging.ImageDownload.create(this.params.getString(com.google.firebase.messaging.Constants.MessageNotificationKeys.IMAGE_URL));
        if (create != null) {
            create.start(this.networkIoExecutor);
        }
        return create;
    }

    private void waitForAndApplyImageDownload(androidx.core.app.NotificationCompat.Builder builder, com.google.firebase.messaging.ImageDownload imageDownload) {
        if (imageDownload != null) {
            try {
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) com.google.android.gms.tasks.Tasks.await(imageDownload.getTask(), 5L, java.util.concurrent.TimeUnit.SECONDS);
                builder.setLargeIcon(bitmap);
                builder.setStyle(new androidx.core.app.NotificationCompat.BigPictureStyle().bigPicture(bitmap).bigLargeIcon((android.graphics.Bitmap) null));
            } catch (java.lang.InterruptedException unused) {
                imageDownload.close();
                java.lang.Thread.currentThread().interrupt();
            } catch (java.util.concurrent.ExecutionException e) {
                e.getCause();
            } catch (java.util.concurrent.TimeoutException unused2) {
                imageDownload.close();
            }
        }
    }

    private void showNotification(com.google.firebase.messaging.CommonNotificationBuilder.DisplayNotificationInfo displayNotificationInfo) {
        ((android.app.NotificationManager) this.context.getSystemService("notification")).notify(displayNotificationInfo.tag, displayNotificationInfo.id, displayNotificationInfo.notificationBuilder.build());
    }
}
