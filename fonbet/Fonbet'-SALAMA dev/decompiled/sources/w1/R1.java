package w1;

import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class R1 extends C2 {

    /* renamed from: f, reason: collision with root package name */
    public static int f17523f;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17524e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ R1(D1.a aVar, int i7) {
        super(aVar);
        this.f17524e = i7;
    }

    public static HashMap c(String str) {
        return e1.k.m("value", str);
    }

    public static R1 d(int i7) {
        String str;
        int e7 = t.e.e(i7);
        r2 r2Var = new r2(2, (byte) 0);
        r2Var.f17842c = e7;
        switch (i7) {
            case 1:
                str = "DO_NOT_FLUSH";
                break;
            case 2:
                str = "Sticky set is complete";
                break;
            case 3:
                str = "App State has changed";
                break;
            case 4:
                str = "Session Finalized";
                break;
            case 5:
                str = "App crashed";
                break;
            case 6:
                str = "Force to Flush";
                break;
            case 7:
                str = "App Started";
                break;
            case 8:
                str = "Push Token Refreshed";
                break;
            case 9:
                str = "Delete Data";
                break;
            default:
                throw null;
        }
        r2Var.f17843d = str;
        return new R1(r2Var, 21);
    }

    public static void e(ArrayList arrayList) {
        if (arrayList.size() == 0) {
            AbstractC1706i0.o(2, "Variant list is empty, do not send the frame.");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new V1(r1.f17284b, ((B0) it.next()).f17285c));
        }
        S1 s12 = new S1();
        s12.f17531d = new ArrayList(arrayList2);
        C1759x1.z().A(new R1(s12, 2));
    }

    public static void f() {
        String str;
        String b7 = C1726n0.a().b();
        String str2 = (String) C1726n0.a().f17805b;
        String str3 = "";
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        String valueOf = String.valueOf(AbstractC1707i1.m(AbstractC1707i1.f17743c));
        PackageInfo j = AbstractC1707i1.j(AbstractC1707i1.f17743c);
        if (j != null && (str = j.packageName) != null) {
            str3 = str;
        }
        C1759x1.z().A(new R1(new C1724m2(b7, str2, valueOf, str3), 14));
    }

    @Override // w1.C2
    public final D2 a() {
        switch (this.f17524e) {
            case 0:
                return D2.BIRTHDATE;
            case 1:
                return D2.CCPA_DELETION;
            case 2:
                return D2.VARIANT_IDS;
            case 3:
                return D2.EVENTS_SUMMARY;
            case 4:
                return D2.GENDER;
            case 5:
                return D2.LOCALE;
            case 6:
                return D2.NETWORK;
            case 7:
                return D2.NUM_ERRORS;
            case 8:
                return D2.REPORTING;
            case 9:
                return D2.SESSION_ORIGIN;
            case 10:
                return D2.SESSION_PROPERTIES_PARAMS;
            case 11:
                return D2.SESSION_PROPERTIES;
            case 12:
                return D2.TIMEZONE;
            case 13:
                return D2.USER_ID;
            case 14:
                return D2.APP_INFO;
            case 15:
                return D2.APP_ORIENTATION;
            case 16:
                return D2.APP_STATE;
            case 17:
                return D2.CCPA_OPTOUT;
            case 18:
                return D2.CONSENT;
            case 19:
                return D2.DEVICE_PROPERTIES;
            case 20:
                return D2.DYNAMIC_SESSION_INFO;
            case zzbbd.zzt.zzm /* 21 */:
                return D2.FLUSH_FRAME;
            case 22:
                return D2.FRAME_COUNTER;
            case 23:
                return D2.LAUNCH_OPTIONS;
            case 24:
                return D2.LOCATION;
            case 25:
                return D2.NOTIFICATION;
            case 26:
                return D2.ORIGIN_ATTRIBUTE;
            case 27:
                return D2.PREVIOUS_SUCCESSFUL_REPORT;
            case 28:
                return D2.REFERRER;
            default:
                return D2.REPORTED_ID;
        }
    }
}
