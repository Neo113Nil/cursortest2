package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzqb implements com.google.android.gms.internal.ads.zznp, com.google.android.gms.internal.ads.zzqc {
    private boolean zzA;
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzqd zzc;
    private final android.media.metrics.PlaybackSession zzd;
    private java.lang.String zzj;
    private android.media.metrics.PlaybackMetrics.Builder zzk;
    private int zzl;
    private com.google.android.gms.internal.ads.zzau zzo;
    private com.google.android.gms.internal.ads.zzqa zzp;
    private com.google.android.gms.internal.ads.zzqa zzq;
    private com.google.android.gms.internal.ads.zzqa zzr;
    private com.google.android.gms.internal.ads.zzv zzs;
    private com.google.android.gms.internal.ads.zzv zzt;
    private com.google.android.gms.internal.ads.zzv zzu;
    private boolean zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private int zzz;
    private final java.util.concurrent.Executor zzb = com.google.android.gms.internal.ads.zzdh.zza();
    private final com.google.android.gms.internal.ads.zzbe zzf = new com.google.android.gms.internal.ads.zzbe();
    private final com.google.android.gms.internal.ads.zzbd zzg = new com.google.android.gms.internal.ads.zzbd();
    private final java.util.HashMap zzi = new java.util.HashMap();
    private final java.util.HashMap zzh = new java.util.HashMap();
    private final long zze = android.os.SystemClock.elapsedRealtime();
    private int zzm = 0;
    private int zzn = 0;

    private zzqb(android.content.Context context, android.media.metrics.PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzd = playbackSession;
        com.google.android.gms.internal.ads.zzpu zzpuVar = new com.google.android.gms.internal.ads.zzpu(com.google.android.gms.internal.ads.zzpu.zza);
        this.zzc = zzpuVar;
        zzpuVar.zza(this);
    }

    private final void zzA(int i, long j, com.google.android.gms.internal.ads.zzv zzvVar, int i2) {
        android.media.metrics.TrackChangeEvent.Builder timeSinceCreatedMillis = new android.media.metrics.TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.zze);
        if (zzvVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            java.lang.String str = zzvVar.zzo;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            java.lang.String str2 = zzvVar.zzp;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            java.lang.String str3 = zzvVar.zzk;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = zzvVar.zzj;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = zzvVar.zzw;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = zzvVar.zzx;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = zzvVar.zzH;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = zzvVar.zzI;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            java.lang.String str4 = zzvVar.zzd;
            if (str4 != null) {
                java.lang.String str5 = com.google.android.gms.internal.ads.zzfl.zza;
                java.lang.String[] split = str4.split("-", -1);
                android.util.Pair create = android.util.Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((java.lang.String) create.first);
                if (create.second != null) {
                    timeSinceCreatedMillis.setLanguageRegion((java.lang.String) create.second);
                }
            }
            float f = zzvVar.zzA;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzA = true;
        final android.media.metrics.TrackChangeEvent build = timeSinceCreatedMillis.build();
        this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzpx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzqb.this.zzu(build);
            }
        });
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"metricsBuilder"})
    private final void zzB(com.google.android.gms.internal.ads.zzbf zzbfVar, com.google.android.gms.internal.ads.zzxk zzxkVar) {
        int zze;
        android.media.metrics.PlaybackMetrics.Builder builder = this.zzk;
        if (zzxkVar == null || (zze = zzbfVar.zze(zzxkVar.zza)) == -1) {
            return;
        }
        com.google.android.gms.internal.ads.zzbd zzbdVar = this.zzg;
        int i = 0;
        zzbfVar.zzd(zze, zzbdVar, false);
        com.google.android.gms.internal.ads.zzbe zzbeVar = this.zzf;
        zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L);
        com.google.android.gms.internal.ads.zzag zzagVar = zzbeVar.zzd.zzb;
        if (zzagVar != null) {
            int zzI = com.google.android.gms.internal.ads.zzfl.zzI(zzagVar.zza);
            i = zzI != 0 ? zzI != 1 ? zzI != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        long j = zzbeVar.zzm;
        if (j != -9223372036854775807L && !zzbeVar.zzk && !zzbeVar.zzi && !zzbeVar.zzb()) {
            builder.setMediaDurationMillis(com.google.android.gms.internal.ads.zzfl.zzr(j));
        }
        builder.setPlaybackType(true != zzbeVar.zzb() ? 1 : 2);
        this.zzA = true;
    }

    private final void zzC() {
        android.media.metrics.PlaybackMetrics.Builder builder = this.zzk;
        if (builder != null && this.zzA) {
            builder.setAudioUnderrunCount(this.zzz);
            this.zzk.setVideoFramesDropped(this.zzx);
            this.zzk.setVideoFramesPlayed(this.zzy);
            java.lang.Long l = (java.lang.Long) this.zzh.get(this.zzj);
            this.zzk.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            java.lang.Long l2 = (java.lang.Long) this.zzi.get(this.zzj);
            this.zzk.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.zzk.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            final android.media.metrics.PlaybackMetrics build = this.zzk.build();
            this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzpy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzqb.this.zzv(build);
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

    private static int zzD(int i) {
        switch (com.google.android.gms.internal.ads.zzfl.zzH(i)) {
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

    public static com.google.android.gms.internal.ads.zzqb zza(android.content.Context context) {
        android.media.metrics.MediaMetricsManager mediaMetricsManager = (android.media.metrics.MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new com.google.android.gms.internal.ads.zzqb(context, mediaMetricsManager.createPlaybackSession());
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1"}, result = true)
    private final boolean zzw(com.google.android.gms.internal.ads.zzqa zzqaVar) {
        if (zzqaVar != null) {
            return zzqaVar.zzc.equals(this.zzc.zzf());
        }
        return false;
    }

    private final void zzx(long j, com.google.android.gms.internal.ads.zzv zzvVar, int i) {
        if (java.util.Objects.equals(this.zzs, zzvVar)) {
            return;
        }
        int i2 = this.zzs == null ? 1 : 0;
        this.zzs = zzvVar;
        zzA(1, j, zzvVar, i2);
    }

    private final void zzy(long j, com.google.android.gms.internal.ads.zzv zzvVar, int i) {
        if (java.util.Objects.equals(this.zzt, zzvVar)) {
            return;
        }
        int i2 = this.zzt == null ? 1 : 0;
        this.zzt = zzvVar;
        zzA(0, j, zzvVar, i2);
    }

    private final void zzz(long j, com.google.android.gms.internal.ads.zzv zzvVar, int i) {
        if (java.util.Objects.equals(this.zzu, zzvVar)) {
            return;
        }
        int i2 = this.zzu == null ? 1 : 0;
        this.zzu = zzvVar;
        zzA(2, j, zzvVar, i2);
    }

    public final android.media.metrics.LogSessionId zzb() {
        return this.zzd.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzc(com.google.android.gms.internal.ads.zznn zznnVar, java.lang.String str) {
        com.google.android.gms.internal.ads.zzxk zzxkVar = zznnVar.zzd;
        if (zzxkVar == null || !zzxkVar.zzb()) {
            zzC();
            this.zzj = str;
            this.zzk = new android.media.metrics.PlaybackMetrics.Builder().setPlayerName(androidx.media3.common.MediaLibraryInfo.TAG).setPlayerVersion("1.10.0-rc02");
            zzB(zznnVar.zzb, zzxkVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqc
    public final void zzd(com.google.android.gms.internal.ads.zznn zznnVar, java.lang.String str, boolean z) {
        com.google.android.gms.internal.ads.zzxk zzxkVar = zznnVar.zzd;
        if ((zzxkVar == null || !zzxkVar.zzb()) && str.equals(this.zzj)) {
            zzC();
        }
        this.zzh.remove(str);
        this.zzi.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zznp
    public final void zzde(com.google.android.gms.internal.ads.zznn zznnVar, com.google.android.gms.internal.ads.zzba zzbaVar, com.google.android.gms.internal.ads.zzba zzbaVar2, int i) {
        if (i == 1) {
            this.zzv = true;
            i = 1;
        }
        this.zzl = i;
    }

    @Override // com.google.android.gms.internal.ads.zznp
    public final void zzdf(com.google.android.gms.internal.ads.zznn zznnVar, com.google.android.gms.internal.ads.zzxg zzxgVar) {
        com.google.android.gms.internal.ads.zzxk zzxkVar = zznnVar.zzd;
        if (zzxkVar == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzv zzvVar = zzxgVar.zzb;
        zzvVar.getClass();
        com.google.android.gms.internal.ads.zzqa zzqaVar = new com.google.android.gms.internal.ads.zzqa(zzvVar, 0, this.zzc.zzb(zznnVar.zzb, zzxkVar));
        int i = zzxgVar.zza;
        if (i != 0) {
            if (i == 1) {
                this.zzq = zzqaVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.zzr = zzqaVar;
                return;
            }
        }
        this.zzp = zzqaVar;
    }

    @Override // com.google.android.gms.internal.ads.zznp
    public final void zzdg(com.google.android.gms.internal.ads.zznn zznnVar, int i, long j, long j2) {
        com.google.android.gms.internal.ads.zzxk zzxkVar = zznnVar.zzd;
        if (zzxkVar != null) {
            java.lang.String zzb = this.zzc.zzb(zznnVar.zzb, zzxkVar);
            java.util.HashMap hashMap = this.zzi;
            java.lang.Long l = (java.lang.Long) hashMap.get(zzb);
            java.util.HashMap hashMap2 = this.zzh;
            java.lang.Long l2 = (java.lang.Long) hashMap2.get(zzb);
            hashMap.put(zzb, java.lang.Long.valueOf((l == null ? 0L : l.longValue()) + j));
            hashMap2.put(zzb, java.lang.Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zznp
    public final void zzdh(com.google.android.gms.internal.ads.zznn zznnVar, com.google.android.gms.internal.ads.zzjb zzjbVar) {
        this.zzx += zzjbVar.zzg;
        this.zzy += zzjbVar.zze;
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x01e7, code lost:
    
        if (r12 != 1) goto L137;
     */
    @Override // com.google.android.gms.internal.ads.zznp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzdi(com.google.android.gms.internal.ads.zzbb zzbbVar, com.google.android.gms.internal.ads.zzno zznoVar) {
        int i;
        int i2;
        int i3;
        int errorCode;
        int zzD;
        int i4;
        com.google.android.gms.internal.ads.zzq zzqVar;
        int i5;
        int i6;
        if (zznoVar.zzc() == 0) {
            return;
        }
        for (int i7 = 0; i7 < zznoVar.zzc(); i7++) {
            int zzd = zznoVar.zzd(i7);
            com.google.android.gms.internal.ads.zznn zza = zznoVar.zza(zzd);
            if (zzd == 0) {
                this.zzc.zzd(zza);
            } else if (zzd == 11) {
                this.zzc.zze(zza, this.zzl);
            } else {
                this.zzc.zzc(zza);
            }
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (zznoVar.zzb(0)) {
            com.google.android.gms.internal.ads.zznn zza2 = zznoVar.zza(0);
            if (this.zzk != null) {
                zzB(zza2.zzb, zza2.zzd);
            }
        }
        if (zznoVar.zzb(2) && this.zzk != null) {
            com.google.android.gms.internal.ads.zzgwm zza3 = zzbbVar.zzp().zza();
            int size = zza3.size();
            int i8 = 0;
            loop1: while (true) {
                if (i8 >= size) {
                    zzqVar = null;
                    break;
                }
                com.google.android.gms.internal.ads.zzbm zzbmVar = (com.google.android.gms.internal.ads.zzbm) zza3.get(i8);
                int i9 = 0;
                while (true) {
                    i6 = i8 + 1;
                    if (i9 < zzbmVar.zza) {
                        if (zzbmVar.zzc(i9) && (zzqVar = zzbmVar.zza(i9).zzt) != null) {
                            break loop1;
                        } else {
                            i9++;
                        }
                    }
                }
                i8 = i6;
            }
            if (zzqVar != null) {
                android.media.metrics.PlaybackMetrics.Builder builder = this.zzk;
                java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
                int i10 = 0;
                while (true) {
                    if (i10 >= zzqVar.zzb) {
                        i5 = 1;
                        break;
                    }
                    java.util.UUID uuid = zzqVar.zza(i10).zza;
                    if (uuid.equals(com.google.android.gms.internal.ads.zzg.zzd)) {
                        i5 = 3;
                        break;
                    } else if (uuid.equals(com.google.android.gms.internal.ads.zzg.zze)) {
                        i5 = 2;
                        break;
                    } else {
                        if (uuid.equals(com.google.android.gms.internal.ads.zzg.zzc)) {
                            i5 = 6;
                            break;
                        }
                        i10++;
                    }
                }
                builder.setDrmType(i5);
            }
        }
        if (zznoVar.zzb(1011)) {
            this.zzz++;
        }
        com.google.android.gms.internal.ads.zzau zzauVar = this.zzo;
        if (zzauVar != null) {
            android.content.Context context = this.zza;
            int i11 = zzauVar.zza;
            if (i11 == 1001) {
                i3 = 20;
            } else {
                com.google.android.gms.internal.ads.zzjk zzjkVar = (com.google.android.gms.internal.ads.zzjk) zzauVar;
                boolean z = zzjkVar.zzc == 1;
                int i12 = zzjkVar.zzg;
                java.lang.Throwable cause = zzauVar.getCause();
                cause.getClass();
                if (!(cause instanceof java.io.IOException)) {
                    if (z) {
                        i3 = 35;
                        if (i12 != 0) {
                        }
                    }
                    if (z && i12 == 3) {
                        i3 = 15;
                    } else {
                        if (!z || i12 != 2) {
                            if (cause instanceof com.google.android.gms.internal.ads.zzvp) {
                                i4 = com.google.android.gms.internal.ads.zzfl.zzT(((com.google.android.gms.internal.ads.zzvp) cause).zzd);
                                i3 = 13;
                            } else if (cause instanceof com.google.android.gms.internal.ads.zzvl) {
                                i4 = ((com.google.android.gms.internal.ads.zzvl) cause).zza;
                                i3 = 14;
                            } else if (cause instanceof java.lang.OutOfMemoryError) {
                                i3 = 14;
                            } else if (cause instanceof com.google.android.gms.internal.ads.zzsa) {
                                i3 = 17;
                            } else if (cause instanceof com.google.android.gms.internal.ads.zzsd) {
                                i4 = ((com.google.android.gms.internal.ads.zzsd) cause).zza;
                                i3 = 18;
                            } else if (cause instanceof android.media.MediaCodec.CryptoException) {
                                errorCode = ((android.media.MediaCodec.CryptoException) cause).getErrorCode();
                                zzD = zzD(errorCode);
                                int i13 = zzD;
                                i4 = errorCode;
                                i3 = i13;
                            } else {
                                i3 = 22;
                            }
                            final android.media.metrics.PlaybackErrorEvent build = new android.media.metrics.PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.zze).setErrorCode(i3).setSubErrorCode(i4).setException(zzauVar).build();
                            this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzpz
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    com.google.android.gms.internal.ads.zzqb.this.zzr(build);
                                }
                            });
                            this.zzA = true;
                            this.zzo = null;
                        }
                        i3 = 23;
                    }
                } else if (cause instanceof com.google.android.gms.internal.ads.zzig) {
                    i4 = ((com.google.android.gms.internal.ads.zzig) cause).zzc;
                    i3 = 5;
                    final android.media.metrics.PlaybackErrorEvent build2 = new android.media.metrics.PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.zze).setErrorCode(i3).setSubErrorCode(i4).setException(zzauVar).build();
                    this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzpz
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.internal.ads.zzqb.this.zzr(build2);
                        }
                    });
                    this.zzA = true;
                    this.zzo = null;
                } else if ((cause instanceof com.google.android.gms.internal.ads.zzif) || (cause instanceof com.google.android.gms.internal.ads.zzat)) {
                    i3 = 11;
                } else {
                    boolean z2 = cause instanceof com.google.android.gms.internal.ads.zzie;
                    if (z2 || (cause instanceof com.google.android.gms.internal.ads.zzio)) {
                        if (com.google.android.gms.internal.ads.zzer.zza(context).zzc() == 1) {
                            i3 = 3;
                        } else {
                            java.lang.Throwable cause2 = cause.getCause();
                            i3 = cause2 instanceof java.net.UnknownHostException ? 6 : cause2 instanceof java.net.SocketTimeoutException ? 7 : (z2 && ((com.google.android.gms.internal.ads.zzie) cause).zzb == 1) ? 4 : 8;
                        }
                    } else if (i11 == 1002) {
                        i3 = 21;
                    } else if (cause instanceof com.google.android.gms.internal.ads.zzuf) {
                        java.lang.Throwable cause3 = cause.getCause();
                        cause3.getClass();
                        if (cause3 instanceof android.media.MediaDrm.MediaDrmStateException) {
                            errorCode = com.google.android.gms.internal.ads.zzfl.zzT(((android.media.MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                            zzD = zzD(errorCode);
                            int i132 = zzD;
                            i4 = errorCode;
                            i3 = i132;
                            final android.media.metrics.PlaybackErrorEvent build22 = new android.media.metrics.PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.zze).setErrorCode(i3).setSubErrorCode(i4).setException(zzauVar).build();
                            this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzpz
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    com.google.android.gms.internal.ads.zzqb.this.zzr(build22);
                                }
                            });
                            this.zzA = true;
                            this.zzo = null;
                        } else if (cause3 instanceof android.media.MediaDrmResetException) {
                            i3 = 27;
                        } else if (cause3 instanceof android.media.NotProvisionedException) {
                            i3 = 24;
                        } else if (cause3 instanceof android.media.DeniedByServerException) {
                            i3 = 29;
                        } else {
                            if (!(cause3 instanceof com.google.android.gms.internal.ads.zzup)) {
                                i3 = cause3 instanceof com.google.android.gms.internal.ads.zzue ? 28 : 30;
                            }
                            i3 = 23;
                        }
                    } else if ((cause instanceof com.google.android.gms.internal.ads.zzib) && (cause.getCause() instanceof java.io.FileNotFoundException)) {
                        java.lang.Throwable cause4 = cause.getCause();
                        cause4.getClass();
                        java.lang.Throwable cause5 = cause4.getCause();
                        i3 = ((cause5 instanceof android.system.ErrnoException) && ((android.system.ErrnoException) cause5).errno == android.system.OsConstants.EACCES) ? 32 : 31;
                    } else {
                        i3 = 9;
                    }
                }
            }
            i4 = 0;
            final android.media.metrics.PlaybackErrorEvent build222 = new android.media.metrics.PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.zze).setErrorCode(i3).setSubErrorCode(i4).setException(zzauVar).build();
            this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzpz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzqb.this.zzr(build222);
                }
            });
            this.zzA = true;
            this.zzo = null;
        }
        if (zznoVar.zzb(2)) {
            com.google.android.gms.internal.ads.zzbn zzp = zzbbVar.zzp();
            boolean zzb = zzp.zzb(2);
            boolean zzb2 = zzp.zzb(1);
            boolean zzb3 = zzp.zzb(3);
            if (!zzb && !zzb2) {
                if (zzb3) {
                    zzb3 = true;
                }
            }
            if (!zzb) {
                zzx(elapsedRealtime, null, 0);
            }
            if (!zzb2) {
                zzy(elapsedRealtime, null, 0);
            }
            if (!zzb3) {
                zzz(elapsedRealtime, null, 0);
            }
        }
        if (zzw(this.zzp)) {
            com.google.android.gms.internal.ads.zzqa zzqaVar = this.zzp;
            com.google.android.gms.internal.ads.zzv zzvVar = zzqaVar.zza;
            if (zzvVar.zzx != -1) {
                int i14 = zzqaVar.zzb;
                zzx(elapsedRealtime, zzvVar, 0);
                this.zzp = null;
            }
        }
        if (zzw(this.zzq)) {
            com.google.android.gms.internal.ads.zzqa zzqaVar2 = this.zzq;
            com.google.android.gms.internal.ads.zzv zzvVar2 = zzqaVar2.zza;
            int i15 = zzqaVar2.zzb;
            zzy(elapsedRealtime, zzvVar2, 0);
            this.zzq = null;
        }
        if (zzw(this.zzr)) {
            com.google.android.gms.internal.ads.zzqa zzqaVar3 = this.zzr;
            com.google.android.gms.internal.ads.zzv zzvVar3 = zzqaVar3.zza;
            int i16 = zzqaVar3.zzb;
            zzz(elapsedRealtime, zzvVar3, 0);
            this.zzr = null;
        }
        switch (com.google.android.gms.internal.ads.zzer.zza(this.zza).zzc()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 9;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
            case 8:
            default:
                i = 1;
                break;
            case 7:
                i = 3;
                break;
            case 9:
                i = 8;
                break;
            case 10:
                i = 7;
                break;
        }
        if (i != this.zzn) {
            this.zzn = i;
            final android.media.metrics.NetworkEvent build3 = new android.media.metrics.NetworkEvent.Builder().setNetworkType(i).setTimeSinceCreatedMillis(elapsedRealtime - this.zze).build();
            this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzpv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzqb.this.zzs(build3);
                }
            });
        }
        if (zzbbVar.zzh() != 2) {
            this.zzv = false;
        }
        if (((com.google.android.gms.internal.ads.zznk) zzbbVar).zzI() == null) {
            this.zzw = false;
        } else if (zznoVar.zzb(10)) {
            this.zzw = true;
        }
        int zzh = zzbbVar.zzh();
        if (this.zzv) {
            i2 = 5;
        } else if (this.zzw) {
            i2 = 13;
        } else {
            i2 = 4;
            if (zzh == 4) {
                i2 = 11;
            } else if (zzh == 2) {
                int i17 = this.zzm;
                i2 = (i17 == 0 || i17 == 2 || i17 == 12) ? 2 : !zzbbVar.zzk() ? 7 : zzbbVar.zzi() != 0 ? 10 : 6;
            } else if (zzh != 3) {
                i2 = (zzh != 1 || this.zzm == 0) ? this.zzm : 12;
            } else if (zzbbVar.zzk()) {
                i2 = zzbbVar.zzi() != 0 ? 9 : 3;
            }
        }
        if (this.zzm != i2) {
            this.zzm = i2;
            this.zzA = true;
            final android.media.metrics.PlaybackStateEvent build4 = new android.media.metrics.PlaybackStateEvent.Builder().setState(this.zzm).setTimeSinceCreatedMillis(elapsedRealtime - this.zze).build();
            this.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzpw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzqb.this.zzt(build4);
                }
            });
        }
        if (zznoVar.zzb(1028)) {
            this.zzc.zzg(zznoVar.zza(1028));
        }
    }

    @Override // com.google.android.gms.internal.ads.zznp
    public /* synthetic */ void zze(com.google.android.gms.internal.ads.zznn zznnVar, int i) {
        com.google.android.gms.internal.ads.zznp.CC.$default$zze(this, zznnVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zznp
    public final void zzg(com.google.android.gms.internal.ads.zznn zznnVar, com.google.android.gms.internal.ads.zzau zzauVar) {
        this.zzo = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zznp
    public final void zzh(com.google.android.gms.internal.ads.zznn zznnVar, com.google.android.gms.internal.ads.zzxb zzxbVar, com.google.android.gms.internal.ads.zzxg zzxgVar, java.io.IOException iOException, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zznp
    public /* synthetic */ void zzk(com.google.android.gms.internal.ads.zznn zznnVar, com.google.android.gms.internal.ads.zzv zzvVar, com.google.android.gms.internal.ads.zzjc zzjcVar) {
        com.google.android.gms.internal.ads.zznp.CC.$default$zzk(this, zznnVar, zzvVar, zzjcVar);
    }

    @Override // com.google.android.gms.internal.ads.zznp
    public /* synthetic */ void zzl(com.google.android.gms.internal.ads.zznn zznnVar, com.google.android.gms.internal.ads.zzv zzvVar, com.google.android.gms.internal.ads.zzjc zzjcVar) {
        com.google.android.gms.internal.ads.zznp.CC.$default$zzl(this, zznnVar, zzvVar, zzjcVar);
    }

    @Override // com.google.android.gms.internal.ads.zznp
    public /* synthetic */ void zzm(com.google.android.gms.internal.ads.zznn zznnVar, int i, long j) {
        com.google.android.gms.internal.ads.zznp.CC.$default$zzm(this, zznnVar, i, j);
    }

    @Override // com.google.android.gms.internal.ads.zznp
    public /* synthetic */ void zzo(com.google.android.gms.internal.ads.zznn zznnVar, java.lang.Object obj, long j) {
        com.google.android.gms.internal.ads.zznp.CC.$default$zzo(this, zznnVar, obj, j);
    }

    @Override // com.google.android.gms.internal.ads.zznp
    public final void zzp(com.google.android.gms.internal.ads.zznn zznnVar, com.google.android.gms.internal.ads.zzbv zzbvVar) {
        com.google.android.gms.internal.ads.zzqa zzqaVar = this.zzp;
        if (zzqaVar != null) {
            com.google.android.gms.internal.ads.zzv zzvVar = zzqaVar.zza;
            if (zzvVar.zzx == -1) {
                com.google.android.gms.internal.ads.zzt zza = zzvVar.zza();
                zza.zzv(zzbvVar.zzb);
                zza.zzw(zzbvVar.zzc);
                this.zzp = new com.google.android.gms.internal.ads.zzqa(zza.zzO(), 0, zzqaVar.zzc);
            }
        }
    }

    final /* synthetic */ void zzr(android.media.metrics.PlaybackErrorEvent playbackErrorEvent) {
        this.zzd.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    final /* synthetic */ void zzs(android.media.metrics.NetworkEvent networkEvent) {
        this.zzd.reportNetworkEvent(networkEvent);
    }

    final /* synthetic */ void zzt(android.media.metrics.PlaybackStateEvent playbackStateEvent) {
        this.zzd.reportPlaybackStateEvent(playbackStateEvent);
    }

    final /* synthetic */ void zzu(android.media.metrics.TrackChangeEvent trackChangeEvent) {
        this.zzd.reportTrackChangeEvent(trackChangeEvent);
    }

    final /* synthetic */ void zzv(android.media.metrics.PlaybackMetrics playbackMetrics) {
        this.zzd.reportPlaybackMetrics(playbackMetrics);
    }
}
