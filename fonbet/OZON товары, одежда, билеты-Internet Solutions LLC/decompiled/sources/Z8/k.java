package Z8;

import a9.C4962a;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import b9.C5586a;
import b9.C5589d;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzft;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwe;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes9.dex */
public final class k extends com.google.mlkit.common.sdkinternal.f {

    /* renamed from: j, reason: collision with root package name */
    private static final C5589d f35708j = C5589d.b();

    /* renamed from: k, reason: collision with root package name */
    static boolean f35709k = true;

    /* renamed from: d, reason: collision with root package name */
    private final W8.b f35710d;

    /* renamed from: e, reason: collision with root package name */
    private final l f35711e;

    /* renamed from: f, reason: collision with root package name */
    private final zzwp f35712f;

    /* renamed from: g, reason: collision with root package name */
    private final zzwr f35713g;

    /* renamed from: h, reason: collision with root package name */
    private final C5586a f35714h = new C5586a();

    /* renamed from: i, reason: collision with root package name */
    private boolean f35715i;

    public k(com.google.mlkit.common.sdkinternal.h hVar, W8.b bVar, l lVar, zzwp zzwpVar) {
        Preconditions.checkNotNull(hVar, "MlKitContext can not be null");
        Preconditions.checkNotNull(bVar, "BarcodeScannerOptions can not be null");
        this.f35710d = bVar;
        this.f35711e = lVar;
        this.f35712f = zzwpVar;
        this.f35713g = zzwr.zza(hVar.b());
    }

    private final void k(final zzrb zzrbVar, long j11, @NonNull final C4962a c4962a, List list) {
        final zzcp zzcpVar = new zzcp();
        final zzcp zzcpVar2 = new zzcp();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                X8.a aVar = (X8.a) it.next();
                zzcpVar.zzd(b.a(aVar.a()));
                zzcpVar2.zzd(b.b(aVar.d()));
            }
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j11;
        this.f35712f.zzf(new zzwo() { // from class: Z8.i
            @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwo
            public final zzwe zza() {
                zzcp zzcpVar3 = zzcpVar2;
                return k.this.i(elapsedRealtime, zzrbVar, zzcpVar, zzcpVar3, c4962a);
            }
        }, zzrc.ON_DEVICE_BARCODE_DETECT);
        zzfr zzfrVar = new zzfr();
        zzfrVar.zze(zzrbVar);
        zzfrVar.zzf(Boolean.valueOf(f35709k));
        zzfrVar.zzg(b.c(this.f35710d));
        zzfrVar.zzc(zzcpVar.zzf());
        zzfrVar.zzd(zzcpVar2.zzf());
        final zzft zzh = zzfrVar.zzh();
        final j jVar = new j(this);
        final zzrc zzrcVar = zzrc.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
        Executor c11 = com.google.mlkit.common.sdkinternal.g.c();
        final zzwp zzwpVar = this.f35712f;
        c11.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwn
            @Override // java.lang.Runnable
            public final void run() {
                zzwp.this.zzh(zzrcVar, zzh, elapsedRealtime, jVar);
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        long j12 = currentTimeMillis - elapsedRealtime;
        this.f35713g.zzc(true != this.f35715i ? 24301 : 24302, zzrbVar.zza(), j12, currentTimeMillis);
    }

    @Override // com.google.mlkit.common.sdkinternal.j
    public final synchronized void b() throws R8.a {
        this.f35715i = this.f35711e.zzc();
    }

    @Override // com.google.mlkit.common.sdkinternal.j
    public final synchronized void d() {
        try {
            this.f35711e.zzb();
            f35709k = true;
            zzrd zzrdVar = new zzrd();
            zzra zzraVar = this.f35715i ? zzra.TYPE_THICK : zzra.TYPE_THIN;
            zzwp zzwpVar = this.f35712f;
            zzrdVar.zze(zzraVar);
            zzrp zzrpVar = new zzrp();
            zzrpVar.zzi(b.c(this.f35710d));
            zzrdVar.zzg(zzrpVar.zzj());
            zzwpVar.zzd(zzws.zzf(zzrdVar), zzrc.ON_DEVICE_BARCODE_CLOSE);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.mlkit.common.sdkinternal.f
    public final Object h(@NonNull C4962a c4962a) throws R8.a {
        k kVar;
        C4962a c4962a2;
        ArrayList a11;
        synchronized (this) {
            try {
                try {
                    C5586a c5586a = this.f35714h;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    c5586a.a(c4962a);
                    try {
                        a11 = this.f35711e.a(c4962a);
                        kVar = this;
                        c4962a2 = c4962a;
                    } catch (R8.a e11) {
                        e = e11;
                        kVar = this;
                        c4962a2 = c4962a;
                    }
                    try {
                        kVar.k(zzrb.NO_ERROR, elapsedRealtime, c4962a2, a11);
                        f35709k = false;
                        return a11;
                    } catch (R8.a e12) {
                        e = e12;
                        R8.a aVar = e;
                        kVar.k(aVar.a() == 14 ? zzrb.MODEL_NOT_DOWNLOADED : zzrb.UNKNOWN_ERROR, elapsedRealtime, c4962a2, null);
                        throw aVar;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    final /* synthetic */ zzwe i(long j11, zzrb zzrbVar, zzcp zzcpVar, zzcp zzcpVar2, C4962a c4962a) {
        zzrp zzrpVar = new zzrp();
        zzqo zzqoVar = new zzqo();
        zzqoVar.zzc(Long.valueOf(j11));
        zzqoVar.zzd(zzrbVar);
        zzqoVar.zze(Boolean.valueOf(f35709k));
        Boolean bool = Boolean.TRUE;
        zzqoVar.zza(bool);
        zzqoVar.zzb(bool);
        zzrpVar.zzh(zzqoVar.zzf());
        zzrpVar.zzi(b.c(this.f35710d));
        zzrpVar.zze(zzcpVar.zzf());
        zzrpVar.zzf(zzcpVar2.zzf());
        int c11 = c4962a.c();
        f35708j.getClass();
        int c12 = C5589d.c(c4962a);
        zzqh zzqhVar = new zzqh();
        zzqhVar.zza(c11 != -1 ? c11 != 35 ? c11 != 842094169 ? c11 != 16 ? c11 != 17 ? zzqi.UNKNOWN_FORMAT : zzqi.NV21 : zzqi.NV16 : zzqi.YV12 : zzqi.YUV_420_888 : zzqi.BITMAP);
        zzqhVar.zzb(Integer.valueOf(c12));
        zzrpVar.zzg(zzqhVar.zzd());
        zzrd zzrdVar = new zzrd();
        zzrdVar.zze(this.f35715i ? zzra.TYPE_THICK : zzra.TYPE_THIN);
        zzrdVar.zzg(zzrpVar.zzj());
        return zzws.zzf(zzrdVar);
    }

    final /* synthetic */ zzwe j(zzft zzftVar, int i11, zzqd zzqdVar) {
        zzrd zzrdVar = new zzrd();
        zzrdVar.zze(this.f35715i ? zzra.TYPE_THICK : zzra.TYPE_THIN);
        zzfq zzfqVar = new zzfq();
        zzfqVar.zza(Integer.valueOf(i11));
        zzfqVar.zzc(zzftVar);
        zzfqVar.zzb(zzqdVar);
        zzrdVar.zzd(zzfqVar.zze());
        return zzws.zzf(zzrdVar);
    }
}
