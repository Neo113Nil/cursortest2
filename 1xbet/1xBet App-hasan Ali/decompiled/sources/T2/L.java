package T2;

import P.W;
import Q2.C0379q;
import a3.AbstractC0467k;
import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.A7;
import com.google.android.gms.internal.ads.AbstractC0613Id;
import com.google.android.gms.internal.ads.AbstractC0952et;
import com.google.android.gms.internal.ads.AbstractC1697vc;
import com.google.android.gms.internal.ads.AbstractC1715vu;
import com.google.android.gms.internal.ads.C1206kf;
import com.google.android.gms.internal.ads.C1221ku;
import com.google.android.gms.internal.ads.C1390oj;
import com.google.android.gms.internal.ads.C1482ql;
import com.google.android.gms.internal.ads.D7;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.Hq;
import com.google.android.gms.internal.ads.InterfaceC0677Re;
import com.google.android.gms.internal.ads.InterfaceC1760wu;
import com.google.android.gms.internal.ads.K4;
import com.google.android.gms.internal.ads.Lq;
import com.google.android.gms.internal.ads.MD;
import com.google.android.gms.internal.ads.Nq;
import com.google.android.gms.internal.ads.P7;
import com.google.android.gms.internal.ads.Q7;
import com.google.android.gms.internal.ads.RunnableC1437pl;
import com.google.android.gms.internal.ads.Yk;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import k4.AbstractC2036a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q3.AbstractC2309b;
import r3.C2350b;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: l, reason: collision with root package name */
    public static final H f5672l = new H(Looper.getMainLooper(), 0);

    /* renamed from: g, reason: collision with root package name */
    public String f5678g;

    /* renamed from: h, reason: collision with root package name */
    public volatile String f5679h;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f5673a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f5674b = new AtomicReference(null);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f5675c = new AtomicReference(new Bundle());

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f5676d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public boolean f5677e = true;
    public final Object f = new Object();
    public boolean i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5680j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ExecutorService f5681k = Executors.newSingleThreadExecutor();

    public static int C(Context context, Uri uri) {
        String l5;
        if (context == null) {
            G.m("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return 2;
        }
        A7 a7 = F7.f8910u4;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            P7 p7 = P2.o.f4767B.f4779m;
            if (p7.f11069e == null) {
                AbstractC0613Id.f9539a.execute(new K4(9, p7));
            }
            G.v a5 = new W(p7.f11069e).a();
            Intent intent2 = (Intent) a5.f1749l;
            intent2.setPackage(AbstractC0952et.l(context));
            intent2.setData(uri);
            context.startActivity(intent2, (Bundle) a5.f1750m);
            return 5;
        }
        if (!((Boolean) rVar.f5056c.a(F7.f8898s4)).booleanValue()) {
            Intent intent3 = new Intent("android.intent.action.VIEW");
            intent3.setData(uri);
            intent3.addFlags(268435456);
            context.startActivity(intent3);
            return 9;
        }
        Q7 q7 = new Q7();
        q7.f11186d = new v3.e(q7, context, uri);
        Activity activity = (Activity) context;
        if (q7.f11184b == null && (l5 = AbstractC0952et.l(activity)) != null) {
            MD md = new MD(q7);
            q7.f11185c = md;
            md.f18853a = activity.getApplicationContext();
            Intent intent4 = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty(l5)) {
                intent4.setPackage(l5);
            }
            activity.bindService(intent4, md, 33);
        }
        return 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean D(View view) {
        Activity activity;
        View rootView = view.getRootView();
        if (rootView != null) {
            Context context = rootView.getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
                if (activity != null) {
                    return false;
                }
                Window window = activity.getWindow();
                WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                return (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
            }
        }
        activity = null;
        if (activity != null) {
        }
    }

    public static final void E(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
        extras.putBinder("android.support.customtabs.extra.SESSION", null);
        extras.putString("com.android.browser.application_id", context.getPackageName());
        intent.putExtras(extras);
    }

    public static final String F(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return u(s(context));
    }

    public static final String G() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        String str = Build.VERSION.RELEASE;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        String str2 = Build.DEVICE;
        if (str2 != null) {
            sb.append("; ");
            sb.append(str2);
            String str3 = Build.DISPLAY;
            if (str3 != null) {
                sb.append(" Build/");
                sb.append(str3);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final String H() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : AbstractC0467k.v(str, " ", str2);
    }

    public static final HashMap I(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                HashSet hashSet = new HashSet();
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString = optJSONArray.optString(i);
                        if (optString != null) {
                            hashSet.add(optString);
                        }
                    }
                    hashMap.put(next, hashSet);
                }
            }
            return hashMap;
        } catch (JSONException e3) {
            P2.o.f4767B.f4774g.i("AdUtil.getMapOfFileNamesToKeysFromJsonString", e3);
            return hashMap;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long J(View view) {
        float f = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            f = Math.min(f, view2.getAlpha());
            view = view2.getParent();
        } while (f > 0.0f);
        return Math.round((f >= 0.0f ? f : 0.0f) * 100.0f);
    }

    public static final x a(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (!(newInstance instanceof IBinder)) {
                U2.j.f("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return queryLocalInterface instanceof x ? (x) queryLocalInterface : new w(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil", 0);
        } catch (Exception e3) {
            P2.o.f4767B.f4774g.i("Failed to instantiate WorkManagerUtil", e3);
            return null;
        }
    }

    public static final boolean b(Context context, String str) {
        int i = AbstractC1697vc.f16009a;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return C2350b.a(context).f17113k.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static final boolean c(Context context) {
        try {
            if (AbstractC2309b.f18892g == null) {
                AbstractC2309b.f18892g = Boolean.valueOf(AbstractC2309b.f() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE"));
            }
            return AbstractC2309b.f18892g.booleanValue();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean d(String str) {
        if (U2.g.c()) {
            A7 a7 = F7.f8726M4;
            Q2.r rVar = Q2.r.f5053d;
            if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                String str2 = (String) rVar.f5056c.a(F7.f8738O4);
                if (!str2.isEmpty()) {
                    for (String str3 : str2.split(";")) {
                        if (str3.equals(str)) {
                            break;
                        }
                    }
                }
                String str4 = (String) Q2.r.f5053d.f5056c.a(F7.f8732N4);
                if (str4.isEmpty()) {
                    return true;
                }
                for (String str5 : str4.split(";")) {
                    if (str5.equals(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean e(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            U2.j.g("Error loading class.", th);
            P2.o.f4767B.f4774g.i("AdUtil.isLiteSdk", th);
            return false;
        }
    }

    public static final boolean f(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        PowerManager powerManager;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && (powerManager = (PowerManager) context.getSystemService("power")) != null) {
                        return !powerManager.isScreenOn();
                    }
                    return true;
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean g(Context context) {
        try {
            Bundle s2 = s(context);
            String string = s2.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (TextUtils.isEmpty(u(s2))) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (RemoteException unused) {
        }
        return false;
    }

    public static final boolean h(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public static final void i(View view, int i) {
        String str;
        int i5;
        int i6;
        int i7;
        String str2;
        Lq v4;
        Nq d02;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view2.getContext().getPackageName();
            if (view2 instanceof Yk) {
                view2 = ((Yk) view2).getChildAt(0);
            }
            if (view2 instanceof Z2.e) {
                str = "NATIVE";
                i5 = 1;
            } else {
                str = "UNKNOWN";
                i5 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i7 = rect.width();
                i6 = rect.height();
            } else {
                i6 = 0;
                i7 = 0;
            }
            L l5 = P2.o.f4767B.f4771c;
            long J = J(view2);
            view2.getLocationOnScreen(iArr);
            int i8 = iArr[0];
            int i9 = iArr[1];
            String str3 = "none";
            if (!(view2 instanceof InterfaceC0677Re) || (d02 = ((InterfaceC0677Re) view2).d0()) == null) {
                str2 = "none";
            } else {
                str2 = d02.f10823b;
                view2.setContentDescription(str2 + ":" + view2.hashCode());
            }
            if ((view2 instanceof InterfaceC0677Re) && (v4 = ((InterfaceC0677Re) view2).v()) != null) {
                str = Lq.a(v4.f10491b);
                i5 = v4.f10497e;
                str3 = v4.f10469E;
            }
            Locale locale = Locale.US;
            U2.j.h("<Ad hashCode=" + view2.hashCode() + ", package=" + packageName + ", adNetCls=" + str3 + ", gwsQueryId=" + str2 + ", format=" + str + ", impType=" + i5 + ", class=" + view2.getClass().getName() + ", x=" + i8 + ", y=" + i9 + ", width=" + view2.getWidth() + ", height=" + view2.getHeight() + ", vWidth=" + i7 + ", vHeight=" + i6 + ", alpha=" + J + ", state=" + Integer.toString(i, 2) + ">");
        } catch (Exception e3) {
            U2.j.g("Failure getting view location.", e3);
        }
    }

    public static final AlertDialog.Builder j(Context context) {
        Q1.j jVar = P2.o.f4767B.f4773e;
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final int k(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e3) {
            U2.j.i("Could not parse value:".concat(e3.toString()));
            return 0;
        }
    }

    public static final HashMap l(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.f8877p)).booleanValue()) {
            HashMap hashMap = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put(str, uri.getQueryParameter(str));
                }
            }
            return hashMap;
        }
        HashMap hashMap2 = new HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i = 0;
            while (true) {
                int indexOf = encodedQuery.indexOf(38, i);
                int length = encodedQuery.length();
                if (indexOf != -1) {
                    length = indexOf;
                }
                int indexOf2 = encodedQuery.indexOf(61, i);
                if (indexOf2 > length || indexOf2 == -1) {
                    indexOf2 = length;
                }
                hashMap2.put(Uri.decode(encodedQuery.substring(i, indexOf2)), indexOf2 == length ? "" : Uri.decode(encodedQuery.substring(indexOf2 + 1, length)));
                if (indexOf == -1) {
                    break;
                }
                i = indexOf + 1;
            }
        }
        return hashMap2;
    }

    public static final int[] m(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public static final int[] n(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        int[] iArr = (window == null || (findViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{findViewById.getTop(), findViewById.getBottom()};
        C0379q c0379q = C0379q.f;
        return new int[]{c0379q.f5048a.d(activity, iArr[0]), c0379q.f5048a.d(activity, iArr[1])};
    }

    public static final boolean o(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z3 = P2.o.f4767B.f4771c.f5677e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || D(view);
        long J = J(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z3)) {
            A7 a7 = F7.f8855l1;
            Q2.r rVar = Q2.r.f5053d;
            if (!((Boolean) rVar.f5056c.a(a7)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                A7 a72 = F7.ga;
                if (!((Boolean) rVar.f5056c.a(a72)).booleanValue() || J >= ((Integer) r6.a(F7.ia)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void p(Context context, Intent intent) {
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.Da)).booleanValue()) {
            try {
                context.startActivity(intent);
                return;
            } catch (Throwable unused) {
                intent.addFlags(268435456);
                context.startActivity(intent);
                return;
            }
        }
        try {
            try {
                context.startActivity(intent);
            } catch (Throwable unused2) {
                intent.addFlags(268435456);
                context.startActivity(intent);
            }
        } catch (SecurityException e3) {
            U2.j.j("", e3);
            P2.o.f4767B.f4774g.i("AdUtil.startActivityWithUnknownContext", e3);
        }
    }

    public static final void q(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            E(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            U2.j.d("Opening " + uri.toString() + " in a new browser.");
        } catch (ActivityNotFoundException e3) {
            U2.j.g("No browser is found.", e3);
        }
    }

    public static final void r(Context context, Intent intent, C1482ql c1482ql, String str) {
        A7 a7 = F7.Fc;
        Q2.r rVar = Q2.r.f5053d;
        D7 d7 = rVar.f5056c;
        D7 d72 = rVar.f5056c;
        if (!((Boolean) d7.a(a7)).booleanValue() || !(context instanceof C1206kf)) {
            p(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data == null || data.toString() == null || !data.toString().matches((String) d72.a(F7.Hc))) {
                p(context, intent);
                return;
            }
            ((C1206kf) context).a(intent);
            if (!((Boolean) d72.a(F7.Gc)).booleanValue() || c1482ql == null) {
                return;
            }
            C1390oj a5 = c1482ql.a();
            a5.k("action", "hila");
            if (str == null) {
                str = "";
            }
            a5.k("gqi", str);
            ((C1482ql) a5.f14828m).f15166b.execute(new RunnableC1437pl(a5, 2));
        } catch (ActivityNotFoundException e3) {
            e = e3;
            U2.j.g("Error occurred while starting activity for result", e);
            P2.o.f4767B.f4774g.i("AdUtil.startActivityForResult", e);
            p(context, intent);
        } catch (SecurityException e5) {
            e = e5;
            U2.j.g("Error occurred while starting activity for result", e);
            P2.o.f4767B.f4774g.i("AdUtil.startActivityForResult", e);
            p(context, intent);
        } catch (Exception e6) {
            U2.j.g("Error occurred while starting activity for result", e6);
            P2.o.f4767B.f4774g.i("AdUtil.startActivityForResult", e6);
            p(context, intent);
        }
    }

    public static Bundle s(Context context) {
        try {
            return C2350b.a(context).b(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e3) {
            G.n("Error getting metadata", e3);
            return null;
        }
    }

    public static int t(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        U2.j.i("HTTP timeout too low: " + i + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return 60000;
    }

    public static String u(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return !TextUtils.isEmpty(string) ? (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "" : "";
    }

    public static boolean v(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static final String w(Context context, String str) {
        Context context2;
        if (str == null) {
            return G();
        }
        String str2 = null;
        try {
            if (H3.g.f2320m == null) {
                H3.g.f2320m = new H3.g();
            }
            H3.g gVar = H3.g.f2320m;
            if (TextUtils.isEmpty(gVar.f2322l)) {
                AtomicBoolean atomicBoolean = j3.h.f17515a;
                try {
                    context2 = context.createPackageContext("com.google.android.gms", 3);
                } catch (PackageManager.NameNotFoundException unused) {
                    context2 = null;
                }
                gVar.f2322l = (String) AbstractC2036a.l0(context, new P2.e(context2, context));
            }
            str2 = gVar.f2322l;
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = G();
        }
        String v4 = AbstractC0467k.v(str2, " (Mobile; ", str);
        try {
            if (C2350b.a(context).d()) {
                v4 = v4 + ";aia";
            }
        } catch (Exception e3) {
            P2.o.f4767B.f4774g.i("AdUtil.getUserAgent", e3);
        }
        return v4.concat(")");
    }

    public static ArrayList y() {
        A7 a7 = F7.f8796a;
        ArrayList y5 = Q2.r.f5053d.f5054a.y();
        ArrayList arrayList = new ArrayList();
        int size = y5.size();
        int i = 0;
        while (i < size) {
            Object obj = y5.get(i);
            i++;
            String str = (String) obj;
            Hq e3 = Hq.e(new C1221ku(','));
            str.getClass();
            Iterator c5 = ((InterfaceC1760wu) e3.f9491l).c(e3, str);
            while (true) {
                AbstractC1715vu abstractC1715vu = (AbstractC1715vu) c5;
                if (abstractC1715vu.hasNext()) {
                    try {
                        arrayList.add(Long.valueOf((String) abstractC1715vu.next()));
                    } catch (NumberFormatException unused) {
                        G.m("Experiment ID is not a number");
                    }
                }
            }
        }
        return arrayList;
    }

    public final void A(Context context) {
        if (this.f5680j) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        F7.a(context);
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.Ca)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new K(0), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new K(0), intentFilter, 4);
        }
        this.f5680j = true;
    }

    public final void B(Context context) {
        if (this.i) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        F7.a(context);
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.Ca)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new E(1, this), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new E(1, this), intentFilter, 4);
        }
        this.i = true;
    }

    public final String x(Context context, String str) {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.Pa)).booleanValue()) {
            if (this.f5679h != null) {
                return this.f5679h;
            }
            this.f5679h = w(context, str);
            return this.f5679h;
        }
        synchronized (this.f) {
            try {
                String str2 = this.f5678g;
                if (str2 != null) {
                    return str2;
                }
                String w5 = w(context, str);
                this.f5678g = w5;
                return w5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(Context context, String str, HttpURLConnection httpURLConnection, int i) {
        int t5 = t(i);
        U2.j.h("HTTP timeout: " + t5 + " milliseconds.");
        httpURLConnection.setConnectTimeout(t5);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(t5);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", x(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }
}
