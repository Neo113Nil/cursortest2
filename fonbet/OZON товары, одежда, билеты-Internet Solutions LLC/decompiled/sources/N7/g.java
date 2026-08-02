package N7;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* loaded from: classes9.dex */
public final class g extends zzeh implements zzfn {
    private static final g zzb;
    private zzeo zzd = zzeh.zzP();

    static {
        g gVar = new g();
        zzb = gVar;
        zzeh.zzV(g.class, gVar);
    }

    private g() {
    }

    public static f a() {
        return (f) zzb.zzG();
    }

    static /* synthetic */ void c(g gVar, e eVar) {
        eVar.getClass();
        zzeo zzeoVar = gVar.zzd;
        if (!zzeoVar.zzc()) {
            gVar.zzd = zzeh.zzQ(zzeoVar);
        }
        gVar.zzd.add(eVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    protected final Object zzg(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", e.class});
        }
        if (i12 == 3) {
            return new g();
        }
        if (i12 == 4) {
            return new f(0);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
