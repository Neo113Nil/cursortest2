package p155w1;

import android.content.pm.PackageInfo;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.common.internal.w;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: w1.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1054z extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f17945b;

    public /* synthetic */ C1054z(C c3, int i7) {
        this.f17944a = i7;
        this.f17945b = c3;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        byte[] bArrS;
        String strConcat;
        String str;
        boolean z4;
        switch (this.f17944a) {
            case 0:
                this.f17945b.f17304B.i();
                break;
            case 1:
                Collections.emptyMap();
                C c3 = this.f17945b;
                c3.getClass();
                c3.d(new C1054z(c3, 2));
                break;
            default:
                C c4 = this.f17945b;
                c4.f17307E.set(false);
                c4.f17304B.i();
                try {
                    C1048x c1048x = c4.f17306D;
                    String strK = AbstractC0998i1.k("advertising_id", null);
                    try {
                        z4 = AbstractC0998i1.f17749c.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).getBoolean("com.flurry.sdk.".concat("ad_tracking_enabled"), false);
                    } catch (Throwable unused) {
                        z4 = false;
                    }
                    boolean z7 = !z4;
                    if (strK != null) {
                        c1048x.f17923z = strK;
                        c1048x.f17921A = z7;
                    } else {
                        c1048x.h();
                    }
                    C1048x c1048x2 = c4.f17306D;
                    String str2 = c1048x2.f17923z;
                    boolean z8 = c1048x2.f17921A;
                    if (!TextUtils.isEmpty(str2)) {
                        c4.f17303A.f17387a.put(H.AndroidAdvertisingId, str2);
                        c4.f17303A.f17388b = z8;
                    }
                    if (!c4.f17306D.f17922B.get()) {
                        c4.d(new A(this, z8, str2));
                    }
                } catch (Exception e7) {
                    e7.getLocalizedMessage();
                    AbstractC0997i0.j("Error fetching Ad Id", "Exception happened during fetching Ad Id", e7);
                }
                try {
                    boolean zIsEmpty = TextUtils.isEmpty(c4.f17306D.f17923z);
                    H h6 = H.DeviceId;
                    if (!zIsEmpty || (H2.a().f17403a.f17538A && (AbstractC0997i0.l("android.permission.ACCESS_FINE_LOCATION") || AbstractC0997i0.l("android.permission.ACCESS_COARSE_LOCATION")))) {
                        c4.f17303A.f17387a.remove(h6);
                    } else {
                        w wVar = c4.f17305C;
                        if (TextUtils.isEmpty((String) wVar.f11335b)) {
                            String string = Settings.Secure.getString(AbstractC0998i1.f17749c.getContentResolver(), "android_id");
                            strConcat = (string == null || ((Set) wVar.f11336c).contains(string.toLowerCase(Locale.US))) ? null : "AND".concat(string);
                            if (TextUtils.isEmpty(strConcat)) {
                                String strL = w.l();
                                if (TextUtils.isEmpty(strL)) {
                                    strL = w.u();
                                    if (TextUtils.isEmpty(strL)) {
                                        long jDoubleToLongBits = Double.doubleToLongBits(new SecureRandom().nextDouble());
                                        long jNanoTime = System.nanoTime();
                                        PackageInfo packageInfoJ = AbstractC0998i1.j(AbstractC0998i1.f17749c);
                                        if (packageInfoJ == null || (str = packageInfoJ.packageName) == null) {
                                            str = "";
                                        }
                                        int length = str.length();
                                        long jCharAt = 1125899906842597L;
                                        for (int i7 = 0; i7 < length; i7++) {
                                            jCharAt = (jCharAt * 31) + ((long) str.charAt(i7));
                                        }
                                        strL = "ID" + Long.toString((((jCharAt * 37) + jNanoTime) * 37) + jDoubleToLongBits, 16);
                                    }
                                    w.o(strL);
                                }
                                wVar.f11335b = strL;
                                strConcat = (String) wVar.f11335b;
                            }
                        } else {
                            strConcat = (String) wVar.f11335b;
                        }
                        if (strConcat != null) {
                            c4.f17303A.f17387a.put(h6, strConcat);
                        }
                    }
                } catch (Exception e8) {
                    e8.getLocalizedMessage();
                    AbstractC0997i0.j("Error fetching Device Id", "Exception happened during fetching Device Id", e8);
                }
                try {
                    F0 f7 = c4.f17304B;
                    byte[] bArrQ = (byte[]) f7.f17380c;
                    if (bArrQ == null) {
                        bArrQ = f7.q(f7.s());
                        if (bArrQ == null) {
                            String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.ENGLISH);
                            if (TextUtils.isEmpty(lowerCase)) {
                                bArrS = null;
                            } else {
                                String strReplaceAll = lowerCase.replaceAll("[^a-f0-9]+", "");
                                if (strReplaceAll.length() % 2 != 0) {
                                    "Input string must contain an even number of characters ".concat(strReplaceAll);
                                    bArrS = null;
                                } else {
                                    bArrS = AbstractC0997i0.s(strReplaceAll);
                                }
                            }
                            f7.o(bArrS);
                            bArrQ = bArrS;
                        }
                        f7.f17380c = bArrQ;
                    }
                    if (bArrQ != null) {
                        c4.f17303A.f17387a.put(H.AndroidInstallationId, Base64.encodeToString(bArrQ, 2));
                    }
                } catch (Exception e9) {
                    e9.getLocalizedMessage();
                    AbstractC0997i0.j("Error fetching Install Id", "Exception happened during fetching Install Id", e9);
                }
                c4.f17307E.set(true);
                if (c4.j()) {
                    G g3 = c4.f17303A;
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(g3.f17387a);
                    boolean z9 = g3.f17388b;
                    G g7 = new G();
                    g7.f17387a = mapUnmodifiableMap;
                    g7.f17388b = z9;
                    c4.h(g7);
                }
                break;
        }
    }
}
