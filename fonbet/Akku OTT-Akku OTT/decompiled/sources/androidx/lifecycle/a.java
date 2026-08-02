package androidx.lifecycle;

import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.speech.SpeechRecognizer;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.exoplayer.ExoPlayer;
import com.csdcorp.speech_to_text.SpeechToTextPlugin;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        PlaybackStateCompat playbackStateCompat;
        switch (this.a) {
            case 0:
                ComputableLiveData.refreshRunnable$lambda$0((ComputableLiveData) this.b);
                return;
            case 1:
                SpeechToTextPlugin speechToTextPlugin = (SpeechToTextPlugin) this.b;
                speechToTextPlugin.getClass();
                SpeechRecognizer speechRecognizer = speechToTextPlugin.r;
                if (speechRecognizer != null) {
                    speechRecognizer.destroy();
                }
                speechToTextPlugin.r = null;
                return;
            default:
                uz.shs.better_player_plus.c cVar = (uz.shs.better_player_plus.c) this.b;
                ExoPlayer exoPlayer = cVar.c;
                if (exoPlayer == null || !exoPlayer.isPlaying()) {
                    i = 1;
                    ArrayList arrayList = new ArrayList();
                    ExoPlayer exoPlayer2 = cVar.c;
                    playbackStateCompat = new PlaybackStateCompat(2, exoPlayer2 != null ? exoPlayer2.getCurrentPosition() : 0L, 0L, 1.0f, 256L, 0, null, SystemClock.elapsedRealtime(), arrayList, -1L, null);
                    Intrinsics.checkNotNull(playbackStateCompat);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    ExoPlayer exoPlayer3 = cVar.c;
                    long currentPosition = exoPlayer3 != null ? exoPlayer3.getCurrentPosition() : 0L;
                    i = 1;
                    playbackStateCompat = new PlaybackStateCompat(3, currentPosition, 0L, 1.0f, 256L, 0, null, SystemClock.elapsedRealtime(), arrayList2, -1L, null);
                    Intrinsics.checkNotNull(playbackStateCompat);
                }
                MediaSessionCompat mediaSessionCompat = cVar.n;
                if (mediaSessionCompat != null) {
                    MediaSessionCompat.d dVar = mediaSessionCompat.a;
                    dVar.f = playbackStateCompat;
                    synchronized (dVar.d) {
                        for (int beginBroadcast = dVar.e.beginBroadcast() - i; beginBroadcast >= 0; beginBroadcast--) {
                            try {
                                dVar.e.getBroadcastItem(beginBroadcast).B(playbackStateCompat);
                            } catch (RemoteException unused) {
                            }
                        }
                        dVar.e.finishBroadcast();
                    }
                    MediaSession mediaSession = dVar.a;
                    if (playbackStateCompat.n == null) {
                        PlaybackState.Builder d = PlaybackStateCompat.b.d();
                        PlaybackStateCompat.b.x(d, playbackStateCompat.a, playbackStateCompat.b, playbackStateCompat.d, playbackStateCompat.j);
                        PlaybackStateCompat.b.u(d, playbackStateCompat.c);
                        PlaybackStateCompat.b.s(d, playbackStateCompat.e);
                        PlaybackStateCompat.b.v(d, playbackStateCompat.i);
                        for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.k) {
                            customAction.getClass();
                            PlaybackState.CustomAction.Builder e = PlaybackStateCompat.b.e(customAction.a, customAction.b, customAction.c);
                            PlaybackStateCompat.b.w(e, customAction.d);
                            PlaybackStateCompat.b.a(d, PlaybackStateCompat.b.b(e));
                        }
                        PlaybackStateCompat.b.t(d, playbackStateCompat.l);
                        PlaybackStateCompat.c.b(d, playbackStateCompat.m);
                        playbackStateCompat.n = PlaybackStateCompat.b.c(d);
                    }
                    mediaSession.setPlaybackState(playbackStateCompat.n);
                }
                Handler handler = cVar.j;
                if (handler != null) {
                    a aVar = cVar.k;
                    Intrinsics.checkNotNull(aVar);
                    handler.postDelayed(aVar, 1000L);
                    return;
                }
                return;
        }
    }
}
