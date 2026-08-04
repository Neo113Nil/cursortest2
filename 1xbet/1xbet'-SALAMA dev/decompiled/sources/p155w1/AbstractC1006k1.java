package p155w1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.flurry.android.marketing.messaging.FlurryMessagingListener;
import com.flurry.android.marketing.messaging.notification.FlurryMessage;
import io.flutter.view.r;
import io.sentry.protocol.Device;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031e1.k;

/* JADX INFO: renamed from: w1.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1006k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static FlurryMessagingListener f17764a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Handler f17765b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f17766c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f17767d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f17768e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f17769f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Boolean f17770g;

    public static FlurryMessagingListener a() {
        return f17764a;
    }

    public static String b(String str) {
        String str2;
        Object obj;
        Object objK;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", System.currentTimeMillis() / 1000);
            jSONObject.put("guid", str);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("APP");
            try {
                Class.forName("com.flurry.android.config.killswitch.KillSwitch");
                jSONArray.put("KILLSWITCH");
            } catch (ClassNotFoundException unused) {
            }
            Iterator it = C1055z0.f17947c.keySet().iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
            jSONObject.put("documents", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            Charset charset = D0.f17325a;
            try {
                KeyFactory.getInstance("EC");
                Signature.getInstance("SHA256withECDSA");
                str2 = "com.flurry.configkey.prod.ec.2";
            } catch (NoSuchAlgorithmException e7) {
                AbstractC0997i0.o(3, "ECDSA encryption is not available: ".concat(String.valueOf(e7)));
                str2 = "com.flurry.configkey.prod.rot.7";
            }
            jSONArray2.put(str2);
            jSONArray2.put("com.flurry.configkey.prod.fs.0");
            jSONObject.put("signatureKeys", jSONArray2);
            C1017n0 c1017n0A = C1017n0.a();
            Context context = AbstractC0998i1.f17749c;
            C1046w0 c1046w0H = C1046w0.h();
            ArrayList<B0> arrayListA = null;
            String strK = AbstractC0998i1.k("lastKeyId", null);
            if (("com.flurry.configkey.prod.ec.2".equals(strK) || "com.flurry.configkey.prod.rot.7".equals(strK) || "com.flurry.configkey.prod.fs.0".equals(strK)) && (objK = AbstractC0998i1.k("lastETag", null)) != null) {
                jSONObject.put("etag", objK);
            }
            jSONObject.put("apiKey", H2.a().f17410h.f17889A);
            jSONObject.put("appVersion", c1017n0A.b());
            jSONObject.put("appBuild", Long.toString(AbstractC0998i1.m(context)));
            r.i();
            C1017n0.a();
            jSONObject.put("sdkVersion", 345);
            jSONObject.put("platform", 3);
            Object obj2 = Build.VERSION.RELEASE;
            jSONObject.put("platformVersion", obj2);
            jSONObject.put("deviceIds", AbstractC0998i1.c());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(Device.JsonKeys.BRAND, Build.BRAND);
            jSONObject2.put(Device.TYPE, Build.DEVICE);
            jSONObject2.put("id", Build.ID);
            jSONObject2.put(Device.JsonKeys.MODEL, Build.MODEL);
            jSONObject2.put("product", Build.PRODUCT);
            jSONObject2.put("version_release", obj2);
            jSONObject.put("deviceTags", jSONObject2);
            PackageInfo packageInfoJ = AbstractC0998i1.j(context);
            if (packageInfoJ == null || (obj = packageInfoJ.packageName) == null) {
                obj = "";
            }
            jSONObject.put("bundleId", obj);
            H2.a();
            int i7 = Q.f17516B;
            jSONObject.put(Device.JsonKeys.LOCALE, Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry());
            String str3 = H2.a().f17410h.f17890B;
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("publisherUserId", str3);
            }
            r rVar = c1046w0H.f17907B;
            if (rVar != null) {
                synchronized (rVar) {
                    try {
                        arrayListA = rVar.a((HashMap) rVar.f14357b);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (arrayListA != null && arrayListA.size() > 0) {
                JSONArray jSONArray3 = new JSONArray();
                for (B0 b7 : arrayListA) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("id", b7.f17290b);
                    jSONObject3.put("version", b7.f17291c);
                    jSONArray3.put(jSONObject3);
                }
                jSONObject.put("currentVariants", jSONArray3);
            }
        } catch (JSONException e8) {
            AbstractC0997i0.r("ParameterProvider error", e8);
        }
        String string = jSONObject.toString();
        AbstractC0997i0.o(3, "Request Parameters: ".concat(String.valueOf(string)));
        return string;
    }

    public static Map c(String str) {
        String strDecode;
        if (str == null) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap();
        for (String str2 : str.split("&")) {
            String[] strArrSplit = str2.split("=");
            if (strArrSplit.length == 2) {
                String strDecode2 = null;
                try {
                    strDecode = URLDecoder.decode(strArrSplit[0], "UTF-8");
                    try {
                        strDecode2 = URLDecoder.decode(strArrSplit[1], "UTF-8");
                    } catch (Exception e7) {
                        e = e7;
                        e.getMessage();
                    }
                } catch (Exception e8) {
                    e = e8;
                    strDecode = null;
                }
                if (map.get(strDecode) == null) {
                    map.put(strDecode, new ArrayList());
                }
                ((List) map.get(strDecode)).add(strDecode2);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            Objects.toString(entry.getValue());
        }
        StringBuilder sb = new StringBuilder();
        if (map.get("utm_source") == null) {
            sb.append("Campaign Source is missing.\n");
        }
        if (map.get("utm_medium") == null) {
            sb.append("Campaign Medium is missing.\n");
        }
        if (map.get("utm_campaign") == null) {
            sb.append("Campaign Name is missing.\n");
        }
        if (sb.length() > 0) {
            "Detected missing referrer keys : ".concat(String.valueOf(sb));
        }
        return map;
    }

    public static void d(FlurryMessage flurryMessage) {
        if (n()) {
            int i7 = flurryMessage.notificationId;
            AbstractC1030q1.d("Flurry.PushReceived", flurryMessage.getFlurryData());
        }
    }

    public static void e(AbstractRunnableC0978d1 abstractRunnableC0978d1) {
        Handler handler = (Handler) C1010l1.r().f17777a;
        if (handler != null) {
            handler.post(abstractRunnableC0978d1);
        } else {
            new Handler(Looper.getMainLooper()).post(abstractRunnableC0978d1);
        }
    }

    public static boolean f(Context context) {
        Boolean bool = f17770g;
        if (bool != null) {
            return bool.booleanValue();
        }
        f17770g = Boolean.TRUE;
        boolean z4 = f17770g.booleanValue() && AbstractC0997i0.b(context) != null;
        f17770g = Boolean.valueOf(z4);
        return z4;
    }

    public static boolean g(File file) {
        if (file == null || file.getAbsoluteFile() == null) {
            return false;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.mkdirs() || parentFile.isDirectory()) {
            return true;
        }
        "Unable to create persistent dir: ".concat(String.valueOf(parentFile));
        return false;
    }

    public static String h() {
        return k.i(new StringBuilder(m()), File.separator, "fCompleted");
    }

    public static boolean i(File file) {
        if (!file.isDirectory()) {
            return false;
        }
        for (String str : file.list()) {
            if (!i(new File(file, str))) {
                return false;
            }
        }
        return file.delete();
    }

    public static boolean j(String str) {
        return !TextUtils.isEmpty(str) && new File(str).exists();
    }

    public static String k(File file) {
        FileInputStream fileInputStream;
        StringBuilder sb;
        if (file == null || !file.exists()) {
            return null;
        }
        file.getAbsolutePath();
        try {
            fileInputStream = new FileInputStream(file);
            try {
                sb = new StringBuilder();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i7 = fileInputStream.read(bArr);
                    if (i7 <= 0) {
                        break;
                    }
                    sb.append(new String(bArr, 0, i7));
                }
                AbstractC0997i0.h(fileInputStream);
            } catch (Throwable th) {
                th = th;
                try {
                    Log.getStackTraceString(th);
                    AbstractC0997i0.h(fileInputStream);
                    sb = null;
                } catch (Throwable th2) {
                    AbstractC0997i0.h(fileInputStream);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
        if (sb != null) {
            return sb.toString();
        }
        return null;
    }

    public static String l() {
        return k.i(new StringBuilder(m()), File.separator, "fInProgress");
    }

    public static String m() {
        return k.i(new StringBuilder(AbstractC0998i1.f17749c.getFilesDir().toString()), File.separator, ".fstreaming");
    }

    public static boolean n() {
        if (f17766c) {
            return true;
        }
        AbstractC0997i0.q("Flurry Marketing must be initialized to use messaging! Make sure you've initialized Flurry with the Marketing module in the app application class.");
        return false;
    }
}
