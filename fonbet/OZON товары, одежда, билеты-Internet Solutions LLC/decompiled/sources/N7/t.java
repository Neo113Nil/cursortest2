package N7;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* loaded from: classes9.dex */
public final class t extends zzeh implements zzfn {
    private static final t zzb;

    static {
        t tVar = new t();
        zzb = tVar;
        zzeh.zzV(t.class, tVar);
    }

    private t() {
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
            return new t();
        }
        if (i12 == 4) {
            return new s();
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
