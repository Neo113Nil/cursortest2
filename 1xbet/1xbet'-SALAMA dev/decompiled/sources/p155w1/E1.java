package p155w1;

import com.flurry.android.marketing.messaging.notification.b;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import p136t.e;

/* JADX INFO: loaded from: classes.dex */
public final class E1 extends H1 {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final D2[] f17366G = {D2.SESSION_INFO, D2.APP_INFO, D2.REPORTED_ID, D2.DEVICE_PROPERTIES, D2.NOTIFICATION, D2.REFERRER, D2.LAUNCH_OPTIONS, D2.CONSENT, D2.APP_STATE, D2.NETWORK, D2.LOCALE, D2.TIMEZONE, D2.APP_ORIENTATION, D2.DYNAMIC_SESSION_INFO, D2.LOCATION, D2.USER_ID, D2.BIRTHDATE, D2.GENDER};

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final D2[] f17367H = {D2.ORIGIN_ATTRIBUTE};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ int f17368D = 1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Object f17369E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public AbstractMap f17370F;

    public /* synthetic */ E1(H1 h6) {
        super(h6);
    }

    public static void m(C1049x0 c1049x0, C2 c3) {
        String str;
        c3.getClass();
        if (e.b(c1049x0.f17927b, 5)) {
            return;
        }
        HashMap map = new HashMap();
        switch (c1049x0.f17927b) {
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
        map.put("fl.drop.reason", str);
        map.put("fl.drop.frame.type", String.valueOf(c3.a()));
    }

    @Override // p155w1.H1
    public final void i(C2 c3) {
        switch (this.f17368D) {
            case 0:
                d(new b(19, this, c3));
                break;
            default:
                d(new b(15, this, c3));
                break;
        }
    }

    public E1(E1 e7) {
        super(e7);
        this.f17370F = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.f17369E = arrayList;
        arrayList.add(new J1());
        I1 i7 = new I1();
        i7.f17421m = 0;
        arrayList.add(i7);
        arrayList.add(new L1());
        arrayList.add(new M1());
        arrayList.add(new N1());
    }
}
