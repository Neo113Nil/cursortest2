package p000;

import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.lifecycle.C0030a;
import androidx.lifecycle.SavedStateHandleController;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.ph0;
import p000.yh0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j22 {

    /* JADX INFO: renamed from: a */
    public static UserManager f3795a = null;

    /* JADX INFO: renamed from: b */
    public static volatile boolean f3796b = false;

    /* JADX INFO: renamed from: c */
    public static final C0747tz f3797c = new C0747tz(1);

    /* JADX INFO: renamed from: d */
    public static final Object f3798d = new Object();

    /* JADX INFO: renamed from: e */
    public static ri1 f3799e;

    /* JADX INFO: renamed from: A */
    public static void m2782A(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m2816y(parcel, i));
    }

    /* JADX INFO: renamed from: B */
    public static ComponentName m2783B(Context context, Intent intent) {
        synchronized (f3798d) {
            try {
                m2794c(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f3799e.m4353a();
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public static boolean m2784C(int i, Context context, String str) {
        C0186et c0186etM4792a = tk1.m4792a(context);
        c0186etM4792a.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) c0186etM4792a.f2181k.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: D */
    public static int m2785D(Parcel parcel) {
        int i = parcel.readInt();
        int iM2816y = m2816y(parcel, i);
        char c = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new r41("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iM2816y + iDataPosition;
        if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i2).length());
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new r41(sb.toString(), parcel);
    }

    /* JADX INFO: renamed from: E */
    public static ht1 m2786E(Object obj) {
        if (obj == null) {
            return ht1.f3331c;
        }
        if (obj instanceof String) {
            return new lt1((String) obj);
        }
        if (obj instanceof Double) {
            return new gr1((Double) obj);
        }
        if (obj instanceof Long) {
            return new gr1(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new gr1(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new up1((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                C0270h1.m2190f("Invalid value type");
                return null;
            }
            dp1 dp1Var = new dp1();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                dp1Var.m1284u(dp1Var.m1282s(), m2786E(it.next()));
            }
            return dp1Var;
        }
        ct1 ct1Var = new ct1();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            ht1 ht1VarM2786E = m2786E(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                ct1Var.mo751c((String) string, ht1VarM2786E);
            }
        }
        return ct1Var;
    }

    /* JADX INFO: renamed from: F */
    public static void m2787F(Parcel parcel, int i, int i2) {
        int iM2816y = m2816y(parcel, i);
        if (iM2816y == i2) {
            return;
        }
        String hexString = Integer.toHexString(iM2816y);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iM2816y).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(iM2816y);
        throw new r41(AbstractC0024an.m286i(sb, " (0x", hexString, ")"), parcel);
    }

    /* JADX INFO: renamed from: G */
    public static ht1 m2788G(c12 c12Var) {
        if (c12Var == null) {
            return ht1.f3330b;
        }
        int iM834B = c12Var.m834B() - 1;
        if (iM834B == 1) {
            return c12Var.m837v() ? new lt1(c12Var.m838w()) : ht1.f3337i;
        }
        if (iM834B == 2) {
            return c12Var.m841z() ? new gr1(Double.valueOf(c12Var.m833A())) : new gr1(null);
        }
        if (iM834B == 3) {
            return c12Var.m839x() ? new up1(Boolean.valueOf(c12Var.m840y())) : new up1(null);
        }
        if (iM834B != 4) {
            C0270h1.m2190f("Unknown type found. Cannot convert entity");
            return null;
        }
        List listM835t = c12Var.m835t();
        ArrayList arrayList = new ArrayList();
        Iterator it = listM835t.iterator();
        while (it.hasNext()) {
            arrayList.add(m2788G((c12) it.next()));
        }
        return new it1(c12Var.m836u(), arrayList);
    }

    /* JADX INFO: renamed from: H */
    public static void m2789H(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(i);
        throw new r41(AbstractC0024an.m286i(sb, " (0x", hexString, ")"), parcel);
    }

    /* JADX INFO: renamed from: I */
    public static AbstractC0269h0 m2790I(Context context, Callable callable, Executor executor) {
        an0 an0Var = new an0(20, callable);
        if (m2791J(context)) {
            ve1 ve1Var = new ve1();
            ve1Var.f8186r = new ue1(ve1Var, an0Var);
            executor.execute(ve1Var);
            return ve1Var;
        }
        g71 g71Var = new g71();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        i22 i22Var = new i22(atomicBoolean, context, g71Var, an0Var, executor);
        context.registerReceiver(i22Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!m2791J(context) || !atomicBoolean.compareAndSet(false, true)) {
            g71Var.mo995c(new RunnableC0452m(g71Var, atomicBoolean, context, i22Var, 9, false), EnumC0113ct.f1449j);
            return g71Var;
        }
        try {
            context.unregisterReceiver(i22Var);
        } catch (IllegalArgumentException e) {
            Log.w("DirectBootUtils", "Failed to unregister receiver", e);
        }
        ve1 ve1Var2 = new ve1();
        ve1Var2.f8186r = new ue1(ve1Var2, an0Var);
        executor.execute(ve1Var2);
        g71Var.m2179n(ve1Var2);
        return g71Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0050 A[Catch: all -> 0x000f, TryCatch #1 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:16:0x0017, B:18:0x001b, B:19:0x0025, B:32:0x0050, B:33:0x0052, B:22:0x002b, B:24:0x0031, B:28:0x003e, B:30:0x004c), top: B:39:0x0009, inners: #0 }] */
    /* JADX INFO: renamed from: J */
    public static boolean m2791J(Context context) {
        if (f3796b) {
            return true;
        }
        synchronized (j22.class) {
            try {
                if (f3796b) {
                    return true;
                }
                int i = 1;
                while (true) {
                    boolean z = false;
                    if (i <= 2) {
                        if (f3795a == null) {
                            f3795a = (UserManager) context.getSystemService(UserManager.class);
                        }
                        UserManager userManager = f3795a;
                        if (userManager == null) {
                            z = true;
                        } else {
                            try {
                                if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                    z = true;
                                }
                            } catch (NullPointerException e) {
                                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                                f3795a = null;
                                i++;
                            }
                        }
                        if (z) {
                            f3796b = true;
                        }
                        return z;
                    }
                    if (z) {
                        f3795a = null;
                    }
                    if (z) {
                        f3796b = true;
                    }
                    return z;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m2792a(di1 di1Var, final C0086c5 c0086c5, final C0030a c0030a) {
        Object obj;
        c0086c5.getClass();
        c0030a.getClass();
        HashMap map = di1Var.f1666a;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = di1Var.f1666a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.f548j) {
            return;
        }
        c0086c5.getClass();
        c0030a.getClass();
        if (savedStateHandleController.f548j) {
            C0270h1.m2191g("Already attached to lifecycleOwner");
        } else {
            savedStateHandleController.f548j = true;
            c0030a.m437a(savedStateHandleController);
            c0086c5.m851e(null, null);
        }
        qh0 qh0Var = c0030a.f551c;
        if (qh0Var == qh0.f6498k || qh0Var.compareTo(qh0.f6500m) >= 0) {
            c0086c5.m852f();
        } else {
            c0030a.m437a(new uh0() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // p000.uh0
                /* JADX INFO: renamed from: d */
                public final void mo328d(yh0 yh0Var, ph0 ph0Var) {
                    if (ph0Var == ph0.ON_START) {
                        c0030a.m442f(this);
                        c0086c5.m852f();
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m2793b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static void m2794c(Context context) {
        if (f3799e == null) {
            ri1 ri1Var = new ri1(context);
            f3799e = ri1Var;
            synchronized (ri1Var.f6846a) {
                ri1Var.f6852g = true;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2795d(Intent intent) {
        synchronized (f3798d) {
            try {
                if (f3799e != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f3799e.m4355c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static long[] m2796e(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    /* JADX INFO: renamed from: f */
    public static Bundle m2797f(Parcel parcel, int i) {
        int iM2816y = m2816y(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM2816y == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iM2816y);
        return bundle;
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m2798g(Parcel parcel, int i) {
        int iM2816y = m2816y(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM2816y == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iM2816y);
        return bArrCreateByteArray;
    }

    /* JADX INFO: renamed from: h */
    public static byte[][] m2799h(Parcel parcel, int i) {
        int iM2816y = m2816y(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM2816y == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        byte[][] bArr = new byte[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iM2816y);
        return bArr;
    }

    /* JADX INFO: renamed from: i */
    public static int[] m2800i(Parcel parcel, int i) {
        int iM2816y = m2816y(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM2816y == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iM2816y);
        return iArrCreateIntArray;
    }

    /* JADX INFO: renamed from: j */
    public static Parcelable m2801j(Parcel parcel, int i, Parcelable.Creator creator) {
        int iM2816y = m2816y(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM2816y == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iM2816y);
        return parcelable;
    }

    /* JADX INFO: renamed from: k */
    public static String m2802k(Parcel parcel, int i) {
        int iM2816y = m2816y(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM2816y == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iM2816y);
        return string;
    }

    /* JADX INFO: renamed from: l */
    public static Object[] m2803l(Parcel parcel, int i, Parcelable.Creator creator) {
        int iM2816y = m2816y(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM2816y == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iM2816y);
        return objArrCreateTypedArray;
    }

    /* JADX INFO: renamed from: m */
    public static ArrayList m2804m(Parcel parcel, int i, Parcelable.Creator creator) {
        int iM2816y = m2816y(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM2816y == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iM2816y);
        return arrayListCreateTypedArrayList;
    }

    /* JADX INFO: renamed from: n */
    public static void m2805n(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new r41(j11.m2774i(new StringBuilder(String.valueOf(i).length() + 26), "Overread allowed size end=", i), parcel);
        }
    }

    /* JADX INFO: renamed from: o */
    public static ColorStateList m2806o(Context context, int i) {
        ColorStateList colorStateListM4789a;
        ColorStateList colorStateList;
        i21 i21Var;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        j21 j21Var = new j21(resources, theme);
        synchronized (k21.f4268c) {
            try {
                SparseArray sparseArray = (SparseArray) k21.f4267b.get(j21Var);
                colorStateListM4789a = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (i21Var = (i21) sparseArray.get(i)) == null) {
                    colorStateList = null;
                } else {
                    if (i21Var.f3399b.equals(resources.getConfiguration())) {
                        if (theme != null || i21Var.f3400c != 0) {
                            if (theme == null || i21Var.f3400c != theme.hashCode()) {
                            }
                        }
                        colorStateList = i21Var.f3398a;
                    }
                    sparseArray.remove(i);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = k21.f4266a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateListM4789a = AbstractC0730ti.m4789a(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListM4789a == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (k21.f4268c) {
            try {
                WeakHashMap weakHashMap = k21.f4267b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(j21Var);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(j21Var, sparseArray2);
                }
                sparseArray2.append(i, new i21(colorStateListM4789a, j21Var.f3793a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListM4789a;
    }

    /* JADX INFO: renamed from: p */
    public static Drawable m2807p(Context context, int i) {
        return f21.m1576b().m1579c(context, i);
    }

    /* JADX INFO: renamed from: q */
    public static Intent m2808q(AbstractActivityC0790v4 abstractActivityC0790v4) {
        Intent parentActivityIntent = abstractActivityC0790v4.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strM2810s = m2810s(abstractActivityC0790v4, abstractActivityC0790v4.getComponentName());
            if (strM2810s == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(abstractActivityC0790v4, strM2810s);
            try {
                return m2810s(abstractActivityC0790v4, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strM2810s + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: r */
    public static Intent m2809r(AbstractActivityC0790v4 abstractActivityC0790v4, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM2810s = m2810s(abstractActivityC0790v4, componentName);
        if (strM2810s == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM2810s);
        return m2810s(abstractActivityC0790v4, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* JADX INFO: renamed from: s */
    public static String m2810s(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 269222528);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m2811t(Context context, int i) {
        if (m2784C(i, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                p90 p90VarM3876b = p90.m3876b(context);
                p90VarM3876b.getClass();
                if (packageInfo != null) {
                    if (!p90.m3877g(packageInfo, false)) {
                        if (p90.m3877g(packageInfo, true)) {
                            if (!o90.m3652a((Context) p90VarM3876b.f6027j)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m2812u(Parcel parcel, int i) {
        m2787F(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* JADX INFO: renamed from: v */
    public static IBinder m2813v(Parcel parcel, int i) {
        int iM2816y = m2816y(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iM2816y == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iM2816y);
        return strongBinder;
    }

    /* JADX INFO: renamed from: w */
    public static int m2814w(Parcel parcel, int i) {
        m2787F(parcel, i, 4);
        return parcel.readInt();
    }

    /* JADX INFO: renamed from: x */
    public static long m2815x(Parcel parcel, int i) {
        m2787F(parcel, i, 8);
        return parcel.readLong();
    }

    /* JADX INFO: renamed from: y */
    public static int m2816y(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    /* JADX INFO: renamed from: z */
    public static final Object m2817z(Object obj) {
        return obj instanceof C0657rj ? wo1.m5380e(((C0657rj) obj).f6860a) : obj;
    }
}
