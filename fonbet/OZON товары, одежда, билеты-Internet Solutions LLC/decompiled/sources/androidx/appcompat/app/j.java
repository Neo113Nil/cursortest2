package androidx.appcompat.app;

import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.app.j;
import androidx.appcompat.app.z;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.AbstractC5139h;
import androidx.collection.C5133b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    static c f37123a = new c(new d());

    /* renamed from: b, reason: collision with root package name */
    private static int f37124b = -100;

    /* renamed from: c, reason: collision with root package name */
    private static androidx.core.os.i f37125c = null;

    /* renamed from: d, reason: collision with root package name */
    private static androidx.core.os.i f37126d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Boolean f37127e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f37128f = false;

    /* renamed from: g, reason: collision with root package name */
    private static final C5133b<WeakReference<j>> f37129g = new C5133b<>(0);

    /* renamed from: h, reason: collision with root package name */
    private static final Object f37130h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private static final Object f37131i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f37132j = 0;

    /* loaded from: classes8.dex */
    static class a {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* loaded from: classes8.dex */
    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    static class c implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Object f37133a = new Object();

        /* renamed from: b, reason: collision with root package name */
        final ArrayDeque f37134b = new ArrayDeque();

        /* renamed from: c, reason: collision with root package name */
        final Executor f37135c;

        /* renamed from: d, reason: collision with root package name */
        Runnable f37136d;

        c(Executor executor) {
            this.f37135c = executor;
        }

        protected final void a() {
            synchronized (this.f37133a) {
                try {
                    Runnable runnable = (Runnable) this.f37134b.poll();
                    this.f37136d = runnable;
                    if (runnable != null) {
                        ((d) this.f37135c).execute(runnable);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public final void execute(final Runnable runnable) {
            synchronized (this.f37133a) {
                try {
                    this.f37134b.add(new Runnable() { // from class: androidx.appcompat.app.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            Runnable runnable2 = runnable;
                            j.c cVar = j.c.this;
                            cVar.getClass();
                            try {
                                runnable2.run();
                            } finally {
                                cVar.a();
                            }
                        }
                    });
                    if (this.f37136d == null) {
                        a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static class d implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    j() {
    }

    static void E(@NonNull j jVar) {
        synchronized (f37130h) {
            F(jVar);
        }
    }

    private static void F(@NonNull j jVar) {
        synchronized (f37130h) {
            try {
                Iterator<WeakReference<j>> it = f37129g.iterator();
                while (true) {
                    AbstractC5139h abstractC5139h = (AbstractC5139h) it;
                    if (abstractC5139h.hasNext()) {
                        j jVar2 = (j) ((WeakReference) abstractC5139h.next()).get();
                        if (jVar2 == jVar || jVar2 == null) {
                            abstractC5139h.remove();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void H(@NonNull androidx.core.os.i iVar) {
        Objects.requireNonNull(iVar);
        if (Build.VERSION.SDK_INT >= 33) {
            Object p11 = p();
            if (p11 != null) {
                b.b(p11, a.a(iVar.h()));
                return;
            }
            return;
        }
        if (iVar.equals(f37125c)) {
            return;
        }
        synchronized (f37130h) {
            f37125c = iVar;
            Iterator<WeakReference<j>> it = f37129g.iterator();
            while (true) {
                AbstractC5139h abstractC5139h = (AbstractC5139h) it;
                if (abstractC5139h.hasNext()) {
                    j jVar = (j) ((WeakReference) abstractC5139h.next()).get();
                    if (jVar != null) {
                        jVar.f();
                    }
                }
            }
        }
    }

    public static void L(int i11) {
        if (i11 != -1 && i11 != 0 && i11 != 1 && i11 != 2 && i11 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
            return;
        }
        if (f37124b != i11) {
            f37124b = i11;
            synchronized (f37130h) {
                try {
                    Iterator<WeakReference<j>> it = f37129g.iterator();
                    while (true) {
                        AbstractC5139h abstractC5139h = (AbstractC5139h) it;
                        if (abstractC5139h.hasNext()) {
                            j jVar = (j) ((WeakReference) abstractC5139h.next()).get();
                            if (jVar != null) {
                                jVar.g();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static void R(Context context) {
        if (w(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f37128f) {
                    return;
                }
                f37123a.execute(new N.r(context, 1));
                return;
            }
            synchronized (f37131i) {
                try {
                    androidx.core.os.i iVar = f37125c;
                    if (iVar == null) {
                        if (f37126d == null) {
                            f37126d = androidx.core.os.i.b(androidx.core.app.e.b(context));
                        }
                        if (f37126d.f()) {
                        } else {
                            f37125c = f37126d;
                        }
                    } else if (!iVar.equals(f37126d)) {
                        androidx.core.os.i iVar2 = f37125c;
                        f37126d = iVar2;
                        androidx.core.app.e.a(context, iVar2.h());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static void c(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (k().f()) {
                    String b11 = androidx.core.app.e.b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        b.b(systemService, a.a(b11));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
        f37128f = true;
    }

    static void d(@NonNull j jVar) {
        synchronized (f37130h) {
            F(jVar);
            f37129g.add(new WeakReference<>(jVar));
        }
    }

    @NonNull
    public static j i(@NonNull Dialog dialog, h hVar) {
        return new l(dialog, hVar);
    }

    @NonNull
    public static androidx.core.os.i k() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object p11 = p();
            if (p11 != null) {
                return androidx.core.os.i.j(b.a(p11));
            }
        } else {
            androidx.core.os.i iVar = f37125c;
            if (iVar != null) {
                return iVar;
            }
        }
        return androidx.core.os.i.e();
    }

    public static int m() {
        return f37124b;
    }

    static Object p() {
        Context l11;
        Iterator<WeakReference<j>> it = f37129g.iterator();
        while (true) {
            AbstractC5139h abstractC5139h = (AbstractC5139h) it;
            if (!abstractC5139h.hasNext()) {
                return null;
            }
            j jVar = (j) ((WeakReference) abstractC5139h.next()).get();
            if (jVar != null && (l11 = jVar.l()) != null) {
                return l11.getSystemService("locale");
            }
        }
    }

    static androidx.core.os.i r() {
        return f37125c;
    }

    static androidx.core.os.i s() {
        return f37126d;
    }

    static boolean w(Context context) {
        if (f37127e == null) {
            try {
                int i11 = z.f37247a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) z.class), z.a.a() | UserVerificationMethods.USER_VERIFY_PATTERN).metaData;
                if (bundle != null) {
                    f37127e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f37127e = Boolean.FALSE;
            }
        }
        return f37127e.booleanValue();
    }

    public abstract void A();

    public abstract void B();

    public abstract void C();

    public abstract void D();

    public abstract boolean G(int i11);

    public abstract void I(int i11);

    public abstract void J(View view);

    public abstract void K(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void M(int i11);

    public abstract void N(Toolbar toolbar);

    public void O(int i11) {
    }

    public abstract void P(CharSequence charSequence);

    public abstract androidx.appcompat.view.b Q(@NonNull b.a aVar);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    void f() {
    }

    public abstract boolean g();

    @NonNull
    public Context h(@NonNull Context context) {
        return context;
    }

    public abstract <T extends View> T j(int i11);

    public Context l() {
        return null;
    }

    public abstract InterfaceC5052b n();

    public int o() {
        return -100;
    }

    public abstract MenuInflater q();

    public abstract AbstractC5051a t();

    public abstract void u();

    public abstract void v();

    public abstract void x(Configuration configuration);

    public abstract void y();

    public abstract void z();
}
