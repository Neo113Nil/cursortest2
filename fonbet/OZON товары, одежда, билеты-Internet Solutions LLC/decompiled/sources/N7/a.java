package N7;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;

/* loaded from: classes9.dex */
public final class a extends zzeh<a, j> implements zzfn {
    private static final a zzb;
    private int zzd;
    private i zze;
    private c zzf;
    private n zzg;

    static {
        a aVar = new a();
        zzb = aVar;
        zzeh.zzV(a.class, aVar);
    }

    private a() {
    }

    public static j a() {
        return (j) zzb.zzG();
    }

    static /* synthetic */ void c(a aVar, i iVar) {
        iVar.getClass();
        aVar.zze = iVar;
        aVar.zzd |= 1;
    }

    static /* synthetic */ void d(a aVar, c cVar) {
        cVar.getClass();
        aVar.zzf = cVar;
        aVar.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeh
    @NonNull
    protected final Object zzg(int i11, @NonNull Object obj, @NonNull Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        if (i12 == 2) {
            return zzeh.zzS(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i12 == 3) {
            return new a();
        }
        if (i12 == 4) {
            return new j(0);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
