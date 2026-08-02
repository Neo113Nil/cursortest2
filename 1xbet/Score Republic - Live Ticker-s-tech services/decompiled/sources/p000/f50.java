package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.zhuinden.fragmentviewbindingdelegatekt.FragmentViewBindingDelegate$1;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import live.football.scorerepublic.WebViewFragment;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class f50 implements InterfaceC0581ph, InterfaceC0507nh, xm0, c81 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2312j;

    /* JADX INFO: renamed from: k */
    public Object f2313k;

    /* JADX INFO: renamed from: l */
    public Object f2314l;

    public f50(an0 an0Var) {
        this.f2312j = 21;
        this.f2313k = an0Var.m321s("gcm.n.title");
        an0Var.m317o("gcm.n.title");
        Object[] objArrM316n = an0Var.m316n("gcm.n.title");
        if (objArrM316n != null) {
            String[] strArr = new String[objArrM316n.length];
            for (int i = 0; i < objArrM316n.length; i++) {
                strArr[i] = String.valueOf(objArrM316n[i]);
            }
        }
        this.f2314l = an0Var.m321s("gcm.n.body");
        an0Var.m317o("gcm.n.body");
        Object[] objArrM316n2 = an0Var.m316n("gcm.n.body");
        if (objArrM316n2 != null) {
            String[] strArr2 = new String[objArrM316n2.length];
            for (int i2 = 0; i2 < objArrM316n2.length; i2++) {
                strArr2[i2] = String.valueOf(objArrM316n2[i2]);
            }
        }
        an0Var.m321s("gcm.n.icon");
        if (TextUtils.isEmpty(an0Var.m321s("gcm.n.sound2"))) {
            an0Var.m321s("gcm.n.sound");
        }
        an0Var.m321s("gcm.n.tag");
        an0Var.m321s("gcm.n.color");
        an0Var.m321s("gcm.n.click_action");
        an0Var.m321s("gcm.n.android_channel_id");
        String strM321s = an0Var.m321s("gcm.n.link_android");
        strM321s = TextUtils.isEmpty(strM321s) ? an0Var.m321s("gcm.n.link") : strM321s;
        if (!TextUtils.isEmpty(strM321s)) {
            Uri.parse(strM321s);
        }
        an0Var.m321s("gcm.n.image");
        an0Var.m321s("gcm.n.ticker");
        an0Var.m312h("gcm.n.notification_priority");
        an0Var.m312h("gcm.n.visibility");
        an0Var.m312h("gcm.n.notification_count");
        an0Var.m310f("gcm.n.sticky");
        an0Var.m310f("gcm.n.local_only");
        an0Var.m310f("gcm.n.default_sound");
        an0Var.m310f("gcm.n.default_vibrate_timings");
        an0Var.m310f("gcm.n.default_light_settings");
        an0Var.m318p();
        an0Var.m315m();
        an0Var.m322t();
    }

    /* JADX INFO: renamed from: a0 */
    public static String m1597a0(C0539oc c0539oc) {
        long j = c0539oc.f5698k;
        if (j <= 64) {
            return c0539oc.m3675p().mo2557c();
        }
        return c0539oc.m3676q((int) Math.min(j, 64L)).mo2557c() + "...";
    }

    /* JADX INFO: renamed from: A */
    public void m1598A(c50 c50Var, Bundle bundle, boolean z) {
        c50Var.getClass();
        c50 c50Var2 = ((t50) this.f2313k).f7321y;
        if (c50Var2 != null) {
            c50Var2.m868j().f7311o.m1598A(c50Var, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2314l).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                dd0.m1158c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public void m1599B(c50 c50Var, boolean z) {
        c50Var.getClass();
        c50 c50Var2 = ((t50) this.f2313k).f7321y;
        if (c50Var2 != null) {
            c50Var2.m868j().f7311o.m1599B(c50Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2314l).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                dd0.m1158c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // p000.ra1
    /* JADX INFO: renamed from: C */
    public void mo1600C() {
        ((InterfaceC0507nh) this.f2313k).mo1600C();
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: D */
    public void mo1601D() {
        ((InterfaceC0507nh) this.f2313k).mo1601D();
    }

    /* JADX INFO: renamed from: E */
    public void m1602E(c50 c50Var, boolean z) {
        c50Var.getClass();
        c50 c50Var2 = ((t50) this.f2313k).f7321y;
        if (c50Var2 != null) {
            c50Var2.m868j().f7311o.m1602E(c50Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2314l).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                dd0.m1158c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void m1603F(c50 c50Var, View view, boolean z) {
        c50Var.getClass();
        view.getClass();
        c50 c50Var2 = ((t50) this.f2313k).f7321y;
        if (c50Var2 != null) {
            c50Var2.m868j().f7311o.m1603F(c50Var, view, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2314l).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                dd0.m1158c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: G */
    public void mo1604G(ja1 ja1Var) {
        ((InterfaceC0507nh) this.f2313k).mo1604G(ja1Var);
    }

    /* JADX INFO: renamed from: H */
    public void m1605H(c50 c50Var, boolean z) {
        c50Var.getClass();
        c50 c50Var2 = ((t50) this.f2313k).f7321y;
        if (c50Var2 != null) {
            c50Var2.m868j().f7311o.m1605H(c50Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2314l).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                dd0.m1158c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX INFO: renamed from: I */
    public CctBackendFactory m1606I(String str) {
        Bundle bundle;
        Map map;
        Object obj;
        if (((Map) this.f2314l) == null) {
            Context context = (Context) this.f2313k;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map2.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                    this.f2314l = map;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                while (r6.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                map = map3;
            }
            this.f2314l = map;
        }
        String str4 = (String) ((Map) this.f2314l).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e2);
            return null;
        } catch (InstantiationException e3) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: J */
    public Object m1607J(jw0 jw0Var) {
        HashMap map = (HashMap) this.f2314l;
        t90 t90Var = (t90) map.get(jw0Var);
        if (t90Var == null) {
            t90Var = new t90(jw0Var);
            map.put(jw0Var, t90Var);
        } else {
            jw0Var.mo2969a();
        }
        t90 t90Var2 = t90Var.f7360d;
        t90Var2.f7359c = t90Var.f7359c;
        t90Var.f7359c.f7360d = t90Var2;
        t90 t90Var3 = (t90) this.f2313k;
        t90Var.f7360d = t90Var3;
        t90 t90Var4 = t90Var3.f7359c;
        t90Var.f7359c = t90Var4;
        t90Var4.f7360d = t90Var;
        t90Var.f7360d.f7359c = t90Var;
        ArrayList arrayList = t90Var.f7358b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return t90Var.f7358b.remove(size - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public File m1608K() {
        if (((File) this.f2313k) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f2313k) == null) {
                        String str = "PersistedInstallation." + ((w00) this.f2314l).m5225c() + ".json";
                        w00 w00Var = (w00) this.f2314l;
                        w00Var.m5224a();
                        File file = new File(w00Var.f8318a.getNoBackupFilesDir(), str);
                        this.f2313k = file;
                        if (file.exists()) {
                            return (File) this.f2313k;
                        }
                        w00 w00Var2 = (w00) this.f2314l;
                        w00Var2.m5224a();
                        File file2 = new File(w00Var2.f8318a.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo((File) this.f2313k)) {
                            Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file2;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.f2313k;
    }

    /* JADX INFO: renamed from: L */
    public synchronized List m1609L(String str) {
        List arrayList;
        try {
            if (!((ArrayList) this.f2313k).contains(str)) {
                ((ArrayList) this.f2313k).add(str);
            }
            arrayList = (List) ((HashMap) this.f2314l).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((HashMap) this.f2314l).put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: M */
    public synchronized ArrayList m1610M(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.f2313k;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            List<z11> list = (List) ((HashMap) this.f2314l).get((String) obj);
            if (list != null) {
                for (z11 z11Var : list) {
                    if ((z11Var.f9572a.isAssignableFrom(cls) && cls2.isAssignableFrom(z11Var.f9573b)) && !arrayList.contains(z11Var.f9573b)) {
                        arrayList.add(z11Var.f9573b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: N */
    public String m1611N(xg0 xg0Var) {
        String str;
        synchronized (((qk0) this.f2313k)) {
            str = (String) ((qk0) this.f2313k).m4106a(xg0Var);
        }
        if (str == null) {
            q41 q41Var = (q41) ((qd0) this.f2314l).mo1367b();
            try {
                xg0Var.mo1038b(q41Var.f6373j);
                byte[] bArrDigest = q41Var.f6373j.digest();
                char[] cArr = zg1.f9756b;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b = bArrDigest[i];
                        int i2 = i * 2;
                        char[] cArr2 = zg1.f9755a;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
                ((qd0) this.f2314l).mo1366a(q41Var);
            } catch (Throwable th) {
                ((qd0) this.f2314l).mo1366a(q41Var);
                throw th;
            }
        }
        synchronized (((qk0) this.f2313k)) {
            ((qk0) this.f2313k).m4108d(xg0Var, str);
        }
        return str;
    }

    /* JADX INFO: renamed from: O */
    public void m1612O(String str, String str2) {
        ArrayList arrayList = ((C0781uw) this.f2314l).f7915j;
        if (str.isEmpty()) {
            C0270h1.m2190f("name is empty");
            return;
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 31 || cCharAt >= 127) {
                C0270h1.m2190f(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i2), str));
                return;
            }
        }
        if (str2 == null) {
            C0270h1.m2190f("value == null");
            return;
        }
        int length2 = str2.length();
        for (int i3 = 0; i3 < length2; i3++) {
            char cCharAt2 = str2.charAt(i3);
            if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                C0270h1.m2190f(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i3), str2));
                return;
            }
        }
        while (i < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
        arrayList.add(str);
        arrayList.add(str2.trim());
    }

    /* JADX INFO: renamed from: P */
    public void m1613P(C0389ka c0389ka) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c0389ka.f4322a);
            jSONObject.put("Status", AbstractC0024an.m292o(c0389ka.f4323b));
            jSONObject.put("AuthToken", c0389ka.f4324c);
            jSONObject.put("RefreshToken", c0389ka.f4325d);
            jSONObject.put("TokenCreationEpochInSecs", c0389ka.f4327f);
            jSONObject.put("ExpiresInSecs", c0389ka.f4326e);
            jSONObject.put("FisError", c0389ka.f4328g);
            w00 w00Var = (w00) this.f2314l;
            w00Var.m5224a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", w00Var.f8318a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(m1608K())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: Q */
    public boolean m1614Q() {
        return ((Logger) this.f2313k).isLoggable((Level) this.f2314l);
    }

    /* JADX INFO: renamed from: R */
    public void m1615R(int i, int i2, C0539oc c0539oc, int i3, boolean z) {
        if (m1614Q()) {
            ((Logger) this.f2313k).log((Level) this.f2314l, AbstractC0024an.m294q(i) + " DATA: streamId=" + i2 + " endStream=" + z + " length=" + i3 + " bytes=" + m1597a0(c0539oc));
        }
    }

    /* JADX INFO: renamed from: S */
    public void m1616S(int i, int i2, EnumC0227fx enumC0227fx, C0836wd c0836wd) {
        if (m1614Q()) {
            Logger logger = (Logger) this.f2313k;
            Level level = (Level) this.f2314l;
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC0024an.m294q(i));
            sb.append(" GO_AWAY: lastStreamId=");
            sb.append(i2);
            sb.append(" errorCode=");
            sb.append(enumC0227fx);
            sb.append(" length=");
            sb.append(c0836wd.mo2556b());
            sb.append(" bytes=");
            C0539oc c0539oc = new C0539oc();
            c0836wd.mo2564l(c0539oc, c0836wd.mo2556b());
            sb.append(m1597a0(c0539oc));
            logger.log(level, sb.toString());
        }
    }

    /* JADX INFO: renamed from: T */
    public void m1617T(int i, long j) {
        if (m1614Q()) {
            ((Logger) this.f2313k).log((Level) this.f2314l, AbstractC0024an.m294q(i) + " PING: ack=false bytes=" + j);
        }
    }

    /* JADX INFO: renamed from: U */
    public void m1618U(int i, int i2, EnumC0227fx enumC0227fx) {
        if (m1614Q()) {
            ((Logger) this.f2313k).log((Level) this.f2314l, AbstractC0024an.m294q(i) + " RST_STREAM: streamId=" + i2 + " errorCode=" + enumC0227fx);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m1619V(int i, C0678s3 c0678s3) {
        if (m1614Q()) {
            Logger logger = (Logger) this.f2313k;
            Level level = (Level) this.f2314l;
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC0024an.m294q(i));
            sb.append(" SETTINGS: ack=false settings=");
            EnumMap enumMap = new EnumMap(pt0.class);
            for (pt0 pt0Var : pt0.values()) {
                if (c0678s3.m4472b(pt0Var.f6253j)) {
                    enumMap.put(pt0Var, Integer.valueOf(((int[]) c0678s3.f7022k)[pt0Var.f6253j]));
                }
            }
            sb.append(enumMap.toString());
            logger.log(level, sb.toString());
        }
    }

    /* JADX INFO: renamed from: W */
    public void m1620W(int i, int i2, long j) {
        if (m1614Q()) {
            ((Logger) this.f2313k).log((Level) this.f2314l, AbstractC0024an.m294q(i) + " WINDOW_UPDATE: streamId=" + i2 + " windowSizeIncrement=" + j);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m1621X(jw0 jw0Var, Object obj) {
        HashMap map = (HashMap) this.f2314l;
        t90 t90Var = (t90) map.get(jw0Var);
        if (t90Var == null) {
            t90Var = new t90(jw0Var);
            t90Var.f7360d = t90Var;
            t90 t90Var2 = (t90) this.f2313k;
            t90Var.f7360d = t90Var2.f7360d;
            t90Var.f7359c = t90Var2;
            t90Var2.f7360d = t90Var;
            t90Var.f7360d.f7359c = t90Var;
            map.put(jw0Var, t90Var);
        } else {
            jw0Var.mo2969a();
        }
        if (t90Var.f7358b == null) {
            t90Var.f7358b = new ArrayList();
        }
        t90Var.f7358b.add(obj);
    }

    /* JADX INFO: renamed from: Y */
    public C0389ka m1622Y() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(m1608K());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = C0389ka.f4321h;
        byte b = (byte) (((byte) (0 | 2)) | 1);
        int i3 = AbstractC0024an.m298u(5)[iOptInt];
        if (i3 == 0) {
            C0270h1.m2192h("Null registrationStatus");
            return null;
        }
        byte b2 = (byte) (((byte) (b | 2)) | 1);
        if (b2 == 3 && i3 != 0) {
            return new C0389ka(strOptString, i3, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        StringBuilder sb = new StringBuilder();
        if (i3 == 0) {
            sb.append(" registrationStatus");
        }
        if ((b2 & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b2 & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        C0042ay.m531h(sb, "Missing required properties:");
        return null;
    }

    /* JADX INFO: renamed from: Z */
    public Object m1623Z() {
        t90 t90Var = (t90) this.f2313k;
        t90 t90Var2 = t90Var.f7360d;
        while (true) {
            boolean zEquals = t90Var2.equals(t90Var);
            Object obj = t90Var2.f7357a;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = t90Var2.f7358b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? t90Var2.f7358b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            t90 t90Var3 = t90Var2.f7360d;
            t90Var3.f7359c = t90Var2.f7359c;
            t90Var2.f7359c.f7360d = t90Var3;
            ((HashMap) this.f2314l).remove(obj);
            ((jw0) obj).mo2969a();
            t90Var2 = t90Var2.f7360d;
        }
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public void mo975a(InterfaceC0187eu interfaceC0187eu) {
        switch (this.f2312j) {
            case 10:
                EnumC0262gu.m2149e((C0546oj) this.f2314l, interfaceC0187eu);
                break;
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                EnumC0262gu.m2149e((C0251gj) this.f2314l, interfaceC0187eu);
                break;
            case 26:
                EnumC0262gu.m2148d((C0251gj) this.f2313k, interfaceC0187eu);
                break;
            default:
                ((c81) this.f2313k).mo77a(interfaceC0187eu);
                break;
        }
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: b */
    public void mo976b(Object obj) {
        switch (this.f2312j) {
            case 10:
                ((xm0) this.f2313k).mo976b(obj);
                break;
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                ((xm0) this.f2313k).mo976b(obj);
                break;
            case 26:
                ((c81) this.f2314l).mo78b(obj);
                break;
            default:
                ((c81) this.f2313k).mo78b(obj);
                break;
        }
    }

    @Override // p000.ra1
    /* JADX INFO: renamed from: c */
    public void mo1624c(InterfaceC0951zh interfaceC0951zh) {
        ((InterfaceC0507nh) this.f2313k).mo1624c(interfaceC0951zh);
    }

    @Override // p000.InterfaceC0581ph
    /* JADX INFO: renamed from: d */
    public void mo1033d() {
        switch (this.f2312j) {
            case 6:
                ((InterfaceC0581ph) this.f2313k).mo1033d();
                break;
            default:
                zk0 zk0Var = (zk0) this.f2314l;
                if (zk0Var.mo1633q()) {
                    zk0Var.f9834l.execute(new h31(this, 1));
                    break;
                }
                break;
        }
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: e */
    public void mo1625e(int i) {
        ((InterfaceC0507nh) this.f2313k).mo1625e(i);
    }

    @Override // p000.InterfaceC0581ph
    /* JADX INFO: renamed from: f */
    public void mo1034f(np0 np0Var) {
        int i;
        int i2;
        switch (this.f2312j) {
            case 6:
                ((InterfaceC0581ph) this.f2313k).mo1034f(np0Var);
                break;
            default:
                if (((i31) this.f2313k).f3421d > 0) {
                    jp0 jp0Var = zk0.f9815N;
                    np0Var.m3577a(jp0Var);
                    np0Var.m3581e(jp0Var, String.valueOf(((i31) this.f2313k).f3421d));
                }
                zk0 zk0Var = (zk0) this.f2314l;
                i31 i31Var = (i31) this.f2313k;
                jp0 jp0Var2 = zk0.f9815N;
                u21 u21VarM5926b = zk0Var.m5926b(i31Var);
                if (u21VarM5926b != null) {
                    zk0Var.f9833k.execute(u21VarM5926b);
                }
                if (((zk0) this.f2314l).f9846x.f1936f == ((i31) this.f2313k)) {
                    j31 j31Var = ((zk0) this.f2314l).f9844v;
                    if (j31Var != null) {
                        AtomicInteger atomicInteger = j31Var.f3810d;
                        do {
                            i = atomicInteger.get();
                            i2 = j31Var.f3807a;
                            if (i == i2) {
                            }
                        } while (!atomicInteger.compareAndSet(i, Math.min(j31Var.f3809c + i, i2)));
                    }
                    ((zk0) this.f2314l).f9834l.execute(new f31(0, this, np0Var));
                }
                break;
        }
    }

    @Override // p000.ra1
    public void flush() {
        ((InterfaceC0507nh) this.f2313k).flush();
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0226  */
    @Override // p000.InterfaceC0581ph
    /* JADX INFO: renamed from: g */
    public void mo1035g(ja1 ja1Var, EnumC0544oh enumC0544oh, np0 np0Var) {
        boolean z;
        c31 c31Var;
        zk0 zk0Var;
        m81 m81Var;
        switch (this.f2312j) {
            case 6:
                f71 f71Var = ((te0) ((f50) this.f2314l).f2314l).f7440b;
                if (ja1Var.m2838f()) {
                    ((jk0) f71Var.f2336m).mo614j();
                } else {
                    ((jk0) f71Var.f2337n).mo614j();
                }
                ((InterfaceC0581ph) this.f2313k).mo1035g(ja1Var, enumC0544oh, np0Var);
                return;
            default:
                Integer numValueOf = -1;
                synchronized (((zk0) this.f2314l).f9840r) {
                    zk0 zk0Var2 = (zk0) this.f2314l;
                    zk0Var2.f9846x = zk0Var2.f9846x.m1358d((i31) this.f2313k);
                    ((zk0) this.f2314l).f9845w.f8895b.add(String.valueOf(ja1Var.f3886a));
                    break;
                }
                int i = 0;
                if (((zk0) this.f2314l).f9819A.decrementAndGet() == Integer.MIN_VALUE) {
                    ((zk0) this.f2314l).f9834l.execute(new h31(this, i));
                    return;
                }
                i31 i31Var = (i31) this.f2313k;
                if (i31Var.f3420c) {
                    zk0 zk0Var3 = (zk0) this.f2314l;
                    u21 u21VarM5926b = zk0Var3.m5926b(i31Var);
                    if (u21VarM5926b != null) {
                        zk0Var3.f9833k.execute(u21VarM5926b);
                    }
                    if (((zk0) this.f2314l).f9846x.f1936f == ((i31) this.f2313k)) {
                        ((zk0) this.f2314l).m5932l(ja1Var, enumC0544oh, np0Var);
                        return;
                    }
                    return;
                }
                EnumC0544oh enumC0544oh2 = EnumC0544oh.f5734m;
                if (enumC0544oh == enumC0544oh2 && ((zk0) this.f2314l).f9848z.incrementAndGet() > 1000) {
                    zk0 zk0Var4 = (zk0) this.f2314l;
                    u21 u21VarM5926b2 = zk0Var4.m5926b((i31) this.f2313k);
                    if (u21VarM5926b2 != null) {
                        zk0Var4.f9833k.execute(u21VarM5926b2);
                    }
                    if (((zk0) this.f2314l).f9846x.f1936f == ((i31) this.f2313k)) {
                        ((zk0) this.f2314l).m5932l(ja1.f3882l.m2840h("Too many transparent retries. Might be a bug in gRPC").m2839g(ja1Var.m2836a()), enumC0544oh, np0Var);
                        return;
                    }
                    return;
                }
                if (((zk0) this.f2314l).f9846x.f1936f == null) {
                    int i2 = 1;
                    if (enumC0544oh == enumC0544oh2 || (enumC0544oh == EnumC0544oh.f5732k && ((zk0) this.f2314l).f9847y.compareAndSet(false, true))) {
                        i31 i31VarM5927d = ((zk0) this.f2314l).m5927d(((i31) this.f2313k).f3421d, true);
                        if (i31VarM5927d == null) {
                            return;
                        }
                        zk0 zk0Var5 = (zk0) this.f2314l;
                        if (zk0Var5.f9839q) {
                            synchronized (zk0Var5.f9840r) {
                                zk0 zk0Var6 = (zk0) this.f2314l;
                                zk0Var6.f9846x = zk0Var6.f9846x.m1357c((i31) this.f2313k, i31VarM5927d);
                                break;
                            }
                        }
                        ((zk0) this.f2314l).f9833k.execute(new g31(this, i31VarM5927d, i2));
                        return;
                    }
                    EnumC0544oh enumC0544oh3 = EnumC0544oh.f5733l;
                    zk0 zk0Var7 = (zk0) this.f2314l;
                    if (enumC0544oh != enumC0544oh3) {
                        zk0Var7.f9847y.set(true);
                        zk0 zk0Var8 = (zk0) this.f2314l;
                        if (zk0Var8.f9839q) {
                            String str = (String) np0Var.m3579c(zk0.f9816O);
                            if (str != null) {
                                try {
                                    numValueOf = Integer.valueOf(str);
                                    break;
                                } catch (NumberFormatException unused) {
                                }
                            } else {
                                numValueOf = null;
                            }
                            zk0 zk0Var9 = (zk0) this.f2314l;
                            boolean zContains = zk0Var9.f9838p.f2053c.contains(ja1Var.f3886a);
                            boolean z2 = (zk0Var9.f9844v == null || (!zContains && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !zk0Var9.f9844v.m2820a();
                            if (zContains && !z2 && !ja1Var.m2838f() && numValueOf != null && numValueOf.intValue() > 0) {
                                numValueOf = 0;
                            }
                            if (zContains && !z2) {
                                i = 1;
                            }
                            if (i != 0) {
                                zk0.m5925a((zk0) this.f2314l, numValueOf);
                            }
                            synchronized (((zk0) this.f2314l).f9840r) {
                                try {
                                    zk0 zk0Var10 = (zk0) this.f2314l;
                                    zk0Var10.f9846x = zk0Var10.f9846x.m1356b((i31) this.f2313k);
                                    if (i != 0) {
                                        zk0 zk0Var11 = (zk0) this.f2314l;
                                        if (!zk0Var11.m5931j(zk0Var11.f9846x)) {
                                            if (!((zk0) this.f2314l).f9846x.f1934d.isEmpty()) {
                                            }
                                        }
                                        return;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } else {
                            k31 k31Var = zk0Var8.f9837o;
                            long nanos = 0;
                            if (k31Var == null) {
                                c31Var = new c31(false, 0L);
                            } else {
                                boolean zContains2 = k31Var.f4277f.contains(ja1Var.f3886a);
                                String str2 = (String) np0Var.m3579c(zk0.f9816O);
                                if (str2 != null) {
                                    try {
                                        numValueOf = Integer.valueOf(str2);
                                        break;
                                    } catch (NumberFormatException unused2) {
                                    }
                                } else {
                                    numValueOf = null;
                                }
                                boolean z3 = (zk0Var8.f9844v == null || (!zContains2 && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !zk0Var8.f9844v.m2820a();
                                if (zk0Var8.f9837o.f4272a <= ((i31) this.f2313k).f3421d + 1 || z3) {
                                    z = false;
                                } else if (numValueOf == null) {
                                    if (zContains2) {
                                        nanos = (long) (zk0.f9818Q.nextDouble() * zk0Var8.f9825G);
                                        double d = zk0Var8.f9825G;
                                        k31 k31Var2 = zk0Var8.f9837o;
                                        zk0Var8.f9825G = Math.min((long) (d * k31Var2.f4275d), k31Var2.f4274c);
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                } else if (numValueOf.intValue() >= 0) {
                                    nanos = TimeUnit.MILLISECONDS.toNanos(numValueOf.intValue());
                                    zk0Var8.f9825G = zk0Var8.f9837o.f4273b;
                                    z = true;
                                } else {
                                    z = false;
                                }
                                c31Var = new c31(z, nanos);
                            }
                            if (c31Var.f1080a) {
                                i31 i31VarM5927d2 = ((zk0) this.f2314l).m5927d(((i31) this.f2313k).f3421d + 1, false);
                                if (i31VarM5927d2 == null) {
                                    return;
                                }
                                synchronized (((zk0) this.f2314l).f9840r) {
                                    zk0Var = (zk0) this.f2314l;
                                    m81Var = new m81(zk0Var.f9840r);
                                    zk0Var.f9823E = m81Var;
                                    break;
                                }
                                m81Var.m3360i(zk0Var.f9835m.schedule(new g31(this, i31VarM5927d2, i), c31Var.f1081b, TimeUnit.NANOSECONDS));
                                return;
                            }
                        }
                    } else if (zk0Var7.f9839q) {
                        zk0Var7.m5930i();
                    }
                }
                zk0 zk0Var12 = (zk0) this.f2314l;
                u21 u21VarM5926b3 = zk0Var12.m5926b((i31) this.f2313k);
                if (u21VarM5926b3 != null) {
                    zk0Var12.f9833k.execute(u21VarM5926b3);
                }
                if (((zk0) this.f2314l).f9846x.f1936f == ((i31) this.f2313k)) {
                    ((zk0) this.f2314l).m5932l(ja1Var, enumC0544oh, np0Var);
                    return;
                }
                return;
        }
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: h */
    public void mo1626h(C0258gq c0258gq) {
        ((InterfaceC0507nh) this.f2313k).mo1626h(c0258gq);
    }

    @Override // p000.InterfaceC0581ph
    /* JADX INFO: renamed from: i */
    public void mo1036i(an0 an0Var) {
        switch (this.f2312j) {
            case 6:
                ((InterfaceC0581ph) this.f2313k).mo1036i(an0Var);
                break;
            default:
                e31 e31Var = ((zk0) this.f2314l).f9846x;
                int i = 1;
                a90.m132p("Headers should be received prior to messages.", e31Var.f1936f != null);
                if (e31Var.f1936f == ((i31) this.f2313k)) {
                    ((zk0) this.f2314l).f9834l.execute(new f31(i, this, an0Var));
                } else {
                    Logger logger = ca0.f1181a;
                    while (true) {
                        InputStream inputStreamM323v = an0Var.m323v();
                        if (inputStreamM323v != null) {
                            ca0.m907b(inputStreamM323v);
                        }
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m1627j(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.f2313k).add(AbstractC0024an.m286i(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: k */
    public void mo1628k(int i) {
        ((InterfaceC0507nh) this.f2313k).mo1628k(i);
    }

    /* JADX INFO: renamed from: l */
    public void m1629l(c50 c50Var, boolean z) {
        c50Var.getClass();
        c50 c50Var2 = ((t50) this.f2313k).f7321y;
        if (c50Var2 != null) {
            c50Var2.m868j().f7311o.m1629l(c50Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2314l).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                dd0.m1158c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m1630m(c50 c50Var, boolean z) {
        c50Var.getClass();
        t50 t50Var = (t50) this.f2313k;
        AbstractActivityC0790v4 abstractActivityC0790v4 = t50Var.f7319w.f1952o;
        c50 c50Var2 = t50Var.f7321y;
        if (c50Var2 != null) {
            c50Var2.m868j().f7311o.m1630m(c50Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2314l).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                dd0.m1158c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: n */
    public void mo1326n(InterfaceC0581ph interfaceC0581ph) {
        f71 f71Var = ((te0) this.f2314l).f7440b;
        ((jk0) f71Var.f2335l).mo614j();
        ((nc1) f71Var.f2334k).m3517H();
        ((InterfaceC0507nh) this.f2313k).mo1326n(new f50(this, interfaceC0581ph, 6, false));
    }

    /* JADX INFO: renamed from: o */
    public void m1631o(c50 c50Var, boolean z) {
        c50Var.getClass();
        c50 c50Var2 = ((t50) this.f2313k).f7321y;
        if (c50Var2 != null) {
            c50Var2.m868j().f7311o.m1631o(c50Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2314l).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                dd0.m1158c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // p000.xm0
    public void onComplete() {
        switch (this.f2312j) {
            case 10:
                ((xm0) this.f2313k).onComplete();
                break;
            default:
                ((xm0) this.f2313k).onComplete();
                break;
        }
    }

    @Override // p000.xm0
    public void onError(Throwable th) {
        switch (this.f2312j) {
            case 10:
                ((xm0) this.f2313k).onError(th);
                break;
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                ((xm0) this.f2313k).onError(th);
                break;
            case 26:
                ((c81) this.f2314l).onError(th);
                break;
            default:
                try {
                    ((dd0) ((xs0) this.f2314l).f9050c).accept(th);
                } catch (Throwable th2) {
                    wo1.m5394u(th2);
                    th = new C0658rk(th, th2);
                }
                ((c81) this.f2313k).onError(th);
                break;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m1632p(c50 c50Var, boolean z) {
        c50Var.getClass();
        c50 c50Var2 = ((t50) this.f2313k).f7321y;
        if (c50Var2 != null) {
            c50Var2.m868j().f7311o.m1632p(c50Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2314l).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                dd0.m1158c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // p000.ra1
    /* JADX INFO: renamed from: q */
    public boolean mo1633q() {
        return ((InterfaceC0507nh) this.f2313k).mo1633q();
    }

    /* JADX INFO: renamed from: r */
    public void m1634r(c50 c50Var, boolean z) {
        c50Var.getClass();
        c50 c50Var2 = ((t50) this.f2313k).f7321y;
        if (c50Var2 != null) {
            c50Var2.m868j().f7311o.m1634r(c50Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2314l).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                dd0.m1158c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: s */
    public void mo1327s(xd0 xd0Var) {
        ((InterfaceC0507nh) this.f2313k).mo1327s(xd0Var);
    }

    /* JADX INFO: renamed from: t */
    public void m1635t(c50 c50Var, boolean z) {
        c50Var.getClass();
        c50 c50Var2 = ((t50) this.f2313k).f7321y;
        if (c50Var2 != null) {
            c50Var2.m868j().f7311o.m1635t(c50Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2314l).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                dd0.m1158c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public String toString() {
        int i = 0;
        switch (this.f2312j) {
            case 4:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                t90 t90Var = (t90) this.f2313k;
                t90 t90Var2 = t90Var.f7359c;
                boolean z = false;
                while (!t90Var2.equals(t90Var)) {
                    sb.append('{');
                    sb.append(t90Var2.f7357a);
                    sb.append(':');
                    ArrayList arrayList = t90Var2.f7358b;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    t90Var2 = t90Var2.f7359c;
                    z = true;
                }
                if (z) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            case 6:
                C0809vn c0809vnM5362k = wm1.m5362k(this);
                c0809vnM5362k.m5172c((InterfaceC0581ph) this.f2313k, "delegate");
                return c0809vnM5362k.toString();
            case 7:
                C0809vn c0809vnM5362k2 = wm1.m5362k(this);
                c0809vnM5362k2.m5172c((InterfaceC0507nh) this.f2313k, "delegate");
                return c0809vnM5362k2.toString();
            case 16:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f2314l.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList2 = (ArrayList) this.f2313k;
                int size = arrayList2.size();
                while (i < size) {
                    sb2.append((String) arrayList2.get(i));
                    if (i < size - 1) {
                        sb2.append(", ");
                    }
                    i++;
                }
                sb2.append('}');
                return sb2.toString();
            case 20:
                String str = "[ ";
                if (((a91) this.f2313k) != null) {
                    while (i < 9) {
                        str = str + ((a91) this.f2313k).f91q[i] + " ";
                        i++;
                    }
                }
                return str + "] " + ((a91) this.f2313k);
            case 23:
                return "Request{url=" + ((tb0) this.f2313k) + '}';
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC0507nh
    /* JADX INFO: renamed from: u */
    public void mo1636u(C0885xp c0885xp) {
        ((InterfaceC0507nh) this.f2313k).mo1636u(c0885xp);
    }

    /* JADX INFO: renamed from: v */
    public void m1637v(c50 c50Var, boolean z) {
        c50Var.getClass();
        t50 t50Var = (t50) this.f2313k;
        AbstractActivityC0790v4 abstractActivityC0790v4 = t50Var.f7319w.f1952o;
        c50 c50Var2 = t50Var.f7321y;
        if (c50Var2 != null) {
            c50Var2.m868j().f7311o.m1637v(c50Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2314l).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                dd0.m1158c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // p000.ra1
    /* JADX INFO: renamed from: w */
    public void mo1638w(xx0 xx0Var) {
        ((InterfaceC0507nh) this.f2313k).mo1638w(xx0Var);
    }

    /* JADX INFO: renamed from: x */
    public void m1639x(c50 c50Var, boolean z) {
        c50Var.getClass();
        c50 c50Var2 = ((t50) this.f2313k).f7321y;
        if (c50Var2 != null) {
            c50Var2.m868j().f7311o.m1639x(c50Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2314l).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                dd0.m1158c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public void m1640y(c50 c50Var, boolean z) {
        c50Var.getClass();
        c50 c50Var2 = ((t50) this.f2313k).f7321y;
        if (c50Var2 != null) {
            c50Var2.m868j().f7311o.m1640y(c50Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f2314l).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                dd0.m1158c();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    @Override // p000.ra1
    /* JADX INFO: renamed from: z */
    public void mo1641z() {
        ((InterfaceC0507nh) this.f2313k).mo1641z();
    }

    public /* synthetic */ f50(int i, Object obj, Object obj2) {
        this.f2312j = i;
        this.f2313k = obj;
        this.f2314l = obj2;
    }

    public /* synthetic */ f50(int i, Object obj, boolean z) {
        this.f2312j = i;
        this.f2314l = obj;
    }

    public /* synthetic */ f50(Object obj, Object obj2, int i, boolean z) {
        this.f2312j = i;
        this.f2314l = obj;
        this.f2313k = obj2;
    }

    public /* synthetic */ f50(Object obj) {
        this.f2312j = 16;
        this.f2314l = obj;
        this.f2313k = new ArrayList();
    }

    public f50(int i) {
        this.f2312j = i;
        switch (i) {
            case 14:
                this.f2313k = new AtomicReference();
                this.f2314l = new C0089c8(0);
                break;
            case 17:
                Level level = Level.FINE;
                Logger logger = Logger.getLogger(ot0.class.getName());
                a90.m127k(level, "level");
                this.f2314l = level;
                a90.m127k(logger, "logger");
                this.f2313k = logger;
                break;
            case 18:
                this.f2313k = new AtomicLong();
                this.f2314l = new AtomicLong();
                break;
            case 22:
                break;
            case 25:
                this.f2313k = new ArrayList();
                this.f2314l = new HashMap();
                break;
            case 28:
                this.f2313k = new qk0(1000L);
                this.f2314l = wo1.m5393t(10, new x80(13));
                break;
            default:
                this.f2313k = new t90(null);
                this.f2314l = new HashMap();
                break;
        }
    }

    public f50(aa0 aa0Var) {
        this.f2312j = 8;
        this.f2313k = new HashMap();
        this.f2314l = aa0Var;
    }

    public f50(t50 t50Var) {
        this.f2312j = 1;
        this.f2313k = t50Var;
        this.f2314l = new CopyOnWriteArrayList();
    }

    public f50(qd0 qd0Var) {
        this.f2312j = 13;
        f71 f71Var = new f71(qd0Var);
        this.f2314l = new C0884xo(2);
        this.f2313k = f71Var;
    }

    public f50(WebViewFragment webViewFragment) {
        this.f2312j = 2;
        vi1 vi1Var = vi1.f8197q;
        this.f2314l = webViewFragment;
        webViewFragment.f1120X.m437a(new FragmentViewBindingDelegate$1(this));
    }

    public f50(f50 f50Var) {
        this.f2312j = 23;
        this.f2313k = (tb0) f50Var.f2313k;
        C0781uw c0781uw = (C0781uw) f50Var.f2314l;
        c0781uw.getClass();
        this.f2314l = new nu1(c0781uw);
    }

    public f50(ExecutorService executorService) {
        this.f2312j = 24;
        this.f2314l = new C0089c8(0);
        this.f2313k = executorService;
    }

    public f50(ja1 ja1Var, Object obj) {
        this.f2312j = 5;
        a90.m127k(ja1Var, "status");
        this.f2313k = ja1Var;
        this.f2314l = obj;
    }

    public f50(Animator animator) {
        this.f2312j = 0;
        this.f2313k = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2314l = animatorSet;
        animatorSet.play(animator);
    }

    public /* synthetic */ f50(int i, Object obj) {
        this.f2312j = i;
        this.f2313k = obj;
        this.f2314l = null;
    }
}
