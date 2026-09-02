package a;

import V.b;
import W.c;
import Y.i;
import Y.j;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowMetrics;
import g.AbstractFutureC0037g;
import g.C0033c;
import g.C0036f;
import g0.d;
import g0.h;
import io.flutter.plugins.GeneratedPluginRegistrant;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import m.e;
import m.f;
import m.g;
import m.r;
import m0.AbstractC0059p;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import w.m;
import w.n;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0018a {

    /* renamed from: b, reason: collision with root package name */
    public static long f413b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f414c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f415d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f416e;

    public static void A(Window window, boolean z2) {
        if (Build.VERSION.SDK_INT >= 30) {
            e.a(window, z2);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z2 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static boolean B(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] == bArr2[i2]) {
                }
            }
            return true;
        }
        return false;
    }

    public static final void C(Object obj) {
        if (obj instanceof c) {
            throw ((c) obj).f389b;
        }
    }

    public static String D(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static final boolean E(String str, f0.a aVar) {
        try {
            boolean booleanValue = ((Boolean) aVar.a()).booleanValue();
            if (!booleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static Object F(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if (obj instanceof JSONArray) {
            return obj;
        }
        if (obj instanceof JSONObject) {
            return obj;
        }
        if (obj.equals(JSONObject.NULL)) {
            return obj;
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(F(it.next()));
            }
            return jSONArray;
        }
        if (obj.getClass().isArray()) {
            JSONArray jSONArray2 = new JSONArray();
            int length = Array.getLength(obj);
            for (int i2 = 0; i2 < length; i2++) {
                jSONArray2.put(F(Array.get(obj, i2)));
            }
            return jSONArray2;
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONObject.put((String) entry.getKey(), F(entry.getValue()));
            }
            return jSONObject;
        }
        if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short)) {
            return obj;
        }
        if (obj instanceof String) {
            return obj;
        }
        if (obj.getClass().getPackage().getName().startsWith("java.")) {
            return obj.toString();
        }
        return null;
    }

    public static ArrayList G(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static void a(Throwable th, Throwable th2) {
        h.e(th, "<this>");
        h.e(th2, "exception");
        if (th != th2) {
            Integer num = c0.a.f479a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = b0.a.f475a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static Bitmap b(Bitmap bitmap, int i2) {
        if (bitmap != null) {
            switch (i2) {
                case 1:
                case 3:
                case 6:
                case 8:
                    break;
                case 2:
                case 4:
                case 5:
                case 7:
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Matrix matrix = new Matrix();
                    if (i2 == 2) {
                        matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
                    } else if (i2 == 7) {
                        matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
                    } else if (i2 == 4) {
                        matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
                    } else if (i2 == 5) {
                        matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                    if (createBitmap != bitmap) {
                        bitmap.recycle();
                        break;
                    }
                    break;
                default:
                    Log.e("ImageUtils", "Unknown EXIF orientation: " + i2);
                    break;
            }
            return bitmap;
        }
        return bitmap;
    }

    public static void c(Context context, b bVar) {
        Rect rect;
        r b2;
        WindowMetrics maximumWindowMetrics;
        Activity j2 = j(context);
        if (j2 != null) {
            m.f1308a.getClass();
            int i2 = n.f1309b;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                maximumWindowMetrics = ((WindowManager) j2.getSystemService(WindowManager.class)).getMaximumWindowMetrics();
                rect = maximumWindowMetrics.getBounds();
                h.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService = j2.getSystemService("window");
                h.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                h.d(defaultDisplay, "display");
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (i3 < 30) {
                b2 = (i3 >= 30 ? new m.h() : i3 >= 29 ? new g() : new f()).b();
                h.d(b2, "{\n            WindowInse…ilder().build()\n        }");
            } else {
                if (i3 < 30) {
                    throw new Exception("Incompatible SDK version");
                }
                b2 = A.b.f0a.a(j2);
            }
            int i4 = rect.left;
            int i5 = rect.top;
            int i6 = rect.right;
            int i7 = rect.bottom;
            if (i4 > i6) {
                throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i4 + ", right: " + i6).toString());
            }
            if (i5 <= i7) {
                h.e(b2, "_windowInsetsCompat");
                ((G.c) bVar).f150a.updateDisplayMetrics(0, new Rect(i4, i5, i6, i7).width(), new Rect(i4, i5, i6, i7).height(), context.getResources().getDisplayMetrics().density);
            } else {
                throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i5 + ", bottom: " + i7).toString());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] g(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            jArr[i2] = iArr[i2];
        }
        return jArr;
    }

    public static final c h(Throwable th) {
        h.e(th, "exception");
        return new c(th);
    }

    public static boolean i(Method method, g0.e eVar) {
        Class a2 = eVar.a();
        h.c(a2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return method.getReturnType().equals(a2);
    }

    public static Activity j(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return j(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class k(j0.b bVar) {
        h.e(bVar, "<this>");
        Class a2 = ((d) bVar).a();
        if (a2.isPrimitive()) {
            String name = a2.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return a2;
    }

    public static String l(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveActivity != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String str2 = (String) obj;
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public static void m(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static Y.d n(Y.d dVar) {
        h.e(dVar, "<this>");
        a0.b bVar = dVar instanceof a0.b ? (a0.b) dVar : null;
        if (bVar == null || (dVar = bVar.f420d) != null) {
            return dVar;
        }
        i iVar = bVar.f419c;
        h.b(iVar);
        Y.f fVar = (Y.f) iVar.d(Y.e.f409b);
        Y.d hVar = fVar != null ? new r0.h((AbstractC0059p) fVar, bVar) : bVar;
        bVar.f420d = hVar;
        return hVar;
    }

    public static boolean o(Context context) {
        Bundle bundle;
        Context applicationContext = context.getApplicationContext();
        try {
            bundle = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("ContentSizingFlag", "Could not get metadata", e2);
            bundle = null;
        }
        if (bundle != null) {
            return bundle.getBoolean("io.flutter.embedding.android.EnableContentSizing", false);
        }
        return false;
    }

    public static K.a p(Context context) {
        String str;
        String str2;
        int i2;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            String str3 = G.g.f190a.f188b;
            String str4 = G.g.f191b.f188b;
            String str5 = null;
            if (bundle == null) {
                str = null;
            } else {
                String string = bundle.getString(str3, null);
                if (string == null) {
                    string = bundle.getString(str4);
                }
                str = string;
            }
            Bundle bundle2 = applicationInfo.metaData;
            String str6 = G.g.f195f.f188b;
            if (bundle2 != null) {
                bundle2.getString(str6, null);
            }
            Bundle bundle3 = applicationInfo.metaData;
            String str7 = G.g.f196g.f188b;
            if (bundle3 != null) {
                bundle3.getString(str7, null);
            }
            Bundle bundle4 = applicationInfo.metaData;
            String str8 = G.g.f192c.f188b;
            String str9 = G.g.f193d.f188b;
            if (bundle4 == null) {
                str2 = null;
            } else {
                String string2 = bundle4.getString(str8, null);
                if (string2 == null) {
                    string2 = bundle4.getString(str9);
                }
                str2 = string2;
            }
            Bundle bundle5 = applicationInfo.metaData;
            if (bundle5 != null && (i2 = bundle5.getInt("io.flutter.network-policy", 0)) > 0) {
                JSONArray jSONArray = new JSONArray();
                try {
                    XmlResourceParser xml = context.getResources().getXml(i2);
                    xml.next();
                    for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                        if (eventType == 2) {
                            if (xml.getName().equals("domain-config")) {
                                r(xml, jSONArray, false);
                            }
                        }
                    }
                    str5 = jSONArray.toString();
                } catch (IOException | XmlPullParserException unused) {
                }
            }
            String str10 = str5;
            String str11 = applicationInfo.nativeLibraryDir;
            Bundle bundle6 = applicationInfo.metaData;
            return new K.a(str, str2, str10, str11, bundle6 != null ? bundle6.getBoolean("io.flutter.automatically-register-plugins", true) : true);
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static i q(Y.g gVar, Y.h hVar) {
        h.e(hVar, "key");
        return h.a(gVar.getKey(), hVar) ? j.f410b : gVar;
    }

    public static void r(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z2) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z2);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    boolean attributeBooleanValue2 = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 4) {
                        throw new IllegalStateException("Expected text");
                    }
                    String trim = xmlResourceParser.getText().trim();
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(trim);
                    jSONArray2.put(attributeBooleanValue2);
                    jSONArray2.put(attributeBooleanValue);
                    jSONArray.put(jSONArray2);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 3) {
                        throw new IllegalStateException("Expected end of domain tag");
                    }
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    r(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    String name = xmlResourceParser.getName();
                    int eventType = xmlResourceParser.getEventType();
                    while (true) {
                        if (eventType != 3 || xmlResourceParser.getName() != name) {
                            eventType = xmlResourceParser.next();
                        }
                    }
                }
            } else if (next == 3) {
                return;
            }
        }
    }

    public static i s(Y.g gVar, i iVar) {
        h.e(iVar, "context");
        return t(gVar, iVar);
    }

    public static i t(i iVar, i iVar2) {
        h.e(iVar2, "context");
        return iVar2 == j.f410b ? iVar : (i) iVar2.c(iVar, new Y.b(1));
    }

    public static void w(J.d dVar, MediaExtractor mediaExtractor) {
        try {
            int trackCount = mediaExtractor.getTrackCount();
            for (int i2 = 0; i2 < trackCount; i2++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i2);
                String string = trackFormat.getString("mime");
                if (string != null && string.startsWith("image/")) {
                    int integer = trackFormat.containsKey("rotation-degrees") ? trackFormat.getInteger("rotation-degrees") : 0;
                    int i3 = dVar.f265g;
                    int i4 = dVar.f264f;
                    if (integer != 90 && integer != 270) {
                        i4 = i3;
                        i3 = i4;
                    }
                    dVar.f260b = i3;
                    dVar.f259a = i4;
                    dVar.f261c = integer;
                    return;
                }
            }
        } catch (Exception e2) {
            Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e2);
        }
    }

    public static void x(G.c cVar) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", G.c.class).invoke(null, cVar);
        } catch (Exception e2) {
            Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + cVar + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", "Received exception while registering", e2);
        }
    }

    public abstract boolean d(AbstractFutureC0037g abstractFutureC0037g, C0033c c0033c);

    public abstract boolean e(AbstractFutureC0037g abstractFutureC0037g, Object obj, Object obj2);

    public abstract boolean f(AbstractFutureC0037g abstractFutureC0037g, C0036f c0036f, C0036f c0036f2);

    public abstract void u(C0036f c0036f, C0036f c0036f2);

    public abstract void v(C0036f c0036f, Thread thread);

    public abstract void z(boolean z2);

    public void y(boolean z2) {
    }
}
