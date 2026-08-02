package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import I2.P;
import J2.j;
import M4.e;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import e1.k;
import e6.C1054c;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzcaa extends zzcac implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    private static final Map zzc;
    private final zzcaw zzd;
    private final zzcax zze;
    private final boolean zzf;
    private final zzdqq zzg;
    private int zzh;
    private int zzi;
    private MediaPlayer zzj;
    private Uri zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private zzcau zzo;
    private final boolean zzp;
    private int zzq;
    private zzcab zzr;
    private boolean zzs;
    private Integer zzt;

    static {
        HashMap hashMap = new HashMap();
        zzc = hashMap;
        hashMap.put(-1004, "MEDIA_ERROR_IO");
        hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
        hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzcaa(Context context, zzcaw zzcawVar, boolean z4, boolean z7, zzcav zzcavVar, zzcax zzcaxVar, zzdqq zzdqqVar) {
        super(context);
        this.zzh = 0;
        this.zzi = 0;
        this.zzs = false;
        this.zzt = null;
        this.zzd = zzcawVar;
        this.zze = zzcaxVar;
        this.zzp = z4;
        this.zzf = z7;
        zzcaxVar.zza(this);
        this.zzg = zzdqqVar;
    }

    private final void zzD() {
        zzdqq zzdqqVar;
        J.k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzk == null || surfaceTexture == null) {
            return;
        }
        zzE(false);
        try {
            o oVar = o.f1952C;
            e eVar = oVar.f1973t;
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.zzj = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.zzj.setOnCompletionListener(this);
            this.zzj.setOnErrorListener(this);
            this.zzj.setOnInfoListener(this);
            this.zzj.setOnPreparedListener(this);
            this.zzj.setOnVideoSizeChangedListener(this);
            this.zzn = 0;
            if (this.zzp) {
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zznh)).booleanValue() && (zzdqqVar = this.zzg) != null) {
                    zzdqp zza = zzdqqVar.zza();
                    zza.zzb("action", "svp_ampv");
                    zza.zzj();
                }
                zzcau zzcauVar = new zzcau(getContext());
                this.zzo = zzcauVar;
                zzcauVar.zzd(surfaceTexture, getWidth(), getHeight());
                zzcau zzcauVar2 = this.zzo;
                zzcauVar2.start();
                SurfaceTexture zzb = zzcauVar2.zzb();
                if (zzb != null) {
                    surfaceTexture = zzb;
                } else {
                    this.zzo.zze();
                    this.zzo = null;
                }
            }
            this.zzj.setDataSource(getContext(), this.zzk);
            C1054c c1054c = oVar.f1974u;
            this.zzj.setSurface(new Surface(surfaceTexture));
            this.zzj.setAudioStreamType(3);
            this.zzj.setScreenOnWhilePlaying(true);
            this.zzj.prepareAsync();
            zzF(1);
        } catch (IOException e7) {
            e = e7;
            j.h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzk)), e);
            onError(this.zzj, 1, 0);
        } catch (IllegalArgumentException e8) {
            e = e8;
            j.h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzk)), e);
            onError(this.zzj, 1, 0);
        } catch (IllegalStateException e9) {
            e = e9;
            j.h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzk)), e);
            onError(this.zzj, 1, 0);
        }
    }

    private final void zzE(boolean z4) {
        J.k("AdMediaPlayerView release");
        zzcau zzcauVar = this.zzo;
        if (zzcauVar != null) {
            zzcauVar.zze();
            this.zzo = null;
        }
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.zzj.release();
            this.zzj = null;
            zzF(0);
            if (z4) {
                this.zzi = 0;
            }
        }
    }

    private final void zzF(int i7) {
        if (i7 == 3) {
            this.zze.zzc();
            this.zzb.zzb();
        } else if (this.zzh == 3) {
            this.zze.zze();
            this.zzb.zzc();
        }
        this.zzh = i7;
    }

    private final void zzG(float f7) {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f7, f7);
            } catch (IllegalStateException unused) {
            }
        } else {
            int i7 = J.f3546b;
            j.g("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    private final boolean zzH() {
        int i7;
        return (this.zzj == null || (i7 = this.zzh) == -1 || i7 == 0 || i7 == 1) ? false : true;
    }

    public static /* synthetic */ void zzk(zzcaa zzcaaVar, int i7) {
        zzcab zzcabVar = zzcaaVar.zzr;
        if (zzcabVar != null) {
            zzcabVar.onWindowVisibilityChanged(i7);
        }
    }

    public static void zzm(zzcaa zzcaaVar, MediaPlayer mediaPlayer) {
        MediaFormat format;
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcb)).booleanValue() || zzcaaVar.zzd == null || mediaPlayer == null) {
            return;
        }
        try {
            MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
            if (trackInfo != null) {
                HashMap hashMap = new HashMap();
                for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                    if (trackInfo2 != null) {
                        int trackType = trackInfo2.getTrackType();
                        if (trackType == 1) {
                            MediaFormat format2 = trackInfo2.getFormat();
                            if (format2 != null) {
                                if (format2.containsKey("frame-rate")) {
                                    try {
                                        hashMap.put(RRWebVideoEvent.JsonKeys.FRAME_RATE, String.valueOf(format2.getFloat("frame-rate")));
                                    } catch (ClassCastException unused) {
                                        hashMap.put(RRWebVideoEvent.JsonKeys.FRAME_RATE, String.valueOf(format2.getInteger("frame-rate")));
                                    }
                                }
                                if (format2.containsKey("bitrate")) {
                                    Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                    zzcaaVar.zzt = valueOf;
                                    hashMap.put("bitRate", String.valueOf(valueOf));
                                }
                                if (format2.containsKey("width") && format2.containsKey("height")) {
                                    hashMap.put("resolution", format2.getInteger("width") + "x" + format2.getInteger("height"));
                                }
                                if (format2.containsKey("mime")) {
                                    hashMap.put("videoMime", format2.getString("mime"));
                                }
                                if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                    hashMap.put("videoCodec", format2.getString("codecs-string"));
                                }
                            }
                        } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                            if (format.containsKey("mime")) {
                                hashMap.put("audioMime", format.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                hashMap.put("audioCodec", format.getString("codecs-string"));
                            }
                        }
                    }
                }
                if (hashMap.isEmpty()) {
                    return;
                }
                zzcaaVar.zzd.zzd("onMetadataEvent", hashMap);
            }
        } catch (RuntimeException e7) {
            o.f1952C.f1961g.zzw(e7, "AdMediaPlayerView.reportMetadata");
        }
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i7) {
        this.zzn = i7;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        J.k("AdMediaPlayerView completion");
        zzF(5);
        this.zzi = 5;
        P.f3579l.post(new zzbzt(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i7, int i8) {
        Map map = zzc;
        String str = (String) map.get(Integer.valueOf(i7));
        String str2 = (String) map.get(Integer.valueOf(i8));
        String f7 = AbstractC1663a.f("AdMediaPlayerView MediaPlayer error: ", str, ":", str2);
        int i9 = J.f3546b;
        j.g(f7);
        zzF(-1);
        this.zzi = -1;
        P.f3579l.post(new zzbzu(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i7, int i8) {
        Map map = zzc;
        J.k("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i7))) + ":" + ((String) map.get(Integer.valueOf(i8))));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r1 > r6) goto L30;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i8) {
        int i9;
        int defaultSize = View.getDefaultSize(this.zzl, i7);
        int defaultSize2 = View.getDefaultSize(this.zzm, i8);
        if (this.zzl > 0 && this.zzm > 0 && this.zzo == null) {
            int mode = View.MeasureSpec.getMode(i7);
            int size = View.MeasureSpec.getSize(i7);
            int mode2 = View.MeasureSpec.getMode(i8);
            int size2 = View.MeasureSpec.getSize(i8);
            if (mode == 1073741824) {
                if (mode2 == 1073741824) {
                    int i10 = this.zzl;
                    int i11 = i10 * size2;
                    int i12 = this.zzm;
                    int i13 = size * i12;
                    if (i11 < i13) {
                        defaultSize = i11 / i12;
                        defaultSize2 = size2;
                    } else {
                        if (i11 > i13) {
                            defaultSize2 = i13 / i10;
                            defaultSize = size;
                        }
                        defaultSize = size;
                        defaultSize2 = size2;
                    }
                } else {
                    mode = 1073741824;
                }
            }
            if (mode == 1073741824) {
                int i14 = (this.zzm * size) / this.zzl;
                if (mode2 != Integer.MIN_VALUE || i14 <= size2) {
                    defaultSize2 = i14;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                if (mode2 == 1073741824) {
                    i9 = (this.zzl * size2) / this.zzm;
                    if (mode == Integer.MIN_VALUE) {
                    }
                } else {
                    int i15 = this.zzl;
                    int i16 = this.zzm;
                    if (mode2 != Integer.MIN_VALUE || i16 <= size2) {
                        i9 = i15;
                        size2 = i16;
                    } else {
                        i9 = (size2 * i15) / i16;
                    }
                    if (mode == Integer.MIN_VALUE && i9 > size) {
                        defaultSize2 = (i16 * size) / i15;
                        defaultSize = size;
                    }
                }
                defaultSize = i9;
                defaultSize2 = size2;
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        zzcau zzcauVar = this.zzo;
        if (zzcauVar != null) {
            zzcauVar.zzc(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        J.k("AdMediaPlayerView prepared");
        zzF(2);
        this.zze.zzb();
        P.f3579l.post(new zzbzs(this, mediaPlayer));
        this.zzl = mediaPlayer.getVideoWidth();
        this.zzm = mediaPlayer.getVideoHeight();
        int i7 = this.zzq;
        if (i7 != 0) {
            zzq(i7);
        }
        if (this.zzf && zzH() && this.zzj.getCurrentPosition() > 0 && this.zzi != 3) {
            J.k("AdMediaPlayerView nudging MediaPlayer");
            zzG(0.0f);
            this.zzj.start();
            int currentPosition = this.zzj.getCurrentPosition();
            o.f1952C.j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            while (zzH() && this.zzj.getCurrentPosition() == currentPosition) {
                o.f1952C.j.getClass();
                if (System.currentTimeMillis() - currentTimeMillis > 250) {
                    break;
                }
            }
            this.zzj.pause();
            zzn();
        }
        j.f("AdMediaPlayerView stream dimensions: " + this.zzl + " x " + this.zzm);
        if (this.zzi == 3) {
            zzp();
        }
        zzn();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
        J.k("AdMediaPlayerView surface created");
        zzD();
        P.f3579l.post(new zzbzv(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        J.k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null && this.zzq == 0) {
            this.zzq = mediaPlayer.getCurrentPosition();
        }
        zzcau zzcauVar = this.zzo;
        if (zzcauVar != null) {
            zzcauVar.zze();
        }
        P.f3579l.post(new zzbzx(this));
        zzE(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i8) {
        J.k("AdMediaPlayerView surface changed");
        int i9 = this.zzi;
        boolean z4 = false;
        if (this.zzl == i7 && this.zzm == i8) {
            z4 = true;
        }
        if (this.zzj != null && i9 == 3 && z4) {
            int i10 = this.zzq;
            if (i10 != 0) {
                zzq(i10);
            }
            zzp();
        }
        zzcau zzcauVar = this.zzo;
        if (zzcauVar != null) {
            zzcauVar.zzc(i7, i8);
        }
        P.f3579l.post(new zzbzw(this, i7, i8));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zze.zzf(this);
        this.zza.zza(surfaceTexture, this.zzr);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i7, int i8) {
        J.k("AdMediaPlayerView size changed: " + i7 + " x " + i8);
        this.zzl = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.zzm = videoHeight;
        if (this.zzl == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i7) {
        J.k("AdMediaPlayerView window visibility changed to " + i7);
        P.f3579l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbzr
            @Override // java.lang.Runnable
            public final void run() {
                zzcaa.zzk(zzcaa.this, i7);
            }
        });
        super.onWindowVisibilityChanged(i7);
    }

    @Override // android.view.View
    public final String toString() {
        return k.f(zzcaa.class.getName(), "@", Integer.toHexString(hashCode()));
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final int zza() {
        if (zzH()) {
            return this.zzj.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final int zzb() {
        PersistableBundle metrics;
        if (Build.VERSION.SDK_INT < 26 || !zzH()) {
            return -1;
        }
        metrics = this.zzj.getMetrics();
        return metrics.getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final int zzc() {
        if (zzH()) {
            return this.zzj.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final int zzd() {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final int zze() {
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final long zzf() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final long zzg() {
        if (this.zzt != null) {
            return (zzh() * this.zzn) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final long zzh() {
        if (this.zzt != null) {
            return zzc() * this.zzt.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final String zzj() {
        return "MediaPlayer".concat(true != this.zzp ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcac, com.google.android.gms.internal.ads.zzcaz
    public final void zzn() {
        zzG(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzo() {
        J.k("AdMediaPlayerView pause");
        if (zzH() && this.zzj.isPlaying()) {
            this.zzj.pause();
            zzF(4);
            P.f3579l.post(new zzbzz(this));
        }
        this.zzi = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzp() {
        J.k("AdMediaPlayerView play");
        if (zzH()) {
            this.zzj.start();
            zzF(3);
            this.zza.zzb();
            P.f3579l.post(new zzbzy(this));
        }
        this.zzi = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzq(int i7) {
        J.k("AdMediaPlayerView seek " + i7);
        if (!zzH()) {
            this.zzq = i7;
        } else {
            this.zzj.seekTo(i7);
            this.zzq = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzr(zzcab zzcabVar) {
        this.zzr = zzcabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzs(String str) {
        Uri parse = Uri.parse(str);
        zzbai zza = zzbai.zza(parse);
        if (zza == null || zza.zza != null) {
            if (zza != null) {
                parse = Uri.parse(zza.zza);
            }
            this.zzk = parse;
            this.zzq = 0;
            zzD();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzt() {
        J.k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zzj;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zzj.release();
            this.zzj = null;
            zzF(0);
            this.zzi = 0;
        }
        this.zze.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final void zzu(float f7, float f8) {
        zzcau zzcauVar = this.zzo;
        if (zzcauVar != null) {
            zzcauVar.zzf(f7, f8);
        }
    }
}
