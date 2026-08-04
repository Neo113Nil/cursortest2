package F2;

import L5.AbstractC0331j;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzt;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzaxp;
import java.util.HashMap;
import p155w1.C1050x1;
import p155w1.P2;

/* JADX INFO: loaded from: classes.dex */
public final class g1 extends zzaxo implements InterfaceC0265y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p167y2.r f2668a;

    public g1(p167y2.r rVar) {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        this.f2668a = rVar;
    }

    public static InterfaceC0265y0 Z(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0265y0 ? (InterfaceC0265y0) iInterfaceQueryLocalInterface : new C0263x0(iBinder);
    }

    @Override // F2.InterfaceC0265y0
    public final void c0(zzt zztVar) {
        p167y2.r rVar = this.f2668a;
        if (rVar != null) {
            int i7 = zztVar.f10781b;
            P2 p5 = (P2) rVar;
            C1050x1 c1050x1 = (C1050x1) p5.f17514b;
            c1050x1.getClass();
            HashMap map = new HashMap();
            HashMap map2 = (HashMap) c1050x1.f17932c;
            for (Integer num : map2.keySet()) {
                if (map2.get(num) == ((AbstractC0331j) p5.f17515c)) {
                    map.put("adId", num);
                    map.put("eventName", "onPaidEvent");
                    map.put("valueMicros", Long.valueOf(zztVar.f10783d));
                    map.put("precision", Integer.valueOf(i7));
                    map.put("currencyCode", zztVar.f10782c);
                    c1050x1.Q(map);
                }
            }
            num = null;
            map.put("adId", num);
            map.put("eventName", "onPaidEvent");
            map.put("valueMicros", Long.valueOf(zztVar.f10783d));
            map.put("precision", Integer.valueOf(i7));
            map.put("currencyCode", zztVar.f10782c);
            c1050x1.Q(map);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    public final boolean zzdD(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            zzt zztVar = (zzt) zzaxp.zza(parcel, zzt.CREATOR);
            zzaxp.zzc(parcel);
            c0(zztVar);
            parcel2.writeNoException();
        } else {
            if (i7 != 2) {
                return false;
            }
            boolean zZzf = zzf();
            parcel2.writeNoException();
            int i9 = zzaxp.zza;
            parcel2.writeInt(zZzf ? 1 : 0);
        }
        return true;
    }

    @Override // F2.InterfaceC0265y0
    public final boolean zzf() {
        return this.f2668a == null;
    }
}
