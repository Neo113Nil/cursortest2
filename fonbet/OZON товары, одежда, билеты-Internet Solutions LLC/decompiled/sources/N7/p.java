package N7;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* loaded from: classes9.dex */
public final class p extends zzeh implements zzfn {
    private static final p zzb;

    static {
        p pVar = new p();
        zzb = pVar;
        zzeh.zzV(p.class, pVar);
    }

    private p() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0001\u0000", null);
        }
        if (i12 == 3) {
            return new p();
        }
        if (i12 == 4) {
            return new o();
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
