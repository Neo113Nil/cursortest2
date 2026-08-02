package androidx.startup;

import B0.A0;
import R4.b;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ru.ozon.app.android.R;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f45038d;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f45039e = new Object();

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    final Context f45042c;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    final HashSet f45041b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    final HashMap f45040a = new HashMap();

    a(@NonNull Context context) {
        this.f45042c = context.getApplicationContext();
    }

    @NonNull
    private Object b(@NonNull Class cls, @NonNull HashSet hashSet) {
        if (U4.a.b()) {
            cls.getClass();
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException(A0.b("Cannot initialize ", cls.getName(), ". Cycle detected."));
        }
        HashMap hashMap = this.f45040a;
        if (hashMap.containsKey(cls)) {
            return hashMap.get(cls);
        }
        hashSet.add(cls);
        try {
            R4.a aVar = (R4.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            List<Class<? extends R4.a<?>>> a11 = aVar.a();
            if (!a11.isEmpty()) {
                for (Class<? extends R4.a<?>> cls2 : a11) {
                    if (!hashMap.containsKey(cls2)) {
                        b(cls2, hashSet);
                    }
                }
            }
            Object create = aVar.create(this.f45042c);
            hashSet.remove(cls);
            hashMap.put(cls, create);
            return create;
        } catch (Throwable th2) {
            throw new b(th2);
        }
    }

    @NonNull
    public static a c(@NonNull Context context) {
        if (f45038d == null) {
            synchronized (f45039e) {
                try {
                    if (f45038d == null) {
                        f45038d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f45038d;
    }

    final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f45042c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f45041b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (R4.a.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e11) {
                throw new b(e11);
            }
        }
    }

    @NonNull
    public final <T> T d(@NonNull Class<? extends R4.a<T>> cls) {
        T t2;
        synchronized (f45039e) {
            try {
                t2 = (T) this.f45040a.get(cls);
                if (t2 == null) {
                    t2 = (T) b(cls, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t2;
    }

    public final boolean e() {
        return this.f45041b.contains(ProcessLifecycleInitializer.class);
    }
}
