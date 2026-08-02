package ag;

import ag.g;
import android.location.Criteria;
import android.location.LocationListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes10.dex */
public final class d<T> implements InterfaceC5020b {

    /* renamed from: a, reason: collision with root package name */
    private final g f36766a;

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap f36767b;

    public d(g gVar) {
        this.f36766a = gVar;
    }

    @Override // ag.InterfaceC5020b
    public final void a(@NonNull c<f> cVar) {
        ConcurrentHashMap concurrentHashMap = this.f36767b;
        Object remove = concurrentHashMap != null ? concurrentHashMap.remove(cVar) : null;
        g gVar = this.f36766a;
        LocationListener locationListener = (LocationListener) remove;
        if (locationListener != null) {
            gVar.f36764a.removeUpdates(locationListener);
        }
    }

    @Override // ag.InterfaceC5020b
    public final void b(@NonNull e eVar, @NonNull c<f> cVar, Looper looper) throws SecurityException {
        String str;
        if (this.f36767b == null) {
            this.f36767b = new ConcurrentHashMap();
        }
        Object obj = this.f36767b.get(cVar);
        g gVar = this.f36766a;
        if (obj == null) {
            obj = new g.a(cVar);
        }
        this.f36767b.put(cVar, obj);
        if (looper == null) {
            looper = Looper.getMainLooper();
        }
        Looper looper2 = looper;
        LocationListener locationListener = (LocationListener) obj;
        int c11 = eVar.c();
        if (c11 != 3) {
            Criteria criteria = new Criteria();
            criteria.setAccuracy((c11 == 0 || c11 == 1) ? 1 : 2);
            criteria.setCostAllowed(true);
            criteria.setPowerRequirement(c11 != 0 ? c11 != 1 ? 1 : 2 : 3);
            str = gVar.f36764a.getBestProvider(criteria, true);
        } else {
            str = null;
        }
        if (str == null) {
            str = "passive";
        }
        String str2 = str;
        gVar.f36765b = str2;
        gVar.f36764a.requestLocationUpdates(str2, eVar.b(), eVar.a(), locationListener, looper2);
        int c12 = eVar.c();
        if ((c12 == 0 || c12 == 1) && gVar.f36765b.equals("gps")) {
            try {
                gVar.f36764a.requestLocationUpdates("network", eVar.b(), eVar.a(), locationListener, looper2);
            } catch (IllegalArgumentException e11) {
                e11.printStackTrace();
            }
        }
    }
}
