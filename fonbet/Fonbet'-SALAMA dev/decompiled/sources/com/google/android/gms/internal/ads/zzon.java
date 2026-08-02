package com.google.android.gms.internal.ads;

import A1.F;
import B1.k;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzon implements zzmb, zzoo {
    private boolean zzA;
    private final Context zza;
    private final zzop zzc;
    private final PlaybackSession zzd;
    private String zzj;
    private PlaybackMetrics.Builder zzk;
    private int zzl;
    private zzba zzo;
    private zzom zzp;
    private zzom zzq;
    private zzom zzr;
    private zzz zzs;
    private zzz zzt;
    private zzz zzu;
    private boolean zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private int zzz;
    private final Executor zzb = zzcw.zza();
    private final zzbm zzf = new zzbm();
    private final zzbl zzg = new zzbl();
    private final HashMap zzi = new HashMap();
    private final HashMap zzh = new HashMap();
    private final long zze = SystemClock.elapsedRealtime();
    private int zzm = 0;
    private int zzn = 0;

    private zzon(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzd = playbackSession;
        zzog zzogVar = new zzog(zzog.zza);
        this.zzc = zzogVar;
        zzogVar.zzh(this);
    }

    private final void zzA(zzbn zzbnVar, zzuq zzuqVar) {
        int zza;
        PlaybackMetrics.Builder builder = this.zzk;
        if (zzuqVar == null || (zza = zzbnVar.zza(zzuqVar.zza)) == -1) {
            return;
        }
        int i7 = 0;
        zzbnVar.zzd(zza, this.zzg, false);
        zzbnVar.zze(this.zzg.zzc, this.zzf, 0L);
        zzak zzakVar = this.zzf.zzd.zzb;
        if (zzakVar != null) {
            int zzo = zzen.zzo(zzakVar.zza);
            i7 = zzo != 0 ? zzo != 1 ? zzo != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i7);
        zzbm zzbmVar = this.zzf;
        long j = zzbmVar.zzm;
        if (j != -9223372036854775807L && !zzbmVar.zzk && !zzbmVar.zzi && !zzbmVar.zzb()) {
            builder.setMediaDurationMillis(zzen.zzv(j));
        }
        builder.setPlaybackType(true != this.zzf.zzb() ? 1 : 2);
        this.zzA = true;
    }

    private final void zzB(long j, zzz zzzVar, int i7) {
        zzz zzzVar2 = this.zzs;
        int i8 = zzen.zza;
        if (Objects.equals(zzzVar2, zzzVar)) {
            return;
        }
        int i9 = this.zzs == null ? 1 : 0;
        this.zzs = zzzVar;
        zzC(1, j, zzzVar, i9);
    }

    private final void zzC(int i7, long j, zzz zzzVar, int i8) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        final TrackChangeEvent build;
        timeSinceCreatedMillis = k.m(i7).setTimeSinceCreatedMillis(j - this.zze);
        if (zzzVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i8 != 1 ? 1 : 2);
            String str = zzzVar.zzn;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzzVar.zzo;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzzVar.zzk;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i9 = zzzVar.zzj;
            if (i9 != -1) {
                timeSinceCreatedMillis.setBitrate(i9);
            }
            int i10 = zzzVar.zzv;
            if (i10 != -1) {
                timeSinceCreatedMillis.setWidth(i10);
            }
            int i11 = zzzVar.zzw;
            if (i11 != -1) {
                timeSinceCreatedMillis.setHeight(i11);
            }
            int i12 = zzzVar.zzE;
            if (i12 != -1) {
                timeSinceCreatedMillis.setChannelCount(i12);
            }
            int i13 = zzzVar.zzF;
            if (i13 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i13);
            }
            String str4 = zzzVar.zzd;
            if (str4 != null) {
                int i14 = zzen.zza;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f7 = zzzVar.zzx;
            if (f7 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f7);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzA = true;
        build = timeSinceCreatedMillis.build();
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoh
            @Override // java.lang.Runnable
            public final void run() {
                zzon.this.zzd.reportTrackChangeEvent(build);
            }
        });
    }

    private final boolean zzD(zzom zzomVar) {
        if (zzomVar != null) {
            return zzomVar.zzc.equals(this.zzc.zze());
        }
        return false;
    }

    public static zzon zzb(Context context) {
        PlaybackSession createPlaybackSession;
        MediaMetricsManager b7 = F.b(context.getSystemService("media_metrics"));
        if (b7 == null) {
            return null;
        }
        createPlaybackSession = b7.createPlaybackSession();
        return new zzon(context, createPlaybackSession);
    }

    private static int zzw(int i7) {
        switch (zzen.zzl(i7)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzx() {
        final PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.zzk;
        if (builder != null && this.zzA) {
            builder.setAudioUnderrunCount(this.zzz);
            this.zzk.setVideoFramesDropped(this.zzx);
            this.zzk.setVideoFramesPlayed(this.zzy);
            Long l7 = (Long) this.zzh.get(this.zzj);
            this.zzk.setNetworkTransferDurationMillis(l7 == null ? 0L : l7.longValue());
            Long l8 = (Long) this.zzi.get(this.zzj);
            this.zzk.setNetworkBytesRead(l8 == null ? 0L : l8.longValue());
            this.zzk.setStreamSource((l8 == null || l8.longValue() <= 0) ? 0 : 1);
            build = this.zzk.build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzok
                @Override // java.lang.Runnable
                public final void run() {
                    zzon.this.zzd.reportPlaybackMetrics(build);
                }
            });
        }
        this.zzk = null;
        this.zzj = null;
        this.zzz = 0;
        this.zzx = 0;
        this.zzy = 0;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzA = false;
    }

    private final void zzy(long j, zzz zzzVar, int i7) {
        zzz zzzVar2 = this.zzt;
        int i8 = zzen.zza;
        if (Objects.equals(zzzVar2, zzzVar)) {
            return;
        }
        int i9 = this.zzt == null ? 1 : 0;
        this.zzt = zzzVar;
        zzC(0, j, zzzVar, i9);
    }

    private final void zzz(long j, zzz zzzVar, int i7) {
        zzz zzzVar2 = this.zzu;
        int i8 = zzen.zza;
        if (Objects.equals(zzzVar2, zzzVar)) {
            return;
        }
        int i9 = this.zzu == null ? 1 : 0;
        this.zzu = zzzVar;
        zzC(2, j, zzzVar, i9);
    }

    public final LogSessionId zza() {
        LogSessionId sessionId;
        sessionId = this.zzd.getSessionId();
        return sessionId;
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final /* synthetic */ void zze(zzlz zzlzVar, zzz zzzVar, zzhr zzhrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzf(zzlz zzlzVar, int i7, long j, long j3) {
        zzuq zzuqVar = zzlzVar.zzd;
        if (zzuqVar != null) {
            String zzf = this.zzc.zzf(zzlzVar.zzb, zzuqVar);
            Long l7 = (Long) this.zzi.get(zzf);
            Long l8 = (Long) this.zzh.get(zzf);
            this.zzi.put(zzf, Long.valueOf((l7 == null ? 0L : l7.longValue()) + j));
            this.zzh.put(zzf, Long.valueOf((l8 != null ? l8.longValue() : 0L) + i7));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzg(zzlz zzlzVar, zzum zzumVar) {
        zzuq zzuqVar = zzlzVar.zzd;
        if (zzuqVar == null) {
            return;
        }
        zzz zzzVar = zzumVar.zzb;
        zzzVar.getClass();
        zzom zzomVar = new zzom(zzzVar, 0, this.zzc.zzf(zzlzVar.zzb, zzuqVar));
        int i7 = zzumVar.zza;
        if (i7 != 0) {
            if (i7 == 1) {
                this.zzq = zzomVar;
                return;
            } else if (i7 != 2) {
                if (i7 != 3) {
                    return;
                }
                this.zzr = zzomVar;
                return;
            }
        }
        this.zzp = zzomVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final /* synthetic */ void zzh(zzlz zzlzVar, int i7, long j) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x01ee, code lost:
    
        if (r9 != 1) goto L137;
     */
    @Override // com.google.android.gms.internal.ads.zzmb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(zzbh zzbhVar, zzma zzmaVar) {
        int i7;
        int i8;
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis;
        final PlaybackStateEvent build;
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis2;
        final NetworkEvent build2;
        int i9;
        int i10;
        int errorCode;
        int zzm;
        PlaybackErrorEvent.Builder timeSinceCreatedMillis3;
        PlaybackErrorEvent.Builder errorCode2;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        final PlaybackErrorEvent build3;
        zzs zzsVar;
        int i11;
        int i12;
        if (zzmaVar.zzb() == 0) {
            return;
        }
        for (int i13 = 0; i13 < zzmaVar.zzb(); i13++) {
            int zza = zzmaVar.zza(i13);
            zzlz zzc = zzmaVar.zzc(zza);
            if (zza == 0) {
                this.zzc.zzk(zzc);
            } else if (zza == 11) {
                this.zzc.zzj(zzc, this.zzl);
            } else {
                this.zzc.zzi(zzc);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzmaVar.zzd(0)) {
            zzlz zzc2 = zzmaVar.zzc(0);
            if (this.zzk != null) {
                zzA(zzc2.zzb, zzc2.zzd);
            }
        }
        if (zzmaVar.zzd(2) && this.zzk != null) {
            zzfwh zza2 = zzbhVar.zzp().zza();
            int size = zza2.size();
            int i14 = 0;
            loop1: while (true) {
                if (i14 >= size) {
                    zzsVar = null;
                    break;
                }
                zzbu zzbuVar = (zzbu) zza2.get(i14);
                int i15 = 0;
                while (true) {
                    i12 = i14 + 1;
                    if (i15 < zzbuVar.zza) {
                        if (zzbuVar.zzd(i15) && (zzsVar = zzbuVar.zzb(i15).zzs) != null) {
                            break loop1;
                        } else {
                            i15++;
                        }
                    }
                }
                i14 = i12;
            }
            if (zzsVar != null) {
                PlaybackMetrics.Builder builder = this.zzk;
                int i16 = zzen.zza;
                PlaybackMetrics.Builder g3 = F.g(builder);
                int i17 = 0;
                while (true) {
                    if (i17 >= zzsVar.zzb) {
                        i11 = 1;
                        break;
                    }
                    UUID uuid = zzsVar.zza(i17).zza;
                    if (uuid.equals(zzh.zzd)) {
                        i11 = 3;
                        break;
                    } else if (uuid.equals(zzh.zze)) {
                        i11 = 2;
                        break;
                    } else {
                        if (uuid.equals(zzh.zzc)) {
                            i11 = 6;
                            break;
                        }
                        i17++;
                    }
                }
                g3.setDrmType(i11);
            }
        }
        if (zzmaVar.zzd(1011)) {
            this.zzz++;
        }
        zzba zzbaVar = this.zzo;
        if (zzbaVar != null) {
            Context context = this.zza;
            if (zzbaVar.zza == 1001) {
                i10 = 20;
            } else {
                zzia zziaVar = (zzia) zzbaVar;
                boolean z4 = zziaVar.zzc == 1;
                int i18 = zziaVar.zzg;
                Throwable cause = zzbaVar.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    if (cause instanceof zzgq) {
                        zzm = ((zzgq) cause).zzc;
                        i10 = 5;
                    } else if ((cause instanceof zzgp) || (cause instanceof zzaz)) {
                        zzm = 0;
                        i10 = 11;
                    } else {
                        boolean z7 = cause instanceof zzgo;
                        if (z7 || (cause instanceof zzgy)) {
                            if (zzeb.zzb(context).zza() == 1) {
                                zzm = 0;
                                i10 = 3;
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    zzm = 0;
                                    i10 = 6;
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    zzm = 0;
                                    i10 = 7;
                                } else if (z7 && ((zzgo) cause).zzb == 1) {
                                    zzm = 0;
                                    i10 = 4;
                                } else {
                                    zzm = 0;
                                    i10 = 8;
                                }
                            }
                        } else if (zzbaVar.zza == 1002) {
                            i10 = 21;
                        } else if (cause instanceof zzrj) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                errorCode = zzen.zzm(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                i9 = zzw(errorCode);
                                int i19 = i9;
                                zzm = errorCode;
                                i10 = i19;
                            } else {
                                int i20 = zzen.zza;
                                if (cause3 instanceof MediaDrmResetException) {
                                    i10 = 27;
                                } else if (cause3 instanceof NotProvisionedException) {
                                    i10 = 24;
                                } else if (cause3 instanceof DeniedByServerException) {
                                    i10 = 29;
                                } else {
                                    if (!(cause3 instanceof zzrt)) {
                                        i10 = cause3 instanceof zzri ? 28 : 30;
                                    }
                                    zzm = 0;
                                    i10 = 23;
                                }
                            }
                        } else if ((cause instanceof zzgl) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            if ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                i10 = 32;
                            } else {
                                zzm = 0;
                                i10 = 31;
                            }
                        } else {
                            zzm = 0;
                            i10 = 9;
                        }
                    }
                    timeSinceCreatedMillis3 = k.g().setTimeSinceCreatedMillis(elapsedRealtime - this.zze);
                    errorCode2 = timeSinceCreatedMillis3.setErrorCode(i10);
                    subErrorCode = errorCode2.setSubErrorCode(zzm);
                    exception = subErrorCode.setException(zzbaVar);
                    build3 = exception.build();
                    this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoj
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzon.this.zzd.reportPlaybackErrorEvent(build3);
                        }
                    });
                    this.zzA = true;
                    this.zzo = null;
                } else {
                    if (z4) {
                        i10 = 35;
                        if (i18 != 0) {
                        }
                    }
                    if (z4 && i18 == 3) {
                        i10 = 15;
                    } else {
                        if (!z4 || i18 != 2) {
                            if (cause instanceof zzsu) {
                                zzm = zzen.zzm(((zzsu) cause).zzd);
                                i10 = 13;
                                timeSinceCreatedMillis3 = k.g().setTimeSinceCreatedMillis(elapsedRealtime - this.zze);
                                errorCode2 = timeSinceCreatedMillis3.setErrorCode(i10);
                                subErrorCode = errorCode2.setSubErrorCode(zzm);
                                exception = subErrorCode.setException(zzbaVar);
                                build3 = exception.build();
                                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoj
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzon.this.zzd.reportPlaybackErrorEvent(build3);
                                    }
                                });
                                this.zzA = true;
                                this.zzo = null;
                            } else {
                                i9 = 14;
                                if (cause instanceof zzsq) {
                                    errorCode = ((zzsq) cause).zza;
                                } else if (cause instanceof OutOfMemoryError) {
                                    i10 = 14;
                                } else if (cause instanceof zzpt) {
                                    errorCode = ((zzpt) cause).zza;
                                    i9 = 17;
                                } else if (cause instanceof zzpw) {
                                    errorCode = ((zzpw) cause).zza;
                                    i9 = 18;
                                } else if (cause instanceof MediaCodec.CryptoException) {
                                    errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                    i9 = zzw(errorCode);
                                } else {
                                    i10 = 22;
                                }
                                int i192 = i9;
                                zzm = errorCode;
                                i10 = i192;
                                timeSinceCreatedMillis3 = k.g().setTimeSinceCreatedMillis(elapsedRealtime - this.zze);
                                errorCode2 = timeSinceCreatedMillis3.setErrorCode(i10);
                                subErrorCode = errorCode2.setSubErrorCode(zzm);
                                exception = subErrorCode.setException(zzbaVar);
                                build3 = exception.build();
                                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoj
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzon.this.zzd.reportPlaybackErrorEvent(build3);
                                    }
                                });
                                this.zzA = true;
                                this.zzo = null;
                            }
                        }
                        zzm = 0;
                        i10 = 23;
                        timeSinceCreatedMillis3 = k.g().setTimeSinceCreatedMillis(elapsedRealtime - this.zze);
                        errorCode2 = timeSinceCreatedMillis3.setErrorCode(i10);
                        subErrorCode = errorCode2.setSubErrorCode(zzm);
                        exception = subErrorCode.setException(zzbaVar);
                        build3 = exception.build();
                        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoj
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzon.this.zzd.reportPlaybackErrorEvent(build3);
                            }
                        });
                        this.zzA = true;
                        this.zzo = null;
                    }
                }
            }
            zzm = 0;
            timeSinceCreatedMillis3 = k.g().setTimeSinceCreatedMillis(elapsedRealtime - this.zze);
            errorCode2 = timeSinceCreatedMillis3.setErrorCode(i10);
            subErrorCode = errorCode2.setSubErrorCode(zzm);
            exception = subErrorCode.setException(zzbaVar);
            build3 = exception.build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoj
                @Override // java.lang.Runnable
                public final void run() {
                    zzon.this.zzd.reportPlaybackErrorEvent(build3);
                }
            });
            this.zzA = true;
            this.zzo = null;
        }
        if (zzmaVar.zzd(2)) {
            zzbv zzp = zzbhVar.zzp();
            boolean zzb = zzp.zzb(2);
            boolean zzb2 = zzp.zzb(1);
            boolean zzb3 = zzp.zzb(3);
            if (!zzb && !zzb2) {
                if (zzb3) {
                    zzb3 = true;
                }
            }
            if (!zzb) {
                zzB(elapsedRealtime, null, 0);
            }
            if (!zzb2) {
                zzy(elapsedRealtime, null, 0);
            }
            if (!zzb3) {
                zzz(elapsedRealtime, null, 0);
            }
        }
        if (zzD(this.zzp)) {
            zzz zzzVar = this.zzp.zza;
            if (zzzVar.zzw != -1) {
                zzB(elapsedRealtime, zzzVar, 0);
                this.zzp = null;
            }
        }
        if (zzD(this.zzq)) {
            zzy(elapsedRealtime, this.zzq.zza, 0);
            this.zzq = null;
        }
        if (zzD(this.zzr)) {
            zzz(elapsedRealtime, this.zzr.zza, 0);
            this.zzr = null;
        }
        switch (zzeb.zzb(this.zza).zza()) {
            case 0:
                i7 = 0;
                break;
            case 1:
                i7 = 9;
                break;
            case 2:
                i7 = 2;
                break;
            case 3:
                i7 = 4;
                break;
            case 4:
                i7 = 5;
                break;
            case 5:
                i7 = 6;
                break;
            case 6:
            case 8:
            default:
                i7 = 1;
                break;
            case 7:
                i7 = 3;
                break;
            case 9:
                i7 = 8;
                break;
            case 10:
                i7 = 7;
                break;
        }
        if (i7 != this.zzn) {
            this.zzn = i7;
            networkType = k.c().setNetworkType(i7);
            timeSinceCreatedMillis2 = networkType.setTimeSinceCreatedMillis(elapsedRealtime - this.zze);
            build2 = timeSinceCreatedMillis2.build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoi
                @Override // java.lang.Runnable
                public final void run() {
                    zzon.this.zzd.reportNetworkEvent(build2);
                }
            });
        }
        if (zzbhVar.zzg() != 2) {
            this.zzv = false;
        }
        if (((zzlu) zzbhVar).zzD() == null) {
            this.zzw = false;
        } else if (zzmaVar.zzd(10)) {
            this.zzw = true;
        }
        int zzg = zzbhVar.zzg();
        if (this.zzv) {
            i8 = 5;
        } else if (this.zzw) {
            i8 = 13;
        } else if (zzg == 4) {
            i8 = 11;
        } else {
            i8 = 12;
            if (zzg == 2) {
                int i21 = this.zzm;
                i8 = (i21 == 0 || i21 == 2 || i21 == 12) ? 2 : !zzbhVar.zzv() ? 7 : zzbhVar.zzh() != 0 ? 10 : 6;
            } else if (zzg == 3) {
                i8 = !zzbhVar.zzv() ? 4 : zzbhVar.zzh() != 0 ? 9 : 3;
            } else if (zzg != 1 || this.zzm == 0) {
                i8 = this.zzm;
            }
        }
        if (this.zzm != i8) {
            this.zzm = i8;
            this.zzA = true;
            state = F.j().setState(this.zzm);
            timeSinceCreatedMillis = state.setTimeSinceCreatedMillis(elapsedRealtime - this.zze);
            build = timeSinceCreatedMillis.build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzol
                @Override // java.lang.Runnable
                public final void run() {
                    zzon.this.zzd.reportPlaybackStateEvent(build);
                }
            });
        }
        if (zzmaVar.zzd(1028)) {
            this.zzc.zzg(zzmaVar.zzc(1028));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzj(zzlz zzlzVar, zzuh zzuhVar, zzum zzumVar, IOException iOException, boolean z4) {
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final /* synthetic */ void zzk(zzlz zzlzVar, int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzl(zzlz zzlzVar, zzba zzbaVar) {
        this.zzo = zzbaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzm(zzlz zzlzVar, zzbf zzbfVar, zzbf zzbfVar2, int i7) {
        if (i7 == 1) {
            this.zzv = true;
            i7 = 1;
        }
        this.zzl = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final /* synthetic */ void zzn(zzlz zzlzVar, Object obj, long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzo(zzlz zzlzVar, zzhq zzhqVar) {
        this.zzx += zzhqVar.zzg;
        this.zzy += zzhqVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final /* synthetic */ void zzp(zzlz zzlzVar, zzz zzzVar, zzhr zzhrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzq(zzlz zzlzVar, zzcc zzccVar) {
        zzom zzomVar = this.zzp;
        if (zzomVar != null) {
            zzz zzzVar = zzomVar.zza;
            if (zzzVar.zzw == -1) {
                zzx zzb = zzzVar.zzb();
                zzb.zzai(zzccVar.zzb);
                zzb.zzM(zzccVar.zzc);
                this.zzp = new zzom(zzb.zzaj(), 0, zzomVar.zzc);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoo
    public final void zzu(zzlz zzlzVar, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        zzuq zzuqVar = zzlzVar.zzd;
        if (zzuqVar == null || !zzuqVar.zzb()) {
            zzx();
            this.zzj = str;
            playerName = k.h().setPlayerName("AndroidXMedia3");
            playerVersion = playerName.setPlayerVersion("1.6.0-beta01");
            this.zzk = playerVersion;
            zzA(zzlzVar.zzb, zzlzVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoo
    public final void zzv(zzlz zzlzVar, String str, boolean z4) {
        zzuq zzuqVar = zzlzVar.zzd;
        if ((zzuqVar == null || !zzuqVar.zzb()) && str.equals(this.zzj)) {
            zzx();
        }
        this.zzh.remove(str);
        this.zzi.remove(str);
    }
}
