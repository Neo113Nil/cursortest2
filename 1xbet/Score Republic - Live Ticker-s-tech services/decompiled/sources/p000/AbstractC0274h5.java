package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: h5 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0274h5 {

    /* JADX INFO: renamed from: j */
    public static final ExecutorC0237g5 f3053j = new ExecutorC0237g5(new iw1(2));

    /* JADX INFO: renamed from: k */
    public static final int f3054k = -100;

    /* JADX INFO: renamed from: l */
    public static tj0 f3055l = null;

    /* JADX INFO: renamed from: m */
    public static tj0 f3056m = null;

    /* JADX INFO: renamed from: n */
    public static Boolean f3057n = null;

    /* JADX INFO: renamed from: o */
    public static boolean f3058o = false;

    /* JADX INFO: renamed from: p */
    public static final C0165e8 f3059p = new C0165e8();

    /* JADX INFO: renamed from: q */
    public static final Object f3060q = new Object();

    /* JADX INFO: renamed from: r */
    public static final Object f3061r = new Object();

    /* JADX INFO: renamed from: b */
    public static boolean m2209b(Context context) {
        if (f3057n == null) {
            try {
                int i = AbstractServiceC0608q7.f6394j;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC0608q7.class), AbstractC0571p7.m3853a() | 128).metaData;
                if (bundle != null) {
                    f3057n = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f3057n = Boolean.FALSE;
            }
        }
        return f3057n.booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public static void m2210e(LayoutInflaterFactory2C0828w5 layoutInflaterFactory2C0828w5) {
        synchronized (f3060q) {
            try {
                C0165e8 c0165e8 = f3059p;
                c0165e8.getClass();
                C0904y7 c0904y7 = new C0904y7(c0165e8);
                while (c0904y7.hasNext()) {
                    AbstractC0274h5 abstractC0274h5 = (AbstractC0274h5) ((WeakReference) c0904y7.next()).get();
                    if (abstractC0274h5 == layoutInflaterFactory2C0828w5 || abstractC0274h5 == null) {
                        c0904y7.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo2211a();

    /* JADX INFO: renamed from: c */
    public abstract void mo2212c();

    /* JADX INFO: renamed from: d */
    public abstract void mo2213d();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo2214f(int i);

    /* JADX INFO: renamed from: h */
    public abstract void mo2215h(int i);

    /* JADX INFO: renamed from: j */
    public abstract void mo2216j(View view);

    /* JADX INFO: renamed from: k */
    public abstract void mo2217k(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: l */
    public abstract void mo2218l(CharSequence charSequence);
}
