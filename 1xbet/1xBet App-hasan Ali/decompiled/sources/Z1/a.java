package Z1;

import D2.e;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import game.betting133.sports1xbet.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import t3.AbstractC2425d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f6335d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f6336e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f6339c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f6338b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6337a = new HashMap();

    public a(Context context) {
        this.f6339c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f6335d == null) {
            synchronized (f6336e) {
                try {
                    if (f6335d == null) {
                        f6335d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f6335d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f6339c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f6338b;
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
            } catch (ClassNotFoundException e3) {
                throw new e(e3);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (AbstractC2425d.y()) {
            try {
                AbstractC2425d.k(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap hashMap = this.f6337a;
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a5 = bVar.a();
                if (!a5.isEmpty()) {
                    for (Class cls2 : a5) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.b(this.f6339c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new e(th2);
            }
        }
        Trace.endSection();
        return obj;
    }
}
