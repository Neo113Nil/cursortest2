package p155w1;

import D1.a;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p031e1.k;
import p136t.e;

/* JADX INFO: loaded from: classes.dex */
public final class R1 extends C2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f17529f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f17530e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ R1(a aVar, int i7) {
        super(aVar);
        this.f17530e = i7;
    }

    public static HashMap c(String str) {
        return k.m("value", str);
    }

    public static R1 d(int i7) {
        String str;
        int iE = e.e(i7);
        r2 r2Var = new r2(2, (byte) 0);
        r2Var.f17848c = iE;
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
        r2Var.f17849d = str;
        return new R1(r2Var, 21);
    }

    public static void e(ArrayList arrayList) {
        if (arrayList.size() == 0) {
            AbstractC0997i0.o(2, "Variant list is empty, do not send the frame.");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            B0 b7 = (B0) it.next();
            arrayList2.add(new V1(b7.f17290b, b7.f17291c));
        }
        S1 s7 = new S1();
        s7.f17537d = new ArrayList(arrayList2);
        C1050x1.z().A(new R1(s7, 2));
    }

    public static void f() {
        String str;
        String strB = C1017n0.a().b();
        String str2 = (String) C1017n0.a().f17811b;
        String str3 = "";
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        String strValueOf = String.valueOf(AbstractC0998i1.m(AbstractC0998i1.f17749c));
        PackageInfo packageInfoJ = AbstractC0998i1.j(AbstractC0998i1.f17749c);
        if (packageInfoJ != null && (str = packageInfoJ.packageName) != null) {
            str3 = str;
        }
        C1050x1.z().A(new R1(new C1015m2(strB, str2, strValueOf, str3), 14));
    }

    @Override // p155w1.C2
    public final D2 a() {
        switch (this.f17530e) {
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
