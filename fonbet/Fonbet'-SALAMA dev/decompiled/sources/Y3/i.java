package Y3;

import W5.AbstractC0486a1;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C0826c;
import com.google.android.gms.common.internal.D;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.provider.FirebaseInitProvider;
import g4.C1128a;
import g4.C1133f;
import g4.C1140m;
import h4.EnumC1208k;
import io.sentry.rrweb.RRWebOptionsEvent;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import w1.C1718l0;
import w1.L;
import w1.V0;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f7661k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final r.b f7662l = new r.b();

    /* renamed from: a, reason: collision with root package name */
    public final Context f7663a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7664b;

    /* renamed from: c, reason: collision with root package name */
    public final l f7665c;

    /* renamed from: d, reason: collision with root package name */
    public final C1133f f7666d;

    /* renamed from: g, reason: collision with root package name */
    public final C1140m f7669g;

    /* renamed from: h, reason: collision with root package name */
    public final N4.b f7670h;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f7667e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f7668f = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f7671i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    public i(l lVar, Context context, String str) {
        ?? arrayList;
        final int i7 = 1;
        final int i8 = 0;
        this.f7663a = context;
        D.e(str);
        this.f7664b = str;
        this.f7665c = lVar;
        a aVar = FirebaseInitProvider.f11974a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        for (final String str3 : arrayList) {
            arrayList2.add(new N4.b() { // from class: g4.c
                @Override // N4.b
                public final Object get() {
                    switch (i8) {
                        case 0:
                            String str4 = (String) str3;
                            try {
                                Class<?> cls = Class.forName(str4);
                                if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                    return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                                }
                                throw new C1139l("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                            } catch (ClassNotFoundException unused2) {
                                Log.w("ComponentDiscovery", "Class " + str4 + " is not an found.");
                                return null;
                            } catch (IllegalAccessException e7) {
                                throw new C1139l(AbstractC0486a1.h("Could not instantiate ", str4, "."), e7);
                            } catch (InstantiationException e8) {
                                throw new C1139l(AbstractC0486a1.h("Could not instantiate ", str4, "."), e8);
                            } catch (NoSuchMethodException e9) {
                                throw new C1139l(L.i("Could not instantiate ", str4), e9);
                            } catch (InvocationTargetException e10) {
                                throw new C1139l(L.i("Could not instantiate ", str4), e10);
                            }
                        default:
                            return (ComponentRegistrar) str3;
                    }
                }
            });
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        EnumC1208k enumC1208k = EnumC1208k.f13562a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        final FirebaseCommonRegistrar firebaseCommonRegistrar = new FirebaseCommonRegistrar();
        arrayList3.add(new N4.b() { // from class: g4.c
            @Override // N4.b
            public final Object get() {
                switch (i7) {
                    case 0:
                        String str4 = (String) firebaseCommonRegistrar;
                        try {
                            Class<?> cls = Class.forName(str4);
                            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                            }
                            throw new C1139l("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                        } catch (ClassNotFoundException unused2) {
                            Log.w("ComponentDiscovery", "Class " + str4 + " is not an found.");
                            return null;
                        } catch (IllegalAccessException e7) {
                            throw new C1139l(AbstractC0486a1.h("Could not instantiate ", str4, "."), e7);
                        } catch (InstantiationException e8) {
                            throw new C1139l(AbstractC0486a1.h("Could not instantiate ", str4, "."), e8);
                        } catch (NoSuchMethodException e9) {
                            throw new C1139l(L.i("Could not instantiate ", str4), e9);
                        } catch (InvocationTargetException e10) {
                            throw new C1139l(L.i("Could not instantiate ", str4), e10);
                        }
                    default:
                        return (ComponentRegistrar) firebaseCommonRegistrar;
                }
            }
        });
        final ExecutorsRegistrar executorsRegistrar = new ExecutorsRegistrar();
        arrayList3.add(new N4.b() { // from class: g4.c
            @Override // N4.b
            public final Object get() {
                switch (i7) {
                    case 0:
                        String str4 = (String) executorsRegistrar;
                        try {
                            Class<?> cls = Class.forName(str4);
                            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                            }
                            throw new C1139l("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                        } catch (ClassNotFoundException unused2) {
                            Log.w("ComponentDiscovery", "Class " + str4 + " is not an found.");
                            return null;
                        } catch (IllegalAccessException e7) {
                            throw new C1139l(AbstractC0486a1.h("Could not instantiate ", str4, "."), e7);
                        } catch (InstantiationException e8) {
                            throw new C1139l(AbstractC0486a1.h("Could not instantiate ", str4, "."), e8);
                        } catch (NoSuchMethodException e9) {
                            throw new C1139l(L.i("Could not instantiate ", str4), e9);
                        } catch (InvocationTargetException e10) {
                            throw new C1139l(L.i("Could not instantiate ", str4), e10);
                        }
                    default:
                        return (ComponentRegistrar) executorsRegistrar;
                }
            }
        });
        arrayList4.add(C1128a.b(context, Context.class, new Class[0]));
        arrayList4.add(C1128a.b(this, i.class, new Class[0]));
        arrayList4.add(C1128a.b(lVar, l.class, new Class[0]));
        C1718l0 c1718l0 = new C1718l0(12);
        if (L.m.a(context) && FirebaseInitProvider.f11975b.get()) {
            arrayList4.add(C1128a.b(aVar, a.class, new Class[0]));
        }
        C1133f c1133f = new C1133f(arrayList3, arrayList4, c1718l0);
        this.f7666d = c1133f;
        Trace.endSection();
        this.f7669g = new C1140m(new d(i8, this, context));
        this.f7670h = c1133f.d(M4.d.class);
        a(new f() { // from class: Y3.e
            @Override // Y3.f
            public final void a(boolean z4) {
                i iVar = i.this;
                if (z4) {
                    iVar.getClass();
                } else {
                    ((M4.d) iVar.f7670h.get()).b();
                }
            }
        });
        Trace.endSection();
    }

    public static ArrayList d() {
        ArrayList arrayList = new ArrayList();
        synchronized (f7661k) {
            try {
                Iterator it = ((r.k) f7662l.values()).iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    iVar.b();
                    arrayList.add(iVar.f7664b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static i e() {
        i iVar;
        synchronized (f7661k) {
            try {
                iVar = (i) f7662l.getOrDefault("[DEFAULT]", null);
                if (iVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + m3.c.f() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((M4.d) iVar.f7670h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    public static i f(String str) {
        i iVar;
        String str2;
        synchronized (f7661k) {
            try {
                iVar = (i) f7662l.getOrDefault(str.trim(), null);
                if (iVar == null) {
                    ArrayList d7 = d();
                    if (d7.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", d7);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
                ((M4.d) iVar.f7670h.get()).b();
            } finally {
            }
        }
        return iVar;
    }

    public static i i(l lVar, Context context, String str) {
        i iVar;
        AtomicReference atomicReference = g.f7658a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = g.f7658a;
            if (atomicReference2.get() == null) {
                g gVar = new g();
                while (true) {
                    if (atomicReference2.compareAndSet(null, gVar)) {
                        ComponentCallbacks2C0826c.b(application);
                        ComponentCallbacks2C0826c.f11168e.a(gVar);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f7661k) {
            r.b bVar = f7662l;
            D.k("FirebaseApp name " + trim + " already exists!", !bVar.containsKey(trim));
            D.j(context, "Application context cannot be null.");
            iVar = new i(lVar, context, trim);
            bVar.put(trim, iVar);
        }
        iVar.h();
        return iVar;
    }

    public static i j(Context context) {
        synchronized (f7661k) {
            try {
                if (f7662l.containsKey("[DEFAULT]")) {
                    return e();
                }
                l a2 = l.a(context);
                if (a2 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return i(a2, context, "[DEFAULT]");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(f fVar) {
        b();
        if (this.f7667e.get() && ComponentCallbacks2C0826c.f11168e.f11169a.get()) {
            fVar.a(true);
        }
        this.f7671i.add(fVar);
    }

    public final void b() {
        D.k("FirebaseApp was deleted", !this.f7668f.get());
    }

    public final void c() {
        if (this.f7668f.compareAndSet(false, true)) {
            synchronized (f7661k) {
                f7662l.remove(this.f7664b);
            }
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                B4.L l7 = (B4.L) it.next();
                synchronized (l7) {
                    Iterator it2 = new ArrayList(l7.f1110a.entrySet()).iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        ((FirebaseFirestore) entry.getValue()).j();
                        p3.f.O("terminate() should have removed its entry from `instances` for key: %s", !l7.f1110a.containsKey(entry.getKey()), entry.getKey());
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        iVar.b();
        return this.f7664b.equals(iVar.f7664b);
    }

    public final String g() {
        StringBuilder sb = new StringBuilder();
        b();
        byte[] bytes = this.f7664b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        b();
        byte[] bytes2 = this.f7665c.f7673b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void h() {
        HashMap hashMap;
        if (!L.m.a(this.f7663a)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            b();
            sb.append(this.f7664b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f7663a;
            AtomicReference atomicReference = h.f7659b;
            if (atomicReference.get() == null) {
                h hVar = new h(context);
                while (!atomicReference.compareAndSet(null, hVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(hVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        b();
        sb2.append(this.f7664b);
        Log.i("FirebaseApp", sb2.toString());
        C1133f c1133f = this.f7666d;
        b();
        boolean equals = "[DEFAULT]".equals(this.f7664b);
        AtomicReference atomicReference2 = c1133f.f13199f;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (c1133f) {
                    hashMap = new HashMap(c1133f.f13194a);
                }
                c1133f.i(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((M4.d) this.f7670h.get()).b();
    }

    public final int hashCode() {
        return this.f7664b.hashCode();
    }

    public final void k(boolean z4) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f7671i.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(z4);
        }
    }

    public final void l(Boolean bool) {
        b();
        O4.a aVar = (O4.a) this.f7669g.get();
        synchronized (aVar) {
            try {
                if (bool == null) {
                    aVar.f5005b.edit().remove("firebase_data_collection_default_enabled").apply();
                    aVar.b(aVar.a());
                } else {
                    boolean equals = Boolean.TRUE.equals(bool);
                    aVar.f5005b.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
                    aVar.b(equals);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        V0 v02 = new V0(this);
        v02.j(this.f7664b, "name");
        v02.j(this.f7665c, RRWebOptionsEvent.EVENT_TAG);
        return v02.toString();
    }
}
