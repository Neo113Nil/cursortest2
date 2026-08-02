package w1;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class E1 extends H1 {

    /* renamed from: G, reason: collision with root package name */
    public static final D2[] f17360G = {D2.SESSION_INFO, D2.APP_INFO, D2.REPORTED_ID, D2.DEVICE_PROPERTIES, D2.NOTIFICATION, D2.REFERRER, D2.LAUNCH_OPTIONS, D2.CONSENT, D2.APP_STATE, D2.NETWORK, D2.LOCALE, D2.TIMEZONE, D2.APP_ORIENTATION, D2.DYNAMIC_SESSION_INFO, D2.LOCATION, D2.USER_ID, D2.BIRTHDATE, D2.GENDER};

    /* renamed from: H, reason: collision with root package name */
    public static final D2[] f17361H = {D2.ORIGIN_ATTRIBUTE};

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ int f17362D = 1;

    /* renamed from: E, reason: collision with root package name */
    public Object f17363E;

    /* renamed from: F, reason: collision with root package name */
    public AbstractMap f17364F;

    public /* synthetic */ E1(H1 h12) {
        super(h12);
    }

    public static void m(C1758x0 c1758x0, C2 c22) {
        String str;
        c22.getClass();
        if (t.e.b(c1758x0.f17921b, 5)) {
            return;
        }
        HashMap hashMap = new HashMap();
        switch (c1758x0.f17921b) {
            case 1:
                str = "DoNotDrop";
                break;
            case 2:
                str = "Unique Event Name exceeded";
                break;
            case 3:
                str = "Invalid Event Name";
                break;
            case 4:
                str = "Events count exceeded";
                break;
            case 5:
                str = "Standard events count exceeded";
                break;
            case 6:
                str = "End Timed Event but Start not found";
                break;
            case 7:
                str = "reason unknown";
                break;
            case 8:
                str = "Error count exceeded";
                break;
            case 9:
                str = "Origins count exceeded";
                break;
            case 10:
                str = "Session properties count exceeded";
                break;
            case 11:
                str = "Invalid User Properties Key";
                break;
            case 12:
                str = "User Properties count exceeded";
                break;
            case 13:
                str = "Unique User Properties Key exceeded";
                break;
            default:
                throw null;
        }
        hashMap.put("fl.drop.reason", str);
        hashMap.put("fl.drop.frame.type", String.valueOf(c22.a()));
    }

    @Override // w1.H1
    public final void i(C2 c22) {
        switch (this.f17362D) {
            case 0:
                d(new com.flurry.android.marketing.messaging.notification.b(19, this, c22));
                break;
            default:
                d(new com.flurry.android.marketing.messaging.notification.b(15, this, c22));
                break;
        }
    }

    public E1(E1 e12) {
        super(e12);
        this.f17364F = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.f17363E = arrayList;
        arrayList.add(new J1());
        I1 i12 = new I1();
        i12.f17415m = 0;
        arrayList.add(i12);
        arrayList.add(new L1());
        arrayList.add(new M1());
        arrayList.add(new N1());
    }
}
