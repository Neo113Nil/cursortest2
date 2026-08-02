package F2;

import L5.AbstractC0331j;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzt;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzaxp;
import java.util.HashMap;
import java.util.Iterator;
import w1.C1759x1;
import w1.P2;

/* loaded from: classes.dex */
public final class g1 extends zzaxo implements InterfaceC0265y0 {

    /* renamed from: a, reason: collision with root package name */
    public final y2.r f2668a;

    public g1(y2.r rVar) {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        this.f2668a = rVar;
    }

    public static InterfaceC0265y0 Z(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof InterfaceC0265y0 ? (InterfaceC0265y0) queryLocalInterface : new C0263x0(iBinder);
    }

    @Override // F2.InterfaceC0265y0
    public final void c0(zzt zztVar) {
        Integer num;
        y2.r rVar = this.f2668a;
        if (rVar != null) {
            int i7 = zztVar.f10781b;
            P2 p22 = (P2) rVar;
            C1759x1 c1759x1 = (C1759x1) p22.f17508b;
            c1759x1.getClass();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = (HashMap) c1759x1.f17926c;
            Iterator it = hashMap2.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    num = null;
                    break;
                } else {
                    num = (Integer) it.next();
                    if (hashMap2.get(num) == ((AbstractC0331j) p22.f17509c)) {
                        break;
                    }
                }
            }
            hashMap.put("adId", num);
            hashMap.put("eventName", "onPaidEvent");
            hashMap.put("valueMicros", Long.valueOf(zztVar.f10783d));
            hashMap.put("precision", Integer.valueOf(i7));
            hashMap.put("currencyCode", zztVar.f10782c);
            c1759x1.Q(hashMap);
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
            boolean zzf = zzf();
            parcel2.writeNoException();
            int i9 = zzaxp.zza;
            parcel2.writeInt(zzf ? 1 : 0);
        }
        return true;
    }

    @Override // F2.InterfaceC0265y0
    public final boolean zzf() {
        return this.f2668a == null;
    }
}
