package N7;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* loaded from: classes9.dex */
public final class n extends zzeh implements zzfn {
    private static final n zzb;
    private zzeo zzd = zzeh.zzP();
    private zzeo zze = zzeh.zzP();

    static {
        n nVar = new n();
        zzb = nVar;
        zzeh.zzV(n.class, nVar);
    }

    private n() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zzd", l.class, "zze", l.class});
        }
        if (i12 == 3) {
            return new n();
        }
        if (i12 == 4) {
            return new m();
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
