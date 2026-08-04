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
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p031e1.k;
import p036e6.c;

/* JADX INFO: loaded from: classes.dex */
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
        HashMap map = new HashMap();
        zzc = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, "MEDIA_ERROR_MALFORMED");
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(701, "MEDIA_INFO_BUFFERING_START");
        map.put(702, "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        map.put(802, "MEDIA_INFO_METADATA_UPDATE");
        map.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
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
                    zzdqp zzdqpVarZza = zzdqqVar.zza();
                    zzdqpVarZza.zzb("action", "svp_ampv");
                    zzdqpVarZza.zzj();
                }
                zzcau zzcauVar = new zzcau(getContext());
                this.zzo = zzcauVar;
                zzcauVar.zzd(surfaceTexture, getWidth(), getHeight());
                zzcau zzcauVar2 = this.zzo;
                zzcauVar2.start();
                SurfaceTexture surfaceTextureZzb = zzcauVar2.zzb();
                if (surfaceTextureZzb != null) {
                    surfaceTexture = surfaceTextureZzb;
                } else {
                    this.zzo.zze();
                    this.zzo = null;
                }
            }
            this.zzj.setDataSource(getContext(), this.zzk);
            c cVar = oVar.f1974u;
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
                HashMap map = new HashMap();
                for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                    if (trackInfo2 != null) {
                        int trackType = trackInfo2.getTrackType();
                        if (trackType == 1) {
                            MediaFormat format2 = trackInfo2.getFormat();
                            if (format2 != null) {
                                if (format2.containsKey("frame-rate")) {
                                    try {
                                        map.put(RRWebVideoEvent.JsonKeys.FRAME_RATE, String.valueOf(format2.getFloat("frame-rate")));
                                    } catch (ClassCastException unused) {
                                        map.put(RRWebVideoEvent.JsonKeys.FRAME_RATE, String.valueOf(format2.getInteger("frame-rate")));
                                    }
                                }
                                if (format2.containsKey("bitrate")) {
                                    Integer numValueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                    zzcaaVar.zzt = numValueOf;
                                    map.put("bitRate", String.valueOf(numValueOf));
                                }
                                if (format2.containsKey("width") && format2.containsKey("height")) {
                                    map.put("resolution", format2.getInteger("width") + "x" + format2.getInteger("height"));
                                }
                                if (format2.containsKey("mime")) {
                                    map.put("videoMime", format2.getString("mime"));
                                }
                                if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                    map.put("videoCodec", format2.getString("codecs-string"));
                                }
                            }
                        } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                            if (format.containsKey("mime")) {
                                map.put("audioMime", format.getString("mime"));
                            }
                            if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                map.put("audioCodec", format.getString("codecs-string"));
                            }
                        }
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                zzcaaVar.zzd.zzd("onMetadataEvent", map);
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
        String strF = p150v0.a.f("AdMediaPlayerView MediaPlayer error: ", str, ":", str2);
        int i9 = J.f3546b;
        j.g(strF);
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

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int defaultSize = View.getDefaultSize(this.zzl, i7);
        int defaultSize2 = View.getDefaultSize(this.zzm, i8);
        if (this.zzl > 0 && this.zzm > 0 && this.zzo == null) {
            int mode = View.MeasureSpec.getMode(i7);
            int size = View.MeasureSpec.getSize(i7);
            int mode2 = View.MeasureSpec.getMode(i8);
            int size2 = View.MeasureSpec.getSize(i8);
            if (mode != 1073741824) {
                if (mode == 1073741824) {
                    i12 = (this.zzm * size) / this.zzl;
                    if (mode2 == Integer.MIN_VALUE || i12 <= size2) {
                        defaultSize2 = i12;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                } else {
                    if (mode2 == 1073741824) {
                        i11 = (this.zzl * size2) / this.zzm;
                        if (mode != Integer.MIN_VALUE && i11 > size) {
                            defaultSize = size;
                        }
                        defaultSize2 = size2;
                    } else {
                        i9 = this.zzl;
                        i10 = this.zzm;
                        if (mode2 == Integer.MIN_VALUE || i10 <= size2) {
                            i11 = i9;
                            size2 = i10;
                        } else {
                            i11 = (size2 * i9) / i10;
                        }
                        if (mode == Integer.MIN_VALUE && i11 > size) {
                            defaultSize2 = (i10 * size) / i9;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i11;
                    defaultSize2 = size2;
                }
            } else if (mode2 == 1073741824) {
                int i13 = this.zzl;
                int i14 = i13 * size2;
                int i15 = this.zzm;
                int i16 = size * i15;
                if (i14 < i16) {
                    defaultSize = i14 / i15;
                } else {
                    if (i14 > i16) {
                        defaultSize2 = i16 / i13;
                        defaultSize = size;
                    }
                    defaultSize = size;
                }
                defaultSize2 = size2;
            } else {
                mode = 1073741824;
                if (mode == 1073741824) {
                    i12 = (this.zzm * size) / this.zzl;
                    if (mode2 == Integer.MIN_VALUE) {
                    }
                    defaultSize2 = i12;
                    defaultSize = size;
                } else {
                    if (mode2 == 1073741824) {
                        i11 = (this.zzl * size2) / this.zzm;
                        if (mode != Integer.MIN_VALUE) {
                        }
                    } else {
                        i9 = this.zzl;
                        i10 = this.zzm;
                        if (mode2 == Integer.MIN_VALUE) {
                            i11 = i9;
                            size2 = i10;
                        } else {
                            i11 = i9;
                            size2 = i10;
                        }
                        if (mode == Integer.MIN_VALUE) {
                            defaultSize2 = (i10 * size) / i9;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i11;
                    defaultSize2 = size2;
                }
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
            long jCurrentTimeMillis = System.currentTimeMillis();
            while (zzH() && this.zzj.getCurrentPosition() == currentPosition) {
                o.f1952C.j.getClass();
                if (System.currentTimeMillis() - jCurrentTimeMillis > 250) {
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
                zzcaa.zzk(this.zza, i7);
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
        if (Build.VERSION.SDK_INT < 26 || !zzH()) {
            return -1;
        }
        return this.zzj.getMetrics().getInt("android.media.mediaplayer.dropped");
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
            return (zzh() * ((long) this.zzn)) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final long zzh() {
        if (this.zzt != null) {
            return ((long) zzc()) * ((long) this.zzt.intValue());
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
        Uri uri = Uri.parse(str);
        zzbai zzbaiVarZza = zzbai.zza(uri);
        if (zzbaiVarZza == null || zzbaiVarZza.zza != null) {
            if (zzbaiVarZza != null) {
                uri = Uri.parse(zzbaiVarZza.zza);
            }
            this.zzk = uri;
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
