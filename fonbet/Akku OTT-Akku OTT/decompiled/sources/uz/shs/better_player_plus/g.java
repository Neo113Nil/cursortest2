package uz.shs.better_player_plus;

import androidx.core.app.NotificationCompat;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements Player.Listener {
    public final /* synthetic */ c a;

    public g(c cVar) {
        this.a = cVar;
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i) {
        Format videoFormat;
        c cVar = this.a;
        ExoPlayer exoPlayer = cVar.c;
        n nVar = cVar.d;
        if (i == 2) {
            cVar.d(true);
            HashMap hashMap = new HashMap();
            hashMap.put(NotificationCompat.CATEGORY_EVENT, "bufferingStart");
            nVar.success(hashMap);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            HashMap a = com.google.android.gms.ads.identifier.a.a(NotificationCompat.CATEGORY_EVENT, "completed");
            a.put(Constants.KEY, cVar.h);
            nVar.success(a);
            return;
        }
        if (!cVar.f) {
            cVar.f = true;
            HashMap a2 = com.google.android.gms.ads.identifier.a.a(NotificationCompat.CATEGORY_EVENT, "initialized");
            a2.put(Constants.KEY, cVar.h);
            a2.put("duration", Long.valueOf(exoPlayer != null ? exoPlayer.getDuration() : 0L));
            if (exoPlayer != null && (videoFormat = exoPlayer.getVideoFormat()) != null) {
                int i2 = videoFormat.width;
                int i3 = videoFormat.height;
                int i4 = videoFormat.rotationDegrees;
                if (i4 == 90 || i4 == 270) {
                    i3 = i2;
                    i2 = i3;
                }
                a2.put("width", Integer.valueOf(i2));
                a2.put("height", Integer.valueOf(i3));
            }
            nVar.success(a2);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(NotificationCompat.CATEGORY_EVENT, "bufferingEnd");
        nVar.success(hashMap2);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.a.d.error("VideoError", "Video player had error " + error, "");
    }
}
