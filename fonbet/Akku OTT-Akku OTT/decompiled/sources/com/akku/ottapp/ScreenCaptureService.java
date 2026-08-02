package com.akku.ottapp;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.IBinder;
import androidx.compose.ui.graphics.u;
import androidx.core.app.NotificationCompat;
import com.haryanvi.netstream.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/akku/ottapp/ScreenCaptureService;", "Landroid/app/Service;", "<init>", "()V", "mediaProjection", "Landroid/media/projection/MediaProjection;", "onStartCommand", "", "intent", "Landroid/content/Intent;", "flags", "startId", "startForegroundService", "", "getPendingIntent", "Landroid/app/PendingIntent;", "onBind", "Landroid/os/IBinder;", "onDestroy", "app_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScreenCaptureService extends Service {
    public MediaProjection a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        MediaProjection mediaProjection = this.a;
        if (mediaProjection != null) {
            mediaProjection.stop();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int flags, int startId) {
        Integer valueOf = intent != null ? Integer.valueOf(intent.getIntExtra("resultCode", 0)) : null;
        Intent intent2 = intent != null ? (Intent) intent.getParcelableExtra("data") : null;
        if (valueOf == null || intent2 == null) {
            return 2;
        }
        Object systemService = getSystemService("media_projection");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
        this.a = ((MediaProjectionManager) systemService).getMediaProjection(valueOf.intValue(), intent2);
        if (Build.VERSION.SDK_INT >= 26) {
            androidx.browser.trusted.e.d();
            NotificationChannel b = u.b();
            NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(b);
            }
        }
        NotificationCompat.Builder smallIcon = new NotificationCompat.Builder(this, "ScreenCaptureServiceChannel").setContentTitle("Screen Capture Service").setContentText("Screen capture is running...").setSmallIcon(R.drawable.ic_notification);
        PendingIntent activity = PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) MainActivity.class), 67108864);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        Notification build = smallIcon.setContentIntent(activity).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        startForeground(1, build);
        return 2;
    }
}
