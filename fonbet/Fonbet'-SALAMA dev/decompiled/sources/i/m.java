package i;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import l.AbstractC1364b;
import l.InterfaceC1363a;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorC1215B f13706a = new ExecutorC1215B(new ExecutorC1216C());

    /* renamed from: b, reason: collision with root package name */
    public static final int f13707b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static L.j f13708c = null;

    /* renamed from: d, reason: collision with root package name */
    public static L.j f13709d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f13710e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f13711f = false;

    /* renamed from: x, reason: collision with root package name */
    public static final r.c f13712x = new r.c(0);

    /* renamed from: y, reason: collision with root package name */
    public static final Object f13713y = new Object();

    /* renamed from: z, reason: collision with root package name */
    public static final Object f13714z = new Object();

    public static boolean d(Context context) {
        if (f13710e == null) {
            try {
                int i7 = AbstractServiceC1214A.f13604a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC1214A.class), z.a() | 128).metaData;
                if (bundle != null) {
                    f13710e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f13710e = Boolean.FALSE;
            }
        }
        return f13710e.booleanValue();
    }

    public static void h(v vVar) {
        synchronized (f13713y) {
            try {
                Iterator it = f13712x.iterator();
                while (true) {
                    r.h hVar = (r.h) it;
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

    public abstract AbstractC1364b n(InterfaceC1363a interfaceC1363a);
}
