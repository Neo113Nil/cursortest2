package com.google.android.exoplayer2.ui;

/* loaded from: classes3.dex */
public final class DownloadNotificationHelper {
    private static final int NULL_STRING_ID = 0;
    private final androidx.core.app.NotificationCompat.Builder notificationBuilder;

    public DownloadNotificationHelper(android.content.Context context, java.lang.String str) {
        this.notificationBuilder = new androidx.core.app.NotificationCompat.Builder(context.getApplicationContext(), str);
    }

    @java.lang.Deprecated
    public android.app.Notification buildProgressNotification(android.content.Context context, int i, android.app.PendingIntent pendingIntent, java.lang.String str, java.util.List<com.google.android.exoplayer2.offline.Download> list) {
        return buildProgressNotification(context, i, pendingIntent, str, list, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public android.app.Notification buildProgressNotification(android.content.Context context, int i, android.app.PendingIntent pendingIntent, java.lang.String str, java.util.List<com.google.android.exoplayer2.offline.Download> list, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        float f = 0.0f;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i8 = 0;
        boolean z8 = true;
        for (int i9 = 0; i9 < list.size(); i9++) {
            com.google.android.exoplayer2.offline.Download download = list.get(i9);
            int i10 = download.state;
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 5) {
                        z7 = true;
                    } else if (i10 != 7) {
                    }
                }
                float percentDownloaded = download.getPercentDownloaded();
                if (percentDownloaded != -1.0f) {
                    f += percentDownloaded;
                    z8 = false;
                }
                z6 |= download.getBytesDownloaded() > 0;
                i8++;
                z4 = true;
            } else {
                z5 = true;
            }
        }
        if (z4) {
            i4 = com.google.android.exoplayer2.core.R.string.exo_download_downloading;
        } else {
            if (z5 && i2 != 0) {
                if ((i2 & 2) != 0) {
                    i5 = com.google.android.exoplayer2.core.R.string.exo_download_paused_for_wifi;
                } else if ((i2 & 1) != 0) {
                    i5 = com.google.android.exoplayer2.core.R.string.exo_download_paused_for_network;
                } else {
                    i5 = com.google.android.exoplayer2.core.R.string.exo_download_paused;
                }
                i3 = i5;
                z = false;
            } else if (z7) {
                i4 = com.google.android.exoplayer2.core.R.string.exo_download_removing;
            } else {
                z = true;
                i3 = 0;
            }
            if (z) {
                i6 = 0;
                i7 = 0;
                z2 = false;
            } else if (z4) {
                int i11 = (int) (f / i8);
                if (z8 && z6) {
                    z3 = true;
                }
                i7 = i11;
                z2 = z3;
                i6 = 100;
            } else {
                i6 = 100;
                i7 = 0;
                z2 = true;
            }
            return buildNotification(context, i, pendingIntent, str, i3, i6, i7, z2, true, false);
        }
        i3 = i4;
        z = true;
        if (z) {
        }
        return buildNotification(context, i, pendingIntent, str, i3, i6, i7, z2, true, false);
    }

    public android.app.Notification buildDownloadCompletedNotification(android.content.Context context, int i, android.app.PendingIntent pendingIntent, java.lang.String str) {
        return buildEndStateNotification(context, i, pendingIntent, str, com.google.android.exoplayer2.core.R.string.exo_download_completed);
    }

    public android.app.Notification buildDownloadFailedNotification(android.content.Context context, int i, android.app.PendingIntent pendingIntent, java.lang.String str) {
        return buildEndStateNotification(context, i, pendingIntent, str, com.google.android.exoplayer2.core.R.string.exo_download_failed);
    }

    private android.app.Notification buildEndStateNotification(android.content.Context context, int i, android.app.PendingIntent pendingIntent, java.lang.String str, int i2) {
        return buildNotification(context, i, pendingIntent, str, i2, 0, 0, false, false, true);
    }

    private android.app.Notification buildNotification(android.content.Context context, int i, android.app.PendingIntent pendingIntent, java.lang.String str, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.notificationBuilder.setSmallIcon(i);
        this.notificationBuilder.setContentTitle(i2 == 0 ? null : context.getResources().getString(i2));
        this.notificationBuilder.setContentIntent(pendingIntent);
        this.notificationBuilder.setStyle(str != null ? new androidx.core.app.NotificationCompat.BigTextStyle().bigText(str) : null);
        this.notificationBuilder.setProgress(i3, i4, z);
        this.notificationBuilder.setOngoing(z2);
        this.notificationBuilder.setShowWhen(z3);
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 31) {
            com.google.android.exoplayer2.ui.DownloadNotificationHelper.Api31.setForegroundServiceBehavior(this.notificationBuilder);
        }
        return this.notificationBuilder.build();
    }

    private static final class Api31 {
        private Api31() {
        }

        public static void setForegroundServiceBehavior(androidx.core.app.NotificationCompat.Builder builder) {
            builder.setForegroundServiceBehavior(1);
        }
    }
}
