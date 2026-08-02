package N7;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhk;

/* loaded from: classes9.dex */
public final class r extends zzeh implements zzfn {
    private static final r zzb;
    private int zzd;
    private zzhk zzf;
    private zzdf zze = zzdf.zzb;
    private int zzg = 1;
    private float zzh = 0.75f;
    private boolean zzi = true;

    static {
        r rVar = new r();
        zzb = rVar;
        zzeh.zzV(r.class, rVar);
    }

    private r() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ခ\u0003\u0005ဇ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i12 == 3) {
            return new r();
        }
        if (i12 == 4) {
            return new q();
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
