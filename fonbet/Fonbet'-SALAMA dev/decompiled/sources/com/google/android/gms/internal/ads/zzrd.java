package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import io.sentry.protocol.SentryThread;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzrd extends zzsy implements zzkn {
    private final Context zzb;
    private final zzpp zzc;
    private final zzpx zzd;
    private final zzsk zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzz zzi;
    private zzz zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzrd(Context context, zzsm zzsmVar, zzta zztaVar, boolean z4, Handler handler, zzpq zzpqVar, zzpx zzpxVar) {
        super(1, zzsmVar, zztaVar, false, 44100.0f);
        zzrc zzrcVar = null;
        zzsk zzskVar = zzen.zza >= 35 ? new zzsk(zzsj.zza) : null;
        this.zzb = context.getApplicationContext();
        this.zzd = zzpxVar;
        this.zze = zzskVar;
        this.zzo = -1000;
        this.zzc = new zzpp(handler, zzpqVar);
        zzpxVar.zzq(new zzrb(this, zzrcVar));
    }

    private final int zzaQ(zzsr zzsrVar, zzz zzzVar) {
        int i7;
        if (!"OMX.google.raw.decoder".equals(zzsrVar.zza) || (i7 = zzen.zza) >= 24 || (i7 == 23 && zzen.zzN(this.zzb))) {
            return zzzVar.zzp;
        }
        return -1;
    }

    private static List zzaR(zzta zztaVar, zzz zzzVar, boolean z4, zzpx zzpxVar) {
        zzsr zza;
        return zzzVar.zzo == null ? zzfwh.zzn() : (!zzpxVar.zzA(zzzVar) || (zza = zztl.zza()) == null) ? zztl.zze(zztaVar, zzzVar, false, false) : zzfwh.zzo(zza);
    }

    private final void zzaS() {
        long zzb = this.zzd.zzb(zzW());
        if (zzb != Long.MIN_VALUE) {
            if (!this.zzl) {
                zzb = Math.max(this.zzk, zzb);
            }
            this.zzk = zzb;
            this.zzl = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzA() {
        zzsk zzskVar;
        this.zzd.zzk();
        if (zzen.zza < 35 || (zzskVar = this.zze) == null) {
            return;
        }
        zzskVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhp
    public final void zzC() {
        this.zzn = false;
        try {
            super.zzC();
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzl();
            }
        } catch (Throwable th) {
            if (this.zzm) {
                this.zzm = false;
                this.zzd.zzl();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzD() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzE() {
        zzaS();
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzlm, com.google.android.gms.internal.ads.zzlp
    public final String zzU() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzlm
    public final boolean zzW() {
        return super.zzW() && this.zzd.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzlm
    public final boolean zzX() {
        return this.zzd.zzy() || super.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final float zzZ(float f7, zzz zzzVar, zzz[] zzzVarArr) {
        int i7 = -1;
        for (zzz zzzVar2 : zzzVarArr) {
            int i8 = zzzVar2.zzF;
            if (i8 != -1) {
                i7 = Math.max(i7, i8);
            }
        }
        if (i7 == -1) {
            return -1.0f;
        }
        return i7 * f7;
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final long zza() {
        if (zzcT() == 2) {
            zzaS();
        }
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final int zzaa(zzta zztaVar, zzz zzzVar) {
        int i7;
        boolean z4;
        if (!zzay.zzh(zzzVar.zzo)) {
            return 128;
        }
        int i8 = zzzVar.zzL;
        boolean zzaP = zzsy.zzaP(zzzVar);
        int i9 = 1;
        if (!zzaP || (i8 != 0 && zztl.zza() == null)) {
            i7 = 0;
        } else {
            zzpc zzd = this.zzd.zzd(zzzVar);
            if (zzd.zzb) {
                i7 = true != zzd.zzc ? 512 : 1536;
                if (zzd.zzd) {
                    i7 |= 2048;
                }
            } else {
                i7 = 0;
            }
            if (this.zzd.zzA(zzzVar)) {
                return i7 | 172;
            }
        }
        if ((!"audio/raw".equals(zzzVar.zzo) || this.zzd.zzA(zzzVar)) && this.zzd.zzA(zzen.zzA(2, zzzVar.zzE, zzzVar.zzF))) {
            List zzaR = zzaR(zztaVar, zzzVar, false, this.zzd);
            if (!zzaR.isEmpty()) {
                if (zzaP) {
                    zzsr zzsrVar = (zzsr) zzaR.get(0);
                    boolean zze = zzsrVar.zze(zzzVar);
                    if (!zze) {
                        for (int i10 = 1; i10 < zzaR.size(); i10++) {
                            zzsr zzsrVar2 = (zzsr) zzaR.get(i10);
                            if (zzsrVar2.zze(zzzVar)) {
                                z4 = false;
                                zze = true;
                                zzsrVar = zzsrVar2;
                                break;
                            }
                        }
                    }
                    z4 = true;
                    int i11 = true != zze ? 3 : 4;
                    int i12 = 8;
                    if (zze && zzsrVar.zzf(zzzVar)) {
                        i12 = 16;
                    }
                    return i11 | i12 | 32 | (true != zzsrVar.zzg ? 0 : 64) | (true != z4 ? 0 : 128) | i7;
                }
                i9 = 2;
            }
        }
        return i9 | 128;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final zzhr zzab(zzsr zzsrVar, zzz zzzVar, zzz zzzVar2) {
        int i7;
        int i8;
        zzhr zzb = zzsrVar.zzb(zzzVar, zzzVar2);
        int i9 = zzb.zze;
        if (zzaL(zzzVar2)) {
            i9 |= 32768;
        }
        if (zzaQ(zzsrVar, zzzVar2) > this.zzf) {
            i9 |= 64;
        }
        String str = zzsrVar.zza;
        if (i9 != 0) {
            i8 = i9;
            i7 = 0;
        } else {
            i7 = zzb.zzd;
            i8 = 0;
        }
        return new zzhr(str, zzzVar, zzzVar2, i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final zzhr zzac(zzkh zzkhVar) {
        zzz zzzVar = zzkhVar.zza;
        zzzVar.getClass();
        this.zzi = zzzVar;
        zzhr zzac = super.zzac(zzkhVar);
        this.zzc.zzu(zzzVar, zzac);
        return zzac;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
    
        if ("AXON 7 mini".equals(r10) == false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010f  */
    @Override // com.google.android.gms.internal.ads.zzsy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzsl zzaf(zzsr zzsrVar, zzz zzzVar, MediaCrypto mediaCrypto, float f7) {
        boolean z4;
        MediaFormat mediaFormat;
        zzz[] zzT = zzT();
        int length = zzT.length;
        int zzaQ = zzaQ(zzsrVar, zzzVar);
        if (length != 1) {
            for (zzz zzzVar2 : zzT) {
                if (zzsrVar.zzb(zzzVar, zzzVar2).zzd != 0) {
                    zzaQ = Math.max(zzaQ, zzaQ(zzsrVar, zzzVar2));
                }
            }
        }
        this.zzf = zzaQ;
        String str = zzsrVar.zza;
        int i7 = zzen.zza;
        if (i7 < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(Build.MANUFACTURER)) {
            String str2 = Build.DEVICE;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z4 = true;
                this.zzg = z4;
                String str3 = zzsrVar.zza;
                this.zzh = !str3.equals("OMX.google.opus.decoder") || str3.equals("c2.android.opus.decoder") || str3.equals("OMX.google.vorbis.decoder") || str3.equals("c2.android.vorbis.decoder");
                String str4 = zzsrVar.zzc;
                int i8 = this.zzf;
                mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", str4);
                mediaFormat.setInteger("channel-count", zzzVar.zzE);
                mediaFormat.setInteger("sample-rate", zzzVar.zzF);
                zzdt.zzb(mediaFormat, zzzVar.zzr);
                zzdt.zza(mediaFormat, "max-input-size", i8);
                mediaFormat.setInteger(SentryThread.JsonKeys.PRIORITY, 0);
                if (f7 != -1.0f) {
                    if (i7 == 23) {
                        String str5 = Build.MODEL;
                        if (!"ZTE B2017G".equals(str5)) {
                        }
                    }
                    mediaFormat.setFloat("operating-rate", f7);
                }
                if (i7 <= 28 && "audio/ac4".equals(zzzVar.zzo)) {
                    mediaFormat.setInteger("ac4-is-sync", 1);
                }
                if (i7 >= 24 && this.zzd.zza(zzen.zzA(4, zzzVar.zzE, zzzVar.zzF)) == 2) {
                    mediaFormat.setInteger("pcm-encoding", 4);
                }
                if (i7 >= 32) {
                    mediaFormat.setInteger("max-output-channel-count", 99);
                }
                if (i7 >= 35) {
                    mediaFormat.setInteger("importance", Math.max(0, -this.zzo));
                }
                this.zzj = ("audio/raw".equals(zzsrVar.zzb) || "audio/raw".equals(zzzVar.zzo)) ? null : zzzVar;
                return zzsl.zza(zzsrVar, mediaFormat, zzzVar, null, this.zze);
            }
        }
        z4 = false;
        this.zzg = z4;
        String str32 = zzsrVar.zza;
        this.zzh = !str32.equals("OMX.google.opus.decoder") || str32.equals("c2.android.opus.decoder") || str32.equals("OMX.google.vorbis.decoder") || str32.equals("c2.android.vorbis.decoder");
        String str42 = zzsrVar.zzc;
        int i82 = this.zzf;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str42);
        mediaFormat.setInteger("channel-count", zzzVar.zzE);
        mediaFormat.setInteger("sample-rate", zzzVar.zzF);
        zzdt.zzb(mediaFormat, zzzVar.zzr);
        zzdt.zza(mediaFormat, "max-input-size", i82);
        mediaFormat.setInteger(SentryThread.JsonKeys.PRIORITY, 0);
        if (f7 != -1.0f) {
        }
        if (i7 <= 28) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i7 >= 24) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i7 >= 32) {
        }
        if (i7 >= 35) {
        }
        this.zzj = ("audio/raw".equals(zzsrVar.zzb) || "audio/raw".equals(zzzVar.zzo)) ? null : zzzVar;
        return zzsl.zza(zzsrVar, mediaFormat, zzzVar, null, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final List zzag(zzta zztaVar, zzz zzzVar, boolean z4) {
        return zztl.zzf(zzaR(zztaVar, zzzVar, false, this.zzd), zzzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzaj(zzhg zzhgVar) {
        zzz zzzVar;
        if (zzen.zza < 29 || (zzzVar = zzhgVar.zza) == null || !Objects.equals(zzzVar.zzo, "audio/opus") || !zzaK()) {
            return;
        }
        ByteBuffer byteBuffer = zzhgVar.zzf;
        byteBuffer.getClass();
        zzz zzzVar2 = zzhgVar.zza;
        zzzVar2.getClass();
        int i7 = zzzVar2.zzH;
        if (byteBuffer.remaining() == 8) {
            this.zzd.zzr(i7, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzak(Exception exc) {
        zzdq.zzd("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zzm(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzal(String str, zzsl zzslVar, long j, long j3) {
        this.zzc.zzq(str, j, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzam(String str) {
        this.zzc.zzr(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzan(zzz zzzVar, MediaFormat mediaFormat) {
        int i7;
        zzz zzzVar2 = this.zzj;
        int[] iArr = null;
        boolean z4 = true;
        if (zzzVar2 != null) {
            zzzVar = zzzVar2;
        } else if (zzaz() != null) {
            mediaFormat.getClass();
            int zzn = "audio/raw".equals(zzzVar.zzo) ? zzzVar.zzG : (zzen.zza < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? zzen.zzn(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            zzx zzxVar = new zzx();
            zzxVar.zzad("audio/raw");
            zzxVar.zzX(zzn);
            zzxVar.zzI(zzzVar.zzH);
            zzxVar.zzJ(zzzVar.zzI);
            zzxVar.zzW(zzzVar.zzl);
            zzxVar.zzO(zzzVar.zza);
            zzxVar.zzQ(zzzVar.zzb);
            zzxVar.zzR(zzzVar.zzc);
            zzxVar.zzS(zzzVar.zzd);
            zzxVar.zzaf(zzzVar.zze);
            zzxVar.zzab(zzzVar.zzf);
            zzxVar.zzB(mediaFormat.getInteger("channel-count"));
            zzxVar.zzae(mediaFormat.getInteger("sample-rate"));
            zzz zzaj = zzxVar.zzaj();
            if (this.zzg && zzaj.zzE == 6 && (i7 = zzzVar.zzE) < 6) {
                iArr = new int[i7];
                for (int i8 = 0; i8 < zzzVar.zzE; i8++) {
                    iArr[i8] = i8;
                }
            } else if (this.zzh) {
                int i9 = zzaj.zzE;
                if (i9 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i9 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i9 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i9 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i9 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            zzzVar = zzaj;
        }
        try {
            int i10 = zzen.zza;
            if (i10 >= 29) {
                if (zzaK()) {
                    zzn();
                }
                if (i10 < 29) {
                    z4 = false;
                }
                zzcv.zzf(z4);
            }
            this.zzd.zze(zzzVar, 0, iArr);
        } catch (zzps e7) {
            throw zzcW(e7, e7.zza, false, 5001);
        }
    }

    public final void zzao() {
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzap() {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zzaq() {
        try {
            this.zzd.zzj();
        } catch (zzpw e7) {
            throw zzcW(e7, e7.zzc, e7.zzb, true != zzaK() ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final boolean zzar(long j, long j3, zzso zzsoVar, ByteBuffer byteBuffer, int i7, int i8, int i9, long j7, boolean z4, boolean z7, zzz zzzVar) {
        byteBuffer.getClass();
        if (this.zzj != null && (i8 & 2) != 0) {
            zzsoVar.getClass();
            zzsoVar.zzo(i7, false);
            return true;
        }
        if (z4) {
            if (zzsoVar != null) {
                zzsoVar.zzo(i7, false);
            }
            ((zzsy) this).zza.zzf += i9;
            this.zzd.zzg();
            return true;
        }
        try {
            if (!this.zzd.zzx(byteBuffer, j7, i9)) {
                return false;
            }
            if (zzsoVar != null) {
                zzsoVar.zzo(i7, false);
            }
            ((zzsy) this).zza.zze += i9;
            return true;
        } catch (zzpt e7) {
            zzz zzzVar2 = this.zzi;
            if (zzaK()) {
                zzn();
            }
            throw zzcW(e7, zzzVar2, e7.zzb, 5001);
        } catch (zzpw e8) {
            if (zzaK()) {
                zzn();
            }
            throw zzcW(e8, zzzVar, e8.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final boolean zzas(zzz zzzVar) {
        zzn();
        return this.zzd.zzA(zzzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final zzbb zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final void zzg(zzbb zzbbVar) {
        this.zzd.zzs(zzbbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkn
    public final boolean zzj() {
        boolean z4 = this.zzn;
        this.zzn = false;
        return z4;
    }

    @Override // com.google.android.gms.internal.ads.zzhp, com.google.android.gms.internal.ads.zzlm
    public final zzkn zzl() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhp, com.google.android.gms.internal.ads.zzlh
    public final void zzu(int i7, Object obj) {
        zzsk zzskVar;
        if (i7 == 2) {
            zzpx zzpxVar = this.zzd;
            obj.getClass();
            zzpxVar.zzw(((Float) obj).floatValue());
            return;
        }
        if (i7 == 3) {
            zze zzeVar = (zze) obj;
            zzpx zzpxVar2 = this.zzd;
            zzeVar.getClass();
            zzpxVar2.zzm(zzeVar);
            return;
        }
        if (i7 == 6) {
            zzf zzfVar = (zzf) obj;
            zzpx zzpxVar3 = this.zzd;
            zzfVar.getClass();
            zzpxVar3.zzo(zzfVar);
            return;
        }
        if (i7 == 12) {
            int i8 = zzen.zza;
            this.zzd.zzu((AudioDeviceInfo) obj);
            return;
        }
        if (i7 == 16) {
            obj.getClass();
            this.zzo = ((Integer) obj).intValue();
            zzso zzaz = zzaz();
            if (zzaz == null || zzen.zza < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.zzo));
            zzaz.zzq(bundle);
            return;
        }
        if (i7 == 9) {
            zzpx zzpxVar4 = this.zzd;
            obj.getClass();
            zzpxVar4.zzv(((Boolean) obj).booleanValue());
        } else {
            if (i7 != 10) {
                super.zzu(i7, obj);
                return;
            }
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            this.zzd.zzn(intValue);
            if (zzen.zza < 35 || (zzskVar = this.zze) == null) {
                return;
            }
            zzskVar.zzd(intValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhp
    public final void zzx() {
        this.zzm = true;
        this.zzi = null;
        try {
            this.zzd.zzf();
            super.zzx();
        } catch (Throwable th) {
            super.zzx();
            throw th;
        } finally {
            this.zzc.zzs(((zzsy) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhp
    public final void zzy(boolean z4, boolean z7) {
        super.zzy(z4, z7);
        this.zzc.zzt(((zzsy) this).zza);
        zzn();
        this.zzd.zzt(zzo());
        this.zzd.zzp(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzsy, com.google.android.gms.internal.ads.zzhp
    public final void zzz(long j, boolean z4) {
        super.zzz(j, z4);
        this.zzd.zzf();
        this.zzk = j;
        this.zzn = false;
        this.zzl = true;
    }
}
