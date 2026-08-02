package N7;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* loaded from: classes9.dex */
public final class l extends zzeh implements zzfn {
    private static final l zzb;
    private int zzd = 0;
    private Object zze;

    static {
        l lVar = new l();
        zzb = lVar;
        zzeh.zzV(l.class, lVar);
    }

    private l() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zze", "zzd", p.class, t.class, r.class});
        }
        if (i12 == 3) {
            return new l();
        }
        if (i12 == 4) {
            return new k();
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
