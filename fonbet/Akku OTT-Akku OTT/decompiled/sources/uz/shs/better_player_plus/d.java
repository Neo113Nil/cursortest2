package uz.shs.better_player_plus;

import android.support.v4.media.session.MediaSessionCompat;
import androidx.core.app.NotificationCompat;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class d extends MediaSessionCompat.a {
    public final /* synthetic */ c f;

    public d(c cVar) {
        this.f = cVar;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void a(long j) {
        c cVar = this.f;
        ExoPlayer exoPlayer = cVar.c;
        if (exoPlayer != null) {
            exoPlayer.seekTo(j);
        }
        HashMap a = com.google.android.gms.ads.identifier.a.a(NotificationCompat.CATEGORY_EVENT, "seek");
        a.put("position", Long.valueOf(j));
        cVar.d.success(a);
    }
}
