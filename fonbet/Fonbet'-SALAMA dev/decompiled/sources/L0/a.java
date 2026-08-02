package L0;

import A1.W;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import n3.AbstractC1464a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f4189d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f4190e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f4193c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f4192b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4191a = new HashMap();

    public a(Context context) {
        this.f4193c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f4189d == null) {
            synchronized (f4190e) {
                try {
                    if (f4189d == null) {
                        f4189d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f4189d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f4193c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f4192b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e7) {
                throw new W(e7);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (AbstractC1464a.D()) {
            try {
                Trace.beginSection(AbstractC1464a.W(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap hashMap = this.f4191a;
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a2 = bVar.a();
                if (!a2.isEmpty()) {
                    for (Class cls2 : a2) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.b(this.f4193c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new W(th2);
            }
        }
        Trace.endSection();
        return obj;
    }
}
