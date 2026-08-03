package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zztr implements com.google.android.gms.internal.ads.zzse {
    private static final java.util.concurrent.atomic.AtomicInteger zza = new java.util.concurrent.atomic.AtomicInteger();
    private long zzA;
    private long zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private long zzF;
    private float zzG;
    private java.nio.ByteBuffer zzH;
    private int zzI;
    private java.nio.ByteBuffer zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private int zzO;
    private boolean zzP;
    private com.google.android.gms.internal.ads.zze zzQ;
    private android.media.AudioDeviceInfo zzR;
    private int zzS;
    private long zzT;
    private boolean zzU;
    private boolean zzV;
    private long zzW;
    private long zzX;
    private android.os.Handler zzY;
    private final com.google.android.gms.internal.ads.zztm zzZ;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zztg zzc;
    private final com.google.android.gms.internal.ads.zzud zzd;
    private final com.google.android.gms.internal.ads.zzcv zze;
    private final com.google.android.gms.internal.ads.zzuc zzf;
    private final com.google.android.gms.internal.ads.zzgwm zzg;
    private final java.util.ArrayDeque zzh;
    private com.google.android.gms.internal.ads.zzti zzi;
    private final com.google.android.gms.internal.ads.zztq zzj;
    private final com.google.android.gms.internal.ads.zztq zzk;
    private com.google.android.gms.internal.ads.zzqf zzl;
    private com.google.android.gms.internal.ads.zzsb zzm;
    private com.google.android.gms.internal.ads.zztl zzn;
    private com.google.android.gms.internal.ads.zztl zzo;
    private com.google.android.gms.internal.ads.zzck zzp;
    private final com.google.android.gms.internal.ads.zzrf zzq;
    private com.google.android.gms.internal.ads.zzrc zzr;
    private com.google.android.gms.internal.ads.zzqv zzs;
    private com.google.android.gms.internal.ads.zzd zzt;
    private com.google.android.gms.internal.ads.zztp zzu;
    private com.google.android.gms.internal.ads.zztp zzv;
    private com.google.android.gms.internal.ads.zzav zzw;
    private boolean zzx;
    private long zzy;
    private long zzz;

    static /* synthetic */ boolean zzH() {
        return zza.get() > 0;
    }

    private final void zzR() {
        com.google.android.gms.internal.ads.zzck zzk = this.zzo.zzk();
        this.zzp = zzk;
        zzk.zzb(com.google.android.gms.internal.ads.zzcm.zza);
    }

    private final com.google.android.gms.internal.ads.zzqv zzS(com.google.android.gms.internal.ads.zzre zzreVar) throws com.google.android.gms.internal.ads.zzsa {
        try {
            return ((com.google.android.gms.internal.ads.zztd) this.zzq).zzf(zzreVar);
        } catch (com.google.android.gms.internal.ads.zzrb e) {
            com.google.android.gms.internal.ads.zzsa zzsaVar = new com.google.android.gms.internal.ads.zzsa(0, zzreVar.zzb, zzreVar.zzc, zzreVar.zza, zzreVar.zze, this.zzo.zzf(), false, e);
            com.google.android.gms.internal.ads.zzsb zzsbVar = this.zzm;
            if (zzsbVar == null) {
                throw zzsaVar;
            }
            zzsbVar.zza(zzsaVar);
            throw zzsaVar;
        }
    }

    private final void zzT(long j) throws com.google.android.gms.internal.ads.zzsd {
        zzW(j);
        if (this.zzJ != null) {
            return;
        }
        if (!this.zzp.zzc()) {
            java.nio.ByteBuffer byteBuffer = this.zzH;
            if (byteBuffer != null) {
                zzV(byteBuffer);
                zzW(j);
                return;
            }
            return;
        }
        while (!this.zzp.zzg()) {
            do {
                java.nio.ByteBuffer zze = this.zzp.zze();
                if (zze.hasRemaining()) {
                    zzV(zze);
                    zzW(j);
                } else {
                    java.nio.ByteBuffer byteBuffer2 = this.zzH;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzp.zzd(this.zzH);
                    }
                }
            } while (this.zzJ == null);
            return;
        }
    }

    private final boolean zzU() throws com.google.android.gms.internal.ads.zzsd {
        java.nio.ByteBuffer byteBuffer;
        if (!this.zzp.zzc()) {
            zzW(Long.MIN_VALUE);
            return this.zzJ == null;
        }
        this.zzp.zzf();
        zzT(Long.MIN_VALUE);
        return this.zzp.zzg() && ((byteBuffer = this.zzJ) == null || !byteBuffer.hasRemaining());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzV(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer byteBuffer2;
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        int i6;
        com.google.android.gms.internal.ads.zzgtj.zzi(this.zzJ == null);
        if (byteBuffer.hasRemaining()) {
            if (this.zzo.zze()) {
                int zzu = (int) com.google.android.gms.internal.ads.zzfl.zzu(com.google.android.gms.internal.ads.zzfl.zzs(20L), this.zzo.zzj().zzb);
                long zzae = zzae();
                long j = zzu;
                if (zzae < j) {
                    int i7 = this.zzo.zzj().zza;
                    int zzi = this.zzo.zzi();
                    java.nio.ByteBuffer order = java.nio.ByteBuffer.allocateDirect(byteBuffer.remaining()).order(java.nio.ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    int i8 = (int) zzae;
                    while (byteBuffer.hasRemaining() && i8 < zzu) {
                        if (i7 != 2) {
                            if (i7 == 3) {
                                i3 = (byteBuffer.get() & 255) << 24;
                            } else if (i7 != 4) {
                                if (i7 == 21) {
                                    i4 = (byteBuffer.get() & 255) << 8;
                                    i5 = (byteBuffer.get() & 255) << 16;
                                    i6 = (byteBuffer.get() & 255) << 24;
                                } else if (i7 == 22) {
                                    i3 = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 24);
                                } else if (i7 == 268435456) {
                                    i = (byteBuffer.get() & 255) << 24;
                                    i2 = (byteBuffer.get() & 255) << 16;
                                } else if (i7 == 1342177280) {
                                    i4 = (byteBuffer.get() & 255) << 24;
                                    i5 = (byteBuffer.get() & 255) << 16;
                                    i6 = (byteBuffer.get() & 255) << 8;
                                } else if (i7 == 1610612736) {
                                    int i9 = (byteBuffer.get() & 255) << 24;
                                    int i10 = (byteBuffer.get() & 255) << 16;
                                    int i11 = (byteBuffer.get() & 255) << 8;
                                    i2 = byteBuffer.get() & 255;
                                    i = i11 | i9 | i10;
                                } else {
                                    if (i7 != 1879048192) {
                                        throw new java.lang.IllegalStateException();
                                    }
                                    double zzm = com.google.android.gms.internal.ads.zzfl.zzm(byteBuffer.getDouble(), -1.0d, 1.0d);
                                    i3 = (int) (zzm < 0.0d ? (-zzm) * (-2.147483648E9d) : zzm * 2.147483647E9d);
                                }
                                i3 = i6 | i4 | i5;
                            } else {
                                float max = java.lang.Math.max(-1.0f, java.lang.Math.min(byteBuffer.getFloat(), 1.0f));
                                if (max < 0.0f) {
                                    max = -max;
                                    f = -2.1474836E9f;
                                } else {
                                    f = 2.1474836E9f;
                                }
                                i3 = (int) (max * f);
                            }
                            int i12 = (int) ((i3 * i8) / j);
                            if (i7 != 2) {
                                order.put((byte) (i12 >> 16));
                                order.put((byte) (i12 >> 24));
                            } else if (i7 == 3) {
                                order.put((byte) (i12 >> 24));
                            } else if (i7 != 4) {
                                if (i7 == 21) {
                                    order.put((byte) (i12 >> 8));
                                    order.put((byte) (i12 >> 16));
                                    order.put((byte) (i12 >> 24));
                                } else if (i7 == 22) {
                                    order.put((byte) i12);
                                    order.put((byte) (i12 >> 8));
                                    order.put((byte) (i12 >> 16));
                                    order.put((byte) (i12 >> 24));
                                } else if (i7 == 268435456) {
                                    order.put((byte) (i12 >> 24));
                                    order.put((byte) (i12 >> 16));
                                } else if (i7 == 1342177280) {
                                    order.put((byte) (i12 >> 24));
                                    order.put((byte) (i12 >> 16));
                                    order.put((byte) (i12 >> 8));
                                } else if (i7 == 1610612736) {
                                    order.put((byte) (i12 >> 24));
                                    order.put((byte) (i12 >> 16));
                                    order.put((byte) (i12 >> 8));
                                    order.put((byte) i12);
                                } else {
                                    if (i7 != 1879048192) {
                                        throw new java.lang.IllegalStateException();
                                    }
                                    if (i12 < 0) {
                                        order.putDouble((-i12) / (-2.147483648E9d));
                                    } else {
                                        order.putDouble(i12 / 2.147483647E9d);
                                    }
                                }
                            } else if (i12 < 0) {
                                order.putFloat((-i12) / (-2.1474836E9f));
                            } else {
                                order.putFloat(i12 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() != position + zzi) {
                                i8++;
                                position = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            i2 = (byteBuffer.get() & 255) << 24;
                        }
                        i3 = i | i2;
                        int i122 = (int) ((i3 * i8) / j);
                        if (i7 != 2) {
                        }
                        if (byteBuffer.position() != position + zzi) {
                        }
                    }
                    order.put(byteBuffer);
                    order.flip();
                    byteBuffer2 = order;
                    this.zzJ = byteBuffer2;
                }
            }
            byteBuffer2 = byteBuffer;
            this.zzJ = byteBuffer2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzW(long j) throws com.google.android.gms.internal.ads.zzsd {
        com.google.android.gms.internal.ads.zzsb zzsbVar;
        com.google.android.gms.internal.ads.zzsb zzsbVar2;
        if (this.zzJ == null || this.zzk.zzb()) {
            return;
        }
        int remaining = this.zzJ.remaining();
        try {
            boolean zzc = this.zzs.zzc(this.zzJ, this.zzI, j);
            this.zzT = android.os.SystemClock.elapsedRealtime();
            this.zzk.zzc();
            if (this.zzs.zzg()) {
                if (this.zzB > 0) {
                    this.zzV = false;
                }
                if (this.zzN && (zzsbVar2 = this.zzm) != null && !zzc) {
                }
            }
            if (this.zzo.zze()) {
                this.zzA += remaining - this.zzJ.remaining();
            }
            if (zzc) {
                if (!this.zzo.zze()) {
                    com.google.android.gms.internal.ads.zzgtj.zzi(this.zzJ == this.zzH);
                    this.zzB += this.zzC * this.zzI;
                }
                this.zzJ = null;
            }
        } catch (com.google.android.gms.internal.ads.zzqu e) {
            boolean z = e.zzb;
            if (z) {
                if (zzae() <= 0) {
                    if (this.zzs.zzg()) {
                        zzX();
                    }
                }
                com.google.android.gms.internal.ads.zzsd zzsdVar = new com.google.android.gms.internal.ads.zzsd(e.zza, this.zzo.zzf(), r3);
                zzsbVar = this.zzm;
                if (zzsbVar != null) {
                    zzsbVar.zza(zzsdVar);
                }
                if (!z) {
                    throw zzsdVar;
                }
                this.zzk.zza(zzsdVar);
                return;
            }
            r3 = false;
            com.google.android.gms.internal.ads.zzsd zzsdVar2 = new com.google.android.gms.internal.ads.zzsd(e.zza, this.zzo.zzf(), r3);
            zzsbVar = this.zzm;
            if (zzsbVar != null) {
            }
            if (!z) {
            }
        }
    }

    private final void zzX() {
        this.zzo.zzj();
    }

    private final void zzY() {
        if (zzad()) {
            this.zzs.zzf(this.zzG);
        }
    }

    private final void zzZ() {
        if (this.zzo != null) {
            com.google.android.gms.internal.ads.zztl zztlVar = this.zzn;
            if (zztlVar != null) {
                this.zzo = zztlVar;
                this.zzn = null;
            }
            try {
                this.zzo = new com.google.android.gms.internal.ads.zztl(this.zzo.zzf(), this.zzo.zzg(), this.zzo.zzh(), this.zzo.zzi(), this.zzq.zzb(zzaf(this.zzo.zzg(), -1)), this.zzo.zzk(), null);
            } catch (com.google.android.gms.internal.ads.zzqw e) {
                throw new java.lang.IllegalStateException(new com.google.android.gms.internal.ads.zzrz(e, this.zzo.zzf()));
            }
        }
        zzB();
    }

    private final void zzaa(com.google.android.gms.internal.ads.zzav zzavVar) {
        com.google.android.gms.internal.ads.zztp zztpVar = new com.google.android.gms.internal.ads.zztp(zzavVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzad()) {
            this.zzu = zztpVar;
        } else {
            this.zzv = zztpVar;
        }
    }

    private final void zzab(long j) {
        com.google.android.gms.internal.ads.zzav zzavVar;
        boolean z;
        if (zzac()) {
            com.google.android.gms.internal.ads.zztm zztmVar = this.zzZ;
            zzavVar = this.zzw;
            zztmVar.zzb(zzavVar);
        } else {
            zzavVar = com.google.android.gms.internal.ads.zzav.zza;
        }
        com.google.android.gms.internal.ads.zzav zzavVar2 = zzavVar;
        this.zzw = zzavVar2;
        if (zzac()) {
            com.google.android.gms.internal.ads.zztm zztmVar2 = this.zzZ;
            z = this.zzx;
            zztmVar2.zzc(z);
        } else {
            z = false;
        }
        this.zzx = z;
        this.zzh.add(new com.google.android.gms.internal.ads.zztp(zzavVar2, java.lang.Math.max(0L, j), this.zzo.zzc(zzae()), null));
        zzR();
        com.google.android.gms.internal.ads.zzsb zzsbVar = this.zzm;
        if (zzsbVar != null) {
            ((com.google.android.gms.internal.ads.zztw) zzsbVar).zza.zzaz().zzh(this.zzx);
        }
    }

    private final boolean zzac() {
        if (!this.zzo.zze()) {
            return false;
        }
        int i = this.zzo.zzf().zzJ;
        return true;
    }

    private final boolean zzad() {
        return this.zzs != null;
    }

    private final long zzae() {
        if (!this.zzo.zze()) {
            return this.zzB;
        }
        long j = this.zzA;
        long zzi = this.zzo.zzi();
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        return ((j + zzi) - 1) / zzi;
    }

    private final com.google.android.gms.internal.ads.zzqy zzaf(com.google.android.gms.internal.ads.zzv zzvVar, int i) {
        com.google.android.gms.internal.ads.zzqx zzqxVar = new com.google.android.gms.internal.ads.zzqx(zzvVar);
        zzqxVar.zza(this.zzt);
        zzqxVar.zzb(this.zzR);
        zzqxVar.zzc(this.zzO);
        zzqxVar.zze(-1);
        zzqxVar.zzd(this.zzS);
        return new com.google.android.gms.internal.ads.zzqy(zzqxVar, null);
    }

    private final void zzag() {
        if (this.zzL) {
            return;
        }
        this.zzL = true;
        if (this.zzs.zzg()) {
            this.zzM = false;
        }
        this.zzs.zzd();
    }

    private static int zzah(int i) {
        if (i == 0 || i == -1) {
            return -1;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzA() {
        this.zzN = false;
        if (zzad()) {
            this.zzs.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzB() {
        if (zzad()) {
            this.zzy = 0L;
            this.zzz = 0L;
            this.zzA = 0L;
            this.zzB = 0L;
            this.zzV = false;
            this.zzC = 0;
            this.zzv = new com.google.android.gms.internal.ads.zztp(this.zzw, 0L, 0L, null);
            this.zzF = 0L;
            this.zzu = null;
            this.zzh.clear();
            this.zzH = null;
            this.zzI = 0;
            this.zzJ = null;
            this.zzL = false;
            this.zzK = false;
            this.zzM = false;
            this.zzd.zzr();
            zzR();
            this.zzi = null;
            com.google.android.gms.internal.ads.zztl zztlVar = this.zzn;
            if (zztlVar != null) {
                this.zzo = zztlVar;
                this.zzn = null;
            }
            zza.incrementAndGet();
            this.zzs.zze();
            this.zzs = null;
        }
        this.zzk.zzc();
        this.zzj.zzc();
        this.zzW = 0L;
        this.zzX = 0L;
        android.os.Handler handler = this.zzY;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzC() {
        zzB();
        com.google.android.gms.internal.ads.zzgwm zzgwmVar = this.zzg;
        int size = zzgwmVar.size();
        for (int i = 0; i < size; i++) {
            ((com.google.android.gms.internal.ads.zzco) zzgwmVar.get(i)).zzj();
        }
        this.zze.zzj();
        this.zzf.zzj();
        com.google.android.gms.internal.ads.zzck zzckVar = this.zzp;
        if (zzckVar != null) {
            zzckVar.zzh();
        }
        this.zzN = false;
        this.zzU = false;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzD() {
        this.zzq.zze();
    }

    final /* synthetic */ void zzF() {
        if (this.zzX >= 300000) {
            ((com.google.android.gms.internal.ads.zztw) this.zzm).zza.zzaB(true);
            this.zzX = 0L;
        }
    }

    final /* synthetic */ void zzG() {
        com.google.android.gms.internal.ads.zzsb zzsbVar = this.zzm;
        if (zzsbVar != null) {
            ((com.google.android.gms.internal.ads.zztw) zzsbVar).zza.zzT();
        }
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzti zzJ() {
        return this.zzi;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzsb zzK() {
        return this.zzm;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zztl zzL() {
        return this.zzo;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzqv zzM() {
        return this.zzs;
    }

    final /* synthetic */ boolean zzN() {
        return this.zzL;
    }

    final /* synthetic */ void zzO(boolean z) {
        this.zzM = true;
    }

    final /* synthetic */ boolean zzP() {
        return this.zzN;
    }

    final /* synthetic */ long zzQ() {
        return this.zzT;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zza(com.google.android.gms.internal.ads.zzsb zzsbVar) {
        this.zzm = zzsbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzb(com.google.android.gms.internal.ads.zzqf zzqfVar) {
        this.zzl = zzqfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzc(com.google.android.gms.internal.ads.zzdo zzdoVar) {
        this.zzq.zzd(zzdoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final boolean zzd(com.google.android.gms.internal.ads.zzv zzvVar) {
        return zze(zzvVar) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final int zze(com.google.android.gms.internal.ads.zzv zzvVar) {
        boolean z;
        int i = zzvVar.zzJ;
        if (!com.google.android.gms.internal.ads.zzfl.zzD(i) || i == 2) {
            z = false;
        } else {
            com.google.android.gms.internal.ads.zzt zza2 = zzvVar.zza();
            zza2.zzI(2);
            zzvVar = zza2.zzO();
            z = true;
        }
        int i2 = this.zzq.zza(zzaf(zzvVar, -1)).zzd;
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 2) {
            return 0;
        }
        return z ? 1 : 2;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final com.google.android.gms.internal.ads.zzqs zzf(com.google.android.gms.internal.ads.zzv zzvVar) {
        if (this.zzU) {
            return com.google.android.gms.internal.ads.zzqs.zza;
        }
        com.google.android.gms.internal.ads.zzra zza2 = this.zzq.zza(zzaf(zzvVar, -1));
        com.google.android.gms.internal.ads.zzqr zzqrVar = new com.google.android.gms.internal.ads.zzqr();
        zzqrVar.zza(zza2.zza);
        zzqrVar.zzb(zza2.zzb);
        zzqrVar.zzc(zza2.zzc);
        return zzqrVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final long zzg(boolean z) {
        java.util.ArrayDeque arrayDeque;
        long j;
        if (!zzad() || this.zzE) {
            return Long.MIN_VALUE;
        }
        long min = java.lang.Math.min(this.zzs.zzk(), this.zzo.zzc(zzae()));
        while (true) {
            arrayDeque = this.zzh;
            if (arrayDeque.isEmpty() || min < ((com.google.android.gms.internal.ads.zztp) arrayDeque.getFirst()).zzc) {
                break;
            }
            this.zzv = (com.google.android.gms.internal.ads.zztp) arrayDeque.remove();
        }
        com.google.android.gms.internal.ads.zztp zztpVar = this.zzv;
        long j2 = min - zztpVar.zzc;
        long zzx = com.google.android.gms.internal.ads.zzfl.zzx(j2, zztpVar.zza.zzb);
        if (arrayDeque.isEmpty()) {
            long zzd = this.zzZ.zzd(j2);
            com.google.android.gms.internal.ads.zztp zztpVar2 = this.zzv;
            j = zztpVar2.zzb + zzd;
            zztpVar2.zzd = zzd - zzx;
        } else {
            com.google.android.gms.internal.ads.zztp zztpVar3 = this.zzv;
            j = zztpVar3.zzb + zzx + zztpVar3.zzd;
        }
        long zze = this.zzZ.zze();
        long zzc = j + this.zzo.zzc(zze);
        long j3 = this.zzW;
        if (zze > j3) {
            long zzc2 = this.zzo.zzc(zze - j3);
            this.zzW = zze;
            this.zzX += zzc2;
            if (this.zzY == null) {
                this.zzY = new android.os.Handler(android.os.Looper.myLooper());
            }
            this.zzY.removeCallbacksAndMessages(null);
            this.zzY.postDelayed(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzto
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zztr.this.zzF();
                }
            }, 100L);
        }
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzh(com.google.android.gms.internal.ads.zzrx zzrxVar) throws com.google.android.gms.internal.ads.zzrz {
        com.google.android.gms.internal.ads.zzck zzckVar;
        com.google.android.gms.internal.ads.zzv zzvVar;
        int i;
        int i2;
        if (this.zzr == null && this.zzb != null) {
            com.google.android.gms.internal.ads.zzrc zzrcVar = new com.google.android.gms.internal.ads.zzrc() { // from class: com.google.android.gms.internal.ads.zztn
                @Override // com.google.android.gms.internal.ads.zzrc
                public final /* synthetic */ void zza() {
                    com.google.android.gms.internal.ads.zztr.this.zzG();
                }
            };
            this.zzr = zzrcVar;
            this.zzq.zzc(zzrcVar);
        }
        com.google.android.gms.internal.ads.zzv zzvVar2 = zzrxVar.zza;
        if ("audio/raw".equals(zzvVar2.zzp)) {
            int i3 = zzvVar2.zzJ;
            com.google.android.gms.internal.ads.zzgtj.zza(com.google.android.gms.internal.ads.zzfl.zzD(i3));
            int i4 = zzvVar2.zzH;
            int zzG = com.google.android.gms.internal.ads.zzfl.zzG(i3) * i4;
            com.google.android.gms.internal.ads.zzgwj zzgwjVar = new com.google.android.gms.internal.ads.zzgwj();
            zzgwjVar.zzh(this.zzg);
            zzgwjVar.zzf(this.zze);
            zzgwjVar.zzg(this.zzZ.zza());
            com.google.android.gms.internal.ads.zzck zzckVar2 = new com.google.android.gms.internal.ads.zzck(zzgwjVar.zzi());
            if (zzckVar2.equals(this.zzp)) {
                zzckVar2 = this.zzp;
            }
            this.zzd.zzq(zzvVar2.zzK, zzvVar2.zzL);
            this.zzc.zzq(zzrxVar.zzc);
            try {
                com.google.android.gms.internal.ads.zzcl zza2 = zzckVar2.zza(new com.google.android.gms.internal.ads.zzcl(zzvVar2.zzI, i4, i3));
                com.google.android.gms.internal.ads.zzt zza3 = zzvVar2.zza();
                int i5 = zza2.zzd;
                zza3.zzI(i5);
                zza3.zzH(zza2.zzb);
                int i6 = zza2.zzc;
                zza3.zzG(i6);
                i = zzG;
                zzckVar = zzckVar2;
                zzvVar = zza3.zzO();
                i2 = com.google.android.gms.internal.ads.zzfl.zzG(i5) * i6;
            } catch (com.google.android.gms.internal.ads.zzcn e) {
                throw new com.google.android.gms.internal.ads.zzrz(e, zzvVar2);
            }
        } else {
            zzckVar = new com.google.android.gms.internal.ads.zzck(com.google.android.gms.internal.ads.zzgwm.zzi());
            zzvVar = zzvVar2;
            i = -1;
            i2 = -1;
        }
        com.google.android.gms.internal.ads.zzqy zzaf = zzaf(zzvVar, -1);
        try {
            com.google.android.gms.internal.ads.zzre zzb = this.zzq.zzb(zzaf);
            if (zzb.zza == 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(false).length() + 36);
                sb.append("Invalid output encoding (isOffload=false)");
                throw new com.google.android.gms.internal.ads.zzrz(sb.toString(), zzaf.zza);
            }
            if (zzb.zzc == 0) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(false).length() + 42);
                sb2.append("Invalid output channel config (isOffload=false)");
                throw new com.google.android.gms.internal.ads.zzrz(sb2.toString(), zzaf.zza);
            }
            this.zzU = false;
            com.google.android.gms.internal.ads.zztl zztlVar = new com.google.android.gms.internal.ads.zztl(zzvVar2, zzvVar, i, i2, zzb, zzckVar, null);
            if (zzad()) {
                this.zzn = zztlVar;
            } else {
                this.zzo = zztlVar;
            }
        } catch (com.google.android.gms.internal.ads.zzqw e2) {
            throw new com.google.android.gms.internal.ads.zzrz(e2, zzvVar2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzi() {
        this.zzN = true;
        if (zzad()) {
            this.zzs.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzj() {
        this.zzD = true;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final boolean zzk(java.nio.ByteBuffer byteBuffer, long j, int i) throws com.google.android.gms.internal.ads.zzsa, com.google.android.gms.internal.ads.zzsd {
        com.google.android.gms.internal.ads.zzqv zzqvVar;
        java.nio.ByteBuffer byteBuffer2 = this.zzH;
        com.google.android.gms.internal.ads.zzgtj.zza(byteBuffer2 == null || byteBuffer == byteBuffer2);
        byte[] bArr = null;
        if (this.zzn != null) {
            if (!zzU()) {
                return false;
            }
            if (this.zzs != null) {
                com.google.android.gms.internal.ads.zzre zzj = this.zzo.zzj();
                zzaf(this.zzn.zzg(), -1);
                if (!this.zzn.zzj().equals(zzj)) {
                    zzag();
                    if (zzn()) {
                        return false;
                    }
                    zzB();
                    zzab(j);
                }
            }
            this.zzo = this.zzn;
            this.zzn = null;
            com.google.android.gms.internal.ads.zzqv zzqvVar2 = this.zzs;
            if (zzqvVar2 != null && zzqvVar2.zzg()) {
                this.zzo.zzj();
            }
            zzab(j);
        }
        if (!zzad()) {
            try {
                if (this.zzj.zzb()) {
                    return false;
                }
                try {
                    zzqvVar = zzS(this.zzo.zzj());
                } catch (com.google.android.gms.internal.ads.zzsa e) {
                    int i2 = this.zzo.zzj().zze;
                    while (i2 > 1000000) {
                        int i3 = i2 >> 1;
                        int zzi = this.zzo.zzi() != -1 ? this.zzo.zzi() : 1;
                        int i4 = i3 % zzi;
                        if (i4 != 0) {
                            i3 += zzi - i4;
                        }
                        int i5 = i3;
                        com.google.android.gms.internal.ads.zzrd zzrdVar = new com.google.android.gms.internal.ads.zzrd(this.zzo.zzj(), null);
                        zzrdVar.zze(i5);
                        com.google.android.gms.internal.ads.zzre zzreVar = new com.google.android.gms.internal.ads.zzre(zzrdVar, null);
                        try {
                            com.google.android.gms.internal.ads.zzqv zzS = zzS(zzreVar);
                            this.zzo = this.zzo.zza(zzreVar);
                            zzqvVar = zzS;
                        } catch (com.google.android.gms.internal.ads.zzsa e2) {
                            e.addSuppressed(e2);
                            i2 = i5;
                        }
                    }
                    zzX();
                    throw e;
                }
                this.zzs = zzqvVar;
                com.google.android.gms.internal.ads.zzti zztiVar = new com.google.android.gms.internal.ads.zzti(this, this.zzo.zzj(), bArr);
                this.zzi = zztiVar;
                this.zzs.zzm(zztiVar);
                if (this.zzs.zzg()) {
                    this.zzo.zzj();
                }
                com.google.android.gms.internal.ads.zzqf zzqfVar = this.zzl;
                if (zzqfVar != null) {
                    this.zzs.zzn(zzqfVar);
                }
                zzY();
                int i6 = this.zzQ.zza;
                android.media.AudioDeviceInfo audioDeviceInfo = this.zzR;
                if (audioDeviceInfo != null) {
                    this.zzs.zzo(audioDeviceInfo);
                }
                this.zzE = true;
                int zzh = this.zzs.zzh();
                int i7 = this.zzO;
                this.zzO = zzh;
                com.google.android.gms.internal.ads.zzsb zzsbVar = this.zzm;
                if (zzsbVar != null) {
                    ((com.google.android.gms.internal.ads.zztw) zzsbVar).zza.zzaz().zzk(this.zzo.zzd());
                    if (zzh != i7) {
                        this.zzP = true;
                        com.google.android.gms.internal.ads.zztl zztlVar = this.zzo;
                        com.google.android.gms.internal.ads.zzrd zzrdVar2 = new com.google.android.gms.internal.ads.zzrd(zztlVar.zzj(), null);
                        zzrdVar2.zzg(this.zzO);
                        this.zzo = zztlVar.zza(new com.google.android.gms.internal.ads.zzre(zzrdVar2, null));
                        com.google.android.gms.internal.ads.zztl zztlVar2 = this.zzn;
                        if (zztlVar2 != null) {
                            com.google.android.gms.internal.ads.zzrd zzrdVar3 = new com.google.android.gms.internal.ads.zzrd(zztlVar2.zzj(), null);
                            zzrdVar3.zzg(this.zzO);
                            this.zzn = zztlVar2.zza(new com.google.android.gms.internal.ads.zzre(zzrdVar3, null));
                        }
                        com.google.android.gms.internal.ads.zzsb zzsbVar2 = this.zzm;
                        int i8 = this.zzO;
                        if (android.os.Build.VERSION.SDK_INT >= 35) {
                            com.google.android.gms.internal.ads.zztx zztxVar = ((com.google.android.gms.internal.ads.zztw) zzsbVar2).zza;
                            if (zztxVar.zzaA() != null) {
                                zztxVar.zzaA().zza(i8);
                            }
                        }
                        ((com.google.android.gms.internal.ads.zztw) zzsbVar2).zza.zzaz().zzm(i8);
                    }
                }
            } catch (com.google.android.gms.internal.ads.zzsa e3) {
                this.zzj.zza(e3);
                return false;
            }
        }
        this.zzj.zzc();
        if (this.zzE) {
            this.zzF = java.lang.Math.max(0L, j);
            this.zzD = false;
            this.zzE = false;
            zzab(j);
            if (this.zzN) {
                zzi();
            }
        }
        if (this.zzH == null) {
            com.google.android.gms.internal.ads.zzgtj.zza(byteBuffer.order() == java.nio.ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.zzo.zze() && this.zzC == 0) {
                int zzE = zzE(this.zzo.zzj().zza, byteBuffer);
                this.zzC = zzE;
                if (zzE == 0) {
                    return true;
                }
            }
            if (this.zzu != null) {
                if (!zzU()) {
                    return false;
                }
                zzab(j);
                this.zzu = null;
            }
            long j2 = this.zzF;
            com.google.android.gms.internal.ads.zztl zztlVar3 = this.zzo;
            long zzb = j2 + zztlVar3.zzb((zztlVar3.zze() ? this.zzy / this.zzo.zzh() : this.zzz) - this.zzd.zzs());
            if (!this.zzD && java.lang.Math.abs(zzb - j) > 200000) {
                com.google.android.gms.internal.ads.zzsb zzsbVar3 = this.zzm;
                if (zzsbVar3 != null) {
                    zzsbVar3.zza(new com.google.android.gms.internal.ads.zzsc(j, zzb));
                }
                this.zzD = true;
            }
            if (this.zzD) {
                if (!zzU()) {
                    return false;
                }
                long j3 = j - zzb;
                this.zzF += j3;
                this.zzD = false;
                zzab(j);
                com.google.android.gms.internal.ads.zzsb zzsbVar4 = this.zzm;
                if (zzsbVar4 != null && j3 != 0) {
                    ((com.google.android.gms.internal.ads.zztw) zzsbVar4).zza.zzaq();
                }
            }
            if (this.zzo.zze()) {
                this.zzy += byteBuffer.remaining();
            } else {
                this.zzz += this.zzC * i;
            }
            this.zzH = byteBuffer;
            this.zzI = i;
        }
        zzT(j);
        if (!this.zzH.hasRemaining()) {
            this.zzH = null;
            this.zzI = 0;
            return true;
        }
        if (!this.zzs.zzl()) {
            return false;
        }
        com.google.android.gms.internal.ads.zzeg.zzc("DefaultAudioSink", "Resetting stalled audio output");
        zzB();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzl() throws com.google.android.gms.internal.ads.zzsd {
        if (!this.zzK && zzad() && zzU()) {
            zzag();
            this.zzK = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final boolean zzm() {
        if (zzad()) {
            return this.zzK && !zzn();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final boolean zzn() {
        if (!zzad()) {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29 && this.zzs.zzg() && this.zzM) {
            return false;
        }
        long zzae = zzae();
        long zzk = this.zzs.zzk();
        com.google.android.gms.internal.ads.zzqv zzqvVar = this.zzs;
        zzqvVar.getClass();
        return zzae > com.google.android.gms.internal.ads.zzfl.zzu(zzk, zzqvVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzo(com.google.android.gms.internal.ads.zzav zzavVar) {
        float f = zzavVar.zzb;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        com.google.android.gms.internal.ads.zzav zzavVar2 = new com.google.android.gms.internal.ads.zzav(java.lang.Math.max(0.1f, java.lang.Math.min(f, 8.0f)), java.lang.Math.max(0.1f, java.lang.Math.min(zzavVar.zzc, 8.0f)));
        this.zzw = zzavVar2;
        zzaa(zzavVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final com.google.android.gms.internal.ads.zzav zzp() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzq(boolean z) {
        this.zzx = z;
        zzaa(this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzr(com.google.android.gms.internal.ads.zzd zzdVar) {
        if (this.zzt.equals(zzdVar)) {
            return;
        }
        this.zzt = zzdVar;
        zzZ();
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final com.google.android.gms.internal.ads.zzqh zzs() {
        com.google.android.gms.internal.ads.zzrf zzrfVar = this.zzq;
        if (zzrfVar instanceof com.google.android.gms.internal.ads.zztd) {
            return ((com.google.android.gms.internal.ads.zztd) zzrfVar).zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzt(int i) {
        if (this.zzP) {
            if (this.zzO != i) {
                return;
            } else {
                this.zzP = false;
            }
        }
        if (this.zzO != i) {
            this.zzO = i;
            zzZ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzu(com.google.android.gms.internal.ads.zze zzeVar) {
        if (this.zzQ.equals(zzeVar)) {
            return;
        }
        if (this.zzs != null) {
            int i = this.zzQ.zza;
        }
        this.zzQ = zzeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzv(android.media.AudioDeviceInfo audioDeviceInfo) {
        this.zzR = audioDeviceInfo;
        com.google.android.gms.internal.ads.zzqv zzqvVar = this.zzs;
        if (zzqvVar != null) {
            zzqvVar.zzo(audioDeviceInfo);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzw(int i) {
        int i2 = this.zzS;
        int zzah = zzah(i);
        if (i2 == zzah) {
            return;
        }
        this.zzS = zzah;
        zzZ();
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final long zzx() {
        if (!zzad()) {
            return -9223372036854775807L;
        }
        if (this.zzo.zze()) {
            return this.zzo.zzc(this.zzs.zzj());
        }
        long zzj = this.zzs.zzj();
        int zzf = com.google.android.gms.internal.ads.zzagc.zzf(this.zzo.zzj().zza);
        com.google.android.gms.internal.ads.zzgtj.zzi(zzf != -2147483647);
        return com.google.android.gms.internal.ads.zzfl.zzv(zzj, 1000000L, zzf, java.math.RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzy(int i, int i2) {
        com.google.android.gms.internal.ads.zzqv zzqvVar = this.zzs;
        if (zzqvVar != null) {
            zzqvVar.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzz(float f) {
        if (this.zzG != f) {
            this.zzG = f;
            zzY();
        }
    }

    /* synthetic */ zztr(com.google.android.gms.internal.ads.zztk zztkVar, byte[] bArr) {
        this.zzb = zztkVar.zzb() == null ? null : zztkVar.zzb().getApplicationContext();
        this.zzt = com.google.android.gms.internal.ads.zzd.zza;
        this.zzZ = zztkVar.zzd();
        this.zzq = zztkVar.zzc();
        com.google.android.gms.internal.ads.zztg zztgVar = new com.google.android.gms.internal.ads.zztg();
        this.zzc = zztgVar;
        com.google.android.gms.internal.ads.zzud zzudVar = new com.google.android.gms.internal.ads.zzud();
        this.zzd = zzudVar;
        this.zze = new com.google.android.gms.internal.ads.zzcv();
        this.zzf = new com.google.android.gms.internal.ads.zzuc();
        this.zzg = com.google.android.gms.internal.ads.zzgwm.zzk(zzudVar, zztgVar);
        this.zzG = 1.0f;
        this.zzO = 0;
        this.zzQ = new com.google.android.gms.internal.ads.zze(0, 0.0f);
        com.google.android.gms.internal.ads.zzav zzavVar = com.google.android.gms.internal.ads.zzav.zza;
        this.zzv = new com.google.android.gms.internal.ads.zztp(zzavVar, 0L, 0L, null);
        this.zzw = zzavVar;
        this.zzx = false;
        this.zzh = new java.util.ArrayDeque();
        this.zzj = new com.google.android.gms.internal.ads.zztq();
        this.zzk = new com.google.android.gms.internal.ads.zztq();
        int i = -1;
        if (android.os.Build.VERSION.SDK_INT >= 34 && zztkVar.zzb() != null) {
            i = zzah(zztkVar.zzb().getDeviceId());
        }
        this.zzS = i;
    }

    static int zzE(int i, java.nio.ByteBuffer byteBuffer) {
        int i2;
        int i3;
        byte b;
        int i4;
        int i5;
        if (i == 20) {
            return com.google.android.gms.internal.ads.zzgv.zzb(byteBuffer);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int zzb = com.google.android.gms.internal.ads.zzagw.zzb(com.google.android.gms.internal.ads.zzfl.zzM(byteBuffer, byteBuffer.position()));
                    if (zzb != -1) {
                        return zzb;
                    }
                    throw new java.lang.IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i) {
                        case 14:
                            int i6 = com.google.android.gms.internal.ads.zzaey.zza;
                            int position = byteBuffer.position();
                            int limit = byteBuffer.limit() - 10;
                            int i7 = position;
                            while (true) {
                                if (i7 > limit) {
                                    i5 = -1;
                                } else if ((com.google.android.gms.internal.ads.zzfl.zzM(byteBuffer, i7 + 4) & (-2)) == -126718022) {
                                    i5 = i7 - position;
                                } else {
                                    i7++;
                                }
                            }
                            if (i5 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i5) + ((byteBuffer.get((byteBuffer.position() + i5) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            int i8 = com.google.android.gms.internal.ads.zzafb.zza;
                            byte[] bArr = new byte[16];
                            int position2 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(position2);
                            return com.google.android.gms.internal.ads.zzafb.zzb(new com.google.android.gms.internal.ads.zzes(bArr, 16)).zzc;
                        case 18:
                            break;
                        default:
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 27);
                            sb.append("Unexpected audio encoding: ");
                            sb.append(i);
                            throw new java.lang.IllegalStateException(sb.toString());
                    }
            }
            return com.google.android.gms.internal.ads.zzaey.zze(byteBuffer);
        }
        int i9 = com.google.android.gms.internal.ads.zzafx.zza;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int position3 = byteBuffer.position();
        byte b2 = byteBuffer.get(position3);
        if (b2 != -2) {
            if (b2 == -1) {
                i3 = (byteBuffer.get(position3 + 4) & 7) << 4;
                b = byteBuffer.get(position3 + 7);
            } else if (b2 != 31) {
                i3 = (byteBuffer.get(position3 + 4) & 1) << 6;
                i4 = byteBuffer.get(position3 + 5) & 252;
                i2 = (i4 >> 2) | i3;
            } else {
                i3 = (byteBuffer.get(position3 + 5) & 7) << 4;
                b = byteBuffer.get(position3 + 6);
            }
            i4 = b & 60;
            i2 = (i4 >> 2) | i3;
        } else {
            i2 = ((byteBuffer.get(position3 + 5) & 1) << 6) | ((byteBuffer.get(position3 + 4) & 252) >> 2);
        }
        return (i2 + 1) * 32;
    }
}
