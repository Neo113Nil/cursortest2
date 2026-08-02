package com.odehbros.flutter_file_downloader.notificationService;

import android.R;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.compose.ui.graphics.C0231g;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import java.util.Locale;
import java.util.Random;

/* loaded from: classes4.dex */
public final class a {
    public final int a;
    public final int b;
    public final Context c;
    public String d;

    public a(Activity activity, String str, b bVar) {
        this.c = activity;
        this.d = str;
        int nextInt = new Random().nextInt();
        this.a = nextInt;
        this.b = nextInt + 1;
    }

    public final NotificationCompat.Builder a(String str) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.c;
        if (i >= 26) {
            NotificationChannel a = str.equals("DOWNLOADING_CHANNEL") ? C0231g.a(str) : androidx.browser.trusted.b.b(str);
            a.setLightColor(-16776961);
            a.setLockscreenVisibility(0);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(a);
            }
        }
        return new NotificationCompat.Builder(context, str);
    }

    public final void b(boolean z) {
        Context context = this.c;
        if (ContextCompat.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") != 0) {
            return;
        }
        String str = z ? "Download completed." : "Download failed.";
        int i = z ? R.drawable.stat_sys_download_done : R.drawable.stat_notify_error;
        NotificationManagerCompat from = NotificationManagerCompat.from(context);
        from.cancel(this.a);
        NotificationCompat.Builder a = a("DOWNLOAD_DONE_CHANNEL");
        a.setContentTitle(this.d);
        a.setSmallIcon(i);
        a.setOngoing(false);
        a.setAutoCancel(true);
        a.setContentText(str);
        a.setProgress(0, 0, false);
        try {
            from.notify(this.b, a.build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void c(double d) {
        Context context = this.c;
        if (ContextCompat.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") != 0) {
            return;
        }
        NotificationManagerCompat from = NotificationManagerCompat.from(context);
        Intent intent = new Intent();
        int i = this.a;
        PendingIntent activity = PendingIntent.getActivity(context, i, intent, 201326592);
        NotificationCompat.Builder a = a("DOWNLOADING_CHANNEL");
        a.setContentIntent(activity);
        a.setTicker("Start downloading from the server");
        a.setOngoing(true);
        a.setAutoCancel(false);
        a.setSilent(false);
        a.setSmallIcon(R.drawable.stat_sys_download);
        a.setContentTitle(this.d);
        a.setContentText(String.format(Locale.ENGLISH, "Downloading %2.1f%%", Double.valueOf(d)));
        a.setProgress(100, (int) d, false);
        try {
            from.notify(i, a.build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
