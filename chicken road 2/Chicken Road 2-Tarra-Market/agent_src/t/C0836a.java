package t;

import a.AbstractC0009a;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import com.skytonedarps.arskthrp.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0836a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0836a f6658d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f6659e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f6662c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f6661b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6660a = new HashMap();

    public C0836a(Context context) {
        this.f6662c = context.getApplicationContext();
    }

    public static C0836a c(Context context) {
        if (f6658d == null) {
            synchronized (f6659e) {
                try {
                    if (f6658d == null) {
                        f6658d = new C0836a(context);
                    }
                } finally {
                }
            }
        }
        return f6658d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f6662c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f6661b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0837b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new H.a(e2);
            }
        }
    }

    public final void b(Class cls, HashSet hashSet) {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 29) {
            z2 = u.a.c();
        } else {
            try {
                if (AbstractC0009a.f543g == null) {
                    AbstractC0009a.f542f = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    AbstractC0009a.f543g = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                z2 = ((Boolean) AbstractC0009a.f543g.invoke(null, Long.valueOf(AbstractC0009a.f542f))).booleanValue();
            } catch (Exception e2) {
                AbstractC0009a.p("isTagEnabled", e2);
                z2 = false;
            }
        }
        if (z2) {
            try {
                Trace.beginSection(AbstractC0009a.H(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap hashMap = this.f6660a;
        if (hashMap.containsKey(cls)) {
            hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0837b interfaceC0837b = (InterfaceC0837b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a2 = interfaceC0837b.a();
                if (!a2.isEmpty()) {
                    for (Class cls2 : a2) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                Object create = interfaceC0837b.create(this.f6662c);
                hashSet.remove(cls);
                hashMap.put(cls, create);
            } catch (Throwable th2) {
                throw new H.a(th2);
            }
        }
        Trace.endSection();
    }
}
