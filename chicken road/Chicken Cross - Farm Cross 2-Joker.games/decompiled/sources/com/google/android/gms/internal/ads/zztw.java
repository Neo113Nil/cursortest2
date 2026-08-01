package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zztw implements zzsi {
    private static final AtomicInteger zza = new AtomicInteger();
    private long zzA;
    private long zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private long zzF;
    private long zzG;
    private float zzH;
    private ByteBuffer zzI;
    private int zzJ;
    private ByteBuffer zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private int zzP;
    private boolean zzQ;
    private zze zzR;
    private AudioDeviceInfo zzS;
    private int zzT;
    private long zzU;
    private boolean zzV;
    private boolean zzW;
    private long zzX;
    private long zzY;
    private Handler zzZ;
    private final zztr zzaa;
    private final Context zzb;
    private final zztl zzc;
    private final zzui zzd;
    private final zzcw zze;
    private final zzuh zzf;
    private final zzgxm zzg;
    private final ArrayDeque zzh;
    private zztn zzi;
    private final zztv zzj;
    private final zztv zzk;
    private zzqj zzl;
    private zzsf zzm;
    private zztq zzn;
    private zztq zzo;
    private zzck zzp;
    private final zzrj zzq;
    private zzrg zzr;
    private zzqz zzs;
    private zzd zzt;
    private zztu zzu;
    private zztu zzv;
    private zzav zzw;
    private boolean zzx;
    private long zzy;
    private long zzz;

    static /* synthetic */ boolean zzI() {
        return zza.get() > 0;
    }

    private final void zzS(long j) {
        long j2;
        this.zzp = this.zzo.zzk();
        if (j == -9223372036854775807L) {
            j2 = 0;
        } else {
            j2 = j - this.zzG;
            if (this.zzo.zzl() != zzbf.zza && this.zzo.zzm() != null) {
                this.zzo.zzl().zzo(this.zzo.zzm(), new zzbd());
            }
        }
        zzck zzckVar = this.zzp;
        zzcm zzcmVar = new zzcm();
        zzcmVar.zzb(this.zzo.zzl());
        zzcmVar.zzc(this.zzo.zzm());
        zzcmVar.zza(j2);
        zzckVar.zzb(zzcmVar.zzd());
    }

    private final zzqz zzT(zzri zzriVar) throws zzse {
        try {
            return ((zzti) this.zzq).zzf(zzriVar);
        } catch (zzrf e) {
            zzse zzseVar = new zzse(0, zzriVar.zzb, zzriVar.zzc, zzriVar.zza, zzriVar.zze, this.zzo.zzf(), false, e);
            zzsf zzsfVar = this.zzm;
            if (zzsfVar == null) {
                throw zzseVar;
            }
            zzsfVar.zza(zzseVar);
            throw zzseVar;
        }
    }

    private final void zzU(long j) throws zzsh {
        zzX(j);
        if (this.zzK != null) {
            return;
        }
        if (!this.zzp.zzc()) {
            ByteBuffer byteBuffer = this.zzI;
            if (byteBuffer != null) {
                zzW(byteBuffer);
                zzX(j);
                return;
            }
            return;
        }
        while (!this.zzp.zzg()) {
            do {
                ByteBuffer zze = this.zzp.zze();
                if (zze.hasRemaining()) {
                    zzW(zze);
                    zzX(j);
                } else {
                    ByteBuffer byteBuffer2 = this.zzI;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzp.zzd(this.zzI);
                    }
                }
            } while (this.zzK == null);
            return;
        }
    }

    private final boolean zzV() throws zzsh {
        ByteBuffer byteBuffer;
        if (!this.zzp.zzc()) {
            zzX(Long.MIN_VALUE);
            return this.zzK == null;
        }
        this.zzp.zzf();
        zzU(Long.MIN_VALUE);
        return this.zzp.zzg() && ((byteBuffer = this.zzK) == null || !byteBuffer.hasRemaining());
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0185, code lost:
    
        if (r11 < 0.0f) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b1, code lost:
    
        if (r11 < 0.0d) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00eb, code lost:
    
        r11 = r11 * 2.147483647E9d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00e7, code lost:
    
        r11 = (-r11) * (-2.147483648E9d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00d1, code lost:
    
        if (r11 < 0.0f) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x018b, code lost:
    
        r11 = r11 * 2.1474836E9f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0187, code lost:
    
        r11 = (-r11) * (-2.1474836E9f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00e5, code lost:
    
        if (r11 < 0.0d) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0293  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzW(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i;
        int i2;
        int i3;
        float max;
        float f;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        double zzm;
        double d;
        zzguk.zzi(this.zzK == null);
        if (byteBuffer.hasRemaining()) {
            if (this.zzo.zze()) {
                int zzv = (int) zzfm.zzv(zzfm.zzt(20L), this.zzo.zzj().zzb);
                long zzaf = zzaf();
                long j = zzv;
                if (zzaf < j) {
                    int i11 = this.zzo.zzj().zza;
                    int zzi = this.zzo.zzi();
                    ByteBuffer order = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    int i12 = (int) zzaf;
                    while (byteBuffer.hasRemaining() && i12 < zzv) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 != 21) {
                                        if (i11 == 22) {
                                            i7 = byteBuffer.get() & 255;
                                            i8 = (byteBuffer.get() & 255) << 8;
                                            i9 = (byteBuffer.get() & 255) << 16;
                                            i10 = (byteBuffer.get() & 255) << 24;
                                        } else if (i11 == 268435456) {
                                            i = (byteBuffer.get() & 255) << 24;
                                            i2 = (byteBuffer.get() & 255) << 16;
                                        } else if (i11 == 1342177280) {
                                            i4 = (byteBuffer.get() & 255) << 24;
                                            i5 = (byteBuffer.get() & 255) << 16;
                                            i6 = (byteBuffer.get() & 255) << 8;
                                        } else if (i11 != 1610612736) {
                                            if (i11 == 1879048192) {
                                                zzm = zzfm.zzm(byteBuffer.getDouble(), -1.0d, 1.0d);
                                            } else if (i11 == 1895825408) {
                                                max = Math.max(-1.0f, Math.min(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt())), 1.0f));
                                            } else {
                                                if (i11 != 1912602624) {
                                                    throw new IllegalStateException();
                                                }
                                                zzm = zzfm.zzm(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong())), -1.0d, 1.0d);
                                            }
                                            i3 = (int) d;
                                        } else {
                                            i7 = (byteBuffer.get() & 255) << 24;
                                            i8 = (byteBuffer.get() & 255) << 16;
                                            i9 = (byteBuffer.get() & 255) << 8;
                                            i10 = byteBuffer.get() & 255;
                                        }
                                        i3 = i7 | i8 | i9 | i10;
                                    } else {
                                        i4 = (byteBuffer.get() & 255) << 8;
                                        i5 = (byteBuffer.get() & 255) << 16;
                                        i6 = (byteBuffer.get() & 255) << 24;
                                    }
                                    i3 = i4 | i5 | i6;
                                } else {
                                    max = Math.max(-1.0f, Math.min(byteBuffer.getFloat(), 1.0f));
                                }
                                i3 = (int) f;
                            } else {
                                i3 = (byteBuffer.get() & 255) << 24;
                            }
                            int i13 = (int) ((i3 * i12) / j);
                            if (i11 != 2) {
                                order.put((byte) (i13 >> 16));
                                order.put((byte) (i13 >> 24));
                            } else if (i11 == 3) {
                                order.put((byte) (i13 >> 24));
                            } else if (i11 != 4) {
                                if (i11 == 21) {
                                    order.put((byte) (i13 >> 8));
                                    order.put((byte) (i13 >> 16));
                                    order.put((byte) (i13 >> 24));
                                } else if (i11 == 22) {
                                    order.put((byte) i13);
                                    order.put((byte) (i13 >> 8));
                                    order.put((byte) (i13 >> 16));
                                    order.put((byte) (i13 >> 24));
                                } else if (i11 == 268435456) {
                                    order.put((byte) (i13 >> 24));
                                    order.put((byte) (i13 >> 16));
                                } else if (i11 == 1342177280) {
                                    order.put((byte) (i13 >> 24));
                                    order.put((byte) (i13 >> 16));
                                    order.put((byte) (i13 >> 8));
                                } else if (i11 == 1610612736) {
                                    order.put((byte) (i13 >> 24));
                                    order.put((byte) (i13 >> 16));
                                    order.put((byte) (i13 >> 8));
                                    order.put((byte) i13);
                                } else if (i11 != 1879048192) {
                                    if (i11 == 1895825408) {
                                        order.putInt(Integer.reverseBytes(Float.floatToIntBits(i13 < 0 ? (-i13) / (-2.1474836E9f) : i13 / 2.1474836E9f)));
                                    } else {
                                        if (i11 != 1912602624) {
                                            throw new IllegalStateException();
                                        }
                                        order.putLong(Long.reverseBytes(Double.doubleToLongBits(i13 < 0 ? (-i13) / (-2.147483648E9d) : i13 / 2.147483647E9d)));
                                    }
                                } else if (i13 < 0) {
                                    order.putDouble((-i13) / (-2.147483648E9d));
                                } else {
                                    order.putDouble(i13 / 2.147483647E9d);
                                }
                            } else if (i13 < 0) {
                                order.putFloat((-i13) / (-2.1474836E9f));
                            } else {
                                order.putFloat(i13 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() != position + zzi) {
                                i12++;
                                position = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            i2 = (byteBuffer.get() & 255) << 24;
                        }
                        i3 = i | i2;
                        int i132 = (int) ((i3 * i12) / j);
                        if (i11 != 2) {
                        }
                        if (byteBuffer.position() != position + zzi) {
                        }
                    }
                    order.put(byteBuffer);
                    order.flip();
                    byteBuffer2 = order;
                    this.zzK = byteBuffer2;
                }
            }
            byteBuffer2 = byteBuffer;
            this.zzK = byteBuffer2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzX(long j) throws zzsh {
        zzsf zzsfVar;
        zzsf zzsfVar2;
        if (this.zzK == null || this.zzk.zzb()) {
            return;
        }
        int remaining = this.zzK.remaining();
        try {
            boolean zzc = this.zzs.zzc(this.zzK, this.zzJ, j);
            this.zzU = SystemClock.elapsedRealtime();
            this.zzk.zzc();
            if (this.zzs.zzg()) {
                if (this.zzB > 0) {
                    this.zzW = false;
                }
                if (this.zzO && (zzsfVar2 = this.zzm) != null && !zzc) {
                }
            }
            if (this.zzo.zze()) {
                this.zzA += remaining - this.zzK.remaining();
            }
            if (zzc) {
                if (!this.zzo.zze()) {
                    zzguk.zzi(this.zzK == this.zzI);
                    this.zzB += this.zzC * this.zzJ;
                }
                this.zzK = null;
            }
        } catch (zzqy e) {
            boolean z = e.zzb;
            if (z) {
                if (zzaf() <= 0) {
                    if (this.zzs.zzg()) {
                        zzY();
                    }
                }
                zzsh zzshVar = new zzsh(e.zza, this.zzo.zzf(), r3);
                zzsfVar = this.zzm;
                if (zzsfVar != null) {
                    zzsfVar.zza(zzshVar);
                }
                if (!z) {
                    throw zzshVar;
                }
                this.zzk.zza(zzshVar);
                return;
            }
            r3 = false;
            zzsh zzshVar2 = new zzsh(e.zza, this.zzo.zzf(), r3);
            zzsfVar = this.zzm;
            if (zzsfVar != null) {
            }
            if (!z) {
            }
        }
    }

    private final void zzY() {
        this.zzo.zzj();
    }

    private final void zzZ() {
        if (zzae()) {
            this.zzs.zzf(this.zzH);
        }
    }

    private final void zzaa() {
        if (this.zzo != null) {
            zztq zztqVar = this.zzn;
            if (zztqVar != null) {
                this.zzo = zztqVar;
                this.zzn = null;
            }
            try {
                this.zzo = this.zzo.zza(this.zzq.zzb(zzag(this.zzo.zzg(), -1)));
            } catch (zzra e) {
                throw new IllegalStateException(new zzsd(e, this.zzo.zzf()));
            }
        }
        zzC();
    }

    private final void zzab(zzav zzavVar) {
        zztu zztuVar = new zztu(zzavVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzae()) {
            this.zzu = zztuVar;
        } else {
            this.zzv = zztuVar;
        }
    }

    private final void zzac(long j) {
        zzav zzavVar;
        boolean z;
        if (zzad()) {
            zztr zztrVar = this.zzaa;
            zzavVar = this.zzw;
            zztrVar.zzb(zzavVar);
        } else {
            zzavVar = zzav.zza;
        }
        zzav zzavVar2 = zzavVar;
        this.zzw = zzavVar2;
        if (zzad()) {
            zztr zztrVar2 = this.zzaa;
            z = this.zzx;
            zztrVar2.zzc(z);
        } else {
            z = false;
        }
        this.zzx = z;
        this.zzh.add(new zztu(zzavVar2, Math.max(0L, j), this.zzo.zzc(zzaf()), null));
        zzS(j);
        zzsf zzsfVar = this.zzm;
        if (zzsfVar != null) {
            ((zzub) zzsfVar).zza.zzaB().zzh(this.zzx);
        }
    }

    private final boolean zzad() {
        if (!this.zzo.zze()) {
            return false;
        }
        int i = this.zzo.zzf().zzL;
        return true;
    }

    private final boolean zzae() {
        return this.zzs != null;
    }

    private final long zzaf() {
        if (!this.zzo.zze()) {
            return this.zzB;
        }
        long j = this.zzA;
        long zzi = this.zzo.zzi();
        String str = zzfm.zza;
        return ((j + zzi) - 1) / zzi;
    }

    private final zzrc zzag(zzv zzvVar, int i) {
        zzrb zzrbVar = new zzrb(zzvVar);
        zzrbVar.zza(this.zzt);
        zzrbVar.zzb(this.zzS);
        zzrbVar.zzc(this.zzP);
        zzrbVar.zze(-1);
        zzrbVar.zzd(this.zzT);
        return new zzrc(zzrbVar, null);
    }

    private final void zzah() {
        if (this.zzM) {
            return;
        }
        this.zzM = true;
        if (this.zzs.zzg()) {
            this.zzN = false;
        }
        this.zzs.zzd();
    }

    private static int zzai(int i) {
        if (i == 0 || i == -1) {
            return -1;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzA(float f) {
        if (this.zzH != f) {
            this.zzH = f;
            zzZ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzB() {
        this.zzO = false;
        if (zzae()) {
            this.zzs.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzC() {
        if (zzae()) {
            this.zzy = 0L;
            this.zzz = 0L;
            this.zzA = 0L;
            this.zzB = 0L;
            this.zzW = false;
            this.zzC = 0;
            this.zzv = new zztu(this.zzw, 0L, 0L, null);
            this.zzF = 0L;
            this.zzu = null;
            this.zzh.clear();
            this.zzI = null;
            this.zzJ = 0;
            this.zzK = null;
            this.zzM = false;
            this.zzL = false;
            this.zzN = false;
            this.zzd.zzr();
            zzS(-9223372036854775807L);
            this.zzi = null;
            zztq zztqVar = this.zzn;
            if (zztqVar != null) {
                this.zzo = zztqVar;
                this.zzn = null;
            }
            zza.incrementAndGet();
            this.zzs.zze();
            this.zzs = null;
        }
        this.zzk.zzc();
        this.zzj.zzc();
        this.zzX = 0L;
        this.zzY = 0L;
        Handler handler = this.zzZ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzD() {
        zzC();
        zzgxm zzgxmVar = this.zzg;
        int size = zzgxmVar.size();
        for (int i = 0; i < size; i++) {
            ((zzcp) zzgxmVar.get(i)).zzj();
        }
        this.zze.zzj();
        this.zzf.zzj();
        zzck zzckVar = this.zzp;
        if (zzckVar != null) {
            zzckVar.zzh();
        }
        this.zzO = false;
        this.zzV = false;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzE() {
        this.zzq.zze();
    }

    final /* synthetic */ void zzG() {
        if (this.zzY >= 300000) {
            ((zzub) this.zzm).zza.zzaD(true);
            this.zzY = 0L;
        }
    }

    final /* synthetic */ void zzH() {
        zzsf zzsfVar = this.zzm;
        if (zzsfVar != null) {
            ((zzub) zzsfVar).zza.zzU();
        }
    }

    final /* synthetic */ zztn zzK() {
        return this.zzi;
    }

    final /* synthetic */ zzsf zzL() {
        return this.zzm;
    }

    final /* synthetic */ zztq zzM() {
        return this.zzo;
    }

    final /* synthetic */ zzqz zzN() {
        return this.zzs;
    }

    final /* synthetic */ boolean zzO() {
        return this.zzM;
    }

    final /* synthetic */ void zzP(boolean z) {
        this.zzN = true;
    }

    final /* synthetic */ boolean zzQ() {
        return this.zzO;
    }

    final /* synthetic */ long zzR() {
        return this.zzU;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zza(zzsf zzsfVar) {
        this.zzm = zzsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzb(zzqj zzqjVar) {
        this.zzl = zzqjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzc(zzdp zzdpVar) {
        this.zzq.zzd(zzdpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final boolean zzd(zzv zzvVar) {
        return zze(zzvVar) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final int zze(zzv zzvVar) {
        boolean z;
        int i = zzvVar.zzL;
        if (!zzfm.zzE(i) || i == 2) {
            z = false;
        } else {
            zzt zza2 = zzvVar.zza();
            zza2.zzK(2);
            zzvVar = zza2.zzQ();
            z = true;
        }
        int i2 = this.zzq.zza(zzag(zzvVar, -1)).zzd;
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 2) {
            return 0;
        }
        return z ? 1 : 2;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final zzqw zzf(zzv zzvVar) {
        if (this.zzV) {
            return zzqw.zza;
        }
        zzre zza2 = this.zzq.zza(zzag(zzvVar, -1));
        zzqv zzqvVar = new zzqv();
        zzqvVar.zza(zza2.zza);
        zzqvVar.zzb(zza2.zzb);
        zzqvVar.zzc(zza2.zzc);
        return zzqvVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final long zzg(boolean z) {
        ArrayDeque arrayDeque;
        long j;
        if (!zzae() || this.zzE) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.zzs.zzk(), this.zzo.zzc(zzaf()));
        while (true) {
            arrayDeque = this.zzh;
            if (arrayDeque.isEmpty() || min < ((zztu) arrayDeque.getFirst()).zzc) {
                break;
            }
            this.zzv = (zztu) arrayDeque.remove();
        }
        zztu zztuVar = this.zzv;
        long j2 = min - zztuVar.zzc;
        long zzy = zzfm.zzy(j2, zztuVar.zza.zzb);
        if (arrayDeque.isEmpty()) {
            long zzd = this.zzaa.zzd(j2);
            zztu zztuVar2 = this.zzv;
            j = zztuVar2.zzb + zzd;
            zztuVar2.zzd = zzd - zzy;
        } else {
            zztu zztuVar3 = this.zzv;
            j = zztuVar3.zzb + zzy + zztuVar3.zzd;
        }
        long zze = this.zzaa.zze();
        long zzc = j + this.zzo.zzc(zze);
        long j3 = this.zzX;
        if (zze > j3) {
            long zzc2 = this.zzo.zzc(zze - j3);
            this.zzX = zze;
            this.zzY += zzc2;
            if (this.zzZ == null) {
                this.zzZ = new Handler(Looper.myLooper());
            }
            this.zzZ.removeCallbacksAndMessages(null);
            this.zzZ.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zztt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zztw.this.zzG();
                }
            }, 100L);
        }
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzh(zzsb zzsbVar) throws zzsd {
        zzck zzckVar;
        int i;
        int i2;
        zzv zzvVar;
        if (this.zzr == null && this.zzb != null) {
            zzrg zzrgVar = new zzrg() { // from class: com.google.android.gms.internal.ads.zzts
                @Override // com.google.android.gms.internal.ads.zzrg
                public final /* synthetic */ void zza() {
                    zztw.this.zzH();
                }
            };
            this.zzr = zzrgVar;
            this.zzq.zzc(zzrgVar);
        }
        zzv zzvVar2 = zzsbVar.zza;
        if ("audio/raw".equals(zzvVar2.zzp)) {
            int i3 = zzvVar2.zzL;
            zzguk.zza(zzfm.zzE(i3));
            int i4 = zzvVar2.zzI;
            int zzI = zzfm.zzI(i3) * i4;
            zzgxj zzgxjVar = new zzgxj();
            zzgxjVar.zzh(this.zzg);
            zzgxjVar.zzf(this.zze);
            zzgxjVar.zzg(this.zzaa.zza());
            zzck zzckVar2 = new zzck(zzgxjVar.zzi());
            if (zzckVar2.equals(this.zzp)) {
                zzckVar2 = this.zzp;
            }
            this.zzd.zzq(zzvVar2.zzM, zzvVar2.zzN);
            this.zzc.zzq(zzsbVar.zzc);
            try {
                zzcl zza2 = zzckVar2.zza(new zzcl(zzvVar2.zzK, i4, i3));
                zzt zza3 = zzvVar2.zza();
                int i5 = zza2.zzd;
                zza3.zzK(i5);
                zza3.zzJ(zza2.zzb);
                int i6 = zza2.zzc;
                zza3.zzH(i6);
                zza3.zzI(i6 == zzvVar2.zzI ? zzvVar2.zzJ : -1);
                zzv zzQ = zza3.zzQ();
                zzckVar = zzckVar2;
                i2 = zzfm.zzI(i5) * i6;
                i = zzI;
                zzvVar = zzQ;
            } catch (zzco e) {
                throw new zzsd(e, zzvVar2);
            }
        } else {
            zzckVar = new zzck(zzgxm.zzi());
            i = -1;
            i2 = -1;
            zzvVar = zzvVar2;
        }
        zzrc zzag = zzag(zzvVar, -1);
        try {
            zzri zzb = this.zzq.zzb(zzag);
            if (zzb.zza == 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(false).length() + 36);
                sb.append("Invalid output encoding (isOffload=false)");
                throw new zzsd(sb.toString(), zzag.zza);
            }
            if (zzb.zzc == 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(false).length() + 42);
                sb2.append("Invalid output channel config (isOffload=false)");
                throw new zzsd(sb2.toString(), zzag.zza);
            }
            this.zzV = false;
            zzbf zzbfVar = zzsbVar.zzd;
            zzxo zzxoVar = zzsbVar.zze;
            zztq zztqVar = new zztq(zzvVar2, zzvVar, i, i2, zzb, zzckVar, zzbfVar, zzxoVar != null ? zzxoVar.zza : null, null);
            if (zzae()) {
                this.zzn = zztqVar;
            } else {
                this.zzo = zztqVar;
            }
        } catch (zzra e2) {
            throw new zzsd(e2, zzvVar2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzi() {
        this.zzO = true;
        if (zzae()) {
            this.zzs.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzj() {
        this.zzD = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final boolean zzk(ByteBuffer byteBuffer, long j, int i) throws zzse, zzsh {
        zzqz zzqzVar;
        ByteBuffer byteBuffer2 = this.zzI;
        zzguk.zza(byteBuffer2 == null || byteBuffer == byteBuffer2);
        byte[] bArr = null;
        if (this.zzn != null) {
            if (!zzV()) {
                return false;
            }
            if (this.zzs != null) {
                zzri zzj = this.zzo.zzj();
                zzag(this.zzn.zzg(), -1);
                if (!this.zzn.zzj().equals(zzj)) {
                    zzah();
                    if (zzn()) {
                        return false;
                    }
                    zzC();
                    zzac(j);
                }
            }
            this.zzo = this.zzn;
            this.zzn = null;
            zzqz zzqzVar2 = this.zzs;
            if (zzqzVar2 != null && zzqzVar2.zzg()) {
                this.zzo.zzj();
            }
            zzac(j);
        }
        if (!zzae()) {
            try {
                if (this.zzj.zzb()) {
                    return false;
                }
                try {
                    zzqzVar = zzT(this.zzo.zzj());
                } catch (zzse e) {
                    int i2 = this.zzo.zzj().zze;
                    while (i2 > 1000000) {
                        int i3 = i2 >> 1;
                        int zzi = this.zzo.zzi() != -1 ? this.zzo.zzi() : 1;
                        int i4 = i3 % zzi;
                        if (i4 != 0) {
                            i3 += zzi - i4;
                        }
                        int i5 = i3;
                        zzrh zzrhVar = new zzrh(this.zzo.zzj(), null);
                        zzrhVar.zze(i5);
                        zzri zzriVar = new zzri(zzrhVar, null);
                        try {
                            zzqz zzT = zzT(zzriVar);
                            this.zzo = this.zzo.zza(zzriVar);
                            zzqzVar = zzT;
                        } catch (zzse e2) {
                            e.addSuppressed(e2);
                            i2 = i5;
                        }
                    }
                    zzY();
                    throw e;
                }
                this.zzs = zzqzVar;
                zztn zztnVar = new zztn(this, this.zzo.zzj(), bArr);
                this.zzi = zztnVar;
                this.zzs.zzm(zztnVar);
                if (this.zzs.zzg()) {
                    this.zzo.zzj();
                }
                zzqj zzqjVar = this.zzl;
                if (zzqjVar != null) {
                    this.zzs.zzn(zzqjVar);
                }
                zzZ();
                int i6 = this.zzR.zza;
                AudioDeviceInfo audioDeviceInfo = this.zzS;
                if (audioDeviceInfo != null) {
                    this.zzs.zzo(audioDeviceInfo);
                }
                this.zzE = true;
                int zzh = this.zzs.zzh();
                int i7 = this.zzP;
                this.zzP = zzh;
                zzsf zzsfVar = this.zzm;
                if (zzsfVar != null) {
                    ((zzub) zzsfVar).zza.zzaB().zzk(this.zzo.zzd());
                    if (zzh != i7) {
                        this.zzQ = true;
                        zztq zztqVar = this.zzo;
                        zzrh zzrhVar2 = new zzrh(zztqVar.zzj(), null);
                        zzrhVar2.zzg(this.zzP);
                        this.zzo = zztqVar.zza(new zzri(zzrhVar2, null));
                        zztq zztqVar2 = this.zzn;
                        if (zztqVar2 != null) {
                            zzrh zzrhVar3 = new zzrh(zztqVar2.zzj(), null);
                            zzrhVar3.zzg(this.zzP);
                            this.zzn = zztqVar2.zza(new zzri(zzrhVar3, null));
                        }
                        zzsf zzsfVar2 = this.zzm;
                        int i8 = this.zzP;
                        if (Build.VERSION.SDK_INT >= 35) {
                            zzuc zzucVar = ((zzub) zzsfVar2).zza;
                            if (zzucVar.zzaC() != null) {
                                zzucVar.zzaC().zza(i8);
                            }
                        }
                        ((zzub) zzsfVar2).zza.zzaB().zzm(i8);
                    }
                }
            } catch (zzse e3) {
                this.zzj.zza(e3);
                return false;
            }
        }
        this.zzj.zzc();
        if (this.zzE) {
            this.zzF = Math.max(0L, j);
            this.zzD = false;
            this.zzE = false;
            zzac(j);
            if (this.zzO) {
                zzi();
            }
        }
        if (this.zzI == null) {
            zzguk.zza(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.zzo.zze() && this.zzC == 0) {
                int zzF = zzF(this.zzo.zzj().zza, byteBuffer);
                this.zzC = zzF;
                if (zzF == 0) {
                    return true;
                }
            }
            if (this.zzu != null) {
                if (!zzV()) {
                    return false;
                }
                zzac(j);
                this.zzu = null;
            }
            long j2 = this.zzF;
            zztq zztqVar3 = this.zzo;
            long zzb = j2 + zztqVar3.zzb((zztqVar3.zze() ? this.zzy / this.zzo.zzh() : this.zzz) - this.zzd.zzs());
            if (!this.zzD && Math.abs(zzb - j) > 200000) {
                zzsf zzsfVar3 = this.zzm;
                if (zzsfVar3 != null) {
                    zzsfVar3.zza(new zzsg(j, zzb));
                }
                this.zzD = true;
            }
            if (this.zzD) {
                if (!zzV()) {
                    return false;
                }
                long j3 = j - zzb;
                this.zzF += j3;
                this.zzD = false;
                zzac(j);
                zzsf zzsfVar4 = this.zzm;
                if (zzsfVar4 != null && j3 != 0) {
                    ((zzub) zzsfVar4).zza.zzar();
                }
            }
            if (this.zzo.zze()) {
                this.zzy += byteBuffer.remaining();
            } else {
                this.zzz += this.zzC * i;
            }
            this.zzI = byteBuffer;
            this.zzJ = i;
        }
        zzU(j);
        if (!this.zzI.hasRemaining()) {
            this.zzI = null;
            this.zzJ = 0;
            return true;
        }
        if (!this.zzs.zzl()) {
            return false;
        }
        zzeh.zzc("DefaultAudioSink", "Resetting stalled audio output");
        zzC();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzl() throws zzsh {
        if (!this.zzL && zzae() && zzV()) {
            zzah();
            this.zzL = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final boolean zzm() {
        if (zzae()) {
            return this.zzL && !zzn();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final boolean zzn() {
        if (!zzae()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.zzs.zzg() && this.zzN) {
            return false;
        }
        long zzaf = zzaf();
        long zzk = this.zzs.zzk();
        zzqz zzqzVar = this.zzs;
        zzqzVar.getClass();
        return zzaf > zzfm.zzv(zzk, zzqzVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzo(zzav zzavVar) {
        float f = zzavVar.zzb;
        String str = zzfm.zza;
        zzav zzavVar2 = new zzav(Math.max(0.1f, Math.min(f, 8.0f)), Math.max(0.1f, Math.min(zzavVar.zzc, 8.0f)));
        this.zzw = zzavVar2;
        zzab(zzavVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final zzav zzp() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzq(boolean z) {
        this.zzx = z;
        zzab(this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzr(zzd zzdVar) {
        if (this.zzt.equals(zzdVar)) {
            return;
        }
        this.zzt = zzdVar;
        zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final zzql zzs() {
        zzrj zzrjVar = this.zzq;
        if (zzrjVar instanceof zzti) {
            return ((zzti) zzrjVar).zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzt(int i) {
        if (this.zzQ) {
            if (this.zzP != i) {
                return;
            } else {
                this.zzQ = false;
            }
        }
        if (this.zzP != i) {
            this.zzP = i;
            zzaa();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzu(zze zzeVar) {
        if (this.zzR.equals(zzeVar)) {
            return;
        }
        if (this.zzs != null) {
            int i = this.zzR.zza;
        }
        this.zzR = zzeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzv(AudioDeviceInfo audioDeviceInfo) {
        this.zzS = audioDeviceInfo;
        zzqz zzqzVar = this.zzs;
        if (zzqzVar != null) {
            zzqzVar.zzo(audioDeviceInfo);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzw(int i) {
        int i2 = this.zzT;
        int zzai = zzai(i);
        if (i2 == zzai) {
            return;
        }
        this.zzT = zzai;
        zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzx(long j) {
        this.zzG = j;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final long zzy() {
        if (!zzae()) {
            return -9223372036854775807L;
        }
        if (this.zzo.zze()) {
            return this.zzo.zzc(this.zzs.zzj());
        }
        long zzj = this.zzs.zzj();
        int zzf = zzagl.zzf(this.zzo.zzj().zza);
        zzguk.zzi(zzf != -2147483647);
        return zzfm.zzw(zzj, 1000000L, zzf, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzz(int i, int i2) {
        zzqz zzqzVar = this.zzs;
        if (zzqzVar != null) {
            zzqzVar.zzg();
        }
    }

    /* synthetic */ zztw(zztp zztpVar, byte[] bArr) {
        this.zzb = zztpVar.zzb() == null ? null : zztpVar.zzb().getApplicationContext();
        this.zzt = zzd.zza;
        this.zzaa = zztpVar.zzd();
        this.zzq = zztpVar.zzc();
        zztl zztlVar = new zztl();
        this.zzc = zztlVar;
        zzui zzuiVar = new zzui();
        this.zzd = zzuiVar;
        this.zze = new zzcw();
        this.zzf = new zzuh();
        this.zzg = zzgxm.zzk(zzuiVar, zztlVar);
        this.zzH = 1.0f;
        this.zzP = 0;
        this.zzR = new zze(0, 0.0f);
        zzav zzavVar = zzav.zza;
        this.zzv = new zztu(zzavVar, 0L, 0L, null);
        this.zzw = zzavVar;
        this.zzx = false;
        this.zzh = new ArrayDeque();
        this.zzj = new zztv();
        this.zzk = new zztv();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && zztpVar.zzb() != null) {
            i = zzai(zztpVar.zzb().getDeviceId());
        }
        this.zzT = i;
    }

    static int zzF(int i, ByteBuffer byteBuffer) {
        int i2;
        int i3;
        byte b;
        int i4;
        int i5;
        if (i == 20) {
            return zzgy.zzb(byteBuffer);
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
                    int zzb = zzahf.zzb(zzfm.zzO(byteBuffer, byteBuffer.position()));
                    if (zzb != -1) {
                        return zzb;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i) {
                        case 14:
                            int i6 = zzafh.zza;
                            int position = byteBuffer.position();
                            int limit = byteBuffer.limit() - 10;
                            int i7 = position;
                            while (true) {
                                if (i7 > limit) {
                                    i5 = -1;
                                } else if ((zzfm.zzO(byteBuffer, i7 + 4) & (-2)) == -126718022) {
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
                            int i8 = zzafk.zza;
                            byte[] bArr = new byte[16];
                            int position2 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(position2);
                            return zzafk.zzb(new zzet(bArr, 16)).zzc;
                        case 18:
                            break;
                        default:
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
                            sb.append("Unexpected audio encoding: ");
                            sb.append(i);
                            throw new IllegalStateException(sb.toString());
                    }
            }
            return zzafh.zze(byteBuffer);
        }
        int i9 = zzagg.zza;
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
