package G;

import F.AbstractC0213i;
import F.G;
import F.H;
import F.o;
import W5.AbstractC0486a1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.Display;
import android.view.WindowManager;
import io.sentry.protocol.Device;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sSync = new Object();

    public static int checkSelfPermission(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return G.a(new H(context).f2425a) ? 0 : -1;
    }

    public static Context createAttributionContext(Context context, String str) {
        return Build.VERSION.SDK_INT >= 30 ? f.a(context, str) : context;
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        return c.a(context);
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return f.b(context);
        }
        return null;
    }

    public static File getCodeCacheDir(Context context) {
        return a.a(context);
    }

    public static int getColor(Context context, int i7) {
        return b.a(context, i7);
    }

    public static ColorStateList getColorStateList(Context context, int i7) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        H.j jVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        H.k kVar = new H.k(resources, theme);
        synchronized (H.m.f3176c) {
            try {
                SparseArray sparseArray = (SparseArray) H.m.f3175b.get(kVar);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (jVar = (H.j) sparseArray.get(i7)) == null) {
                    colorStateList = null;
                } else {
                    if (jVar.f3170b.equals(resources.getConfiguration())) {
                        if (theme != null || jVar.f3171c != 0) {
                            if (theme == null || jVar.f3171c != theme.hashCode()) {
                            }
                        }
                        colorStateList = jVar.f3169a;
                    }
                    sparseArray.remove(i7);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = H.m.f3174a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i7, typedValue, true);
        int i8 = typedValue.type;
        if (i8 < 28 || i8 > 31) {
            try {
                colorStateListA = H.c.a(resources, resources.getXml(i7), theme);
            } catch (Exception e7) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e7);
            }
        }
        if (colorStateListA == null) {
            return H.i.b(resources, i7, theme);
        }
        synchronized (H.m.f3176c) {
            try {
                WeakHashMap weakHashMap = H.m.f3175b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(kVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(kVar, sparseArray2);
                }
                sparseArray2.append(i7, new H.j(colorStateListA, kVar.f3172a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListA;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0068 A[EXC_TOP_SPLITTER, PHI: r1
      0x0068: PHI (r1v5 java.lang.String) = (r1v1 java.lang.String), (r1v7 java.lang.String) binds: [B:35:0x0075, B:29:0x0066] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static Context getContextForLanguage(Context context) {
        String attributeValue;
        L.j jVarA;
        if (Build.VERSION.SDK_INT >= 33) {
            Object systemService = context.getSystemService(Device.JsonKeys.LOCALE);
            jVarA = systemService != null ? new L.j(new L.k(o.a(systemService))) : L.j.f4185b;
        } else {
            synchronized (AbstractC0213i.f2442a) {
                attributeValue = "";
                try {
                    FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    try {
                        try {
                            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                            xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                            int depth = xmlPullParserNewPullParser.getDepth();
                            while (true) {
                                int next = xmlPullParserNewPullParser.next();
                                if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                                    if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                        attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (fileInputStreamOpenFileInput != null) {
                                try {
                                    fileInputStreamOpenFileInput.close();
                                } catch (IOException unused) {
                                }
                            }
                        } catch (Throwable th) {
                            if (fileInputStreamOpenFileInput != null) {
                                try {
                                    fileInputStreamOpenFileInput.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException | XmlPullParserException unused3) {
                        Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                    }
                    if (attributeValue.isEmpty()) {
                        context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    }
                } catch (FileNotFoundException unused4) {
                }
            }
            jVarA = L.j.a(attributeValue);
        }
        if (Build.VERSION.SDK_INT > 32 || jVarA.f4186a.f4187a.isEmpty()) {
            return context;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        L.d.b(configuration, jVarA);
        return context.createConfigurationContext(configuration);
    }

    public static File getDataDir(Context context) {
        return c.b(context);
    }

    public static Display getDisplayOrDefault(Context context) {
        return Build.VERSION.SDK_INT >= 30 ? f.c(context) : ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static Drawable getDrawable(Context context, int i7) {
        return a.b(context, i7);
    }

    public static File[] getExternalCacheDirs(Context context) {
        return context.getExternalCacheDirs();
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static Executor getMainExecutor(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? e.a(context) : new L.f(new Handler(context.getMainLooper()), 0);
    }

    public static File getNoBackupFilesDir(Context context) {
        return a.c(context);
    }

    public static File[] getObbDirs(Context context) {
        return context.getObbDirs();
    }

    public static String getString(Context context, int i7) {
        return getContextForLanguage(context).getString(i7);
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        return (T) b.b(context, cls);
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        return b.c(context, cls);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        return c.c(context);
    }

    public static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (p003a.a.g(context, str) == 0) {
            return str;
        }
        throw new RuntimeException(AbstractC0486a1.h("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i7) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i7);
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void startForegroundService(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            d.b(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i7) {
        int i8 = i7 & 1;
        if (i8 != 0 && (i7 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i8 != 0) {
            i7 |= 2;
        }
        int i9 = i7;
        int i10 = i9 & 2;
        if (i10 == 0 && (i9 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i10 != 0 && (i9 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            return g.a(context, broadcastReceiver, intentFilter, str, handler, i9);
        }
        if (i11 >= 26) {
            return d.a(context, broadcastReceiver, intentFilter, str, handler, i9);
        }
        return ((i9 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler) : context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }
}
