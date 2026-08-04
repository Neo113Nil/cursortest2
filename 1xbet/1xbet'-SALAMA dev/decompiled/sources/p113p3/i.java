package p113p3;

import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
import p105o3.a;
import p105o3.b;

/* JADX INFO: loaded from: classes.dex */
public final class i extends zza {
    public final a Z(b bVar, String str, int i7) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, bVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i7);
        return p150v0.a.h(zzB(2, parcelZza));
    }

    public final a t0(b bVar, String str, int i7, b bVar2) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, bVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i7);
        zzc.zze(parcelZza, bVar2);
        return p150v0.a.h(zzB(8, parcelZza));
    }

    public final a u0(b bVar, String str, int i7) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, bVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(i7);
        return p150v0.a.h(zzB(4, parcelZza));
    }
}
