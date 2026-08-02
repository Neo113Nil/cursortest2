package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class an0 implements r60, lx0, mn0, InterfaceC0464mb, y01, ou0, lu0, hu0, xp1, InterfaceC0350j8, nb1 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f253j;

    /* JADX INFO: renamed from: k */
    public Object f254k;

    public an0(Context context) {
        boolean zIsEmpty;
        this.f253j = 8;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f254k = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public static an0 m299B(String str) {
        return new an0(16, (TextUtils.isEmpty(str) || str.length() > 1) ? h12.f3002k : l12.m3152e(str.charAt(0)));
    }

    /* JADX INFO: renamed from: u */
    public static boolean m300u(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    /* JADX INFO: renamed from: x */
    public static String m301x(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    /* JADX INFO: renamed from: A */
    public void m302A(long j, long j2) {
        s52 s52Var = (s52) this.f254k;
        s52Var.mo11z();
        s52Var.m4484E();
        f02 f02Var = (f02) s52Var.f7192j;
        fz1 fz1Var = f02Var.f2246n;
        f02.m1558k(fz1Var);
        if (fz1Var.m1913J(j)) {
            f02.m1558k(fz1Var);
            fz1Var.f2558u.m5853b(true);
            f02Var.m1575r().m5218F();
        }
        f02.m1558k(fz1Var);
        fz1Var.f2562y.m822b(j);
        if (fz1Var.f2558u.m5852a()) {
            m303C(j, j2);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m303C(long j, long j2) {
        s52 s52Var = (s52) this.f254k;
        s52Var.mo11z();
        f02 f02Var = (f02) s52Var.f7192j;
        if (f02Var.m1565d()) {
            fz1 fz1Var = f02Var.f2246n;
            f02.m1558k(fz1Var);
            fz1Var.f2562y.m822b(j);
            f02Var.f2252t.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4608w.m5313b(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j3 = j / 1000;
            Long lValueOf = Long.valueOf(j3);
            v22 v22Var = f02Var.f2254v;
            f02.m1559l(v22Var);
            v22Var.m5030L(j, lValueOf, "auto", "_sid");
            f02.m1558k(fz1Var);
            fz1Var.f2563z.m822b(j3);
            fz1Var.f2558u.m5853b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j3);
            f02.m1559l(v22Var);
            v22Var.m5027I(j, j2, bundle, "auto", "_s");
            String strM5181l = fz1Var.f2545E.m5181l();
            if (TextUtils.isEmpty(strM5181l)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strM5181l);
            f02.m1559l(v22Var);
            v22Var.m5027I(j, j2, bundle2, "auto", "_ssr");
        }
    }

    @Override // p000.xp1
    /* JADX INFO: renamed from: E */
    public gq1 mo304E(Class cls) {
        for (int i = 0; i < 2; i++) {
            xp1 xp1Var = ((xp1[]) this.f254k)[i];
            if (xp1Var.mo320r(cls)) {
                return xp1Var.mo304E(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // p000.InterfaceC0464mb
    /* JADX INFO: renamed from: a */
    public void mo305a(int i) {
        ((j90) this.f254k).mo1440a(i);
    }

    @Override // p000.y01
    public void accept(Object obj, Object obj2) {
        qc1 qc1Var = (qc1) obj2;
        switch (this.f253j) {
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                wl1 wl1Var = (wl1) ((bl1) obj).m3890l();
                al1 al1Var = (al1) this.f254k;
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(wl1Var.f9319d);
                int i = il1.f3610a;
                parcelObtain.writeInt(1);
                al1Var.writeToParcel(parcelObtain, 0);
                try {
                    wl1Var.f9318c.transact(1, parcelObtain, null, 1);
                    parcelObtain.recycle();
                    qc1Var.m4061b(null);
                    return;
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            default:
                f22 f22Var = (f22) ((h22) obj).m3890l();
                w12 w12Var = new w12((e22) this.f254k, qc1Var);
                Parcel parcelM5810d = f22Var.m5810d();
                iu1.m2703c(parcelM5810d, w12Var);
                f22Var.m5806F(parcelM5810d, 27);
                return;
        }
    }

    @Override // p000.r60
    public Object apply(Object obj) {
        return ((wa0) ((om0) this.f254k).f5789l).apply(new Object[]{obj});
    }

    @Override // p000.ou0
    /* JADX INFO: renamed from: b */
    public void mo306b(Object obj) {
        ((CountDownLatch) this.f254k).countDown();
    }

    @Override // p000.hu0
    /* JADX INFO: renamed from: c */
    public void mo307c() {
        ((CountDownLatch) this.f254k).countDown();
    }

    @Override // p000.InterfaceC0350j8
    public ListenableFuture call() {
        switch (this.f253j) {
            case 20:
                ve1 ve1Var = new ve1((Callable) this.f254k);
                EnumC0113ct.f1449j.execute(ve1Var);
                return ve1Var;
            default:
                e92 e92Var = (e92) this.f254k;
                c92 c92Var = new c92(e92Var, 3);
                int i = ja2.f3889a;
                return k70.m2994e(k70.m2996g(e92Var.f2021b, new n72(4, s92.m4509a(), c92Var), e92Var.f2023d));
        }
    }

    @Override // p000.InterfaceC0464mb
    /* JADX INFO: renamed from: d */
    public void mo308d() {
        ((j90) this.f254k).mo1443d();
    }

    @Override // p000.lu0
    /* JADX INFO: renamed from: e */
    public void mo309e(Exception exc) {
        ((CountDownLatch) this.f254k).countDown();
    }

    /* JADX INFO: renamed from: f */
    public boolean m310f(String str) {
        String strM321s = m321s(str);
        return "1".equals(strM321s) || Boolean.parseBoolean(strM321s);
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public boolean mo311g(on0 on0Var, MenuItem menuItem) {
        return false;
    }

    @Override // p000.nb1
    public Object get() {
        switch (this.f253j) {
            case 21:
                Context context = (Context) ((C0902y5) this.f254k).f9154a;
                Object obj = x22.f8759j;
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                    applicationInfo.getClass();
                    return new cx0(applicationInfo);
                } catch (PackageManager.NameNotFoundException unused) {
                    return C0268h.f2972j;
                }
            default:
                mq0 mq0Var = (mq0) ((nb1) this.f254k).get();
                mq0Var.getClass();
                ve1 ve1Var = new ve1(k51.f4289l);
                return new kq0(ve1Var, mq0Var.f5130k.schedule(ve1Var, 10000L, TimeUnit.MILLISECONDS));
        }
    }

    /* JADX INFO: renamed from: h */
    public Integer m312h(String str) {
        String strM321s = m321s(str);
        if (TextUtils.isEmpty(strM321s)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strM321s));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m301x(str) + "(" + strM321s + ") into an int");
            return null;
        }
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: i */
    public void mo313i(on0 on0Var) {
        Toolbar toolbar = (Toolbar) this.f254k;
        C0603q2 c0603q2 = toolbar.f442j.f392C;
        if (c0603q2 == null || !c0603q2.m4027i()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.f431P.f6472l).iterator();
            while (it.hasNext()) {
                ((m50) it.next()).f4977a.m4740t();
            }
        }
    }

    @Override // p000.lx0
    /* JADX INFO: renamed from: j */
    public void mo161j() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // p000.lx0
    /* JADX INFO: renamed from: k */
    public void mo162k(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f254k).setResultCode(i);
    }

    /* JADX INFO: renamed from: l */
    public JSONArray m314l(String str) {
        String strM321s = m321s(str);
        if (TextUtils.isEmpty(strM321s)) {
            return null;
        }
        try {
            return new JSONArray(strM321s);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + m301x(str) + ": " + strM321s + ", falling back to default");
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public int[] m315m() {
        JSONArray jSONArrayM314l = m314l("gcm.n.light_settings");
        if (jSONArrayM314l == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayM314l.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayM314l.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayM314l.optInt(1);
            iArr[2] = jSONArrayM314l.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayM314l + ". " + e.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayM314l + ". Skipping setting LightSettings");
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    public Object[] m316n(String str) {
        JSONArray jSONArrayM314l = m314l(str.concat("_loc_args"));
        if (jSONArrayM314l == null) {
            return null;
        }
        int length = jSONArrayM314l.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArrayM314l.optString(i);
        }
        return strArr;
    }

    /* JADX INFO: renamed from: o */
    public String m317o(String str) {
        return m321s(str.concat("_loc_key"));
    }

    /* JADX INFO: renamed from: p */
    public Long m318p() {
        String strM321s = m321s("gcm.n.event_time");
        if (TextUtils.isEmpty(strM321s)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strM321s));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m301x("gcm.n.event_time") + "(" + strM321s + ") into a long");
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public String m319q(Resources resources, String str, String str2) {
        String strM321s = m321s(str2);
        if (!TextUtils.isEmpty(strM321s)) {
            return strM321s;
        }
        String strM317o = m317o(str2);
        if (TextUtils.isEmpty(strM317o)) {
            return null;
        }
        int identifier = resources.getIdentifier(strM317o, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", m301x(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] objArrM316n = m316n(str2);
        if (objArrM316n == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrM316n);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + m301x(str2) + ": " + Arrays.toString(objArrM316n) + " Default value will be used.", e);
            return null;
        }
    }

    @Override // p000.xp1
    /* JADX INFO: renamed from: r */
    public boolean mo320r(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((xp1[]) this.f254k)[i].mo320r(cls)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public String m321s(String str) {
        Bundle bundle = (Bundle) this.f254k;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    /* JADX INFO: renamed from: t */
    public long[] m322t() {
        JSONArray jSONArrayM314l = m314l("gcm.n.vibrate_timings");
        if (jSONArrayM314l == null) {
            return null;
        }
        try {
            if (jSONArrayM314l.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayM314l.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = jSONArrayM314l.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayM314l + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    /* JADX INFO: renamed from: v */
    public InputStream m323v() {
        InputStream inputStream = (InputStream) this.f254k;
        this.f254k = null;
        return inputStream;
    }

    /* JADX INFO: renamed from: w */
    public Bundle m324w() {
        Bundle bundle = (Bundle) this.f254k;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: y */
    public void m325y() {
        s52 s52Var = (s52) this.f254k;
        s52Var.mo11z();
        f02 f02Var = (f02) s52Var.f7192j;
        fz1 fz1Var = f02Var.f2246n;
        f02.m1558k(fz1Var);
        f02Var.f2252t.getClass();
        if (fz1Var.m1913J(System.currentTimeMillis())) {
            fz1 fz1Var2 = f02Var.f2246n;
            f02.m1558k(fz1Var2);
            fz1Var2.f2558u.m5853b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                ky1 ky1Var = f02Var.f2247o;
                f02.m1560m(ky1Var);
                ky1Var.f4608w.m5312a("Detected application was in foreground");
                m303C(System.currentTimeMillis(), f02Var.f2245m.m770L(null, jx1.f4178e1) ? SystemClock.elapsedRealtime() : 0L);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public void m326z(int i, String str, List list, boolean z, boolean z2) {
        wc1 wc1Var;
        sz1 sz1Var = (sz1) this.f254k;
        int i2 = i - 1;
        if (i2 == 0) {
            ky1 ky1Var = ((f02) sz1Var.f7192j).f2247o;
            f02.m1560m(ky1Var);
            wc1Var = ky1Var.f4607v;
        } else if (i2 != 1) {
            if (i2 == 3) {
                ky1 ky1Var2 = ((f02) sz1Var.f7192j).f2247o;
                f02.m1560m(ky1Var2);
                wc1Var = ky1Var2.f4608w;
            } else if (i2 != 4) {
                ky1 ky1Var3 = ((f02) sz1Var.f7192j).f2247o;
                f02.m1560m(ky1Var3);
                wc1Var = ky1Var3.f4606u;
            } else if (z) {
                ky1 ky1Var4 = ((f02) sz1Var.f7192j).f2247o;
                f02.m1560m(ky1Var4);
                wc1Var = ky1Var4.f4604s;
            } else if (z2) {
                ky1 ky1Var5 = ((f02) sz1Var.f7192j).f2247o;
                f02.m1560m(ky1Var5);
                wc1Var = ky1Var5.f4603r;
            } else {
                ky1 ky1Var6 = ((f02) sz1Var.f7192j).f2247o;
                f02.m1560m(ky1Var6);
                wc1Var = ky1Var6.f4605t;
            }
        } else if (z) {
            ky1 ky1Var7 = ((f02) sz1Var.f7192j).f2247o;
            f02.m1560m(ky1Var7);
            wc1Var = ky1Var7.f4601p;
        } else if (z2) {
            ky1 ky1Var8 = ((f02) sz1Var.f7192j).f2247o;
            f02.m1560m(ky1Var8);
            wc1Var = ky1Var8.f4600o;
        } else {
            ky1 ky1Var9 = ((f02) sz1Var.f7192j).f2247o;
            f02.m1560m(ky1Var9);
            wc1Var = ky1Var9.f4602q;
        }
        int size = list.size();
        if (size == 1) {
            wc1Var.m5313b(list.get(0), str);
            return;
        }
        if (size == 2) {
            wc1Var.m5314c(list.get(0), list.get(1), str);
        } else if (size != 3) {
            wc1Var.m5312a(str);
        } else {
            wc1Var.m5315d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public /* synthetic */ an0(int i, boolean z) {
        this.f253j = i;
    }

    public an0(w12 w12Var, byte[] bArr) {
        this.f253j = 18;
        this.f254k = bArr;
    }

    public /* synthetic */ an0(int i, Object obj) {
        this.f253j = i;
        this.f254k = obj;
    }

    public an0(Bundle bundle) {
        this.f253j = 3;
        if (bundle != null) {
            this.f254k = new Bundle(bundle);
        } else {
            C0270h1.m2192h("data");
            throw null;
        }
    }

    public an0(int i) {
        this.f253j = i;
        switch (i) {
            case 14:
                this.f254k = new CountDownLatch(1);
                break;
            case 24:
                this.f254k = new ConcurrentHashMap();
                break;
            default:
                this.f254k = new AtomicLong();
                break;
        }
    }
}
