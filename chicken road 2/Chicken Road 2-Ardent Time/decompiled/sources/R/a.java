package R;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile R.a f1646d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Object f1647e = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f1650c;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashSet f1649b = new java.util.HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f1648a = new java.util.HashMap();

    public a(android.content.Context context) {
        this.f1650c = context.getApplicationContext();
    }

    public static R.a c(android.content.Context context) {
        if (f1646d == null) {
            synchronized (f1647e) {
                try {
                    if (f1646d == null) {
                        f1646d = new R.a(context);
                    }
                } finally {
                }
            }
        }
        return f1646d;
    }

    public final void a(android.os.Bundle bundle) {
        java.util.HashSet hashSet;
        java.lang.String string = this.f1650c.getString(com.watchfacestudio.huasi_urx110.R.string.androidx_startup);
        if (bundle != null) {
            try {
                java.util.HashSet hashSet2 = new java.util.HashSet();
                java.util.Iterator<java.lang.String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f1649b;
                    if (!hasNext) {
                        break;
                    }
                    java.lang.String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        java.lang.Class<?> cls = java.lang.Class.forName(next);
                        if (R.b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                java.util.Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((java.lang.Class) it2.next(), hashSet2);
                }
            } catch (java.lang.ClassNotFoundException e2) {
                throw new E1.A(e2);
            }
        }
    }

    public final void b(java.lang.Class cls, java.util.HashSet hashSet) {
        boolean z2;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            z2 = S.a.c();
        } else {
            try {
                if (Q1.l.f1635b == null) {
                    Q1.l.f1634a = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    Q1.l.f1635b = android.os.Trace.class.getMethod("isTagEnabled", java.lang.Long.TYPE);
                }
                z2 = ((java.lang.Boolean) Q1.l.f1635b.invoke(null, java.lang.Long.valueOf(Q1.l.f1634a))).booleanValue();
            } catch (java.lang.Exception e2) {
                Q1.l.o("isTagEnabled", e2);
                z2 = false;
            }
        }
        if (z2) {
            try {
                android.os.Trace.beginSection(Q1.l.A(cls.getSimpleName()));
            } catch (java.lang.Throwable th) {
                android.os.Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new java.lang.IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        java.util.HashMap hashMap = this.f1648a;
        if (hashMap.containsKey(cls)) {
            hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                R.b bVar = (R.b) cls.getDeclaredConstructor(null).newInstance(null);
                java.util.List<java.lang.Class> a2 = bVar.a();
                if (!a2.isEmpty()) {
                    for (java.lang.Class cls2 : a2) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                java.lang.Object create = bVar.create(this.f1650c);
                hashSet.remove(cls);
                hashMap.put(cls, create);
            } catch (java.lang.Throwable th2) {
                throw new E1.A(th2);
            }
        }
        android.os.Trace.endSection();
    }
}
