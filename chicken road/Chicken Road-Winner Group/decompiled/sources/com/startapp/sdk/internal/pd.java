package com.startapp.sdk.internal;

import android.media.MediaPlayer;
import android.os.Build;
import android.widget.ProgressBar;
import android.widget.VideoView;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer$MediaErrorExtra;
import com.startapp.sdk.ads.video.player.NativeVideoPlayer$MediaErrorType;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface$VideoPlayerErrorType;
import com.startapp.sdk.ads.video.tracking.VideoPausedTrackingParams;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import p1.C1166b;

/* loaded from: classes.dex */
public final class pd extends b2 implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnErrorListener {

    /* renamed from: g, reason: collision with root package name */
    public MediaPlayer f4213g;

    /* renamed from: h, reason: collision with root package name */
    public final VideoView f4214h;

    public pd(VideoView videoView) {
        this.f4214h = videoView;
        videoView.setOnPreparedListener(this);
        videoView.setOnCompletionListener(this);
        videoView.setOnErrorListener(this);
    }

    public final void a(String str) {
        this.f3481a = str;
        if (str != null) {
            try {
                this.f4214h.setVideoPath(str);
            } catch (Throwable th) {
                d9.a(th);
                onError(this.f4213g, 1, 0);
            }
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        com.startapp.sdk.ads.video.b bVar = this.f3484d;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i3, int i4) {
        ProgressBar progressBar;
        if (this.f3483c == null) {
            return false;
        }
        int currentPosition = mediaPlayer != null ? mediaPlayer.getCurrentPosition() : -1;
        yj yjVar = this.f3483c;
        VideoPlayerInterface$VideoPlayerErrorType videoPlayerInterface$VideoPlayerErrorType = (i3 == 100 ? NativeVideoPlayer$MediaErrorType.MEDIA_ERROR_SERVER_DIED : NativeVideoPlayer$MediaErrorType.MEDIA_ERROR_UNKNOWN) == NativeVideoPlayer$MediaErrorType.MEDIA_ERROR_SERVER_DIED ? VideoPlayerInterface$VideoPlayerErrorType.SERVER_DIED : VideoPlayerInterface$VideoPlayerErrorType.UNKNOWN;
        String obj = (i4 != -1010 ? i4 != -1007 ? i4 != -110 ? NativeVideoPlayer$MediaErrorExtra.MEDIA_ERROR_IO : NativeVideoPlayer$MediaErrorExtra.MEDIA_ERROR_TIMED_OUT : NativeVideoPlayer$MediaErrorExtra.MEDIA_ERROR_MALFORMED : NativeVideoPlayer$MediaErrorExtra.MEDIA_ERROR_UNSUPPORTED).toString();
        ak akVar = new ak(videoPlayerInterface$VideoPlayerErrorType, obj, currentPosition);
        com.startapp.sdk.ads.video.c cVar = yjVar.f4735a;
        if (cVar.L != null) {
            if (!cVar.f3061Z || cVar.f3064c0 > cVar.f3065d0 || currentPosition <= 0 || !obj.equals("MEDIA_ERROR_IO")) {
                yjVar.f4735a.a(akVar);
            } else {
                com.startapp.sdk.ads.video.c cVar2 = yjVar.f4735a;
                cVar2.f3064c0++;
                if (!cVar2.f0 && ((progressBar = cVar2.f3051P) == null || !progressBar.isShown())) {
                    cVar2.f3070j0.postDelayed(new pj(cVar2), AdsCommonMetaData.k().F().h());
                }
                com.startapp.sdk.ads.video.c cVar3 = yjVar.f4735a;
                cVar3.L.a(cVar3.x().getLocalVideoPath());
                yjVar.f4735a.L.a(currentPosition);
            }
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        MediaPlayer mediaPlayer2;
        C1166b c1166b;
        this.f4213g = mediaPlayer;
        mediaPlayer.setOnSeekCompleteListener(this);
        wj wjVar = this.f3482b;
        if (wjVar != null) {
            com.startapp.sdk.ads.video.c cVar = wjVar.f4612a;
            int i3 = cVar.f3067g0;
            if (i3 > 0) {
                pd pdVar = cVar.L;
                if (pdVar != null) {
                    pdVar.a(i3);
                }
                com.startapp.sdk.ads.video.c cVar2 = wjVar.f4612a;
                VideoPausedTrackingParams.PauseOrigin pauseOrigin = VideoPausedTrackingParams.PauseOrigin.EXTERNAL;
                sd sdVar = cVar2.f4588D;
                if (sdVar != null && (c1166b = sdVar.f4334c) != null) {
                    o1.i iVar = c1166b.f10235a;
                    X0.a.c(iVar);
                    iVar.f10172e.b("resume", null);
                }
                cVar2.a(cVar2.f3067g0, new VideoPausedTrackingParams(cVar2.f4435n, cVar2.a(cVar2.f3067g0), cVar2.f4585A, cVar2.f3057V, pauseOrigin, cVar2.f3069i0), "resumed", cVar2.x().getVideoTrackingDetails().n());
                cVar2.f3057V++;
            } else if (cVar.B()) {
                wjVar.f4612a.H();
            }
        }
        if (g0.b(this.f3481a) && (mediaPlayer2 = this.f4213g) != null) {
            mediaPlayer2.setOnBufferingUpdateListener(new od(this));
        } else {
            if (g0.b(this.f3481a)) {
                return;
            }
            ne.f4108a.f4164b = this.f;
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        vj vjVar = this.f3485e;
        if (vjVar != null) {
            vjVar.f4538a.H();
        }
    }

    public final void a(int i3) {
        try {
            MediaPlayer mediaPlayer = this.f4213g;
            if (mediaPlayer != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    mediaPlayer.seekTo(i3, 3);
                } else {
                    mediaPlayer.seekTo(i3);
                }
            }
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
