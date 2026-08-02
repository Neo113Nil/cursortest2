package N7;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzem;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* loaded from: classes9.dex */
public final class e extends zzeh implements zzfn {
    private static final e zzb;
    private int zzd;
    private zzem zze = zzeh.zzM();
    private zzem zzf = zzeh.zzM();
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        e eVar = new e();
        zzb = eVar;
        zzeh.zzV(e.class, eVar);
    }

    private e() {
    }

    public static d a() {
        return (d) zzb.zzG();
    }

    static /* synthetic */ void c(e eVar, int i11) {
        eVar.zzd |= 2;
        eVar.zzh = i11;
    }

    static /* synthetic */ void d(e eVar, float f7) {
        zzem zzemVar = eVar.zze;
        if (!zzemVar.zzc()) {
            eVar.zze = zzeh.zzN(zzemVar);
        }
        eVar.zze.zzh(f7);
    }

    static /* synthetic */ void e(e eVar, float f7) {
        zzem zzemVar = eVar.zzf;
        if (!zzemVar.zzc()) {
            eVar.zzf = zzeh.zzN(zzemVar);
        }
        eVar.zzf.zzh(f7);
    }

    static /* synthetic */ void f(e eVar, int i11) {
        eVar.zzd |= 1;
        eVar.zzg = i11;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i12 == 3) {
            return new e();
        }
        if (i12 == 4) {
            return new d(0);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
