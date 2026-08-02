package w1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.flurry.android.marketing.messaging.FlurryMessagingListener;
import com.flurry.android.marketing.messaging.notification.FlurryMessage;
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

/* renamed from: w1.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1715k1 {

    /* renamed from: a, reason: collision with root package name */
    public static FlurryMessagingListener f17758a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Handler f17759b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f17760c = false;

    /* renamed from: d, reason: collision with root package name */
    public static String f17761d = null;

    /* renamed from: e, reason: collision with root package name */
    public static int f17762e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static int f17763f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f17764g;

    public static FlurryMessagingListener a() {
        return f17758a;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0180 A[Catch: JSONException -> 0x002e, TryCatch #3 {JSONException -> 0x002e, blocks: (B:3:0x0008, B:5:0x0023, B:6:0x0031, B:7:0x003b, B:9:0x0041, B:11:0x004b, B:13:0x0057, B:15:0x0074, B:17:0x009a, B:19:0x00a2, B:24:0x00b0, B:26:0x00b8, B:27:0x00bd, B:29:0x013a, B:32:0x0141, B:34:0x0180, B:35:0x0185, B:37:0x0189, B:40:0x0192, B:45:0x0195, B:48:0x019a, B:50:0x01a0, B:51:0x01a9, B:53:0x01af, B:55:0x01ca, B:62:0x0065, B:39:0x018a), top: B:2:0x0008, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0189 A[Catch: JSONException -> 0x002e, TRY_LEAVE, TryCatch #3 {JSONException -> 0x002e, blocks: (B:3:0x0008, B:5:0x0023, B:6:0x0031, B:7:0x003b, B:9:0x0041, B:11:0x004b, B:13:0x0057, B:15:0x0074, B:17:0x009a, B:19:0x00a2, B:24:0x00b0, B:26:0x00b8, B:27:0x00bd, B:29:0x013a, B:32:0x0141, B:34:0x0180, B:35:0x0185, B:37:0x0189, B:40:0x0192, B:45:0x0195, B:48:0x019a, B:50:0x01a0, B:51:0x01a9, B:53:0x01af, B:55:0x01ca, B:62:0x0065, B:39:0x018a), top: B:2:0x0008, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01af A[Catch: JSONException -> 0x002e, LOOP:1: B:51:0x01a9->B:53:0x01af, LOOP_END, TryCatch #3 {JSONException -> 0x002e, blocks: (B:3:0x0008, B:5:0x0023, B:6:0x0031, B:7:0x003b, B:9:0x0041, B:11:0x004b, B:13:0x0057, B:15:0x0074, B:17:0x009a, B:19:0x00a2, B:24:0x00b0, B:26:0x00b8, B:27:0x00bd, B:29:0x013a, B:32:0x0141, B:34:0x0180, B:35:0x0185, B:37:0x0189, B:40:0x0192, B:45:0x0195, B:48:0x019a, B:50:0x01a0, B:51:0x01a9, B:53:0x01af, B:55:0x01ca, B:62:0x0065, B:39:0x018a), top: B:2:0x0008, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(String str) {
        String str2;
        C1726n0 a2;
        Context context;
        C1755w0 h6;
        ArrayList arrayList;
        String k7;
        boolean z4;
        PackageInfo j;
        String str3;
        io.flutter.view.r rVar;
        Iterator it;
        Object k8;
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
            Iterator it2 = C1764z0.f17941c.keySet().iterator();
            while (it2.hasNext()) {
                jSONArray.put((String) it2.next());
            }
            jSONObject.put("documents", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            Charset charset = D0.f17319a;
            try {
                KeyFactory.getInstance("EC");
                Signature.getInstance("SHA256withECDSA");
                str2 = "com.flurry.configkey.prod.ec.2";
            } catch (NoSuchAlgorithmException e7) {
                AbstractC1706i0.o(3, "ECDSA encryption is not available: ".concat(String.valueOf(e7)));
                str2 = "com.flurry.configkey.prod.rot.7";
            }
            jSONArray2.put(str2);
            jSONArray2.put("com.flurry.configkey.prod.fs.0");
            jSONObject.put("signatureKeys", jSONArray2);
            a2 = C1726n0.a();
            context = AbstractC1707i1.f17743c;
            h6 = C1755w0.h();
            arrayList = null;
            k7 = AbstractC1707i1.k("lastKeyId", null);
        } catch (JSONException e8) {
            AbstractC1706i0.r("ParameterProvider error", e8);
        }
        if (!"com.flurry.configkey.prod.ec.2".equals(k7) && !"com.flurry.configkey.prod.rot.7".equals(k7) && !"com.flurry.configkey.prod.fs.0".equals(k7)) {
            z4 = false;
            if (z4 && (k8 = AbstractC1707i1.k("lastETag", null)) != null) {
                jSONObject.put("etag", k8);
            }
            jSONObject.put("apiKey", H2.a().f17404h.f17883A);
            jSONObject.put("appVersion", a2.b());
            jSONObject.put("appBuild", Long.toString(AbstractC1707i1.m(context)));
            r.i();
            C1726n0.a();
            jSONObject.put("sdkVersion", 345);
            jSONObject.put("platform", 3);
            Object obj = Build.VERSION.RELEASE;
            jSONObject.put("platformVersion", obj);
            jSONObject.put("deviceIds", AbstractC1707i1.c());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(Device.JsonKeys.BRAND, Build.BRAND);
            jSONObject2.put(Device.TYPE, Build.DEVICE);
            jSONObject2.put("id", Build.ID);
            jSONObject2.put(Device.JsonKeys.MODEL, Build.MODEL);
            jSONObject2.put("product", Build.PRODUCT);
            jSONObject2.put("version_release", obj);
            jSONObject.put("deviceTags", jSONObject2);
            j = AbstractC1707i1.j(context);
            if (j != null || (r3 = j.packageName) == null) {
                Object obj2 = "";
            }
            jSONObject.put("bundleId", obj2);
            H2.a();
            int i7 = Q.f17510B;
            jSONObject.put(Device.JsonKeys.LOCALE, Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry());
            str3 = H2.a().f17404h.f17884B;
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("publisherUserId", str3);
            }
            rVar = h6.f17901B;
            if (rVar != null) {
                synchronized (rVar) {
                    try {
                        arrayList = rVar.a((HashMap) rVar.f14351b);
                    } finally {
                    }
                }
            }
            if (arrayList != null && arrayList.size() > 0) {
                JSONArray jSONArray3 = new JSONArray();
                it = arrayList.iterator();
                while (it.hasNext()) {
                    B0 b02 = (B0) it.next();
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("id", b02.f17284b);
                    jSONObject3.put("version", b02.f17285c);
                    jSONArray3.put(jSONObject3);
                }
                jSONObject.put("currentVariants", jSONArray3);
            }
            String jSONObject4 = jSONObject.toString();
            AbstractC1706i0.o(3, "Request Parameters: ".concat(String.valueOf(jSONObject4)));
            return jSONObject4;
        }
        z4 = true;
        if (z4) {
            jSONObject.put("etag", k8);
        }
        jSONObject.put("apiKey", H2.a().f17404h.f17883A);
        jSONObject.put("appVersion", a2.b());
        jSONObject.put("appBuild", Long.toString(AbstractC1707i1.m(context)));
        r.i();
        C1726n0.a();
        jSONObject.put("sdkVersion", 345);
        jSONObject.put("platform", 3);
        Object obj3 = Build.VERSION.RELEASE;
        jSONObject.put("platformVersion", obj3);
        jSONObject.put("deviceIds", AbstractC1707i1.c());
        JSONObject jSONObject22 = new JSONObject();
        jSONObject22.put(Device.JsonKeys.BRAND, Build.BRAND);
        jSONObject22.put(Device.TYPE, Build.DEVICE);
        jSONObject22.put("id", Build.ID);
        jSONObject22.put(Device.JsonKeys.MODEL, Build.MODEL);
        jSONObject22.put("product", Build.PRODUCT);
        jSONObject22.put("version_release", obj3);
        jSONObject.put("deviceTags", jSONObject22);
        j = AbstractC1707i1.j(context);
        if (j != null) {
        }
        Object obj22 = "";
        jSONObject.put("bundleId", obj22);
        H2.a();
        int i72 = Q.f17510B;
        jSONObject.put(Device.JsonKeys.LOCALE, Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry());
        str3 = H2.a().f17404h.f17884B;
        if (!TextUtils.isEmpty(str3)) {
        }
        rVar = h6.f17901B;
        if (rVar != null) {
        }
        if (arrayList != null) {
            JSONArray jSONArray32 = new JSONArray();
            it = arrayList.iterator();
            while (it.hasNext()) {
            }
            jSONObject.put("currentVariants", jSONArray32);
        }
        String jSONObject42 = jSONObject.toString();
        AbstractC1706i0.o(3, "Request Parameters: ".concat(String.valueOf(jSONObject42)));
        return jSONObject42;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map c(String str) {
        String str2;
        if (str == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String str3 : str.split("&")) {
            String[] split = str3.split("=");
            if (split.length == 2) {
                String str4 = null;
                try {
                    str2 = URLDecoder.decode(split[0], "UTF-8");
                } catch (Exception e7) {
                    e = e7;
                    str2 = null;
                }
                try {
                    str4 = URLDecoder.decode(split[1], "UTF-8");
                } catch (Exception e8) {
                    e = e8;
                    e.getMessage();
                    if (hashMap.get(str2) == null) {
                    }
                    ((List) hashMap.get(str2)).add(str4);
                }
                if (hashMap.get(str2) == null) {
                    hashMap.put(str2, new ArrayList());
                }
                ((List) hashMap.get(str2)).add(str4);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            Objects.toString(entry.getValue());
        }
        StringBuilder sb = new StringBuilder();
        if (hashMap.get("utm_source") == null) {
            sb.append("Campaign Source is missing.\n");
        }
        if (hashMap.get("utm_medium") == null) {
            sb.append("Campaign Medium is missing.\n");
        }
        if (hashMap.get("utm_campaign") == null) {
            sb.append("Campaign Name is missing.\n");
        }
        if (sb.length() > 0) {
            "Detected missing referrer keys : ".concat(String.valueOf(sb));
        }
        return hashMap;
    }

    public static void d(FlurryMessage flurryMessage) {
        if (n()) {
            int i7 = flurryMessage.notificationId;
            AbstractC1739q1.d("Flurry.PushReceived", flurryMessage.getFlurryData());
        }
    }

    public static void e(AbstractRunnableC1687d1 abstractRunnableC1687d1) {
        Handler handler = (Handler) C1719l1.r().f17771a;
        if (handler != null) {
            handler.post(abstractRunnableC1687d1);
        } else {
            new Handler(Looper.getMainLooper()).post(abstractRunnableC1687d1);
        }
    }

    public static boolean f(Context context) {
        Boolean bool = f17764g;
        if (bool != null) {
            return bool.booleanValue();
        }
        f17764g = Boolean.TRUE;
        boolean z4 = f17764g.booleanValue() && AbstractC1706i0.b(context) != null;
        f17764g = Boolean.valueOf(z4);
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
        return e1.k.i(new StringBuilder(m()), File.separator, "fCompleted");
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String k(File file) {
        FileInputStream fileInputStream;
        StringBuilder sb;
        if (file == null || !file.exists()) {
            return null;
        }
        file.getAbsolutePath();
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th) {
            th = th;
            fileInputStream = null;
        }
        try {
            sb = new StringBuilder();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                sb.append(new String(bArr, 0, read));
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                Log.getStackTraceString(th);
                AbstractC1706i0.h(fileInputStream);
                sb = null;
                if (sb == null) {
                }
            } finally {
                AbstractC1706i0.h(fileInputStream);
            }
        }
        if (sb == null) {
            return sb.toString();
        }
        return null;
    }

    public static String l() {
        return e1.k.i(new StringBuilder(m()), File.separator, "fInProgress");
    }

    public static String m() {
        return e1.k.i(new StringBuilder(AbstractC1707i1.f17743c.getFilesDir().toString()), File.separator, ".fstreaming");
    }

    public static boolean n() {
        if (f17760c) {
            return true;
        }
        AbstractC1706i0.q("Flurry Marketing must be initialized to use messaging! Make sure you've initialized Flurry with the Marketing module in the app application class.");
        return false;
    }
}
