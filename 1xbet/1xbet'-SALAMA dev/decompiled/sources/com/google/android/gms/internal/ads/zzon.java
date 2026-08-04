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

/* JADX INFO: loaded from: classes.dex */
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
        int iZza;
        PlaybackMetrics.Builder builder = this.zzk;
        if (zzuqVar == null || (iZza = zzbnVar.zza(zzuqVar.zza)) == -1) {
            return;
        }
        int i7 = 0;
        zzbnVar.zzd(iZza, this.zzg, false);
        zzbnVar.zze(this.zzg.zzc, this.zzf, 0L);
        zzak zzakVar = this.zzf.zzd.zzb;
        if (zzakVar != null) {
            int iZzo = zzen.zzo(zzakVar.zza);
            if (iZzo == 0) {
                i7 = 3;
            } else if (iZzo != 1) {
                i7 = iZzo != 2 ? 1 : 4;
            } else {
                i7 = 5;
            }
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
        TrackChangeEvent.Builder timeSinceCreatedMillis = k.m(i7).setTimeSinceCreatedMillis(j - this.zze);
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
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
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
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoh
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd.reportTrackChangeEvent(trackChangeEventBuild);
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
        MediaMetricsManager mediaMetricsManagerB = F.b(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerB == null) {
            return null;
        }
        return new zzon(context, mediaMetricsManagerB.createPlaybackSession());
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
            final PlaybackMetrics playbackMetricsBuild = this.zzk.build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzok
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd.reportPlaybackMetrics(playbackMetricsBuild);
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
        return this.zzd.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final /* synthetic */ void zze(zzlz zzlzVar, zzz zzzVar, zzhr zzhrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzf(zzlz zzlzVar, int i7, long j, long j3) {
        zzuq zzuqVar = zzlzVar.zzd;
        if (zzuqVar != null) {
            String strZzf = this.zzc.zzf(zzlzVar.zzb, zzuqVar);
            Long l7 = (Long) this.zzi.get(strZzf);
            Long l8 = (Long) this.zzh.get(strZzf);
            this.zzi.put(strZzf, Long.valueOf((l7 == null ? 0L : l7.longValue()) + j));
            this.zzh.put(strZzf, Long.valueOf((l8 != null ? l8.longValue() : 0L) + ((long) i7)));
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

    /* JADX WARN: Code duplicated, block: B:102:0x0172  */
    /* JADX WARN: Code duplicated, block: B:137:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:140:0x01fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x01fc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:145:0x0204  */
    /* JADX WARN: Code duplicated, block: B:146:0x0210  */
    /* JADX WARN: Code duplicated, block: B:148:0x0216  */
    /* JADX WARN: Code duplicated, block: B:149:0x021c  */
    /* JADX WARN: Code duplicated, block: B:151:0x0220  */
    /* JADX WARN: Code duplicated, block: B:152:0x0223  */
    /* JADX WARN: Code duplicated, block: B:154:0x0227  */
    /* JADX WARN: Code duplicated, block: B:155:0x022f  */
    /* JADX WARN: Code duplicated, block: B:157:0x0233  */
    /* JADX WARN: Code duplicated, block: B:158:0x023b  */
    /* JADX WARN: Code duplicated, block: B:160:0x023f  */
    /* JADX WARN: Code duplicated, block: B:161:0x024b  */
    /* JADX WARN: Code duplicated, block: B:171:0x0298  */
    /* JADX WARN: Code duplicated, block: B:173:0x029d  */
    /* JADX WARN: Code duplicated, block: B:175:0x02a2  */
    @Override // com.google.android.gms.internal.ads.zzmb
    public final void zzi(zzbh zzbhVar, zzma zzmaVar) {
        int i7;
        int i8;
        int iZzw;
        int i9;
        int errorCode;
        int iZzm;
        zzs zzsVar;
        int i10;
        int i11;
        if (zzmaVar.zzb() == 0) {
            return;
        }
        for (int i12 = 0; i12 < zzmaVar.zzb(); i12++) {
            int iZza = zzmaVar.zza(i12);
            zzlz zzlzVarZzc = zzmaVar.zzc(iZza);
            if (iZza == 0) {
                this.zzc.zzk(zzlzVarZzc);
            } else if (iZza == 11) {
                this.zzc.zzj(zzlzVarZzc, this.zzl);
            } else {
                this.zzc.zzi(zzlzVarZzc);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzmaVar.zzd(0)) {
            zzlz zzlzVarZzc2 = zzmaVar.zzc(0);
            if (this.zzk != null) {
                zzA(zzlzVarZzc2.zzb, zzlzVarZzc2.zzd);
            }
        }
        if (zzmaVar.zzd(2) && this.zzk != null) {
            zzfwh zzfwhVarZza = zzbhVar.zzp().zza();
            int size = zzfwhVarZza.size();
            int i13 = 0;
            loop1: while (true) {
                if (i13 >= size) {
                    zzsVar = null;
                    break;
                }
                zzbu zzbuVar = (zzbu) zzfwhVarZza.get(i13);
                int i14 = 0;
                while (true) {
                    i11 = i13 + 1;
                    if (i14 < zzbuVar.zza) {
                        if (zzbuVar.zzd(i14) && (zzsVar = zzbuVar.zzb(i14).zzs) != null) {
                            break loop1;
                        } else {
                            i14++;
                        }
                    }
                }
                i13 = i11;
            }
            if (zzsVar != null) {
                PlaybackMetrics.Builder builder = this.zzk;
                int i15 = zzen.zza;
                PlaybackMetrics.Builder builderG = F.g(builder);
                int i16 = 0;
                while (true) {
                    if (i16 >= zzsVar.zzb) {
                        i10 = 1;
                        break;
                    }
                    UUID uuid = zzsVar.zza(i16).zza;
                    if (uuid.equals(zzh.zzd)) {
                        i10 = 3;
                        break;
                    } else if (uuid.equals(zzh.zze)) {
                        i10 = 2;
                        break;
                    } else {
                        if (uuid.equals(zzh.zzc)) {
                            i10 = 6;
                            break;
                        }
                        i16++;
                    }
                }
                builderG.setDrmType(i10);
            }
        }
        if (zzmaVar.zzd(1011)) {
            this.zzz++;
        }
        zzba zzbaVar = this.zzo;
        if (zzbaVar != null) {
            Context context = this.zza;
            if (zzbaVar.zza == 1001) {
                i9 = 20;
            } else {
                zzia zziaVar = (zzia) zzbaVar;
                boolean z4 = zziaVar.zzc == 1;
                int i17 = zziaVar.zzg;
                Throwable cause = zzbaVar.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    if (cause instanceof zzgq) {
                        iZzm = ((zzgq) cause).zzc;
                        i9 = 5;
                    } else if ((cause instanceof zzgp) || (cause instanceof zzaz)) {
                        iZzm = 0;
                        i9 = 11;
                    } else {
                        boolean z7 = cause instanceof zzgo;
                        if (z7 || (cause instanceof zzgy)) {
                            if (zzeb.zzb(context).zza() == 1) {
                                iZzm = 0;
                                i9 = 3;
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    iZzm = 0;
                                    i9 = 6;
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    iZzm = 0;
                                    i9 = 7;
                                } else if (z7 && ((zzgo) cause).zzb == 1) {
                                    iZzm = 0;
                                    i9 = 4;
                                } else {
                                    iZzm = 0;
                                    i9 = 8;
                                }
                            }
                        } else if (zzbaVar.zza == 1002) {
                            i9 = 21;
                        } else if (cause instanceof zzrj) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                errorCode = zzen.zzm(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                iZzw = zzw(errorCode);
                                int i18 = iZzw;
                                iZzm = errorCode;
                                i9 = i18;
                            } else {
                                int i19 = zzen.zza;
                                if (cause3 instanceof MediaDrmResetException) {
                                    i9 = 27;
                                } else if (cause3 instanceof NotProvisionedException) {
                                    i9 = 24;
                                } else if (cause3 instanceof DeniedByServerException) {
                                    i9 = 29;
                                } else if (cause3 instanceof zzrt) {
                                    iZzm = 0;
                                    i9 = 23;
                                } else {
                                    i9 = cause3 instanceof zzri ? 28 : 30;
                                }
                            }
                        } else if ((cause instanceof zzgl) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            if ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                i9 = 32;
                            } else {
                                iZzm = 0;
                                i9 = 31;
                            }
                        } else {
                            iZzm = 0;
                            i9 = 9;
                        }
                    }
                } else if (z4) {
                    i9 = 35;
                    if (i17 != 0 && i17 != 1) {
                        if (!z4 && i17 == 3) {
                            i9 = 15;
                        } else if (!z4 && i17 == 2) {
                            iZzm = 0;
                            i9 = 23;
                        } else if (cause instanceof zzsu) {
                            iZzm = zzen.zzm(((zzsu) cause).zzd);
                            i9 = 13;
                        } else {
                            iZzw = 14;
                            if (cause instanceof zzsq) {
                                errorCode = ((zzsq) cause).zza;
                            } else if (cause instanceof OutOfMemoryError) {
                                i9 = 14;
                            } else if (cause instanceof zzpt) {
                                errorCode = ((zzpt) cause).zza;
                                iZzw = 17;
                            } else if (cause instanceof zzpw) {
                                errorCode = ((zzpw) cause).zza;
                                iZzw = 18;
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                iZzw = zzw(errorCode);
                            } else {
                                i9 = 22;
                            }
                            int i110 = iZzw;
                            iZzm = errorCode;
                            i9 = i110;
                        }
                    }
                } else if (!z4) {
                    if (!z4) {
                    }
                    if (cause instanceof zzsu) {
                        iZzm = zzen.zzm(((zzsu) cause).zzd);
                        i9 = 13;
                    } else {
                        iZzw = 14;
                        if (cause instanceof zzsq) {
                            errorCode = ((zzsq) cause).zza;
                        } else if (cause instanceof OutOfMemoryError) {
                            i9 = 14;
                        } else if (cause instanceof zzpt) {
                            errorCode = ((zzpt) cause).zza;
                            iZzw = 17;
                        } else if (cause instanceof zzpw) {
                            errorCode = ((zzpw) cause).zza;
                            iZzw = 18;
                        } else if (cause instanceof MediaCodec.CryptoException) {
                            errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            iZzw = zzw(errorCode);
                        } else {
                            i9 = 22;
                        }
                        int i111 = iZzw;
                        iZzm = errorCode;
                        i9 = i111;
                    }
                } else {
                    if (!z4) {
                    }
                    if (cause instanceof zzsu) {
                        iZzm = zzen.zzm(((zzsu) cause).zzd);
                        i9 = 13;
                    } else {
                        iZzw = 14;
                        if (cause instanceof zzsq) {
                            errorCode = ((zzsq) cause).zza;
                        } else if (cause instanceof OutOfMemoryError) {
                            i9 = 14;
                        } else if (cause instanceof zzpt) {
                            errorCode = ((zzpt) cause).zza;
                            iZzw = 17;
                        } else if (cause instanceof zzpw) {
                            errorCode = ((zzpw) cause).zza;
                            iZzw = 18;
                        } else if (cause instanceof MediaCodec.CryptoException) {
                            errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            iZzw = zzw(errorCode);
                        } else {
                            i9 = 22;
                        }
                        int i112 = iZzw;
                        iZzm = errorCode;
                        i9 = i112;
                    }
                }
                final PlaybackErrorEvent playbackErrorEventBuild = k.g().setTimeSinceCreatedMillis(jElapsedRealtime - this.zze).setErrorCode(i9).setSubErrorCode(iZzm).setException(zzbaVar).build();
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzd.reportPlaybackErrorEvent(playbackErrorEventBuild);
                    }
                });
                this.zzA = true;
                this.zzo = null;
            }
            iZzm = 0;
            final PlaybackErrorEvent playbackErrorEventBuild2 = k.g().setTimeSinceCreatedMillis(jElapsedRealtime - this.zze).setErrorCode(i9).setSubErrorCode(iZzm).setException(zzbaVar).build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoj
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd.reportPlaybackErrorEvent(playbackErrorEventBuild2);
                }
            });
            this.zzA = true;
            this.zzo = null;
        }
        if (zzmaVar.zzd(2)) {
            zzbv zzbvVarZzp = zzbhVar.zzp();
            boolean zZzb = zzbvVarZzp.zzb(2);
            boolean zZzb2 = zzbvVarZzp.zzb(1);
            boolean zZzb3 = zzbvVarZzp.zzb(3);
            if (zZzb || zZzb2) {
                if (!zZzb) {
                    zzB(jElapsedRealtime, null, 0);
                }
                if (!zZzb2) {
                    zzy(jElapsedRealtime, null, 0);
                }
                if (!zZzb3) {
                    zzz(jElapsedRealtime, null, 0);
                }
            } else if (zZzb3) {
                zZzb3 = true;
                if (!zZzb) {
                    zzB(jElapsedRealtime, null, 0);
                }
                if (!zZzb2) {
                    zzy(jElapsedRealtime, null, 0);
                }
                if (!zZzb3) {
                    zzz(jElapsedRealtime, null, 0);
                }
            }
        }
        if (zzD(this.zzp)) {
            zzz zzzVar = this.zzp.zza;
            if (zzzVar.zzw != -1) {
                zzB(jElapsedRealtime, zzzVar, 0);
                this.zzp = null;
            }
        }
        if (zzD(this.zzq)) {
            zzy(jElapsedRealtime, this.zzq.zza, 0);
            this.zzq = null;
        }
        if (zzD(this.zzr)) {
            zzz(jElapsedRealtime, this.zzr.zza, 0);
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
            final NetworkEvent networkEventBuild = k.c().setNetworkType(i7).setTimeSinceCreatedMillis(jElapsedRealtime - this.zze).build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzoi
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd.reportNetworkEvent(networkEventBuild);
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
        int iZzg = zzbhVar.zzg();
        if (this.zzv) {
            i8 = 5;
        } else if (this.zzw) {
            i8 = 13;
        } else if (iZzg == 4) {
            i8 = 11;
        } else {
            i8 = 12;
            if (iZzg == 2) {
                int i20 = this.zzm;
                if (i20 == 0 || i20 == 2 || i20 == 12) {
                    i8 = 2;
                } else if (zzbhVar.zzv()) {
                    i8 = zzbhVar.zzh() != 0 ? 10 : 6;
                } else {
                    i8 = 7;
                }
            } else if (iZzg == 3) {
                i8 = zzbhVar.zzv() ? zzbhVar.zzh() != 0 ? 9 : 3 : 4;
            } else if (iZzg != 1 || this.zzm == 0) {
                i8 = this.zzm;
            }
        }
        if (this.zzm != i8) {
            this.zzm = i8;
            this.zzA = true;
            final PlaybackStateEvent playbackStateEventBuild = F.j().setState(this.zzm).setTimeSinceCreatedMillis(jElapsedRealtime - this.zze).build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzol
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd.reportPlaybackStateEvent(playbackStateEventBuild);
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
                zzx zzxVarZzb = zzzVar.zzb();
                zzxVarZzb.zzai(zzccVar.zzb);
                zzxVarZzb.zzM(zzccVar.zzc);
                this.zzp = new zzom(zzxVarZzb.zzaj(), 0, zzomVar.zzc);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoo
    public final void zzu(zzlz zzlzVar, String str) {
        zzuq zzuqVar = zzlzVar.zzd;
        if (zzuqVar == null || !zzuqVar.zzb()) {
            zzx();
            this.zzj = str;
            this.zzk = k.h().setPlayerName("AndroidXMedia3").setPlayerVersion("1.6.0-beta01");
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
