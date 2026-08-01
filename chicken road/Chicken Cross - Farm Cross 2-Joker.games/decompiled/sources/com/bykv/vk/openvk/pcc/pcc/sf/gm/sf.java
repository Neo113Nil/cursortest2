package com.bykv.vk.openvk.pcc.pcc.sf.gm;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* loaded from: classes5.dex */
public class sf extends com.bykv.vk.openvk.pcc.pcc.sf.gm.pcc {
    private final pcc gm;
    private com.bykv.vk.openvk.pcc.pcc.sf.pcc.pcc oo;
    private volatile boolean qf;
    private final MediaPlayer sf;
    private Surface vj;
    private final Object wh;

    public sf() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.wh = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.sf = mediaPlayer;
        }
        pcc(mediaPlayer);
        try {
            mediaPlayer.setAudioStreamType(3);
        } catch (Throwable unused) {
        }
        this.gm = new pcc(this);
        nac();
    }

    private void pcc(MediaPlayer mediaPlayer) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        try {
            Class<?> cls = Class.forName("android.media.MediaTimeProvider");
            Class<?> cls2 = Class.forName("android.media.SubtitleController");
            Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
            Object newInstance = cls2.getConstructor(Context.class, cls, Class.forName("android.media.SubtitleController$Listener")).newInstance(com.bykv.vk.openvk.pcc.pcc.pcc.gm.pcc(), null, null);
            Field declaredField = cls2.getDeclaredField("mHandler");
            declaredField.setAccessible(true);
            try {
                declaredField.set(newInstance, new Handler());
                declaredField.setAccessible(false);
                mediaPlayer.getClass().getMethod("setSubtitleAnchor", cls2, cls3).invoke(mediaPlayer, newInstance, null);
            } catch (Throwable unused) {
                declaredField.setAccessible(false);
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public void pcc(SurfaceHolder surfaceHolder) throws Throwable {
        synchronized (this.wh) {
            try {
                if (!this.qf && surfaceHolder != null && surfaceHolder.getSurface() != null && this.pcc) {
                    this.sf.setDisplay(surfaceHolder);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public void pcc(Surface surface) {
        lu();
        this.vj = surface;
        this.sf.setSurface(surface);
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.sf sfVar) throws Throwable {
        this.sf.setPlaybackParams(this.sf.getPlaybackParams().setSpeed(sfVar.pcc()));
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public PlaybackParams vj() throws IllegalStateException {
        return this.sf.getPlaybackParams();
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public void pcc(String str) throws Throwable {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (!TextUtils.isEmpty(scheme) && scheme.equalsIgnoreCase("file")) {
            this.sf.setDataSource(parse.getPath());
        } else {
            this.sf.setDataSource(str);
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public void pcc(FileDescriptor fileDescriptor) throws Throwable {
        this.sf.setDataSource(fileDescriptor);
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public synchronized void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar) {
        this.oo = com.bykv.vk.openvk.pcc.pcc.sf.pcc.pcc.pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.pcc(), gmVar);
        com.bykv.vk.openvk.pcc.pcc.sf.pcc.sf.gm.pcc(gmVar);
        this.sf.setDataSource(this.oo);
    }

    private void dax() {
        com.bykv.vk.openvk.pcc.pcc.sf.pcc.pcc pccVar = this.oo;
        if (pccVar != null) {
            try {
                pccVar.close();
            } catch (Throwable unused) {
            }
            this.oo = null;
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public void wh() throws Throwable {
        this.sf.start();
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public void qf() throws Throwable {
        this.sf.stop();
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public void kj() throws Throwable {
        this.sf.pause();
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public void vy() {
        MediaPlayer mediaPlayer = this.sf;
        if (mediaPlayer != null) {
            mediaPlayer.prepareAsync();
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public void sf(boolean z) throws Throwable {
        this.sf.setScreenOnWhilePlaying(z);
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public void pcc(long j, int i) throws Throwable {
        if (Build.VERSION.SDK_INT < 26) {
            this.sf.seekTo((int) j);
            return;
        }
        if (i == 0) {
            this.sf.seekTo((int) j, 0);
            return;
        }
        if (i == 1) {
            this.sf.seekTo((int) j, 1);
            return;
        }
        if (i == 2) {
            this.sf.seekTo((int) j, 2);
        } else if (i == 3) {
            this.sf.seekTo((int) j, 3);
        } else {
            this.sf.seekTo((int) j);
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public long ork() {
        try {
            return this.sf.getCurrentPosition();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public long vh() {
        try {
            return this.sf.getDuration();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public void tmg() throws Throwable {
        synchronized (this.wh) {
            if (!this.qf) {
                this.sf.release();
                this.qf = true;
                lu();
                dax();
                pcc();
                nac();
            }
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public void hc() throws Throwable {
        try {
            this.sf.reset();
        } catch (Throwable unused) {
        }
        dax();
        pcc();
        nac();
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public void gm(boolean z) throws Throwable {
        this.sf.setLooping(z);
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public void oo(boolean z) throws Throwable {
        MediaPlayer mediaPlayer = this.sf;
        if (mediaPlayer == null) {
            return;
        }
        if (z) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public int gbb() {
        MediaPlayer mediaPlayer = this.sf;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.sf.gm.gm
    public int jr() {
        MediaPlayer mediaPlayer = this.sf;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    private void nac() {
        this.sf.setOnPreparedListener(this.gm);
        this.sf.setOnBufferingUpdateListener(this.gm);
        this.sf.setOnCompletionListener(this.gm);
        this.sf.setOnSeekCompleteListener(this.gm);
        this.sf.setOnVideoSizeChangedListener(this.gm);
        this.sf.setOnErrorListener(this.gm);
        this.sf.setOnInfoListener(this.gm);
    }

    private static class pcc implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {
        private final WeakReference<sf> pcc;

        public pcc(sf sfVar) {
            this.pcc = new WeakReference<>(sfVar);
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                sf sfVar = this.pcc.get();
                if (sfVar != null) {
                    return sfVar.sf(i, i2);
                }
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                new Object[]{"onError: ", Integer.valueOf(i), Integer.valueOf(i2)};
                sf sfVar = this.pcc.get();
                if (sfVar != null) {
                    return sfVar.pcc(i, i2);
                }
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                sf sfVar = this.pcc.get();
                if (sfVar != null) {
                    sfVar.pcc(i, i2, 1, 1);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            try {
                sf sfVar = this.pcc.get();
                if (sfVar != null) {
                    sfVar.oo();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            try {
                sf sfVar = this.pcc.get();
                if (sfVar != null) {
                    sfVar.pcc(i);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            try {
                sf sfVar = this.pcc.get();
                if (sfVar != null) {
                    sfVar.gm();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            try {
                sf sfVar = this.pcc.get();
                if (sfVar != null) {
                    sfVar.sf();
                }
            } catch (Throwable unused) {
            }
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        lu();
    }

    private void lu() {
        try {
            Surface surface = this.vj;
            if (surface != null) {
                surface.release();
                this.vj = null;
            }
        } catch (Throwable unused) {
        }
    }
}
