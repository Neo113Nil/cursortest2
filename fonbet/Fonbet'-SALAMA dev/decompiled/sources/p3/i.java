package p3;

import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
import o3.BinderC1507b;
import o3.InterfaceC1506a;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class i extends zza {
    public final InterfaceC1506a Z(BinderC1507b binderC1507b, String str, int i7) {
        Parcel zza = zza();
        zzc.zze(zza, binderC1507b);
        zza.writeString(str);
        zza.writeInt(i7);
        return AbstractC1663a.h(zzB(2, zza));
    }

    public final InterfaceC1506a t0(BinderC1507b binderC1507b, String str, int i7, BinderC1507b binderC1507b2) {
        Parcel zza = zza();
        zzc.zze(zza, binderC1507b);
        zza.writeString(str);
        zza.writeInt(i7);
        zzc.zze(zza, binderC1507b2);
        return AbstractC1663a.h(zzB(8, zza));
    }

    public final InterfaceC1506a u0(BinderC1507b binderC1507b, String str, int i7) {
        Parcel zza = zza();
        zzc.zze(zza, binderC1507b);
        zza.writeString(str);
        zza.writeInt(i7);
        return AbstractC1663a.h(zzB(4, zza));
    }
}
