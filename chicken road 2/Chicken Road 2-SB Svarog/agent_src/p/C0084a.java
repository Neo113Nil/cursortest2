package p;

import C.c;
import a.AbstractC0018a;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import com.luminance.color.alchemy.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import q.AbstractC0086a;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0084a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0084a f1098d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f1099e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f1102c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f1101b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1100a = new HashMap();

    public C0084a(Context context) {
        this.f1102c = context.getApplicationContext();
    }

    public static C0084a c(Context context) {
        if (f1098d == null) {
            synchronized (f1099e) {
                try {
                    if (f1098d == null) {
                        f1098d = new C0084a(context);
                    }
                } finally {
                }
            }
        }
        return f1098d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f1102c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f1101b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0085b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new c(e2);
            }
        }
    }

    public final void b(Class cls, HashSet hashSet) {
        boolean z2;
        HashMap hashMap = this.f1100a;
        if (Build.VERSION.SDK_INT >= 29) {
            z2 = AbstractC0086a.c();
        } else {
            try {
                if (AbstractC0018a.f414c == null) {
                    AbstractC0018a.f413b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    AbstractC0018a.f414c = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                z2 = ((Boolean) AbstractC0018a.f414c.invoke(null, Long.valueOf(AbstractC0018a.f413b))).booleanValue();
            } catch (Exception e2) {
                AbstractC0018a.m("isTagEnabled", e2);
                z2 = false;
            }
        }
        if (z2) {
            try {
                Trace.beginSection(AbstractC0018a.D(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0085b interfaceC0085b = (InterfaceC0085b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a2 = interfaceC0085b.a();
                if (!a2.isEmpty()) {
                    for (Class cls2 : a2) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                Object b2 = interfaceC0085b.b(this.f1102c);
                hashSet.remove(cls);
                hashMap.put(cls, b2);
            } catch (Throwable th2) {
                throw new c(th2);
            }
        }
        Trace.endSection();
    }
}
