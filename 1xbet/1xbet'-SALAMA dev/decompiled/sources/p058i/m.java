package p058i;

import L.j;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p078l.a;
import p078l.b;
import p122r.c;
import p122r.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f13712a = new B(new C());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f13713b = -100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static j f13714c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static j f13715d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f13716e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f13717f = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final c f13718x = new c(0);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Object f13719y = new Object();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Object f13720z = new Object();

    public static boolean d(Context context) {
        if (f13716e == null) {
            try {
                int i7 = A.f13610a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) A.class), z.a() | 128).metaData;
                if (bundle != null) {
                    f13716e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f13716e = Boolean.FALSE;
            }
        }
        return f13716e.booleanValue();
    }

    public static void h(v vVar) {
        synchronized (f13719y) {
            try {
                Iterator it = f13718x.iterator();
                while (true) {
                    h hVar = (h) it;
                    if (hVar.hasNext()) {
                        m mVar = (m) ((WeakReference) hVar.next()).get();
                        if (mVar == vVar || mVar == null) {
                            hVar.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void f();

    public abstract void g();

    public abstract boolean i(int i7);

    public abstract void j(int i7);

    public abstract void k(View view);

    public abstract void l(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void m(CharSequence charSequence);

    public abstract b n(a aVar);
}
