package p000;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.os.UserManager;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class w00 {

    /* JADX INFO: renamed from: j */
    public static final Object f8316j = new Object();

    /* JADX INFO: renamed from: k */
    public static final C0089c8 f8317k = new C0089c8(0);

    /* JADX INFO: renamed from: a */
    public final Context f8318a;

    /* JADX INFO: renamed from: b */
    public final String f8319b;

    /* JADX INFO: renamed from: c */
    public final r10 f8320c;

    /* JADX INFO: renamed from: d */
    public final C0547ok f8321d;

    /* JADX INFO: renamed from: g */
    public final dh0 f8324g;

    /* JADX INFO: renamed from: h */
    public final my0 f8325h;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f8322e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f8323f = new AtomicBoolean();

    /* JADX INFO: renamed from: i */
    public final CopyOnWriteArrayList f8326i = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public w00(Context context, String str, r10 r10Var) {
        ?? arrayList;
        int i = 0;
        new CopyOnWriteArrayList();
        this.f8318a = context;
        p80.m3860e(str);
        this.f8319b = str;
        this.f8320c = r10Var;
        C0574pa c0574pa = FirebaseInitProvider.f1402j;
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
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C0399kk(i, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        cf1 cf1Var = cf1.f1245j;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i2 = 1;
        arrayList3.add(new C0399kk(i2, new FirebaseCommonRegistrar()));
        arrayList3.add(new C0399kk(i2, new ExecutorsRegistrar()));
        arrayList4.add(C0805vj.m5165c(context, Context.class, new Class[0]));
        arrayList4.add(C0805vj.m5165c(this, w00.class, new Class[0]));
        arrayList4.add(C0805vj.m5165c(r10Var, r10.class, new Class[0]));
        wa0 wa0Var = new wa0(17);
        if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() && FirebaseInitProvider.f1403k.get()) {
            arrayList4.add(C0805vj.m5165c(c0574pa, C0574pa.class, new Class[0]));
        }
        cf1 cf1Var2 = cf1.f1245j;
        C0547ok c0547ok = new C0547ok();
        c0547ok.f5762a = new HashMap();
        c0547ok.f5763b = new HashMap();
        c0547ok.f5764c = new HashMap();
        c0547ok.f5765d = new HashSet();
        c0547ok.f5767f = new AtomicReference();
        C0337ix c0337ix = new C0337ix();
        c0547ok.f5766e = c0337ix;
        c0547ok.f5768g = wa0Var;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(C0805vj.m5165c(c0337ix, C0337ix.class, hb1.class, wy0.class));
        arrayList5.add(C0805vj.m5165c(c0547ok, C0547ok.class, new Class[0]));
        int size = arrayList4.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList4.get(i3);
            i3++;
            C0805vj c0805vj = (C0805vj) obj;
            if (c0805vj != null) {
                arrayList5.add(c0805vj);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            arrayList6.add(obj2);
        }
        ArrayList arrayList7 = new ArrayList();
        synchronized (c0547ok) {
            Iterator it2 = arrayList6.iterator();
            while (it2.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((my0) it2.next()).get();
                    if (componentRegistrar != null) {
                        arrayList5.addAll(((wa0) c0547ok.f5768g).m5308q(componentRegistrar));
                        it2.remove();
                    }
                } catch (jf0 e) {
                    it2.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                for (Object obj3 : ((C0805vj) it3.next()).f8199b.toArray()) {
                    if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (((HashSet) c0547ok.f5765d).contains(obj3.toString())) {
                            it3.remove();
                            break;
                        }
                        ((HashSet) c0547ok.f5765d).add(obj3.toString());
                    }
                }
            }
            if (((HashMap) c0547ok.f5762a).isEmpty()) {
                n80.m3493b(arrayList5);
            } else {
                ArrayList arrayList8 = new ArrayList(((HashMap) c0547ok.f5762a).keySet());
                arrayList8.addAll(arrayList5);
                n80.m3493b(arrayList8);
            }
            int size3 = arrayList5.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj4 = arrayList5.get(i5);
                i5++;
                C0805vj c0805vj2 = (C0805vj) obj4;
                ((HashMap) c0547ok.f5762a).put(c0805vj2, new dh0(new C0510nk(i, c0547ok, c0805vj2)));
            }
            arrayList7.addAll(c0547ok.m3699k(arrayList5));
            arrayList7.addAll(c0547ok.m3700l());
            c0547ok.m3698j();
        }
        int size4 = arrayList7.size();
        while (i < size4) {
            Object obj5 = arrayList7.get(i);
            i++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) c0547ok.f5767f).get();
        if (bool != null) {
            c0547ok.m3697i((HashMap) c0547ok.f5762a, bool.booleanValue());
        }
        this.f8321d = c0547ok;
        Trace.endSection();
        this.f8324g = new dh0(new C0510nk(2, this, context));
        this.f8325h = c0547ok.mo2285e(C0553oq.class);
        t00 t00Var = new t00(this);
        m5224a();
        if (this.f8322e.get()) {
            ComponentCallbacks2C0907ya.f9252n.f9253j.get();
        }
        this.f8326i.add(t00Var);
        Trace.endSection();
    }

    /* JADX INFO: renamed from: b */
    public static w00 m5221b() {
        w00 w00Var;
        synchronized (f8316j) {
            try {
                w00Var = (w00) f8317k.get("[DEFAULT]");
                if (w00Var == null) {
                    StringBuilder sb = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                    if (d71.f1569c == null) {
                        d71.f1569c = Application.getProcessName();
                    }
                    sb.append(d71.f1569c);
                    sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                    throw new IllegalStateException(sb.toString());
                }
                ((C0553oq) w00Var.f8325h.get()).m3729b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return w00Var;
    }

    /* JADX INFO: renamed from: e */
    public static w00 m5222e(Context context) {
        synchronized (f8316j) {
            try {
                if (f8317k.containsKey("[DEFAULT]")) {
                    return m5221b();
                }
                r10 r10VarM4234a = r10.m4234a(context);
                if (r10VarM4234a == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return m5223f(context, r10VarM4234a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static w00 m5223f(Context context, r10 r10Var) {
        w00 w00Var;
        AtomicReference atomicReference = u00.f7635a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = u00.f7635a;
            if (atomicReference2.get() == null) {
                u00 u00Var = new u00();
                do {
                    if (atomicReference2.compareAndSet(null, u00Var)) {
                        ComponentCallbacks2C0907ya.m5750a(application);
                        ComponentCallbacks2C0907ya componentCallbacks2C0907ya = ComponentCallbacks2C0907ya.f9252n;
                        componentCallbacks2C0907ya.getClass();
                        synchronized (componentCallbacks2C0907ya) {
                            componentCallbacks2C0907ya.f9255l.add(u00Var);
                        }
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f8316j) {
            C0089c8 c0089c8 = f8317k;
            p80.m3865j("FirebaseApp name [DEFAULT] already exists!", !c0089c8.containsKey("[DEFAULT]"));
            p80.m3864i(context, "Application context cannot be null.");
            w00Var = new w00(context, "[DEFAULT]", r10Var);
            c0089c8.put("[DEFAULT]", w00Var);
        }
        w00Var.m5226d();
        return w00Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m5224a() {
        p80.m3865j("FirebaseApp was deleted", !this.f8323f.get());
    }

    /* JADX INFO: renamed from: c */
    public final String m5225c() {
        StringBuilder sb = new StringBuilder();
        m5224a();
        byte[] bytes = this.f8319b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        m5224a();
        byte[] bytes2 = this.f8320c.f6651b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public final void m5226d() {
        HashMap map;
        if (!((UserManager) this.f8318a.getSystemService(UserManager.class)).isUserUnlocked()) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            m5224a();
            sb.append(this.f8319b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f8318a;
            AtomicReference atomicReference = v00.f7983b;
            if (atomicReference.get() == null) {
                v00 v00Var = new v00(context);
                while (!atomicReference.compareAndSet(null, v00Var)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(v00Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        m5224a();
        sb2.append(this.f8319b);
        Log.i("FirebaseApp", sb2.toString());
        C0547ok c0547ok = this.f8321d;
        m5224a();
        boolean zEquals = "[DEFAULT]".equals(this.f8319b);
        AtomicReference atomicReference2 = (AtomicReference) c0547ok.f5767f;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (!atomicReference2.compareAndSet(null, boolValueOf)) {
            if (atomicReference2.get() != null) {
                ((C0553oq) this.f8325h.get()).m3729b();
            }
        }
        synchronized (c0547ok) {
            map = new HashMap((HashMap) c0547ok.f5762a);
        }
        c0547ok.m3697i(map, zEquals);
        ((C0553oq) this.f8325h.get()).m3729b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w00)) {
            return false;
        }
        w00 w00Var = (w00) obj;
        w00Var.m5224a();
        return this.f8319b.equals(w00Var.f8319b);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m5227g() {
        boolean z;
        m5224a();
        C0440lo c0440lo = (C0440lo) this.f8324g.get();
        synchronized (c0440lo) {
            z = c0440lo.f4863a;
        }
        return z;
    }

    public final int hashCode() {
        return this.f8319b.hashCode();
    }

    public final String toString() {
        f50 f50Var = new f50(this);
        f50Var.m1627j(this.f8319b, "name");
        f50Var.m1627j(this.f8320c, "options");
        return f50Var.toString();
    }
}
