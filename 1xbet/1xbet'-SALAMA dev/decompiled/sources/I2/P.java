package I2;

import A1.L0;
import F2.C0252s;
import F2.C0254t;
import W5.AbstractC0486a1;
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
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.zzbbp;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbcz;
import com.google.android.gms.internal.ads.zzbuy;
import com.google.android.gms.internal.ads.zzcds;
import com.google.android.gms.internal.ads.zzcfe;
import com.google.android.gms.internal.ads.zzcfu;
import com.google.android.gms.internal.ads.zzdnt;
import com.google.android.gms.internal.ads.zzdqp;
import com.google.android.gms.internal.ads.zzdqq;
import com.google.android.gms.internal.ads.zzfaf;
import com.google.android.gms.internal.ads.zzfai;
import com.google.android.gms.internal.ads.zzfss;
import com.google.android.gms.internal.ads.zzftw;
import com.google.android.gms.internal.ads.zzfty;
import com.google.android.gms.internal.ads.zzhew;
import io.sentry.MeasurementUnit;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p155w1.C1017n0;
import p155w1.C1052y0;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final K f3579l = new K(Looper.getMainLooper());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f3586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile String f3587h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f3580a = new AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f3581b = new AtomicReference(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f3582c = new AtomicReference(new Bundle());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f3583d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3584e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f3585f = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3588i = false;
    public boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ExecutorService f3589k = Executors.newSingleThreadExecutor();

    public static int C(Context context, Uri uri) {
        if (context == null) {
            J.k("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return 2;
        }
        zzbbp zzbbpVar = zzbby.zzeL;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            p109p.l lVarA = new p109p.k(E2.o.f1952C.f1966m.zza()).a();
            lVarA.f15656a.setPackage(zzhew.zza(context));
            lVarA.a(context, uri);
            return 5;
        }
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzeJ)).booleanValue()) {
            zzbcz zzbczVar = new zzbcz();
            zzbczVar.zze(new C1017n0(zzbczVar, context, uri, 6));
            zzbczVar.zzb((Activity) context);
            return 5;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(uri);
        intent2.addFlags(268435456);
        context.startActivity(intent2);
        return 9;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public static final boolean D(View view) {
        Activity activity;
        View rootView = view.getRootView();
        if (rootView == null) {
            activity = null;
        } else {
            Context context = rootView.getContext();
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                activity = null;
            }
        }
        if (activity == null) {
            return false;
        }
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        return (attributes == null || (attributes.flags & 524288) == 0) ? false : true;
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
        return str2.startsWith(str) ? str2 : p031e1.k.f(str, " ", str2);
    }

    public static final HashMap I(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                HashSet hashSet = new HashSet();
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
                if (jSONArrayOptJSONArray != null) {
                    for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i7);
                        if (strOptString != null) {
                            hashSet.add(strOptString);
                        }
                    }
                    map.put(next, hashSet);
                }
            }
            return map;
        } catch (JSONException e7) {
            E2.o.f1952C.f1961g.zzw(e7, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.ViewParent] */
    public static final long J(View view) {
        float fMin = Float.MAX_VALUE;
        do {
            if (!(view instanceof View)) {
                break;
            }
            View view2 = (View) view;
            fMin = Math.min(fMin, view2.getAlpha());
            view = view2.getParent();
        } while (fMin > 0.0f);
        return Math.round((fMin >= 0.0f ? fMin : 0.0f) * 100.0f);
    }

    public static final z a(Context context) {
        try {
            Object objNewInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(null).newInstance(null);
            if (!(objNewInstance instanceof IBinder)) {
                int i7 = J.f3546b;
                J2.j.d("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) objNewInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return iInterfaceQueryLocalInterface instanceof z ? (z) iInterfaceQueryLocalInterface : new y(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
        } catch (Exception e7) {
            E2.o.f1952C.f1961g.zzw(e7, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean b(Context context, String str) {
        Context contextZza = zzbuy.zza(context);
        return ((Context) p097n3.c.a(contextZza).f15314b).getPackageManager().checkPermission(str, contextZza.getPackageName()) == 0;
    }

    public static final boolean c(Context context) {
        try {
            if (p090m3.c.f15262h == null) {
                p090m3.c.f15262h = Boolean.valueOf(p090m3.c.i() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE"));
            }
            return p090m3.c.f15262h.booleanValue();
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean d(String str) {
        if (!J2.g.c()) {
            return false;
        }
        zzbbp zzbbpVar = zzbby.zzfg;
        C0254t c0254t = C0254t.f2723d;
        if (!((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            return false;
        }
        String str2 = (String) c0254t.f2726c.zzb(zzbby.zzfi);
        if (!str2.isEmpty()) {
            for (String str3 : str2.split(";")) {
                if (str3.equals(str)) {
                    return false;
                }
            }
        }
        String str4 = (String) C0254t.f2723d.f2726c.zzb(zzbby.zzfh);
        if (str4.isEmpty()) {
            return true;
        }
        for (String str5 : str4.split(";")) {
            if (str5.equals(str)) {
                return true;
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
            int i7 = J.f3546b;
            J2.j.e("Error loading class.", th);
            E2.o.f1952C.f1961g.zzw(th, "AdUtil.isLiteSdk");
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
                    return runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode() || (powerManager = (PowerManager) context.getSystemService("power")) == null || !powerManager.isScreenOn();
                }
            }
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean g(Context context) {
        try {
            Bundle bundleS = s(context);
            return TextUtils.isEmpty(u(bundleS)) && !TextUtils.isEmpty(bundleS.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
        } catch (RemoteException unused) {
        }
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

    public static final void i(View view, int i7) {
        String strZza;
        int i8;
        int iHeight;
        int iWidth;
        String str;
        zzfaf zzfafVarZzD;
        zzfai zzfaiVarZzR;
        View childAt = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (childAt instanceof zzdnt) {
                childAt = ((zzdnt) childAt).getChildAt(0);
            }
            if (childAt instanceof NativeAdView) {
                strZza = "NATIVE";
                i8 = 1;
            } else {
                strZza = "UNKNOWN";
                i8 = 0;
            }
            if (childAt.getLocalVisibleRect(rect)) {
                iWidth = rect.width();
                iHeight = rect.height();
            } else {
                iHeight = 0;
                iWidth = 0;
            }
            P p5 = E2.o.f1952C.f1957c;
            long J5 = J(childAt);
            childAt.getLocationOnScreen(iArr);
            int i9 = iArr[0];
            int i10 = iArr[1];
            boolean z4 = childAt instanceof zzcfe;
            String str2 = MeasurementUnit.NONE;
            if (!z4 || (zzfaiVarZzR = ((zzcfe) childAt).zzR()) == null) {
                str = MeasurementUnit.NONE;
            } else {
                str = zzfaiVarZzR.zzb;
                childAt.setContentDescription(str + ":" + childAt.hashCode());
            }
            if ((childAt instanceof zzcds) && (zzfafVarZzD = ((zzcds) childAt).zzD()) != null) {
                strZza = zzfaf.zza(zzfafVarZzD.zzb);
                i8 = zzfafVarZzD.zze;
                str2 = zzfafVarZzD.zzE;
            }
            Locale locale = Locale.US;
            String str3 = "<Ad hashCode=" + childAt.hashCode() + ", package=" + packageName + ", adNetCls=" + str2 + ", gwsQueryId=" + str + ", format=" + strZza + ", impType=" + i8 + ", class=" + childAt.getClass().getName() + ", x=" + i9 + ", y=" + i10 + ", width=" + childAt.getWidth() + ", height=" + childAt.getHeight() + ", vWidth=" + iWidth + ", vHeight=" + iHeight + ", alpha=" + J5 + ", state=" + Integer.toString(i7, 2) + ">";
            int i11 = J.f3546b;
            J2.j.f(str3);
        } catch (Exception e7) {
            int i12 = J.f3546b;
            J2.j.e("Failure getting view location.", e7);
        }
    }

    public static final AlertDialog.Builder j(Context context) {
        Q q7 = E2.o.f1952C.f1959e;
        return new AlertDialog.Builder(context, R.style.Theme.Material.Dialog.Alert);
    }

    public static final int k(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e7) {
            String strConcat = "Could not parse value:".concat(e7.toString());
            int i7 = J.f3546b;
            J2.j.g(strConcat);
            return 0;
        }
    }

    public static final HashMap l(Uri uri) {
        String encodedQuery;
        if (uri == null) {
            return null;
        }
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzp)).booleanValue()) {
            HashMap map = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                if (!TextUtils.isEmpty(str)) {
                    map.put(str, uri.getQueryParameter(str));
                }
            }
            return map;
        }
        HashMap map2 = new HashMap();
        if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
            int i7 = 0;
            while (true) {
                int iIndexOf = encodedQuery.indexOf(38, i7);
                int length = encodedQuery.length();
                if (iIndexOf != -1) {
                    length = iIndexOf;
                }
                int iIndexOf2 = encodedQuery.indexOf(61, i7);
                if (iIndexOf2 > length || iIndexOf2 == -1) {
                    iIndexOf2 = length;
                }
                map2.put(Uri.decode(encodedQuery.substring(i7, iIndexOf2)), iIndexOf2 == length ? "" : Uri.decode(encodedQuery.substring(iIndexOf2 + 1, length)));
                if (iIndexOf == -1) {
                    break;
                }
                i7 = iIndexOf + 1;
            }
        }
        return map2;
    }

    public static final int[] m(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        return (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getWidth(), viewFindViewById.getHeight()};
    }

    public static final int[] n(Activity activity) {
        View viewFindViewById;
        Window window = activity.getWindow();
        int[] iArr = (window == null || (viewFindViewById = window.findViewById(R.id.content)) == null) ? new int[]{0, 0} : new int[]{viewFindViewById.getTop(), viewFindViewById.getBottom()};
        C0252s c0252s = C0252s.f2717f;
        return new int[]{c0252s.f2718a.g(iArr[0], activity), c0252s.f2718a.g(iArr[1], activity)};
    }

    public static final boolean o(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z4 = E2.o.f1952C.f1957c.f3584e || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || D(view);
        long J5 = J(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z4)) {
            zzbbp zzbbpVar = zzbby.zzbx;
            C0254t c0254t = C0254t.f2723d;
            if (!((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                zzbbp zzbbpVar2 = zzbby.zzkC;
                zzbbw zzbbwVar = c0254t.f2726c;
                if (!((Boolean) zzbbwVar.zzb(zzbbpVar2)).booleanValue() || J5 >= ((Integer) zzbbwVar.zzb(zzbby.zzkE)).intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void p(Context context, Intent intent) {
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkZ)).booleanValue()) {
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
        } catch (SecurityException e7) {
            int i7 = J.f3546b;
            J2.j.h("", e7);
            E2.o.f1952C.f1961g.zzw(e7, "AdUtil.startActivityWithUnknownContext");
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
            String str = "Opening " + uri.toString() + " in a new browser.";
            int i7 = J.f3546b;
            J2.j.b(str);
        } catch (ActivityNotFoundException e7) {
            int i8 = J.f3546b;
            J2.j.e("No browser is found.", e7);
        }
    }

    public static final void r(Context context, Intent intent, zzdqq zzdqqVar, String str) {
        zzbbp zzbbpVar = zzbby.zzmZ;
        C0254t c0254t = C0254t.f2723d;
        if (!((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() || !(context instanceof zzcfu)) {
            p(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (data != null && data.toString() != null) {
                if (data.toString().matches((String) c0254t.f2726c.zzb(zzbby.zznb))) {
                    ((zzcfu) context).zzc(intent, 236);
                    if (!((Boolean) c0254t.f2726c.zzb(zzbby.zzna)).booleanValue() || zzdqqVar == null) {
                        return;
                    }
                    zzdqp zzdqpVarZza = zzdqqVar.zza();
                    zzdqpVarZza.zzb("action", "hila");
                    zzdqpVarZza.zzb("gqi", zzfty.zzc(str));
                    zzdqpVarZza.zzi();
                    return;
                }
            }
            p(context, intent);
        } catch (ActivityNotFoundException e7) {
            e = e7;
            int i7 = J.f3546b;
            J2.j.e("Error occurred while starting activity for result", e);
            E2.o.f1952C.f1961g.zzw(e, "AdUtil.startActivityForResult");
            p(context, intent);
        } catch (SecurityException e8) {
            e = e8;
            int i8 = J.f3546b;
            J2.j.e("Error occurred while starting activity for result", e);
            E2.o.f1952C.f1961g.zzw(e, "AdUtil.startActivityForResult");
            p(context, intent);
        } catch (Exception e9) {
            int i9 = J.f3546b;
            J2.j.e("Error occurred while starting activity for result", e9);
            E2.o.f1952C.f1961g.zzw(e9, "AdUtil.startActivityForResult");
            p(context, intent);
        }
    }

    public static Bundle s(Context context) {
        try {
            return p097n3.c.a(context).q(128, context.getPackageName()).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e7) {
            J.l("Error getting metadata", e7);
            return null;
        }
    }

    public static int t(int i7) {
        if (i7 >= 5000) {
            return i7;
        }
        if (i7 <= 0) {
            return 60000;
        }
        String strF = AbstractC0486a1.f(i7, "HTTP timeout too low: ", " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        int i8 = J.f3546b;
        J2.j.g(strF);
        return 60000;
    }

    public static String u(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        return (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : "";
    }

    public static boolean v(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern patternCompile = (Pattern) atomicReference.get();
            if (patternCompile == null || !str2.equals(patternCompile.pattern())) {
                patternCompile = Pattern.compile(str2);
                atomicReference.set(patternCompile);
            }
            return patternCompile.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static final String w(Context context, String str) {
        String strG;
        if (str == null) {
            return G();
        }
        try {
            if (C1052y0.f17936d == null) {
                C1052y0.f17936d = new C1052y0(5, false);
            }
            C1052y0 c1052y0 = C1052y0.f17936d;
            if (TextUtils.isEmpty((String) c1052y0.f17938b)) {
                c1052y0.f17938b = (String) p097n3.a.e0(context, new E2.f(1, com.google.android.gms.common.g.getRemoteContext(context), context, false));
            }
            strG = (String) c1052y0.f17938b;
        } catch (Exception unused) {
            strG = null;
        }
        if (TextUtils.isEmpty(strG)) {
            strG = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(strG)) {
            strG = G();
        }
        String strF = p031e1.k.f(strG, " (Mobile; ", str);
        try {
            if (p097n3.c.a(context).v()) {
                strF = strF + ";aia";
            }
        } catch (Exception e7) {
            E2.o.f1952C.f1961g.zzw(e7, "AdUtil.getUserAgent");
        }
        return strF.concat(")");
    }

    public static ArrayList y() {
        zzbbp zzbbpVar = zzbby.zza;
        List listZzb = C0254t.f2723d.f2724a.zzb();
        ArrayList arrayList = new ArrayList();
        Iterator it = listZzb.iterator();
        while (it.hasNext()) {
            Iterator it2 = zzftw.zzb(zzfss.zzc(',')).zzd((String) it.next()).iterator();
            while (it2.hasNext()) {
                try {
                    arrayList.add(Long.valueOf((String) it2.next()));
                } catch (NumberFormatException unused) {
                    J.k("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    public final void A(Context context) {
        if (this.j) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbby.zza(context);
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkY)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new O(), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new O(), intentFilter, 4);
        }
        this.j = true;
    }

    public final void B(Context context) {
        if (this.f3588i) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbby.zza(context);
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkY)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new L0(this, 2), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new L0(this, 2), intentFilter, 4);
        }
        this.f3588i = true;
    }

    public final String x(Context context, String str) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzll)).booleanValue()) {
            if (this.f3587h != null) {
                return this.f3587h;
            }
            this.f3587h = w(context, str);
            return this.f3587h;
        }
        synchronized (this.f3585f) {
            try {
                String str2 = this.f3586g;
                if (str2 != null) {
                    return str2;
                }
                String strW = w(context, str);
                this.f3586g = strW;
                return strW;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(Context context, String str, HttpURLConnection httpURLConnection, int i7) {
        int iT = t(i7);
        String strF = AbstractC0486a1.f(iT, "HTTP timeout: ", " milliseconds.");
        int i8 = J.f3546b;
        J2.j.f(strF);
        httpURLConnection.setConnectTimeout(iT);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(iT);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", x(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }
}
