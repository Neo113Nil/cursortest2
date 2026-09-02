package f1;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ w1.g[] f2818a;

    /* renamed from: b, reason: collision with root package name */
    public static final H.c f2819b;

    static {
        kotlin.jvm.internal.l lVar = new kotlin.jvm.internal.l(kotlin.jvm.internal.b.NO_RECEIVER, f1.K.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        kotlin.jvm.internal.q.f7961a.getClass();
        f2818a = new w1.g[]{lVar};
        H.a aVar = H.a.f600e;
        k1.i iVar = z1.B.f8522b;
        z1.f0 f0Var = new z1.f0(null);
        iVar.getClass();
        if (f0Var != k1.j.f7951a) {
            iVar = (k1.i) f0Var.k(iVar, new k1.C0922b(1));
        }
        if (iVar.m(z1.C1066t.f8592b) == null) {
            iVar = iVar.g(new z1.T(null));
        }
        f2819b = new H.c(aVar, new E1.e(iVar));
    }

    public static final C.j a(android.content.Context context) {
        C.j jVar;
        kotlin.jvm.internal.i.e(context, "<this>");
        H.c cVar = f2819b;
        w1.g property = f2818a[0];
        cVar.getClass();
        kotlin.jvm.internal.i.e(property, "property");
        C.j jVar2 = cVar.f607d;
        if (jVar2 != null) {
            return jVar2;
        }
        synchronized (cVar.f606c) {
            try {
                if (cVar.f607d == null) {
                    android.content.Context applicationContext = context.getApplicationContext();
                    s1.l lVar = cVar.f604a;
                    kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
                    java.util.List migrations = (java.util.List) lVar.invoke(applicationContext);
                    z1.InterfaceC1067u interfaceC1067u = cVar.f605b;
                    H.b bVar = new H.b(0, applicationContext, cVar);
                    kotlin.jvm.internal.i.e(migrations, "migrations");
                    F.P p2 = new F.P(new F.V(new F.U(1, bVar)), u0.AbstractC0995a.q(new F.C0005e(migrations, null)), new m0.j(1, false), interfaceC1067u);
                    cVar.f607d = new C.j(9, new C.j(9, p2));
                }
                jVar = cVar.f607d;
                kotlin.jvm.internal.i.b(jVar);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public static final boolean b(java.lang.String key, java.lang.Object obj, java.util.Set set) {
        kotlin.jvm.internal.i.e(key, "key");
        return set == null ? (obj instanceof java.lang.Boolean) || (obj instanceof java.lang.Long) || (obj instanceof java.lang.String) || (obj instanceof java.lang.Double) : set.contains(key);
    }

    public static final java.lang.Object c(java.lang.Object obj, m0.j jVar) {
        if (!(obj instanceof java.lang.String)) {
            return obj;
        }
        java.lang.String str = (java.lang.String) obj;
        if (y1.o.K(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false)) {
            if (y1.o.K(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false)) {
                return obj;
            }
            java.lang.String substring = str.substring(40);
            kotlin.jvm.internal.i.d(substring, "substring(...)");
            return jVar.f(substring);
        }
        if (!y1.o.K(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu", false)) {
            return obj;
        }
        java.lang.String substring2 = str.substring(40);
        kotlin.jvm.internal.i.d(substring2, "substring(...)");
        return java.lang.Double.valueOf(java.lang.Double.parseDouble(substring2));
    }
}
